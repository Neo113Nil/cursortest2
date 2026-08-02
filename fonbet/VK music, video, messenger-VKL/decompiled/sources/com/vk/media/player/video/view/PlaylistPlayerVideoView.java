package com.vk.media.player.video.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.zxing.pdf417.PDF417Common;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import one.video.gl.ScalablePlainGLScene;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.tracks.c;
import one.video.transform.TransformController;
import one.video.view.OneVideoPlayerView;
import one.video.view.debug.VideoDebugInfoView;
import xsna.a4t0;
import xsna.am80;
import xsna.c5g;
import xsna.cms0;
import xsna.d3b0;
import xsna.deb0;
import xsna.dx1;
import xsna.f5b0;
import xsna.gzs;
import xsna.hk0;
import xsna.i750;
import xsna.j1d0;
import xsna.j5g;
import xsna.jgz;
import xsna.m7q;
import xsna.msy;
import xsna.o1b0;
import xsna.p2b0;
import xsna.qu5;
import xsna.sht0;
import xsna.sk;
import xsna.xk80;
import xsna.xnv;
import xsna.y6b0;

/* compiled from: PlaylistPlayerVideoView.kt */
/* loaded from: classes3.dex */
public final class PlaylistPlayerVideoView extends OneVideoPlayerView {
    public static final /* synthetic */ int A = 0;
    public RepeatMode k;
    public p2b0 l;
    public gzs<j1d0> m;
    public final ScalablePlainGLScene n;
    public final TransformController o;
    public List<m7q> p;
    public d3b0 q;
    public Object r;
    public xnv s;
    public boolean t;
    public final Object u;
    public final a4t0 v;
    public boolean w;
    public float x;
    public hk0 y;
    public deb0 z;

    /* compiled from: PlaylistPlayerVideoView.kt */
    public final class a implements a4t0.a {
        public a() {
        }

        @Override // xsna.a4t0.a
        public final void a() {
            PlaylistPlayerVideoView.this.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // xsna.a4t0.a
        public final void b() {
            PlaylistPlayerVideoView.this.setVolume(1.0f);
        }
    }

