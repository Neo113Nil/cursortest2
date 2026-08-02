package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3472d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f37279a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f37280b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f37281c;

    static {
        f37281c = (f37279a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f37280b;
    }

    public static boolean c() {
        if (f37279a) {
            return true;
        }
        return (f37280b == null || f37281c) ? false : true;
    }
}
