package H1;

import H1.J;

/* renamed from: H1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1176i implements J {

    /* renamed from: a, reason: collision with root package name */
    public final long f4437a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4439c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4440d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4441e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4442f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4443g;

    public C1176i(long j10, long j11, int i10, int i11, boolean z10) {
        this.f4437a = j10;
        this.f4438b = j11;
        this.f4439c = i11 == -1 ? 1 : i11;
        this.f4441e = i10;
        this.f4443g = z10;
        if (j10 == -1) {
            this.f4440d = -1L;
            this.f4442f = -9223372036854775807L;
        } else {
            this.f4440d = j10 - j11;
            this.f4442f = f(j10, j11, i10);
        }
    }

    public static long f(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public final long a(long j10) {
        int i10 = this.f4439c;
        long j11 = (((j10 * this.f4441e) / 8000000) / i10) * i10;
        long j12 = this.f4440d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - i10);
        }
        return this.f4438b + Math.max(j11, 0L);
    }

    public long c(long j10) {
        return f(j10, this.f4438b, this.f4441e);
    }

    @Override // H1.J
    public J.a e(long j10) {
        if (this.f4440d == -1 && !this.f4443g) {
            return new J.a(new K(0L, this.f4438b));
        }
        long a10 = a(j10);
        long c10 = c(a10);
        K k10 = new K(c10, a10);
        if (this.f4440d != -1 && c10 < j10) {
            int i10 = this.f4439c;
            if (i10 + a10 < this.f4437a) {
                long j11 = a10 + i10;
                return new J.a(k10, new K(c(j11), j11));
            }
        }
        return new J.a(k10);
    }

    @Override // H1.J
    public boolean i() {
        return this.f4440d != -1 || this.f4443g;
    }

    @Override // H1.J
    public long m() {
        return this.f4442f;
    }
}
