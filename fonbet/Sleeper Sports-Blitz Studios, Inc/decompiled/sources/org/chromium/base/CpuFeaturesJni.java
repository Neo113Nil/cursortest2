package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.CpuFeatures;

/* loaded from: classes10.dex */
class CpuFeaturesJni implements CpuFeatures.Natives {
    private static JniTestInstanceHolder sOverride;

    CpuFeaturesJni() {
    }

    public static CpuFeatures.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (CpuFeatures.Natives) jniTestInstanceHolder.value;
        }
        return new CpuFeaturesJni();
    }

    public static void setInstanceForTesting(CpuFeatures.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.CpuFeatures.Natives
    public int getCoreCount() {
        return GEN_JNI.org_chromium_base_CpuFeatures_getCoreCount();
    }

    @Override // org.chromium.base.CpuFeatures.Natives
    public long getCpuFeatures() {
        return GEN_JNI.org_chromium_base_CpuFeatures_getCpuFeatures();
    }
}
