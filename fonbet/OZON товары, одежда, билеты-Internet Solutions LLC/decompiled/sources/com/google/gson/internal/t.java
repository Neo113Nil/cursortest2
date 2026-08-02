package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class t extends x {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Method f60015b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f60016c;

    t(Method method, Object obj) {
        this.f60015b = method;
        this.f60016c = obj;
    }

    @Override // com.google.gson.internal.x
    public final <T> T a(Class<T> cls) throws Exception {
        String a11 = g.a(cls);
        if (a11 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a11));
        }
        return (T) this.f60015b.invoke(this.f60016c, cls);
    }
}
