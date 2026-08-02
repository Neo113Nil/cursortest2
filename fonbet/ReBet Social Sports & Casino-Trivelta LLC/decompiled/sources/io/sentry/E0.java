package io.sentry;

import java.io.Writer;

/* loaded from: classes3.dex */
public final class E0 implements InterfaceC4813r1 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.vendor.gson.stream.c f50254a;

    /* renamed from: b, reason: collision with root package name */
    public final D0 f50255b;

    public E0(Writer writer, int i10) {
        this.f50254a = new io.sentry.vendor.gson.stream.c(writer);
        this.f50255b = new D0(i10);
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public E0 k(Boolean bool) {
        this.f50254a.e2(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public E0 i(Number number) {
        this.f50254a.f2(number);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public E0 e(String str) {
        this.f50254a.g2(str);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public E0 c(boolean z10) {
        this.f50254a.h2(z10);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    public String f() {
        return this.f50254a.z0();
    }

    @Override // io.sentry.InterfaceC4813r1
    public InterfaceC4813r1 g(String str) {
        this.f50254a.A0(str);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    public void h(String str) {
        this.f50254a.a2(str);
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public E0 p() {
        this.f50254a.r();
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    public void q(boolean z10) {
        this.f50254a.q(z10);
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public E0 m() {
        this.f50254a.B();
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public E0 n() {
        this.f50254a.U();
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public E0 t() {
        this.f50254a.w0();
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public E0 d(String str) {
        this.f50254a.D0(str);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public E0 l() {
        this.f50254a.n1();
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public E0 b(double d10) {
        this.f50254a.c2(d10);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public E0 a(long j10) {
        this.f50254a.d2(j10);
        return this;
    }

    @Override // io.sentry.InterfaceC4813r1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public E0 j(ILogger iLogger, Object obj) {
        this.f50255b.b(this, iLogger, obj);
        return this;
    }
}
