package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.BaseFeatureMap;

/* loaded from: classes10.dex */
public class BaseFeatureMapJni implements BaseFeatureMap.Natives {
    private static JniTestInstanceHolder sOverride;

    public static BaseFeatureMap.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (BaseFeatureMap.Natives) jniTestInstanceHolder.value;
        }
        return new BaseFeatureMapJni();
    }

    public static void setInstanceForTesting(BaseFeatureMap.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.BaseFeatureMap.Natives
    public long getNativeMap() {
        return GEN_JNI.org_chromium_base_BaseFeatureMap_getNativeMap();
    }
}
