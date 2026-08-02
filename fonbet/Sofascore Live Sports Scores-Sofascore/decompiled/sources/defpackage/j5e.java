package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j5e {
    public final yia a;
    public final uzc b;
    public final vzc c;
    public final szc d;
    public final uzc e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final era n;
    public final sx2 o;

    public j5e(yia yiaVar, era eraVar, jt7 jt7Var) {
        this.a = yiaVar;
        uzc uzcVar = q6a.a;
        this.b = new uzc();
        this.c = new vzc();
        int i = j6a.a;
        this.d = new szc();
        this.e = new uzc();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = eraVar;
        this.o = new sx2(jt7Var);
    }

    public final int a(sx2 sx2Var, int i, boolean z) {
        List list;
        List list2;
        uzc uzcVar = this.e;
        if (uzcVar.a(i)) {
            Object b = uzcVar.b(i);
            b.getClass();
            return ((qf2) b).b;
        }
        uzc uzcVar2 = this.b;
        int i2 = 0;
        if (uzcVar2.a(i)) {
            if (!z || (list2 = (List) uzcVar2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((dra) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        if2 if2Var = new if2(this, sx2Var, i2);
        long j = sx2Var.A().u;
        era eraVar = (era) sx2Var.c;
        if (eraVar == null) {
            Intrinsics.i("state");
            throw null;
        }
        uzcVar2.i(i, a.c(eraVar.a(i, j, true, new ord(8, if2Var, sx2Var))));
        if (!z || (list = (List) uzcVar2.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((dra) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    public final void c(sx2 sx2Var, int i, int i2) {
        int i3;
        int i4;
        uzc uzcVar = this.e;
        qf2 qf2Var = (qf2) uzcVar.b(i);
        k03 k03Var = qf2.c;
        if (qf2Var != null) {
            qf2Var.b = i2;
            qf2Var.a = k03Var;
        } else {
            qf2Var = new qf2();
            qf2Var.a = k03Var;
            qf2Var.b = i2;
        }
        uzcVar.i(i, qf2Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        int i5 = 1;
        if (Math.signum(this.f) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.m) {
            if2 if2Var = new if2(this, sx2Var, i5);
            long j = sx2Var.A().u;
            era eraVar = (era) sx2Var.c;
            if (eraVar == null) {
                Intrinsics.i("state");
                throw null;
            }
            this.b.i(i4, a.c(eraVar.a(i4, j, true, new ord(8, if2Var, sx2Var))));
        }
        h();
    }

    public final void d(sx2 sx2Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int b = wzb.b(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (b > i8) {
                    b = i8;
                }
                this.j = b;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int a = a(sx2Var, this.h - 1, i6 + (-1) == i + (-1) && ((f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (a == -1) {
                    return;
                }
                this.h--;
                this.j -= a;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int b2 = wzb.b(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (b2 > i9) {
                b2 = i9;
            }
            this.k = b2;
        }
        while (this.k > 0 && (i7 = this.i) != -1 && i7 < this.m - 1) {
            int a2 = a(sx2Var, this.i + 1, i7 + 1 == i2 + 1 && ((f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (a2 == -1) {
                return;
            }
            this.i++;
            this.k -= a2;
        }
    }

    public final void e(float f, r5e r5eVar) {
        j5e j5eVar;
        boolean z;
        int i;
        int i2;
        int i3;
        sx2 sx2Var = this.o;
        sx2Var.b = r5eVar;
        sx2Var.c = this.n;
        float f2 = -f;
        h();
        if (sx2Var.w()) {
            o6a.E(sx2Var.A());
            sx2Var.A();
            this.m = sx2Var.E();
            int v = sx2Var.v();
            int y = sx2Var.y();
            int E = sx2Var.E();
            int C = sx2Var.C();
            int B = sx2Var.B();
            uzc uzcVar = this.e;
            if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.j = 0 - C;
                this.h = v;
                while (this.j > 0 && (i3 = this.h) > 0 && uzcVar.a(i3 - 1)) {
                    Object b = uzcVar.b(this.h - 1);
                    b.getClass();
                    this.h--;
                    this.j -= ((qf2) b).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - B;
                this.i = y;
                while (this.k > 0 && (i2 = this.i) < E - 1 && uzcVar.a(i2 + 1)) {
                    Object b2 = uzcVar.b(this.i + 1);
                    b2.getClass();
                    int i4 = ((qf2) b2).b;
                    this.i++;
                    this.k -= i4;
                }
                f(this.i + 1, E - 1);
            }
        }
        if (sx2Var.w()) {
            o6a.E(sx2Var.A());
            if (sx2Var.A().t != null) {
                i = ((a6e) this.a.b).o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            j5eVar = this;
            j5eVar.d(sx2Var, sx2Var.v(), sx2Var.y(), i, sx2Var.B(), sx2Var.C(), f2, f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? true : z);
        } else {
            j5eVar = this;
        }
        j5eVar.f = f2;
        j5eVar.h();
    }

    public final void f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i3;
        char c3;
        int i4;
        vzc vzcVar = this.c;
        vzcVar.b();
        uzc uzcVar = this.b;
        int[] iArr3 = uzcVar.b;
        long[] jArr3 = uzcVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr3[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr3[(i5 << 3) + i7]) && i4 <= i2) {
                            vzcVar.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        szc szcVar = this.d;
        int[] iArr4 = szcVar.b;
        long[] jArr4 = szcVar.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr4[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr4[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                vzcVar.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        uzc uzcVar2 = this.e;
        int[] iArr5 = uzcVar2.b;
        long[] jArr5 = uzcVar2.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr5[i12];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr5[(i12 << 3) + i14]) && i3 <= i2) {
                            vzcVar.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length3) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        int[] iArr6 = vzcVar.b;
        long[] jArr6 = vzcVar.a;
        int length4 = jArr6.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr6[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr6[(i15 << 3) + i17];
                        List list = (List) uzcVar.g(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((dra) list.get(i19)).cancel();
                            }
                        }
                        int c4 = szcVar.c(i18);
                        if (c4 >= 0) {
                            szcVar.e--;
                            long[] jArr7 = szcVar.a;
                            int i20 = szcVar.d;
                            int i21 = c4 >> 3;
                            int i22 = (c4 & 7) << 3;
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                            long j8 = (jArr7[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr7[i21] = j8;
                            jArr7[(((c4 - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        } else {
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                        }
                        uzcVar2.g(i18);
                    } else {
                        iArr2 = iArr6;
                        jArr2 = jArr6;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr6 = iArr2;
                    jArr6 = jArr2;
                }
                iArr = iArr6;
                jArr = jArr6;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr6;
                jArr = jArr6;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr6 = iArr;
            jArr6 = jArr;
        }
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        uzc uzcVar = this.b;
        long[] jArr = uzcVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = uzcVar.b[i4];
                        List list = (List) uzcVar.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((dra) list.get(i6)).cancel();
                        }
                        uzcVar.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void h() {
        eq3.a0(this.j, "prefetchWindowStartExtraSpace");
        eq3.a0(this.k, "prefetchWindowEndExtraSpace");
        eq3.a0(this.h, "prefetchWindowStartIndex");
        eq3.a0(this.i, "prefetchWindowEndIndex");
    }
}
