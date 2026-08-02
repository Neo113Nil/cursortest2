package e1;

/* renamed from: e1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4147n implements S {

    /* renamed from: a, reason: collision with root package name */
    public final float f45538a;

    /* renamed from: b, reason: collision with root package name */
    public final double f45539b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45540c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45541d;

    /* renamed from: e, reason: collision with root package name */
    public final long f45542e;

    /* renamed from: f, reason: collision with root package name */
    public int f45543f;

    public C4147n(long j10, float f10) {
        this(0L, j10, f10);
    }

    @Override // e1.S
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4147n a() {
        return new C4147n(this.f45541d, this.f45542e, this.f45538a);
    }

    public final long c(int i10) {
        long round = this.f45541d + Math.round(this.f45539b * i10);
        AbstractC4134a.g(round >= 0);
        return round;
    }

    @Override // e1.S
    public boolean hasNext() {
        return this.f45543f < this.f45540c;
    }

    @Override // e1.S
    public long next() {
        AbstractC4134a.g(hasNext());
        int i10 = this.f45543f;
        this.f45543f = i10 + 1;
        return c(i10);
    }

    public C4147n(long j10, long j11, float f10) {
        boolean z10 = false;
        AbstractC4134a.a(j11 > 0);
        AbstractC4134a.a(f10 > 0.0f);
        if (0 <= j10 && j10 < j11) {
            z10 = true;
        }
        AbstractC4134a.a(z10);
        this.f45541d = j10;
        this.f45542e = j11;
        this.f45538a = f10;
        this.f45540c = Math.max(Math.round(((j11 - j10) / 1000000.0f) * f10), 1);
        this.f45539b = 1000000.0f / f10;
    }
}
