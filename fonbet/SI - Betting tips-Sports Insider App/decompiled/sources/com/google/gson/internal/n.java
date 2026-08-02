package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f6347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6348c;

    public n(int i5, Method method) {
        this.f6347b = method;
        this.f6348c = i5;
    }

    @Override // com.google.gson.internal.q
    public final Object a(Class cls) {
        String h10 = m3.f.h(cls);
        if (h10 == null) {
            return this.f6347b.invoke(null, cls, Integer.valueOf(this.f6348c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(h10));
    }
}
