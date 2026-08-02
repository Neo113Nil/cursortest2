package io.sentry;

/* loaded from: classes3.dex */
public final class X1 implements InterfaceC4740e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final X1 f50565a = new X1();

    public static X1 D() {
        return f50565a;
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u A(io.sentry.protocol.B b10, j4 j4Var, J j10, C1 c12) {
        return AbstractC4772k2.p().A(b10, j4Var, j10, c12);
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4740e0 B(String str) {
        return AbstractC4772k2.o(str);
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u C(io.sentry.protocol.i iVar) {
        return AbstractC4772k2.l().b(iVar);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void a(boolean z10) {
        AbstractC4772k2.h();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void b(long j10) {
        AbstractC4772k2.n(j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean c() {
        return AbstractC4772k2.E();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void d(C4744f c4744f) {
        g(c4744f, new J());
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.transport.z e() {
        return AbstractC4772k2.p().e();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void endSession() {
        AbstractC4772k2.k();
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u f(C4866x2 c4866x2, J j10) {
        return AbstractC4772k2.p().f(c4866x2, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void g(C4744f c4744f, J j10) {
        AbstractC4772k2.e(c4744f, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str) {
        AbstractC4772k2.p().h(th2, interfaceC4780m0, str);
    }

    @Override // io.sentry.InterfaceC4740e0
    public F3 i() {
        return AbstractC4772k2.p().i();
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean isEnabled() {
        return AbstractC4772k2.D();
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4790o0 k() {
        return AbstractC4772k2.p().k();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void n(P1 p12, N1 n12) {
        AbstractC4772k2.j(p12, n12);
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u o(G3 g32, J j10) {
        return AbstractC4772k2.p().o(g32, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4730c0 p() {
        return AbstractC4772k2.r();
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u q(io.sentry.protocol.i iVar, J j10, N1 n12) {
        return AbstractC4772k2.l().a(iVar, j10, n12);
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u r(C4870y1 c4870y1) {
        return AbstractC4772k2.p().r(c4870y1);
    }

    @Override // io.sentry.InterfaceC4740e0
    public void t() {
        AbstractC4772k2.J();
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u u(io.sentry.protocol.i iVar, J j10) {
        return AbstractC4772k2.l().c(iVar, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u v(C4733c3 c4733c3, J j10) {
        return AbstractC4772k2.g(c4733c3, j10);
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4790o0 w(m4 m4Var, o4 o4Var) {
        return AbstractC4772k2.K(m4Var, o4Var);
    }

    @Override // io.sentry.InterfaceC4740e0
    public Boolean x() {
        return AbstractC4772k2.C();
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4730c0 y() {
        return AbstractC4772k2.p().y();
    }

    @Override // io.sentry.InterfaceC4740e0
    public V z() {
        return AbstractC4772k2.p().z();
    }

    @Override // io.sentry.InterfaceC4740e0
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public W m129clone() {
        return AbstractC4772k2.p().m128clone();
    }
}
