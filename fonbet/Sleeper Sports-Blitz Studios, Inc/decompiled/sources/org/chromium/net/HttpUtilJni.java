package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.HttpUtil;

/* loaded from: classes10.dex */
class HttpUtilJni implements HttpUtil.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    HttpUtilJni() {
    }

    public static HttpUtil.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (HttpUtil.Natives) jniTestInstanceHolder.value;
        }
        return new HttpUtilJni();
    }

    public static void setInstanceForTesting(HttpUtil.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.HttpUtil.Natives
    public boolean isAllowedHeader(String headerName, String headerValue) {
        return GEN_JNI.org_chromium_net_HttpUtil_isAllowedHeader(headerName, headerValue);
    }
}
