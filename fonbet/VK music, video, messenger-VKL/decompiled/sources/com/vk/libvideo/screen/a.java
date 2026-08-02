package com.vk.libvideo.screen;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.seek.VideoFastSeekView;
import com.vk.libvideo.design.view.swipe.layout.SwipeLayout;
import com.vk.libvideo.design.view.swipe.layout.a;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.history.ForceLogReason;
import com.vk.libvideo.models.videotracker.FullscreenTransition;
import com.vk.libvideo.ui.VideoPlayerAdsPanel;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import xsna.a72;
import xsna.a78;
import xsna.a8v;
import xsna.awm0;
import xsna.b4x;
import xsna.bh10;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c0a;
import xsna.c4x;
import xsna.c56;
import xsna.d3b0;
import xsna.d4s0;
import xsna.d4x;
import xsna.d8s0;
import xsna.dbs0;
import xsna.e3m;
import xsna.e4x;
import xsna.ebs0;
import xsna.el3;
import xsna.enj;
import xsna.epx;
import xsna.exr0;
import xsna.f4m;
import xsna.fbr0;
import xsna.fxc0;
import xsna.g4x;
import xsna.get0;
import xsna.gz80;
import xsna.gzs;
import xsna.het0;
import xsna.hfs0;
import xsna.hkt0;
import xsna.i12;
import xsna.iet0;
import xsna.io2;
import xsna.jet0;
import xsna.kz20;
import xsna.l4s0;
import xsna.ljt0;
import xsna.n0m0;
import xsna.no2;
import xsna.nrq0;
import xsna.o90;
import xsna.ows0;
import xsna.pkk;
import xsna.qcy;
import xsna.qoy;
import xsna.qp6;
import xsna.r0t0;
import xsna.s3q0;
import xsna.sdt0;
import xsna.sms0;
import xsna.t0t0;
import xsna.u0m;
import xsna.u0t0;
import xsna.u8l;
import xsna.u9t0;
import xsna.v3t0;
import xsna.vit0;
import xsna.vu5;
import xsna.wzs;
import xsna.xnt0;
import xsna.xy80;
import xsna.y6s0;
import xsna.yct0;
import xsna.yg5;
import xsna.yks0;
import xsna.zet0;
import xsna.zv4;

/* compiled from: VideoScreenController.kt */
/* loaded from: classes3.dex */
public final class a implements a.e, u8l, no2, ebs0, yks0.a {
    public final d A;
    public SwipeLayout B;
    public xnt0 C;
    public final exr0 D;
    public final boolean E;
    public final xy80 F;
    public final get0 G;
    public final b b;
    public final NotificationsPermission c;
    public final jet0 d;
    public final com.vk.video.ui.share.api.a e;
    public final zet0 f;
    public final ljt0 g;
    public final hfs0 h;
    public final com.vk.video.ui.share.api.b i;
    public final Resources j;
    public final FragmentActivity k;
    public final boolean l;
    public final C1246a m;
    public final yks0 n;
    public final i12 o;
    public final yg5 p;
    public final c0a q;
    public final io.reactivex.rxjava3.disposables.b r;
    public final kz20 s;
    public VideoToolbarView t;
    public LinearLayout u;
    public yg5 v;
    public VideoView w;
    public AdsDataProvider x;
    public boolean y;
    public boolean z;

    /* compiled from: VideoScreenController.kt */
    /* renamed from: com.vk.libvideo.screen.a$a, reason: collision with other inner class name */
    public static final class C1246a {
        public final VideoFile a;
        public final AdsDataProvider b;
        public final String c;
        public final String d;
        public final DeprecatedStatisticInterface e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final long n;
        public final SearchStatsLoggingInfo o;
        public final int p;

