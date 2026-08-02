package com.vk.libvideo.ui.dialog.single;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.api.ui.VideoDialogParams;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.dialogs.AnimationDialog;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.videotracker.FullscreenTransition;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.VideoPlayerAdsPanel;
import com.vk.libvideo.ui.vkvideopromo.VkVideoPromoFragment;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeBackgroundItem;
import com.vk.stat.scheme.SchemeStat$TypeVideoBackgroundListeningItem;
import com.vk.stat.scheme.t0;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.kidsprofile.restricteduseractions.a;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.video.transform.TransformController;
import xsna.a6;
import xsna.a6z0;
import xsna.ap80;
import xsna.awt0;
import xsna.b5z;
import xsna.be50;
import xsna.bkm;
import xsna.bpn0;
import xsna.c0a;
import xsna.c4x;
import xsna.c56;
import xsna.d0w0;
import xsna.d3b0;
import xsna.d4s0;
import xsna.d4x;
import xsna.d8s0;
import xsna.dbs0;
import xsna.e3m;
import xsna.ebs0;
import xsna.exr0;
import xsna.f4m;
import xsna.fbr0;
import xsna.fcn;
import xsna.g4x;
import xsna.g600;
import xsna.g620;
import xsna.gsx0;
import xsna.gzs;
import xsna.h0w0;
import xsna.hfs0;
import xsna.hgq;
import xsna.hkt0;
import xsna.hv1;
import xsna.hzv0;
import xsna.i0q0;
import xsna.i12;
import xsna.i560;
import xsna.iah0;
import xsna.icn0;
import xsna.io2;
import xsna.j0q0;
import xsna.j6i;
import xsna.je0;
import xsna.k6s0;
import xsna.kz20;
import xsna.l4s0;
import xsna.l6s0;
import xsna.l7m;
import xsna.ljt0;
import xsna.lyd;
import xsna.m7m;
import xsna.no2;
import xsna.nst0;
import xsna.or4;
import xsna.ows0;
import xsna.oz50;
import xsna.pkk;
import xsna.po4;
import xsna.qjo0;
import xsna.qo4;
import xsna.r0t0;
import xsna.rlt0;
import xsna.rm80;
import xsna.s200;
import xsna.s3q0;
import xsna.sdt0;
import xsna.sms0;
import xsna.t0t0;
import xsna.tk5;
import xsna.tn10;
import xsna.u0t0;
import xsna.u8l;
import xsna.u9t0;
import xsna.v3t0;
import xsna.vga0;
import xsna.vit0;
import xsna.w0t0;
import xsna.w8i;
import xsna.wcs0;
import xsna.wgt0;
import xsna.wjs0;
import xsna.ww50;
import xsna.xnt0;
import xsna.xy80;
import xsna.xyp0;
import xsna.y6s0;
import xsna.yct0;
import xsna.ye0;
import xsna.yg5;
import xsna.yks0;
import xsna.ysg0;
import xsna.zet0;

/* loaded from: classes3.dex */
public class VideoDialog extends AnimationDialog implements u8l, no2, ebs0, yks0.a, l6s0, ViewTreeObserver.OnWindowFocusChangeListener, w8i {
    public static final /* synthetic */ int P0 = 0;
    public long A0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public String H0;

    @Nullable
    public SearchStatsLoggingInfo I0;
    public xnt0 J0;
    public exr0 L0;
    public d0w0 O0;
    public c0a l0;
    public kz20 q0;
    public yks0 r0;
    public xy80 s0;
    public LifecycleHandler t0;
    public VideoBottomPanelView u0;
    public VideoToolbarView v0;
    public yg5 w0;
    public VideoView x0;
    public AdsDataProvider y0;
    public WeakReference<Activity> z0;
    public final xyp0 h0 = new xyp0(this, true);
    public final a i0 = new a();
    public final b j0 = new b();
    public final c k0 = new c();
    public final d m0 = new d();
    public final or4 n0 = new or4(this, 16);
    public final i12 o0 = new i12();
    public final io.reactivex.rxjava3.disposables.b p0 = new io.reactivex.rxjava3.disposables.b();
    public boolean B0 = true;
    public boolean C0 = false;
    public final j K0 = new j();
    public final bpn0 M0 = new bpn0(new ap80(13));
    public final nst0 N0 = new nst0();

    public class a extends b5z {
        public a() {
        }

        @Override // xsna.b5z
        public final void b(@NonNull Activity activity) {
            VideoDialog.this.oo();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            if ((r1 != null ? xsna.ye0.this.A.c() : false) != false) goto L18;
         */
        @Override // xsna.b5z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(@NonNull Activity activity) {
            int i = VideoDialog.P0;
            VideoDialog videoDialog = VideoDialog.this;
            if (videoDialog.xo() != activity) {
                return;
            }
            videoDialog.B0 = false;
            videoDialog.s0.disable();
            VideoPipStateHolder.a.getClass();
            if (!VideoPipStateHolder.d() || ((Boolean) videoDialog.M0.getValue()).booleanValue()) {
                VideoView videoView = videoDialog.x0;
                videoView.U = false;
                yg5 yg5Var = videoView.I;
                if (yg5Var != null) {
                    yg5Var.pause();
                }
                videoView.T();
                if (!videoDialog.w0.j0(videoDialog.x0.getViewBinding().c)) {
                    je0 N0 = videoDialog.w0.N0();
                }
                videoDialog.w0.pause();
            }
            lyd.g().P();
        }

