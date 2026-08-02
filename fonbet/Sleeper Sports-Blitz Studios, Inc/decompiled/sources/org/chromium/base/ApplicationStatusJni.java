package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.ApplicationStatus;

/* loaded from: classes10.dex */
class ApplicationStatusJni implements ApplicationStatus.Natives {
    private static JniTestInstanceHolder sOverride;

    ApplicationStatusJni() {
    }

    public static ApplicationStatus.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (ApplicationStatus.Natives) jniTestInstanceHolder.value;
        }
        return new ApplicationStatusJni();
    }

    public static void setInstanceForTesting(ApplicationStatus.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.ApplicationStatus.Natives
    public void onApplicationStateChange(int newState) {
        GEN_JNI.org_chromium_base_ApplicationStatus_onApplicationStateChange(newState);
    }
}
