package org.chromium.base;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class ImportantFileWriterAndroid {

    public interface Natives {
        boolean writeFileAtomically(String fileName, byte[] data);
    }

    public static boolean writeFileAtomically(String fileName, byte[] data) {
        return ImportantFileWriterAndroidJni.get().writeFileAtomically(fileName, data);
    }
}
