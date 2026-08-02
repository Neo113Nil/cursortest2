package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tmk implements pmk {
    public final tzc a;
    public final uzc b;
    public final int c;
    public final ig5 d;
    public int[] e = omk.a;
    public float[] f;
    public j80 g;
    public j80 h;
    public j80 i;
    public j80 j;
    public float[] k;
    public float[] l;
    public t9d m;

    public tmk(tzc tzcVar, uzc uzcVar, int i, ig5 ig5Var) {
        this.a = tzcVar;
        this.b = uzcVar;
        this.c = i;
        this.d = ig5Var;
        float[] fArr = omk.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = omk.c;
    }

    public final int a(int i) {
        int i2;
        tzc tzcVar = this.a;
        int i3 = tzcVar.b;
        int i4 = 0;
        if (i3 <= 0) {
            zzl.r("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = tzcVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float c(int i, int i2, boolean z) {
        ig5 ig5Var;
        float f;
        tzc tzcVar = this.a;
        if (i >= tzcVar.b - 1) {
            f = i2;
        } else {
            int c = tzcVar.c(i);
            int c2 = tzcVar.c(i + 1);
            if (i2 != c) {
                int i3 = c2 - c;
                smk smkVar = (smk) this.b.b(c);
                if (smkVar == null || (ig5Var = smkVar.b) == null) {
                    ig5Var = this.d;
                }
                float f2 = i3;
                float c3 = ig5Var.c((i2 - c) / f2);
                return z ? c3 : ((f2 * c3) + c) / 1000.0f;
            }
            f = c;
        }
        return f / 1000.0f;
    }

    public final void e(j80 j80Var, j80 j80Var2, j80 j80Var3) {
        float[] fArr;
        boolean z = this.m != omk.c;
        j80 j80Var4 = this.g;
        uzc uzcVar = this.b;
        tzc tzcVar = this.a;
        if (j80Var4 == null) {
            this.g = j80Var.c();
            this.h = j80Var3.c();
            int i = tzcVar.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = tzcVar.c(i2) / 1000.0f;
            }
            this.f = fArr2;
            int i3 = tzcVar.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.m != omk.c && Intrinsics.c(this.i, j80Var) && Intrinsics.c(this.j, j80Var2)) {
                return;
            }
            this.i = j80Var;
            this.j = j80Var2;
            int b = j80Var.b() + (j80Var.b() % 2);
            this.k = new float[b];
            this.l = new float[b];
            int i5 = tzcVar.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = tzcVar.c(i6);
                smk smkVar = (smk) uzcVar.b(c);
                if (c == 0 && smkVar == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = j80Var.a(i7);
                    }
                } else if (c == this.c && smkVar == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = j80Var2.a(i8);
                    }
                } else {
                    smkVar.getClass();
                    j80 j80Var5 = smkVar.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = j80Var5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.m = new t9d(this.e, this.f, fArr3);
        }
    }

    @Override // defpackage.pmk
    public final int l() {
        return 0;
    }

    @Override // defpackage.pmk
    public final int m() {
        return this.c;
    }

    @Override // defpackage.nmk
    public final j80 u(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        long j2 = j / 1000000;
        int[] iArr = omk.a;
        long j3 = this.c;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return j80Var3;
        }
        e(j80Var, j80Var2, j80Var3);
        j80 j80Var4 = this.h;
        j80Var4.getClass();
        int i = 0;
        if (this.m != omk.c) {
            int i2 = (int) j4;
            float c = c(a(i2), i2, false);
            float[] fArr = this.l;
            gg0[][] gg0VarArr = (gg0[][]) this.m.a;
            float f = gg0VarArr[0][0].a;
            float f2 = gg0VarArr[gg0VarArr.length - 1][0].b;
            if (c < f) {
                c = f;
            }
            if (c <= f2) {
                f2 = c;
            }
            int length = fArr.length;
            boolean z = false;
            for (gg0[] gg0VarArr2 : gg0VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    gg0 gg0Var = gg0VarArr2[i4];
                    if (f2 <= gg0Var.b) {
                        if (gg0Var.p) {
                            fArr[i3] = gg0Var.q;
                            fArr[i3 + 1] = gg0Var.r;
                        } else {
                            gg0Var.c(f2);
                            fArr[i3] = gg0Var.a();
                            fArr[i3 + 1] = gg0Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                j80Var4.e(fArr[i], i);
                i++;
            }
        } else {
            j80 z2 = z((j4 - 1) * 1000000, j80Var, j80Var2, j80Var3);
            j80 z3 = z(j4 * 1000000, j80Var, j80Var2, j80Var3);
            int b = z2.b();
            while (i < b) {
                j80Var4.e((z2.a(i) - z3.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return j80Var4;
    }

    @Override // defpackage.nmk
    public final j80 z(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        j80 j80Var4;
        j80 j80Var5;
        gg0[][] gg0VarArr;
        j80 j80Var6 = j80Var;
        long j2 = j / 1000000;
        int[] iArr = omk.a;
        int i = this.c;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        uzc uzcVar = this.b;
        smk smkVar = (smk) uzcVar.b(i2);
        if (smkVar != null) {
            return smkVar.a;
        }
        if (i2 >= i) {
            return j80Var2;
        }
        if (i2 <= 0) {
            return j80Var6;
        }
        e(j80Var6, j80Var2, j80Var3);
        j80 j80Var7 = this.g;
        j80Var7.getClass();
        int i3 = 0;
        if (this.m != omk.c) {
            float c = c(a(i2), i2, false);
            float[] fArr = this.k;
            gg0[][] gg0VarArr2 = (gg0[][]) this.m.a;
            int length = gg0VarArr2.length - 1;
            float f = gg0VarArr2[0][0].a;
            float f2 = gg0VarArr2[length][0].b;
            int length2 = fArr.length;
            if (c < f || c > f2) {
                if (c > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = c - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    gg0 gg0Var = gg0VarArr2[length][i5];
                    boolean z = gg0Var.p;
                    float f4 = gg0Var.r;
                    float f5 = gg0Var.q;
                    if (z) {
                        float f6 = gg0Var.a;
                        float f7 = gg0Var.k;
                        float f8 = gg0Var.c;
                        gg0VarArr = gg0VarArr2;
                        fArr[i4] = (f5 * f3) + me4.b(gg0Var.e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = gg0Var.d;
                        fArr[i4 + 1] = (f4 * f3) + me4.b(gg0Var.f, f10, f9, f10);
                    } else {
                        gg0VarArr = gg0VarArr2;
                        gg0Var.c(f);
                        fArr[i4] = (gg0Var.a() * f3) + (gg0Var.n * gg0Var.h) + f5;
                        fArr[i4 + 1] = (gg0Var.b() * f3) + (gg0Var.o * gg0Var.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    gg0VarArr2 = gg0VarArr;
                }
            } else {
                int length3 = gg0VarArr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        gg0 gg0Var2 = gg0VarArr2[i6][i8];
                        if (c <= gg0Var2.b) {
                            if (gg0Var2.p) {
                                float f11 = gg0Var2.a;
                                float f12 = gg0Var2.k;
                                float f13 = gg0Var2.c;
                                fArr[i7] = me4.b(gg0Var2.e, f13, (c - f11) * f12, f13);
                                float f14 = gg0Var2.d;
                                fArr[i7 + 1] = me4.b(gg0Var2.f, f14, (c - f11) * f12, f14);
                            } else {
                                gg0Var2.c(c);
                                fArr[i7] = (gg0Var2.n * gg0Var2.h) + gg0Var2.q;
                                fArr[i7 + 1] = (gg0Var2.o * gg0Var2.i) + gg0Var2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                j80Var7.e(fArr[i9], i9);
            }
        } else {
            int a = a(i2);
            float c2 = c(a, i2, true);
            tzc tzcVar = this.a;
            smk smkVar2 = (smk) uzcVar.b(tzcVar.c(a));
            if (smkVar2 != null && (j80Var5 = smkVar2.a) != null) {
                j80Var6 = j80Var5;
            }
            smk smkVar3 = (smk) uzcVar.b(tzcVar.c(a + 1));
            if (smkVar3 == null || (j80Var4 = smkVar3.a) == null) {
                j80Var4 = j80Var2;
            }
            int b = j80Var7.b();
            for (int i10 = 0; i10 < b; i10++) {
                j80Var7.e((j80Var4.a(i10) * c2) + ((1.0f - c2) * j80Var6.a(i10)), i10);
            }
        }
        return j80Var7;
    }
}
