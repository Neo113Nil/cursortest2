package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l7f extends fh0 {
    public rvh[] f;
    public rvh[] g;
    public int h;
    public k1d i;

    @Override // defpackage.fh0
    public final rvh d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            rvh[] rvhVarArr = this.f;
            rvh rvhVar = rvhVarArr[i2];
            if (!zArr[rvhVar.b]) {
                k1d k1dVar = this.i;
                k1dVar.b = rvhVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((rvh) k1dVar.b).h[i3];
                        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    rvh rvhVar2 = rvhVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = rvhVar2.h[i3];
                            float f3 = ((rvh) k1dVar.b).h[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.fh0
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.fh0
    public final void i(h8b h8bVar, fh0 fh0Var, boolean z) {
        rvh rvhVar = fh0Var.a;
        if (rvhVar == null) {
            return;
        }
        float[] fArr = rvhVar.h;
        wg0 wg0Var = fh0Var.d;
        int d = wg0Var.d();
        for (int i = 0; i < d; i++) {
            rvh e = wg0Var.e(i);
            float f = wg0Var.f(i);
            k1d k1dVar = this.i;
            k1dVar.b = e;
            if (e.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((rvh) k1dVar.b).h;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((rvh) k1dVar.b).h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((l7f) k1dVar.c).k((rvh) k1dVar.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((rvh) k1dVar.b).h[i3] = f4;
                    } else {
                        ((rvh) k1dVar.b).h[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (fh0Var.b * f) + this.b;
        }
        k(rvhVar);
    }

    public final void j(rvh rvhVar) {
        int i;
        rvh[] rvhVarArr;
        int i2 = this.h + 1;
        rvh[] rvhVarArr2 = this.f;
        if (i2 > rvhVarArr2.length) {
            rvh[] rvhVarArr3 = (rvh[]) Arrays.copyOf(rvhVarArr2, rvhVarArr2.length * 2);
            this.f = rvhVarArr3;
            this.g = (rvh[]) Arrays.copyOf(rvhVarArr3, rvhVarArr3.length * 2);
        }
        rvh[] rvhVarArr4 = this.f;
        int i3 = this.h;
        rvhVarArr4[i3] = rvhVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && rvhVarArr4[i3].b > rvhVar.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                rvhVarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                rvhVarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(rvhVarArr, 0, i, new wpb(24));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        rvhVar.a = true;
        rvhVar.a(this);
    }

    public final void k(rvh rvhVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == rvhVar) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        rvhVar.a = false;
                        return;
                    } else {
                        rvh[] rvhVarArr = this.f;
                        int i3 = i + 1;
                        rvhVarArr[i] = rvhVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.fh0
    public final String toString() {
        k1d k1dVar = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            k1dVar.b = this.f[i];
            str = str + k1dVar + " ";
        }
        return str;
    }
}
