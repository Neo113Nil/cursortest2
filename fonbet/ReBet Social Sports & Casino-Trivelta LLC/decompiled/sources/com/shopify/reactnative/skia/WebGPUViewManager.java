package com.shopify.reactnative.skia;

import androidx.annotation.NonNull;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.SkiaWebGPUViewManagerDelegate;
import com.facebook.react.viewmanagers.SkiaWebGPUViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;

@ReactModule(name = WebGPUViewManager.NAME)
/* loaded from: classes4.dex */
public class WebGPUViewManager extends ReactViewManager implements SkiaWebGPUViewManagerInterface<WebGPUView> {
    public static final String NAME = "SkiaWebGPUView";
    protected SkiaWebGPUViewManagerDelegate mDelegate = new SkiaWebGPUViewManagerDelegate(this);

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public SkiaWebGPUViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull ReactViewGroup reactViewGroup) {
        super.onDropViewInstance(reactViewGroup);
        ((WebGPUView) reactViewGroup).surfaceDestroyed();
    }

    @Override // com.facebook.react.viewmanagers.SkiaWebGPUViewManagerInterface
    @ReactProp(name = "contextId")
    public void setContextId(WebGPUView webGPUView, int i10) {
        webGPUView.setContextId(i10);
    }

    @Override // com.facebook.react.viewmanagers.SkiaWebGPUViewManagerInterface
    @ReactProp(name = "transparent")
    public void setTransparent(WebGPUView webGPUView, boolean z10) {
        webGPUView.setTransparent(z10);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NonNull
    public WebGPUView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new WebGPUView(themedReactContext);
    }
}
