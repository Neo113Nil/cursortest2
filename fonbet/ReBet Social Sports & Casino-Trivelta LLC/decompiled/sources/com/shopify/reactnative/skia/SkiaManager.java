package com.shopify.reactnative.skia;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;
import h8.InterfaceC4488a;

@InterfaceC4488a
/* loaded from: classes4.dex */
public class SkiaManager {

    @InterfaceC4488a
    private ReactContext mContext;

    @InterfaceC4488a
    private HybridData mHybridData;

    @InterfaceC4488a
    private PlatformContext mPlatformContext;

    @InterfaceC4488a
    public SkiaManager(ReactContext reactContext) {
        this.mContext = reactContext;
        RuntimeExecutor a10 = i.a(reactContext);
        this.mPlatformContext = new PlatformContext(reactContext);
        this.mHybridData = initHybrid(reactContext.getJavaScriptContextHolder().getContext(), a10, this.mPlatformContext);
        initializeRuntime();
    }

    private native HybridData initHybrid(long j10, RuntimeExecutor runtimeExecutor, PlatformContext platformContext);

    private native void initializeRuntime();

    public void a() {
        this.mHybridData.resetNative();
    }

    public native void invalidate();
}
