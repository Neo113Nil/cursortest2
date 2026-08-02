package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.ProxyCallbackRequestImpl;

/* loaded from: classes10.dex */
class ProxyCallbackRequestImplJni implements ProxyCallbackRequestImpl.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    ProxyCallbackRequestImplJni() {
    }

    public static ProxyCallbackRequestImpl.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (ProxyCallbackRequestImpl.Natives) jniTestInstanceHolder.value;
        }
        return new ProxyCallbackRequestImplJni();
    }

    public static void setInstanceForTesting(ProxyCallbackRequestImpl.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.impl.ProxyCallbackRequestImpl.Natives
    public void cancel(long nativeProxyCallbackRequestAdapter) {
        GEN_JNI.org_chromium_net_impl_ProxyCallbackRequestImpl_cancel(nativeProxyCallbackRequestAdapter);
    }

    @Override // org.chromium.net.impl.ProxyCallbackRequestImpl.Natives
    public boolean proceed(long nativeProxyCallbackRequestAdapter, String[] extraHeaders) {
        return GEN_JNI.org_chromium_net_impl_ProxyCallbackRequestImpl_proceed(nativeProxyCallbackRequestAdapter, extraHeaders);
    }
}
