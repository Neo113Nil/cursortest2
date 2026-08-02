package s7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f22686a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.sentry.util.network.b f22688c;

    public d3(io.sentry.util.network.b bVar, long j, long j6) {
        Objects.requireNonNull(bVar);
        this.f22688c = bVar;
        this.f22686a = j;
        this.f22687b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var = ((f1) ((f3) this.f22688c.f17177c).f3328a).f22746g;
        f1.m(d1Var);
        d1Var.s(new androidx.core.widget.b(23, this));
    }
}
