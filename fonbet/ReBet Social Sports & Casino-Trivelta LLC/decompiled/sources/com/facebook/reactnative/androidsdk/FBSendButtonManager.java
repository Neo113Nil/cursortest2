package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.share.model.ShareContent;
import t8.AbstractC6451e;
import w8.C6722b;

/* loaded from: classes2.dex */
public class FBSendButtonManager extends SimpleViewManager<C6722b> {
    public static final String REACT_CLASS = "RCTFBSendButton";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "shareContent")
    public void setShareContent(C6722b c6722b, ReadableMap readableMap) {
        ShareContent e10 = AbstractC6451e.e(readableMap);
        if (e10 != null) {
            c6722b.setShareContent(e10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6722b createViewInstance(ThemedReactContext themedReactContext) {
        return new C6722b(themedReactContext);
    }
}
