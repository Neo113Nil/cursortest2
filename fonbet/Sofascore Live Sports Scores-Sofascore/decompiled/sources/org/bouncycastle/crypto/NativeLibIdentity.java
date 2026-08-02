package org.bouncycastle.crypto;

/* loaded from: classes7.dex */
abstract class NativeLibIdentity {
    public static String a() {
        try {
            return getLibIdent();
        } catch (UnsatisfiedLinkError unused) {
            return "java";
        }
    }

    private static native String getLibIdent();
}
