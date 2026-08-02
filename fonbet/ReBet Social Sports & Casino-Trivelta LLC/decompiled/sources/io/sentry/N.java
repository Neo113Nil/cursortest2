package io.sentry;

/* loaded from: classes3.dex */
public final class N implements W {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4740e0 f50463a;

    public N(InterfaceC4740e0 interfaceC4740e0) {
        this.f50463a = interfaceC4740e0;
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u A(io.sentry.protocol.B b10, j4 j4Var, J j10, C1 c12) {
        return this.f50463a.A(b10, j4Var, j10, c12);
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4740e0 B(String str) {
        return this.f50463a.B(str);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void a(boolean z10) {
        this.f50463a.a(z10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void b(long j10) {
        this.f50463a.b(j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean c() {
        return this.f50463a.c();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void d(C4744f c4744f) {
        this.f50463a.d(c4744f);
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.transport.z e() {
        return this.f50463a.e();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void endSession() {
        this.f50463a.endSession();
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u f(C4866x2 c4866x2, J j10) {
        return this.f50463a.f(c4866x2, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void g(C4744f c4744f, J j10) {
        this.f50463a.g(c4744f, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str) {
        this.f50463a.h(th2, interfaceC4780m0, str);
    }

    @Override // io.sentry.InterfaceC4740e0
    public F3 i() {
        return this.f50463a.i();
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean isEnabled() {
        return this.f50463a.isEnabled();
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4790o0 k() {
        return this.f50463a.k();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void n(P1 p12, N1 n12) {
        this.f50463a.n(p12, n12);
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u o(G3 g32, J j10) {
        return this.f50463a.o(g32, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4730c0 p() {
        return AbstractC4772k2.r();
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u q(io.sentry.protocol.i iVar, J j10, N1 n12) {
        return this.f50463a.q(iVar, j10, n12);
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u r(C4870y1 c4870y1) {
        return this.f50463a.r(c4870y1);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void t() {
        this.f50463a.t();
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u v(C4733c3 c4733c3, J j10) {
        return this.f50463a.v(c4733c3, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4790o0 w(m4 m4Var, o4 o4Var) {
        return this.f50463a.w(m4Var, o4Var);
    }

    @Override // io.sentry.InterfaceC4740e0
    public Boolean x() {
        return this.f50463a.x();
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4730c0 y() {
        return this.f50463a.y();
    }

    @Override // io.sentry.InterfaceC4740e0
    public V z() {
        return this.f50463a.z();
    }

    @Override // io.sentry.InterfaceC4740e0
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public W m126clone() {
        return this.f50463a.m129clone();
    }
}
