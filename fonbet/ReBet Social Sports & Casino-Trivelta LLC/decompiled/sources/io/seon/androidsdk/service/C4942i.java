package io.seon.androidsdk.service;

import android.content.Context;

/* renamed from: io.seon.androidsdk.service.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4942i implements InterfaceC4894c {

    /* renamed from: a, reason: collision with root package name */
    public final d7 f53348a;

    /* renamed from: b, reason: collision with root package name */
    public Context f53349b;

    /* renamed from: c, reason: collision with root package name */
    public P6 f53350c;

    /* renamed from: d, reason: collision with root package name */
    public String f53351d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53352e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53353f = false;

    public C4942i(Context context, String str, boolean z10, int i10, Jh.a aVar) {
        this.f53349b = context;
        this.f53351d = str;
        this.f53352e = i10;
        this.f53350c = new P6(context);
        d7 d7Var = new d7(this);
        this.f53348a = d7Var;
        b(Boolean.valueOf(z10));
        d7Var.j(aVar);
    }

    @Override // io.seon.androidsdk.service.InterfaceC4894c
    public final void a(InterfaceC4910e interfaceC4910e) {
        if (!this.f53353f) {
            throw new Kh.a("Failed to stop behaviour monitoring! There's no active behaviour monitoring running!");
        }
        this.f53348a.n(this.f53351d, interfaceC4910e, Boolean.TRUE);
        this.f53353f = false;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4894c
    public final void b(Boolean bool) {
        bool.booleanValue();
        Lh.a.f7201c = bool;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4894c
    public final void c(String str) {
        this.f53351d = str.replaceAll("[^a-zA-Z0-9-._~]", "");
    }

    @Override // io.seon.androidsdk.service.InterfaceC4894c
    public final void d(boolean z10) {
        this.f53348a.f53278b.f53310h.f53340g.e(z10);
    }

    @Override // io.seon.androidsdk.service.InterfaceC4894c
    public final void e() {
        d7 d7Var = this.f53348a;
        d7Var.getClass();
        try {
            d7Var.f53283g.D();
        } catch (Exception unused) {
        }
        this.f53353f = true;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4894c
    public final void f(Jh.a aVar) {
        this.f53348a.j(aVar);
    }

    @Override // io.seon.androidsdk.service.InterfaceC4894c
    public final void g(InterfaceC4910e interfaceC4910e) {
        this.f53348a.n(this.f53351d, interfaceC4910e, Boolean.FALSE);
    }

    public final int h() {
        return this.f53352e;
    }

    public final Context i() {
        return this.f53349b;
    }

    public final synchronized String j() {
        return this.f53351d;
    }
}
