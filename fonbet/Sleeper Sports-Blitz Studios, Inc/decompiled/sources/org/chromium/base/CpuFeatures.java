package org.chromium.base;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public abstract class CpuFeatures {

    interface Natives {
        int getCoreCount();

        long getCpuFeatures();
    }

    public static int getCount() {
        return CpuFeaturesJni.get().getCoreCount();
    }

    public static long getMask() {
        return CpuFeaturesJni.get().getCpuFeatures();
    }
}
