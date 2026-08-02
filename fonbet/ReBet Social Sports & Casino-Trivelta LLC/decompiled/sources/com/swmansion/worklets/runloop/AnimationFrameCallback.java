package com.swmansion.worklets.runloop;

import com.facebook.jni.HybridData;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public class AnimationFrameCallback {

    @InterfaceC4488a
    private final HybridData mHybridData;

    @InterfaceC4488a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onAnimationFrame(double d10);
}
