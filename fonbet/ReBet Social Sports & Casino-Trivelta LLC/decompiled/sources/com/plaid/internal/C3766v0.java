package com.plaid.internal;

/* renamed from: com.plaid.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3766v0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3681l4 f41130a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC3663j4 f41131b;

    /* renamed from: c, reason: collision with root package name */
    public final C3748t0 f41132c;

    public C3766v0(C3681l4 c3681l4, EnumC3663j4 enumC3663j4, C3711o7 c3711o7, C3748t0 c3748t0) {
        this.f41130a = c3681l4;
        this.f41131b = enumC3663j4;
        this.f41132c = c3748t0;
    }

    public final C3559b a() {
        if (this.f41130a.a()) {
            throw new C3721q(T0.PRE_CHECK_AIRPLANE_MODE_ENABLED);
        }
        C3636g4 a10 = this.f41130a.a(this.f41131b);
        if (a10 == null) {
            throw new C3721q(T0.PRE_CHECK_NO_CELLULAR_RADIO);
        }
        try {
            C3559b c3559b = new C3559b(a10);
            c3559b.f39825a.f40549c = 10000;
            c3559b.f39826b.f40685c = 10000;
            if (this.f41132c.a(c3559b)) {
                return c3559b;
            }
            throw new C3721q(T0.PRE_CHECK_NO_CELLULAR_CONNECTION);
        } catch (C3721q | RuntimeException e10) {
            if (!a10.f40628d) {
                a10.f40628d = true;
                a10.f40626b.run();
            }
            throw e10;
        }
    }
}
