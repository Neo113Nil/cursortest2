package com.vk.media.player.video.view;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import com.vk.media.player.video.VideoScale;
import com.vk.media.player.video.VideoSourceType;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.mediastore.storage.MediaStorage;
import com.vkontakte.android.VKApplication;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import one.video.view.debug.VideoDebugInfoView;
import xsna.a4t0;
import xsna.ag30;
import xsna.b0u0;
import xsna.cms0;
import xsna.d0;
import xsna.d260;
import xsna.er10;
import xsna.f5b0;
import xsna.ftk;
import xsna.fxc0;
import xsna.fz5;
import xsna.ing0;
import xsna.iut0;
import xsna.ja6;
import xsna.ktd;
import xsna.l2t;
import xsna.lk80;
import xsna.m67;
import xsna.n5q;
import xsna.o260;
import xsna.o3i0;
import xsna.ou5;
import xsna.psm0;
import xsna.pu5;
import xsna.q86;
import xsna.r8l;
import xsna.rhh0;
import xsna.sc4;
import xsna.sht0;
import xsna.u69;
import xsna.um80;
import xsna.wds0;
import xsna.wn80;
import xsna.x9v;
import xsna.xab;
import xsna.xgp0;
import xsna.xk80;
import xsna.y2r0;
import xsna.yn2;

@Deprecated
/* loaded from: classes3.dex */
public class SimpleVideoView extends l2t {
    public static int V;
    public m A;
    public i B;
    public l C;
    public n D;
    public h E;
    public k F;
    public j G;
    public int H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public boolean M;
    public float N;

    @Nullable
    public um80 O;
    public wds0 P;
    public VideoSourceType Q;

    @Nullable
    public String R;
    public VideoDebugInfoView S;

    @Nullable
    public String T;
    public RepeatMode U;
    public final o m;
    public final Handler n;
    public final g o;
    public final f p;
    public a.InterfaceC0045a q;
    public final AtomicReference<OneVideoPlayer> r;
    public final a4t0 s;
    public final n5q t;
    public final VideoScale u;
    public sht0 v;
    public Surface w;
    public int x;
    public int y;
    public int z;

    public class a implements a4t0.a {
        public a() {
        }

        @Override // xsna.a4t0.a
        public final void a() {
            d0 d0Var = new d0(this, 12);
            int i = SimpleVideoView.V;
            SimpleVideoView.this.r(d0Var);
        }

        @Override // xsna.a4t0.a
        public final void b() {
            pu5 pu5Var = new pu5(this, 14);
            int i = SimpleVideoView.V;
            SimpleVideoView.this.r(pu5Var);
        }
    }

    public class b implements l {
        public b() {
        }
    }

