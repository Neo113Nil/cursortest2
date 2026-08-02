package com.reactnativecommunity.blurview;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AndroidBlurViewManagerDelegate;
import com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface;

@ReactModule(name = "AndroidBlurView")
/* loaded from: classes4.dex */
class BlurViewManager extends ViewGroupManager<Hg.c> implements AndroidBlurViewManagerInterface<Hg.c> {
    private final ViewManagerDelegate<Hg.c> mDelegate = new AndroidBlurViewManagerDelegate(this);

    public BlurViewManager(ReactApplicationContext reactApplicationContext) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<Hg.c> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "AndroidBlurView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public Hg.c createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return b.a(themedReactContext);
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(defaultBoolean = true, name = "autoUpdate")
    public void setAutoUpdate(Hg.c cVar, boolean z10) {
        b.b(cVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    public void setBlurAmount(Hg.c cVar, int i10) {
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(defaultInt = 10, name = "blurRadius")
    public void setBlurRadius(Hg.c cVar, int i10) {
        b.e(cVar, i10);
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    public void setBlurType(Hg.c cVar, String str) {
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(defaultInt = 10, name = "downsampleFactor")
    public void setDownsampleFactor(Hg.c cVar, int i10) {
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(defaultBoolean = true, name = ViewProps.ENABLED)
    public void setEnabled(Hg.c cVar, boolean z10) {
        b.c(cVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface
    @ReactProp(customType = "Color", name = "overlayColor")
    public void setOverlayColor(Hg.c cVar, Integer num) {
        b.d(cVar, num.intValue());
    }
}
