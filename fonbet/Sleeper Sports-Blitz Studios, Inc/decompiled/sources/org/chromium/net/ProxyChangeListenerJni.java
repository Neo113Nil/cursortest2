package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.ProxyChangeListener;

/* loaded from: classes10.dex */
class ProxyChangeListenerJni implements ProxyChangeListener.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    ProxyChangeListenerJni() {
    }

    public static ProxyChangeListener.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (ProxyChangeListener.Natives) jniTestInstanceHolder.value;
        }
        return new ProxyChangeListenerJni();
    }

    public static void setInstanceForTesting(ProxyChangeListener.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChanged(long nativePtr) {
        GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChanged(nativePtr);
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChangedTo(long nativePtr, String host, int port, String pacUrl, String[] exclusionList) {
        GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(nativePtr, host, port, pacUrl, exclusionList);
    }
}
