package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.MemoryPressureListener;

/* loaded from: classes10.dex */
class MemoryPressureListenerJni implements MemoryPressureListener.Natives {
    private static JniTestInstanceHolder sOverride;

    MemoryPressureListenerJni() {
    }

    public static MemoryPressureListener.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (MemoryPressureListener.Natives) jniTestInstanceHolder.value;
        }
        return new MemoryPressureListenerJni();
    }

    public static void setInstanceForTesting(MemoryPressureListener.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.MemoryPressureListener.Natives
    public boolean isTrimMemoryBackgroundCritical() {
        return GEN_JNI.org_chromium_base_MemoryPressureListener_isTrimMemoryBackgroundCritical();
    }

    @Override // org.chromium.base.MemoryPressureListener.Natives
    public void onMemoryPressure(int pressure) {
        GEN_JNI.org_chromium_base_MemoryPressureListener_onMemoryPressure(pressure);
    }

    @Override // org.chromium.base.MemoryPressureListener.Natives
    public void onPreFreeze() {
        GEN_JNI.org_chromium_base_MemoryPressureListener_onPreFreeze();
    }
}