        @Override // xsna.b5z
        public final void e(@NonNull Activity activity) {
            int i = VideoDialog.P0;
            VideoDialog videoDialog = VideoDialog.this;
            if (videoDialog.xo() != activity) {
                return;
            }
            i0q0.d(100L, new po4(this, 7));
            i0q0.d(100L, new hv1(videoDialog, 21));
            lyd.g().B();
            videoDialog.s0.enable();
        }

        @Override // xsna.b5z
        public final void g(@NonNull Configuration configuration) {
            int i = configuration.orientation;
            VideoDialog videoDialog = VideoDialog.this;
            VideoDialog.uo(videoDialog, i, false);
            videoDialog.x0.V(configuration);
            d0w0 d0w0Var = videoDialog.O0;
            d0w0Var.getClass();
            com.vk.libvideo.design.view.swipe.layout.a aVar = d0w0Var.d;
            h0w0 h0w0Var = d0w0Var.e;
            VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_RIGHT_PROMO_FULLSCREEN;
            videoFeatures.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (!bVar.a(videoFeatures) || (iah0.r(aVar.getContext()) && h0w0Var.c(false))) {
                VideoFeatures videoFeatures2 = VideoFeatures.VK_VIDEO_BOTTOM_PROMO_FULLSCREEN;
                videoFeatures2.getClass();
                if (bVar.a(videoFeatures2) && (!iah0.r(aVar.getContext()) || !h0w0Var.g(false))) {
                    d0w0Var.c(false);
                }
            } else {
                d0w0Var.d(false);
            }
            h0w0Var.f();
            if (videoDialog.y0 != null) {
                com.vk.libvideo.design.view.swipe.layout.a aVar2 = videoDialog.O;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                ((VideoPlayerAdsPanel) aVar2.findViewById(R.id.ads_panel)).setAdsButtonColor(videoDialog.y0.h4());
            }
            videoDialog.wo(configuration);
            videoDialog.onConfigurationChanged(configuration);
            i0q0.d(100L, new hv1(videoDialog, 21));
        }
    }

    public class b implements bkm {
        public b() {
        }

        @Override // xsna.bkm
        public final void bb(int i) {
            VideoDialog videoDialog = VideoDialog.this;
            ww50 v = s200.v(videoDialog.kn());
            if (v == null) {
                return;
            }
            fcn z = v.z();
            if (z == videoDialog) {
                videoDialog.s0.enable();
                VideoDialog.vo(videoDialog);
            } else {
                if (!(z instanceof BaseAnimationDialog) || (z instanceof AnimationDialog)) {
                    return;
                }
                videoDialog.s0.disable();
            }
        }
    }

    public class c implements j0q0 {
        public c() {
        }

        @Override // xsna.j0q0
        @Nullable
        public final SchemeStat$TypeBackgroundItem.b a() {
            VideoDialog videoDialog = VideoDialog.this;
            if (!((Boolean) videoDialog.M0.getValue()).booleanValue() || videoDialog.w0.A().v() || videoDialog.w0.A().Ia()) {
                return null;
            }
            videoDialog.C0 = true;
            return null;
        }

        @Override // xsna.j0q0
        @Nullable
        public final SchemeStat$TypeVideoBackgroundListeningItem b() {
            VideoDialog videoDialog = VideoDialog.this;
            videoDialog.C0 = false;
            if (!((Boolean) videoDialog.M0.getValue()).booleanValue() || videoDialog.w0.A().v() || videoDialog.w0.A().Ia()) {
                return null;
            }
            return new SchemeStat$TypeVideoBackgroundListeningItem(SchemeStat$TypeVideoBackgroundListeningItem.EventType.START, Integer.valueOf((int) (videoDialog.w0.getPosition() / 1000)));
        }
    }

    public class d implements xy80.c {
        public d() {
        }

        @Override // xsna.xy80.c
        public final void a(int i) {
            VideoDialog.uo(VideoDialog.this, i, true);
        }
    }

    public class e extends xnt0.a {
        public e() {
        }