    public class c implements n {
        public c() {
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[VideoSourceType.values().length];
            a = iArr;
            try {
                iArr[VideoSourceType.HLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[VideoSourceType.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[VideoSourceType.DASH_WEBM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[VideoSourceType.MP4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final class f implements one.video.player.e {
        public f() {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void d(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, IOException iOException) {
            int i = SimpleVideoView.V;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (simpleVideoView.p()) {
                return;
            }
            simpleVideoView.C.a(simpleVideoView.P.a, lk80Var.a, iOException);
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void f(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, OneVideoPlayer.DataType dataType) {
            int i = SimpleVideoView.V;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (simpleVideoView.p()) {
                return;
            }
            l lVar = simpleVideoView.C;
            Uri uri = simpleVideoView.P.a;
            lVar.c(j, j2);
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, er10 er10Var) {
            int i = SimpleVideoView.V;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (simpleVideoView.p()) {
                return;
            }
            simpleVideoView.C.b();
        }
    }

    public final class g implements one.video.player.f {
        public int a = 0;

        public g() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(@NonNull BaseVideoPlayer baseVideoPlayer, @Nullable one.video.player.tracks.c cVar) {
            if (cVar == null) {
                return;
            }
            cms0 cms0Var = (cms0) cVar.c;
            int i = cms0Var.f;
            int i2 = cms0Var.e;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (i != 0) {
                Integer valueOf = Integer.valueOf(Math.round(cms0Var.g));
                int i3 = this.a;
                if (i3 != 0 && i3 > i) {
                    simpleVideoView.D.a(valueOf);
                }
                int i4 = this.a;
                if (i4 != 0 && i4 < i) {
                    simpleVideoView.D.b(valueOf);
                }
                this.a = i;
            }
            int i5 = SimpleVideoView.V;
            if (simpleVideoView.p()) {
                return;
            }
            o oVar = simpleVideoView.m;
            int i6 = o.b;
            oVar.getClass();
            oVar.sendMessage(Message.obtain(oVar, 5, i2, i, 0));
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(@NonNull OneVideoPlayer oneVideoPlayer) {
            int i = SimpleVideoView.V;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (simpleVideoView.p()) {
                return;
            }
            SimpleVideoView.l(simpleVideoView);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(@NonNull OneVideoPlaybackException oneVideoPlaybackException, @NonNull sht0 sht0Var, @NonNull OneVideoPlayer oneVideoPlayer) {
            PlayerError playerError = PlayerError.ERROR_NETWORK;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (simpleVideoView.getContext() != null) {
                Point z = y2r0.z(simpleVideoView.getContext());
                if (simpleVideoView.y * simpleVideoView.z > z.x * z.y) {
                    simpleVideoView.t();
                    playerError = PlayerError.ERROR_NOT_SUPPORT_RESOLUTION;
                }
            }
            String str = simpleVideoView.R;
            if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.SOURCE && str != null) {
                int length = str.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i);
                    if (Character.isWhitespace(codePointAt)) {
                        i += Character.charCount(codePointAt);
                    } else if (!sht0Var.b.toString().contains(str)) {
                        simpleVideoView.s(new wds0(sht0Var.b.buildUpon().authority(str).build(), 0L, 0L, 0L, false), false, simpleVideoView.getCurrentPosition(), true);
                        return;
                    }
                }
            }
            simpleVideoView.setCurrentState(-1);
            o oVar = simpleVideoView.m;
            int i2 = o.b;
            oVar.getClass();
            oVar.sendMessage(Message.obtain(oVar, 6, playerError.ordinal(), 0, oneVideoPlaybackException));
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(@NonNull OneVideoPlayer oneVideoPlayer) {
            int i = SimpleVideoView.V;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (simpleVideoView.p()) {
                return;
            }
            SimpleVideoView.m(simpleVideoView);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void v(@NonNull OneVideoPlayer oneVideoPlayer) {
            int i = SimpleVideoView.V;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (simpleVideoView.p()) {
                return;
            }
            SimpleVideoView.k(simpleVideoView);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void x(@NonNull OneVideoPlayer oneVideoPlayer) {
            int i = SimpleVideoView.V;
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            if (simpleVideoView.p()) {
                return;
            }
            one.video.player.tracks.c E = oneVideoPlayer.E();
            Integer valueOf = E != null ? Integer.valueOf(Math.round(((cms0) E.c).g)) : null;
            o oVar = simpleVideoView.m;
            int i2 = o.b;
            oVar.getClass();
            oVar.sendMessage(Message.obtain(oVar, 4, valueOf));
        }
    }

    public interface i {
        void b();
    }

    public interface j {
        void b(PlayerError playerError, @Nullable Exception exc);
    }

    public interface k {
        void p0(@Nullable Integer num);
    }

    public interface m {
        void onPrepared();
    }

    public static class o extends Handler {
        public static final /* synthetic */ int b = 0;
        public final WeakReference<SimpleVideoView> a;

        public o(SimpleVideoView simpleVideoView) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(simpleVideoView);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            Integer num = null;
            WeakReference<SimpleVideoView> weakReference = this.a;
            SimpleVideoView simpleVideoView = weakReference != null ? weakReference.get() : null;
            if (simpleVideoView == null) {
                return;
            }
            switch (message.what) {
                case 0:
                    m mVar = simpleVideoView.A;
                    if (mVar != null) {
                        mVar.onPrepared();
                        break;
                    }
                    break;
                case 1:
                    h hVar = simpleVideoView.E;
                    if (hVar != null) {
                        hVar.onBufferingStart();
                        break;
                    }
                    break;
                case 2:
                    h hVar2 = simpleVideoView.E;
                    if (hVar2 != null) {
                        hVar2.onBufferingEnd();
                        break;
                    }
                    break;
                case 3:
                    i iVar = simpleVideoView.B;
                    if (iVar != null) {
                        iVar.b();
                        break;
                    }
                    break;
                case 4:
                    if (simpleVideoView.F != null) {
                        Object obj = message.obj;
                        if (obj instanceof Integer) {
                            num = (Integer) obj;
                            num.getClass();
                        }
                        simpleVideoView.F.p0(num);
                        break;
                    }
                    break;
                case 5:
                    Object obj2 = message.obj;
                    int intValue = obj2 != null ? ((Integer) obj2).intValue() : 0;
                    if (intValue % 180 == 90) {
                        simpleVideoView.y = message.arg2;
                        simpleVideoView.z = message.arg1;
                    } else {
                        simpleVideoView.y = message.arg1;
                        simpleVideoView.z = message.arg2;
                    }
                    VideoScale videoScale = simpleVideoView.u;
                    videoScale.f = intValue;
                    videoScale.d(simpleVideoView, simpleVideoView.y, simpleVideoView.z);
                    break;
                case 6:
                    j jVar = simpleVideoView.G;
                    if (jVar != null) {
                        Object obj3 = message.obj;
                        Exception exc = obj3 instanceof Exception ? (Exception) obj3 : null;
                        PlayerError.a aVar = PlayerError.Companion;
                        int i = message.arg1;
                        aVar.getClass();
                        jVar.b(PlayerError.a.a(i), exc);
                        break;
                    }
                    break;
            }
        }
    }

    public SimpleVideoView(Context context) {
        super(context);
        this.m = new o(this);
        this.n = new Handler(Looper.getMainLooper());
        this.o = new g();
        this.p = new f();
        Context context2 = getContext();
        o260 o260Var = d260.a;
        this.q = new androidx.media3.datasource.d(context2, (o260Var == null ? null : o260Var).l.a(), fz5.d.t(getContext()));
        this.r = new AtomicReference<>();
        this.s = new a4t0(new a());
        this.t = new n5q();
        this.u = new VideoScale(VideoScale.ScaleType.FIT_CENTER);
        this.w = null;
        this.x = 0;
        this.C = new b();
        this.D = new c();
        this.H = 3;
        this.I = false;
        this.M = true;
        this.N = 1.0f;
        d dVar = new d();
        this.U = RepeatMode.OFF;
        setSurfaceTextureListener(dVar);
    }

    public static void d(SimpleVideoView simpleVideoView) {
        OneVideoPlayer player = simpleVideoView.getPlayer();
        if (player != null) {
            player.K(simpleVideoView.t);
            player.c0(simpleVideoView.o);
            player.K(simpleVideoView.p);
            player.stop();
            player.clearVideoSurface();
            player.release();
            simpleVideoView.setCurrentState(0);
            simpleVideoView.setPlayer(null);
            L.e("SimpleVideoView", "player released!");
        }
        f5b0.a(simpleVideoView.getContext()).abandonAudioFocus(simpleVideoView.s);
    }

    public static /* synthetic */ void e(SimpleVideoView simpleVideoView) {
        OneVideoPlayer player = simpleVideoView.getPlayer();
        if (player != null) {
            player.stop();
        }
    }

    public static /* synthetic */ void f(SimpleVideoView simpleVideoView, float f2) {
        OneVideoPlayer player = simpleVideoView.getPlayer();
        if (player != null) {
            player.setVolume(f2);
        }
    }

    public static void g(SimpleVideoView simpleVideoView, boolean z) {
        simpleVideoView.I = z;
        if (simpleVideoView.getPlayer() == null) {
            return;
        }
        if (z) {
            simpleVideoView.q();
            return;
        }
        OneVideoPlayer player = simpleVideoView.getPlayer();
        if (player != null) {
            player.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public OneVideoPlayer getPlayer() {
        return this.r.get();
    }

    public static void h(SimpleVideoView simpleVideoView) {
        Surface surface;
        if (simpleVideoView.getPlayer() != null) {
            return;
        }
        Context context = simpleVideoView.getContext();
        int i2 = wn80.a;
        xk80 xk80Var = new xk80(context.getApplicationContext(), null, null, null, null, true, new rhh0(8), xgp0.j, wn80.e, new r8l(false, false, 7), 2000L, null, null, false, new o3i0(0L, 0L), new psm0(0));
        xk80Var.d0(simpleVideoView.o);
        xk80Var.D(simpleVideoView.p);
        xk80Var.setVolume(simpleVideoView.N);
        L.e("SimpleVideoView", "initPlayer complete");
        simpleVideoView.setPlayer(xk80Var);
        OneVideoPlayer player = simpleVideoView.getPlayer();
        if (player == null || (surface = simpleVideoView.w) == null) {
            return;
        }
        player.setVideoSurface(surface);
    }

    public static /* synthetic */ void i(SimpleVideoView simpleVideoView, long j2) {
        OneVideoPlayer player = simpleVideoView.getPlayer();
        if (player != null) {
            try {
                player.seekTo(j2);
            } catch (Exception e2) {
                L.i(e2);
            }
        }
    }

    public static void j(SimpleVideoView simpleVideoView, long j2) {
        n5q n5qVar = simpleVideoView.t;
        Uri uri = simpleVideoView.P.a;
        MediaStorage mediaStorage = MediaStorage.b;
        if (MediaStorage.c(MediaStorage.VideoCacheType.ALL).i(uri.toString())) {
            L.e("setVideoUri: url already in cache!");
        }
        if (simpleVideoView.T == null) {
            uri.toString();
        }
        n5qVar.getClass();
        String uri2 = uri.toString();
        n5qVar.a = uri2 != null && (uri2.startsWith("https://") || uri2.startsWith("http://"));
        int i2 = e.a[simpleVideoView.Q.ordinal()];
        if (i2 == 1) {
            simpleVideoView.v = new x9v(uri);
        } else if (i2 == 2 || i2 == 3) {
            simpleVideoView.v = new ftk(uri);
        } else {
            simpleVideoView.v = new ag30(uri);
        }
        OneVideoPlayer player = simpleVideoView.getPlayer();
        if (player != null) {
            player.R(simpleVideoView.U);
            xk80 xk80Var = (xk80) player;
            xk80Var.B0(simpleVideoView.q);
            if (j2 == 0) {
                j2 = simpleVideoView.J;
                if (j2 == 0) {
                    j2 = simpleVideoView.K;
                }
            }
            player.D(n5qVar);
            OneVideoPlayer player2 = simpleVideoView.getPlayer();
            if (player2 != null) {
                if (simpleVideoView.I) {
                    player2.n0(simpleVideoView.v, j2);
                } else {
                    player2.C(simpleVideoView.v, j2);
                }
            }
            simpleVideoView.v(simpleVideoView.getSurfaceTexture());
            if (simpleVideoView.L > 0) {
                um80 u0 = xk80Var.u0(new q86(simpleVideoView, 8), simpleVideoView.n.getLooper());
                u0.c(simpleVideoView.L);
                u0.b();
                u0.a.b();
                simpleVideoView.O = u0;
            }
        }
    }

    public static void k(SimpleVideoView simpleVideoView) {
        if (4 != simpleVideoView.getCurrentState()) {
            simpleVideoView.setCurrentState(4);
            o oVar = simpleVideoView.m;
            int i2 = o.b;
            oVar.getClass();
            oVar.sendMessage(Message.obtain(oVar, 1));
        }
    }

    public static void l(SimpleVideoView simpleVideoView) {
        if (3 == simpleVideoView.getCurrentState()) {
            return;
        }
        simpleVideoView.setCurrentState(3);
        o oVar = simpleVideoView.m;
        int i2 = o.b;
        oVar.getClass();
        oVar.sendMessage(Message.obtain(oVar, 3));
    }

    public static void m(SimpleVideoView simpleVideoView) {
        o oVar = simpleVideoView.m;
        if (2 != simpleVideoView.getCurrentState()) {
            simpleVideoView.setCurrentState(2);
            simpleVideoView.u();
            int i2 = o.b;
            oVar.getClass();
            oVar.sendMessage(Message.obtain(oVar, 2));
            oVar.sendMessage(Message.obtain(oVar, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setCurrentState(int i2) {
        this.x = i2;
    }

    private synchronized void setPlayer(OneVideoPlayer oneVideoPlayer) {
        try {
            this.r.set(oneVideoPlayer);
            if (oneVideoPlayer != null) {
                V++;
            } else {
                V--;
            }
            VideoDebugInfoView videoDebugInfoView = this.S;
            if (videoDebugInfoView != null) {
                videoDebugInfoView.setPlayer(oneVideoPlayer);
            }
            L.e("Count SimpleExoPlayer: " + V);
        } catch (Throwable th) {
            throw th;
        }
    }

    public long getCurrentPosition() {
        OneVideoPlayer player = getPlayer();
        if (player == null) {
            return 0L;
        }
        return player.getCurrentPosition();
    }

    public synchronized int getCurrentState() {
        return this.x;
    }

    @Nullable
    public sht0 getCurrentVideoSource() {
        OneVideoPlayer player = getPlayer();
        if (player == null) {
            return null;
        }
        return player.j();
    }

    public long getDuration() {
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            return player.getDuration();
        }
        return 0L;
    }

    public long getEndOnTimeMs() {
        return this.L;
    }

    public h getOnBufferingEventsListener() {
        return this.E;
    }

    public i getOnEndListener() {
        return this.B;
    }

    public j getOnErrorListener() {
        return this.G;
    }

    public k getOnFirstFrameRenderedListener() {
        return this.F;
    }

    public m getOnPreparedListener() {
        return this.A;
    }

    public float getSoundVolume() {
        return this.N;
    }

    public long getStartTimeMs() {
        return this.K;
    }

    @NonNull
    public wds0 getVideoData() {
        return this.P;
    }

    public int getVideoHeight() {
        return this.z;
    }

    public VideoSourceType getVideoSourceType() {
        return this.Q;
    }

    public float getVideoSpeed() {
        OneVideoPlayer player = getPlayer();
        return player != null ? player.b() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public int getVideoWidth() {
        return this.y;
    }

    @Override // xsna.l2t, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        VideoDebugInfoView videoDebugInfoView;
        super.onAttachedToWindow();
        if (fxc0.B().i().f()) {
            ViewParent parent = getParent();
            if ((parent instanceof ViewGroup) && this.S == null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                VideoDebugInfoView videoDebugInfoView2 = new VideoDebugInfoView(viewGroup.getContext());
                this.S = videoDebugInfoView2;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                videoDebugInfoView2.setId(View.generateViewId());
                viewGroup.addView(this.S, -2, -2);
            }
            OneVideoPlayer player = getPlayer();
            if (player == null || (videoDebugInfoView = this.S) == null) {
                return;
            }
            videoDebugInfoView.setPlayer(player);
        }
    }

    public final boolean p() {
        return this.r.get() == null;
    }

    public final void q() {
        OneVideoPlayer player = getPlayer();
        if (this.w == null || player == null) {
            return;
        }
        L.e("SimpleVideoView", "play surface=" + this.w + ", player=" + player);
        if (this.I) {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            player.resume();
        } else {
            OneVideoPlayer player2 = getPlayer();
            if (player2 != null) {
                player2.pause();
            }
        }
    }

    public final void r(Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.n;
        if (myLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final void s(wds0 wds0Var, boolean z, final long j2, boolean z2) {
        wds0 wds0Var2 = this.P;
        L.e("setVideoUri: " + (wds0Var2 != null ? wds0Var2.a : null) + " -> " + wds0Var.a);
        this.P = wds0Var;
        if (z) {
            this.J = 0L;
        }
        if (z2) {
            setCurrentState(1);
            L.e("SimpleVideoView", "initPlayer");
            if (p()) {
                r(new sc4(this, 13));
            }
        }
        this.y = 0;
        this.z = 0;
        um80 um80Var = this.O;
        if (um80Var != null) {
            um80Var.a();
            this.O = null;
        }
        r(new Runnable() { // from class: xsna.ysj0
            @Override // java.lang.Runnable
            public final void run() {
                SimpleVideoView.j(SimpleVideoView.this, j2);
            }
        });
    }

    public void setDataSourceFactory(a.InterfaceC0045a interfaceC0045a) {
        this.q = interfaceC0045a;
    }

    public void setFailoverHost(String str) {
        this.R = str;
    }

    public void setFitVideo(boolean z) {
        VideoScale.ScaleType scaleType = z ? VideoScale.ScaleType.FIT_CENTER : VideoScale.ScaleType.CENTER_CROP;
        VideoScale videoScale = this.u;
        videoScale.a = scaleType;
        videoScale.d(this, this.y, this.z);
    }

    public void setLoop(boolean z) {
        if (z) {
            this.U = RepeatMode.ALL;
        } else {
            this.U = RepeatMode.OFF;
        }
    }

    public void setMute(boolean z) {
        setSoundVolume(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
    }

    public void setNeedRequestAudioFocus(boolean z) {
        this.M = z;
    }

    public void setOnBufferingEventsListener(h hVar) {
        this.E = hVar;
    }

    public void setOnEndListener(i iVar) {
        this.B = iVar;
    }

    public void setOnErrorListener(j jVar) {
        this.G = jVar;
    }

    public void setOnFirstFrameRenderedListener(k kVar) {
        this.F = kVar;
    }

    public void setOnPreparedListener(m mVar) {
        this.A = mVar;
    }

    public void setPlayWhenReady(boolean z) {
        r(new ktd(this, z, 1));
    }

    public void setRawSourceLink(@Nullable String str) {
        this.T = str;
    }

    public void setRepeatMode(RepeatMode repeatMode) {
        this.U = repeatMode;
        OneVideoPlayer player = getPlayer();
        if (player != null) {
            player.R(repeatMode);
        }
    }

    public void setScaleType(@NonNull VideoScale.ScaleType scaleType) {
        VideoScale videoScale = this.u;
        videoScale.a = scaleType;
        videoScale.d(this, this.y, this.z);
    }

    public void setSoundVolume(float f2) {
        r(new ing0(this, f2));
        float f3 = this.N;
        if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.M && f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            r(new xab(this, 10));
        }
        this.N = f2;
    }

    public void setStreamType(int i2) {
        this.H = i2;
    }

    public void setVideoLoadingListener(l lVar) {
        this.C = lVar;
    }

    public void setVideoSizeListener(n nVar) {
        this.D = nVar;
    }

    public void setVideoSourceType(VideoSourceType videoSourceType) {
        this.Q = videoSourceType;
    }

    public void setVideoUri(Uri uri) {
        s(new wds0(uri, 0L, 0L, 0L, false), true, 0L, true);
    }

    public final void t() {
        setCurrentState(0);
        this.y = 0;
        this.z = 0;
        r(new m67(this, 10));
    }

    public final void u() {
        OneVideoPlayer player = getPlayer();
        if (!(player instanceof xk80) || this.L <= 0) {
            um80 um80Var = this.O;
            if (um80Var != null) {
                um80Var.a();
                return;
            }
            return;
        }
        xk80 xk80Var = (xk80) player;
        um80 um80Var2 = this.O;
        if (um80Var2 != null) {
            um80Var2.a();
        }
        um80 u0 = xk80Var.u0(new ou5(this, 11), this.n.getLooper());
        u0.c(this.L);
        u0.b();
        u0.a.b();
        this.O = u0;
    }

    public final void v(SurfaceTexture surfaceTexture) {
        Surface surface;
        Surface surface2;
        L.e("updateSurface, current surface=" + this.w);
        if (getPlayer() == null || surfaceTexture == null || (surface = this.w) != null) {
            return;
        }
        if (surface != null) {
            surface.release();
            this.w = null;
        }
        Surface surface3 = new Surface(surfaceTexture);
        if (!surface3.isValid()) {
            L.e("updateSurface, surface is not valid");
            surface3.release();
            return;
        }
        L.e("updateSurface, new surface=" + surface3);
        this.w = surface3;
        OneVideoPlayer player = getPlayer();
        if (player == null || (surface2 = this.w) == null) {
            return;
        }
        player.setVideoSurface(surface2);
    }

    public interface h {
        default void onBufferingEnd() {
        }

        default void onBufferingStart() {
        }
    }

    public interface l {
        default void b() {
        }

        default void c(long j, long j2) {
        }

        default void a(Uri uri, Uri uri2, Exception exc) {
        }
    }

    public SimpleVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new o(this);
        this.n = new Handler(Looper.getMainLooper());
        this.o = new g();
        this.p = new f();
        Context context2 = getContext();
        o260 o260Var = d260.a;
        this.q = new androidx.media3.datasource.d(context2, (o260Var == null ? null : o260Var).l.a(), fz5.d.t(getContext()));
        this.r = new AtomicReference<>();
        this.s = new a4t0(new a());
        this.t = new n5q();
        this.u = new VideoScale(VideoScale.ScaleType.FIT_CENTER);
        this.w = null;
        this.x = 0;
        this.C = new b();
        this.D = new c();
        this.H = 3;
        this.I = false;
        this.M = true;
        this.N = 1.0f;
        d dVar = new d();
        this.U = RepeatMode.OFF;
        setSurfaceTextureListener(dVar);
    }

    public class d implements TextureView.SurfaceTextureListener {
        public d() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = SimpleVideoView.V;
            StringBuilder sb = new StringBuilder("onSurfaceTextureAvailable: surfaceTexture=");
            sb.append(surfaceTexture);
            sb.append(", res=");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append(", state=");
            SimpleVideoView simpleVideoView = SimpleVideoView.this;
            sb.append(simpleVideoView.getCurrentState());
            L.e("SimpleVideoView", sb.toString());
            simpleVideoView.r(new u69(5, this, surfaceTexture));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i = SimpleVideoView.V;
            L.e("SimpleVideoView", "onSurfaceTextureDestroyed: surfaceTexture=" + surfaceTexture);
            SimpleVideoView.this.r(new yn2(this, 10));
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = SimpleVideoView.V;
            L.e("SimpleVideoView", "onSurfaceTextureSizeChanged: surfaceTexture=" + surfaceTexture + ", res=" + i + "x" + i2);
            SimpleVideoView.this.r(new ja6(this, 9));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public interface n {
        default void a(Integer num) {
        }

        default void b(Integer num) {
        }
    }
}
