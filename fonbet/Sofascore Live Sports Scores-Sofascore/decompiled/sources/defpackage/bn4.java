package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bn4 implements vke, ddc, dc5 {
    public final sqi a;
    public final hij b;
    public final jij c;
    public final ox9 d;
    public final SparseArray e;
    public rd4 f;
    public zke g;
    public yqi h;
    public boolean i;

    public bn4(sqi sqiVar) {
        sqiVar.getClass();
        this.a = sqiVar;
        int i = lik.a;
        Looper myLooper = Looper.myLooper();
        this.f = new rd4(myLooper == null ? Looper.getMainLooper() : myLooper, sqiVar, new ym4(10));
        hij hijVar = new hij();
        this.b = hijVar;
        this.c = new jij();
        this.d = new ox9(hijVar);
        this.e = new SparseArray();
    }

    public final void A(ug6 ug6Var, Looper looper) {
        qx9.t(this.g == null || ((hv9) this.d.c).isEmpty());
        ug6Var.getClass();
        this.g = ug6Var;
        this.h = this.a.a(looper, null);
        rd4 rd4Var = this.f;
        this.f = new rd4((CopyOnWriteArraySet) rd4Var.e, looper, (sqi) rd4Var.b, new o3(13, this, ug6Var));
    }

    @Override // defpackage.ddc
    public final void a(int i, rcc rccVar, kfb kfbVar, l6c l6cVar) {
        z(x(i, rccVar), 1002, new eg4(2));
    }

    @Override // defpackage.vke
    public final void b(p6c p6cVar) {
        z(t(), 14, new eg4(2));
    }

    @Override // defpackage.ddc
    public final void c(int i, rcc rccVar, kfb kfbVar, l6c l6cVar, IOException iOException, boolean z) {
        pv x = x(i, rccVar);
        z(x, 1003, new l1(x, kfbVar, l6cVar, iOException, z, 25));
    }

    @Override // defpackage.vke
    public final void d(Metadata metadata) {
        z(t(), 28, new eg4(2));
    }

    @Override // defpackage.vke
    public final void e(int i) {
        zke zkeVar = this.g;
        zkeVar.getClass();
        ox9 ox9Var = this.d;
        ox9Var.e = ox9.h(zkeVar, (hv9) ox9Var.c, (rcc) ox9Var.f, (hij) ox9Var.b);
        ox9Var.s(((ug6) zkeVar).j());
        z(t(), 0, new eg4(2));
    }

    @Override // defpackage.vke
    public final void f(yqk yqkVar) {
        pv y = y();
        z(y, 25, new an4(y, yqkVar));
    }

    @Override // defpackage.ddc
    public final void g(int i, rcc rccVar, l6c l6cVar) {
        pv x = x(i, rccVar);
        z(x, 1004, new o3(11, x, l6cVar));
    }

    @Override // defpackage.vke
    public final void h(sf6 sf6Var) {
        z6c z6cVar;
        pv t = (!(sf6Var instanceof sf6) || (z6cVar = sf6Var.h) == null) ? t() : u(new rcc(z6cVar));
        z(t, 10, new l1(29, t, sf6Var));
    }

    @Override // defpackage.vke
    public final void i(rke rkeVar) {
        z(t(), 13, new eg4(2));
    }

    @Override // defpackage.vke
    public final void j(tuj tujVar) {
        z(t(), 2, new eg4(2));
    }

    @Override // defpackage.ddc
    public final void k(int i, rcc rccVar, kfb kfbVar, l6c l6cVar) {
        z(x(i, rccVar), 1001, new eg4(2));
    }

    @Override // defpackage.vke
    public final void l(v05 v05Var) {
        z(t(), 29, new eg4(2));
    }

    @Override // defpackage.vke
    public final void n(gke gkeVar) {
        z(t(), 12, new eg4(2));
    }

    @Override // defpackage.vke
    public final void o(f6c f6cVar, int i) {
        z(t(), 1, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onCues(List list) {
        pv t = t();
        z(t, 27, new xm4(list, 1, t));
    }

    @Override // defpackage.vke
    public final void onDeviceVolumeChanged(int i, boolean z) {
        z(t(), 30, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onIsLoadingChanged(boolean z) {
        z(t(), 3, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onIsPlayingChanged(boolean z) {
        z(t(), 7, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        z(t(), 5, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onPlaybackStateChanged(int i) {
        z(t(), 4, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onPlaybackSuppressionReasonChanged(int i) {
        z(t(), 6, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onPlayerStateChanged(boolean z, int i) {
        z(t(), -1, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onRepeatModeChanged(int i) {
        z(t(), 8, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onSeekProcessed() {
        z(t(), -1, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onShuffleModeEnabledChanged(boolean z) {
        z(t(), 9, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onSkipSilenceEnabledChanged(boolean z) {
        z(y(), 23, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onSurfaceSizeChanged(int i, int i2) {
        z(y(), 24, new eg4(2));
    }

    @Override // defpackage.vke
    public final void onVolumeChanged(float f) {
        z(y(), 22, new eg4(2));
    }

    @Override // defpackage.vke
    public final void p(xke xkeVar, xke xkeVar2, int i) {
        if (i == 1) {
            this.i = false;
        }
        zke zkeVar = this.g;
        zkeVar.getClass();
        ox9 ox9Var = this.d;
        ox9Var.e = ox9.h(zkeVar, (hv9) ox9Var.c, (rcc) ox9Var.f, (hij) ox9Var.b);
        pv t = t();
        z(t, 11, new uz1(t, i, xkeVar, xkeVar2, 2));
    }

    @Override // defpackage.vke
    public final void q(dtj dtjVar) {
        z(t(), 19, new eg4(2));
    }

    @Override // defpackage.vke
    public final void r(sf6 sf6Var) {
        z6c z6cVar;
        z((!(sf6Var instanceof sf6) || (z6cVar = sf6Var.h) == null) ? t() : u(new rcc(z6cVar)), 10, new eg4(2));
    }

    @Override // defpackage.vke
    public final void s(n74 n74Var) {
        z(t(), 27, new eg4(2));
    }

    public final pv t() {
        return u((rcc) this.d.e);
    }

    public final pv u(rcc rccVar) {
        this.g.getClass();
        lij lijVar = rccVar == null ? null : (lij) ((awf) this.d.d).get(rccVar);
        if (rccVar != null && lijVar != null) {
            return w(lijVar, lijVar.g(rccVar.a, this.b).c, rccVar);
        }
        int g = ((ug6) this.g).g();
        lij j = ((ug6) this.g).j();
        if (g >= j.o()) {
            j = lij.a;
        }
        return w(j, g, null);
    }

    @Override // defpackage.ddc
    public final void v(int i, rcc rccVar, kfb kfbVar, l6c l6cVar) {
        z(x(i, rccVar), 1000, new eg4(2));
    }

    public final pv w(lij lijVar, int i, rcc rccVar) {
        rcc rccVar2 = lijVar.p() ? null : rccVar;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = lijVar.equals(((ug6) this.g).j()) && i == ((ug6) this.g).g();
        long j = 0;
        if (rccVar2 == null || !rccVar2.a()) {
            if (z) {
                j = ((ug6) this.g).d();
            } else if (!lijVar.p()) {
                j = lik.F(lijVar.m(i, this.c, 0L).k);
            }
        } else if (z && ((ug6) this.g).e() == rccVar2.b && ((ug6) this.g).f() == rccVar2.c) {
            j = ((ug6) this.g).h();
        }
        long j2 = j;
        rcc rccVar3 = (rcc) this.d.e;
        lij j3 = ((ug6) this.g).j();
        int g = ((ug6) this.g).g();
        long h = ((ug6) this.g).h();
        ug6 ug6Var = (ug6) this.g;
        ug6Var.T();
        return new pv(elapsedRealtime, lijVar, i, rccVar2, j2, j3, g, rccVar3, h, lik.F(ug6Var.i0.q));
    }

    public final pv x(int i, rcc rccVar) {
        this.g.getClass();
        lij lijVar = lij.a;
        if (rccVar != null) {
            return ((lij) ((awf) this.d.d).get(rccVar)) != null ? u(rccVar) : w(lijVar, i, rccVar);
        }
        lij j = ((ug6) this.g).j();
        if (i < j.o()) {
            lijVar = j;
        }
        return w(lijVar, i, null);
    }

    public final pv y() {
        return u((rcc) this.d.g);
    }

    public final void z(pv pvVar, int i, pdb pdbVar) {
        this.e.put(i, pvVar);
        this.f.k(i, pdbVar);
    }

    @Override // defpackage.vke
    public final void onRenderedFirstFrame() {
    }

    @Override // defpackage.vke
    public final void m(tke tkeVar) {
    }
}
