package com.vk.media.player.video.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.VideoView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.player.video.VideoScale;
import java.util.Objects;
import xsna.a4t0;
import xsna.f5b0;

/* loaded from: classes3.dex */
public class SystemVideoView extends TextureView {
    public static final /* synthetic */ int z = 0;
    public int b;
    public int c;
    public final Context d;
    public MediaPlayer e;
    public Surface f;
    public MediaPlayer.OnInfoListener g;
    public MediaPlayer.OnCompletionListener h;
    public MediaPlayer.OnErrorListener i;
    public MediaPlayer.OnPreparedListener j;
    public final a4t0 k;
    public final VideoScale l;
    public Uri m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;
    public final b s;
    public final c t;
    public final d u;
    public final e v;
    public final f w;
    public final g x;
    public final h y;

    public class a implements a4t0.a {
        public a() {
        }

        @Override // xsna.a4t0.a
        public final void a() {
            MediaPlayer mediaPlayer = SystemVideoView.this.e;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }

        @Override // xsna.a4t0.a
        public final void b() {
            SystemVideoView systemVideoView = SystemVideoView.this;
            if (systemVideoView.e != null) {
                systemVideoView.h();
            }
        }
    }

    public class b implements MediaPlayer.OnVideoSizeChangedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int videoWidth = mediaPlayer.getVideoWidth();
            SystemVideoView systemVideoView = SystemVideoView.this;
            systemVideoView.n = videoWidth;
            int videoHeight = mediaPlayer.getVideoHeight();
            systemVideoView.o = videoHeight;
            if (systemVideoView.n == 0 || videoHeight == 0) {
                return;
            }
            systemVideoView.requestLayout();
            systemVideoView.l.d(systemVideoView, systemVideoView.n, systemVideoView.o);
        }
    }

    public class c implements MediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            int i;
            SystemVideoView systemVideoView = SystemVideoView.this;
            systemVideoView.b = 2;
            MediaPlayer.OnPreparedListener onPreparedListener = systemVideoView.j;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(mediaPlayer);
            }
            systemVideoView.n = mediaPlayer.getVideoWidth();
            systemVideoView.o = mediaPlayer.getVideoHeight();
            systemVideoView.g(systemVideoView.r);
            int i2 = systemVideoView.n;
            if (i2 == 0 || (i = systemVideoView.o) == 0) {
                if (systemVideoView.c == 3) {
                    systemVideoView.i();
                }
            } else {
                systemVideoView.l.d(systemVideoView, i2, i);
                if (systemVideoView.c == 3) {
                    systemVideoView.i();
                }
            }
        }
    }

    public class d implements MediaPlayer.OnCompletionListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            SystemVideoView systemVideoView = SystemVideoView.this;
            systemVideoView.b = 5;
            systemVideoView.c = 5;
            MediaPlayer.OnCompletionListener onCompletionListener = systemVideoView.h;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(systemVideoView.e);
            }
        }
    }

    public class e implements MediaPlayer.OnInfoListener {
        public e() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayer.OnInfoListener onInfoListener = SystemVideoView.this.g;
            if (onInfoListener != null) {
                return onInfoListener.onInfo(mediaPlayer, i, i2);
            }
            return true;
        }
    }

    public class f implements MediaPlayer.OnErrorListener {
        public f() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            int i3 = SystemVideoView.z;
            SystemVideoView systemVideoView = SystemVideoView.this;
            systemVideoView.b = -1;
            systemVideoView.c = -1;
            MediaPlayer.OnErrorListener onErrorListener = systemVideoView.i;
            if (onErrorListener != null) {
                return onErrorListener.onError(systemVideoView.e, i, i2);
            }
            return true;
        }
    }

    public SystemVideoView(Context context) {
        super(context);
        this.b = 0;
        this.c = 0;
        this.k = new a4t0(new a());
        this.l = new VideoScale();
        this.p = true;
        this.q = true;
        this.r = 1;
        this.s = new b();
        this.t = new c();
        this.u = new d();
        this.v = new e();
        this.w = new f();
        this.x = new g();
        this.y = new h();
        this.d = context;
        this.o = 0;
        this.n = 0;
        setFocusable(false);
        setSurfaceTextureListener(this.y);
        this.b = 0;
        this.c = 0;
        setScaleType(VideoScale.ScaleType.FIT_CENTER);
    }

    public final boolean a() {
        int i;
        return (this.e == null || (i = this.b) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final boolean b() {
        return a() && this.e.isPlaying();
    }

    public final void c() {
        if (this.m == null || this.f == null) {
            return;
        }
        boolean z2 = this.p;
        Context context = this.d;
        if (z2) {
            Intent intent = new Intent("com.android.music.musicservicecommand");
            intent.putExtra("command", "pause");
            context.sendBroadcast(intent);
            AudioManager a2 = f5b0.a(getContext());
            a4t0 a4t0Var = this.k;
            if (a2.requestAudioFocus(a4t0Var, 3, 1) == 1) {
                a4t0Var.onAudioFocusChange(1);
            } else {
                a4t0Var.onAudioFocusChange(-1);
            }
        }
        e();
        try {
            this.e = new MediaPlayer();
            h();
            this.e.setOnPreparedListener(this.t);
            this.e.setOnVideoSizeChangedListener(this.s);
            this.e.setOnCompletionListener(this.u);
            this.e.setOnErrorListener(this.w);
            this.e.setOnInfoListener(this.v);
            this.e.setOnBufferingUpdateListener(this.x);
            this.e.setDataSource(context, this.m);
            this.e.setSurface(this.f);
            this.e.setAudioStreamType(3);
            PlaybackParams playbackParams = this.e.getPlaybackParams();
            if (playbackParams == null) {
                playbackParams = new PlaybackParams();
            }
            playbackParams.setSpeed(1.0f);
            this.e.setPlaybackParams(playbackParams);
            this.e.setScreenOnWhilePlaying(true);
            this.e.prepareAsync();
            this.b = 1;
        } catch (Exception unused) {
            this.b = -1;
            this.c = -1;
            f();
        }
    }

    public final void d() {
        if (a() && this.e.isPlaying()) {
            this.e.pause();
            this.b = 4;
        }
        this.c = 4;
    }

    public final void e() {
        if (this.e != null) {
            f();
            this.b = 0;
        }
    }

    public final void f() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                try {
                    this.e.stop();
                } catch (Exception e2) {
                    e2.toString();
                }
            }
            try {
                this.e.reset();
            } catch (Exception e3) {
                e3.toString();
            }
            this.e.release();
            this.e = null;
        }
    }

    public final void g(int i) {
        if (a()) {
            this.e.seekTo(i);
        }
    }

    public int getCurrentPosition() {
        if (a()) {
            return this.e.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (a()) {
            return this.e.getDuration();
        }
        return -1;
    }

    public int getStartTime() {
        return this.r;
    }

    public int getVideoHeight() {
        return this.o;
    }

    public int getVideoWidth() {
        return this.n;
    }

    public final void h() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            boolean z2 = this.p;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = z2 ? 1.0f : 0.0f;
            if (z2) {
                f2 = 1.0f;
            }
            mediaPlayer.setVolume(f3, f2);
        }
    }

    public final void i() {
        if (a()) {
            this.e.setLooping(this.q);
            this.e.start();
            this.b = 3;
        }
        this.c = 3;
    }

    public final void j() {
        if (this.e != null) {
            f();
            this.b = 0;
            this.c = 0;
        }
        f5b0.a(getContext()).abandonAudioFocus(this.k);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoView.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoView.class.getName());
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l.d(this, this.n, this.o);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if ((i == 4 || i == 8) && b()) {
            j();
        }
    }

    public void setLoop(boolean z2) {
        this.q = z2;
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.h = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.i = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.g = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.j = onPreparedListener;
    }

    public void setScaleType(VideoScale.ScaleType scaleType) {
        VideoScale videoScale = this.l;
        if (videoScale.a != scaleType) {
            videoScale.a = scaleType;
            setWillNotCacheDrawing(scaleType == VideoScale.ScaleType.CENTER);
            requestLayout();
            invalidate();
            videoScale.d(this, this.n, this.o);
        }
    }

    public void setSound(boolean z2) {
        this.p = z2;
        h();
    }

    public void setStartTime(int i) {
        this.r = i;
    }

    public void setVideoPath(String str) {
        if (str != null) {
            setVideoURI(Uri.parse(str));
        }
    }

    public void setVideoURI(Uri uri) {
        this.m = uri;
        c();
        requestLayout();
        invalidate();
    }

    public SystemVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
        this.k = new a4t0(new a());
        this.l = new VideoScale();
        this.p = true;
        this.q = true;
        this.r = 1;
        this.s = new b();
        this.t = new c();
        this.u = new d();
        this.v = new e();
        this.w = new f();
        this.x = new g();
        this.y = new h();
        this.d = context;
        this.o = 0;
        this.n = 0;
        setFocusable(false);
        setSurfaceTextureListener(this.y);
        this.b = 0;
        this.c = 0;
        setScaleType(VideoScale.ScaleType.FIT_CENTER);
    }

    public class h implements TextureView.SurfaceTextureListener {
        public h() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface surface = new Surface(surfaceTexture);
            SystemVideoView systemVideoView = SystemVideoView.this;
            systemVideoView.f = surface;
            systemVideoView.c();
            int i3 = SystemVideoView.z;
            Objects.toString(systemVideoView.f);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i = SystemVideoView.z;
            SystemVideoView systemVideoView = SystemVideoView.this;
            Objects.toString(systemVideoView.f);
            systemVideoView.f();
            Surface surface = systemVideoView.f;
            if (surface == null) {
                return true;
            }
            surface.release();
            systemVideoView.f = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SystemVideoView systemVideoView = SystemVideoView.this;
            boolean z = false;
            boolean z2 = systemVideoView.c == 3;
            if (systemVideoView.n == i && systemVideoView.o == i2) {
                z = true;
            }
            if (systemVideoView.e != null && z2 && z) {
                systemVideoView.i();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class g implements MediaPlayer.OnBufferingUpdateListener {
        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        }
    }
}
