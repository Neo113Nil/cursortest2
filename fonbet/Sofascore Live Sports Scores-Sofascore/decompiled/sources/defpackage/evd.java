package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class evd extends jca {
    public int d;
    public int f;
    public int h;
    public cvd[] c = new cvd[16];
    public int[] e = new int[16];
    public Object[] g = new Object[16];

    public final void i0() {
        this.d = 0;
        this.f = 0;
        Arrays.fill(this.g, 0, this.h, (Object) null);
        this.h = 0;
    }

    public final void j0(qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        if (this.d != 0) {
            zz0 zz0Var = new zz0(this);
            evd evdVar = (evd) zz0Var.e;
            while (true) {
                cvd cvdVar = evdVar.c[zz0Var.b];
                vu8 b = cvdVar.b(zz0Var);
                qf0 qf0Var2 = qf0Var;
                mlh mlhVar2 = mlhVar;
                qn2 qn2Var2 = qn2Var;
                dvd dvdVar2 = dvdVar;
                try {
                    cvdVar.a(zz0Var, qf0Var2, mlhVar2, qn2Var2, dvdVar2);
                    int i = zz0Var.b;
                    int i2 = evdVar.d;
                    if (i < i2) {
                        cvd cvdVar2 = evdVar.c[i];
                        zz0Var.c += cvdVar2.a;
                        zz0Var.d += cvdVar2.b;
                        int i3 = i + 1;
                        zz0Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        qf0Var = qf0Var2;
                        mlhVar = mlhVar2;
                        qn2Var = qn2Var2;
                        dvdVar = dvdVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        i0();
    }

    public final boolean k0() {
        return this.d == 0;
    }

    public final void l0(cvd cvdVar) {
        int i = this.d;
        cvd[] cvdVarArr = this.c;
        if (i == cvdVarArr.length) {
            cvd[] cvdVarArr2 = new cvd[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(cvdVarArr, 0, cvdVarArr2, 0, i);
            this.c = cvdVarArr2;
        }
        int i2 = this.f;
        int i3 = cvdVar.a;
        int i4 = cvdVar.b;
        int i5 = i2 + i3;
        int[] iArr = this.e;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            mh0.e(0, 0, iArr, iArr2, length);
            this.e = iArr2;
        }
        int i7 = this.h + i4;
        Object[] objArr = this.g;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.g = objArr2;
        }
        cvd[] cvdVarArr3 = this.c;
        int i9 = this.d;
        this.d = i9 + 1;
        cvdVarArr3[i9] = cvdVar;
        this.f += cvdVar.a;
        this.h += i4;
    }
}
