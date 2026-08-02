package com.plaid.internal;

import java.util.concurrent.ExecutionException;

/* renamed from: com.plaid.internal.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3703o<R> {

    /* renamed from: g, reason: collision with root package name */
    public static final C3784x0 f40873g;

    /* renamed from: a, reason: collision with root package name */
    public final C3775w0 f40874a;

    /* renamed from: b, reason: collision with root package name */
    public final C3757u0 f40875b;

    /* renamed from: c, reason: collision with root package name */
    public final C3763u6 f40876c;

    /* renamed from: d, reason: collision with root package name */
    public final C3739s0 f40877d;

    /* renamed from: e, reason: collision with root package name */
    public final C3745s6 f40878e;

    /* renamed from: f, reason: collision with root package name */
    public final A7 f40879f;

    /* renamed from: com.plaid.internal.o$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3731r1 f40880a;

        /* renamed from: b, reason: collision with root package name */
        public final D0 f40881b;

        public a(D0 d02, InterfaceC3731r1 interfaceC3731r1) {
            this.f40880a = interfaceC3731r1;
            this.f40881b = d02;
        }
    }

    static {
        W3 w32 = Z3.f39803a;
        f40873g = new C3784x0("auth");
    }

    public C3703o(A7 a72, C3775w0 c3775w0, C3757u0 c3757u0, C3763u6 c3763u6, C3739s0 c3739s0, C3745s6 c3745s6) {
        this.f40879f = a72;
        this.f40874a = c3775w0;
        this.f40875b = c3757u0;
        this.f40876c = c3763u6;
        this.f40877d = c3739s0;
        this.f40878e = c3745s6;
    }

    public static void a(EnumC3684l7 enumC3684l7, C3712p c3712p) {
        if (enumC3684l7 != EnumC3684l7.FINISH && c3712p.f40924a) {
            throw new C3721q(T0.GENERIC_TIMEOUT);
        }
        c3712p.f40925b = enumC3684l7;
    }

    public static <I, O> O a(EnumC3684l7 enumC3684l7, InterfaceC3675k7<I, O> interfaceC3675k7, I i10, C3712p c3712p) {
        try {
            a(enumC3684l7, c3712p);
            f40873g.a(W3.INFO, "execute step: " + enumC3684l7, new Object[0]);
            return (O) interfaceC3675k7.a(i10, c3712p).a();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new r(enumC3684l7, e10);
        } catch (ExecutionException e11) {
            throw new r(enumC3684l7, e11.getCause());
        } catch (Exception e12) {
            throw new r(enumC3684l7, e12);
        }
    }
}
