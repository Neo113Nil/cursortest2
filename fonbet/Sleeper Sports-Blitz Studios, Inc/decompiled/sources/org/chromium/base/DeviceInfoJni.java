package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.DeviceInfo;

/* loaded from: classes10.dex */
class DeviceInfoJni implements DeviceInfo.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    DeviceInfoJni() {
    }

    public static DeviceInfo.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (DeviceInfo.Natives) jniTestInstanceHolder.value;
        }
        return new DeviceInfoJni();
    }

    public static void setInstanceForTesting(DeviceInfo.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.DeviceInfo.Natives
    public void fillFields(String gmsVersionCode, boolean isTV, boolean isAutomotive, boolean isFoldable, boolean isDesktop, int vulkanDeqpLevel, boolean isXr, boolean wasLaunchedOnLargeDisplay) {
        GEN_JNI.org_chromium_base_DeviceInfo_fillFields(gmsVersionCode, isTV, isAutomotive, isFoldable, isDesktop, vulkanDeqpLevel, isXr, wasLaunchedOnLargeDisplay);
    }
}
