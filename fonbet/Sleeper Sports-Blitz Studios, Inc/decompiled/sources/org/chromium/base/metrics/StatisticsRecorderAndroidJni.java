package org.chromium.base.metrics;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.metrics.StatisticsRecorderAndroid;

/* loaded from: classes10.dex */
class StatisticsRecorderAndroidJni implements StatisticsRecorderAndroid.Natives {
    private static JniTestInstanceHolder sOverride;

    StatisticsRecorderAndroidJni() {
    }

    public static StatisticsRecorderAndroid.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (StatisticsRecorderAndroid.Natives) jniTestInstanceHolder.value;
        }
        return new StatisticsRecorderAndroidJni();
    }

    public static void setInstanceForTesting(StatisticsRecorderAndroid.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.metrics.StatisticsRecorderAndroid.Natives
    public String toJson(int verbosityLevel) {
        return (String) GEN_JNI.org_chromium_base_metrics_StatisticsRecorderAndroid_toJson(verbosityLevel);
    }
}
