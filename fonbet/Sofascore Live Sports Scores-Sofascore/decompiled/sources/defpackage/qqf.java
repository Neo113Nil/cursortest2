package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qqf {
    public final xy a;
    public final b10 b;
    public final lgj c;
    public final l0d d;
    public boolean e;
    public boolean f;
    public boolean g;
    public iy h;
    public long i;
    public final vce j;
    public final w0d k;

    public qqf(xy xyVar) {
        this.a = xyVar;
        b10 b10Var = new b10((char) 0, 11);
        b10Var.c = new long[PsExtractor.AUDIO_STREAM];
        b10Var.d = new long[PsExtractor.AUDIO_STREAM];
        this.b = b10Var;
        this.c = new lgj();
        this.d = new l0d();
        this.i = -1L;
        this.j = new vce(this, 21);
        this.k = new w0d();
    }

    public static boolean c(wdd wddVar) {
        qyd qydVar = wddVar.L;
        return (qydVar == null || y6a.F(((q29) qydVar).b())) ? false : true;
    }

    public static long e(wma wmaVar) {
        c40 c40Var = wmaVar.F;
        wdd wddVar = (wdd) c40Var.e;
        long j = 0;
        for (wdd wddVar2 = (z3a) c40Var.d; wddVar2 != null && wddVar2 != wddVar; wddVar2 = wddVar2.q) {
            if (c(wddVar2)) {
                return 9223372034707292159L;
            }
            j = r6a.d(j, wddVar2.z);
        }
        return j;
    }

    public static void h(wma wmaVar) {
        if (!wmaVar.c || c((wdd) wmaVar.F.e)) {
            return;
        }
        wmaVar.c = false;
        if (wmaVar.e) {
            wmaVar.d = e(wmaVar);
            wmaVar.e = false;
        }
        if (r6a.b(wmaVar.d, 9223372034707292159L)) {
            return;
        }
        i1d z = wmaVar.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            h((wma) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        long j;
        b10 b10Var;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        long[] jArr;
        long j5;
        long j6;
        iy iyVar = this.h;
        if (iyVar != null) {
            this.a.removeCallbacks(iyVar);
            this.h = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.e;
        boolean z3 = z2 || this.f;
        b10 b10Var2 = this.b;
        boolean z4 = true;
        lgj lgjVar = this.c;
        if (z2) {
            this.e = false;
            l0d l0dVar = this.d;
            Object[] objArr = l0dVar.a;
            int i3 = l0dVar.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((Function0) objArr[i4]).invoke();
            }
            long[] jArr2 = (long[]) b10Var2.c;
            int i5 = b10Var2.b;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j7 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j7 >> 60)) & 1) != 0) {
                    long j8 = jArr2[i6];
                    long j9 = jArr2[i6 + 1];
                    kgj kgjVar = (kgj) lgjVar.a.b(((int) j7) & 33554431);
                    while (kgjVar != null) {
                        kgj kgjVar2 = kgjVar.d;
                        boolean z6 = z3;
                        long j10 = kgjVar.g;
                        boolean z7 = (currentTimeMillis - j10 >= 0 || j10 == Long.MIN_VALUE) ? z5 : false;
                        kgjVar.e = j8;
                        kgjVar.f = j9;
                        if (z7) {
                            kgjVar.g = currentTimeMillis;
                            j5 = j8;
                            j6 = j9;
                            kgjVar.a(j5, j6, lgjVar.d, lgjVar.e, lgjVar.g);
                        } else {
                            j5 = j8;
                            j6 = j9;
                        }
                        kgjVar = kgjVar2;
                        j8 = j5;
                        j9 = j6;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) b10Var2.c;
            int i8 = b10Var2.b;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f) {
            this.f = false;
            long j11 = lgjVar.d;
            long j12 = lgjVar.e;
            float[] fArr = lgjVar.g;
            uzc uzcVar = lgjVar.a;
            j2 = 128;
            Object[] objArr2 = uzcVar.c;
            long[] jArr4 = uzcVar.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j13 = j11;
                    long j14 = jArr4[i11];
                    int i13 = i12;
                    b10Var = b10Var2;
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j15 = j14;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j15 & 255) < 128) {
                                kgj kgjVar3 = (kgj) objArr2[(i11 << 3) + i15];
                                while (kgjVar3 != null) {
                                    lgjVar.a(kgjVar3, j13, j12, fArr, currentTimeMillis);
                                    kgjVar3 = kgjVar3.d;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j15 >>= i16;
                            i15++;
                            j13 = j13;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j11 = j13;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j11 = j13;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    b10Var2 = b10Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j16 = lgjVar.d;
                    long j17 = lgjVar.e;
                    float[] fArr2 = lgjVar.g;
                    kgj kgjVar4 = lgjVar.b;
                    if (kgjVar4 != null) {
                        while (kgjVar4 != null) {
                            wma c0 = c6o.c0(kgjVar4.b);
                            kgjVar4.e = ((xy) zma.a(c0)).getRectManager().b(c0);
                            j1c j1cVar = c0.G.p;
                            kgjVar4.f = ((j1cVar.a + ((int) (r12 >> 32))) << 32) | ((j1cVar.b + ((int) (r12 & 4294967295L))) & 4294967295L);
                            lgjVar.a(kgjVar4, j16, j17, fArr2, currentTimeMillis);
                            kgjVar4 = kgjVar4.d;
                        }
                    }
                }
                if (this.g) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.g = false;
                    b10 b10Var3 = b10Var;
                    long[] jArr6 = (long[]) b10Var3.c;
                    int i17 = b10Var3.b;
                    long[] jArr7 = (long[]) b10Var3.d;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != pqf.c) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    b10Var3.b = i18;
                    b10Var3.c = jArr7;
                    b10Var3.d = jArr6;
                }
                j4 = lgjVar.c;
                if (j4 <= currentTimeMillis) {
                    uzc uzcVar2 = lgjVar.a;
                    Object[] objArr3 = uzcVar2.c;
                    long[] jArr8 = uzcVar2.a;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j18 = jArr8[i21];
                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j19 = j18;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j19 & j3) < j2) {
                                        for (kgj kgjVar5 = (kgj) objArr3[(i21 << 3) + i23]; kgjVar5 != null; kgjVar5 = kgjVar5.d) {
                                        }
                                    }
                                    j19 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                }
                            }
                            if (i21 == length2) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                    }
                    kgj kgjVar6 = lgjVar.b;
                    if (kgjVar6 != null) {
                        while (kgjVar6 != null) {
                            kgjVar6 = kgjVar6.d;
                        }
                    }
                    j4 = -1;
                    lgjVar.c = -1L;
                }
                if (j4 <= j) {
                    i();
                    return;
                }
                return;
            }
            b10Var = b10Var2;
            i = 8;
        } else {
            b10Var = b10Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.g) {
        }
        j4 = lgjVar.c;
        if (j4 <= currentTimeMillis) {
        }
        if (j4 <= j) {
        }
    }

    public final long b(wma wmaVar) {
        long j;
        int i = wmaVar.b & 33554431;
        b10 b10Var = this.b;
        long[] jArr = (long[]) b10Var.c;
        int i2 = b10Var.b;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) j) & 4294967295L) | (((int) (j >> 32)) << 32);
    }

    public final void d(wma wmaVar) {
        boolean z;
        boolean z2 = true;
        wmaVar.c = true;
        c40 c40Var = wmaVar.F;
        wdd wddVar = (wdd) c40Var.e;
        j1c j1cVar = wmaVar.G.p;
        int V = j1cVar.V();
        float S = j1cVar.S();
        w0d w0dVar = this.k;
        w0dVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        w0dVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        w0dVar.d = V;
        w0dVar.e = S;
        while (true) {
            if (wddVar == null) {
                break;
            }
            wma wmaVar2 = wddVar.o;
            if (wddVar == ((wdd) wmaVar2.F.e) && !wmaVar2.c) {
                if (!r6a.b(b(wmaVar2), 9223372034707292159L)) {
                    w0dVar.e((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            qyd qydVar = wddVar.L;
            if (qydVar != null) {
                float[] b = ((q29) qydVar).b();
                if (!y6a.F(b)) {
                    xzb.c(b, w0dVar);
                }
            }
            long j = wddVar.z;
            w0dVar.e((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            wddVar = wddVar.q;
        }
        int i = (int) w0dVar.b;
        int i2 = (int) w0dVar.c;
        int i3 = (int) w0dVar.d;
        int i4 = (int) w0dVar.e;
        int i5 = wmaVar.b;
        boolean z3 = wmaVar.g;
        wmaVar.g = true;
        b10 b10Var = this.b;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) b10Var.c;
            int i7 = b10Var.b;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (i << 32) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i3 << 32) | (i4 & 4294967295L);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i8 += 3;
                z2 = z;
            }
        }
        z = z2;
        wma v = wmaVar.v();
        b10Var.q(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : v != null ? v.b : -1, c40Var.n(1024), c40Var.n(16), this.c.a.a(i5), -1);
        wmaVar.f = false;
        this.e = z;
        i1d z4 = wmaVar.z();
        Object[] objArr = z4.a;
        int i10 = z4.c;
        for (int i11 = 0; i11 < i10; i11++) {
            wma wmaVar3 = (wma) objArr[i11];
            if (wmaVar3.I()) {
                d(wmaVar3);
            }
        }
    }

    public final void f(wma wmaVar) {
        long j;
        int i;
        boolean I = wmaVar.I();
        c40 c40Var = wmaVar.F;
        if (I && wmaVar.f) {
            wma v = wmaVar.v();
            if (v == null || v.c) {
                j = v == null ? 0L : 9223372034707292159L;
            } else {
                if (v.e) {
                    v.e = false;
                    v.d = e(v);
                }
                j = v.d;
            }
            wdd wddVar = (wdd) c40Var.e;
            if (r6a.b(j, 9223372034707292159L) || c(wddVar)) {
                d(wmaVar);
            } else if (wmaVar.c) {
                d(wmaVar);
                h(wmaVar);
            } else {
                long d = r6a.d(j, wddVar.z);
                j1c j1cVar = wmaVar.G.p;
                int V = j1cVar.V();
                int S = j1cVar.S();
                int i2 = wmaVar.b;
                boolean z = wmaVar.g;
                b10 b10Var = this.b;
                long j2 = 4294967295L;
                if (!z) {
                    wmaVar.g = true;
                    boolean n = c40Var.n(1024);
                    boolean n2 = c40Var.n(16);
                    boolean a = this.c.a.a(i2);
                    if (v != null) {
                        int i3 = v.b;
                        int i4 = (int) (d >> 32);
                        int i5 = (int) (d & 4294967295L);
                        int i6 = i2 & 33554431;
                        long[] jArr = (long[]) b10Var.c;
                        i = b10Var.b - 3;
                        while (true) {
                            if (i < 0) {
                                break;
                            }
                            if ((((int) jArr[i + 2]) & 33554431) == i3) {
                                long j3 = jArr[i];
                                int i7 = ((int) (j3 >> 32)) + i4;
                                int i8 = ((int) j3) + i5;
                                b10Var.q(i6, i7, i8, i7 + V, i8 + S, i3, n, n2, a, i);
                                break;
                            }
                            i -= 3;
                        }
                    } else {
                        int i9 = (int) (d >> 32);
                        int i10 = (int) (d & 4294967295L);
                        b10Var.q(i2, i9, i10, i9 + V, i10 + S, (r22 & 32) != 0 ? -1 : 0, n, n2, a, -1);
                    }
                } else if (v == null) {
                    int i11 = (int) (d >> 32);
                    int i12 = (int) (d & 4294967295L);
                    int i13 = V + i11;
                    int i14 = i12 + S;
                    int i15 = i2 & 33554431;
                    long[] jArr2 = (long[]) b10Var.c;
                    int i16 = b10Var.b;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= jArr2.length - 2 || i17 >= i16) {
                            break;
                        }
                        int i18 = i17 + 2;
                        long j4 = jArr2[i18];
                        if ((((int) j4) & 33554431) == i15) {
                            long j5 = jArr2[i17];
                            int i19 = i17;
                            jArr2[i19] = (i11 << 32) | (i12 & 4294967295L);
                            jArr2[i19 + 1] = (i13 << 32) | (i14 & 4294967295L);
                            jArr2[i18] = (((j4 >> 63) & 1) << 60) | j4;
                            int i20 = i11 - ((int) (j5 >> 32));
                            int i21 = i12 - ((int) j5);
                            if ((i20 != 0) | (i21 != 0)) {
                                b10Var.E(i20, i21, (pqf.b & j4) | (((i19 + 3) & 33554431) << 25));
                            }
                        } else {
                            i17 += 3;
                        }
                    }
                } else {
                    int i22 = v.b;
                    int i23 = (int) (d >> 32);
                    int i24 = (int) (d & 4294967295L);
                    int i25 = i2 & 33554431;
                    long[] jArr3 = (long[]) b10Var.c;
                    int i26 = b10Var.b;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= jArr3.length - 2 || i27 >= i26) {
                            break;
                        }
                        long j6 = j2;
                        if ((((int) jArr3[i27 + 2]) & 33554431) == i22) {
                            long j7 = jArr3[i27];
                            int i28 = ((int) (j7 >> 32)) + i23;
                            int i29 = ((int) j7) + i24;
                            int i30 = i28 + V;
                            int i31 = i29 + S;
                            i27 += 3;
                            while (i27 < jArr3.length - 2 && i27 < i26) {
                                int i32 = i27 + 2;
                                int i33 = i22;
                                int i34 = i23;
                                long j8 = jArr3[i32];
                                int i35 = i24;
                                if ((((int) j8) & 33554431) == i25) {
                                    long j9 = jArr3[i27];
                                    long[] jArr4 = jArr3;
                                    int i36 = i28 - ((int) (j9 >> 32));
                                    int i37 = i29 - ((int) j9);
                                    jArr4[i27] = (i29 & j6) | (i28 << 32);
                                    jArr4[i27 + 1] = (i30 << 32) | (i31 & j6);
                                    jArr4[i32] = j8 | (((j8 >> 63) & 1) << 60);
                                    if (i36 != 0 || i37 != 0) {
                                        b10Var.E(i36, i37, (j8 & pqf.b) | (((i27 + 3) & 33554431) << 25));
                                    }
                                } else {
                                    i27 += 3;
                                    i22 = i33;
                                    i23 = i34;
                                    i24 = i35;
                                }
                            }
                        }
                        i27 += 3;
                        jArr3 = jArr3;
                        j2 = j6;
                        i22 = i22;
                        i23 = i23;
                        i24 = i24;
                    }
                }
            }
            wmaVar.f = false;
            this.e = true;
            i();
        }
    }

    public final void g(wma wmaVar) {
        if (wmaVar.g) {
            int i = wmaVar.b & 33554431;
            b10 b10Var = this.b;
            long[] jArr = (long[]) b10Var.c;
            int i2 = b10Var.b;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = pqf.c;
                    break;
                }
                i3 += 3;
            }
            wmaVar.g = false;
            wmaVar.f = true;
            this.e = true;
            this.g = true;
        }
    }

    public final void i() {
        iy iyVar = this.h;
        boolean z = iyVar != null;
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            xy xyVar = this.a;
            if (iyVar != null) {
                xyVar.removeCallbacks(iyVar);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.i = max;
            iy iyVar2 = new iy(0, this.j);
            xyVar.postDelayed(iyVar2, max - currentTimeMillis);
            this.h = iyVar2;
        }
    }
}
