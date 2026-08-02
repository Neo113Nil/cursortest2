package io.sentry;

import io.sentry.util.p;

/* renamed from: io.sentry.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4726b1 implements InterfaceC4740e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C4726b1 f51889b = new C4726b1();

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.p f51890a = new io.sentry.util.p(new p.a() { // from class: io.sentry.a1
        @Override // io.sentry.util.p.a
        public final Object a() {
            F3 empty;
            empty = F3.empty();
            return empty;
        }
    });

    public static C4726b1 E() {
        return f51889b;
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u A(io.sentry.protocol.B b10, j4 j4Var, J j10, C1 c12) {
        return io.sentry.protocol.u.f52477c;
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4740e0 B(String str) {
        return E();
    }

    @Override // io.sentry.InterfaceC4740e0
    public void a(boolean z10) {
    }

    @Override // io.sentry.InterfaceC4740e0
    public void b(long j10) {
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean c() {
        return true;
    }

    @Override // io.sentry.InterfaceC4740e0
    public void d(C4744f c4744f) {
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.transport.z e() {
        return null;
    }

    @Override // io.sentry.InterfaceC4740e0
    public void endSession() {
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u f(C4866x2 c4866x2, J j10) {
        return io.sentry.protocol.u.f52477c;
    }

    @Override // io.sentry.InterfaceC4740e0
    public void g(C4744f c4744f, J j10) {
    }

    @Override // io.sentry.InterfaceC4740e0
    public void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str) {
    }

    @Override // io.sentry.InterfaceC4740e0
    public F3 i() {
        return (F3) this.f51890a.a();
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4790o0 k() {
        return null;
    }

    @Override // io.sentry.InterfaceC4740e0
    public boolean m() {
        return true;
    }

    @Override // io.sentry.InterfaceC4740e0
    public void n(P1 p12, N1 n12) {
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u o(G3 g32, J j10) {
        return io.sentry.protocol.u.f52477c;
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4730c0 p() {
        return Z0.m();
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u q(io.sentry.protocol.i iVar, J j10, N1 n12) {
        return io.sentry.protocol.u.f52477c;
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u r(C4870y1 c4870y1) {
        return io.sentry.protocol.u.f52477c;
    }

    @Override // io.sentry.InterfaceC4740e0
    public void t() {
    }

    @Override // io.sentry.InterfaceC4740e0
    public io.sentry.protocol.u v(C4733c3 c4733c3, J j10) {
        return io.sentry.protocol.u.f52477c;
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4790o0 w(m4 m4Var, o4 o4Var) {
        return C4781m1.v();
    }

    @Override // io.sentry.InterfaceC4740e0
    public Boolean x() {
        return null;
    }

    @Override // io.sentry.InterfaceC4740e0
    public InterfaceC4730c0 y() {
        return Z0.m();
    }

    @Override // io.sentry.InterfaceC4740e0
    public V z() {
        return S0.d();
    }

    @Override // io.sentry.InterfaceC4740e0
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public W m138clone() {
        return T0.D();
    }
}
