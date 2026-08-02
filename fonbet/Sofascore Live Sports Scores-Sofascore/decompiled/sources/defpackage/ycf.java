package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ycf implements ipg {
    public final int a;
    public final /* synthetic */ cdf b;

    public ycf(cdf cdfVar, int i) {
        this.b = cdfVar;
        this.a = i;
    }

    @Override // defpackage.ipg
    public final int a(fp4 fp4Var, hm4 hm4Var, int i) {
        int i2;
        cdf cdfVar = this.b;
        int i3 = this.a;
        if (cdfVar.r()) {
            return -3;
        }
        cdfVar.n(i3);
        gpg gpgVar = cdfVar.r[i3];
        boolean z = cdfVar.J;
        gpgVar.getClass();
        boolean z2 = (i & 2) != 0;
        bm2 bm2Var = gpgVar.b;
        synchronized (gpgVar) {
            try {
                hm4Var.i = false;
                int i4 = gpgVar.s;
                i2 = -5;
                if (i4 != gpgVar.p) {
                    sm8 sm8Var = ((dpg) gpgVar.c.k(gpgVar.q + i4)).a;
                    if (!z2 && sm8Var == gpgVar.g) {
                        int h = gpgVar.h(gpgVar.s);
                        if (gpgVar.j(h)) {
                            hm4Var.b = gpgVar.m[h];
                            long j = gpgVar.n[h];
                            hm4Var.j = j;
                            if (j < gpgVar.t) {
                                hm4Var.b(Integer.MIN_VALUE);
                            }
                            bm2Var.c = gpgVar.l[h];
                            bm2Var.b = gpgVar.k[h];
                            bm2Var.d = gpgVar.o[h];
                            i2 = -4;
                        } else {
                            hm4Var.i = true;
                            i2 = -3;
                        }
                    }
                    gpgVar.k(sm8Var, fp4Var);
                } else {
                    if (!z && !gpgVar.w) {
                        sm8 sm8Var2 = gpgVar.z;
                        if (sm8Var2 == null || (!z2 && sm8Var2 == gpgVar.g)) {
                            i2 = -3;
                        }
                        gpgVar.k(sm8Var2, fp4Var);
                    }
                    hm4Var.b = 4;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !hm4Var.i(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                ei3 ei3Var = gpgVar.a;
                bm2 bm2Var2 = gpgVar.b;
                c78 c78Var = (c78) ei3Var.e;
                if (z3) {
                    ei3.g(c78Var, hm4Var, bm2Var2, (nkk) ei3Var.c);
                } else {
                    ei3Var.e = ei3.g(c78Var, hm4Var, bm2Var2, (nkk) ei3Var.c);
                }
            }
            if (!z3) {
                gpgVar.s++;
            }
        }
        if (i2 == -3) {
            cdfVar.o(i3);
        }
        return i2;
    }

    @Override // defpackage.ipg
    public final boolean isReady() {
        cdf cdfVar = this.b;
        return !cdfVar.r() && cdfVar.r[this.a].i(cdfVar.J);
    }

    @Override // defpackage.ipg
    public final void maybeThrowError() {
        int i = this.a;
        cdf cdfVar = this.b;
        gpg gpgVar = cdfVar.r[i];
        hpo hpoVar = gpgVar.h;
        if (hpoVar != null && hpoVar.x() == 1) {
            vb5 v = gpgVar.h.v();
            v.getClass();
            throw v;
        }
        sx2 sx2Var = cdfVar.j;
        int o = cdfVar.d.o(cdfVar.A);
        IOException iOException = (IOException) sx2Var.c;
        if (iOException != null) {
            throw iOException;
        }
        wfb wfbVar = (wfb) sx2Var.b;
        if (wfbVar != null) {
            if (o == Integer.MIN_VALUE) {
                o = wfbVar.a;
            }
            IOException iOException2 = wfbVar.d;
            if (iOException2 != null && wfbVar.e > o) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.ipg
    public final int skipData(long j) {
        int i;
        cdf cdfVar = this.b;
        int i2 = this.a;
        boolean z = false;
        if (cdfVar.r()) {
            return 0;
        }
        cdfVar.n(i2);
        gpg gpgVar = cdfVar.r[i2];
        boolean z2 = cdfVar.J;
        synchronized (gpgVar) {
            int h = gpgVar.h(gpgVar.s);
            int i3 = gpgVar.s;
            int i4 = gpgVar.p;
            if ((i3 != i4) && j >= gpgVar.n[h]) {
                if (j <= gpgVar.v || !z2) {
                    i = gpgVar.g(h, i4 - i3, j, true);
                    if (i == -1) {
                        i = 0;
                    }
                } else {
                    i = i4 - i3;
                }
            }
            i = 0;
        }
        synchronized (gpgVar) {
            if (i >= 0) {
                try {
                    if (gpgVar.s + i <= gpgVar.p) {
                        z = true;
                    }
                } finally {
                }
            }
            qx9.r(z);
            gpgVar.s += i;
        }
        if (i == 0) {
            cdfVar.o(i2);
        }
        return i;
    }
}
