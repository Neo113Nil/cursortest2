package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3483o {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f37345a = c();

    public static C3484p a() {
        C3484p b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : C3484p.f37372d;
    }

    public static final C3484p b(String str) {
        Class cls = f37345a;
        if (cls == null) {
            return null;
        }
        try {
            return (C3484p) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
