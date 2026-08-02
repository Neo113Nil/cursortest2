package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import h8.InterfaceC4488a;

@InterfaceC4488a
/* loaded from: classes4.dex */
public class SensorSetter {

    @InterfaceC4488a
    private final HybridData mHybridData;

    @InterfaceC4488a
    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void sensorSetter(float[] fArr, int i10);
}
