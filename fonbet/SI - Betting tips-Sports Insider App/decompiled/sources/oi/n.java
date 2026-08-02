package oi;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f21279a;

    /* renamed from: b, reason: collision with root package name */
    public final d f21280b;

    public n(Executor executor, d dVar) {
        this.f21279a = executor;
        this.f21280b = dVar;
    }

    @Override // oi.d
    public final boolean c() {
        return this.f21280b.c();
    }

    @Override // oi.d
    public final void cancel() {
        this.f21280b.cancel();
    }

    @Override // oi.d
    public final gh.i0 l0() {
        return this.f21280b.l0();
    }

    @Override // oi.d
    public final void o0(g gVar) {
        this.f21280b.o0(new io.sentry.util.network.b(8, this, gVar, false));
    }

    @Override // oi.d
    public final d clone() {
        return new n(this.f21279a, this.f21280b.clone());
    }
}
