package defpackage;

import android.net.Uri;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class idf extends a51 {
    public final f6c h;
    public final x5c i;
    public final ne4 j;
    public final kr9 k;
    public final jc5 l;
    public final k03 m;
    public boolean n;
    public long o;
    public boolean p;
    public boolean q;
    public sn4 r;

    public idf(f6c f6cVar, ne4 ne4Var, kr9 kr9Var, jc5 jc5Var, k03 k03Var) {
        x5c x5cVar = f6cVar.b;
        x5cVar.getClass();
        this.i = x5cVar;
        this.h = f6cVar;
        this.j = ne4Var;
        this.k = kr9Var;
        this.l = jc5Var;
        this.m = k03Var;
        this.n = true;
        this.o = C.TIME_UNSET;
    }

    @Override // defpackage.a51
    public final v6c a(rcc rccVar, zz0 zz0Var, long j) {
        qe4 createDataSource = this.j.createDataSource();
        sn4 sn4Var = this.r;
        if (sn4Var != null) {
            createDataSource.c(sn4Var);
        }
        Uri uri = this.i.a;
        qx9.u(this.g);
        int i = 0;
        return new cdf(uri, createDataSource, new l2a((gp4) this.k.b), this.l, new bc5(this.d.c, i, rccVar), this.m, new bc5(this.c.c, i, rccVar), this, zz0Var);
    }

    @Override // defpackage.a51
    public final f6c g() {
        return this.h;
    }

    @Override // defpackage.a51
    public final void k(sn4 sn4Var) {
        this.r = sn4Var;
        Looper.myLooper().getClass();
        qx9.u(this.g);
        r();
    }

    @Override // defpackage.a51
    public final void m(v6c v6cVar) {
        cdf cdfVar = (cdf) v6cVar;
        if (cdfVar.u) {
            for (gpg gpgVar : cdfVar.r) {
                gpgVar.f();
                hpo hpoVar = gpgVar.h;
                if (hpoVar != null) {
                    hpoVar.D(gpgVar.e);
                    gpgVar.h = null;
                    gpgVar.g = null;
                }
            }
        }
        sx2 sx2Var = cdfVar.j;
        ExecutorService executorService = (ExecutorService) sx2Var.a;
        wfb wfbVar = (wfb) sx2Var.b;
        if (wfbVar != null) {
            wfbVar.a(true);
        }
        executorService.execute(new b8(cdfVar, 22));
        executorService.shutdown();
        cdfVar.o.removeCallbacksAndMessages(null);
        cdfVar.p = null;
        cdfVar.K = true;
    }

    public final void r() {
        lij cihVar = new cih(this.o, this.p, this.q, this.h);
        if (this.n) {
            cihVar = new edf(cihVar);
        }
        l(cihVar);
    }

    public final void s(long j, boolean z, boolean z2) {
        if (j == C.TIME_UNSET) {
            j = this.o;
        }
        if (!this.n && this.o == j && this.p == z && this.q == z2) {
            return;
        }
        this.o = j;
        this.p = z;
        this.q = z2;
        this.n = false;
        r();
    }

    @Override // defpackage.a51
    public final void i() {
    }

    @Override // defpackage.a51
    public final void o() {
    }
}
