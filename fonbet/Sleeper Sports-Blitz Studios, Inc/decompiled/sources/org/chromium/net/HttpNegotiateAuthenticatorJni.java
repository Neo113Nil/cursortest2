package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.HttpNegotiateAuthenticator;

/* loaded from: classes10.dex */
class HttpNegotiateAuthenticatorJni implements HttpNegotiateAuthenticator.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    HttpNegotiateAuthenticatorJni() {
    }

    public static HttpNegotiateAuthenticator.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (HttpNegotiateAuthenticator.Natives) jniTestInstanceHolder.value;
        }
        return new HttpNegotiateAuthenticatorJni();
    }

    public static void setInstanceForTesting(HttpNegotiateAuthenticator.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.HttpNegotiateAuthenticator.Natives
    public void setResult(long nativeJavaNegotiateResultWrapper, int status, String authToken) {
        GEN_JNI.org_chromium_net_HttpNegotiateAuthenticator_setResult(nativeJavaNegotiateResultWrapper, status, authToken);
    }
}
