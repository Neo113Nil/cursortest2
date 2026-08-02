package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zx4 extends sdi {
    public static final Object h = new Object();
    public long c;
    public int d;
    public h0d e;
    public Object f;
    public int g;

    public zx4(long j) {
        super(j);
        h0d h0dVar = vjd.a;
        h0dVar.getClass();
        this.e = h0dVar;
        this.f = h;
    }

    @Override // defpackage.sdi
    public final void a(sdi sdiVar) {
        sdiVar.getClass();
        zx4 zx4Var = (zx4) sdiVar;
        this.e = zx4Var.e;
        this.f = zx4Var.f;
        this.g = zx4Var.g;
    }

    @Override // defpackage.sdi
    public final sdi b() {
        return new zx4(snh.h().g());
    }

    @Override // defpackage.sdi
    public final sdi c(long j) {
        return new zx4(j);
    }

    public final boolean d(ay4 ay4Var, nnh nnhVar) {
        boolean z;
        boolean z2;
        Object obj = snh.c;
        synchronized (obj) {
            z = true;
            if (this.c == nnhVar.g()) {
                if (this.d == nnhVar.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != e(ay4Var, nnhVar))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = nnhVar.g();
            this.d = nnhVar.h();
            Unit unit = Unit.a;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [zx4] */
    /* JADX WARN: Type inference failed for: r13v5, types: [sdi] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, sdi] */
    public final int e(ay4 ay4Var, nnh nnhVar) {
        h0d h0dVar;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? g;
        synchronized (snh.c) {
            h0dVar = this.e;
        }
        int i5 = 7;
        if (h0dVar.e == 0) {
            return 7;
        }
        i1d a = goh.a();
        Object[] objArr3 = a.a;
        int i6 = a.c;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((zu8) objArr3[i7]).b();
        }
        try {
            Object[] objArr4 = h0dVar.b;
            int[] iArr = h0dVar.c;
            long[] jArr3 = h0dVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z ? 1 : 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                qdi qdiVar = (qdi) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (qdiVar instanceof ay4) {
                                        ay4 ay4Var2 = (ay4) qdiVar;
                                        g = ay4Var2.h((zx4) snh.g(ay4Var2.d, nnhVar), nnhVar, z, ay4Var2.b);
                                        h0d h0dVar2 = g.e;
                                        Object[] objArr5 = h0dVar2.b;
                                        long[] jArr4 = h0dVar2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + System.identityHashCode((qdi) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        g = snh.g(qdiVar.d(), nnhVar);
                                    }
                                    i = (((i * 31) + System.identityHashCode(g)) * 31) + Long.hashCode(g.a);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            i = i5;
            Unit unit = Unit.a;
            Object[] objArr6 = a.a;
            int i18 = a.c;
            for (int i19 = 0; i19 < i18; i19++) {
                ((zu8) objArr6[i19]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = a.a;
            int i20 = a.c;
            for (int i21 = 0; i21 < i20; i21++) {
                ((zu8) objArr7[i21]).a();
            }
            throw th;
        }
    }
}
