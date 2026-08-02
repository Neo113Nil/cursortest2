package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.share.model.ShareContent;
import t8.AbstractC6451e;
import w8.C6723c;

/* loaded from: classes2.dex */
public class FBShareButtonManager extends SimpleViewManager<C6723c> {
    public static final String REACT_CLASS = "RCTFBShareButton";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "shareContent")
    public void setShareContent(C6723c c6723c, ReadableMap readableMap) {
        ShareContent e10 = AbstractC6451e.e(readableMap);
        if (e10 != null) {
            c6723c.setShareContent(e10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6723c createViewInstance(ThemedReactContext themedReactContext) {
        return new C6723c(themedReactContext);
    }
}
