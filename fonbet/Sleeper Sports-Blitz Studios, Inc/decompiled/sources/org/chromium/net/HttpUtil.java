package org.chromium.net;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("net")
/* loaded from: classes10.dex */
public final class HttpUtil {

    interface Natives {
        boolean isAllowedHeader(String headerName, String headerValue);
    }

    public static boolean isAllowedHeader(String headerName, String headerValue) {
        return HttpUtilJni.get().isAllowedHeader(headerName, headerValue);
    }
}