        public C1246a(VideoFile videoFile, AdsDataProvider adsDataProvider, String str, String str2, DeprecatedStatisticInterface deprecatedStatisticInterface, String str3, boolean z, boolean z2, boolean z3, long j, SearchStatsLoggingInfo searchStatsLoggingInfo, int i, int i2) {
            AdsDataProvider adsDataProvider2 = (i2 & 2) != 0 ? null : adsDataProvider;
            String str4 = (i2 & 8) != 0 ? null : str2;
            DeprecatedStatisticInterface deprecatedStatisticInterface2 = (i2 & 16) != 0 ? null : deprecatedStatisticInterface;
            boolean z4 = (i2 & 64) != 0 ? false : z;
            boolean z5 = (i2 & 128) == 0;
            boolean z6 = (i2 & 256) != 0 ? false : z2;
            boolean z7 = (i2 & 512) == 0;
            boolean z8 = (i2 & 1024) == 0;
            boolean z9 = (i2 & 2048) != 0 ? false : z3;
            long j2 = (i2 & 8192) != 0 ? -1L : j;
            SearchStatsLoggingInfo searchStatsLoggingInfo2 = (i2 & 16384) == 0 ? searchStatsLoggingInfo : null;
            int i3 = (i2 & 32768) != 0 ? -1 : i;
            this.a = videoFile;
            this.b = adsDataProvider2;
            this.c = str;
            this.d = str4;
            this.e = deprecatedStatisticInterface2;
            this.f = str3;
            this.g = z4;
            this.h = z5;
            this.i = z6;
            this.j = z7;
            this.k = z8;
            this.l = z9;
            this.m = false;
            this.n = j2;
            this.o = searchStatsLoggingInfo2;
            this.p = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1246a)) {
                return false;
            }
            C1246a c1246a = (C1246a) obj;
            return epx.f(this.a, c1246a.a) && epx.f(this.b, c1246a.b) && epx.f(this.c, c1246a.c) && epx.f(this.d, c1246a.d) && epx.f(this.e, c1246a.e) && epx.f(this.f, c1246a.f) && this.g == c1246a.g && this.h == c1246a.h && this.i == c1246a.i && this.j == c1246a.j && this.k == c1246a.k && this.l == c1246a.l && this.m == c1246a.m && this.n == c1246a.n && epx.f(this.o, c1246a.o) && this.p == c1246a.p;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            AdsDataProvider adsDataProvider = this.b;
            int hashCode2 = (hashCode + (adsDataProvider == null ? 0 : adsDataProvider.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeprecatedStatisticInterface deprecatedStatisticInterface = this.e;
            int hashCode5 = (hashCode4 + (deprecatedStatisticInterface == null ? 0 : deprecatedStatisticInterface.hashCode())) * 31;
            String str3 = this.f;
            int a = bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.o;
            return Integer.hashCode(this.p) + ((a + (searchStatsLoggingInfo != null ? searchStatsLoggingInfo.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Args(video=");
            sb.append(this.a);
            sb.append(", ads=");
            sb.append(this.b);
            sb.append(", referrer=");
            sb.append(this.c);
            sb.append(", trackCode=");
            sb.append(this.d);
            sb.append(", statistic=");
            sb.append(this.e);
            sb.append(", context=");
            sb.append(this.f);
            sb.append(", withoutMenu=");
            sb.append(this.g);
            sb.append(", withoutToolbar=");
            sb.append(this.h);
            sb.append(", withoutBottomPanel=");
            sb.append(this.i);
            sb.append(", withoutBottomBar=");
            sb.append(this.j);
            sb.append(", withoutUserContainer=");
            sb.append(this.k);
            sb.append(", withoutPreview=");
            sb.append(this.l);
            sb.append(", pipEnabled=");
            sb.append(this.m);
            sb.append(", startVideoFromPosition=");
            sb.append(this.n);
            sb.append(", searchStatsLoggingInfo=");
            sb.append(this.o);
            sb.append(", reply=");
            return vu5.b(sb, this.p, ')');
        }
    }

    /* compiled from: VideoScreenController.kt */
    public interface b {
        C1246a Bg();

        void I3();

        default boolean Lj() {
            return false;
        }

        default boolean t7() {
            return false;
        }
    }

    /* compiled from: VideoScreenController.kt */
    public static final class e extends xnt0.a {
        public e() {
        }

        @Override // xsna.xnt0.a
        public final void d(View view, float f) {
            VideoToolbarView videoToolbarView = a.this.t;
            if (videoToolbarView != null) {
                videoToolbarView.setAlpha(f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [xsna.get0, xsna.xy80$c] */
    public a(Context context, b bVar, NotificationsPermission notificationsPermission, jet0 jet0Var, com.vk.video.ui.share.api.a aVar, zet0 zet0Var, ljt0 ljt0Var, hfs0 hfs0Var, com.vk.video.ui.share.api.b bVar2, xy80 xy80Var) {
        xy80 xy80Var2;
        this.b = bVar;
        this.c = notificationsPermission;
        this.d = jet0Var;
        this.e = aVar;
        this.f = zet0Var;
        this.g = ljt0Var;
        this.h = hfs0Var;
        this.i = bVar2;
        this.j = context.getResources();
        bpn0 bpn0Var = enj.a;
        FragmentActivity fragmentActivity = (FragmentActivity) e3m.h(context);
        this.k = fragmentActivity;
        this.l = o90.a(fragmentActivity);
        C1246a Bg = bVar.Bg();
        this.m = Bg;
        this.n = new yks0(Bg.a, Bg.c, Bg.f);
        this.o = new i12();
        bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
        this.p = b.C1208b.a().e(Bg.a, null);
        this.q = new c0a(context, (gzs) new nrq0(this, 6));
        this.r = new io.reactivex.rxjava3.disposables.b();
        this.s = new kz20(this);
        this.A = new d();
        this.D = new exr0(new c());
        boolean z = xy80Var == 0;
        this.E = z;
        ?? r2 = new xy80.c() { // from class: xsna.get0
            @Override // xsna.xy80.c
            public final void a(int i) {
                xy80 xy80Var3;
                yg5 yg5Var;
                rlt0 m0;
                com.vk.libvideo.screen.a aVar2 = com.vk.libvideo.screen.a.this;
                if (!aVar2.b.t7() || (xy80Var3 = aVar2.F) == null || xy80Var3.c() || aVar2.s.b() || (yg5Var = aVar2.v) == null || (m0 = yg5Var.m0()) == null) {
                    return;
                }
                m0.m(FullscreenTransition.SCREEN_ROTATION);
            }
        };
        this.G = r2;
        if (z) {
            xy80 xy80Var3 = new xy80(fragmentActivity);
            xy80Var3.a(r2);
            xy80Var3.enable();
            xy80Var2 = xy80Var3;
        } else if (xy80Var != 0) {
            xy80Var.a(r2);
            xy80Var2 = xy80Var;
        } else {
            xy80Var2 = null;
        }
        this.F = xy80Var2;
    }

    public static void e(a aVar) {
        yg5 yg5Var;
        d3b0 v0;
        OneVideoPlayer a;
        yg5 yg5Var2;
        aVar.r.e();
        VideoView videoView = aVar.w;
        if (videoView != null) {
            videoView.T();
        }
        aVar.o.b(false);
        aVar.n.c();
        VideoView videoView2 = aVar.w;
        if (videoView2 != null && (yg5Var2 = aVar.v) != null) {
            yg5Var2.T(videoView2);
        }
        xy80 xy80Var = aVar.F;
        if (xy80Var != null) {
            xy80Var.b.remove(aVar.G);
            if (aVar.E) {
                xy80Var.b(-1);
                xy80Var.disable();
            }
        }
        yg5 yg5Var3 = aVar.v;
        if (yg5Var3 != null && (v0 = yg5Var3.v0()) != null && (a = v0.a()) != null) {
            a.setPlaybackSpeed(1.0f);
        }
        yg5 yg5Var4 = aVar.v;
        if (yg5Var4 != null) {
            VideoView videoView3 = aVar.w;
            if (!yg5Var4.j0(videoView3 != null ? videoView3.getViewBinding().c : null) || (yg5Var = aVar.v) == null || yg5Var == null) {
                return;
            }
            yg5Var.C(true);
        }
    }

    @Override // xsna.yks0.a
    public final void He(List list, VideoFile videoFile) {
        VideoView videoView = this.w;
        if (videoView != null) {
            videoView.postDelayed(new a72(this, 26), 100L);
        }
    }

    @Override // xsna.no2
    public final io2 Ia() {
        return this.A;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Lg() {
        VideoView videoView = this.w;
        if (videoView != null) {
            videoView.T();
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Sj() {
        return true;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void W6() {
        b();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Wh() {
        VideoView videoView;
        VideoFastSeekView videoFastSeekView;
        VideoView videoView2;
        VideoTextureView videoTextureView;
        if (this.b.Lj() || (videoView = this.w) == null || (videoFastSeekView = videoView.getViewBinding().k) == null || videoFastSeekView.c() || (videoView2 = this.w) == null || (videoTextureView = videoView2.getViewBinding().c) == null || videoTextureView.g()) {
            return false;
        }
        VideoMinifiedPlayerStateHolder.a.getClass();
        return !VideoMinifiedPlayerStateHolder.a();
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Yb() {
        b();
    }

    public final void a(Configuration configuration) {
        VideoToolbarView videoToolbarView = this.t;
        if (videoToolbarView != null) {
            AdsDataProvider adsDataProvider = this.x;
            yks0 yks0Var = this.n;
            VideoFile videoFile = yks0Var.e;
            boolean f = epx.f(yks0Var.c, Boolean.TRUE);
            boolean z = configuration.orientation == 2;
            int i = VideoToolbarView.M;
            videoToolbarView.d(adsDataProvider, videoFile, f, z, false);
        }
    }

    public final void b() {
        VideoView videoView = this.w;
        if (videoView == null || this.B == null) {
            c();
            return;
        }
        videoView.clearAnimation();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(videoView, (Property<VideoView, Float>) FrameLayout.ALPHA, videoView.getAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        SwipeLayout swipeLayout = this.B;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(swipeLayout, com.vk.libvideo.design.view.swipe.layout.a.o, swipeLayout.getVolume(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        SwipeLayout swipeLayout2 = this.B;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(swipeLayout2, com.vk.libvideo.design.view.swipe.layout.a.p, swipeLayout2.getVideoViewsAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        SwipeLayout swipeLayout3 = this.B;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofInt(swipeLayout3, com.vk.libvideo.design.view.swipe.layout.a.q, swipeLayout3.getBackgroundAlpha(), 0));
        animatorSet.addListener(new qp6(this, 1));
        animatorSet.setDuration(400L);
        animatorSet.start();
    }

    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
        VideoView videoView;
        VideoView videoView2 = this.w;
        if (videoView2 != null) {
            videoView2.l0();
        }
        this.D.b(dbs0Var);
        if (dbs0Var.equals(d8s0.a) || dbs0Var.equals(l4s0.a)) {
            b();
            return;
        }
        if (dbs0Var.equals(sms0.a)) {
            VideoView videoView3 = this.w;
            if (videoView3 != null) {
                videoView3.W();
                return;
            }
            return;
        }
        if (dbs0Var.equals(yct0.a)) {
            VideoView videoView4 = this.w;
            if (videoView4 != null) {
                videoView4.y0(true);
                return;
            }
            return;
        }
        if (dbs0Var.equals(hkt0.a)) {
            yg5 yg5Var = this.v;
            if (yg5Var != null) {
                yg5Var.pause();
                return;
            }
            return;
        }
        if (dbs0Var.equals(sdt0.a)) {
            VideoView videoView5 = this.w;
            if (videoView5 != null) {
                videoView5.C0();
                return;
            }
            return;
        }
        if (!(dbs0Var instanceof d4s0)) {
            if ((dbs0Var.equals(u0t0.a) || dbs0Var.equals(r0t0.a) || dbs0Var.equals(t0t0.a)) && (videoView = this.w) != null) {
                qcy<Object>[] qcyVarArr = VideoView.T0;
                videoView.G0(false, false);
                return;
            }
            return;
        }
        VideoView videoView6 = this.w;
        if (videoView6 != null) {
            boolean z = ((d4s0) dbs0Var).a;
            yg5 autoPlay = videoView6.getAutoPlay();
            if (autoPlay == null) {
                return;
            }
            videoView6.l0();
            com.vk.libvideo.autoplay.a videoConfig = videoView6.getVideoConfig();
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            com.vk.libvideo.autoplay.e.d(z);
            autoPlay.a0(videoConfig);
            autoPlay.l0();
            videoView6.getViewBinding().v.setAutoplayEnabled(z);
            VideoToolbarView videoToolbarView = videoView6.getViewBinding().H;
            if (videoToolbarView != null) {
                videoToolbarView.setAutoPlayEnabled(z);
            }
        }
    }

    public final void c() {
        SwipeLayout swipeLayout = this.B;
        if (swipeLayout != null) {
            swipeLayout.removeAllViews();
        }
        this.b.I3();
    }

    @Override // xsna.yks0.a
    public final void dismiss() {
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02de, code lost:
    
        if (r5.equals("video_from_fullscreen_to_pip") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e7, code lost:
    
        if (r5.equals("video_from_discovery_to_pip") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a6, code lost:
    
        if (r5.equals("video_from_feed_to_pip") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ee, code lost:
    
        if (r4.isPaused() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02f0, code lost:
    
        r4.f();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(View view) {
        VideoFile A;
        VideoCanDownload F4;
        yg5 yg5Var;
        VideoFile A2;
        VideoCanDownload F42;
        yg5 yg5Var2;
        this.B.setNavigationCallback(this);
        i12 i12Var = this.o;
        i12Var.getClass();
        bwt0.H(view);
        i12Var.b = new WeakReference(view);
        C1246a c1246a = this.m;
        AdsDataProvider adsDataProvider = c1246a.b;
        String str = c1246a.c;
        this.x = adsDataProvider;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a = b.C1208b.a();
        VideoFile videoFile = c1246a.a;
        this.v = a.e(videoFile, null);
        int duration = videoFile.getDuration();
        long j = c1246a.n;
        if (0 <= j && j <= duration && (yg5Var2 = this.v) != null) {
            yg5Var2.seek(TimeUnit.SECONDS.toMillis(j));
        }
        VideoPlayerAdsPanel videoPlayerAdsPanel = (VideoPlayerAdsPanel) view.findViewById(R.id.ads_panel);
        VideoBottomPanelView videoBottomPanelView = (VideoBottomPanelView) view.findViewById(R.id.bottom_panel);
        this.u = (LinearLayout) view.findViewById(R.id.video_nameplates);
        VideoToolbarView videoToolbarView = (VideoToolbarView) view.findViewById(R.id.toolbar);
        this.t = videoToolbarView;
        videoToolbarView.setVideoActionsCallback(this);
        VideoView videoView = (VideoView) view.findViewById(R.id.video_layout);
        this.w = videoView;
        yks0 yks0Var = this.n;
        if (videoView != null) {
            yks0Var.b(videoView);
            yks0Var.b(this);
            VideoTextureView videoTextureView = videoView.getViewBinding().c;
            TransformController.ScaleType scaleType = TransformController.ScaleType.FIT;
            SoftReference<Bitmap> softReference = VideoTextureView.r;
            videoTextureView.i(scaleType, false);
            videoView.getViewBinding().d.setContentScaleType(VideoResizer.VideoFitType.FIT);
            videoView.setFullscreenContext(true);
            videoView.getViewBinding().J = this.u;
            videoView.setVideoFileController(yks0Var);
            yg5 yg5Var3 = this.v;
            if (yg5Var3 == null || (A2 = yg5Var3.A()) == null || (F42 = A2.F4()) == null || !F42.j()) {
                videoView.getViewBinding().G = videoBottomPanelView;
            } else {
                VideoBottomPanelView videoBottomPanelView2 = videoView.getViewBinding().G;
                if (videoBottomPanelView2 != null) {
                    videoBottomPanelView2.setVisibility(8);
                }
                videoBottomPanelView.setVisibility(8);
            }
            if (c1246a.k) {
                videoBottomPanelView.A = false;
                View view2 = videoBottomPanelView.D;
                if (view2 != null) {
                    f4m.j(view2);
                }
            }
            if (c1246a.j) {
                videoBottomPanelView.setBottomBarVisibility(false);
            }
            videoView.setBottomPanelVisibilityMode(c1246a.i ? a78.b.a : a78.c.a);
            videoView.setDoc2DocConfig(fxc0.B().J().f1());
            videoView.getViewBinding().H = c1246a.h ? null : this.t;
            videoView.setOrientationListener(this.F);
            videoView.setDecorViewVisibilityCallback(this);
            videoView.setAnimationDialogCallbackProvider(this);
            videoView.setVideoClickActionCallback(this);
            videoView.G0(false, false);
            videoView.He(EmptyList.b, videoFile);
            videoView.setPipButtonVisible(c1246a.m);
            AdsDataProvider adsDataProvider2 = this.x;
            if (adsDataProvider2 != null) {
                videoView.setShit(adsDataProvider2);
                videoView.getViewBinding().I = videoPlayerAdsPanel;
            }
            if (c1246a.l && (yg5Var = this.v) != null) {
                videoView.d4(yg5Var);
            }
            videoView.setPostingMode(c1246a.g);
        }
        SwipeLayout swipeLayout = this.B;
        if (swipeLayout != null) {
            swipeLayout.setBackgroundColor(-16777216);
            VideoToolbarView videoToolbarView2 = this.t;
            if (videoToolbarView2 != null) {
                swipeLayout.a(videoToolbarView2, d4x.a);
            }
            LinearLayout linearLayout = this.u;
            if (linearLayout != null) {
                swipeLayout.a(linearLayout, d4x.a);
            }
            c4x c4xVar = c4x.a;
            swipeLayout.a(videoPlayerAdsPanel, c4xVar);
            swipeLayout.a(videoBottomPanelView, c4xVar);
            VideoView videoView2 = this.w;
            if (videoView2 != null) {
                View view3 = videoView2.getViewBinding().i;
                g4x.b bVar = g4x.b.a;
                swipeLayout.a(view3, bVar);
                swipeLayout.b(videoView2.getViewBinding().q, g4x.d.a);
                swipeLayout.b(videoView2.getViewBinding().o, c4xVar);
                swipeLayout.b(videoView2.getViewBinding().p, e4x.a);
                swipeLayout.b(videoView2.getViewBinding().z, d4x.a);
                yg5 yg5Var4 = this.v;
                if (yg5Var4 == null || (A = yg5Var4.A()) == null || (F4 = A.F4()) == null || !F4.j()) {
                    swipeLayout.b(videoView2.getViewBinding().r.W3(swipeLayout.getContext()), b4x.a);
                } else {
                    swipeLayout.b(videoView2.getViewBinding().r.W3(swipeLayout.getContext()), c4xVar);
                }
                swipeLayout.b(videoView2.getActualEndView(), bVar);
                swipeLayout.b(videoView2.getViewBinding().A, bVar);
                swipeLayout.b(videoView2.getViewBinding().h, bVar);
                swipeLayout.b(videoView2.getViewBinding().k, bVar);
                swipeLayout.b(videoView2.getViewBinding().j, bVar);
            }
        }
        i12Var.b(true);
        yg5 yg5Var5 = this.v;
        if (yg5Var5 != null) {
            yks0Var.b(this.w);
            yks0Var.b(this);
            i12Var.c = yg5Var5.m0();
            a(this.j.getConfiguration());
            yg5Var5.x0(ForceLogReason.TAP);
            yg5Var5.n0(str, c1246a.f, videoFile.r(), false);
            try {
                ((u0m) yg5Var5).j(c1246a.e);
            } catch (ClassCastException e2) {
                com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                aVar.g("deprecated_statistic_cast_exception");
                aVar.i("FirebaseTracker");
                bVar2.k(aVar.e());
                bVar2.a(e2);
            }
            kz20 kz20Var = this.s;
            kz20Var.g = videoFile;
            int i = c1246a.p;
            if (i != -1) {
                kz20Var.g(this.k, yks0Var, null, (r13 & 8) != 0 ? null : Integer.valueOf(i), (r13 & 16) != 0 ? null : Boolean.TRUE);
            }
            this.w.setVideoFileController(yks0Var);
            yg5Var5.z0(this.w.getViewBinding().c, this.w.getVideoConfig(), null);
            if (str != null) {
                switch (str.hashCode()) {
                    case -563333517:
                        break;
                    case 573062598:
                        break;
                    case 1084193287:
                        if (str.equals("video_pip_new_intent")) {
                            yg5Var5.O();
                            yg5Var5.f();
                            break;
                        }
                        break;
                    case 1453984454:
                        if (str.equals("video_from_pip")) {
                            if (!yg5Var5.a()) {
                                if (!yg5Var5.isPaused()) {
                                    yg5Var5.f();
                                    break;
                                }
                            } else {
                                this.w.N0();
                                break;
                            }
                        }
                        break;
                    case 1720262083:
                        break;
                }
                if (yg5Var5.v()) {
                    q m = fxc0.B().T().m(yg5Var5.A().o0(), yg5Var5.A().I0());
                    new awm0(8);
                    this.r.b(m.subscribe(new het0(), new a8v(new n0m0(13), 27)));
                }
            }
            yg5Var5.O();
            yg5Var5.f();
            if (yg5Var5.v()) {
            }
        }
        if (gz80.a(28)) {
            SwipeLayout swipeLayout2 = this.B;
            Object parent = swipeLayout2 != null ? swipeLayout2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setOnApplyWindowInsetsListener(new iet0());
            }
        }
        VideoView videoView3 = this.w;
        if (videoView3 != null) {
            videoView3.O0();
        }
        fbr0 fbr0Var = (fbr0) this.q.c;
        if (fbr0Var != null) {
            fbr0Var.e();
        }
        VideoView videoView4 = this.w;
        if (videoView4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.C = new xnt0(view, videoView4, new e(), 56);
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void fm() {
        VideoView videoView = this.w;
        if (videoView != null) {
            videoView.l0();
        }
    }

    public final void g(boolean z) {
        FragmentActivity fragmentActivity = this.k;
        if (fragmentActivity.getIntent().getBooleanExtra("app_content_hidden", false)) {
            return;
        }
        if (z) {
            fragmentActivity.getWindow().addFlags(8192);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentActivity.getWindow().clearFlags(8192);
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final float getVolume() {
        yg5 yg5Var = this.v;
        return yg5Var != null ? yg5Var.getVolume() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean h6() {
        return false;
    }

    public final void onPause() {
        g(this.l);
        VideoFile videoFile = this.n.e;
        if (this.b.Lj() && videoFile.O() != null) {
            fxc0.B().b(videoFile);
        }
        VideoView videoView = this.w;
        if (videoView != null) {
            videoView.U = false;
            yg5 yg5Var = videoView.I;
            if (yg5Var != null) {
                yg5Var.pause();
            }
            videoView.T();
        }
        fbr0 fbr0Var = (fbr0) this.q.c;
        if (fbr0Var != null) {
            fbr0Var.c();
        }
    }

    public final void onResume() {
        if (this.z) {
            VideoView videoView = this.w;
            if (videoView != null) {
                videoView.w0(this.y);
            }
            this.y = false;
        } else {
            this.z = true;
        }
        C1246a c1246a = this.m;
        VideoFile videoFile = c1246a.a;
        g(videoFile.F4() == VideoCanDownload.NO && !videoFile.Fa());
        VideoView videoView2 = this.w;
        if (videoView2 != null) {
            videoView2.postDelayed(new a72(this, 26), 100L);
        }
        fbr0 fbr0Var = (fbr0) this.q.c;
        if (fbr0Var != null) {
            fbr0Var.d();
        }
        yg5 yg5Var = this.v;
        if (yg5Var != null) {
            yg5Var.n0(c1246a.c, c1246a.f, c1246a.a.r(), false);
        }
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final void setVolume(float f) {
        yg5 yg5Var = this.v;
        if (yg5Var != null) {
            yg5Var.setVolume(f);
        }
    }

    @Override // xsna.u8l
    public final void zb(boolean z) {
        this.o.a(z, true);
    }

    /* compiled from: VideoScreenController.kt */
    public final class d extends c56 {
        public d() {
        }

        @Override // xsna.io2
        public final void C() {
            VideoTextureView videoTextureView;
            a aVar = a.this;
            VideoView videoView = aVar.w;
            if (videoView != null && (videoTextureView = videoView.getViewBinding().c) != null) {
                videoTextureView.setHasTransientState(false);
            }
            VideoView videoView2 = aVar.w;
            if (videoView2 != null) {
                videoView2.R0(true, true);
            }
        }

        @Override // xsna.io2
        public final void J() {
            yg5 yg5Var;
            a aVar = a.this;
            VideoView videoView = aVar.w;
            if (videoView == null || (yg5Var = aVar.v) == null) {
                return;
            }
            videoView.postDelayed(new zv4(9, videoView, yg5Var), BaseAnimationDialog.d0);
        }

        @Override // xsna.io2
        public final boolean M() {
            return true;
        }

        @Override // xsna.io2
        public final void e0() {
            VideoView videoView = a.this.w;
            if (videoView != null) {
                if (videoView.isAttachedToWindow()) {
                    ViewPropertyAnimator alpha = videoView.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    pkk pkkVar = BaseAnimationDialog.Z;
                    alpha.setStartDelay(BaseAnimationDialog.b0).setDuration(BaseAnimationDialog.c0).start();
                }
                videoView.getViewBinding().c.setHasTransientState(true);
                videoView.R0(false, false);
            }
        }

        @Override // xsna.c56
        public final View f() {
            VideoView videoView = a.this.w;
            if (videoView != null) {
                return videoView.getViewBinding().c;
            }
            return null;
        }

        @Override // xsna.io2
        public final VideoResizer.VideoFitType getContentScaleType() {
            yg5 yg5Var = a.this.v;
            return (yg5Var == null || !yg5Var.P0()) ? VideoResizer.VideoFitType.CROP : VideoResizer.VideoFitType.FIT;
        }

        @Override // xsna.io2
        public final void D0() {
        }
    }

    @Override // xsna.yks0.a
    public final void uf(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void vk(boolean z) {
    }

    /* compiled from: VideoScreenController.kt */
    public final class c implements exr0.a {
        public final C1247a a;

        public c() {
            this.a = new C1247a(a.this, this);
        }

        @Override // xsna.exr0.a
        public final u9t0 L() {
            return a.this.d.d;
        }

        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.b S() {
            return a.this.i;
        }

        @Override // xsna.exr0.a
        public final NotificationsPermission V() {
            return a.this.c;
        }

        @Override // xsna.exr0.a
        public final yks0 W() {
            return a.this.n;
        }

        @Override // xsna.exr0.a
        public final SearchStatsLoggingInfo a() {
            return a.this.m.o;
        }

        @Override // xsna.exr0.a
        public final ows0 b() {
            return null;
        }

        @Override // xsna.exr0.a
        public final void c() {
            a aVar = a.this;
            yg5 yg5Var = aVar.v;
            boolean z = false;
            if (yg5Var != null && yg5Var.isPlaying()) {
                z = true;
            }
            aVar.y = z;
        }

        @Override // xsna.exr0.a
        public final wzs<Boolean, String, s3q0> d() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> e() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<VideoAlbum> f() {
            return null;
        }

        @Override // xsna.exr0.a
        public final ljt0 g() {
            return a.this.g;
        }

        @Override // xsna.exr0.a
        public final vit0 g0() {
            return a.this.d.a;
        }

        @Override // xsna.exr0.a
        public final FragmentActivity getActivity() {
            return a.this.k;
        }

        @Override // xsna.exr0.a
        public final View getView() {
            return a.this.w;
        }

        @Override // xsna.exr0.a
        public final zet0 h() {
            return a.this.f;
        }

        @Override // xsna.exr0.a
        public final y6s0 i() {
            return this.a;
        }

        @Override // xsna.exr0.a
        public final kz20 j() {
            return a.this.s;
        }

        @Override // xsna.exr0.a
        public final wzs<Boolean, String, s3q0> k() {
            return null;
        }

        @Override // xsna.exr0.a
        public final MobileOfficialAppsCoreNavStat$EventScreen l() {
            return MobileOfficialAppsCoreNavStat$EventScreen.OTHER;
        }

        @Override // xsna.exr0.a
        public final com.vk.video.kidsprofile.restricteduseractions.a m() {
            return a.this.d.c;
        }

        @Override // xsna.exr0.a
        public final v3t0 m0() {
            return a.this.d.b;
        }

        @Override // xsna.exr0.a
        public final hfs0 n() {
            return a.this.h;
        }

        @Override // xsna.exr0.a
        public final AdsDataProvider o() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> p() {
            return null;
        }

        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.a p0() {
            return a.this.e;
        }

        /* compiled from: VideoScreenController.kt */
        /* renamed from: com.vk.libvideo.screen.a$c$a, reason: collision with other inner class name */
        public static final class C1247a implements y6s0 {
            public final /* synthetic */ a a;
            public final /* synthetic */ c b;

            /* compiled from: VideoScreenController.kt */
            /* renamed from: com.vk.libvideo.screen.a$c$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1248a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VideoBottomSheetSideEffectOptions.values().length];
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.REMOVE_FROM_DOWNLOADABLE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.ADD_AS_CLIP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.SHARE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C1247a(a aVar, c cVar) {
                this.a = aVar;
                this.b = cVar;
            }

            @Override // xsna.y6s0
            public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
                int i = C1248a.$EnumSwitchMapping$0[videoBottomSheetSideEffectOptions.ordinal()];
                a aVar = this.a;
                if (i == 1) {
                    aVar.b();
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.b.c();
                } else {
                    yg5 yg5Var = aVar.v;
                    if (yg5Var != null) {
                        yg5Var.pause();
                    }
                }
            }

            @Override // xsna.y6s0
            public final int c2() {
                return -1;
            }

            @Override // xsna.y6s0
            public final void a(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
            }
        }
    }

    @Override // xsna.yks0.a
    public final void L9(VideoFile videoFile, boolean z) {
    }
}