    public PlaylistPlayerVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 8, 0);
        TransformController transformController;
        this.k = RepeatMode.OFF;
        this.n = new ScalablePlainGLScene();
        VideoFeatures videoFeatures = VideoFeatures.REVERSE_EXP_RENDERER_THREAD;
        videoFeatures.getClass();
        if (b.A.a(videoFeatures)) {
            transformController = new TransformController(getTransformConsumer());
            transformController.j(this);
        } else {
            transformController = null;
        }
        this.o = transformController;
        EmptyList emptyList = EmptyList.b;
        this.p = emptyList;
        this.r = emptyList;
        this.t = true;
        this.u = msy.a(LazyThreadSafetyMode.NONE, new sk(22, this, context));
        this.v = new a4t0(new a());
        this.w = true;
        this.x = 1.0f;
        this.y = hk0.e;
        this.z = deb0.d;
    }

    private final List<String> getBadCodecsList() {
        List<String> B;
        p2b0 p2b0Var = this.l;
        return (p2b0Var == null || (B = p2b0Var.B()) == null) ? EmptyList.b : B;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VideoDebugInfoView getDebugView() {
        return (VideoDebugInfoView) this.u.getValue();
    }

    private final void setPauseAtEndOfMediaItems(boolean z) {
        this.t = z;
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            player.V(z);
        }
    }

    private final void setPlayerProtocol(d3b0 d3b0Var) {
        this.q = d3b0Var;
        p2b0 p2b0Var = this.l;
        if (p2b0Var != null) {
            p2b0Var.A(d3b0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    public final void e() {
        f5b0.a(getContext()).abandonAudioFocus(this.v);
        OneVideoPlayer player = getPlayer();
        if (player == null) {
            return;
        }
        xk80 xk80Var = player instanceof xk80 ? (xk80) player : null;
        if (xk80Var != null) {
            xk80Var.R = false;
        }
        p2b0 p2b0Var = this.l;
        if (p2b0Var != null) {
            player.c0(p2b0Var);
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            player.K((OneVideoPlayer.a) it.next());
        }
        player.pause();
        this.s = null;
        setPlayer(null);
        setPlayerProtocol(null);
        VideoDebugInfoView debugView = getDebugView();
        if (debugView != null) {
            debugView.setPlayer(null);
        }
        TransformController transformController = this.o;
        if (transformController != null) {
            transformController.e(null);
        }
    }

    public final void f(m7q m7qVar) {
        d3b0 d3b0Var = this.q;
        if (d3b0Var != null) {
            try {
                OneVideoPlayer player = getPlayer();
                if (player != null) {
                    ArrayList arrayList = new ArrayList(this.p);
                    arrayList.set(player.m0(), m7qVar);
                    this.p = arrayList;
                }
            } catch (Throwable th) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{th});
                }
            }
            d3b0Var.l(m7qVar, getBadCodecsList());
            setPlayWhenReady(true);
        }
    }

    public final void g() {
        xnv xnvVar;
        List<m7q> list = this.p;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(jgz.e((m7q) it.next()));
        }
        y6b0 y6b0Var = new y6b0(arrayList);
        if (this.z.a >= y6b0Var.a.size()) {
            this.z = deb0.d;
        }
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            player.b0(this.y);
        }
        gzs<j1d0> gzsVar = this.m;
        j1d0 invoke = gzsVar != null ? gzsVar.invoke() : null;
        if (invoke != null) {
            OneVideoPlayer player2 = getPlayer();
            xk80 xk80Var = player2 instanceof xk80 ? (xk80) player2 : null;
            if (xk80Var != null) {
                xk80Var.Q = invoke;
                xk80Var.R = true;
            }
        }
        OneVideoPlayer player3 = getPlayer();
        if (player3 != null) {
            m7q m7qVar = (m7q) j5g.b0(this.z.a, this.p);
            if (m7qVar != null && (xnvVar = this.s) != null) {
                xnvVar.a(player3, dx1.a(m7qVar));
            }
        }
        OneVideoPlayer player4 = getPlayer();
        if (player4 != null) {
            player4.A(y6b0Var, this.z);
        }
    }

    public final sht0 getCurrentVideoSource() {
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            return player.j();
        }
        return null;
    }

    public final long getDuration() {
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            return player.getDuration();
        }
        return 0L;
    }

    public final hk0 getForceTrackSelectorConfig() {
        return this.y;
    }

    public final p2b0 getPlayerListener() {
        return this.l;
    }

    public final long getPosition() {
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            return player.getCurrentPosition();
        }
        return 0L;
    }

    public final gzs<j1d0> getPreloadManager() {
        return this.m;
    }

    public final RepeatMode getRepeatMode() {
        return this.k;
    }

    public final List<m7q> getVideoFiles() {
        return this.p;
    }

    public final int getVideoHeight() {
        c E;
        cms0 cms0Var;
        OneVideoPlayer player = getPlayer();
        if (player == null || (E = player.E()) == null || (cms0Var = (cms0) E.c) == null) {
            return 0;
        }
        return cms0Var.f;
    }

    public final m7q getVideoSource() {
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            return (m7q) j5g.b0(player.m0(), this.p);
        }
        return null;
    }

    public final int getVideoWidth() {
        c E;
        cms0 cms0Var;
        OneVideoPlayer player = getPlayer();
        if (player == null || (E = player.E()) == null || (cms0Var = (cms0) E.c) == null) {
            return 0;
        }
        return cms0Var.e;
    }

    public final float getVolume() {
        return this.x;
    }

    public final void h(int i, long j) {
        OneVideoPlayer player = getPlayer();
        if (player == null || player.m0() != i || Math.abs(getPosition() - j) >= 500) {
            this.z = new deb0(i, j, null);
            OneVideoPlayer player2 = getPlayer();
            deb0 deb0Var = deb0.d;
            if (player2 == null) {
                if (this.z.a >= this.p.size()) {
                    this.z = deb0Var;
                }
            } else {
                int i2 = this.z.a;
                y6b0 U = player2.U();
                if (i2 >= (U != null ? U.a.size() : 0)) {
                    this.z = deb0Var;
                }
                player2.h0(this.z);
            }
        }
    }

    public final void setContinuousMode(boolean z) {
        setPauseAtEndOfMediaItems(!z);
    }

    public final void setFitVideo(boolean z) {
        this.n.i = z ? ScalablePlainGLScene.ScaleType.FIT : ScalablePlainGLScene.ScaleType.CROP;
        TransformController transformController = this.o;
        if (transformController != null) {
            transformController.f(z ? TransformController.ScaleType.FIT : TransformController.ScaleType.CROP, false);
        }
    }

    public final void setForceTrackSelectorConfig(hk0 hk0Var) {
        this.y = hk0Var;
    }

    public final void setNeedRequestAudioFocus(boolean z) {
        this.w = z;
    }

    public final void setPlayWhenReady(boolean z) {
        m7q m7qVar;
        if (!z) {
            OneVideoPlayer player = getPlayer();
            if (player != null) {
                player.pause();
                return;
            }
            return;
        }
        if (getPlayer() == null && (m7qVar = (m7q) j5g.a0(this.p)) != null) {
            d3b0 g = o1b0.g(qu5.c(), m7qVar, null, false, false, new i750(this, 11), getBadCodecsList(), PDF417Common.MAX_CODEWORDS_IN_BARCODE);
            OneVideoPlayer oneVideoPlayer = null;
            if (g != null) {
                setPlayerProtocol(g);
                am80 n = g.n();
                if (n != null) {
                    n.h();
                }
                g.j(null);
                this.s = g.h();
            }
            OneVideoPlayer a2 = qu5.c().a(jgz.e(m7qVar));
            if (a2 != null) {
                VideoFeatures videoFeatures = VideoFeatures.REVERSE_EXP_RENDERER_THREAD;
                videoFeatures.getClass();
                if (b.A.a(videoFeatures)) {
                    TransformController transformController = this.o;
                    if (transformController != null) {
                        transformController.e(a2);
                    }
                } else {
                    a2.G(this.n);
                }
                a2.V(this.t);
                oneVideoPlayer = a2;
            }
            setPlayer(oneVideoPlayer);
            VideoDebugInfoView debugView = getDebugView();
            if (debugView != null) {
                debugView.setPlayer(getPlayer());
            }
            OneVideoPlayer player2 = getPlayer();
            if (player2 != null) {
                player2.R(this.k);
                p2b0 p2b0Var = this.l;
                if (p2b0Var != null) {
                    player2.d0(p2b0Var);
                }
                Iterator it = ((Iterable) this.r).iterator();
                while (it.hasNext()) {
                    player2.D((OneVideoPlayer.a) it.next());
                }
                player2.setVolume(this.x);
                g();
            }
        }
        OneVideoPlayer player3 = getPlayer();
        if (player3 != null) {
            player3.resume();
        }
    }

    public final void setPlayerListener(p2b0 p2b0Var) {
        this.l = p2b0Var;
    }

    public final void setPreloadManager(gzs<j1d0> gzsVar) {
        this.m = gzsVar;
    }

    public final void setRepeatMode(RepeatMode repeatMode) {
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            player.R(repeatMode);
        }
        this.k = repeatMode;
    }

    public final void setSourceList(List<m7q> list) {
        this.p = list;
    }

    public final void setVolume(float f) {
        this.x = f;
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            player.setVolume(f);
        }
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }
}
