package com.shopify.reactnative.skia;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.SkiaPictureViewManagerDelegate;
import com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface;

/* loaded from: classes8.dex */
public class SkiaPictureViewManager extends SkiaBaseViewManager<SkiaPictureView> implements SkiaPictureViewManagerInterface<SkiaPictureView> {
    protected SkiaPictureViewManagerDelegate mDelegate = new SkiaPictureViewManagerDelegate(this);

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    public void setColorSpace(SkiaPictureView skiaPictureView, String str) {
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    @ReactProp(name = "debug")
    public /* bridge */ /* synthetic */ void setDebug(SkiaPictureView skiaPictureView, boolean z) {
        super.setDebug((SkiaPictureViewManager) skiaPictureView, z);
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    @ReactProp(name = "opaque")
    public /* bridge */ /* synthetic */ void setOpaque(SkiaPictureView skiaPictureView, boolean z) {
        super.setOpaque((SkiaPictureViewManager) skiaPictureView, z);
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public /* bridge */ /* synthetic */ void setPointerEvents(SkiaPictureView skiaPictureView, String str) {
        super.setPointerEvents((SkiaPictureViewManager) skiaPictureView, str);
    }

    SkiaPictureViewManager() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public SkiaPictureViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SkiaPictureView";
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SkiaPictureView createViewInstance(ThemedReactContext themedReactContext) {
        return new SkiaPictureView(themedReactContext);
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    public void setAndroidWarmup(SkiaPictureView skiaPictureView, boolean z) {
        skiaPictureView.setAndroidWarmup(z);
    }
}
