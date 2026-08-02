package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.c1;
import com.applovin.impl.f6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.exoplayer2.ExoPlayer;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.AppLovinVideoBridge;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class c2 extends y1 implements AppLovinCommunicatorSubscriber {
    private final d2 N;
    private MediaPlayer O;
    private final View P;
    protected final AppLovinVideoView Q;
    protected final com.applovin.impl.a R;
    protected final com.applovin.impl.adview.g S;
    protected k0 T;
    protected final ImageView U;
    protected final ProgressBar V;
    protected ProgressBar W;
    protected ImageView X;
    private final d Y;
    private final Handler Z;
    private final Handler a0;
    protected final c1 b0;
    protected final c1 c0;
    private final boolean d0;
    protected boolean e0;
    protected long f0;
    private int g0;
    private int h0;
    protected boolean i0;
    private boolean j0;
    private final AtomicBoolean k0;
    private final AtomicBoolean l0;
    private long m0;
    private long n0;

    class a implements c1.b {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            if (c2.this.T != null) {
                long seconds = this.a - TimeUnit.MILLISECONDS.toSeconds(r0.Q.getCurrentPosition());
                if (seconds <= 0) {
                    c2.this.w = true;
                } else if (c2.this.P()) {
                    c2.this.T.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return c2.this.P();
        }
    }

    class b implements c1.b {
        final /* synthetic */ Integer a;

        b(Integer num) {
            this.a = num;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            c2 c2Var = c2.this;
            if (c2Var.i0) {
                c2Var.V.setVisibility(8);
            } else {
                c2.this.V.setProgress((int) ((c2Var.Q.getCurrentPosition() / c2.this.f0) * this.a.intValue()));
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !c2.this.i0;
        }
    }

    class c implements c1.b {
        final /* synthetic */ long a;
        final /* synthetic */ Integer b;
        final /* synthetic */ Long c;

        c(long j, Integer num, Long l) {
            this.a = j;
            this.b = num;
            this.c = l;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            c2.this.W.setProgress((int) ((c2.this.s / this.a) * this.b.intValue()));
            c2.this.s += this.c.longValue();
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return c2.this.s < this.a;
        }
    }

    private class d implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private d() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            c2.this.a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/c2$d;->onCompletion(Landroid/media/MediaPlayer;)V");
            CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.a, mediaPlayer, "media-player");
            safedk_c2$d_onCompletion_684b7721af2118cd8b3af9067cc0d521(mediaPlayer);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            c2.this.g("Video view error (" + i + "," + i2 + ")");
            AppLovinVideoBridge.VideoViewPlay(c2.this.Q);
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            com.applovin.impl.sdk.p pVar = c2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.c.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                c2.this.Q();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                c2.this.E();
                return false;
            }
            c2.this.b0.b();
            c2 c2Var = c2.this;
            if (c2Var.S != null) {
                c2Var.O();
            }
            c2.this.E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            c2.this.O = mediaPlayer;
            mediaPlayer.setOnInfoListener(c2.this.Y);
            mediaPlayer.setOnErrorListener(c2.this.Y);
            float f = !c2.this.e0 ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            c2.this.v = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            c2.this.d(mediaPlayer.getDuration());
            c2.this.N();
            com.applovin.impl.sdk.p pVar = c2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + c2.this.O);
            }
        }

        public void safedk_c2$d_onCompletion_684b7721af2118cd8b3af9067cc0d521(MediaPlayer p0) {
            com.applovin.impl.sdk.p pVar = c2.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.c.a("AppLovinFullscreenActivity", "Video completed");
            }
            c2.this.j0 = true;
            c2 c2Var = c2.this;
            if (!c2Var.u) {
                c2Var.R();
            } else if (c2Var.h()) {
                c2.this.A();
            }
        }

        /* synthetic */ d(c2 c2Var, a aVar) {
            this();
        }
    }

    private class e implements View.OnClickListener {
        private e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c2 c2Var = c2.this;
            if (view == c2Var.S) {
                c2Var.S();
                return;
            }
            if (view == c2Var.U) {
                c2Var.T();
                return;
            }
            com.applovin.impl.sdk.p pVar = c2Var.c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ e(c2 c2Var, a aVar) {
            this();
        }
    }

    public c2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.N = new d2(this.a, this.d, this.b);
        a aVar = null;
        this.X = null;
        d dVar = new d(this, aVar);
        this.Y = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Z = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.a0 = handler2;
        c1 c1Var = new c1(handler, this.b);
        this.b0 = c1Var;
        this.c0 = new c1(handler2, this.b);
        boolean D0 = this.a.D0();
        this.d0 = D0;
        this.e0 = q7.e(this.b);
        this.h0 = -1;
        this.k0 = new AtomicBoolean();
        this.l0 = new AtomicBoolean();
        this.m0 = -2L;
        this.n0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.Q = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(dVar);
        appLovinVideoView.setOnCompletionListener(dVar);
        appLovinVideoView.setOnErrorListener(dVar);
        bVar.i().putString("video_view_address", g8.a(appLovinVideoView));
        View view = new View(activity);
        this.P = view;
        boolean z = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) lVar.a(z4.q1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.e0, activity, dVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.e0, activity, dVar));
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean a2;
                    a2 = c2.a(view2, motionEvent);
                    return a2;
                }
            });
        }
        e eVar = new e(this, aVar);
        if (bVar.f0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.X(), activity);
            this.S = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        } else {
            this.S = null;
        }
        if (a(this.e0, lVar)) {
            ImageView imageView = new ImageView(activity);
            this.U = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(eVar);
            f(this.e0);
        } else {
            this.U = null;
        }
        if (D0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) lVar.a(z4.o2)).intValue(), R.attr.progressBarStyleLarge);
            this.R = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.R = null;
        }
        int c2 = c();
        if (((Boolean) lVar.a(z4.Y1)).booleanValue() && c2 > 0) {
            z = true;
        }
        if (this.T == null && z) {
            this.T = new k0(activity);
            int t = bVar.t();
            this.T.setTextColor(t);
            this.T.setTextSize(((Integer) lVar.a(z4.X1)).intValue());
            this.T.setFinishedStrokeColor(t);
            this.T.setFinishedStrokeWidth(((Integer) lVar.a(z4.W1)).intValue());
            this.T.setMax(c2);
            this.T.setProgress(c2);
            c1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(c2));
        }
        if (!bVar.m0()) {
            this.V = null;
            return;
        }
        Long l = (Long) lVar.a(z4.l2);
        Integer num = (Integer) lVar.a(z4.m2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.V = progressBar;
        a(progressBar, bVar.l0(), num.intValue());
        c1Var.a("PROGRESS_BAR", l.longValue(), new b(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.a();
            final com.applovin.impl.a aVar2 = this.R;
            Objects.requireNonNull(aVar2);
            a(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b();
                }
            }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.m0 = -1L;
        this.n0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.r = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.i0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.b.o0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else {
            if (this.h0 < 0) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a("AppLovinFullscreenActivity", "Invalid last video position");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.h0 + "ms for MediaPlayer: " + this.O);
            }
            this.Q.seekTo(this.h0);
            AppLovinVideoBridge.VideoViewPlay(this.Q);
            this.b0.b();
            this.h0 = -1;
            a(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    c2.this.I();
                }
            }, 250L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.l0.compareAndSet(false, true)) {
            a(this.S, this.a.f0(), new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    c2.this.J();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void f(boolean z) {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable == null) {
            ImageViewUtils.setImageUri(this.U, z ? this.a.I() : this.a.d0(), this.b);
            return;
        }
        this.U.setScaleType(ImageView.ScaleType.FIT_XY);
        this.U.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
    }

    private void g(boolean z) {
        this.g0 = C();
        if (z) {
            AppLovinVideoBridge.VideoViewPause(this.Q);
        } else {
            AppLovinVideoBridge.VideoViewStop(this.Q);
        }
    }

    @Override // com.applovin.impl.y1
    protected void A() {
        this.N.a(this.l);
        this.r = SystemClock.elapsedRealtime();
    }

    protected int C() {
        long currentPosition = this.Q.getCurrentPosition();
        if (this.j0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f0) * 100.0f) : this.g0;
    }

    public void D() {
        this.z++;
        if (this.a.v()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            R();
        }
    }

    protected void E() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                c2.this.H();
            }
        });
    }

    protected boolean F() {
        if (this.K && this.a.a1()) {
            return true;
        }
        return G();
    }

    protected boolean G() {
        return C() >= this.a.h0();
    }

    protected void N() {
        long R;
        long millis;
        if (this.a.Q() >= 0 || this.a.R() >= 0) {
            if (this.a.Q() >= 0) {
                R = this.a.Q();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.a;
                long j = this.f0;
                long j2 = j > 0 ? j : 0L;
                if (aVar.W0()) {
                    int i1 = (int) ((com.applovin.impl.sdk.ad.a) this.a).i1();
                    if (i1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(i1);
                    } else {
                        int s = (int) aVar.s();
                        if (s > 0) {
                            millis = TimeUnit.SECONDS.toMillis(s);
                        }
                    }
                    j2 += millis;
                }
                R = (long) (j2 * (this.a.R() / 100.0d));
            }
            c(R);
        }
    }

    protected boolean P() {
        return (this.w || this.i0 || !this.Q.isPlaying()) ? false : true;
    }

    protected void Q() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                c2.this.K();
            }
        });
    }

    public void R() {
        c2 c2Var;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        g(this.a.d1());
        long O = this.a.O();
        if (O > 0) {
            this.s = 0L;
            Long l = (Long) this.b.a(z4.t2);
            Integer num = (Integer) this.b.a(z4.w2);
            ProgressBar progressBar = new ProgressBar(this.d, null, R.attr.progressBarStyleHorizontal);
            this.W = progressBar;
            a(progressBar, this.a.N(), num.intValue());
            c2Var = this;
            this.c0.a("POSTITIAL_PROGRESS_BAR", l.longValue(), c2Var.new c(O, num, l));
            c2Var.c0.b();
        } else {
            c2Var = this;
        }
        c2Var.N.a(c2Var.k, c2Var.j, b(), c2Var.W);
        a("javascript:al_onPoststitialShow(" + c2Var.z + "," + c2Var.A + ");", c2Var.a.y());
        if (c2Var.k != null) {
            if (c2Var.a.s() >= 0) {
                a(c2Var.k, c2Var.a.s(), new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2.this.L();
                    }
                });
            } else {
                c2Var.k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = c2Var.k;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = c2Var.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = c2Var.j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = c2Var.W;
        if (progressBar2 != null) {
            arrayList.add(new j4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        c2Var.a.getAdEventTracker().b(b(), arrayList);
        p();
        c2Var.i0 = true;
    }

    public void S() {
        this.m0 = SystemClock.elapsedRealtime() - this.n0;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.m0 + "ms");
        }
        D();
    }

    protected void T() {
        MediaPlayer mediaPlayer = this.O;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f = this.e0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            boolean z = !this.e0;
            this.e0 = z;
            f(z);
            a(this.e0, 0L);
        } catch (Throwable unused) {
        }
    }

    protected void d(long j) {
        this.f0 = j;
    }

    @Override // com.applovin.impl.y1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.y1
    protected void m() {
        super.a(C(), this.d0, F(), this.m0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong(CreativeInfo.c) == this.a.getAdIdNumber() && this.d0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !s0.a(i)) || this.j0 || this.Q.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.y1
    public void r() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.d0) {
                AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.Q;
            if (appLovinVideoView != null) {
                AppLovinVideoBridge.VideoViewPause(appLovinVideoView);
                AppLovinVideoBridge.VideoViewStop(this.Q);
            }
            MediaPlayer mediaPlayer = this.O;
            if (mediaPlayer != null) {
                AppLovinVideoBridge.MediaPlayerRelease(mediaPlayer);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.r();
    }

    @Override // com.applovin.impl.y1
    public void v() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.h0 = this.Q.getCurrentPosition();
        AppLovinVideoBridge.VideoViewPause(this.Q);
        this.b0.c();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Paused video at position " + this.h0 + "ms");
        }
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.y1
    public void b(boolean z) {
        super.b(z);
        if (z) {
            b(0L);
            if (this.i0) {
                this.c0.b();
                return;
            }
            return;
        }
        if (this.i0) {
            this.c0.c();
        } else {
            v();
        }
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        String str;
        this.N.a(this.U, this.S, this.R, this.V, this.T, this.Q, this.P, b(), this.j, this.X, viewGroup);
        if (p0.e() && (str = this.b.p0().getExtraParameters().get("audio_focus_request")) != null) {
            this.Q.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.b.a(z4.d6)).booleanValue() || !a(!this.d0)) {
            AppLovinVideoBridge.VideoViewSetVideoUri(this.Q, this.a.n0());
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.j;
            if (kVar != null) {
                kVar.b();
            }
            AppLovinVideoBridge.VideoViewPlay(this.Q);
            if (this.d0) {
                Q();
            }
            SpecialsBridge.appLovinAdViewRenderAd(b(), this.a);
            if (this.S != null) {
                this.b.s0().a(new u6(this.b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2.this.O();
                    }
                }), f6.b.TIMEOUT, this.a.g0(), true);
            }
            super.c(this.e0);
        }
    }

    protected void g(String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.a);
        }
        if (this.k0.compareAndSet(false, true)) {
            if (((Boolean) this.b.a(z4.P0)).booleanValue()) {
                this.b.I().d(this.a, com.applovin.impl.sdk.l.p());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.G;
            if (appLovinAdDisplayListener instanceof n2) {
                ((n2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.a instanceof r7 ? "handleVastVideoError" : "handleVideoError";
            this.b.E().a(str2, str, this.a);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            this.b.g().a(f2.G, this.a, hashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        this.N.a((View) this.S);
        if (!h() || this.i0) {
            A();
        }
    }

    @Override // com.applovin.impl.y1
    public void b(long j) {
        a(new Runnable() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                c2.this.M();
            }
        }, j);
    }

    @Override // com.applovin.impl.y1
    protected void a(String str, long j) {
        super.a(str, j);
    }

    private void a(ProgressBar progressBar, int i, int i2) {
        progressBar.setMax(i2);
        progressBar.setPadding(0, 0, 0, 0);
        progressBar.setProgressTintList(ColorStateList.valueOf(i));
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        this.b0.a();
        this.c0.a();
        this.Z.removeCallbacksAndMessages(null);
        this.a0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    protected void a(MotionEvent motionEvent) {
        Context context;
        if (this.a.C0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri e0 = this.a.e0();
            if (e0 != null) {
                if (!((Boolean) this.b.a(z4.w)).booleanValue() || (context = this.d) == null) {
                    context = b() != null ? b().getContext() : com.applovin.impl.sdk.l.p();
                }
                this.b.l().trackAndLaunchVideoClick(this.a, e0, motionEvent, this, context);
                v2.a(this.F, this.a);
                this.A++;
            }
        }
    }

    private static boolean a(boolean z, com.applovin.impl.sdk.l lVar) {
        if (!((Boolean) lVar.a(z4.d2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) lVar.a(z4.e2)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) lVar.a(z4.g2)).booleanValue();
    }
}
