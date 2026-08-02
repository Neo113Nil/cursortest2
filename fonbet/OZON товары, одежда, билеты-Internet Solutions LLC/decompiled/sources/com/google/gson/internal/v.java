package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes9.dex */
final class v extends x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Method f60019b;

    v(Method method) {
        this.f60019b = method;
    }

    @Override // com.google.gson.internal.x
    public final <T> T a(Class<T> cls) throws Exception {
        String a11 = g.a(cls);
        if (a11 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a11));
        }
        return (T) this.f60019b.invoke(null, cls, Object.class);
    }
}
