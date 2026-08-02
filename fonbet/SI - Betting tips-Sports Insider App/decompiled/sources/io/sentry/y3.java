package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y3 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y3 f17255a = new y3();

    @Override // io.sentry.b1
    public final io.sentry.protocol.v A(String str, b5 b5Var) {
        return d4.a(str, b5Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v B(io.sentry.protocol.e0 e0Var, t6 t6Var, h0 h0Var, j3 j3Var) {
        return d4.d().B(e0Var, t6Var, h0Var, j3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v C(String str, b5 b5Var, com.google.firebase.messaging.q qVar) {
        return d4.d().C(str, b5Var, qVar);
    }

    @Override // io.sentry.b1
    public final b1 D(String str) {
        return d4.d().D("getCurrentScopes");
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v E(t4 t4Var, h0 h0Var) {
        return d4.d().E(t4Var, h0Var);
    }

    @Override // io.sentry.b1
    public final void a(boolean z5) {
        d4.b();
    }

    @Override // io.sentry.b1
    public final void b(long j) {
        d4.d().b(j);
    }

    @Override // io.sentry.b1
    public final void c(e eVar) {
        h(eVar, new h0());
    }

    @Override // io.sentry.b1
    public final e5.j d() {
        return d4.d().d();
    }

    @Override // io.sentry.b1
    public final boolean e() {
        return d4.d().e();
    }

    @Override // io.sentry.b1
    public final void f(String str, String str2) {
        d4.j(str, str2);
    }

    @Override // io.sentry.b1
    public final void g(Throwable th2, m6 m6Var, String str) {
        d4.d().g(th2, m6Var, str);
    }

    @Override // io.sentry.b1
    public final void h(e eVar, h0 h0Var) {
        d4.d().h(eVar, h0Var);
    }

    @Override // io.sentry.b1
    public final i1 i() {
        return d4.d().i();
    }

    @Override // io.sentry.b1
    public final boolean isEnabled() {
        return d4.h();
    }

    @Override // io.sentry.b1
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v k(g3 g3Var) {
        return d4.d().k(g3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v l(l1.a aVar, h0 h0Var) {
        return d4.d().l(aVar, h0Var);
    }

    @Override // io.sentry.b1
    public final b6 m() {
        return d4.d().m();
    }

    @Override // io.sentry.b1
    public final k1 n() {
        return d4.d().n();
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v o(Throwable th2, h0 h0Var, u3 u3Var) {
        return d4.d().o(th2, h0Var, u3Var);
    }

    @Override // io.sentry.b1
    public final void p() {
        d4.d().p();
    }

    @Override // io.sentry.b1
    public final void q() {
        d4.d().q();
    }

    @Override // io.sentry.b1
    public final k1 r(v6 v6Var, w6 w6Var) {
        return d4.d().r(v6Var, w6Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v s(Throwable th2, u3 u3Var) {
        return o(th2, new h0(), u3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v t(io.sentry.protocol.e0 e0Var, t6 t6Var, h0 h0Var) {
        return B(e0Var, t6Var, h0Var, null);
    }

    @Override // io.sentry.b1
    public final void u(u3 u3Var) {
        d4.c(u3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v v(String str, com.google.firebase.messaging.q qVar) {
        return C(str, b5.INFO, qVar);
    }

    @Override // io.sentry.b1
    public final io.sentry.logger.a w() {
        return d4.d().w();
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v x(d6 d6Var, h0 h0Var) {
        return d4.d().x(d6Var, h0Var);
    }

    @Override // io.sentry.b1
    public final void y(u3 u3Var) {
        d4.c(u3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.v z(String str) {
        return A(str, b5.INFO);
    }

    @Override // io.sentry.b1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final t0 m111clone() {
        return d4.d().m110clone();
    }
}
