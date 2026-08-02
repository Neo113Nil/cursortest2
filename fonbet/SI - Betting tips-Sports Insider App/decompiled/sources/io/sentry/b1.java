package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface b1 {
    io.sentry.protocol.v A(String str, b5 b5Var);

    io.sentry.protocol.v B(io.sentry.protocol.e0 e0Var, t6 t6Var, h0 h0Var, j3 j3Var);

    io.sentry.protocol.v C(String str, b5 b5Var, com.google.firebase.messaging.q qVar);

    b1 D(String str);

    io.sentry.protocol.v E(t4 t4Var, h0 h0Var);

    void a(boolean z5);

    void b(long j);

    void c(e eVar);

    t0 clone();

    e5.j d();

    boolean e();

    void f(String str, String str2);

    void g(Throwable th2, m6 m6Var, String str);

    void h(e eVar, h0 h0Var);

    i1 i();

    boolean isEnabled();

    boolean j();

    io.sentry.protocol.v k(g3 g3Var);

    io.sentry.protocol.v l(l1.a aVar, h0 h0Var);

    b6 m();

    k1 n();

    io.sentry.protocol.v o(Throwable th2, h0 h0Var, u3 u3Var);

    void p();

    void q();

    k1 r(v6 v6Var, w6 w6Var);

    io.sentry.protocol.v s(Throwable th2, u3 u3Var);

    io.sentry.protocol.v t(io.sentry.protocol.e0 e0Var, t6 t6Var, h0 h0Var);

    void u(u3 u3Var);

    io.sentry.protocol.v v(String str, com.google.firebase.messaging.q qVar);

    io.sentry.logger.a w();

    io.sentry.protocol.v x(d6 d6Var, h0 h0Var);

    void y(u3 u3Var);

    io.sentry.protocol.v z(String str);
}
