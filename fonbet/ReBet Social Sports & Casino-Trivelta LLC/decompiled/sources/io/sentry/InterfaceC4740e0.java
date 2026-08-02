package io.sentry;

/* renamed from: io.sentry.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4740e0 {
    io.sentry.protocol.u A(io.sentry.protocol.B b10, j4 j4Var, J j10, C1 c12);

    InterfaceC4740e0 B(String str);

    default io.sentry.protocol.u C(io.sentry.protocol.i iVar) {
        return u(iVar, null);
    }

    void a(boolean z10);

    void b(long j10);

    boolean c();

    W clone();

    void d(C4744f c4744f);

    io.sentry.transport.z e();

    void endSession();

    io.sentry.protocol.u f(C4866x2 c4866x2, J j10);

    void g(C4744f c4744f, J j10);

    void h(Throwable th2, InterfaceC4780m0 interfaceC4780m0, String str);

    F3 i();

    boolean isEnabled();

    default io.sentry.protocol.u j(io.sentry.protocol.B b10, j4 j4Var, J j10) {
        return A(b10, j4Var, j10, null);
    }

    InterfaceC4790o0 k();

    default void l(N1 n12) {
        n(null, n12);
    }

    default boolean m() {
        return false;
    }

    void n(P1 p12, N1 n12);

    io.sentry.protocol.u o(G3 g32, J j10);

    InterfaceC4730c0 p();

    io.sentry.protocol.u q(io.sentry.protocol.i iVar, J j10, N1 n12);

    io.sentry.protocol.u r(C4870y1 c4870y1);

    default io.sentry.protocol.u s(C4866x2 c4866x2) {
        return f(c4866x2, new J());
    }

    void t();

    default io.sentry.protocol.u u(io.sentry.protocol.i iVar, J j10) {
        return q(iVar, j10, null);
    }

    io.sentry.protocol.u v(C4733c3 c4733c3, J j10);

    InterfaceC4790o0 w(m4 m4Var, o4 o4Var);

    Boolean x();

    InterfaceC4730c0 y();

    V z();
}
