package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3030n f30610a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f30611b;

    /* renamed from: c, reason: collision with root package name */
    public long f30612c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f30613d;

    /* renamed from: e, reason: collision with root package name */
    public B7.b f30614e;

    public C(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        this.f30610a = interfaceC3030n;
        this.f30611b = e0Var;
    }

    public InterfaceC3030n a() {
        return this.f30610a;
    }

    public e0 b() {
        return this.f30611b;
    }

    public long c() {
        return this.f30612c;
    }

    public g0 d() {
        return this.f30611b.z0();
    }

    public int e() {
        return this.f30613d;
    }

    public B7.b f() {
        return this.f30614e;
    }

    public Uri g() {
        return this.f30611b.D0().getSourceUri();
    }

    public void h(long j10) {
        this.f30612c = j10;
    }

    public void i(int i10) {
        this.f30613d = i10;
    }

    public void j(B7.b bVar) {
        this.f30614e = bVar;
    }
}
