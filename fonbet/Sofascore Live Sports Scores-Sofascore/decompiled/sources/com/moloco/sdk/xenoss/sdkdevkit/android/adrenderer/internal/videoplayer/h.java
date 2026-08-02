package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.view.InflateException;
import android.view.View;
import com.facebook.login.m;
import com.moloco.sdk.internal.MolocoLogger;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a51;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.f6c;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.g6b;
import defpackage.g9i;
import defpackage.gdi;
import defpackage.gr4;
import defpackage.hs4;
import defpackage.lj2;
import defpackage.lji;
import defpackage.lu3;
import defpackage.oed;
import defpackage.p2g;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.ug6;
import defpackage.v98;
import defpackage.w2g;
import defpackage.z45;
import defpackage.z9a;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements j {
    public final Context a;
    public final boolean b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j c;
    public final com.moloco.sdk.acm.recorder.c d;
    public final ad2 e;
    public final fdi f;
    public final fdi g;
    public final fdi h;
    public final fdi i;
    public final fdi j;
    public final fdi k;
    public final lji l;
    public String m;
    public boolean n;
    public final Looper o;
    public ug6 p;
    public f q;
    public boolean r;
    public final g s;
    public final com.facebook.login.i t;
    public long u;
    public g9i v;

    public h(Context context, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar, g6b g6bVar, com.moloco.sdk.acm.recorder.c cVar) {
        lji ljiVar;
        context.getClass();
        jVar.getClass();
        g6bVar.getClass();
        this.a = context;
        this.b = z;
        this.c = jVar;
        this.d = cVar;
        hs4 hs4Var = z45.a;
        this.e = s9a.c(rob.a);
        fdi a = gdi.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a);
        this.f = a;
        this.g = a;
        fdi a2 = gdi.a(new d(false, true, true));
        this.h = a2;
        this.i = a2;
        rq3 rq3Var = null;
        fdi a3 = gdi.a(null);
        this.j = a3;
        this.k = a3;
        try {
            ljiVar = new lji(context);
            ljiVar.setUseController(false);
        } catch (InflateException e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "ExoPlayerView could not be instantiated.", e, false, 8, null);
            fdi fdiVar = this.j;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.b;
            fdiVar.getClass();
            fdiVar.m(null, lVar);
            ljiVar = null;
        }
        this.l = ljiVar;
        this.o = Looper.getMainLooper();
        fcp.m0(new v98(this.i, new e(this, rq3Var, 2), 3), this.e);
        this.s = new g(this);
        int i = 0;
        int i2 = 0;
        Class<h> cls = h.class;
        this.t = new com.facebook.login.i(g6bVar, new com.moloco.sdk.internal.publisher.nativead.b(i2, this, cls, "initOrResumeExoPlayer", "initOrResumeExoPlayer()V", i, 22), new com.moloco.sdk.internal.publisher.nativead.b(i2, this, cls, "disposeExoPlayer", "disposeExoPlayer()V", i, 23));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final Object a(rq3 rq3Var) {
        Object q;
        ug6 ug6Var = this.p;
        if (ug6Var != null) {
            if (ug6Var.o() == 3) {
                q = Unit.a;
            } else {
                int i = 1;
                lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
                lj2Var.t();
                b bVar = new b(ug6Var, lj2Var, i);
                ug6Var.l.e(bVar);
                if (ug6Var.o() == 3) {
                    ug6Var.A(bVar);
                    if (lj2Var.r() instanceof oed) {
                        p2g p2gVar = w2g.b;
                        lj2Var.resumeWith(Unit.a);
                    }
                }
                lj2Var.v(new a(ug6Var, bVar, i));
                q = lj2Var.q();
                if (q != lu3.a) {
                    q = Unit.a;
                }
            }
            if (q == lu3.a) {
                return q;
            }
        }
        return Unit.a;
    }

    public final void b(ug6 ug6Var, String str) {
        if (str == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "URI Source is empty", null, false, 12, null);
            return;
        }
        try {
            if (this.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Streaming is enabled", null, false, 12, null);
                a51 a = new gr4(new m(2, str, this)).a(f6c.a(str));
                ug6Var.T();
                List singletonList = Collections.singletonList(a);
                ug6Var.T();
                ug6Var.H(singletonList);
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Streaming is disabled", null, false, 12, null);
                ug6Var.G(f6c.a(str));
            }
            ug6Var.y();
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "ExoPlayer setMediaItem exception", e, false, 8, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.c;
            fdi fdiVar = this.j;
            fdiVar.getClass();
            fdiVar.m(null, lVar);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final View c() {
        return this.l;
    }

    public final void d() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Disposing exo player", null, false, 12, null);
        lji ljiVar = this.l;
        if (ljiVar != null) {
            View view = ljiVar.d;
            if (view instanceof GLSurfaceView) {
                ((GLSurfaceView) view).onPause();
            }
            ljiVar.setPlayer(null);
        }
        ug6 ug6Var = this.p;
        long m = ug6Var != null ? ug6Var.m() : 0L;
        ug6 ug6Var2 = this.p;
        boolean z = m - (ug6Var2 != null ? ug6Var2.h() : 0L) > 0;
        ug6 ug6Var3 = this.p;
        if (ug6Var3 != null) {
            this.u = ug6Var3.h();
            ug6Var3.A(this.s);
            ug6Var3.z();
        }
        this.p = null;
        d dVar = new d(false, false, z);
        fdi fdiVar = this.h;
        fdiVar.getClass();
        fdiVar.m(null, dVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.e, null);
        this.t.destroy();
        d();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final ddi f() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final ddi isPlaying() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final ddi p() {
        return this.g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void pause() {
        this.r = false;
        ug6 ug6Var = this.p;
        if (ug6Var != null) {
            ug6Var.J(false);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void play() {
        this.r = true;
        ug6 ug6Var = this.p;
        if (ug6Var != null) {
            ug6Var.J(true);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void seekTo(long j) {
        this.u = j;
        ug6 ug6Var = this.p;
        if (ug6Var != null) {
            int g = ug6Var.g();
            ug6Var.T();
            ug6Var.C(j, g, false);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void a(String str) {
        this.m = str;
        ug6 ug6Var = this.p;
        if (ug6Var != null) {
            b(ug6Var, str);
        }
        this.r = false;
        this.u = 0L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void b(boolean z) {
        this.n = z;
        ug6 ug6Var = this.p;
        if (ug6Var != null) {
            ug6Var.O(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }
}