        @Override // xsna.xnt0.a
        public final void d(@NonNull View view, float f) {
            VideoDialog.this.v0.setAlpha(f);
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            VideoDialog videoDialog = VideoDialog.this;
            com.vk.libvideo.design.view.swipe.layout.a aVar = videoDialog.O;
            if (aVar == null) {
                aVar = null;
            }
            aVar.setBackgroundColor(-16777216);
            com.vk.libvideo.design.view.swipe.layout.a aVar2 = videoDialog.O;
            (aVar2 != null ? aVar2 : null).getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[VideoBottomSheetSideEffectOptions.values().length];
            a = iArr;
            try {
                iArr[VideoBottomSheetSideEffectOptions.REMOVE_FROM_DOWNLOADABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[VideoBottomSheetSideEffectOptions.ADD_AS_CLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[VideoBottomSheetSideEffectOptions.SHARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class h extends oz50 {
    }

    public static void uo(VideoDialog videoDialog, int i2, boolean z) {
        or4 or4Var = videoDialog.n0;
        if (i2 == 1 || i2 == 9) {
            videoDialog.N = true;
        } else if (i2 == 0 || i2 == 8) {
            videoDialog.N = false;
        }
        je0 N0 = videoDialog.w0.N0();
        if (N0 == null ? false : ((ye0.a) N0).f().c()) {
            return;
        }
        if (videoDialog.B0 && videoDialog.to() && videoDialog.s0.k && !videoDialog.q0.b()) {
            i0q0.h(or4Var);
            if (i2 == 1 || i2 == 9) {
                if (SystemClock.elapsedRealtime() - videoDialog.A0 < 1000) {
                    i0q0.d(1000L, or4Var);
                    return;
                }
                videoDialog.s0.f();
                videoDialog.zo(true);
                videoDialog.b(false);
                return;
            }
            return;
        }
        if (!z || !videoDialog.B0 || videoDialog.to() || videoDialog.s0.k || videoDialog.q0.b()) {
            return;
        }
        if (i2 == 0 || i2 == 8) {
            videoDialog.yo();
        }
    }

    public static void vo(VideoDialog videoDialog) {
        if (!videoDialog.w0.isPrepared() || !videoDialog.D0) {
            je0 N0 = videoDialog.w0.N0();
            if (!(N0 != null ? ye0.this.A.c() : false)) {
                videoDialog.w0.G0(false);
                return;
            }
        }
        videoDialog.w0.play();
    }

    @Override // xsna.yks0.a
    public final void He(@NonNull List list, @NonNull VideoFile videoFile) {
        this.q0.g = videoFile;
        if (this.B0) {
            wo(mo2getContext().getResources().getConfiguration());
            this.u0.P4(videoFile, true);
        }
    }

    @Override // xsna.no2
    @NonNull
    public final io2 Ia() {
        return this.K0;
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final void Lg() {
        this.x0.T();
        this.x0.setSwipingNow(true);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final xyp0 Qn() {
        return this.h0;
    }

    @Override // com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Sj() {
        return true;
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final boolean Wh() {
        if (this.x0.getViewBinding().k.c()) {
            return false;
        }
        VideoMinifiedPlayerStateHolder.a.getClass();
        return (VideoMinifiedPlayerStateHolder.a() || this.x0.getViewBinding().c.g() || !super.Wh()) ? false : true;
    }

    @Override // xsna.l6s0
    @NonNull
    public final k6s0 Y4() {
        return this.J0;
    }

    @Override // xsna.ebs0
    public final void bk(@NonNull dbs0 dbs0Var) {
        if (((AppCompatActivity) e3m.h(mo2getContext())) != null) {
            this.x0.l0();
            exr0 exr0Var = this.L0;
            if (exr0Var != null) {
                exr0Var.b(dbs0Var);
            }
            if ((dbs0Var instanceof d8s0) || (dbs0Var instanceof l4s0)) {
                if (to()) {
                    this.s0.f();
                }
                zo(false);
                b(false);
                return;
            }
            if (dbs0Var instanceof sms0) {
                this.x0.W();
                return;
            }
            if (dbs0Var instanceof w0t0) {
                VideoPipStateHolder.a.getClass();
                if (VideoPipStateHolder.d()) {
                    return;
                }
                bk(l4s0.a);
                return;
            }
            if (dbs0Var instanceof yct0) {
                this.x0.y0(true);
                return;
            }
            if (dbs0Var instanceof hkt0) {
                this.w0.pause();
                return;
            }
            if (dbs0Var instanceof sdt0) {
                this.x0.C0();
                return;
            }
            if (!(dbs0Var instanceof d4s0)) {
                if ((dbs0Var instanceof u0t0) || (dbs0Var instanceof r0t0) || (dbs0Var instanceof t0t0)) {
                    this.x0.G0(false, false);
                    return;
                }
                return;
            }
            boolean z = ((d4s0) dbs0Var).a;
            VideoView videoView = this.x0;
            yg5 autoPlay = videoView.getAutoPlay();
            if (autoPlay == null) {
                return;
            }
            videoView.l0();
            com.vk.libvideo.autoplay.a videoConfig = videoView.getVideoConfig();
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            com.vk.libvideo.autoplay.e.d(z);
            autoPlay.a0(videoConfig);
            autoPlay.l0();
            videoView.getViewBinding().v.setAutoplayEnabled(z);
            VideoToolbarView videoToolbarView = videoView.getViewBinding().H;
            if (videoToolbarView != null) {
                videoToolbarView.setAutoPlayEnabled(z);
            }
        }
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final void fm() {
        this.x0.l0();
        this.x0.setSwipingNow(false);
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final float getVolume() {
        return this.w0.getVolume();
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final List<View> ho() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.x0.getViewBinding().l);
        return arrayList;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    @NonNull
    public final View io() {
        return this.x0;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final tn10 jo() {
        return this.x0.getViewBinding().d;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final int ko() {
        return R.layout.video_fullscreen;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final tn10 lo() {
        return this.x0.getViewBinding().c.getMatrixProvider();
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final int mo() {
        return R.style.VideoFullScreenDialog;
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final void no(Rect rect) {
        LinearLayout linearLayout = this.x0.getViewBinding().J;
        if (linearLayout != null) {
            f4m.t(rect.top, linearLayout);
        }
        this.v0.setPadding(0, rect.top, 0, 0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (this.s0 == null) {
            go();
        }
        if (s200.v(kn()) != null) {
            s200.v(kn()).j(this.j0);
        }
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.dialogs.BaseAnimationDialog, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getArguments() != null) {
            if (this.w0 == null) {
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
                VideoFile videoFile = (VideoFile) getArguments().getParcelable(X3.i.b);
                a2.getClass();
                this.w0 = a2.e(videoFile, null);
            }
            this.y0 = (AdsDataProvider) getArguments().getParcelable("ads_provdr");
            VideoDialogParams videoDialogParams = (VideoDialogParams) getArguments().getParcelable("dialog_params");
            if (videoDialogParams != null) {
                this.E0 = videoDialogParams.b;
                this.H0 = videoDialogParams.f;
                this.F0 = videoDialogParams.c;
                this.N = videoDialogParams.d;
                boolean z = videoDialogParams.e;
                this.G0 = z;
                zo(z);
            }
            this.I0 = (SearchStatsLoggingInfo) getArguments().getParcelable("search_stats_logging_info");
        }
        this.A0 = SystemClock.elapsedRealtime();
        rlt0 m0 = this.w0.m0();
        i12 i12Var = this.o0;
        i12Var.c = m0;
        com.vk.libvideo.design.view.swipe.layout.a aVar = this.O;
        if (aVar == null) {
            aVar = null;
        }
        i12Var.b = new WeakReference(aVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar2 = this.O;
        if (aVar2 == null) {
            aVar2 = null;
        }
        VideoPlayerAdsPanel videoPlayerAdsPanel = (VideoPlayerAdsPanel) aVar2.findViewById(R.id.ads_panel);
        AdsDataProvider adsDataProvider = this.y0;
        if (adsDataProvider != null) {
            videoPlayerAdsPanel.setAdsButtonColor(adsDataProvider.h4());
        }
        com.vk.libvideo.design.view.swipe.layout.a aVar3 = this.O;
        if (aVar3 == null) {
            aVar3 = null;
        }
        this.u0 = (VideoBottomPanelView) aVar3.findViewById(R.id.bottom_panel);
        this.s0.enable();
        this.s0.a(this.m0);
        View findViewById = onCreateView.findViewById(R.id.right_promo_container);
        FrameLayout frameLayout = (FrameLayout) onCreateView.findViewById(R.id.bottom_promo_container);
        h0w0 Ka = ((VkVideoPromoComponent) j6i.b(m7m.f(this), VkVideoPromoComponent.class)).Ka();
        VideoGrowthComponent videoGrowthComponent = (VideoGrowthComponent) j6i.b(m7m.f(this), VideoGrowthComponent.class);
        hzv0.a(frameLayout, Ka, new a6(16, this, videoGrowthComponent), new hgq(this, videoGrowthComponent, Ka, 5));
        com.vk.libvideo.design.view.swipe.layout.a aVar4 = this.O;
        if (aVar4 == null) {
            aVar4 = null;
        }
        this.O0 = new d0w0(findViewById, frameLayout, aVar4, Ka, videoGrowthComponent.Z7());
        com.vk.libvideo.design.view.swipe.layout.a aVar5 = this.O;
        if (aVar5 == null) {
            aVar5 = null;
        }
        LinearLayout linearLayout = (LinearLayout) aVar5.findViewById(R.id.video_nameplates);
        com.vk.libvideo.design.view.swipe.layout.a aVar6 = this.O;
        if (aVar6 == null) {
            aVar6 = null;
        }
        this.v0 = (VideoToolbarView) aVar6.findViewById(R.id.toolbar);
        com.vk.libvideo.design.view.swipe.layout.a aVar7 = this.O;
        if (aVar7 == null) {
            aVar7 = null;
        }
        VideoView videoView = (VideoView) aVar7.findViewById(R.id.video_layout);
        this.x0 = videoView;
        yg5 yg5Var = this.w0;
        yks0 yks0Var = new yks0(yg5Var.A(), t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_SINGLE_VIDEO), yg5Var.q());
        boolean z2 = false;
        yks0Var.g.b(wjs0.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new be50(new com.vk.libvideo.b(0, yks0Var, mo2getContext()), 25)));
        yks0Var.b(videoView);
        yks0Var.b(this);
        this.r0 = yks0Var;
        this.x0.setVideoFileController(yks0Var);
        this.x0.setFullscreenContext(true);
        if (this.w0.A().F4().j()) {
            this.u0.setVisibility(8);
        } else {
            this.x0.getViewBinding().G = this.u0;
        }
        this.x0.setOrientationListener(this.s0);
        this.x0.getViewBinding().H = this.v0;
        this.x0.getViewBinding().J = linearLayout;
        this.x0.setDecorViewVisibilityCallback(this);
        this.x0.setAnimationDialogCallbackProvider(this);
        this.x0.setVideoClickActionCallback(this);
        AdsDataProvider adsDataProvider2 = this.y0;
        if (adsDataProvider2 != null) {
            this.x0.setShit(adsDataProvider2);
            this.x0.getViewBinding().I = videoPlayerAdsPanel;
        }
        this.x0.getViewBinding().c.i(TransformController.ScaleType.FIT, false);
        this.x0.getViewBinding().d.setContentScaleType(VideoResizer.VideoFitType.FIT);
        this.x0.He(Collections.EMPTY_LIST, this.w0.A());
        this.x0.getViewBinding().l.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (!this.E0) {
            VideoView videoView2 = this.x0;
            videoView2.b0(videoView2.C, true, false, false);
        }
        if (to()) {
            Activity xo = xo();
            yg5 yg5Var2 = this.w0;
            d3b0 v0 = yg5Var2.v0();
            if (v0 == null) {
                VideoFile A = yg5Var2.A();
                if (A.getHeight() * A.getWidth() == 0 || A.getWidth() <= A.getHeight()) {
                    this.s0.i();
                    xo.setRequestedOrientation(this.s0.e);
                } else {
                    this.s0.e();
                    this.N = false;
                }
            } else {
                wgt0 a3 = rm80.a(v0);
                if (a3.a > a3.b) {
                    this.s0.e();
                    this.N = false;
                } else {
                    this.s0.i();
                    xo.setRequestedOrientation(this.s0.e);
                }
            }
        } else {
            this.x0.G0(false, false);
        }
        AdsDataProvider adsDataProvider3 = this.y0;
        if (adsDataProvider3 != null) {
            this.x0.setShit(adsDataProvider3);
            this.x0.getViewBinding().I = videoPlayerAdsPanel;
        }
        this.q0 = new kz20(this.w0.A(), this);
        LifecycleHandler c2 = LifecycleHandler.c(xo());
        this.t0 = c2;
        c2.a(this.i0);
        UiTracker uiTracker = UiTracker.a;
        UiTracker.h.f.add(this.k0);
        wo(xo().getResources().getConfiguration());
        this.v0.setVideoActionsCallback(this);
        this.x0.O0();
        com.vk.libvideo.design.view.swipe.layout.a aVar8 = this.O;
        if (aVar8 == null) {
            aVar8 = null;
        }
        aVar8.setBackgroundColor(-16777216);
        com.vk.libvideo.design.view.swipe.layout.a aVar9 = this.O;
        if (aVar9 == null) {
            aVar9 = null;
        }
        VideoToolbarView videoToolbarView = this.v0;
        d4x d4xVar = d4x.a;
        aVar9.a(videoToolbarView, d4xVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar10 = this.O;
        if (aVar10 == null) {
            aVar10 = null;
        }
        c4x c4xVar = c4x.a;
        aVar10.a(videoPlayerAdsPanel, c4xVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar11 = this.O;
        if (aVar11 == null) {
            aVar11 = null;
        }
        aVar11.a(this.u0, c4xVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar12 = this.O;
        if (aVar12 == null) {
            aVar12 = null;
        }
        aVar12.a(linearLayout, d4xVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar13 = this.O;
        if (aVar13 == null) {
            aVar13 = null;
        }
        View view = this.x0.getViewBinding().i;
        g4x.b bVar = g4x.b.a;
        aVar13.b(view, bVar);
        if (this.w0.A().F4().j()) {
            com.vk.libvideo.design.view.swipe.layout.a aVar14 = this.O;
            if (aVar14 == null) {
                aVar14 = null;
            }
            aVar14.b(this.x0.getViewBinding().r.W3(mo2getContext()), c4xVar);
        } else {
            com.vk.libvideo.design.view.swipe.layout.a aVar15 = this.O;
            if (aVar15 == null) {
                aVar15 = null;
            }
            aVar15.b(this.x0.getViewBinding().r.W3(mo2getContext()), d4xVar);
        }
        com.vk.libvideo.design.view.swipe.layout.a aVar16 = this.O;
        if (aVar16 == null) {
            aVar16 = null;
        }
        aVar16.b(this.x0.getActualEndView(), bVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar17 = this.O;
        if (aVar17 == null) {
            aVar17 = null;
        }
        aVar17.b(this.x0.getViewBinding().A, bVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar18 = this.O;
        if (aVar18 == null) {
            aVar18 = null;
        }
        aVar18.b(this.x0.getViewBinding().h, bVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar19 = this.O;
        if (aVar19 == null) {
            aVar19 = null;
        }
        aVar19.b(this.x0.getViewBinding().o, c4xVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar20 = this.O;
        if (aVar20 == null) {
            aVar20 = null;
        }
        aVar20.b(this.x0.getViewBinding().q, g4x.d.a);
        com.vk.libvideo.design.view.swipe.layout.a aVar21 = this.O;
        if (aVar21 == null) {
            aVar21 = null;
        }
        aVar21.b(this.x0.getViewBinding().z, bVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar22 = this.O;
        if (aVar22 == null) {
            aVar22 = null;
        }
        aVar22.b(this.x0.getViewBinding().k, bVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar23 = this.O;
        if (aVar23 == null) {
            aVar23 = null;
        }
        aVar23.b(this.x0.getViewBinding().f, bVar);
        com.vk.libvideo.design.view.swipe.layout.a aVar24 = this.O;
        (aVar24 != null ? aVar24 : null).b(this.x0.getViewBinding().j, bVar);
        i12Var.b(true);
        if (!to()) {
            lyd.g().B();
        }
        if (this.r0.e.P() == null && !this.r0.e.p0()) {
            this.r0.d(this.w0);
        }
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.g() && !g620.f().d(this.r0.e) && !this.r0.e.q0()) {
            z2 = true;
        }
        this.x0.setPipButtonVisible(z2);
        if (z2) {
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            vga0 vga0Var = new vga0(7);
            fVar.getClass();
            this.p0.b(new i0(fVar, vga0Var).subscribe(new g600(this, 28)));
        }
        this.s.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(this);
        this.l0 = new c0a(requireContext(), (gzs) new wcs0(this, 1));
        this.J0 = new xnt0(onCreateView, this.x0, new e(), 56);
        return onCreateView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        i560 i560Var = i560.d;
        i560.d.a();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.s.getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        d0w0 d0w0Var = this.O0;
        ValueAnimator valueAnimator = d0w0Var.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        d0w0Var.g = null;
        if (this.F0) {
            this.w0.pause();
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (s200.v(kn()) != null) {
            s200.v(kn()).c0(this.j0);
        }
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.w0.z0(this.x0.getViewBinding().c, this.x0.getVideoConfig(), null);
        if (this.E0) {
            this.w0.f();
        } else if (!this.w0.a()) {
            this.w0.c();
        }
        com.vk.libvideo.design.view.swipe.layout.a aVar = this.O;
        if (aVar == null) {
            aVar = null;
        }
        aVar.getViewTreeObserver().addOnPreDrawListener(new f());
        this.o0.a(false, true);
        ro();
        if (getArguments() != null && this.G0) {
            awt0.s(view, new icn0(this, 8));
        }
        this.L0 = new exr0(new i());
        if (BuildInfo.s()) {
            VideoFeatures videoFeatures = VideoFeatures.VK_VIDEO_RIGHT_PROMO_FULLSCREEN;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                if (getChildFragmentManager().G(R.id.right_promo_container) == null) {
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    androidx.fragment.app.a b2 = tk5.b(childFragmentManager, childFragmentManager);
                    b2.g(R.id.right_promo_container, new VkVideoPromoFragment(), null);
                    b2.l();
                }
                Fragment G = getChildFragmentManager().G(R.id.right_promo_container);
                if (G instanceof VkVideoPromoFragment) {
                    ((VkVideoPromoFragment) G).P = new qjo0(this, 7);
                }
            }
        }
        if (BuildInfo.s()) {
            VideoFeatures videoFeatures2 = VideoFeatures.VK_VIDEO_RIGHT_PROMO_FULLSCREEN;
            videoFeatures2.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (!bVar.a(videoFeatures2)) {
                VideoFeatures videoFeatures3 = VideoFeatures.VK_VIDEO_BOTTOM_PROMO_FULLSCREEN;
                videoFeatures3.getClass();
                if (!bVar.a(videoFeatures3)) {
                    return;
                }
            }
            this.w0.f0(this.O0);
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        fbr0 fbr0Var = (fbr0) this.l0.c;
        if (fbr0Var != null) {
            if (z) {
                fbr0Var.d();
            } else {
                fbr0Var.c();
            }
        }
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final void oo() {
        this.t0.e(this.i0);
        UiTracker uiTracker = UiTracker.a;
        UiTracker.h.f.remove(this.k0);
        this.x0.T();
        if (!to()) {
            lyd.g().P();
            this.s0.b(-1);
            this.s0.disable();
        }
        boolean z = false;
        this.o0.b(false);
        xy80 xy80Var = this.s0;
        xy80Var.b.remove(this.m0);
        this.r0.c();
        this.w0.T(this.x0);
        d0w0 d0w0Var = this.O0;
        ValueAnimator valueAnimator = d0w0Var.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        d0w0Var.g = null;
        d0w0Var.e.b();
        this.w0.T(this.O0);
        io2 io2Var = this.X;
        if (io2Var != null && io2Var.G() && (this.X instanceof gsx0)) {
            z = true;
        }
        VideoPipStateHolder.a.getClass();
        if (!VideoPipStateHolder.h() && !z) {
            this.w0.pause();
        }
        io.reactivex.rxjava3.disposables.b bVar = this.p0;
        if (bVar != null) {
            bVar.dispose();
        }
        fbr0 fbr0Var = (fbr0) this.l0.c;
        if (fbr0Var != null) {
            fbr0Var.c();
        }
        super.oo();
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final void po() {
        super.po();
        if (to()) {
            return;
        }
        this.o0.a(true, false);
    }

    @Override // com.vk.libvideo.dialogs.BaseAnimationDialog
    public final void qo() {
        super.qo();
        this.o0.a(false, true);
    }

    @Override // com.vk.libvideo.dialogs.AnimationDialog, com.vk.libvideo.design.view.swipe.layout.a.e
    public final void setVolume(float f2) {
        if (to()) {
            return;
        }
        this.w0.setVolume(f2);
    }

    public final void wo(Configuration configuration) {
        Boolean bool = this.r0.c;
        this.v0.d(this.y0, this.r0.e, bool == null ? false : bool.booleanValue(), configuration.orientation == 2, false);
    }

    public final Activity xo() {
        WeakReference<Activity> weakReference = this.z0;
        return weakReference != null ? weakReference.get() : kn();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        yks0 yks0Var = this.r0;
        if (yks0Var == null) {
            return;
        }
        VideoFile videoFile = yks0Var.e;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        Long valueOf = Long.valueOf(videoFile.o0());
        Long valueOf2 = Long.valueOf(videoFile.I0().b);
        String str = this.H0;
        if (str == null) {
            str = videoFile.r();
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(type, valueOf, valueOf2, null, str, null);
    }

    public final void yo() {
        je0 N0 = this.w0.N0();
        if (N0 != null) {
            ye0.a aVar = (ye0.a) N0;
            ye0.a.C4096a f2 = aVar.f();
            com.vk.libvideo.api.ad.a j2 = aVar.j();
            a6z0 a2 = f2.a();
            boolean c2 = f2.c();
            if (!(j2 instanceof a.AbstractC1195a) || a2 == null || c2) {
                return;
            }
            zo(true);
            this.x0.Q0((a.AbstractC1195a) j2);
        }
    }

    @Override // xsna.u8l
    public final void zb(boolean z) {
        this.o0.a(z, true);
    }

    public final void zo(boolean z) {
        rlt0 rlt0Var = (rlt0) this.o0.c;
        if (rlt0Var != null) {
            rlt0Var.m(z ? FullscreenTransition.SCREEN_ROTATION : FullscreenTransition.TAP);
        }
    }

    public class j extends c56 {
        public j() {
        }

        @Override // xsna.io2
        public final void C() {
            VideoDialog videoDialog = VideoDialog.this;
            videoDialog.x0.getViewBinding().c.setHasTransientState(false);
            videoDialog.x0.R0(true, true);
        }

        @Override // xsna.io2
        public final void J() {
            qo4 qo4Var = new qo4(this, 15);
            if (com.vk.toggle.b.A.a(VideoFeatures.VIDEO_SURFACE_VIEW)) {
                qo4Var.run();
            } else {
                VideoDialog.this.x0.postDelayed(qo4Var, BaseAnimationDialog.d0);
            }
        }

        @Override // xsna.io2
        public final boolean M() {
            return true;
        }

        @Override // xsna.io2
        public final void e0() {
            VideoDialog videoDialog = VideoDialog.this;
            if (videoDialog.x0.isAttachedToWindow()) {
                ViewPropertyAnimator alpha = videoDialog.x0.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                pkk pkkVar = BaseAnimationDialog.Z;
                alpha.setStartDelay(BaseAnimationDialog.b0).setDuration(BaseAnimationDialog.c0).start();
            }
            videoDialog.x0.getViewBinding().c.setHasTransientState(true);
            videoDialog.x0.R0(false, false);
        }

        @Override // xsna.c56
        @Nullable
        public final View f() {
            return VideoDialog.this.x0.getViewBinding().c;
        }

        @Override // xsna.io2
        @NonNull
        public final VideoResizer.VideoFitType getContentScaleType() {
            return VideoDialog.this.x0.getViewBinding().c.getMatrixProvider().getContentScaleType();
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

    public class i implements exr0.a {
        public final l7m a;
        public final NotificationsPermission b;
        public final vit0 c;
        public final v3t0 d;
        public final a e;
        public final zet0 f;
        public final hfs0 g;

        public i() {
            l7m f = m7m.f(VideoDialog.this);
            this.a = f;
            this.b = ((VideoNotificationsPermissionComponent) j6i.b(f, VideoNotificationsPermissionComponent.class)).V();
            this.c = ((VideoSubscriptionComponent) j6i.c(f, VideoSubscriptionComponent.class)).g0();
            this.d = ((VideoPlaybackSpeedComponent) j6i.c(f, VideoPlaybackSpeedComponent.class)).m0();
            this.e = new a();
            this.f = ((VideoSeekComponent) j6i.c(f, VideoSeekComponent.class)).E1();
            this.g = ((VideoMinimizablePlayerComponent) j6i.b(f, VideoMinimizablePlayerComponent.class)).P7();
        }

        @Override // xsna.exr0.a
        @NonNull
        public final u9t0 L() {
            return ((VideoPromoComponent) j6i.b(this.a, VideoPromoComponent.class)).L();
        }

        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.b S() {
            return ((VideoShareComponent) j6i.b(this.a, VideoShareComponent.class)).S();
        }

        @Override // xsna.exr0.a
        @NonNull
        public final NotificationsPermission V() {
            return this.b;
        }

        @Override // xsna.exr0.a
        @NonNull
        public final yks0 W() {
            return VideoDialog.this.r0;
        }

        @Override // xsna.exr0.a
        @Nullable
        public final SearchStatsLoggingInfo a() {
            return VideoDialog.this.I0;
        }

        @Override // xsna.exr0.a
        @Nullable
        public final ows0 b() {
            return null;
        }

        @Override // xsna.exr0.a
        public final void c() {
            VideoDialog videoDialog = VideoDialog.this;
            videoDialog.D0 = videoDialog.w0.isPlaying();
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> e() {
            return null;
        }

        @Override // xsna.exr0.a
        @NonNull
        public final ljt0 g() {
            return ((VideoTechBugreportComponent) j6i.c(this.a, VideoTechBugreportComponent.class)).getReporter();
        }

        @Override // xsna.exr0.a
        @NonNull
        public final vit0 g0() {
            return this.c;
        }

        @Override // xsna.exr0.a
        @NonNull
        public final FragmentActivity getActivity() {
            return VideoDialog.this.kn();
        }

        @Override // xsna.exr0.a
        @NonNull
        public final View getView() {
            return VideoDialog.this.x0;
        }

        @Override // xsna.exr0.a
        @NonNull
        public final zet0 h() {
            return this.f;
        }

        @Override // xsna.exr0.a
        @Nullable
        public final y6s0 i() {
            return this.e;
        }

        @Override // xsna.exr0.a
        @NonNull
        public final kz20 j() {
            return VideoDialog.this.q0;
        }

        @Override // xsna.exr0.a
        @NonNull
        public final MobileOfficialAppsCoreNavStat$EventScreen l() {
            return MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_SINGLE_VIDEO;
        }

        @Override // xsna.exr0.a
        @Nullable
        public final com.vk.video.kidsprofile.restricteduseractions.a m() {
            return a.C1950a.a.getSTUB();
        }

        @Override // xsna.exr0.a
        @NonNull
        public final v3t0 m0() {
            return this.d;
        }

        @Override // xsna.exr0.a
        public final hfs0 n() {
            return this.g;
        }

        @Override // xsna.exr0.a
        @Nullable
        public final AdsDataProvider o() {
            return VideoDialog.this.y0;
        }

        @Override // xsna.exr0.a
        @NonNull
        public final com.vk.video.ui.share.api.a p0() {
            return ((VideoShareComponent) j6i.b(this.a, VideoShareComponent.class)).p0();
        }

        public class a implements y6s0 {
            public a() {
            }

            @Override // xsna.y6s0
            public final void b(@NonNull VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, @NonNull VideoFile videoFile) {
                i iVar = i.this;
                VideoDialog videoDialog = VideoDialog.this;
                int i = g.a[videoBottomSheetSideEffectOptions.ordinal()];
                if (i == 1) {
                    if (videoDialog.to()) {
                        videoDialog.s0.f();
                    }
                    videoDialog.zo(false);
                    videoDialog.b(false);
                    return;
                }
                if (i == 2) {
                    videoDialog.w0.pause();
                } else {
                    if (i != 3) {
                        return;
                    }
                    iVar.c();
                }
            }

            @Override // xsna.y6s0
            public final int c2() {
                yg5 yg5Var = VideoDialog.this.w0;
                if (yg5Var != null) {
                    return (int) (yg5Var.getPosition() / 1000);
                }
                return 0;
            }

            @Override // xsna.y6s0
            public final void a(@NonNull VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, @NonNull VideoFile videoFile) {
            }
        }
    }

    @Override // xsna.yks0.a
    public final void L9(@NonNull VideoFile videoFile, boolean z) {
    }
}
