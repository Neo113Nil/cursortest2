package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5898d {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f59352a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f59353b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f59352a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f59353b = cls2 != null;
    }

    static Class<?> a() {
        return f59352a;
    }

    static boolean b() {
        return (f59352a == null || f59353b) ? false : true;
    }
}
