package com.google.protobuf;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5950a {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f60192a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f60193b = 0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f60192a = cls;
    }

    static Class<?> a() {
        return f60192a;
    }
}
