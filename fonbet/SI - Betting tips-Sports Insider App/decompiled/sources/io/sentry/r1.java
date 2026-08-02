package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r1 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f16982a = Runtime.getRuntime();

    @Override // io.sentry.x0
    public final void a(d3 d3Var) {
        Runtime runtime = this.f16982a;
        d3Var.f16303b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }

    @Override // io.sentry.x0
    public final void c() {
    }
}
