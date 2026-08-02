package com.shopify.reactnative.skia;

import androidx.annotation.NonNull;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import com.shopify.reactnative.skia.j;

/* loaded from: classes4.dex */
public abstract class SkiaBaseViewManager<T extends j> extends ReactViewManager {
    @ReactProp(name = "debug")
    public void setDebug(T t10, boolean z10) {
        t10.setDebugMode(z10);
    }

    @ReactProp(name = "opaque")
    public void setOpaque(T t10, boolean z10) {
        t10.setOpaque(z10);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(T t10, String str) {
        t10.setPointerEvents(PointerEvents.parsePointerEvents(str));
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull ReactViewGroup reactViewGroup) {
        super.onDropViewInstance(reactViewGroup);
        ((j) reactViewGroup).o();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setNativeId(@NonNull ReactViewGroup reactViewGroup, String str) {
        super.setNativeId((SkiaBaseViewManager<T>) reactViewGroup, str);
        ((j) reactViewGroup).registerView(Integer.parseInt(str));
    }
}
