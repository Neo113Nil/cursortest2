package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class c0 {

    /* renamed from: c, reason: collision with root package name */
    private static final c0 f59348c = new c0();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f59349d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f59351b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final J f59350a = new J();

    private c0() {
    }

    public static c0 a() {
        return f59348c;
    }

    public final <T> f0<T> b(Class<T> cls) {
        C5919z.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f59351b;
        f0<T> f0Var = (f0) concurrentHashMap.get(cls);
        if (f0Var == null) {
            f0Var = this.f59350a.a(cls);
            f0<T> f0Var2 = (f0) concurrentHashMap.putIfAbsent(cls, f0Var);
            if (f0Var2 != null) {
                return f0Var2;
            }
        }
        return f0Var;
    }
}
