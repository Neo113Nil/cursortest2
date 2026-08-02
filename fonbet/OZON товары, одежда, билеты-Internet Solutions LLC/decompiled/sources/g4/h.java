package g4;

import N3.F;
import N3.H;
import N3.I;
import m3.N;

/* loaded from: classes8.dex */
final class h implements InterfaceC6623e {

    /* renamed from: a, reason: collision with root package name */
    private final long f63789a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63790b;

    /* renamed from: c, reason: collision with root package name */
    private final long f63791c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63792d;

    /* renamed from: e, reason: collision with root package name */
    private final long f63793e;

    /* renamed from: f, reason: collision with root package name */
    private final long f63794f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f63795g;

    private h(long j11, int i11, long j12, int i12, long j13, long[] jArr) {
        this.f63789a = j11;
        this.f63790b = i11;
        this.f63791c = j12;
        this.f63792d = i12;
        this.f63793e = j13;
        this.f63795g = jArr;
        this.f63794f = j13 != -1 ? j11 + j13 : -1L;
    }

    public static h a(g gVar, long j11) {
        long a11 = gVar.a();
        if (a11 == -9223372036854775807L) {
            return null;
        }
        F.a aVar = gVar.f63783a;
        return new h(j11, aVar.f18496c, a11, aVar.f18499f, gVar.f63785c, gVar.f63788f);
    }

    @Override // g4.InterfaceC6623e
    public final long g() {
        return this.f63794f;
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f63791c;
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        double d11;
        double d12;
        boolean isSeekable = isSeekable();
        int i11 = this.f63790b;
        long j12 = this.f63789a;
        if (!isSeekable) {
            I i12 = new I(0L, j12 + i11);
            return new H.a(i12, i12);
        }
        long j13 = N.j(j11, 0L, this.f63791c);
        double d13 = (j13 * 100.0d) / this.f63791c;
        double d14 = 0.0d;
        if (d13 <= 0.0d) {
            d11 = 256.0d;
        } else if (d13 >= 100.0d) {
            d11 = 256.0d;
            d14 = 256.0d;
        } else {
            int i13 = (int) d13;
            long[] jArr = this.f63795g;
            G10.a.i(jArr);
            double d15 = jArr[i13];
            if (i13 == 99) {
                d11 = 256.0d;
                d12 = 256.0d;
            } else {
                d11 = 256.0d;
                d12 = jArr[i13 + 1];
            }
            d14 = ((d12 - d15) * (d13 - i13)) + d15;
        }
        long j14 = this.f63793e;
        I i14 = new I(j13, j12 + N.j(Math.round((d14 / d11) * j14), i11, j14 - 1));
        return new H.a(i14, i14);
    }

    @Override // g4.InterfaceC6623e
    public final long h(long j11) {
        long j12 = j11 - this.f63789a;
        if (!isSeekable() || j12 <= this.f63790b) {
            return 0L;
        }
        long[] jArr = this.f63795g;
        G10.a.i(jArr);
        double d11 = (j12 * 256.0d) / this.f63793e;
        int e11 = N.e(jArr, (long) d11, true);
        long j13 = this.f63791c;
        long j14 = (e11 * j13) / 100;
        long j15 = jArr[e11];
        int i11 = e11 + 1;
        long j16 = (j13 * i11) / 100;
        return Math.round((j15 == (e11 == 99 ? 256L : jArr[i11]) ? 0.0d : (d11 - j15) / (r0 - j15)) * (j16 - j14)) + j14;
    }

    @Override // g4.InterfaceC6623e
    public final int i() {
        return this.f63792d;
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return this.f63795g != null;
    }
}
