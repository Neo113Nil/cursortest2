package a2;

import H1.F;
import H1.J;
import H1.K;
import e1.AbstractC4156x;
import e1.J;
import e1.Z;

/* loaded from: classes.dex */
public final class h implements InterfaceC1915g {

    /* renamed from: a, reason: collision with root package name */
    public final long f15017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15018b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15019c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15020d;
    private final long[] positions;
    private final long[] timesUs;

    public h(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.f15017a = j10;
        this.f15018b = j11;
        this.f15019c = j12;
        this.f15020d = i10;
    }

    public static h a(long j10, long j11, F.a aVar, J j12) {
        int M10;
        j12.c0(6);
        long j13 = j11 + aVar.f4328c;
        long v10 = j12.v() + j13;
        int v11 = j12.v();
        if (v11 <= 0) {
            return null;
        }
        long o12 = Z.o1((v11 * aVar.f4332g) - 1, aVar.f4329d);
        int U10 = j12.U();
        int U11 = j12.U();
        int U12 = j12.U();
        j12.c0(2);
        int i10 = U11;
        long[] jArr = new long[U10];
        long[] jArr2 = new long[U10];
        int i11 = 0;
        long j14 = j11 + aVar.f4328c;
        while (i11 < U10) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i11] = (i11 * o12) / U10;
            jArr3[i11] = j14;
            if (U12 == 1) {
                M10 = j12.M();
            } else if (U12 == 2) {
                M10 = j12.U();
            } else if (U12 == 3) {
                M10 = j12.P();
            } else {
                if (U12 != 4) {
                    return null;
                }
                M10 = j12.Q();
            }
            int i12 = i11;
            int i13 = i10;
            j14 += M10 * i13;
            i10 = i13;
            i11 = i12 + 1;
            U10 = U10;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j10 != -1 && j10 != v10) {
            AbstractC4156x.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + v10);
        }
        if (v10 != j14) {
            AbstractC4156x.i("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + v10 + ", " + j14 + "\nSeeking will be inaccurate.");
            v10 = Math.max(v10, j14);
        }
        return new h(jArr6, jArr5, o12, j13, v10, aVar.f4331f);
    }

    @Override // a2.InterfaceC1915g
    public long b(long j10) {
        return this.timesUs[Z.h(this.positions, j10, true, true)];
    }

    @Override // a2.InterfaceC1915g
    public long d() {
        return this.f15018b;
    }

    @Override // H1.J
    public J.a e(long j10) {
        int h10 = Z.h(this.timesUs, j10, true, true);
        K k10 = new K(this.timesUs[h10], this.positions[h10]);
        if (k10.f4339a >= j10 || h10 == this.timesUs.length - 1) {
            return new J.a(k10);
        }
        int i10 = h10 + 1;
        return new J.a(k10, new K(this.timesUs[i10], this.positions[i10]));
    }

    @Override // a2.InterfaceC1915g
    public long h() {
        return this.f15019c;
    }

    @Override // H1.J
    public boolean i() {
        return true;
    }

    @Override // a2.InterfaceC1915g
    public int l() {
        return this.f15020d;
    }

    @Override // H1.J
    public long m() {
        return this.f15017a;
    }
}
