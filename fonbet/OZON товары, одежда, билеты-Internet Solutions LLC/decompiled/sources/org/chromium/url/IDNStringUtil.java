package org.chromium.url;

import internal.org.jni_zero.CalledByNative;
import java.net.IDN;

/* loaded from: classes10.dex */
public final class IDNStringUtil {
    @CalledByNative
    private static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}
