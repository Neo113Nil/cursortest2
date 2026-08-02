package com.react.rnspinkit;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import io.sentry.rrweb.RRWebVideoEvent;

/* loaded from: classes8.dex */
public class RNSpinkit extends SimpleViewManager<RNSpinkitView> {
    ReactApplicationContext mContext;
    double mSize = 48.0d;

    public RNSpinkit(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSpinkit";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public RNSpinkitView createViewInstance(ThemedReactContext themedReactContext) {
        return new RNSpinkitView(themedReactContext);
    }

    @ReactProp(name = "isVisible")
    public void setIsVisible(RNSpinkitView rNSpinkitView, Boolean bool) {
        if (bool.booleanValue()) {
            rNSpinkitView.setVisibility(0);
        } else {
            rNSpinkitView.setVisibility(4);
        }
    }

    @ReactProp(name = "color")
    public void setColor(RNSpinkitView rNSpinkitView, int i) {
        rNSpinkitView.setSpriteColor(i);
    }

    @ReactProp(name = RRWebVideoEvent.JsonKeys.SIZE)
    public void setSize(RNSpinkitView rNSpinkitView, double d) {
        rNSpinkitView.setSpriteSize(d);
    }

    @ReactProp(name = "type")
    public void setType(RNSpinkitView rNSpinkitView, String str) {
        rNSpinkitView.setSpriteType(str);
    }
}
