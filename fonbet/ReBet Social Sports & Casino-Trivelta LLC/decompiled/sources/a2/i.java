package a2;

import H1.F;
import e1.J;
import e1.Z;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final F.a f15021a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15022b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15023c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15024d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15025e;
    public final long[] tableOfContents;

    public i(F.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f15021a = new F.a(aVar);
        this.f15022b = j10;
        this.f15023c = j11;
        this.tableOfContents = jArr;
        this.f15024d = i10;
        this.f15025e = i11;
    }

    public static i b(F.a aVar, J j10) {
        long[] jArr;
        int i10;
        int i11;
        int v10 = j10.v();
        int Q10 = (v10 & 1) != 0 ? j10.Q() : -1;
        long O10 = (v10 & 2) != 0 ? j10.O() : -1L;
        if ((v10 & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = j10.M();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((v10 & 8) != 0) {
            j10.c0(4);
        }
        if (j10.a() >= 24) {
            j10.c0(21);
            int P10 = j10.P();
            i11 = P10 & 4095;
            i10 = (16773120 & P10) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, Q10, O10, jArr2, i10, i11);
    }

    public long a() {
        long j10 = this.f15022b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        return Z.o1((j10 * r2.f4332g) - 1, this.f15021a.f4329d);
    }
}
