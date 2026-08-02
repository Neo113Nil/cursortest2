package org.chromium.base.version_info;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("version_info::android")
/* loaded from: classes10.dex */
public class VersionConstantsBridge {

    interface Natives {
        void nativeSetChannel(int channel);
    }

    public static int getChannel() {
        return 0;
    }

    public static void setChannel(int channel) {
        VersionConstantsBridgeJni.get().nativeSetChannel(channel);
    }
}
