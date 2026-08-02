package org.reactnative.maskedview;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import yi.C6898a;

/* loaded from: classes5.dex */
public class RNCMaskedViewManager extends ViewGroupManager<C6898a> {
    private static final String REACT_CLASS = "RNCMaskedView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "androidRenderingMode")
    public void setAndroidRenderingMode(C6898a c6898a, String str) {
        if (str != null) {
            c6898a.setRenderingMode(str);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6898a createViewInstance(ThemedReactContext themedReactContext) {
        return new C6898a(themedReactContext);
    }
}
