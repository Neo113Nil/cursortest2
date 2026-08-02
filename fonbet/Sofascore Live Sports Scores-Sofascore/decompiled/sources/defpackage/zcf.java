package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zcf implements jpg {
    public final int a;
    public final /* synthetic */ ddf b;

    public zcf(ddf ddfVar, int i) {
        this.b = ddfVar;
        this.a = i;
    }

    @Override // defpackage.jpg
    public final int e(fp4 fp4Var, im4 im4Var, int i) {
        ddf ddfVar = this.b;
        if (ddfVar.u()) {
            return -3;
        }
        int i2 = this.a;
        ddfVar.o(i2);
        int E = ddfVar.v[i2].E(fp4Var, im4Var, i, ddfVar.Q);
        if (E == -3) {
            ddfVar.p(i2);
        }
        return E;
    }

    @Override // defpackage.jpg
    public final boolean isReady() {
        ddf ddfVar = this.b;
        return !ddfVar.u() && ddfVar.v[this.a].z(ddfVar.Q);
    }

    @Override // defpackage.jpg
    public final void maybeThrowError() {
        int i = this.a;
        ddf ddfVar = this.b;
        ddfVar.v[i].B();
        x6k x6kVar = ddfVar.m;
        int n = ddfVar.d.n(ddfVar.F);
        IOException iOException = (IOException) x6kVar.d;
        if (iOException != null) {
            throw iOException;
        }
        xfb xfbVar = (xfb) x6kVar.c;
        if (xfbVar != null) {
            if (n == Integer.MIN_VALUE) {
                n = xfbVar.a;
            }
            IOException iOException2 = xfbVar.e;
            if (iOException2 != null && xfbVar.f > n) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.jpg
    public final int skipData(long j) {
        ddf ddfVar = this.b;
        if (ddfVar.u()) {
            return 0;
        }
        int i = this.a;
        ddfVar.o(i);
        hpg hpgVar = ddfVar.v[i];
        int w = hpgVar.w(j, ddfVar.Q);
        hpgVar.J(w);
        if (w == 0) {
            ddfVar.p(i);
        }
        return w;
    }
}
