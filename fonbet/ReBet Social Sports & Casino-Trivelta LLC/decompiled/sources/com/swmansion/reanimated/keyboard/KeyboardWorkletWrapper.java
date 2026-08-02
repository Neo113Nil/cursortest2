package com.swmansion.reanimated.keyboard;

import com.facebook.jni.HybridData;
import h8.InterfaceC4488a;

@InterfaceC4488a
/* loaded from: classes4.dex */
public class KeyboardWorkletWrapper {

    @InterfaceC4488a
    private final HybridData mHybridData;

    @InterfaceC4488a
    private KeyboardWorkletWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void invoke(int i10, int i11);
}
