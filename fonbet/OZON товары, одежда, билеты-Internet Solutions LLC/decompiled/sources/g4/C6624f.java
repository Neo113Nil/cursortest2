package g4;

import C.C2702w;
import N3.F;
import N3.H;
import N3.I;
import m3.C8050C;
import m3.N;
import m3.s;

/* renamed from: g4.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6624f implements InterfaceC6623e {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f63778a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f63779b;

    /* renamed from: c, reason: collision with root package name */
    private final long f63780c;

    /* renamed from: d, reason: collision with root package name */
    private final long f63781d;

    /* renamed from: e, reason: collision with root package name */
    private final int f63782e;

    private C6624f(long[] jArr, long[] jArr2, long j11, long j12, long j13, int i11) {
        this.f63778a = jArr;
        this.f63779b = jArr2;
        this.f63780c = j11;
        this.f63781d = j13;
        this.f63782e = i11;
    }

    public static C6624f a(long j11, long j12, F.a aVar, C8050C c8050c) {
        int E11;
        c8050c.S(6);
        long j13 = j12 + aVar.f18496c;
        long p11 = c8050c.p() + j13;
        int p12 = c8050c.p();
        if (p12 <= 0) {
            return null;
        }
        long X9 = N.X(aVar.f18497d, (p12 * aVar.f18500g) - 1);
        int L11 = c8050c.L();
        int L12 = c8050c.L();
        int L13 = c8050c.L();
        c8050c.S(2);
        long j14 = j12 + aVar.f18496c;
        long[] jArr = new long[L11];
        long[] jArr2 = new long[L11];
        int i11 = 0;
        while (i11 < L11) {
            long j15 = X9;
            long[] jArr3 = jArr2;
            jArr[i11] = (i11 * j15) / L11;
            jArr3[i11] = j14;
            if (L13 == 1) {
                E11 = c8050c.E();
            } else if (L13 == 2) {
                E11 = c8050c.L();
            } else if (L13 == 3) {
                E11 = c8050c.H();
            } else {
                if (L13 != 4) {
                    return null;
                }
                E11 = c8050c.I();
            }
            j14 += E11 * L12;
            i11++;
            jArr2 = jArr3;
            X9 = j15;
            L13 = L13;
        }
        long j16 = X9;
        long[] jArr4 = jArr2;
        if (j11 != -1 && j11 != p11) {
            StringBuilder d11 = C2702w.d(j11, "VBRI data size mismatch: ", ", ");
            d11.append(p11);
            s.f("VbriSeeker", d11.toString());
        }
        if (p11 != j14) {
            StringBuilder d12 = C2702w.d(p11, "VBRI bytes and ToC mismatch (using max): ", ", ");
            d12.append(j14);
            d12.append("\nSeeking will be inaccurate.");
            s.f("VbriSeeker", d12.toString());
            p11 = Math.max(p11, j14);
        }
        return new C6624f(jArr, jArr4, j16, j13, p11, aVar.f18499f);
    }

    @Override // g4.InterfaceC6623e
    public final long g() {
        return this.f63781d;
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f63780c;
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        long[] jArr = this.f63778a;
        int e11 = N.e(jArr, j11, true);
        long j12 = jArr[e11];
        long[] jArr2 = this.f63779b;
        I i11 = new I(j12, jArr2[e11]);
        if (j12 >= j11 || e11 == jArr.length - 1) {
            return new H.a(i11, i11);
        }
        int i12 = e11 + 1;
        return new H.a(i11, new I(jArr[i12], jArr2[i12]));
    }

    @Override // g4.InterfaceC6623e
    public final long h(long j11) {
        return this.f63778a[N.e(this.f63779b, j11, true)];
    }

    @Override // g4.InterfaceC6623e
    public final int i() {
        return this.f63782e;
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return true;
    }
}
