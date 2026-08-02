package com.google.firebase.messaging;

import u8.h;

/* loaded from: classes9.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static final u8.h f59588a;

    static {
        h.a aVar = new h.a();
        aVar.registerEncoder(B.class, C5922c.f59698a);
        aVar.registerEncoder(F8.b.class, C5921b.f59695a);
        aVar.registerEncoder(F8.a.class, C5920a.f59678a);
        f59588a = aVar.a();
    }

    private B() {
    }

    public static byte[] a(Object obj) {
        return f59588a.a(obj);
    }

    public abstract F8.b b();
}
