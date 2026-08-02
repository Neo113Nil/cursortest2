package com.swmansion.gesturehandler.react;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.soloader.SoLoader;
import h8.InterfaceC4488a;

@InterfaceC4488a
/* loaded from: classes4.dex */
public class RNGestureHandlerComponentsRegistry {

    @InterfaceC4488a
    private final HybridData mHybridData;

    static {
        SoLoader.t("fabricjni");
        SoLoader.t("gesturehandler");
    }

    @InterfaceC4488a
    private RNGestureHandlerComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @InterfaceC4488a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @InterfaceC4488a
    public static RNGestureHandlerComponentsRegistry register(ComponentFactory componentFactory) {
        return new RNGestureHandlerComponentsRegistry(componentFactory);
    }
}
