package p2;

import H1.J;
import H1.K;
import e1.Z;

/* renamed from: p2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6041e implements J {

    /* renamed from: a, reason: collision with root package name */
    public final C6039c f63023a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63024b;

    /* renamed from: c, reason: collision with root package name */
    public final long f63025c;

    /* renamed from: d, reason: collision with root package name */
    public final long f63026d;

    /* renamed from: e, reason: collision with root package name */
    public final long f63027e;

    public C6041e(C6039c c6039c, int i10, long j10, long j11) {
        this.f63023a = c6039c;
        this.f63024b = i10;
        this.f63025c = j10;
        long j12 = (j11 - j10) / c6039c.f63019e;
        this.f63026d = j12;
        this.f63027e = a(j12);
    }

    public final long a(long j10) {
        return Z.p1(j10 * this.f63024b, 1000000L, this.f63023a.f63017c);
    }

    @Override // H1.J
    public J.a e(long j10) {
        long p10 = Z.p((this.f63023a.f63017c * j10) / (this.f63024b * 1000000), 0L, this.f63026d - 1);
        long j11 = this.f63025c + (this.f63023a.f63019e * p10);
        long a10 = a(p10);
        K k10 = new K(a10, j11);
        if (a10 >= j10 || p10 == this.f63026d - 1) {
            return new J.a(k10);
        }
        long j12 = p10 + 1;
        return new J.a(k10, new K(a(j12), this.f63025c + (this.f63023a.f63019e * j12)));
    }

    @Override // H1.J
    public boolean i() {
        return true;
    }

    @Override // H1.J
    public long m() {
        return this.f63027e;
    }
}
