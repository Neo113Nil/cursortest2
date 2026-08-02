package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.AndroidInfo;

/* loaded from: classes10.dex */
class AndroidInfoJni implements AndroidInfo.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    AndroidInfoJni() {
    }

    public static AndroidInfo.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (AndroidInfo.Natives) jniTestInstanceHolder.value;
        }
        return new AndroidInfoJni();
    }

    public static void setInstanceForTesting(AndroidInfo.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.AndroidInfo.Natives
    public void fillFields(String brand, String device, String buildId, String manufacturer, String model, String type, String board, String androidBuildFingerprint, String versionIncremental, String hardware, String codename, String socManufacturer, String supportedAbis, int sdkInt, boolean isDebugAndroid, String securityPatch) {
        GEN_JNI.org_chromium_base_AndroidInfo_fillFields(brand, device, buildId, manufacturer, model, type, board, androidBuildFingerprint, versionIncremental, hardware, codename, socManufacturer, supportedAbis, sdkInt, isDebugAndroid, securityPatch);
    }
}
