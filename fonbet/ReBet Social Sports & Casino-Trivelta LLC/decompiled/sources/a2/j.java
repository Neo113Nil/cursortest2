package a2;

import H1.F;
import H1.J;
import H1.K;
import e1.AbstractC4134a;
import e1.Z;

/* loaded from: classes.dex */
public final class j implements InterfaceC1915g {

    /* renamed from: a, reason: collision with root package name */
    public final long f15026a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15027b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15028c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15029d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15030e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15031f;
    private final long[] tableOfContents;

    public j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f15026a = j10;
        this.f15027b = i10;
        this.f15028c = j11;
        this.f15029d = i11;
        this.f15030e = j12;
        this.tableOfContents = jArr;
        this.f15031f = j12 != -1 ? j10 + j12 : -1L;
    }

    public static j a(i iVar, long j10) {
        long a10 = iVar.a();
        if (a10 == -9223372036854775807L) {
            return null;
        }
        F.a aVar = iVar.f15021a;
        return new j(j10, aVar.f4328c, a10, aVar.f4331f, iVar.f15023c, iVar.tableOfContents);
    }

    @Override // a2.InterfaceC1915g
    public long b(long j10) {
        long j11 = j10 - this.f15026a;
        if (!i() || j11 <= this.f15027b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC4134a.i(this.tableOfContents);
        double d10 = (j11 * 256.0d) / this.f15030e;
        int h10 = Z.h(jArr, (long) d10, true, true);
        long c10 = c(h10);
        long j12 = jArr[h10];
        int i10 = h10 + 1;
        long c11 = c(i10);
        return c10 + Math.round((j12 == (h10 == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (c11 - c10));
    }

    public final long c(int i10) {
        return (this.f15028c * i10) / 100;
    }

    @Override // a2.InterfaceC1915g
    public long d() {
        return this.f15026a + this.f15027b;
    }

    @Override // H1.J
    public J.a e(long j10) {
        if (!i()) {
            return new J.a(new K(0L, this.f15026a + this.f15027b));
        }
        long p10 = Z.p(j10, 0L, this.f15028c);
        double d10 = (p10 * 100.0d) / this.f15028c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) AbstractC4134a.i(this.tableOfContents))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new J.a(new K(p10, this.f15026a + Z.p(Math.round((d11 / 256.0d) * this.f15030e), this.f15027b, this.f15030e - 1)));
    }

    @Override // a2.InterfaceC1915g
    public long h() {
        return this.f15031f;
    }

    @Override // H1.J
    public boolean i() {
        return this.tableOfContents != null;
    }

    @Override // a2.InterfaceC1915g
    public int l() {
        return this.f15029d;
    }

    @Override // H1.J
    public long m() {
        return this.f15028c;
    }
}
