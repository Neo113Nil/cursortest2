package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes9.dex */
final class u extends x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Method f60017b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f60018c;

    u(Method method, int i11) {
        this.f60017b = method;
        this.f60018c = i11;
    }

    @Override // com.google.gson.internal.x
    public final <T> T a(Class<T> cls) throws Exception {
        String a11 = g.a(cls);
        if (a11 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a11));
        }
        return (T) this.f60017b.invoke(null, cls, Integer.valueOf(this.f60018c));
    }
}
