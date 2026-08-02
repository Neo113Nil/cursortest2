package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.transition.TransitionManager;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoFile;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aeh;
import defpackage.b1d;
import defpackage.beh;
import defpackage.bsk;
import defpackage.bu3;
import defpackage.g51;
import defpackage.g9i;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.r69;
import defpackage.rob;
import defpackage.vg6;
import defpackage.wf6;
import defpackage.xw3;
import defpackage.yda;
import defpackage.z45;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class V7 {
    public final T7 A;
    public final N7 B;
    public final b1d C;
    public final HtmlVideoPlayerRequest a;
    public final InterfaceC3880x9 b;
    public final ku3 c;
    public final ku3 d;
    public final HtmlVideoPlayerConfig e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public volatile int i;
    public volatile int j;
    public final List k;
    public final AtomicReference l;
    public final b1d m;
    public final K1 n;
    public final ProgressBar o;
    public final ExoPlayer p;
    public String q;
    public WeakReference r;
    public final List s;
    public Jg t;
    public long u;
    public yda v;
    public final P2 w;
    public final C6 x;
    public final C3284a8 y;
    public final C3853w8 z;

    public V7(Context context, AdConfig.HybridNativeConfig hybridNativeConfig, ku3 ku3Var, HtmlVideoPlayerRequest htmlVideoPlayerRequest, InterfaceC3880x9 interfaceC3880x9) {
        context.getClass();
        hybridNativeConfig.getClass();
        ku3Var.getClass();
        htmlVideoPlayerRequest.getClass();
        this.a = htmlVideoPlayerRequest;
        this.b = interfaceC3880x9;
        this.c = X4.a(ku3Var, new S7(bu3.a, this));
        ku3 a = X4.a(ku3Var);
        this.d = a;
        HtmlVideoPlayerConfig config = htmlVideoPlayerRequest.getConfig();
        this.e = config;
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        synchronizedList.getClass();
        this.k = synchronizedList;
        Jg jg = Jg.STATE_INITIALIZED;
        this.l = new AtomicReference(jg);
        aeh b = beh.b(0, 0, null, 7);
        this.m = b;
        K1 k1 = new K1(context);
        this.n = k1;
        this.o = new ProgressBar(context);
        vg6 a2 = new wf6(context).a();
        this.p = a2;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        synchronizedList2.getClass();
        this.s = synchronizedList2;
        this.t = jg;
        this.w = (P2) P2.g.getValue();
        this.x = new C6(a2, hybridNativeConfig, a, config.getPlaybackUpdateInterval(), b, config.getTrackPercentages());
        Context context2 = k1.getContext();
        context2.getClass();
        this.y = new C3284a8(context2, a, a2, config.getMuted(), b);
        this.z = new C3853w8(a, a2, k1, interfaceC3880x9);
        this.A = new T7(this);
        this.B = new N7(this);
        this.C = b;
    }

    public final void a(RelativeLayout relativeLayout) {
        InterfaceC3880x9 interfaceC3880x9;
        relativeLayout.getClass();
        if (this.h.get()) {
            return;
        }
        this.r = new WeakReference(relativeLayout);
        C3853w8 c3853w8 = this.z;
        T7 t7 = this.A;
        c3853w8.getClass();
        t7.getClass();
        X4.a(c3853w8.a, new C3801u8(c3853w8, t7, null));
        K1 k1 = this.n;
        VideoViewPosition videoViewPosition = new VideoViewPosition();
        VideoViewPosition videoViewPosition2 = this.e.getVideoViewPosition();
        if (this.e.getFullscreenEnabled()) {
            videoViewPosition.setX(0);
            videoViewPosition.setY(0);
            videoViewPosition.setWidth(-1);
            videoViewPosition.setHeight(-1);
        } else {
            videoViewPosition.setX(videoViewPosition2 != null ? (int) (R5.b() * videoViewPosition2.getX()) : 0);
            videoViewPosition.setY(videoViewPosition2 != null ? (int) (R5.b() * videoViewPosition2.getY()) : 0);
            videoViewPosition.setWidth(videoViewPosition2 != null ? (int) (R5.b() * videoViewPosition2.getWidth()) : -2);
            videoViewPosition.setHeight(videoViewPosition2 != null ? (int) (R5.b() * videoViewPosition2.getHeight()) : -2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(videoViewPosition.getWidth(), videoViewPosition.getHeight());
        if (this.e.getFullscreenEnabled()) {
            layoutParams.addRule(13, -1);
        } else {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        k1.setLayoutParams(layoutParams);
        this.n.setOnPositionChangeListener(new J7(this));
        ViewParent parent = this.o.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.o);
        }
        ProgressBar progressBar = this.o;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(100, 100);
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setVisibility(0);
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            this.n.addView(this.o, 0);
        } else {
            xw3.L(this.c, null, null, new R7(null, this), 3);
        }
        K1 k12 = this.n;
        WeakHashMap weakHashMap = bsk.a;
        if (k12.isAttachedToWindow()) {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
            }
            a(C3905y8.a);
        } else {
            k12.addOnAttachStateChangeListener(new I7(k12, this));
        }
        relativeLayout.addView(this.n, 0);
        if (b() == Jg.STATE_PREPARED || (interfaceC3880x9 = this.b) == null) {
            return;
        }
        ((C3906y9) interfaceC3880x9).b("HtmlMediaPlayer", "inflate() called before successful load – waiting for load to complete");
    }

    public final Jg b() {
        Object obj = this.l.get();
        obj.getClass();
        return (Jg) obj;
    }

    public final void c() {
        if (!this.h.get() && b() == Jg.STATE_PLAYING) {
            if (!Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                xw3.L(this.c, null, null, new L7(null, this), 3);
                return;
            }
            ((g51) this.p).setPlayWhenReady(false);
            this.x.a();
            C3284a8 c3284a8 = this.y;
            ((vg6) c3284a8.b).setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c3284a8.d.a();
            this.l.set(Jg.STATE_PAUSED);
            a(new C3635nn(((vg6) this.p).getCurrentPosition()));
        }
    }

    public final void d() {
        if (this.h.get()) {
            return;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("HtmlMediaPlayer", "playVideo called");
        }
        if (b() != Jg.STATE_PAUSED && b() != Jg.STATE_PREPARED && b() != Jg.STATE_PLAYBACK_COMPLETED) {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).b("HtmlMediaPlayer", "playVideo: Player not in playable state");
                return;
            }
            return;
        }
        if (!Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            xw3.L(this.c, null, null, new M7(null, this), 3);
            return;
        }
        if (b() == Jg.STATE_PLAYBACK_COMPLETED) {
            ((g51) this.p).M(5, 0L);
            this.l.set(Jg.STATE_PREPARED);
        }
        C3284a8 c3284a8 = this.y;
        if (c3284a8.e) {
            c3284a8.a();
            c3284a8.d.a();
        } else {
            X4.a(c3284a8.a, new Z7(c3284a8, null));
        }
        C6 c6 = this.x;
        if (!c6.d.getAndSet(true)) {
            ku3 ku3Var = c6.b;
            long j = c6.k;
            A6 a6 = new A6(c6, null);
            ku3Var.getClass();
            hs4 hs4Var = z45.a;
            r69 r69Var = rob.a;
            c6.e = xw3.L(ku3Var, r69Var.f, null, new K3(j, null, a6), 2);
            ku3 ku3Var2 = c6.b;
            long j2 = c6.l;
            B6 b6 = new B6(c6, null);
            ku3Var2.getClass();
            c6.f = xw3.L(ku3Var2, r69Var.f, null, new K3(j2, null, b6), 2);
        }
        ((g51) this.p).setPlayWhenReady(true);
        this.l.set(Jg.STATE_PLAYING);
        a(new Gn(((vg6) this.p).getCurrentPosition()));
    }

    public final void e() {
        if (this.h.get()) {
            return;
        }
        String str = this.q;
        if (str != null) {
            for (HtmlVideoFile htmlVideoFile : this.s) {
                if (Intrinsics.c(htmlVideoFile.getUrl(), str)) {
                    break;
                }
            }
        }
        htmlVideoFile = null;
        if (htmlVideoFile == null) {
            InterfaceC3880x9 interfaceC3880x9 = this.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("HtmlMediaPlayer", "start() called before successful load – ignoring");
                return;
            }
            return;
        }
        if (!this.g.get()) {
            this.g.set(true);
            g9i L = xw3.L(this.c, null, null, new C7(new F7(this.C), null, this), 3);
            List list = this.k;
            list.getClass();
            list.add(L);
        }
        if (!this.f.get()) {
            this.f.set(true);
            if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                ((vg6) this.p).s(this.B);
            } else {
                xw3.L(this.c, null, null, new A7(null, this), 3);
            }
        }
        if (this.e.getAutoplay()) {
            d();
        }
    }

    public final void f() {
        if (this.h.get()) {
            return;
        }
        if (b() == Jg.STATE_PLAYING) {
            c();
        }
        if (this.f.get()) {
            this.f.set(false);
            if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                ((vg6) this.p).z(this.B);
            } else {
                xw3.L(this.c, null, null, new Q7(null, this), 3);
            }
        }
        this.x.a();
        this.g.set(false);
        X4.a(this.k);
    }

    public final void a(AbstractC3712qm abstractC3712qm) {
        xw3.L(this.c, null, null, new O7(this, abstractC3712qm, null), 3);
    }

    public final HtmlVideoPlaybackState a() {
        String str;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        int ordinal = b().ordinal();
        if (ordinal == 2) {
            EnumC3723r8[] enumC3723r8Arr = EnumC3723r8.a;
            str = U3.i.s;
        } else if (ordinal == 3) {
            EnumC3723r8[] enumC3723r8Arr2 = EnumC3723r8.a;
            str = U3.i.f0;
        } else if (ordinal == 4) {
            EnumC3723r8[] enumC3723r8Arr3 = EnumC3723r8.a;
            str = U3.i.e0;
        } else if (ordinal == 5) {
            EnumC3723r8[] enumC3723r8Arr4 = EnumC3723r8.a;
            str = U3.i.h0;
        } else if (ordinal != 6) {
            EnumC3723r8[] enumC3723r8Arr5 = EnumC3723r8.a;
            str = "loading";
        } else {
            EnumC3723r8[] enumC3723r8Arr6 = EnumC3723r8.a;
            str = U3.i.t;
        }
        htmlVideoPlaybackState.setState(str);
        htmlVideoPlaybackState.setDuration(((vg6) this.p).getDuration() / 1000.0f);
        htmlVideoPlaybackState.setTime(((vg6) this.p).getCurrentPosition() / 1000.0f);
        htmlVideoPlaybackState.setMuted(this.y.e);
        return htmlVideoPlaybackState;
    }

    public final void a(VideoViewPosition videoViewPosition) {
        videoViewPosition.getClass();
        if (this.h.get()) {
            return;
        }
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            TransitionManager.beginDelayedTransition(this.n);
            this.e.setVideoViewPosition(videoViewPosition);
            int b = (int) (R5.b() * videoViewPosition.getWidth());
            int b2 = (int) (R5.b() * videoViewPosition.getHeight());
            K1 k1 = this.n;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b2);
            if (this.e.getVideoViewPosition() != null) {
                layoutParams.setMargins((int) (R5.b() * videoViewPosition.getX()), (int) (R5.b() * videoViewPosition.getY()), 0, 0);
            }
            k1.setLayoutParams(layoutParams);
            if (this.i > 0 && this.j > 0) {
                K1 k12 = this.n;
                int i = this.i;
                int i2 = this.j;
                k12.getClass();
                if (i > 0 && i2 > 0) {
                    k12.a = i / i2;
                    k12.requestLayout();
                }
            }
            this.n.requestLayout();
            return;
        }
        xw3.L(this.c, null, null, new U7(null, this, videoViewPosition), 3);
    }

    public final void a(AbstractC3594m8 abstractC3594m8) {
        Surface surface;
        if (abstractC3594m8 instanceof C3620n8) {
            C3620n8 c3620n8 = (C3620n8) abstractC3594m8;
            this.q = c3620n8.a;
            this.v = null;
            if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                this.l.set(Jg.STATE_PREPARED);
                ((g51) this.p).M(5, 0L);
                C3853w8 c3853w8 = this.z;
                if (!c3853w8.g && (surface = c3853w8.e) != null) {
                    c3853w8.g = true;
                    ((vg6) c3853w8.b).d0(surface);
                }
                HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
                htmlVideoPlaybackState.setDuration(c3620n8.b / 1000.0f);
                htmlVideoPlaybackState.setVideoUrl(c3620n8.a);
                htmlVideoPlaybackState.setLatency(Long.valueOf(System.currentTimeMillis() - this.u));
                htmlVideoPlaybackState.setMuted(this.y.e);
                EnumC3723r8[] enumC3723r8Arr = EnumC3723r8.a;
                htmlVideoPlaybackState.setState(U3.i.s);
                htmlVideoPlaybackState.setTime(((vg6) this.p).getCurrentPosition() / 1000.0f);
                a(new C3646o8(htmlVideoPlaybackState, c3620n8.c));
                return;
            }
            xw3.L(this.c, null, null, new H7(null, this, c3620n8), 3);
            return;
        }
        if (abstractC3594m8 instanceof C3542k8) {
            this.l.set(Jg.STATE_ERROR);
            this.v = null;
            a(new C3516j8(this.a, ((C3542k8) abstractC3594m8).a.a.a));
            return;
        }
        zzl.b();
    }
}
