package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cn4 implements wke, edc, ec5 {
    public final tqi a;
    public final iij b;
    public final kij c;
    public final vng d;
    public final SparseArray e;
    public vdb f;
    public ale g;
    public zqi h;
    public boolean i;

    public cn4(tqi tqiVar) {
        tqiVar.getClass();
        this.a = tqiVar;
        String str = nik.a;
        Looper myLooper = Looper.myLooper();
        this.f = new vdb((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        iij iijVar = new iij();
        this.b = iijVar;
        this.c = new kij();
        vng vngVar = new vng();
        vngVar.a = iijVar;
        av9 av9Var = hv9.b;
        vngVar.b = vvf.e;
        vngVar.c = awf.g;
        this.d = vngVar;
        this.e = new SparseArray();
    }

    @Override // defpackage.ec5
    public final void a(int i, scc sccVar, Exception exc) {
        q(o(i, sccVar), 1024, new ym4(4));
    }

    @Override // defpackage.edc
    public final void b(int i, scc sccVar, m6c m6cVar) {
        q(o(i, sccVar), 1005, new ym4(13));
    }

    @Override // defpackage.ec5
    public final void c(int i, scc sccVar, int i2) {
        q(o(i, sccVar), IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new ym4(3));
    }

    @Override // defpackage.edc
    public final void d(int i, scc sccVar, lfb lfbVar, m6c m6cVar, IOException iOException, boolean z) {
        qv o = o(i, sccVar);
        q(o, 1003, new l1(o, lfbVar, m6cVar, iOException, z, 28));
    }

    @Override // defpackage.ec5
    public final void e(int i, scc sccVar) {
        q(o(i, sccVar), IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new ym4(22));
    }

    @Override // defpackage.edc
    public final void f(int i, scc sccVar, lfb lfbVar, m6c m6cVar, int i2) {
        q(o(i, sccVar), 1000, new eg4(24));
    }

    @Override // defpackage.edc
    public final void g(int i, scc sccVar, m6c m6cVar) {
        qv o = o(i, sccVar);
        q(o, 1004, new o3(14, o, m6cVar));
    }

    @Override // defpackage.edc
    public final void h(int i, scc sccVar, lfb lfbVar, m6c m6cVar) {
        q(o(i, sccVar), 1002, new ym4(1));
    }

    @Override // defpackage.edc
    public final void i(int i, scc sccVar, lfb lfbVar, m6c m6cVar) {
        q(o(i, sccVar), 1001, new ym4(5));
    }

    @Override // defpackage.ec5
    public final void j(int i, scc sccVar) {
        q(o(i, sccVar), IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new ym4(14));
    }

    @Override // defpackage.ec5
    public final void k(int i, scc sccVar, eja ejaVar) {
        q(o(i, sccVar), IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new ym4(21));
    }

    public final qv l() {
        return m((scc) this.d.d);
    }

    public final qv m(scc sccVar) {
        this.g.getClass();
        mij mijVar = sccVar == null ? null : (mij) ((awf) this.d.c).get(sccVar);
        if (sccVar != null && mijVar != null) {
            return n(mijVar, mijVar.g(sccVar.a, this.b).c, sccVar);
        }
        int y = this.g.y();
        mij currentTimeline = this.g.getCurrentTimeline();
        if (y >= currentTimeline.o()) {
            currentTimeline = mij.a;
        }
        return n(currentTimeline, y, null);
    }

    public final qv n(mij mijVar, int i, scc sccVar) {
        scc sccVar2 = mijVar.p() ? null : sccVar;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = mijVar.equals(this.g.getCurrentTimeline()) && i == this.g.y();
        long j = 0;
        if (sccVar2 == null || !sccVar2.b()) {
            if (z) {
                j = this.g.getContentPosition();
            } else if (!mijVar.p()) {
                j = nik.h0(mijVar.m(i, this.c, 0L).k);
            }
        } else if (z && this.g.getCurrentAdGroupIndex() == sccVar2.b && this.g.getCurrentAdIndexInAdGroup() == sccVar2.c) {
            j = this.g.getCurrentPosition();
        }
        return new qv(elapsedRealtime, mijVar, i, sccVar2, j, this.g.getCurrentTimeline(), this.g.y(), (scc) this.d.d, this.g.getCurrentPosition(), this.g.c());
    }

    public final qv o(int i, scc sccVar) {
        this.g.getClass();
        if (sccVar != null) {
            return ((mij) ((awf) this.d.c).get(sccVar)) != null ? m(sccVar) : n(mij.a, i, sccVar);
        }
        mij currentTimeline = this.g.getCurrentTimeline();
        if (i >= currentTimeline.o()) {
            currentTimeline = mij.a;
        }
        return n(currentTimeline, i, null);
    }

    @Override // defpackage.wke
    public final void onAudioSessionIdChanged(int i) {
        q(p(), 21, new ym4(8));
    }

    @Override // defpackage.wke
    public final void onAvailableCommandsChanged(ske skeVar) {
        q(l(), 13, new ym4(24));
    }

    @Override // defpackage.wke
    public final void onCues(o74 o74Var) {
        q(l(), 27, new eg4(20));
    }

    @Override // defpackage.wke
    public final void onDeviceVolumeChanged(int i, boolean z) {
        q(l(), 30, new eg4(12));
    }

    @Override // defpackage.wke
    public final void onIsLoadingChanged(boolean z) {
        q(l(), 3, new ym4(9));
    }

    @Override // defpackage.wke
    public final void onIsPlayingChanged(boolean z) {
        q(l(), 7, new eg4(7));
    }

    @Override // defpackage.wke
    public final void onMediaItemTransition(h6c h6cVar, int i) {
        q(l(), 1, new ym4(26));
    }

    @Override // defpackage.wke
    public final void onMediaMetadataChanged(q6c q6cVar) {
        q(l(), 14, new eg4(28));
    }

    @Override // defpackage.wke
    public final void onMetadata(ric ricVar) {
        q(l(), 28, new eg4(6));
    }

    @Override // defpackage.wke
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        q(l(), 5, new eg4(14));
    }

    @Override // defpackage.wke
    public final void onPlaybackParametersChanged(hke hkeVar) {
        q(l(), 12, new eg4(3));
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        q(l(), 4, new eg4(17));
    }

    @Override // defpackage.wke
    public final void onPlaybackSuppressionReasonChanged(int i) {
        q(l(), 6, new eg4(9));
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        scc sccVar;
        qv l = (!(dkeVar instanceof tf6) || (sccVar = ((tf6) dkeVar).h) == null) ? l() : m(sccVar);
        q(l, 10, new l1(26, l, dkeVar));
    }

    @Override // defpackage.wke
    public final void onPlayerErrorChanged(dke dkeVar) {
        scc sccVar;
        q((!(dkeVar instanceof tf6) || (sccVar = ((tf6) dkeVar).h) == null) ? l() : m(sccVar), 10, new eg4(11));
    }

    @Override // defpackage.wke
    public final void onPlayerStateChanged(boolean z, int i) {
        q(l(), -1, new eg4(5));
    }

    @Override // defpackage.wke
    public final void onPositionDiscontinuity(yke ykeVar, yke ykeVar2, int i) {
        if (i == 1) {
            this.i = false;
        }
        ale aleVar = this.g;
        aleVar.getClass();
        vng vngVar = this.d;
        vngVar.d = vng.G(aleVar, (hv9) vngVar.b, (scc) vngVar.e, (iij) vngVar.a);
        qv l = l();
        q(l, 11, new uz1(l, i, ykeVar, ykeVar2, 1));
    }

    @Override // defpackage.wke
    public final void onRepeatModeChanged(int i) {
        q(l(), 8, new eg4(19));
    }

    @Override // defpackage.wke
    public final void onShuffleModeEnabledChanged(boolean z) {
        q(l(), 9, new ym4(16));
    }

    @Override // defpackage.wke
    public final void onSkipSilenceEnabledChanged(boolean z) {
        q(p(), 23, new ym4(17));
    }

    @Override // defpackage.wke
    public final void onSurfaceSizeChanged(int i, int i2) {
        q(p(), 24, new eg4(23));
    }

    @Override // defpackage.wke
    public final void onTimelineChanged(mij mijVar, int i) {
        ale aleVar = this.g;
        aleVar.getClass();
        vng vngVar = this.d;
        vngVar.d = vng.G(aleVar, (hv9) vngVar.b, (scc) vngVar.e, (iij) vngVar.a);
        vngVar.p0(aleVar.getCurrentTimeline());
        q(l(), 0, new ym4(25));
    }

    @Override // defpackage.wke
    public final void onTrackSelectionParametersChanged(etj etjVar) {
        q(l(), 19, new eg4(25));
    }

    @Override // defpackage.wke
    public final void onTracksChanged(uuj uujVar) {
        q(l(), 2, new eg4(13));
    }

    @Override // defpackage.wke
    public final void onVideoSizeChanged(zqk zqkVar) {
        qv p = p();
        q(p, 25, new zm4(p, zqkVar));
    }

    @Override // defpackage.wke
    public final void onVolumeChanged(float f) {
        q(p(), 22, new ym4(27));
    }

    public final qv p() {
        return m((scc) this.d.f);
    }

    public final void q(qv qvVar, int i, qdb qdbVar) {
        this.e.put(i, qvVar);
        this.f.g(i, qdbVar);
    }

    public final void r(vg6 vg6Var, Looper looper) {
        z1a.E(this.g == null || ((hv9) this.d.b).isEmpty());
        vg6Var.getClass();
        this.g = vg6Var;
        this.h = this.a.a(looper, null);
        vdb vdbVar = this.f;
        o3 o3Var = new o3(12, this, vg6Var);
        tqi tqiVar = this.a;
        z1a.E(tqiVar != null);
        this.f = new vdb((CopyOnWriteArraySet) vdbVar.f, looper, looper.getThread(), tqiVar, o3Var, vdbVar.b);
    }

    @Override // defpackage.wke
    public final void onCues(List list) {
        qv l = l();
        q(l, 27, new xm4(list, 0, l));
    }

    @Override // defpackage.wke
    public final void onRenderedFirstFrame() {
    }

    @Override // defpackage.wke
    public final void onLoadingChanged(boolean z) {
    }

    @Override // defpackage.wke
    public final void onEvents(ale aleVar, uke ukeVar) {
    }

    @Override // defpackage.wke
    public final void onPositionDiscontinuity(int i) {
    }
}
