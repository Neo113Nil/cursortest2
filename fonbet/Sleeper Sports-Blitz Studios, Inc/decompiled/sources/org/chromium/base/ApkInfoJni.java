package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.ApkInfo;

/* loaded from: classes10.dex */
class ApkInfoJni implements ApkInfo.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    ApkInfoJni() {
    }

    public static ApkInfo.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (ApkInfo.Natives) jniTestInstanceHolder.value;
        }
        return new ApkInfoJni();
    }

    public static void setInstanceForTesting(ApkInfo.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.ApkInfo.Natives
    public void fillFields(String hostPackageName, String hostVersionCode, String hostPackageLabel, String packageVersionCode, String packageVersionName, String packageName, String resourcesVersion, String installerPackageName, boolean isDebugApp, int targetSdkVersion) {
        GEN_JNI.org_chromium_base_ApkInfo_fillFields(hostPackageName, hostVersionCode, hostPackageLabel, packageVersionCode, packageVersionName, packageName, resourcesVersion, installerPackageName, isDebugApp, targetSdkVersion);
    }
}
