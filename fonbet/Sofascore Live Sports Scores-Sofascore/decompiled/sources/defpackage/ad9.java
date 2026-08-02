package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ad9 extends b51 {
    public final pp4 h;
    public final dad i;
    public final tnf j;
    public final kc5 k;
    public final it7 l;
    public final boolean m;
    public final int n;
    public final tp4 o;
    public final long p;
    public u5c q;
    public tn4 r;
    public h6c s;

    static {
        i6c.a("media3.exoplayer.hls");
    }

    public ad9(h6c h6cVar, dad dadVar, pp4 pp4Var, tnf tnfVar, kc5 kc5Var, it7 it7Var, tp4 tp4Var, long j, boolean z, int i) {
        this.s = h6cVar;
        this.q = h6cVar.c;
        this.i = dadVar;
        this.h = pp4Var;
        this.j = tnfVar;
        this.k = kc5Var;
        this.l = it7Var;
        this.o = tp4Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static uc9 s(long j, List list) {
        uc9 uc9Var = null;
        for (int i = 0; i < list.size(); i++) {
            uc9 uc9Var2 = (uc9) list.get(i);
            long j2 = uc9Var2.e;
            if (j2 > j || !uc9Var2.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                uc9Var = uc9Var2;
            }
        }
        return uc9Var;
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
        b10 g = g(sccVar);
        cc5 cc5Var = new cc5(this.d.c, 0, sccVar);
        tn4 tn4Var = this.r;
        cse cseVar = this.g;
        cseVar.getClass();
        return new qc9(this.h, this.o, this.i, tn4Var, this.k, cc5Var, this.l, g, l2aVar, this.j, this.m, this.n, cseVar);
    }

    @Override // defpackage.vcc
    public final void f(w6c w6cVar) {
        qc9 qc9Var = (qc9) w6cVar;
        qc9Var.b.e.remove(qc9Var);
        for (pd9 pd9Var : qc9Var.t) {
            if (pd9Var.D) {
                for (od9 od9Var : pd9Var.v) {
                    od9Var.k();
                    xb5 xb5Var = od9Var.h;
                    if (xb5Var != null) {
                        xb5Var.d(od9Var.e);
                        od9Var.h = null;
                        od9Var.g = null;
                    }
                }
            }
            oc9 oc9Var = pd9Var.d;
            int selectedIndexInTrackGroup = oc9Var.r.getSelectedIndexInTrackGroup();
            tp4 tp4Var = oc9Var.g;
            Uri c = oc9Var.e[selectedIndexInTrackGroup].c();
            sp4 sp4Var = (sp4) tp4Var.d.get(c);
            if (sp4Var != null) {
                rp4 rp4Var = (rp4) wv8.g(sp4Var.b, c, c);
                rp4Var.getClass();
                rp4Var.l = false;
            }
            oc9Var.n = null;
            pd9Var.j.x(pd9Var);
            pd9Var.r.removeCallbacksAndMessages(null);
            pd9Var.H = true;
            pd9Var.s.clear();
        }
        qc9Var.q = null;
    }

    @Override // defpackage.b51
    public final void m(tn4 tn4Var) {
        this.r = tn4Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        cse cseVar = this.g;
        cseVar.getClass();
        kc5 kc5Var = this.k;
        kc5Var.c(myLooper, cseVar);
        kc5Var.a();
        b10 g = g(null);
        v5c v5cVar = a().b;
        v5cVar.getClass();
        Uri uri = v5cVar.a;
        Handler q = nik.q(null);
        tp4 tp4Var = this.o;
        tp4Var.h = q;
        tp4Var.f = g;
        tp4Var.i = this;
        Map map = Collections.EMPTY_MAP;
        z1a.y(uri, "The uri must be set.");
        x9e x9eVar = new x9e(((oe4) tp4Var.a.b).createDataSource(), new xe4(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, tp4Var.b.c());
        z1a.E(tp4Var.g == null);
        x6k x6kVar = new x6k("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        tp4Var.g = x6kVar;
        x6kVar.y(x9eVar, tp4Var, tp4Var.c.n(x9eVar.c));
    }

    @Override // defpackage.vcc
    public final void maybeThrowSourceInfoRefreshError() {
        tp4 tp4Var = this.o;
        x6k x6kVar = tp4Var.g;
        if (x6kVar != null) {
            x6kVar.maybeThrowError();
        }
        s9e s9eVar = tp4Var.k;
        if (s9eVar != null) {
            throw s9eVar;
        }
        Uri uri = tp4Var.p;
        if (uri != null) {
            tp4Var.j(uri);
        }
    }

    @Override // defpackage.b51
    public final void p() {
        tp4 tp4Var = this.o;
        tp4Var.p = null;
        tp4Var.q = null;
        tp4Var.j = null;
        tp4Var.l = null;
        tp4Var.m = null;
        tp4Var.n = null;
        tp4Var.o = null;
        tp4Var.k = null;
        tp4Var.s = C.TIME_UNSET;
        tp4Var.g.x(null);
        tp4Var.g = null;
        HashMap hashMap = tp4Var.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((sp4) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((rp4) it2.next()).c.x(null);
            }
        }
        tp4Var.h.removeCallbacksAndMessages(null);
        tp4Var.h = null;
        hashMap.clear();
        this.k.release();
    }

    public final void t(zc9 zc9Var) {
        long j;
        dih dihVar;
        long j2;
        long j3;
        long j4;
        boolean z = zc9Var.p;
        boolean z2 = zc9Var.g;
        hv9 hv9Var = zc9Var.r;
        long j5 = zc9Var.u;
        long j6 = zc9Var.e;
        int i = zc9Var.d;
        long j7 = zc9Var.h;
        long h0 = z ? nik.h0(j7) : C.TIME_UNSET;
        long j8 = (i == 2 || i == 1) ? h0 : C.TIME_UNSET;
        tp4 tp4Var = this.o;
        tp4Var.j.getClass();
        wxf wxfVar = new wxf(25);
        if (tp4Var.r) {
            yc9 yc9Var = zc9Var.v;
            long j9 = yc9Var.c;
            long j10 = yc9Var.d;
            long j11 = j7 - tp4Var.s;
            boolean z3 = zc9Var.o;
            long j12 = z3 ? j11 + j5 : -9223372036854775807L;
            long T = zc9Var.p ? nik.T(nik.D(this.p)) - (j7 + j5) : 0L;
            long j13 = this.q.a;
            if (j13 != C.TIME_UNSET) {
                j2 = nik.T(j13);
            } else {
                j2 = (j6 != C.TIME_UNSET ? j5 - j6 : (j10 == C.TIME_UNSET || zc9Var.n == C.TIME_UNSET) ? j9 != C.TIME_UNSET ? j9 : 3 * zc9Var.m : j10) + T;
            }
            long j14 = j5 + T;
            long k = nik.k(j2, T, j14);
            u5c u5cVar = a().c;
            boolean z4 = false;
            boolean z5 = u5cVar.d == -3.4028235E38f && u5cVar.e == -3.4028235E38f && j9 == C.TIME_UNSET && j10 == C.TIME_UNSET;
            s5c a = this.q.a();
            a.a = nik.h0(k);
            a.d = z5 ? 1.0f : this.q.d;
            a.e = z5 ? 1.0f : this.q.e;
            u5c u5cVar2 = new u5c(a);
            this.q = u5cVar2;
            if (j6 == C.TIME_UNSET) {
                j6 = j14 - nik.T(u5cVar2.a);
            }
            if (z2) {
                j4 = j6;
            } else {
                uc9 s = s(j6, zc9Var.s);
                if (s != null) {
                    j3 = s.e;
                } else if (hv9Var.isEmpty()) {
                    j4 = 0;
                } else {
                    wc9 wc9Var = (wc9) hv9Var.get(nik.d(hv9Var, Long.valueOf(j6), true));
                    uc9 s2 = s(j6, wc9Var.m);
                    j3 = s2 != null ? s2.e : wc9Var.e;
                }
                j4 = j3;
            }
            if (i == 2 && zc9Var.f) {
                z4 = true;
            }
            dihVar = new dih(j8, h0, j12, zc9Var.u, j11, j4, true, !z3, z4, wxfVar, a(), this.q);
        } else {
            if (j6 == C.TIME_UNSET || hv9Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && j6 != j5) {
                    j6 = ((wc9) hv9Var.get(nik.d(hv9Var, Long.valueOf(j6), true))).e;
                }
                j = j6;
            }
            long j15 = zc9Var.u;
            dihVar = new dih(j8, h0, j15, j15, 0L, j, true, false, true, wxfVar, a(), null);
        }
        n(dihVar);
    }
}
