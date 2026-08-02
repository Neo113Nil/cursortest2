package org.chromium.base.metrics;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public final class StatisticsRecorderAndroid {

    interface Natives {
        String toJson(int verbosityLevel);
    }

    private StatisticsRecorderAndroid() {
    }

    public static String toJson(int verbosityLevel) {
        return StatisticsRecorderAndroidJni.get().toJson(verbosityLevel);
    }
}
