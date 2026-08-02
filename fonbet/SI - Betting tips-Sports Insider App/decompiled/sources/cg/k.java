package cg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final long f3935a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3936b;

    public k(long j, int i5) {
        this.f3935a = j;
        this.f3936b = i5;
    }

    @Override // cg.l
    public final g toInstant() {
        io.sentry.hints.j jVar = g.f3925c;
        long j = g.f3926d.f3928a;
        long j6 = this.f3935a;
        if (j6 >= j && j6 <= g.f3927e.f3928a) {
            return io.sentry.hints.j.u(this.f3936b, j6);
        }
        throw new h("The parsed date is outside the range representable by Instant (Unix epoch second " + j6 + ')', 0);
    }
}
