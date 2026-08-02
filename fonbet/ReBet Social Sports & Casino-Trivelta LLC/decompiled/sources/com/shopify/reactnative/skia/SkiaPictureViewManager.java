package com.shopify.reactnative.skia;

import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.SkiaPictureViewManagerDelegate;
import com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface;

/* loaded from: classes4.dex */
public class SkiaPictureViewManager extends SkiaBaseViewManager<SkiaPictureView> implements SkiaPictureViewManagerInterface<SkiaPictureView> {
    protected SkiaPictureViewManagerDelegate mDelegate = new SkiaPictureViewManagerDelegate(this);

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "SkiaPictureView";
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    public void setColorSpace(SkiaPictureView skiaPictureView, String str) {
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    @ReactProp(name = "debug")
    public /* bridge */ /* synthetic */ void setDebug(SkiaPictureView skiaPictureView, boolean z10) {
        super.setDebug((SkiaPictureViewManager) skiaPictureView, z10);
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    @ReactProp(name = "opaque")
    public /* bridge */ /* synthetic */ void setOpaque(SkiaPictureView skiaPictureView, boolean z10) {
        super.setOpaque((SkiaPictureViewManager) skiaPictureView, z10);
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public /* bridge */ /* synthetic */ void setPointerEvents(SkiaPictureView skiaPictureView, String str) {
        super.setPointerEvents((SkiaPictureViewManager) skiaPictureView, str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public SkiaPictureViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface
    public void setAndroidWarmup(SkiaPictureView skiaPictureView, boolean z10) {
        skiaPictureView.setAndroidWarmup(z10);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NonNull
    public SkiaPictureView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new SkiaPictureView(themedReactContext);
    }
}
