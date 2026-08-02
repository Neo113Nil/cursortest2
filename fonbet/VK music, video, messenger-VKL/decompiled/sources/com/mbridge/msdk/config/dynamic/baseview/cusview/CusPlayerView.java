package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;
import xsna.kft0;

/* loaded from: classes13.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";
    private com.mbridge.msdk.config.dynamic.baseview.video.b a;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private SurfaceHolder g;
    protected float h;
    protected float i;
    protected int j;
    private boolean k;
    private MediaEvents l;
    private String m;
    private int n;
    private AudioManager o;
    private AudioManager.OnAudioFocusChangeListener p;
    private boolean q;
    private boolean r;
    private boolean s;
    private AspectRatioFrameLayout t;
    private final com.mbridge.msdk.config.dynamic.baseview.video.c u;

    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            CusPlayerView.this.a(i);
        }
    }

    public class c implements SurfaceHolder.Callback {
        private c() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.a != null && surfaceHolder != null && CusPlayerView.this.g != surfaceHolder) {
                    CusPlayerView.this.g = surfaceHolder;
                    CusPlayerView.this.a.a(surfaceHolder);
                }
                CusPlayerView.this.d = false;
            } catch (Exception e) {
                q0.b("PlayerView", e.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.g = surfaceHolder;
                CusPlayerView.this.a.a(surfaceHolder);
            } catch (Exception e) {
                q0.b("PlayerView", e.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.d = true;
                CusPlayerView.this.f = true;
                CusPlayerView.this.a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e) {
                q0.b("PlayerView", e.getMessage());
            }
        }

        public /* synthetic */ c(CusPlayerView cusPlayerView, a aVar) {
            this();
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.j = 1;
        this.k = false;
        this.m = "";
        this.n = 1;
        this.q = false;
        this.r = false;
        this.s = true;
        this.u = new b();
        b();
    }

    private void d() {
        this.t = new AspectRatioFrameLayout(getContext());
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.g = holder;
        holder.setKeepScreenOn(true);
        this.g.addCallback(new c(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.a = bVar;
        bVar.a(getContext(), this.g);
        this.a.a(this.u);
        this.t.addView(surfaceView, -1, -1);
        setGravity(17);
        this.t.setVisibility(4);
        addView(this.t, -1, -1);
    }

    private boolean e() {
        int i;
        try {
            if (this.o == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z = true;
            if (this.r) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i = 1;
            }
            if (this.o.requestAudioFocus(this.p, 3, i) != 1) {
                z = false;
            }
            this.q = z;
            return z;
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("Error requesting audio focus: "), "PlayerView");
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (this.a.f() && !this.f) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
        }
    }

    public int getCurPosition() {
        long j;
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar;
        try {
            bVar = this.a;
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
        if (bVar != null) {
            j = bVar.c();
            return Math.toIntExact(j);
        }
        j = 0;
        return Math.toIntExact(j);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.m;
    }

    public MediaEvents getVideoEvents() {
        return this.l;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
        return bVar != null ? bVar.e() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void initBufferIngParam(int i) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
        if (bVar != null) {
            bVar.b(i);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.b = str;
        this.a.a(aVar);
        this.a.c(this.b);
        this.c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
            if (bVar != null) {
                if (bVar.g()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.r;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.s;
    }

    public boolean isSilent() {
        return this.a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getRawX();
        this.i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.a == null || this.d || isComplete() || this.e) {
                return;
            }
            q0.c("PlayerView", "onresume========");
            if (this.a.f()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
            if (bVar != null) {
                bVar.m();
            }
            pauseOmsdk();
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.l == null || this.k) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.k = true;
            this.l.pause();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean playVideo(int i) {
        try {
            if (this.a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.s) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.a.j();
                }
            }
            this.a.a(i);
            this.f = false;
            return true;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.l != null) {
                this.l = null;
            }
            a();
            if (this.g != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.g.getSurface().release();
            }
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.l;
            if (mediaEvents != null) {
                this.k = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void seekTo(int i) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
            if (bVar != null) {
                bVar.a(i);
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsCovered(boolean z) {
        try {
            this.e = z;
            q0.b("PlayerView", "mIsCovered:" + z);
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i) {
        this.r = i == 1;
    }

    public void setPlayWithoutAudioFocus(boolean z) {
        this.s = z;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z);
    }

    public void setPlaybackParams(float f) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
        if (bVar != null) {
            bVar.a(f);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.m = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.l = mediaEvents;
    }

    public void setVideoGravity(int i) {
        if (this.n == i) {
            return;
        }
        this.n = i;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.t;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i);
        }
    }

    public void setVolume(float f, float f2) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
        if (bVar != null) {
            bVar.a(f, f2);
        }
    }

    public void start(boolean z) {
        try {
            if (this.a != null) {
                if (z) {
                    if (e()) {
                        this.a.t();
                    } else {
                        this.a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
                if (bVar == null || this.e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    public void stop() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.l != null) {
                this.l = null;
            }
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    private void c() {
        try {
            this.o = (AudioManager) getContext().getSystemService("audio");
            this.p = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("Failed to initialize AudioManager: "), "PlayerView");
        }
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e) {
            q0.b("PlayerView", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        try {
            if (i == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                    return;
                }
                return;
            }
            if (i == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.a;
                if (bVar2 == null || !bVar2.h()) {
                    return;
                }
                this.a.m();
                return;
            }
            if (i == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.a;
                if (bVar3 == null || !bVar3.h()) {
                    return;
                }
                this.a.m();
                return;
            }
            if (i != 1) {
                return;
            }
            q0.c("PlayerView", "Audio focus gained");
            this.q = true;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.a;
            if (bVar4 != null) {
                bVar4.a(1.0f, 1.0f);
                if (this.a.h()) {
                    return;
                }
                this.a.n();
            }
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("Error handling audio focus change: "), "PlayerView");
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    public class b implements com.mbridge.msdk.config.dynamic.baseview.video.c {
        public b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void a(float f) {
            if (CusPlayerView.this.t != null) {
                CusPlayerView.this.t.setAspectRatio(f);
                if (CusPlayerView.this.t.getVisibility() != 0) {
                    CusPlayerView.this.t.setVisibility(0);
                }
            }
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void onRenderedFirstFrame() {
        }
    }

    private void a() {
        try {
            AudioManager audioManager = this.o;
            if (audioManager == null || !this.q) {
                return;
            }
            int abandonAudioFocus = audioManager.abandonAudioFocus(this.p);
            this.q = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + abandonAudioFocus);
        } catch (Exception e) {
            kft0.a(e, new StringBuilder("Error abandoning audio focus: "), "PlayerView");
        }
    }
}
