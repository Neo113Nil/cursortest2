package g4;

import N3.F;
import m3.C8050C;
import m3.N;

/* loaded from: classes8.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    public final F.a f63783a;

    /* renamed from: b, reason: collision with root package name */
    public final long f63784b;

    /* renamed from: c, reason: collision with root package name */
    public final long f63785c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63786d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63787e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f63788f;

    private g(F.a aVar, long j11, long j12, long[] jArr, int i11, int i12) {
        F.a aVar2 = new F.a();
        aVar2.f18494a = aVar.f18494a;
        aVar2.f18495b = aVar.f18495b;
        aVar2.f18496c = aVar.f18496c;
        aVar2.f18497d = aVar.f18497d;
        aVar2.f18498e = aVar.f18498e;
        aVar2.f18499f = aVar.f18499f;
        aVar2.f18500g = aVar.f18500g;
        this.f63783a = aVar2;
        this.f63784b = j11;
        this.f63785c = j12;
        this.f63788f = jArr;
        this.f63786d = i11;
        this.f63787e = i12;
    }

    public static g b(F.a aVar, C8050C c8050c) {
        long[] jArr;
        int i11;
        int i12;
        int p11 = c8050c.p();
        int I11 = (p11 & 1) != 0 ? c8050c.I() : -1;
        long G11 = (p11 & 2) != 0 ? c8050c.G() : -1L;
        if ((p11 & 4) == 4) {
            jArr = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr[i13] = c8050c.E();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((p11 & 8) != 0) {
            c8050c.S(4);
        }
        if (c8050c.a() >= 24) {
            c8050c.S(21);
            int H11 = c8050c.H();
            i12 = H11 & 4095;
            i11 = (16773120 & H11) >> 12;
        } else {
            i11 = -1;
            i12 = -1;
        }
        return new g(aVar, I11, G11, jArr2, i11, i12);
    }

    public final long a() {
        long j11 = this.f63784b;
        if (j11 == -1 || j11 == 0) {
            return -9223372036854775807L;
        }
        return N.X(this.f63783a.f18497d, (j11 * r0.f18500g) - 1);
    }
}
