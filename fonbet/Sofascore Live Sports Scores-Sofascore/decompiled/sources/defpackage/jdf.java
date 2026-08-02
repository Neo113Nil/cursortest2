package defpackage;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jdf extends b51 {
    public final oe4 h;
    public final kr9 i;
    public final kc5 j;
    public final it7 k;
    public final b l;
    public boolean m = true;
    public long n = C.TIME_UNSET;
    public boolean o;
    public boolean p;
    public boolean q;
    public tn4 r;
    public h6c s;

    public jdf(h6c h6cVar, oe4 oe4Var, kr9 kr9Var, kc5 kc5Var, it7 it7Var, b bVar) {
        this.s = h6cVar;
        this.h = oe4Var;
        this.i = kr9Var;
        this.j = kc5Var;
        this.k = it7Var;
        this.l = bVar;
    }

    @Override // defpackage.vcc
    public final synchronized h6c a() {
        return this.s;
    }

    @Override // defpackage.vcc
    public final synchronized void b(h6c h6cVar) {
        this.s = h6cVar;
    }

    @Override // defpackage.vcc
    public final w6c c(scc sccVar, l2a l2aVar, long j) {
        re4 createDataSource = this.h.createDataSource();
        tn4 tn4Var = this.r;
        if (tn4Var != null) {
            createDataSource.f(tn4Var);
        }
        v5c v5cVar = a().b;
        v5cVar.getClass();
        Uri uri = v5cVar.a;
        this.g.getClass();
        return new ddf(uri, createDataSource, new hcc((ql6) this.i.b), this.j, new cc5(this.d.c, 0, sccVar), this.k, g(sccVar), this, l2aVar, v5cVar.f, this.l, nik.T(v5cVar.h), null);
    }

    @Override // defpackage.vcc
    public final void f(w6c w6cVar) {
        ddf ddfVar = (ddf) w6cVar;
        if (ddfVar.y) {
            for (hpg hpgVar : ddfVar.v) {
                hpgVar.k();
                xb5 xb5Var = hpgVar.h;
                if (xb5Var != null) {
                    xb5Var.d(hpgVar.e);
                    hpgVar.h = null;
                    hpgVar.g = null;
                }
            }
        }
        ddfVar.m.x(ddfVar);
        ddfVar.r.removeCallbacksAndMessages(null);
        ddfVar.s = null;
        ddfVar.R = true;
    }

    @Override // defpackage.b51
    public final void m(tn4 tn4Var) {
        this.r = tn4Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        cse cseVar = this.g;
        cseVar.getClass();
        kc5 kc5Var = this.j;
        kc5Var.c(myLooper, cseVar);
        kc5Var.a();
        s();
    }

    @Override // defpackage.b51
    public final void p() {
        this.j.release();
    }

    public final void s() {
        long j = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        h6c a = a();
        mij dihVar = new dih(C.TIME_UNSET, C.TIME_UNSET, j, j, 0L, 0L, z, false, false, null, a, z2 ? a.c : null);
        if (this.m) {
            dihVar = new fdf(dihVar);
        }
        n(dihVar);
    }

    public final void t(long j, b0h b0hVar, boolean z) {
        if (this.q && b0hVar.b()) {
            return;
        }
        this.q = !b0hVar.b();
        if (j == C.TIME_UNSET) {
            j = this.n;
        }
        boolean isSeekable = b0hVar.isSeekable();
        if (!this.m && this.n == j && this.o == isSeekable && this.p == z) {
            return;
        }
        this.n = j;
        this.o = isSeekable;
        this.p = z;
        this.m = false;
        s();
    }

    @Override // defpackage.vcc
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
