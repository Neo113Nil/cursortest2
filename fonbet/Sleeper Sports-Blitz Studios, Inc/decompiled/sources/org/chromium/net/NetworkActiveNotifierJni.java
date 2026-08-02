package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.NetworkActiveNotifier;

/* loaded from: classes10.dex */
class NetworkActiveNotifierJni implements NetworkActiveNotifier.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    NetworkActiveNotifierJni() {
    }

    public static NetworkActiveNotifier.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (NetworkActiveNotifier.Natives) jniTestInstanceHolder.value;
        }
        return new NetworkActiveNotifierJni();
    }

    public static void setInstanceForTesting(NetworkActiveNotifier.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.NetworkActiveNotifier.Natives
    public void notifyOfDefaultNetworkActive(long nativePtr) {
        GEN_JNI.org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(nativePtr);
    }
}
