package com.gwidgets.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.gwidgets.ui.Main;

import gwt.material.design.client.constants.ButtonType;
import gwt.material.design.client.ui.MaterialIcon;


public class MaterialTheme implements EntryPoint {

  public void onModuleLoad() {
	  
	  MaterialIcon icon = new MaterialIcon();
	  icon.setType(ButtonType.RAISED);
	  icon.setText("Test");
	  Main main = new Main();
	  
	  SpanElement span = Document.get().createSpanElement();
	  span.setInnerText("test");
	  
	  Document.get().getElementById("test").appendChild(span);
	  
	  GWT.log("the app is running");
	  
	 RootPanel.get().add(icon);
	 RootPanel.get("test").add(new Button("Test"));
	 RootPanel.get().add(main);
   
  }
}
