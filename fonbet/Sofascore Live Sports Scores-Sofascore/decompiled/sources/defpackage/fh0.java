package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class fh0 {
    public final wg0 d;
    public rvh a = null;
    public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public fh0(ejg ejgVar) {
        this.d = new wg0(this, ejgVar);
    }

    public final void a(h8b h8bVar, int i) {
        rvh j = h8bVar.j(i);
        wg0 wg0Var = this.d;
        wg0Var.g(j, 1.0f);
        wg0Var.g(h8bVar.j(i), -1.0f);
    }

    public final void b(rvh rvhVar, rvh rvhVar2, rvh rvhVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        wg0 wg0Var = this.d;
        if (z) {
            wg0Var.g(rvhVar, 1.0f);
            wg0Var.g(rvhVar2, -1.0f);
            wg0Var.g(rvhVar3, -1.0f);
        } else {
            wg0Var.g(rvhVar, -1.0f);
            wg0Var.g(rvhVar2, 1.0f);
            wg0Var.g(rvhVar3, 1.0f);
        }
    }

    public final void c(rvh rvhVar, rvh rvhVar2, rvh rvhVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        wg0 wg0Var = this.d;
        if (z) {
            wg0Var.g(rvhVar, 1.0f);
            wg0Var.g(rvhVar2, -1.0f);
            wg0Var.g(rvhVar3, 1.0f);
        } else {
            wg0Var.g(rvhVar, -1.0f);
            wg0Var.g(rvhVar2, 1.0f);
            wg0Var.g(rvhVar3, -1.0f);
        }
    }

    public rvh d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.d.d() == 0;
    }

    public final rvh f(boolean[] zArr, rvh rvhVar) {
        int i;
        wg0 wg0Var = this.d;
        int d = wg0Var.d();
        rvh rvhVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = wg0Var.f(i2);
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                rvh e = wg0Var.e(i2);
                if ((zArr == null || !zArr[e.b]) && e != rvhVar && (((i = e.l) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    rvhVar2 = e;
                }
            }
        }
        return rvhVar2;
    }

    public final void g(rvh rvhVar) {
        rvh rvhVar2 = this.a;
        wg0 wg0Var = this.d;
        if (rvhVar2 != null) {
            wg0Var.g(rvhVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float h = wg0Var.h(rvhVar, true) * (-1.0f);
        this.a = rvhVar;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = wg0Var.h;
        for (int i2 = 0; i != -1 && i2 < wg0Var.a; i2++) {
            float[] fArr = wg0Var.g;
            fArr[i] = fArr[i] / h;
            i = wg0Var.f[i];
        }
    }

    public final void h(h8b h8bVar, rvh rvhVar, boolean z) {
        if (rvhVar.f) {
            wg0 wg0Var = this.d;
            float c = wg0Var.c(rvhVar);
            this.b = (rvhVar.e * c) + this.b;
            wg0Var.h(rvhVar, z);
            if (z) {
                rvhVar.b(this);
            }
            if (wg0Var.d() == 0) {
                this.e = true;
                h8bVar.b = true;
            }
        }
    }

    public void i(h8b h8bVar, fh0 fh0Var, boolean z) {
        wg0 wg0Var = this.d;
        wg0Var.getClass();
        float c = wg0Var.c(fh0Var.a);
        wg0Var.h(fh0Var.a, z);
        wg0 wg0Var2 = fh0Var.d;
        int d = wg0Var2.d();
        for (int i = 0; i < d; i++) {
            rvh e = wg0Var2.e(i);
            wg0Var.a(e, wg0Var2.c(e) * c, z);
        }
        this.b = (fh0Var.b * c) + this.b;
        if (z) {
            fh0Var.a.b(this);
        }
        if (this.a == null || wg0Var.d() != 0) {
            return;
        }
        this.e = true;
        h8bVar.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String concat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            concat = concat + this.b;
            z = true;
        } else {
            z = false;
        }
        wg0 wg0Var = this.d;
        int d = wg0Var.d();
        for (int i = 0; i < d; i++) {
            rvh e = wg0Var.e(i);
            if (e != null) {
                float f = wg0Var.f(i);
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    String rvhVar = e.toString();
                    if (!z) {
                        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            concat = concat.concat("- ");
                            f *= -1.0f;
                        }
                        concat = f == 1.0f ? concat.concat(rvhVar) : concat + f + " " + rvhVar;
                        z = true;
                    } else if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        concat = concat.concat(" + ");
                        if (f == 1.0f) {
                        }
                        z = true;
                    } else {
                        concat = concat.concat(" - ");
                        f *= -1.0f;
                        if (f == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? concat.concat("0.0") : concat;
    }
}
