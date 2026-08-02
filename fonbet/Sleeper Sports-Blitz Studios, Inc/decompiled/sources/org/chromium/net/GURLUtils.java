package org.chromium.net;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("net")
/* loaded from: classes10.dex */
public final class GURLUtils {

    public interface Natives {
        String getOrigin(String url);
    }

    public static String getOrigin(String url) {
        return GURLUtilsJni.get().getOrigin(url);
    }
}
