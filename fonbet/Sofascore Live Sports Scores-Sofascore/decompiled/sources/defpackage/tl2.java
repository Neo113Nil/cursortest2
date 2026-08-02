package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.zzau;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tl2 implements ale {
    public final hxf a;
    public final IdentityHashMap b;

    static {
        x05 x05Var = hxf.H;
    }

    public tl2(CastContext castContext) {
        br4 br4Var = new br4();
        s02.i0();
        n72 n72Var = n72.h;
        String str = null;
        if (n72Var == null) {
            n72Var = new n72();
            n72Var.d = null;
            n72Var.b = new ArrayList();
            n72Var.c = new HashSet();
            n72.h = n72Var;
        }
        s02.i0();
        castContext.getClass();
        if (((CastContext) n72Var.e) == null && !n72Var.a) {
            s02.i0();
            n72Var.a = false;
            n72Var.e = castContext;
            SessionManager b = castContext.b();
            ArrayList arrayList = (ArrayList) n72Var.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b.a((SessionManagerListener) it.next());
            }
            CastSession c = b.c();
            if (c != null) {
                Preconditions.e("Must be called from the main thread.");
                zzau zzauVar = c.a;
                if (zzauVar != null) {
                    try {
                        str = zzauVar.zzh();
                    } catch (RemoteException unused) {
                        Session.b.b("Unable to call %s on %s.", "getSessionId", "zzau");
                    }
                }
            }
            if (c != null && c.c() && str != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((SessionManagerListener) it2.next()).k(c, str);
                }
            }
            arrayList.clear();
            if (castContext.a() == null) {
                ibc ibcVar = ibc.c;
            }
            HashSet hashSet = (HashSet) n72Var.c;
            Iterator it3 = hashSet.iterator();
            if (it3.hasNext()) {
                throw lnb.i(it3);
            }
            hashSet.clear();
        }
        hxf hxfVar = new hxf(n72Var, br4Var);
        this.b = new IdentityHashMap();
        this.a = hxfVar;
    }

    @Override // defpackage.ale
    public final long A() {
        return this.a.getCurrentPosition();
    }

    @Override // defpackage.ale
    public final void B() {
        this.a.B();
    }

    @Override // defpackage.ale
    public final void C() {
        this.a.C();
    }

    @Override // defpackage.ale
    public final q6c D() {
        return this.a.G;
    }

    @Override // defpackage.ale
    public final long E() {
        return this.a.d;
    }

    @Override // defpackage.ale
    public final void b(hke hkeVar) {
        this.a.b(hkeVar);
    }

    @Override // defpackage.ale
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.ale
    public final void d() {
        this.a.t();
    }

    @Override // defpackage.ale
    public final h6c e() {
        return this.a.e();
    }

    @Override // defpackage.ale
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.ale
    public final long getBufferedPosition() {
        return this.a.getCurrentPosition();
    }

    @Override // defpackage.ale
    public final long getContentPosition() {
        return this.a.getCurrentPosition();
    }

    @Override // defpackage.ale
    public final int getCurrentAdGroupIndex() {
        return -1;
    }

    @Override // defpackage.ale
    public final int getCurrentAdIndexInAdGroup() {
        return -1;
    }

    @Override // defpackage.ale
    public final int getCurrentPeriodIndex() {
        return this.a.y();
    }

    @Override // defpackage.ale
    public final long getCurrentPosition() {
        return this.a.getCurrentPosition();
    }

    @Override // defpackage.ale
    public final mij getCurrentTimeline() {
        return this.a.v;
    }

    @Override // defpackage.ale
    public final long getDuration() {
        return this.a.u();
    }

    @Override // defpackage.ale
    public final boolean getPlayWhenReady() {
        return this.a.getPlayWhenReady();
    }

    @Override // defpackage.ale
    public final hke getPlaybackParameters() {
        return this.a.getPlaybackParameters();
    }

    @Override // defpackage.ale
    public final int getPlaybackState() {
        return this.a.getPlaybackState();
    }

    @Override // defpackage.ale
    public final int getRepeatMode() {
        return this.a.getRepeatMode();
    }

    @Override // defpackage.ale
    public final boolean getShuffleModeEnabled() {
        return false;
    }

    @Override // defpackage.ale
    public final float getVolume() {
        return this.a.getVolume();
    }

    @Override // defpackage.ale
    public final dke h() {
        return null;
    }

    @Override // defpackage.ale
    public final uuj i() {
        return this.a.i();
    }

    @Override // defpackage.ale
    public final boolean isPlaying() {
        return this.a.isPlaying();
    }

    @Override // defpackage.ale
    public final boolean isPlayingAd() {
        return false;
    }

    @Override // defpackage.ale
    public final o74 j() {
        return o74.c;
    }

    @Override // defpackage.ale
    public final boolean k(int i) {
        return this.a.k(i);
    }

    @Override // defpackage.ale
    public final void l(h6c h6cVar) {
        this.a.l(h6cVar);
    }

    @Override // defpackage.ale
    public final int m() {
        return 0;
    }

    @Override // defpackage.ale
    public final Looper n() {
        return Looper.getMainLooper();
    }

    @Override // defpackage.ale
    public final etj o() {
        return this.a.o();
    }

    @Override // defpackage.ale
    public final void p() {
        this.a.p();
    }

    @Override // defpackage.ale
    public final void pause() {
        this.a.setPlayWhenReady(false);
    }

    @Override // defpackage.ale
    public final void play() {
        this.a.setPlayWhenReady(true);
    }

    @Override // defpackage.ale
    public final void release() {
        this.a.release();
    }

    @Override // defpackage.ale
    public final void s(wke wkeVar) {
        synchronized (this.b) {
            try {
                hn8 hn8Var = (hn8) this.b.get(wkeVar);
                if (hn8Var == null) {
                    hn8Var = new hn8(this, wkeVar);
                }
                this.a.m.a(hn8Var);
                this.b.put(wkeVar, hn8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ale
    public final void seekTo(long j) {
        this.a.M(5, j);
    }

    @Override // defpackage.ale
    public final void seekToDefaultPosition() {
        this.a.seekToDefaultPosition();
    }

    @Override // defpackage.ale
    public final void setRepeatMode(int i) {
        this.a.setRepeatMode(i);
    }

    @Override // defpackage.ale
    public final void setVolume(float f) {
        this.a.setVolume(f);
    }

    @Override // defpackage.ale
    public final void stop() {
        this.a.stop();
    }

    @Override // defpackage.ale
    public final long u() {
        return this.a.u();
    }

    @Override // defpackage.ale
    public final zqk v() {
        return zqk.d;
    }

    @Override // defpackage.ale
    public final long w() {
        return this.a.e;
    }

    @Override // defpackage.ale
    public final int y() {
        return this.a.y();
    }

    @Override // defpackage.ale
    public final void z(wke wkeVar) {
        synchronized (this.b) {
            wke wkeVar2 = (wke) this.b.remove(wkeVar);
            hxf hxfVar = this.a;
            if (wkeVar2 != null) {
                wkeVar = wkeVar2;
            }
            hxfVar.z(wkeVar);
        }
    }

    @Override // defpackage.ale
    public final void seekTo(int i, long j) {
        this.a.L(j, i, false);
    }

    @Override // defpackage.ale
    public final void a() {
    }

    @Override // defpackage.ale
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // defpackage.ale
    public final void clearVideoTextureView(TextureView textureView) {
    }

    @Override // defpackage.ale
    public final void f(etj etjVar) {
    }

    @Override // defpackage.ale
    public final void setShuffleModeEnabled(boolean z) {
    }

    @Override // defpackage.ale
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // defpackage.ale
    public final void setVideoTextureView(TextureView textureView) {
    }
}
