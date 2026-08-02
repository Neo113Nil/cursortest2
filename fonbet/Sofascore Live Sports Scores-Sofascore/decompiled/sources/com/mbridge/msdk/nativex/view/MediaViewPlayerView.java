package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {
    private static Handler L = new Handler();
    private String A;
    private String B;
    private CampaignEx C;
    private com.mbridge.msdk.nativex.listener.a D;
    private Timer E;
    private com.mbridge.msdk.videocommon.download.a F;
    private VideoNativePlayer G;
    private h H;
    private AdSession I;
    private MediaEvents J;
    private boolean K;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private volatile int l;
    private boolean m;
    private boolean n;
    private TextureView o;
    private LinearLayout p;
    private Surface q;
    private ProgressBar r;
    private MyImageView s;
    private ImageView t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private View x;
    private AnimationDrawable y;
    private AlphaAnimation z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                boolean z = MediaViewPlayerView.this.k;
                MediaViewPlayerView mediaViewPlayerView = MediaViewPlayerView.this;
                if (z) {
                    mediaViewPlayerView.closeSound();
                    if (MediaViewPlayerView.this.D != null) {
                        MediaViewPlayerView.this.D.b();
                        return;
                    }
                    return;
                }
                mediaViewPlayerView.openSound();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.a();
                }
            } catch (Throwable th) {
                q0.b("MediaViewPlayerView", th.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                MediaViewPlayerView.this.pause();
                MediaViewPlayerView.this.t.setVisibility(0);
                MediaViewPlayerView.this.n();
                MediaViewPlayerView.this.c();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.c();
                }
                MediaViewPlayerView.this.e = true;
            } catch (Throwable th) {
                q0.b("MediaViewPlayerView", th.getMessage(), th);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaViewPlayerView.this.onClickPlayButton();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.c();
                MediaViewPlayerView.this.f();
            } catch (Exception e) {
                q0.b("MediaViewPlayerView", e.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g extends TimerTask {
        public g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.gonePauseView();
            } catch (Throwable th) {
                q0.b("MediaViewPlayerView", th.getMessage(), th);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class h {
        private MediaViewPlayerView a;

        public h(MediaViewPlayerView mediaViewPlayerView) {
            this.a = mediaViewPlayerView;
        }

        public void a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.a;
                if (mediaViewPlayerView == null || mediaViewPlayerView.j) {
                    return;
                }
                q0.c("MediaViewPlayerView", "play end and display endcardView");
                this.a.m();
            } catch (Exception e) {
                q0.b("MediaViewPlayerView", e.getMessage());
            }
        }
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = true;
        this.k = false;
        this.l = -1;
        this.m = true;
        this.n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }

    private void a(int i2, int i3) {
        try {
            ProgressBar progressBar = this.r;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                return;
            }
            if (i3 > 0) {
                this.r.setMax(i3);
            }
            if (i2 >= 0) {
                this.r.setProgress(i2 + 1);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void b() {
        try {
            if (URLUtil.isNetworkUrl(this.B)) {
                return;
            }
            String videoUrlEncode = this.C.getVideoUrlEncode();
            if (a1.b(videoUrlEncode)) {
                this.B = videoUrlEncode;
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.u.setVisibility(8);
    }

    private void d() {
        if (this.w.getVisibility() == 0) {
            this.w.setVisibility(8);
        }
    }

    private void e() {
        try {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
            f();
            showProgressView(this.n);
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.t.getVisibility() != 0) {
            this.x.setVisibility(8);
        }
    }

    private void g() {
        try {
            j();
            i();
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    private String getPlayUrl() {
        CampaignEx campaignEx;
        String str;
        try {
            campaignEx = this.C;
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
        }
        if (campaignEx == null) {
            return null;
        }
        try {
            if (this.F == null) {
                if (campaignEx.getAdType() != 287 && this.C.getAdType() != 94) {
                    str = this.C.getId() + this.C.getVideoUrlEncode() + this.C.getBidToken();
                    this.F = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
                }
                str = this.C.getRequestId() + this.C.getId() + this.C.getVideoUrlEncode();
                this.F = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
            }
        } catch (Exception e3) {
            q0.b("MediaViewPlayerView", e3.getMessage());
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.F;
        if (aVar != null && aVar.o() == 5) {
            String p = this.F.p();
            if (new File(p).exists()) {
                return p;
            }
        }
        String videoUrlEncode = this.C.getVideoUrlEncode();
        if (a1.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    private void h() {
        try {
            CampaignEx campaignEx = this.C;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (!a1.a(imageUrl) && getContext() != null) {
                if (!com.mbridge.msdk.foundation.same.image.b.a(getContext()).c(imageUrl)) {
                    com.mbridge.msdk.foundation.same.image.b.a(getContext()).a(imageUrl, new f());
                    return;
                }
                Bitmap b2 = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(imageUrl);
                MyImageView myImageView = this.s;
                if (myImageView == null || b2 == null) {
                    return;
                }
                myImageView.setImageUrl(imageUrl);
                this.s.setImageBitmap(b2);
                this.s.setVisibility(0);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void i() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.G = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    private void j() {
        try {
            a aVar = null;
            View inflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_playerview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            if (inflate != null) {
                this.p = (LinearLayout) inflate.findViewById(i0.a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) inflate.findViewById(i0.a(getContext(), "mbridge_textureview", "id"));
                this.o = textureView;
                textureView.setKeepScreenOn(true);
                this.o.setSurfaceTextureListener(new i(this, aVar));
                this.r = (ProgressBar) inflate.findViewById(i0.a(getContext(), "mbridge_progress", "id"));
                this.s = (MyImageView) inflate.findViewById(i0.a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.t = (ImageView) inflate.findViewById(i0.a(getContext(), "mbridge_iv_play", "id"));
                this.u = (ImageView) inflate.findViewById(i0.a(getContext(), "mbridge_iv_pause", "id"));
                this.v = (ImageView) inflate.findViewById(i0.a(getContext(), "mbridge_iv_sound", "id"));
                this.x = inflate.findViewById(i0.a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) inflate.findViewById(i0.a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.y = animationDrawable;
                animationDrawable.start();
                k();
                addView(inflate, -1, -1);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void k() {
        this.v.setOnClickListener(new a());
        this.u.setOnClickListener(new b());
        this.t.setOnClickListener(new c());
    }

    private void l() {
        ImageView imageView;
        if (this.d || (imageView = this.w) == null || imageView.getVisibility() == 0 || !this.m) {
            return;
        }
        this.w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            this.s.setVisibility(0);
            this.t.setVisibility(0);
            n();
            c();
            this.r.setVisibility(8);
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.x.setVisibility(0);
    }

    private void o() {
        MediaEvents mediaEvents;
        try {
            if (this.G == null) {
                return;
            }
            e();
            boolean z = this.i;
            VideoNativePlayer videoNativePlayer = this.G;
            if (z) {
                videoNativePlayer.start(this.q);
                this.i = false;
            } else {
                videoNativePlayer.start();
            }
            if ((this.f || this.e) && (mediaEvents = this.J) != null) {
                this.f = false;
                mediaEvents.resume();
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        a();
        this.E = new Timer();
        this.E.schedule(new g(), 2000L);
    }

    public void closeSound() {
        this.k = false;
        try {
            if (this.G != null) {
                this.v.setImageResource(i0.a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.G.closeSound();
            }
            try {
                MediaEvents mediaEvents = this.J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            } catch (IllegalArgumentException e2) {
                q0.a("OMSDK", e2.getMessage());
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean curIsFullScreen() {
        return this.d;
    }

    public Campaign getCampaign() {
        return this.C;
    }

    public boolean getIsActiviePause() {
        return this.e;
    }

    public void gonePauseView() {
        Handler handler = L;
        if (handler != null) {
            handler.post(new e());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.loadingViewIsVisible();
            }
            return false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z, VideoPlayerStatusListener videoPlayerStatusListener, com.mbridge.msdk.videocommon.download.a aVar, String str2) {
        try {
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
            this.a = false;
        }
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return false;
        }
        this.B = str;
        this.b = z;
        this.C = campaignEx;
        this.F = aVar;
        this.A = str2;
        this.G.initParameter(campaignEx.getVideoUrlEncode(), true, this.j, this.s, videoPlayerStatusListener);
        h();
        this.a = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public void onClickPlayButton() {
        com.mbridge.msdk.nativex.listener.a aVar;
        try {
            e();
            f();
            setIsComplete(false);
            if (this.f) {
                this.G.play();
            } else if (!hasPrepare() || this.c) {
                q0.c("MediaViewPlayerView", "点击播放 playVideo()");
                this.G.replaySameSource(getContext(), this.B, this.q);
            } else {
                q0.c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.c);
                startOrPlayVideo();
            }
            if (this.e && (aVar = this.D) != null) {
                aVar.d();
            }
            this.e = false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.s;
            if ((myImageView == null || myImageView.getVisibility() != 0) && isPlaying() && (imageView = this.u) != null) {
                if (imageView.getVisibility() == 0) {
                    gonePauseView();
                    a();
                    return;
                }
                AlphaAnimation alphaAnimation = this.z;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                this.z = alphaAnimation2;
                alphaAnimation2.setDuration(300L);
                this.z.setInterpolator(new DecelerateInterpolator());
                this.z.setAnimationListener(new d());
                n();
                this.x.startAnimation(this.z);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.D != null && !TextUtils.isEmpty(this.B)) {
            this.D.a(this.B);
        }
        h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            return;
        }
        try {
            if (this.j) {
                return;
            }
            this.c = true;
            m();
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.c = true;
            m();
            if (this.K) {
                return;
            }
            this.G.play(getContext(), this.B, this.q);
            this.K = true;
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i2, int i3) {
        try {
            e();
            l();
            this.e = false;
            this.c = false;
            this.l = i2;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i2, int i3) {
        a(i2, i3);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.c = true;
            b();
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i2) {
        if (this.D == null || TextUtils.isEmpty(this.B)) {
            return;
        }
        this.D.b(this.B);
    }

    public void openSound() {
        this.k = true;
        try {
            if (this.G != null) {
                this.v.setImageResource(i0.a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.G.openSound();
            }
            try {
                MediaEvents mediaEvents = this.J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (IllegalArgumentException e2) {
                q0.a("OMSDK", e2.getMessage());
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f = true;
            }
            if (this.J != null) {
                q0.b("omsdk", "mediaviewplayerview pause");
                this.J.pause();
            }
            d();
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void playVideo() {
        MediaEvents mediaEvents;
        try {
            if (this.a && this.G != null) {
                if (!this.g) {
                    m();
                    return;
                }
                if ((!TextUtils.isEmpty(this.B) && this.B.startsWith("http")) || this.B.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                    this.B = getPlayUrl();
                }
                e();
                this.G.play(getContext(), this.B, this.q);
                if ((this.f || this.e) && (mediaEvents = this.J) != null) {
                    this.f = false;
                    mediaEvents.resume();
                }
                boolean z = this.k;
                VideoNativePlayer videoNativePlayer = this.G;
                if (z) {
                    videoNativePlayer.openSound();
                } else {
                    videoNativePlayer.closeSound();
                }
                this.c = false;
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void registerView(AdSession adSession) {
        this.I = adSession;
        if (adSession != null) {
            adSession.registerAdView(this);
            LinearLayout linearLayout = this.p;
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            adSession.addFriendlyObstruction(linearLayout, friendlyObstructionPurpose, null);
            adSession.addFriendlyObstruction(this.r, friendlyObstructionPurpose, null);
            MyImageView myImageView = this.s;
            FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            adSession.addFriendlyObstruction(myImageView, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.t, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.u, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.v, friendlyObstructionPurpose, null);
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.G = null;
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z) {
        this.j = z;
    }

    public void setEnterFullScreen() {
        try {
            q0.c("MediaViewPlayerView", "setEnterFullScreen");
            this.d = true;
            this.h = true;
            this.v.setVisibility(0);
            d();
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setExitFullScreen() {
        try {
            this.d = false;
            this.c = false;
            this.v.setVisibility(8);
            l();
            e();
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setIsActivePause(boolean z) {
        this.e = z;
    }

    public void setIsComplete(boolean z) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setMediaViewPlayListener(h hVar) {
        this.H = hVar;
    }

    public void setOnMediaViewPlayerViewListener(com.mbridge.msdk.nativex.listener.a aVar) {
        this.D = aVar;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.J = mediaEvents;
    }

    public void showPlayView() {
        this.t.setVisibility(0);
    }

    public void showProgressView(boolean z) {
        this.n = z;
        ProgressBar progressBar = this.r;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z) {
        this.m = z;
        if (z) {
            l();
        } else {
            d();
        }
    }

    public void startOrPlayVideo() {
        try {
            if (!this.g) {
                m();
            } else if (hasPrepare()) {
                o();
            } else {
                playVideo();
            }
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            d();
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    public void unregisterView() {
        AdSession adSession = this.I;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class i implements TextureView.SurfaceTextureListener {
        private i() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            try {
                MediaViewPlayerView.this.q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.g = true;
                MediaViewPlayerView.this.i = true;
                boolean z = MediaViewPlayerView.this.d;
                MediaViewPlayerView mediaViewPlayerView = MediaViewPlayerView.this;
                if (z) {
                    if (mediaViewPlayerView.h) {
                        MediaViewPlayerView.this.c = false;
                        MediaViewPlayerView.this.h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.m();
                    return;
                }
                boolean z2 = mediaViewPlayerView.b;
                MediaViewPlayerView mediaViewPlayerView2 = MediaViewPlayerView.this;
                if (z2) {
                    if (mediaViewPlayerView2.hasPrepare() && MediaViewPlayerView.this.isComplete()) {
                        MediaViewPlayerView.this.m();
                        return;
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                if (mediaViewPlayerView2.hasPrepare() && !MediaViewPlayerView.this.isComplete()) {
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                MediaViewPlayerView.this.m();
            } catch (Exception e) {
                q0.b("MediaViewPlayerView", e.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.G != null && MediaViewPlayerView.this.G.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.c = true;
                MediaViewPlayerView.this.g = false;
            } catch (Throwable th) {
                q0.b("MediaViewPlayerView", th.getMessage());
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            q0.c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        public /* synthetic */ i(MediaViewPlayerView mediaViewPlayerView, a aVar) {
            this();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Animation.AnimationListener {
        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MediaViewPlayerView.this.u.setVisibility(0);
            MediaViewPlayerView.this.p();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    private void a() {
        try {
            Handler handler = L;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e2) {
            q0.b("MediaViewPlayerView", e2.getMessage());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements com.mbridge.msdk.foundation.same.image.c {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (MediaViewPlayerView.this.s == null || bitmap == null) {
                return;
            }
            MediaViewPlayerView.this.s.setImageUrl(str);
            MediaViewPlayerView.this.s.setImageBitmap(bitmap);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = true;
        this.k = false;
        this.l = -1;
        this.m = true;
        this.n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }
}
