package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;
import h8.InterfaceC4488a;

@InterfaceC4488a
/* loaded from: classes4.dex */
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {

    @InterfaceC4488a
    private final HybridData mHybridData;

    @InterfaceC4488a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
    public native void onAnimationFrame(double d10);
}
