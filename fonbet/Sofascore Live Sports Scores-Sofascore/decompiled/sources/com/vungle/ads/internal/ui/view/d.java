package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.ui.view.d;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.nativead.NativeVideoListener;
import defpackage.an5;
import defpackage.e6;
import defpackage.llf;
import defpackage.lnb;
import defpackage.p2g;
import defpackage.p61;
import defpackage.q2m;
import defpackage.u2g;
import defpackage.w2g;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d extends FrameLayout implements TextureView.SurfaceTextureListener {
    public boolean a;
    public final ViewTreeObserver.OnScrollChangedListener b;
    public final ViewTreeObserver.OnGlobalLayoutListener c;
    public float d;
    public TextureView e;
    public Surface f;
    public MediaPlayer g;
    public Uri h;
    public AtomicBoolean i;
    public AtomicBoolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public com.vungle.ads.nativead.b t;
    public b u;
    public int v;
    public final Handler w;
    public final a x;
    public Function0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = new p61(2, this);
        this.c = new e6(2, this);
        this.d = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.e = textureView;
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.v = -1;
        this.w = new Handler(Looper.getMainLooper());
        this.x = new a(this);
        this.y = c.a;
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.e, new FrameLayout.LayoutParams(-1, -1));
    }

    public static final void a(d dVar, MediaPlayer mediaPlayer) {
        Surface surface;
        dVar.getClass();
        com.vungle.ads.nativead.b bVar = dVar.t;
        if (bVar != null) {
            ((n) bVar).b();
        }
        dVar.n = mediaPlayer.getDuration();
        dVar.j.set(false);
        dVar.i.set(true);
        int i = dVar.m;
        if (i > 0) {
            mediaPlayer.seekTo(i);
        }
        float f = dVar.o ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        MediaPlayer mediaPlayer2 = dVar.g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(f, f);
        }
        boolean z = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onPrepared(): duration=");
        a.append(dVar.n);
        a.append(" ms lastPos=");
        a.append(dVar.m);
        a.append(" wantPlay=");
        a.append(dVar.k);
        t.a("NativeAd-Video", a.toString());
        if (dVar.k && (surface = dVar.f) != null && surface.isValid()) {
            t.a("NativeAd-Video", "start video on prepared.");
            mediaPlayer.start();
            dVar.f();
        }
    }

    public static final void b(d dVar, MediaPlayer mediaPlayer) {
        dVar.getClass();
        boolean z = u.a;
        t.a("NativeAd-Video", "onCompletion()");
        dVar.m = dVar.n;
        dVar.q = true;
        dVar.w.removeCallbacks(dVar.x);
        dVar.b();
        dVar.v = 100;
        com.vungle.ads.nativead.b bVar = dVar.t;
        if (bVar != null) {
            ((n) bVar).a(100);
        }
        com.vungle.ads.nativead.b bVar2 = dVar.t;
        if (bVar2 != null) {
            n nVar = (n) bVar2;
            r1.a(nVar.getInternal(), "video.close");
            nVar.getInternal().a(3, (Map) null);
            NativeVideoListener nativeVideoListener = nVar.getNativeVideoListener();
            if (nativeVideoListener != null) {
                nativeVideoListener.onVideoEnd();
            }
        }
    }

    public final void c() {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.a) {
            if (!e() || !this.k || this.l) {
                if (this.i.get() && (mediaPlayer = this.g) != null && mediaPlayer.isPlaying()) {
                    boolean z = u.a;
                    t.a("NativeAd-Video", "auto-pause: visibility NOT enough");
                    g();
                    return;
                }
                return;
            }
            if (!this.i.get() || (surface = this.f) == null || !surface.isValid()) {
                k();
                return;
            }
            MediaPlayer mediaPlayer2 = this.g;
            if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.q) {
                boolean z2 = u.a;
                StringBuilder a = com.iab.omid.library.vungle.internal.l.a("auto-resume: visibility OK, start() at pos=");
                MediaPlayer mediaPlayer3 = this.g;
                a.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                a.append(" ms");
                t.a("NativeAd-Video", a.toString());
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                f();
            }
        }
    }

    public final void d() {
        if (this.g != null) {
            return;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) this.y.invoke();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: m2m
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                d.a(d.this, mediaPlayer2);
            }
        });
        mediaPlayer.setOnVideoSizeChangedListener(new q2m(this, 0));
        mediaPlayer.setOnCompletionListener(new an5(this, 1));
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: r2m
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return d.b(d.this, mediaPlayer2, i, i2);
            }
        });
        this.g = mediaPlayer;
    }

    public final boolean e() {
        if (!isShown()) {
            return false;
        }
        if (!getGlobalVisibleRect(new Rect())) {
            return false;
        }
        long height = getHeight() * getWidth();
        return height > 0 && ((float) (r0.height() * r0.width())) / ((float) height) >= this.d;
    }

    public final void f() {
        NativeVideoListener nativeVideoListener;
        this.w.removeCallbacks(this.x);
        this.w.post(this.x);
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar == null || (nativeVideoListener = ((n) bVar).getNativeVideoListener()) == null) {
            return;
        }
        nativeVideoListener.onVideoPlay();
    }

    public final void g() {
        Object u2gVar;
        NativeVideoListener nativeVideoListener;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null && this.i.get() && mediaPlayer.isPlaying()) {
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("pauseInternal(): pos=");
            a.append(mediaPlayer.getCurrentPosition());
            a.append(" ms");
            t.a("NativeAd-Video", a.toString());
            mediaPlayer.pause();
            this.w.removeCallbacks(this.x);
            b();
            com.vungle.ads.nativead.b bVar = this.t;
            if (bVar != null && (nativeVideoListener = ((n) bVar).getNativeVideoListener()) != null) {
                nativeVideoListener.onVideoPause();
            }
        } else {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.m);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Object valueOf = Integer.valueOf(this.m);
        if (u2gVar instanceof u2g) {
            u2gVar = valueOf;
        }
        this.m = ((Number) u2gVar).intValue();
    }

    public final int getCurrentPositionMs() {
        Object u2gVar;
        if (!this.i.get()) {
            int i = this.m;
            if (i < 0) {
                return 0;
            }
            return i;
        }
        try {
            p2g p2gVar = w2g.b;
            MediaPlayer mediaPlayer = this.g;
            u2gVar = Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.m);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Object valueOf = Integer.valueOf(this.m);
        if (u2gVar instanceof u2g) {
            u2gVar = valueOf;
        }
        int intValue = ((Number) u2gVar).intValue();
        if (intValue < 0) {
            return 0;
        }
        return intValue;
    }

    public final int getDurationMs() {
        return this.n;
    }

    @NotNull
    public final Function0<MediaPlayer> getMediaPlayerFactory$vungle_ads_release() {
        return this.y;
    }

    @Nullable
    public final Surface getSurface$vungle_ads_release() {
        return this.f;
    }

    @NotNull
    public final TextureView getTexture$vungle_ads_release() {
        return this.e;
    }

    public final void h() {
        this.l = true;
        g();
    }

    public final void i() {
        Surface surface;
        this.k = true;
        this.l = false;
        this.q = false;
        boolean z = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("play(): prepared=");
        a.append(this.i);
        a.append(", surfaceValid=");
        Surface surface2 = this.f;
        a.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        a.append(", visible=");
        a.append(e());
        t.a("NativeAd-Video", a.toString());
        if (!this.i.get() || (surface = this.f) == null || !surface.isValid() || !e()) {
            k();
            return;
        }
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("play(): pos=");
            MediaPlayer mediaPlayer2 = this.g;
            a2.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
            a2.append(" ms");
            t.a("NativeAd-Video", a2.toString());
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.start();
            }
            f();
        }
    }

    public final void j() {
        if (this.k && this.l && !this.q) {
            i();
        }
    }

    public final void k() {
        Object u2gVar;
        Uri uri;
        try {
            p2g p2gVar = w2g.b;
            uri = this.h;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (uri != null && !this.i.get() && !this.j.get()) {
            d();
            this.j.set(true);
            this.i.set(false);
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = this.g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setLooping(this.p);
            }
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setSurface(this.f);
            }
            MediaPlayer mediaPlayer4 = this.g;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setDataSource(getContext(), uri);
            }
            boolean z = u.a;
            StringBuilder sb = new StringBuilder("prepareAsync(): uri=");
            sb.append(uri);
            sb.append(", surfaceValid=");
            Surface surface = this.f;
            u2gVar = null;
            sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
            t.a("NativeAd-Video", sb.toString());
            MediaPlayer mediaPlayer5 = this.g;
            if (mediaPlayer5 != null) {
                mediaPlayer5.prepareAsync();
                u2gVar = Unit.a;
            }
            Throwable a = w2g.a(u2gVar);
            if (a != null) {
                String valueOf = String.valueOf(a.getLocalizedMessage());
                com.vungle.ads.nativead.b bVar = this.t;
                if (bVar != null) {
                    ((n) bVar).a(valueOf, -1);
                }
            }
        }
    }

    public final void l() {
        Object u2gVar;
        Object u2gVar2;
        Object u2gVar3;
        boolean z = u.a;
        t.a("NativeAd-Video", "release()");
        StringBuilder sb = new StringBuilder("pause() at pos=");
        MediaPlayer mediaPlayer = this.g;
        sb.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb.append(" ms");
        t.a("NativeAd-Video", sb.toString());
        this.l = true;
        this.k = false;
        g();
        this.w.removeCallbacks(this.x);
        try {
            p2g p2gVar = w2g.b;
            MediaPlayer mediaPlayer2 = this.g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setSurface(null);
                u2gVar = Unit.a;
            } else {
                u2gVar = null;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "Failed to clear Surface", a);
        }
        try {
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.stop();
                u2gVar2 = Unit.a;
            } else {
                u2gVar2 = null;
            }
        } catch (Throwable th2) {
            p2g p2gVar3 = w2g.b;
            u2gVar2 = new u2g(th2);
        }
        Throwable a2 = w2g.a(u2gVar2);
        if (a2 != null) {
            boolean z3 = u.a;
            t.a("NativeAd-Video", "Failed to stop MediaPlayer", a2);
        }
        try {
            MediaPlayer mediaPlayer4 = this.g;
            if (mediaPlayer4 != null) {
                mediaPlayer4.release();
                u2gVar3 = Unit.a;
            } else {
                u2gVar3 = null;
            }
        } catch (Throwable th3) {
            p2g p2gVar4 = w2g.b;
            u2gVar3 = new u2g(th3);
        }
        Throwable a3 = w2g.a(u2gVar3);
        if (a3 != null) {
            boolean z4 = u.a;
            t.a("NativeAd-Video", "Failed to release MediaPlayer", a3);
        }
        this.g = null;
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
        this.i.set(false);
        this.j.set(false);
    }

    public final void m() {
        boolean z = u.a;
        t.a("NativeAd-Video", "setAutoVisibility enabled=true threshold=0.01");
        this.a = true;
        this.d = llf.b(0.01f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z = u.a;
        t.a("NativeAd-Video", "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.b);
        getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z = u.a;
        t.a("NativeAd-Video", "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.b);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
        g();
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Object u2gVar;
        surfaceTexture.getClass();
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(surfaceTexture);
        this.f = surface2;
        try {
            p2g p2gVar = w2g.b;
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface2);
                u2gVar = Unit.a;
            } else {
                u2gVar = null;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            boolean z = u.a;
            t.a("NativeAd-Video", "Failed to set surface", a);
        }
        boolean z2 = u2gVar instanceof u2g;
        boolean z3 = u.a;
        StringBuilder s = lnb.s(i, i2, "onSurfaceTextureAvailable(): ", " x ", ", prepared=");
        s.append(this.i);
        s.append(", wantPlay=");
        s.append(this.k);
        s.append(", surfaceRet=");
        s.append(!z2);
        t.a("NativeAd-Video", s.toString());
        if (!z2 && this.i.get() && this.k) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("onSurfaceTextureAvailable and videoCompleted=");
            a2.append(this.q);
            t.a("NativeAd-Video", a2.toString());
            if (this.q) {
                int i3 = this.n;
                if (i3 < 0) {
                    i3 = 0;
                }
                this.m = i3;
                StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("seekTo ");
                a3.append(this.m);
                t.a("NativeAd-Video", a3.toString());
                if (this.i.get()) {
                    MediaPlayer mediaPlayer2 = this.g;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.seekTo(this.m);
                    }
                    b();
                }
                MediaPlayer mediaPlayer3 = this.g;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.pause();
                }
            } else {
                MediaPlayer mediaPlayer5 = this.g;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.start();
                }
                f();
            }
        } else {
            k();
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Object u2gVar;
        surfaceTexture.getClass();
        boolean z = u.a;
        t.a("NativeAd-Video", "onSurfaceTextureDestroyed()");
        g();
        try {
            p2g p2gVar = w2g.b;
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                u2gVar = Unit.a;
            } else {
                u2gVar = null;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "Failed to clear surface", a);
        }
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
        this.w.removeCallbacks(this.x);
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        boolean z = u.a;
        t.a("NativeAd-Video", "onSurfaceTextureSizeChanged() width=" + i + " height=" + i2);
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    public final void setLooping(boolean z) {
        boolean z2 = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("setLooping to ");
        a.append(this.p);
        t.a("NativeAd-Video", a.toString());
        this.p = z;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(z);
    }

    public final void setMediaPlayerFactory$vungle_ads_release(@NotNull Function0<? extends MediaPlayer> function0) {
        function0.getClass();
        this.y = function0;
    }

    public final void setMuted(boolean z) {
        boolean z2 = u.a;
        t.a("NativeAd-Video", "setMuted to " + z);
        this.o = z;
        float f = z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar != null) {
            n nVar = (n) bVar;
            if (z) {
                r1.a(nVar.getInternal(), "video.mute");
                nVar.getInternal().a(9, (Map) null);
                NativeVideoListener nativeVideoListener = nVar.getNativeVideoListener();
                if (nativeVideoListener != null) {
                    nativeVideoListener.onVideoMute();
                    return;
                }
                return;
            }
            r1.a(nVar.getInternal(), "video.unmute");
            nVar.getInternal().a(10, (Map) null);
            NativeVideoListener nativeVideoListener2 = nVar.getNativeVideoListener();
            if (nativeVideoListener2 != null) {
                nativeVideoListener2.onVideoUnmute();
            }
        }
    }

    public final void setSource(@NotNull Uri uri) {
        uri.getClass();
        this.h = uri;
        this.i.set(false);
        this.j.set(false);
        this.r = 0;
        this.s = 0;
        k();
    }

    public final void setSurface$vungle_ads_release(@Nullable Surface surface) {
        this.f = surface;
    }

    public final void setTexture$vungle_ads_release(@NotNull TextureView textureView) {
        textureView.getClass();
        this.e = textureView;
    }

    public final void setVideoLifecycleCallback(@NotNull com.vungle.ads.nativead.b bVar) {
        bVar.getClass();
        this.t = bVar;
    }

    public final void setVideoTransformCallback$vungle_ads_release(@Nullable b bVar) {
        this.u = bVar;
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    public static final void b(d dVar) {
        dVar.getClass();
        dVar.c();
    }

    public static final boolean b(d dVar, MediaPlayer mediaPlayer, int i, int i2) {
        dVar.getClass();
        boolean z = u.a;
        t.c("NativeAd-Video", "onError(): what=" + i + ", extra=" + i2);
        dVar.j.set(false);
        dVar.i.set(false);
        String valueOf = String.valueOf(i2);
        com.vungle.ads.nativead.b bVar = dVar.t;
        if (bVar == null) {
            return true;
        }
        ((n) bVar).a(valueOf, i);
        return true;
    }

    public final void b() {
        int c;
        int i = this.n;
        if (i <= 0 || !this.i.get() || (c = llf.c((int) ((getCurrentPositionMs() * 100) / i), 0, 100)) == this.v) {
            return;
        }
        this.v = c;
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar != null) {
            ((n) bVar).a(c);
        }
    }

    public /* synthetic */ d(Context context) {
        this(context, null);
    }

    public static final void a(d dVar) {
        dVar.getClass();
        dVar.c();
    }

    public static final void a(d dVar, MediaPlayer mediaPlayer, int i, int i2) {
        dVar.getClass();
        if (i <= 0 || i2 <= 0) {
            return;
        }
        dVar.r = i;
        dVar.s = i2;
        SurfaceTexture surfaceTexture = dVar.e.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        dVar.a();
    }

    public final void a() {
        float f;
        if (this.r <= 0 || this.s <= 0) {
            return;
        }
        int width = this.e.getWidth();
        int height = this.e.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = this.r / this.s;
        Matrix matrix = new Matrix();
        if (f4 > f5) {
            f = f3 / this.s;
        } else {
            f = f2 / this.r;
        }
        matrix.setScale((this.r * f) / f2, (this.s * f) / f3, f2 / 2.0f, f3 / 2.0f);
        this.e.setTransform(matrix);
        this.e.invalidate();
        float f6 = (f2 - (this.r * f)) / 2.0f;
        float f7 = (f3 - (this.s * f)) / 2.0f;
        b bVar = this.u;
        if (bVar != null) {
            bVar.a(this.e.getX() + f6, this.e.getY() + f7);
        }
    }
}
