package org.chromium.url;

import internal.org.jni_zero.JNINamespace;
import java.net.IDN;

@JNINamespace("url::android")
/* loaded from: classes10.dex */
public class IDNStringUtil {
    private static String idnToASCII(String src) {
        try {
            return IDN.toASCII(src, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}
