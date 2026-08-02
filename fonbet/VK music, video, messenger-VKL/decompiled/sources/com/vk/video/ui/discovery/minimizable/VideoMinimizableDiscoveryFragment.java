package com.vk.video.ui.discovery.minimizable;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayoutWithFixedTouches;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s0;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.core.view.components.text.VkText;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.Doc2DocItem;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.Subscription;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.libvideo.api.di.VideoAutologinComponent;
import com.vk.libvideo.api.di.VideoDownloadsComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.api.di.VideoPlaylistVideosComponent;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.libvideo.api.di.WarmupComponent;
import com.vk.libvideo.api.di.WarmupComponent$Companion$STUB$1;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.libvideo.ui.vkvideopromo.VkVideoPromoFragment;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVsidItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$CastConnectOfferModalType;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.music.api.di.MusicInVideoComponent;
import com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent;
import com.vk.video.music.dialog.api.domain.entity.PlaylistOnboardingButton;
import com.vk.video.polls.di.UxPollsComponent;
import com.vk.video.recast.di.RecastDiComponent;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.adfree.VideoAdFreeButton;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView;
import com.vk.video.ui.discovery.minimizable.growth.VideoGrowthButtons;
import com.vk.video.ui.discovery.minimizable.motion.scene.light.node.DiscoveryLayoutNodes;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import com.vk.video.ui.discovery.minimizable.motion.scene.transition.DiscoveryScreenTransitions$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.transition.DiscoveryScreenTransitions$Portrait;
import com.vk.video.ui.discovery.minimizable.motion.scene_dsl.transitions.MotionLayoutCurveFit;
import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl;
import com.vk.video.ui.discovery.minimizable.player.views.VideoViewContainer;
import com.vk.video.ui.discovery.minimizable.preinflate.DiscoveryAsyncPrefetch;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedAudioSnackBarManager;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSnackBarManager;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.a0w0;
import xsna.a44;
import xsna.a5o;
import xsna.aa30;
import xsna.ab30;
import xsna.ae8;
import xsna.ags0;
import xsna.ahs0;
import xsna.akc;
import xsna.akd0;
import xsna.an10;
import xsna.ao50;
import xsna.asf0;
import xsna.asu0;
import xsna.avj0;
import xsna.avs0;
import xsna.axb;
import xsna.b0o0;
import xsna.b0u0;
import xsna.b1z;
import xsna.b25;
import xsna.bnc0;
import xsna.bpn0;
import xsna.bqx0;
import xsna.bsf0;
import xsna.bus0;
import xsna.bvs0;
import xsna.bwt0;
import xsna.bys;
import xsna.byt;
import xsna.bzq0;
import xsna.c3k0;
import xsna.c8f0;
import xsna.cb30;
import xsna.cck0;
import xsna.cff;
import xsna.coj0;
import xsna.cps0;
import xsna.cqr0;
import xsna.ct;
import xsna.ctp0;
import xsna.cus;
import xsna.cvs0;
import xsna.cws0;
import xsna.cys;
import xsna.db30;
import xsna.dbj0;
import xsna.dck0;
import xsna.ddy;
import xsna.df90;
import xsna.dgs0;
import xsna.dhr0;
import xsna.dns0;
import xsna.dp0;
import xsna.drk;
import xsna.dt;
import xsna.dus;
import xsna.dvs0;
import xsna.dw20;
import xsna.dy20;
import xsna.dzs;
import xsna.e3m;
import xsna.e43;
import xsna.eb30;
import xsna.edt0;
import xsna.egs0;
import xsna.ei;
import xsna.eis0;
import xsna.ejf0;
import xsna.enj;
import xsna.epx;
import xsna.er20;
import xsna.etn;
import xsna.eus;
import xsna.evs0;
import xsna.ey20;
import xsna.ezs0;
import xsna.f4m;
import xsna.fcs0;
import xsna.fem0;
import xsna.fgh0;
import xsna.fjs0;
import xsna.fks0;
import xsna.fms0;
import xsna.fnj;
import xsna.fpf0;
import xsna.fus;
import xsna.fvs0;
import xsna.fwb0;
import xsna.fxc0;
import xsna.fyd0;
import xsna.fys;
import xsna.fzr0;
import xsna.g0s0;
import xsna.g5b0;
import xsna.g5z;
import xsna.g9l0;
import xsna.gsi0;
import xsna.gus;
import xsna.gvs0;
import xsna.gy20;
import xsna.gyo0;
import xsna.gzs;
import xsna.h0w0;
import xsna.h1j;
import xsna.h31;
import xsna.h4x;
import xsna.h630;
import xsna.h7v;
import xsna.h88;
import xsna.hd4;
import xsna.hf8;
import xsna.hfz;
import xsna.hg1;
import xsna.hhz;
import xsna.hq2;
import xsna.hqa0;
import xsna.hri0;
import xsna.hrk;
import xsna.hus;
import xsna.hvr0;
import xsna.hzv0;
import xsna.i1;
import xsna.i4s0;
import xsna.i88;
import xsna.i8z;
import xsna.iah0;
import xsna.ian;
import xsna.igs0;
import xsna.iid;
import xsna.ikv0;
import xsna.iml0;
import xsna.iri0;
import xsna.irk;
import xsna.ius;
import xsna.iut0;
import xsna.j5g;
import xsna.j5j;
import xsna.j8n0;
import xsna.jan;
import xsna.jli0;
import xsna.js20;
import xsna.jus;
import xsna.jus0;
import xsna.jvs0;
import xsna.k31;
import xsna.k6s0;
import xsna.kcj0;
import xsna.kdy;
import xsna.kfs0;
import xsna.km50;
import xsna.kus0;
import xsna.kvs0;
import xsna.l4x;
import xsna.l6n0;
import xsna.l6s0;
import xsna.l7s;
import xsna.lfs0;
import xsna.lpj;
import xsna.ltb0;
import xsna.lus0;
import xsna.lyr0;
import xsna.lzh0;
import xsna.m7m;
import xsna.maz;
import xsna.mcj0;
import xsna.mg0;
import xsna.mha;
import xsna.mk50;
import xsna.mlf0;
import xsna.mll0;
import xsna.mmm0;
import xsna.mqe0;
import xsna.msy;
import xsna.mus0;
import xsna.mvs0;
import xsna.mws0;
import xsna.myc0;
import xsna.mzn;
import xsna.mzp0;
import xsna.n9m0;
import xsna.nb30;
import xsna.nfs0;
import xsna.nht0;
import xsna.nih;
import xsna.nrq0;
import xsna.nsd0;
import xsna.nus0;
import xsna.nvs0;
import xsna.nwy;
import xsna.nx7;
import xsna.ob30;
import xsna.of;
import xsna.okf0;
import xsna.om60;
import xsna.on00;
import xsna.oq80;
import xsna.ous0;
import xsna.ovs0;
import xsna.owa0;
import xsna.ows0;
import xsna.p490;
import xsna.pan;
import xsna.pbx;
import xsna.pis0;
import xsna.pkv0;
import xsna.prq0;
import xsna.pus0;
import xsna.pvh0;
import xsna.pvs0;
import xsna.pw40;
import xsna.pyr0;
import xsna.q3s0;
import xsna.q4;
import xsna.qbe0;
import xsna.qcy;
import xsna.qjm0;
import xsna.qkf0;
import xsna.qoj0;
import xsna.qqf0;
import xsna.qtx0;
import xsna.qus0;
import xsna.qvs0;
import xsna.qyt;
import xsna.r0r0;
import xsna.ran;
import xsna.rhh0;
import xsna.rka0;
import xsna.rl3;
import xsna.rme0;
import xsna.rns0;
import xsna.rqs0;
import xsna.rrn0;
import xsna.rus0;
import xsna.rzl0;
import xsna.s3j0;
import xsna.s3q0;
import xsna.sa30;
import xsna.sbt0;
import xsna.ss3;
import xsna.stg0;
import xsna.sv1;
import xsna.swe0;
import xsna.szm0;
import xsna.ta30;
import xsna.tk5;
import xsna.toj0;
import xsna.tot;
import xsna.tqf0;
import xsna.trk;
import xsna.tsk0;
import xsna.tts0;
import xsna.u080;
import xsna.u61;
import xsna.u9t0;
import xsna.ufc;
import xsna.ug8;
import xsna.uh80;
import xsna.uho0;
import xsna.uhs0;
import xsna.ulp0;
import xsna.uus0;
import xsna.uyq0;
import xsna.uys;
import xsna.v0s0;
import xsna.v2v;
import xsna.veg0;
import xsna.vhs0;
import xsna.vk50;
import xsna.vmp0;
import xsna.vpj0;
import xsna.vts0;
import xsna.vus0;
import xsna.vvs0;
import xsna.vyr0;
import xsna.vz9;
import xsna.w5k0;
import xsna.wbb0;
import xsna.wc0;
import xsna.wdm;
import xsna.wg8;
import xsna.wit0;
import xsna.wrl0;
import xsna.wts0;
import xsna.wus0;
import xsna.wvs0;
import xsna.x4r0;
import xsna.x8f0;
import xsna.x9l0;
import xsna.xn50;
import xsna.xus0;
import xsna.xvl0;
import xsna.xvs0;
import xsna.xy0;
import xsna.y4r0;
import xsna.yde;
import xsna.ydy;
import xsna.yg5;
import xsna.yka0;
import xsna.yks0;
import xsna.yus0;
import xsna.yvs0;
import xsna.yw90;
import xsna.yxn0;
import xsna.za30;
import xsna.zcy;
import xsna.zlp0;
import xsna.znj0;
import xsna.zos0;
import xsna.zvj;
import xsna.zvs0;
import xsna.zyl0;

/* compiled from: VideoMinimizableDiscoveryFragment.kt */
/* loaded from: classes7.dex */
public final class VideoMinimizableDiscoveryFragment extends MviImplFragment<com.vk.video.ui.discovery.minimizable.g, s, com.vk.video.ui.discovery.minimizable.c> implements wts0, fms0, ows0, l6s0, qtx0, i88, sbt0 {
    public static final /* synthetic */ int p1 = 0;
    public com.vk.lists.c A0;
    public znj0 B0;
    public ags0 C0;
    public hrk D0;
    public trk E0;
    public drk F0;
    public kfs0 G0;
    public kfs0 H0;
    public q4 I0;
    public m J0;
    public mws0 K0;
    public h4x L0;
    public boolean M0;
    public final l4x N0;
    public final boolean O0;
    public final boolean P0;
    public final Object Q;
    public final boolean Q0;
    public final Object R;
    public final a R0;
    public pan S;
    public final String S0;
    public pan T;
    public final Object T0;
    public b U;
    public final Object U0;
    public tts0 V;
    public final Object V0;
    public com.vk.video.ui.discovery.minimizable.announce.a W;
    public final cws0 W0;
    public MiniPlayerControllersWrapper X;
    public final Object X0;
    public cys Y;
    public final Object Y0;
    public final g Z;
    public final ian Z0;
    public float a0;
    public final fjs0 a1;
    public final h b0;
    public final Object b1;
    public final d c0;
    public final bpn0 c1;
    public nht0 d0;
    public final Object d1;
    public edt0 e0;
    public final Object e1;
    public pbx f0;
    public final Object f1;
    public VideoDiscoveryRelatedVideosSnackBarManager g0;
    public ctp0 g1;
    public VideoDiscoveryRelatedAudioSnackBarManager h0;
    public final Object h1;
    public dgs0 i0;
    public final i4s0 i1;
    public bsf0 j0;
    public final Object j1;
    public bsf0 k0;
    public final fgh0 k1;
    public final Object l0;
    public szm0 l1;
    public final Object m0;
    public final boolean m1;
    public lzh0 n0;
    public boolean n1;
    public final Object o0;
    public boolean o1;
    public final Object p0;
    public final Object q0;
    public final Object r0;
    public final etn s0;
    public final Object t0;
    public final Object u0;
    public final Object v0;
    public final Object w0;
    public OrientationManagerImpl x0;
    public com.vk.lists.c y0;
    public com.vk.lists.c z0;

    /* compiled from: VideoMinimizableDiscoveryFragment.kt */
    public final class a {
        public final bpn0 a = new bpn0(new g9l0(6));

        public a() {
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFragment.kt */
    public static final class b {
        public final ViewGroup a;
        public final cb30 b;
        public final View c;
        public final View d;
        public final VideoGrowthButtons e;
        public final VideoAdFreeButton f;
        public final FrameLayout g;
        public final FrameLayout h;

        public b(ViewGroup viewGroup) {
            this.a = viewGroup;
            this.b = new cb30((ViewGroup) viewGroup.findViewById(R.id.minimizableMotionLayoutContainer));
            this.c = viewGroup.findViewById(R.id.statusBarShadow);
            this.d = viewGroup.findViewById(R.id.navigationBarShadow);
            this.e = (VideoGrowthButtons) viewGroup.findViewById(R.id.videoGrowthButtons);
            this.f = (VideoAdFreeButton) viewGroup.findViewById(R.id.videoAdFreeButton);
            this.g = (FrameLayout) viewGroup.findViewById(R.id.advert_banner_container);
            this.h = (FrameLayout) viewGroup.findViewById(R.id.overlay_banner_container);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger.values().length];
            try {
                iArr[VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger.ByGesture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger.ByBackButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoMinimizableDiscoverySideEffect.Motion.MinimizeTrigger.Other.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Subscription.Subscribed.Notifications.values().length];
            try {
                iArr2[Subscription.Subscribed.Notifications.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Subscription.Subscribed.Notifications.Preferred.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Subscription.Subscribed.Notifications.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VideoRelatedVideosLoopMode.values().length];
            try {
                iArr3[VideoRelatedVideosLoopMode.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[VideoRelatedVideosLoopMode.ALL_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[VideoRelatedVideosLoopMode.SINGLE_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PlaylistOnboardingButton.values().length];
            try {
                iArr4[PlaylistOnboardingButton.OpenPlayList.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[PlaylistOnboardingButton.ContinueWatching.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Doc2DocItem.Banner.Action.values().length];
            try {
                iArr5[Doc2DocItem.Banner.Action.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[Doc2DocItem.Banner.Action.OPEN_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFragment.kt */
    public static final class d implements VideoView.b {
        public d() {
        }

        @Override // com.vk.libvideo.design.view.video.VideoView.b
        public final void a(boolean z) {
            xn50.a.c(VideoMinimizableDiscoveryFragment.this, new c.a(z));
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFragment.kt */
    public static final class e implements AdvertBannerView.b {
        public e() {
        }

        @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
        public final void a() {
            c.g gVar = c.g.b;
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
            videoMinimizableDiscoveryFragment.getClass();
            xn50.a.c(videoMinimizableDiscoveryFragment, gVar);
        }

        @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
        public final void b() {
            c.a0 a0Var = c.a0.b;
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
            videoMinimizableDiscoveryFragment.getClass();
            xn50.a.c(videoMinimizableDiscoveryFragment, a0Var);
        }

        @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
        public final void c() {
            c.a0 a0Var = c.a0.b;
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
            videoMinimizableDiscoveryFragment.getClass();
            xn50.a.c(videoMinimizableDiscoveryFragment, a0Var);
        }

        @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
        public final void d() {
            c.l0 l0Var = c.l0.b;
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
            videoMinimizableDiscoveryFragment.getClass();
            xn50.a.c(videoMinimizableDiscoveryFragment, l0Var);
        }

        @Override // com.vk.libvideo.ui.ad.AdvertBannerView.b
        public final void onBannerClick() {
            c.a0 a0Var = c.a0.b;
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
            videoMinimizableDiscoveryFragment.getClass();
            xn50.a.c(videoMinimizableDiscoveryFragment, a0Var);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFragment.kt */
    public static final class f implements mg0.c {
        public f() {
        }

        @Override // xsna.mg0.c
        public final void a(mg0.b bVar) {
            c.z zVar = new c.z(bVar.a);
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
            videoMinimizableDiscoveryFragment.getClass();
            xn50.a.c(videoMinimizableDiscoveryFragment, zVar);
        }

        @Override // xsna.mg0.c
        public final void onDismiss() {
            c.h hVar = c.h.b;
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
            videoMinimizableDiscoveryFragment.getClass();
            xn50.a.c(videoMinimizableDiscoveryFragment, hVar);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryFragment.kt */
    public static final class h implements VideoView.d {
        public h() {
        }

        @Override // com.vk.libvideo.design.view.video.VideoView.d
        public final void a(boolean z) {
            float f = z ? -iah0.b(108.0f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
            if (videoMinimizableDiscoveryFragment.a0 == f) {
                return;
            }
            videoMinimizableDiscoveryFragment.a0 = f;
            b bVar = videoMinimizableDiscoveryFragment.U;
            if (bVar == null) {
                bVar = null;
            }
            bVar.h.animate().translationY(f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        }
    }

    public VideoMinimizableDiscoveryFragment() {
        uhs0 uhs0Var = new uhs0(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, uhs0Var);
        this.R = msy.a(lazyThreadSafetyMode, new w5k0(6));
        this.Z = new g();
        this.b0 = new h();
        this.c0 = new d();
        this.l0 = msy.a(lazyThreadSafetyMode, new cck0(this, 15));
        this.m0 = msy.a(lazyThreadSafetyMode, new dck0(this, 14));
        this.o0 = msy.a(lazyThreadSafetyMode, new mqe0(this, 25));
        this.p0 = msy.a(lazyThreadSafetyMode, new dbj0(this, 17));
        int i = 18;
        this.q0 = msy.a(lazyThreadSafetyMode, new vpj0(this, i));
        this.r0 = msy.a(lazyThreadSafetyMode, new mlf0(this, i));
        this.s0 = gsi0.b();
        this.t0 = msy.a(lazyThreadSafetyMode, new rka0(this, 29));
        this.u0 = msy.a(lazyThreadSafetyMode, new tqf0(9));
        int i2 = 14;
        this.v0 = msy.a(lazyThreadSafetyMode, new uh80(i2));
        this.w0 = msy.a(lazyThreadSafetyMode, new om60(i2));
        this.L0 = h4x.e;
        l4x l4xVar = new l4x();
        l4xVar.d = true;
        l4xVar.e = true;
        this.N0 = l4xVar;
        this.O0 = fxc0.B().J().a();
        this.P0 = fxc0.B().J().a2();
        this.Q0 = fxc0.B().J().u();
        this.R0 = new a();
        this.S0 = "VideoMinimizableDiscoveryFragment";
        this.T0 = msy.a(lazyThreadSafetyMode, new bzq0(1));
        this.U0 = msy.a(lazyThreadSafetyMode, new nrq0(this, 5));
        this.V0 = msy.a(lazyThreadSafetyMode, new iri0(this, 20));
        this.W0 = new cws0(new c3k0(this, 13));
        this.X0 = msy.a(lazyThreadSafetyMode, new fcs0(this, 4));
        this.Y0 = msy.a(lazyThreadSafetyMode, new qqf0(3));
        this.Z0 = new ian();
        this.a1 = new fjs0();
        this.b1 = msy.a(lazyThreadSafetyMode, new g0s0(1));
        this.c1 = new bpn0(new prq0(this, 13));
        this.d1 = msy.a(lazyThreadSafetyMode, new j8n0(this, 15));
        this.e1 = msy.a(lazyThreadSafetyMode, new cqr0(this, 5));
        this.f1 = msy.a(lazyThreadSafetyMode, new uho0(this, 10));
        this.h1 = msy.a(lazyThreadSafetyMode, new avj0(this, 20));
        this.i1 = new i4s0();
        this.j1 = msy.a(lazyThreadSafetyMode, new ltb0(14));
        this.k1 = fxc0.B().J().T0() ? new com.vk.core.sticky_header.b() : new sv1(21);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SCREENCASTING_ADVERT;
        videoFeatures.getClass();
        this.m1 = com.vk.toggle.b.A.a(videoFeatures);
    }

    public static final void fo(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, Doc2DocItem.Banner.Action action, String str) {
        videoMinimizableDiscoveryFragment.getClass();
        int i = c.$EnumSwitchMapping$4[action.ordinal()];
        if (i == 1) {
            maz.c(((LinksBridgeComponent) m7m.d(videoMinimizableDiscoveryFragment).a(fpf0.a(LinksBridgeComponent.class))).p().e(), videoMinimizableDiscoveryFragment.kn(), str, LaunchContext.A, null, null, 24);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fxc0.B().Y().A(videoMinimizableDiscoveryFragment.kn(), (r27 & 2) != 0 ? null : null, null, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : false, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : str);
        }
    }

    @Override // xsna.sbt0
    public final io.reactivex.rxjava3.subjects.d Bh() {
        return getFeature().Q;
    }

    @Override // xsna.qtx0
    public final String D9() {
        return this.S0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        if (jo() == DiscoveryAsyncPrefetch.VIEW && !this.n1) {
            this.n1 = true;
            myc0.h(g5z.a(this), null, null, new qvs0(this, null), 3);
        }
        if (((Boolean) this.v0.getValue()).booleanValue()) {
            ko().Df();
            ko().Df();
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"AsyncInflate", "Async layout value NOT used"});
        }
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        LayoutInflater from = LayoutInflater.from(new lpj(mo2getContext, dhr0.u().c));
        LayoutInflater from2 = LayoutInflater.from(new lpj(mo2getContext(), dhr0.C().c));
        ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.video_minimizable_player_fragment, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.minimizableMotionLayoutContainer);
        if (((Boolean) this.T0.getValue()).booleanValue()) {
            Context requireContext = requireContext();
            ta30 ta30Var = new ta30(requireContext);
            ta30Var.setId(R.id.minimizableMotionLayout);
            DiscoveryLayoutNodes discoveryLayoutNodes = DiscoveryLayoutNodes.FragmentContainerShadow;
            View view = new View(requireContext);
            view.setId(R.id.mainFragmentContainerShadow);
            view.setBackgroundResource(R.color.vk_black_alpha20);
            s3q0 s3q0Var = s3q0.a;
            ta30Var.b(discoveryLayoutNodes, view);
            DiscoveryLayoutNodes discoveryLayoutNodes2 = DiscoveryLayoutNodes.ContentContainerBackground;
            View view2 = new View(requireContext);
            view2.setId(R.id.relatedVideoItemsBackground);
            view2.setBackgroundResource(R.color.vk_gray_1000);
            ta30Var.b(discoveryLayoutNodes2, view2);
            ta30Var.b(DiscoveryLayoutNodes.ContentContainer, from.inflate(R.layout.video_content_container, (ViewGroup) null));
            DiscoveryLayoutNodes discoveryLayoutNodes3 = DiscoveryLayoutNodes.TabletRecommendationsBackground;
            View view3 = new View(requireContext);
            view3.setId(R.id.tabletRecommendationsBackground);
            view3.setBackgroundResource(R.color.vk_gray_1000);
            ta30Var.b(discoveryLayoutNodes3, view3);
            ta30Var.b(DiscoveryLayoutNodes.TabletRecommendationsContainer, from.inflate(R.layout.video_tablet_recommendations_container, (ViewGroup) null));
            DiscoveryLayoutNodes discoveryLayoutNodes4 = DiscoveryLayoutNodes.PlayerContainer;
            ConstraintLayout constraintLayout = new ConstraintLayout(requireContext);
            constraintLayout.setId(R.id.playerContainer);
            constraintLayout.setClipChildren(false);
            constraintLayout.setClipToPadding(false);
            ta30Var.b(discoveryLayoutNodes4, constraintLayout);
            DiscoveryLayoutNodes discoveryLayoutNodes5 = DiscoveryLayoutNodes.TouchSeekZone;
            View view4 = new View(requireContext);
            view4.setId(R.id.touchable_seek_zone);
            ta30Var.b(discoveryLayoutNodes5, view4);
            DiscoveryLayoutNodes discoveryLayoutNodes6 = DiscoveryLayoutNodes.PlayerContainerShadow;
            View view5 = new View(requireContext);
            view5.setId(R.id.playerShadow);
            ta30Var.b(discoveryLayoutNodes6, view5);
            DiscoveryLayoutNodes discoveryLayoutNodes7 = DiscoveryLayoutNodes.RightPromoContainer;
            FrameLayout frameLayout = new FrameLayout(requireContext);
            frameLayout.setId(R.id.rightPromoContainer);
            frameLayout.setBackgroundResource(R.color.vk_black);
            ta30Var.b(discoveryLayoutNodes7, frameLayout);
            DiscoveryLayoutNodes discoveryLayoutNodes8 = DiscoveryLayoutNodes.BottomPromoContainer;
            FrameLayout frameLayout2 = new FrameLayout(requireContext);
            frameLayout2.setId(R.id.bottomPromoContainer);
            ta30Var.b(discoveryLayoutNodes8, frameLayout2);
            DiscoveryLayoutNodes discoveryLayoutNodes9 = DiscoveryLayoutNodes.CoverOverlayView;
            View view6 = new View(requireContext);
            view6.setId(R.id.cover_overlay_view);
            view6.setBackgroundResource(R.color.vk_black_alpha45);
            ta30Var.b(discoveryLayoutNodes9, view6);
            DiscoveryLayoutNodes discoveryLayoutNodes10 = DiscoveryLayoutNodes.AboutVideoFullscreenRecycler;
            RecyclerPaginatedView recyclerPaginatedView = new RecyclerPaginatedView(requireContext);
            recyclerPaginatedView.setId(R.id.about_video_fullscreen_recycler);
            ta30Var.b(discoveryLayoutNodes10, recyclerPaginatedView);
            ta30Var.b(DiscoveryLayoutNodes.SliderHeaderContainer, from.inflate(R.layout.video_similar_slider_header_container, (ViewGroup) null));
            ta30Var.b(DiscoveryLayoutNodes.SliderContentContainer, from.inflate(R.layout.video_similar_slider_content_container, (ViewGroup) null));
            DiscoveryLayoutNodes discoveryLayoutNodes11 = DiscoveryLayoutNodes.DialogContainer;
            FrameLayout frameLayout3 = new FrameLayout(requireContext);
            frameLayout3.setId(R.id.dialogContainer);
            frameLayout3.setBackgroundResource(R.color.vk_black);
            ta30Var.b(discoveryLayoutNodes11, frameLayout3);
            viewGroup2.addView(ta30Var, new ViewGroup.LayoutParams(-1, -1));
        } else {
            from.inflate(R.layout.video_discovery_motion_layout, viewGroup2);
        }
        View inflate = from2.inflate(R.layout.video_player_container, (ViewGroup) viewGroup.findViewById(R.id.playerContainer));
        inflate.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, requireContext()));
        from.inflate(R.layout.video_announce_container, (ViewGroup) inflate.findViewById(R.id.videoAnnounceBackground));
        return new mk50.c(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v154, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v189, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v197, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v156, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v160, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v164, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        q3s0 q3s0Var;
        TouchActionInfo.b.C1989b c1989b;
        b bVar;
        RecyclerView.o stickyHeadersLinearLayoutManager;
        int i;
        RecyclerView.o stickyHeadersLinearLayoutManager2;
        boolean z;
        boolean i2;
        LayoutInflater layoutInflater;
        yks0 W;
        VideoFile videoFile;
        pan a2;
        RecyclerPaginatedView recyclerPaginatedView;
        VkSubnavigationBar vkSubnavigationBar;
        D2DOnboardingView d2DOnboardingView;
        m mVar;
        s sVar = (s) ao50Var;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        b bVar2 = new b(viewGroup);
        this.U = bVar2;
        mo(bVar2.b.b);
        if (this.m1) {
            com.vk.video.ui.discovery.minimizable.g feature = getFeature();
            vyr0 t6 = ((VideoAdFreeSubscriptionComponent) ko().h.getValue()).t6();
            Resources resources = getResources();
            b25 s = ((BridgeComponent) ko().g.getValue()).s();
            x8f0 T6 = ((RecastDiComponent) ko().m.getValue()).T6();
            b bVar3 = this.U;
            if (bVar3 == null) {
                bVar3 = null;
            }
            this.l1 = new szm0(feature, t6, resources, s, T6, bVar3.b.f.c, new yka0(this, 21));
        }
        ?? r12 = this.w0;
        if (((Boolean) r12.getValue()).booleanValue()) {
            b bVar4 = this.U;
            if (bVar4 == null) {
                bVar4 = null;
            }
            View view2 = bVar4.b.c;
            view2.setBackgroundColor(e43.a.getColor(R.color.vk_black));
            view2.setTranslationZ(-1.0f);
        }
        ian ianVar = this.Z0;
        ianVar.c = view;
        yw90 yw90Var = ianVar.a;
        if (yw90Var != null) {
            yw90Var.d3(view);
        }
        b bVar5 = this.U;
        if (bVar5 == null) {
            bVar5 = null;
        }
        bVar5.b.d.setOnTouchListener(new fvs0());
        b bVar6 = this.U;
        if (bVar6 == null) {
            bVar6 = null;
        }
        bVar6.e.setCallback(new pvs0(this));
        b bVar7 = this.U;
        if (bVar7 == null) {
            bVar7 = null;
        }
        bVar7.f.setCallback(((VideoAdFreeSubscriptionComponent) ko().h.getValue()).E2().c());
        b bVar8 = this.U;
        if (bVar8 == null) {
            bVar8 = null;
        }
        int i3 = 1;
        this.V = new tts0(bVar8.b.f.a, new jus0(this, i3), new kus0(this, i3), new lus0(this, i3), new mus0(this, i3), new nus0(this, i3), ko().e2());
        b bVar9 = this.U;
        if (bVar9 == null) {
            bVar9 = null;
        }
        int i4 = 18;
        this.W = new com.vk.video.ui.discovery.minimizable.announce.a(bVar9.b.f.b, new ous0(this, i3), new pus0(this, i3), new rus0(this, i3), new iml0(this, 16), new n9m0(this, 14), new rrn0(this, i4));
        b bVar10 = this.U;
        if (bVar10 == null) {
            bVar10 = null;
        }
        cb30 cb30Var = bVar10.b;
        int i5 = 0;
        int i6 = 1;
        cb30Var.g.b.setSendAction(new ug8(i6, this, VideoMinimizableDiscoveryFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", i5, 14));
        cb30Var.h.d.setSendAction(new wg8(i6, this, VideoMinimizableDiscoveryFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", i5, 8));
        this.K0 = new mws0(((VideoMinimizablePlayerComponent) ko().a.getValue()).E8(), getChildFragmentManager(), new kcj0(this, 20), new l6n0(this, 15));
        Context requireContext = requireContext();
        mws0 mws0Var = this.K0;
        final int i7 = 0;
        boolean z2 = mws0Var != null && mws0Var.e.b().size() == 0;
        int intValue = ((Number) this.o0.getValue()).intValue();
        b bVar11 = this.U;
        if (bVar11 == null) {
            bVar11 = null;
        }
        of ofVar = bVar11.b.b;
        boolean booleanValue = ((Boolean) r12.getValue()).booleanValue();
        boolean oo = oo();
        boolean no = no();
        Context context = viewGroup.getContext();
        etn etnVar = this.s0;
        boolean i8 = etnVar.i(context);
        boolean z3 = etnVar.c;
        m mVar2 = new m(requireContext, z2, intValue, ofVar, booleanValue, oo, no, i8, new com.vk.movika.sdk.android.defaultplayer.control.n(this, 9), new rzl0(this, i4));
        this.J0 = mVar2;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait = DiscoveryScreenTransitions$Portrait.DiscoveryMatchVideoRatioToDiscovery;
        TouchActionInfo.c.b.a aVar = new TouchActionInfo.c.b.a(R.id.playerContainer);
        TouchActionInfo.b.C1989b c1989b2 = TouchActionInfo.b.C1989b.a;
        TouchActionInfo.Direction direction = TouchActionInfo.Direction.Up;
        q3s0 q3s0Var2 = null;
        int i9 = 336;
        TouchActionInfo.a aVar2 = null;
        TouchActionInfo touchActionInfo = new TouchActionInfo(discoveryScreenTransitions$Portrait, aVar, direction, c1989b2, aVar2, 1.5f, new TouchActionInfo.d.a(new nus0(this, i7)), q3s0Var2, i9);
        float f2 = 1.5f;
        mVar2.n(e43.l(touchActionInfo, new TouchActionInfo(discoveryScreenTransitions$Portrait, new TouchActionInfo.c.b.C1990b("ABOUT_VIDEO_RECYCLER_TAG"), direction, c1989b2, aVar2, f2, new TouchActionInfo.d.a(new ous0(this, i7)), q3s0Var2, i9), new TouchActionInfo(discoveryScreenTransitions$Portrait, new TouchActionInfo.c.b.C1990b("ABOUT_VIDEO_RECYCLER_TAG"), direction, new TouchActionInfo.b.a(true), aVar2, f2, new TouchActionInfo.d.a(new qus0(this, i7)), q3s0Var2, 272)));
        q3s0 q3s0Var3 = new q3s0(this, new dns0());
        m mVar3 = this.J0;
        if (mVar3 != null) {
            ListBuilder e2 = e43.e();
            DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait2 = DiscoveryScreenTransitions$Portrait.DiscoveryToFullscreenVertical;
            TouchActionInfo.c.b.C1990b c1990b = new TouchActionInfo.c.b.C1990b("ABOUT_VIDEO_RECYCLER_TAG");
            TouchActionInfo.b.a aVar3 = new TouchActionInfo.b.a(false);
            TouchActionInfo.Direction direction2 = TouchActionInfo.Direction.Down;
            TouchActionInfo touchActionInfo2 = new TouchActionInfo(discoveryScreenTransitions$Portrait2, c1990b, direction2, aVar3, TouchActionInfo.a.c.a, 1.5f, new TouchActionInfo.d.a((gzs<Boolean>) new gzs(this) { // from class: xsna.zus0
                public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

                {
                    this.c = this;
                }

                @Override // xsna.gzs
                public final Object invoke() {
                    int i10 = i7;
                    VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
                    switch (i10) {
                        case 0:
                            com.vk.video.ui.discovery.minimizable.m mVar4 = videoMinimizableDiscoveryFragment.J0;
                            boolean z4 = false;
                            if (mVar4 != null && mVar4.j()) {
                                z4 = true;
                            }
                            return Boolean.valueOf(!z4);
                        default:
                            int i11 = VideoMinimizableDiscoveryFragment.p1;
                            c.d1 d1Var = c.d1.b;
                            videoMinimizableDiscoveryFragment.getClass();
                            xn50.a.c(videoMinimizableDiscoveryFragment, d1Var);
                            return s3q0.a;
                    }
                }
            }), q3s0Var3, 64);
            DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait3 = DiscoveryScreenTransitions$Portrait.DiscoveryMatchVideoRatioToFullscreenVertical;
            e2.add(TouchActionInfo.a(touchActionInfo2, discoveryScreenTransitions$Portrait3, new TouchActionInfo.d.a(new hri0(this, 14)), 382));
            e2.add(touchActionInfo2);
            TouchActionInfo touchActionInfo3 = new TouchActionInfo(discoveryScreenTransitions$Portrait2, new TouchActionInfo.c.b.a(R.id.playerContainer), direction2, c1989b2, TouchActionInfo.a.b.a, 2.0f, new TouchActionInfo.d.a(new fem0(this, 8)), q3s0Var3, 64);
            q3s0Var = q3s0Var3;
            e2.add(TouchActionInfo.a(touchActionInfo3, discoveryScreenTransitions$Portrait3, new TouchActionInfo.d.a(new avs0(this, i7)), 382));
            e2.add(touchActionInfo3);
            mVar3.n(e2.g());
        } else {
            q3s0Var = q3s0Var3;
        }
        int i10 = 2;
        if (!oo() || (mVar = this.J0) == null) {
            c1989b = c1989b2;
        } else {
            DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape = DiscoveryScreenTransitions$Landscape.DiscoveryToFullscreen;
            TouchActionInfo.c.b.C1990b c1990b2 = new TouchActionInfo.c.b.C1990b("ABOUT_VIDEO_RECYCLER_TAG");
            TouchActionInfo.b.a aVar4 = new TouchActionInfo.b.a(false);
            TouchActionInfo.Direction direction3 = TouchActionInfo.Direction.Down;
            c1989b = c1989b2;
            mVar.n(e43.l(new TouchActionInfo(discoveryScreenTransitions$Landscape, c1990b2, direction3, aVar4, TouchActionInfo.a.c.a, 1.5f, new TouchActionInfo.d.a(i7), q3s0Var, 64), new TouchActionInfo(discoveryScreenTransitions$Landscape, new TouchActionInfo.c.b.a(R.id.playerContainer), direction3, c1989b, TouchActionInfo.a.b.a, 2.0f, new TouchActionInfo.d.a(new rqs0(this, i10)), q3s0Var, 64)));
        }
        if (no()) {
            bVar = null;
        } else {
            ListBuilder e3 = e43.e();
            DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape2 = DiscoveryScreenTransitions$Landscape.DiscoveryToPreparedToPip;
            TouchActionInfo.c.b.a aVar5 = new TouchActionInfo.c.b.a(R.id.playerContainer);
            TouchActionInfo.Direction direction4 = TouchActionInfo.Direction.Down;
            TouchActionInfo.a.c cVar = TouchActionInfo.a.c.a;
            q3s0 q3s0Var4 = null;
            int i11 = 320;
            float f3 = 2.0f;
            TouchActionInfo touchActionInfo4 = new TouchActionInfo(discoveryScreenTransitions$Landscape2, aVar5, direction4, c1989b, cVar, f3, new TouchActionInfo.d.a(i7), q3s0Var4, i11);
            e3.add(TouchActionInfo.a(touchActionInfo4, DiscoveryScreenTransitions$Landscape.DiscoveryWithDialogToPreparedPip, null, 510));
            e3.add(touchActionInfo4);
            TouchActionInfo touchActionInfo5 = new TouchActionInfo(DiscoveryScreenTransitions$Portrait.DiscoveryToDiscoveryPreparedToPip, new TouchActionInfo.c.b.a(R.id.playerContainer), direction4, c1989b, cVar, f3, new TouchActionInfo.d.a(i7), q3s0Var4, i11);
            bVar = null;
            e3.add(TouchActionInfo.a(touchActionInfo5, DiscoveryScreenTransitions$Portrait.DiscoveryVideoMatchRatioToPreparedToPip, null, 510));
            e3.add(TouchActionInfo.a(touchActionInfo5, DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToDiscoveryPreparedToPip, null, 510));
            e3.add(touchActionInfo5);
            ListBuilder g2 = e3.g();
            m mVar4 = this.J0;
            if (mVar4 != null) {
                mVar4.n(g2);
            }
        }
        b bVar12 = this.U;
        if (bVar12 == null) {
            bVar12 = bVar;
        }
        bVar12.b.b.W2(new k(this));
        b bVar13 = this.U;
        if (bVar13 == null) {
            bVar13 = bVar;
        }
        ViewGroup viewGroup2 = bVar13.b.a;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = viewGroup2.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = viewGroup2.getMeasuredHeight();
        f4m.a(viewGroup2, new ovs0(viewGroup2, ref$IntRef, ref$IntRef2, this));
        b bVar14 = this.U;
        if (bVar14 == null) {
            bVar14 = bVar;
        }
        ViewGroup viewGroup3 = bVar14.b.d;
        gvs0 gvs0Var = new gvs0();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(viewGroup3, gvs0Var);
        b bVar15 = this.U;
        if (bVar15 == null) {
            bVar15 = bVar;
        }
        iut0.d.c(bVar15.b.a, new u080() { // from class: xsna.hvs0
            /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.u080
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final bqx0 b(View view3, bqx0 bqx0Var) {
                boolean z4;
                VideoMinimizableDiscoveryFragment.b bVar16;
                VideoMinimizableDiscoveryFragment.b bVar17;
                VideoMinimizableDiscoveryFragment.b bVar18;
                VideoMinimizableDiscoveryFragment.b bVar19;
                int i12 = VideoMinimizableDiscoveryFragment.p1;
                bqx0.q qVar = bqx0Var.a;
                h4x a3 = h4x.a(qVar.j(647), qVar.i(8));
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = VideoMinimizableDiscoveryFragment.this;
                if (!epx.f(videoMinimizableDiscoveryFragment.L0, a3)) {
                    videoMinimizableDiscoveryFragment.L0 = a3;
                    wvs0 wvs0Var = (wvs0) videoMinimizableDiscoveryFragment.f1.getValue();
                    if (wvs0Var != null && !epx.f(wvs0Var.d, a3)) {
                        wvs0Var.d = a3;
                        b1z b1zVar = wvs0Var.b;
                        if (b1zVar != null) {
                            b1zVar.invoke();
                        }
                    }
                    if (videoMinimizableDiscoveryFragment.P0) {
                        VideoMinimizableDiscoveryFragment.b bVar20 = videoMinimizableDiscoveryFragment.U;
                        if (bVar20 == null) {
                            bVar20 = null;
                        }
                        if (bwt0.K(bVar20.b.g.c)) {
                            z4 = false;
                            videoMinimizableDiscoveryFragment.so(a3, z4);
                            bVar16 = videoMinimizableDiscoveryFragment.U;
                            if (bVar16 == null) {
                                bVar16 = null;
                            }
                            int width = bVar16.b.a.getWidth();
                            bVar17 = videoMinimizableDiscoveryFragment.U;
                            if (bVar17 == null) {
                                bVar17 = null;
                            }
                            videoMinimizableDiscoveryFragment.uo(width, bVar17.b.a.getHeight(), a3);
                            bVar18 = videoMinimizableDiscoveryFragment.U;
                            if (bVar18 == null) {
                                bVar18 = null;
                            }
                            bwt0.c0(a3.b, bVar18.c);
                            bVar19 = videoMinimizableDiscoveryFragment.U;
                            if (bVar19 == null) {
                                bVar19 = null;
                            }
                            bwt0.c0(a3.d, bVar19.d);
                        }
                    }
                    z4 = true;
                    videoMinimizableDiscoveryFragment.so(a3, z4);
                    bVar16 = videoMinimizableDiscoveryFragment.U;
                    if (bVar16 == null) {
                    }
                    int width2 = bVar16.b.a.getWidth();
                    bVar17 = videoMinimizableDiscoveryFragment.U;
                    if (bVar17 == null) {
                    }
                    videoMinimizableDiscoveryFragment.uo(width2, bVar17.b.a.getHeight(), a3);
                    bVar18 = videoMinimizableDiscoveryFragment.U;
                    if (bVar18 == null) {
                    }
                    bwt0.c0(a3.b, bVar18.c);
                    bVar19 = videoMinimizableDiscoveryFragment.U;
                    if (bVar19 == null) {
                    }
                    bwt0.c0(a3.d, bVar19.d);
                }
                k6s0 Y4 = videoMinimizableDiscoveryFragment.Y4();
                xnt0 xnt0Var = Y4 instanceof xnt0 ? (xnt0) Y4 : null;
                if (xnt0Var != null) {
                    xnt0Var.g(bqx0Var);
                }
                WindowInsets g3 = bqx0Var.g();
                if (g3 != null) {
                    videoMinimizableDiscoveryFragment.N0.d(g3, !(((VideoMinimizablePlayerComponent) videoMinimizableDiscoveryFragment.ko().a.getValue()).b3().P0() != null ? com.vk.libvideo.api.minimizable.a.j(r1) : false));
                }
                return bqx0Var;
            }
        });
        b bVar16 = this.U;
        if (bVar16 == null) {
            bVar16 = bVar;
        }
        ViewGroup viewGroup4 = bVar16.b.a;
        qcy<Object>[] qcyVarArr = bwt0.a;
        viewGroup4.requestApplyInsets();
        OrientationManagerImpl orientationManagerImpl = new OrientationManagerImpl(activity);
        orientationManagerImpl.disable();
        this.x0 = orientationManagerImpl;
        j jVar = new j(this, activity);
        b bVar17 = this.U;
        ViewGroup viewGroup5 = (bVar17 == null ? bVar : bVar17).a;
        if (bVar17 == null) {
            bVar17 = bVar;
        }
        VideoViewContainer videoViewContainer = bVar17.b.f.a.b;
        er20 er20Var = new er20(ko().V(), ((VideoSubscriptionComponent) ko().y.getValue()).g0(), ((VideoPlaybackSpeedComponent) ko().z.getValue()).m0(), ko().e2(), ((VideoPromoComponent) ko().C.getValue()).L(), ((VideoShareComponent) ko().c.getValue()).p0(), ((VideoSeekComponent) ko().H.getValue()).E1(), ((VideoTechBugreportComponent) ko().G.getValue()).getReporter(), new mvs0(this), ((VideoMinimizablePlayerComponent) ko().a.getValue()).P7(), ((VideoShareComponent) ko().c.getValue()).S(), new ejf0(this, 20), (DonutVideoComponent) ko().J.getValue());
        int i12 = 8;
        ae8 ae8Var = new ae8(1, this, VideoMinimizableDiscoveryFragment.class, "onPlayerViewChanged", "onPlayerViewChanged(Lcom/vk/video/ui/discovery/minimizable/player/views/PlayerViewProvider;)V", 0, 10);
        oq80 oq80Var = new oq80(this, 13);
        OrientationManagerImpl orientationManagerImpl2 = this.x0;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_ANIMATION_OPTIMIZATIONS;
        videoFeatures.getClass();
        com.vk.toggle.b bVar18 = com.vk.toggle.b.A;
        int i13 = 0;
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = new MiniPlayerControllersWrapper(activity, viewGroup5, videoViewContainer, er20Var, this.Z, jVar, ae8Var, this.O0, oq80Var, this.b0, this.c0, this.P0, orientationManagerImpl2, bVar18.a(videoFeatures));
        tts0 tts0Var = this.V;
        if (tts0Var == null) {
            tts0Var = null;
        }
        tts0Var.m = miniPlayerControllersWrapper;
        a0w0 Hf = ko().Hf();
        b bVar19 = this.U;
        if (bVar19 == null) {
            bVar19 = null;
        }
        FrameLayout frameLayout = bVar19.b.g.a;
        Hf.getClass();
        this.X = miniPlayerControllersWrapper;
        OrientationManagerImpl orientationManagerImpl3 = this.x0;
        b bVar20 = this.U;
        if (bVar20 == null) {
            bVar20 = null;
        }
        this.Y = new cys(orientationManagerImpl3, bVar20.a, new kus0(this, i13), new lus0(this, i13), new mus0(this, i13));
        b bVar21 = this.U;
        if (bVar21 == null) {
            bVar21 = null;
        }
        RecyclerPaginatedView recyclerPaginatedView2 = bVar21.b.g.f;
        RecyclerView recyclerView = recyclerPaginatedView2.getRecyclerView();
        h7v Ef = ko().Ef();
        rhh0 rhh0Var = new rhh0(this);
        lfs0 lfs0Var = new lfs0(new yde(this, i12), new vus0(this, i13), new wus0(this, i13), new xus0(this, i13), new nvs0(2, this, VideoMinimizableDiscoveryFragment.class, "onBannerClicked", "onBannerClicked(Lcom/vk/dto/video/Doc2DocItem$Banner$Action;Ljava/lang/String;)V", 0));
        NotificationsPermission V = ko().V();
        Context context2 = recyclerView.getContext();
        HashSet hashSet = iah0.a;
        boolean d2 = fnj.d(context2);
        bpn0 bpn0Var = this.c1;
        mzn mznVar = (mzn) bpn0Var.getValue();
        com.vk.libvideo.api.di.c jb = ((VideoPromoComponent) ko().C.getValue()).jb();
        y4r0 v8 = ((UxPollsComponent) ko().p.getValue()).v8();
        hqa0 Ed = ((AdPixelStatsComponent) ko().i.getValue()).Ed();
        wc0 Gf = ko().Gf();
        egs0 Ff = ko().Ff();
        DiscoveryAsyncPrefetch jo = jo();
        DiscoveryAsyncPrefetch discoveryAsyncPrefetch = DiscoveryAsyncPrefetch.VIEW;
        egs0 egs0Var = jo == discoveryAsyncPrefetch ? Ff : null;
        ?? r0 = this.b1;
        kfs0 kfs0Var = new kfs0(new bnc0(this, 23), Ef, rhh0Var, lfs0Var, V, d2, mznVar, jb, v8, Ed, Gf, egs0Var, (com.vk.stat.recycler.c) r0.getValue(), 64);
        VideoFeatures videoFeatures2 = VideoFeatures.DISCOVERY_ITEMS_PREINFLATE;
        videoFeatures2.getClass();
        boolean a3 = bVar18.a(videoFeatures2);
        ?? r13 = this.X0;
        if (a3) {
            igs0 igs0Var = (igs0) r13.getValue();
            Context context3 = recyclerView.getContext();
            DiscoveryAsyncPrefetch jo2 = jo();
            igs0Var.getClass();
            s0 s0Var = igs0.a(context3, kfs0Var, jo2).d;
            recyclerView.setRecycledViewPool(s0Var.o());
            if (jo() == DiscoveryAsyncPrefetch.VIEW_HOLDER && !fnj.d(requireContext())) {
                s0Var.m();
            }
        }
        this.G0 = kfs0Var;
        recyclerPaginatedView2.setAdapter(kfs0Var);
        recyclerPaginatedView2.o = true;
        recyclerPaginatedView2.setSwipeRefreshEnabled(false);
        boolean d3 = fnj.d(recyclerPaginatedView2.getContext());
        int i14 = 17;
        fgh0 fgh0Var = this.k1;
        if (d3) {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView2);
            dVar.c(2);
            dVar.e = new yxn0(new zyl0(this, i14));
            dVar.a();
        } else {
            RecyclerView recyclerView2 = recyclerPaginatedView2.getRecyclerView();
            if (z3) {
                recyclerPaginatedView2.getContext();
                stickyHeadersLinearLayoutManager = new LinearLayoutManager();
            } else {
                recyclerPaginatedView2.getContext();
                stickyHeadersLinearLayoutManager = new StickyHeadersLinearLayoutManager(this, null, fgh0Var);
            }
            recyclerView2.setLayoutManager(stickyHeadersLinearLayoutManager);
        }
        recyclerPaginatedView2.getRecyclerView().setHasFixedSize(false);
        RecyclerView recyclerView3 = recyclerPaginatedView2.getRecyclerView();
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
        gVar.g = false;
        recyclerView3.setItemAnimator(gVar);
        if (fnj.d(recyclerPaginatedView2.getContext())) {
            b bVar22 = this.U;
            if (bVar22 == null) {
                bVar22 = null;
            }
            VkSubnavigationBar vkSubnavigationBar2 = bVar22.b.g.d;
            float f4 = 16;
            f4m.l(iah0.a(f4) + vkSubnavigationBar2.getPaddingStart(), iah0.a(f4) + vkSubnavigationBar2.getPaddingEnd(), vkSubnavigationBar2);
            recyclerPaginatedView2.getRecyclerView().addItemDecoration(new toj0.b(new uus0(this, 1)));
        }
        if (z3) {
            b bVar23 = this.U;
            if (bVar23 == null) {
                bVar23 = null;
            }
            nfs0 nfs0Var = new nfs0(bVar23.b.g.f.getRecyclerView());
            b bVar24 = this.U;
            if (bVar24 == null) {
                bVar24 = null;
            }
            bVar24.b.b.W2(new kvs0(nfs0Var));
            recyclerPaginatedView2.getRecyclerView().addItemDecoration(nfs0Var);
        }
        if (oo()) {
            b bVar25 = this.U;
            if (bVar25 == null) {
                bVar25 = null;
            }
            RecyclerPaginatedView recyclerPaginatedView3 = bVar25.b.h.a;
            i = 23;
            kfs0 kfs0Var2 = new kfs0(new mcj0(this, i), ko().Ef(), new byt(this), new lfs0(new nx7(this, 16), new qbe0(9), new pyr0(this, 2), new x9l0(this, 12), new jvs0(2, this, VideoMinimizableDiscoveryFragment.class, "onBannerClicked", "onBannerClicked(Lcom/vk/dto/video/Doc2DocItem$Banner$Action;Ljava/lang/String;)V", 0)), ko().V(), true, (mzn) bpn0Var.getValue(), ((VideoPromoComponent) ko().C.getValue()).jb(), null, ((AdPixelStatsComponent) ko().i.getValue()).Ed(), ko().Gf(), jo() == discoveryAsyncPrefetch ? ko().Ff() : null, (com.vk.stat.recycler.c) r0.getValue(), 512);
            if (bVar18.a(videoFeatures2)) {
                igs0 igs0Var2 = (igs0) r13.getValue();
                Context context4 = recyclerPaginatedView3.getRecyclerView().getContext();
                DiscoveryAsyncPrefetch jo3 = jo();
                igs0Var2.getClass();
                s0 s0Var2 = igs0.a(context4, kfs0Var2, jo3).d;
                recyclerPaginatedView3.getRecyclerView().setRecycledViewPool(s0Var2.o());
                if (jo() == DiscoveryAsyncPrefetch.VIEW_HOLDER && fnj.d(requireContext())) {
                    s0Var2.m();
                }
            }
            this.H0 = kfs0Var2;
            recyclerPaginatedView3.setAdapter(kfs0Var2);
            recyclerPaginatedView3.o = true;
            recyclerPaginatedView3.setSwipeRefreshEnabled(false);
            RecyclerView recyclerView4 = recyclerPaginatedView3.getRecyclerView();
            if (z3) {
                recyclerPaginatedView3.getContext();
                stickyHeadersLinearLayoutManager2 = new LinearLayoutManager();
            } else {
                recyclerPaginatedView3.getContext();
                stickyHeadersLinearLayoutManager2 = new StickyHeadersLinearLayoutManager(this, null, fgh0Var);
            }
            recyclerView4.setLayoutManager(stickyHeadersLinearLayoutManager2);
            recyclerPaginatedView3.getRecyclerView().setHasFixedSize(false);
            RecyclerView recyclerView5 = recyclerPaginatedView3.getRecyclerView();
            androidx.recyclerview.widget.g gVar2 = new androidx.recyclerview.widget.g();
            gVar2.g = false;
            recyclerView5.setItemAnimator(gVar2);
            recyclerPaginatedView3.getRecyclerView().addItemDecoration(new ahs0(new jus0(this, 0)));
        } else {
            i = 23;
        }
        boolean a4 = etnVar.a();
        boolean z4 = etnVar.e;
        if (a4 || etnVar.c()) {
            c.h hVar = etnVar.a() ? new c.h(getFeature().N) : new c.h(getFeature().M);
            hVar.i = 10;
            hVar.j = 10;
            hVar.h = new j5j(10);
            ?? r02 = this.p0;
            hVar.f = (r) r02.getValue();
            hVar.d = etnVar.c();
            hVar.e = false;
            this.y0 = hVar.b((r) r02.getValue());
        } else {
            c.h hVar2 = z3 ? new c.h(getFeature().N) : new c.h(getFeature().M);
            hVar2.i = 10;
            hVar2.j = 10;
            hVar2.h = new j5j(10);
            ?? r03 = this.q0;
            hVar2.f = (t) r03.getValue();
            hVar2.d = !z3;
            hVar2.e = false;
            this.A0 = hVar2.b((t) r03.getValue());
            c.h hVar3 = z4 ? new c.h(getFeature().N) : new c.h(getFeature().M);
            hVar3.i = 10;
            hVar3.j = 10;
            hVar3.h = new j5j(10);
            ?? r04 = this.r0;
            hVar3.f = (com.vk.video.ui.discovery.minimizable.a) r04.getValue();
            hVar3.d = !z4;
            hVar3.e = false;
            this.z0 = hVar3.b((com.vk.video.ui.discovery.minimizable.a) r04.getValue());
        }
        if (z3) {
            if (etnVar.g) {
                Context requireContext2 = requireContext();
                HashSet hashSet2 = iah0.a;
                boolean d4 = fnj.d(requireContext2);
                if (d4) {
                    b bVar26 = this.U;
                    if (bVar26 == null) {
                        bVar26 = null;
                    }
                    recyclerPaginatedView = bVar26.b.h.a;
                } else {
                    b bVar27 = this.U;
                    if (bVar27 == null) {
                        bVar27 = null;
                    }
                    recyclerPaginatedView = bVar27.b.g.f;
                }
                if (d4) {
                    b bVar28 = this.U;
                    if (bVar28 == null) {
                        bVar28 = null;
                    }
                    vkSubnavigationBar = bVar28.b.h.b;
                } else {
                    b bVar29 = this.U;
                    if (bVar29 == null) {
                        bVar29 = null;
                    }
                    vkSubnavigationBar = bVar29.b.g.d;
                }
                if (d4) {
                    b bVar30 = this.U;
                    if (bVar30 == null) {
                        bVar30 = null;
                    }
                    d2DOnboardingView = bVar30.b.h.c;
                } else {
                    b bVar31 = this.U;
                    if (bVar31 == null) {
                        bVar31 = null;
                    }
                    d2DOnboardingView = bVar31.b.g.e;
                }
                this.E0 = new trk(recyclerPaginatedView, new hvr0(this, 5), new mmm0(this, 14));
                drk drkVar = new drk(requireContext(), new stg0(this, i));
                vkSubnavigationBar.setDispatchTouchListener(drkVar);
                this.F0 = drkVar;
                z = false;
                this.D0 = new hrk(d2DOnboardingView, vkSubnavigationBar, new uus0(this, 0 == true ? 1 : 0));
            } else {
                z = false;
            }
            b bVar32 = this.U;
            VkSubnavigationBar vkSubnavigationBar3 = (bVar32 == null ? null : bVar32).b.g.d;
            if (bVar32 == null) {
                bVar32 = null;
            }
            VkSubnavigationBar vkSubnavigationBar4 = bVar32.b.h.b;
            Context requireContext3 = requireContext();
            HashSet hashSet3 = iah0.a;
            int i15 = 17;
            int i16 = 1;
            this.C0 = new ags0(vkSubnavigationBar3, vkSubnavigationBar4, fnj.d(requireContext3), getResources().getConfiguration().orientation == 2 ? true : z, new wrl0(this, 18), new pvh0(this, i15), new rme0(this, i15), new ags0.a(new bvs0(this, i16), new cvs0(this, i16), new dvs0(this, i16), new evs0(this, i16)));
        } else {
            z = false;
        }
        pan.a aVar6 = new pan.a();
        b bVar33 = this.U;
        if (bVar33 == null) {
            bVar33 = null;
        }
        RecyclerView recyclerView6 = bVar33.b.g.f.getRecyclerView();
        CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode = CommonVideoStat$TypeScreenMode.DISCOVERY;
        kfs0 kfs0Var3 = this.G0;
        this.S = aVar6.a(recyclerView6, commonVideoStat$TypeScreenMode, 0.8f, kfs0Var3 != null ? new hd4(kfs0Var3, 11) : null);
        if (fnj.d(activity)) {
            pan.a aVar7 = new pan.a();
            b bVar34 = this.U;
            if (bVar34 == null) {
                bVar34 = null;
            }
            a2 = aVar7.a(bVar34.b.h.a.getRecyclerView(), commonVideoStat$TypeScreenMode, (r4 & 4) != 0 ? 0.5f : 0.8f, null);
            this.T = a2;
        }
        if (fxc0.B().J().x1()) {
            if (getChildFragmentManager().G(R.id.rightPromoContainer) == null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a b2 = tk5.b(childFragmentManager, childFragmentManager);
                b2.g(R.id.rightPromoContainer, new VkVideoPromoFragment(), null);
                b2.l();
            }
            Fragment G = getChildFragmentManager().G(R.id.rightPromoContainer);
            if (G instanceof VkVideoPromoFragment) {
                final int i17 = 1;
                ((VkVideoPromoFragment) G).P = new gzs(this) { // from class: xsna.zus0
                    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

                    {
                        this.c = this;
                    }

                    @Override // xsna.gzs
                    public final Object invoke() {
                        int i102 = i17;
                        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
                        switch (i102) {
                            case 0:
                                com.vk.video.ui.discovery.minimizable.m mVar42 = videoMinimizableDiscoveryFragment.J0;
                                boolean z42 = false;
                                if (mVar42 != null && mVar42.j()) {
                                    z42 = true;
                                }
                                return Boolean.valueOf(!z42);
                            default:
                                int i112 = VideoMinimizableDiscoveryFragment.p1;
                                c.d1 d1Var = c.d1.b;
                                videoMinimizableDiscoveryFragment.getClass();
                                xn50.a.c(videoMinimizableDiscoveryFragment, d1Var);
                                return s3q0.a;
                        }
                    }
                };
            }
        } else if (fxc0.B().J().K0()) {
            b bVar35 = this.U;
            if (bVar35 == null) {
                bVar35 = null;
            }
            hzv0.a(bVar35.b.e, ((VkVideoPromoComponent) ko().D.getValue()).Ka(), new u61(this, 14), new mll0(this, 15));
        }
        xn50.a.b(this, sVar.a, new xvl0(this, 13));
        getFeature().J.a(new qjm0(this, 7), getViewLifecycleOwner());
        hg1.a(((VideoPip2Component) ko().b.getValue()).L3().subscribe(new pw40(new vhs0(this, 2), 16)), getViewLifecycleOwner());
        if (BuildInfo.q()) {
            VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_AD_FREE_SUBSCRIPTION;
            videoFeatures3.getClass();
            if (bVar18.a(videoFeatures3)) {
                fzr0 E2 = ((VideoAdFreeSubscriptionComponent) ko().h.getValue()).E2();
                b bVar36 = this.U;
                if (bVar36 == null) {
                    bVar36 = null;
                }
                E2.d(bVar36.f);
                E2.a(VideoAdFreeTrapEventTrigger.APP_START, requireContext());
            }
        }
        etn b3 = gsi0.b();
        Context requireContext4 = requireContext();
        MiniPlayerControllersWrapper miniPlayerControllersWrapper2 = this.X;
        Boolean valueOf = (miniPlayerControllersWrapper2 == null || (W = miniPlayerControllersWrapper2.W()) == null || (videoFile = W.e) == null) ? null : Boolean.valueOf(videoFile.T1());
        if (valueOf != null) {
            b3.getClass();
            i2 = (valueOf.booleanValue() || !b3.i(requireContext4)) ? z : true;
        } else {
            i2 = b3.i(requireContext4);
        }
        if (i2) {
            h7v Ef2 = ko().Ef();
            View requireView = requireView();
            iid iidVar = new iid(this);
            NotificationsPermission V2 = ko().V();
            b bVar37 = this.U;
            if (bVar37 == null) {
                bVar37 = null;
            }
            of ofVar2 = bVar37.b.b;
            qyt qytVar = new qyt(ko().e2());
            if (((Boolean) this.v0.getValue()).booleanValue()) {
                Context requireContext5 = requireContext();
                dhr0.a.getClass();
                layoutInflater = LayoutInflater.from(new lpj(requireContext5, dhr0.u().c));
            } else {
                layoutInflater = null;
            }
            this.B0 = new znj0(Ef2, requireView, new znj0.a(ofVar2, iidVar, V2, new yus0(this, 1), qytVar, layoutInflater), new uyq0(this, 4), new gyo0(this, 6));
        } else {
            this.B0 = null;
        }
        xn50.a.c(this, c.z0.d.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i88
    public final h88 Re() {
        return (bus0) this.U0.getValue();
    }

    @Override // xsna.wts0
    public final void T4(vts0 vts0Var) {
        if (!(vts0Var instanceof vts0.h)) {
            xn50.a.c(this, new c.o0.h(vts0Var));
            return;
        }
        q4 q4Var = this.I0;
        if (q4Var != null) {
            q4Var.d(((vts0.h) vts0Var).a);
        }
    }

    @Override // xsna.wts0
    public final void V9() {
        mws0 mws0Var = this.K0;
        if (mws0Var != null) {
            mws0Var.a();
        }
    }

    @Override // xsna.l6s0
    public final k6s0 Y4() {
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.X;
        if (miniPlayerControllersWrapper != null) {
            return miniPlayerControllersWrapper.Y4();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r0.a0() == true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if ((r0 instanceof xsna.fys.a) == false) goto L9;
     */
    @Override // com.vk.core.fragments.FragmentImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0() {
        cys cysVar = this.Y;
        if (cysVar != null) {
            fys fysVar = cysVar.e;
            if (!(fysVar instanceof fys.b)) {
            }
            return true;
        }
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.X;
        if (miniPlayerControllersWrapper == null || !miniPlayerControllersWrapper.a()) {
            m mVar = this.J0;
            if (mVar == null || !mVar.g()) {
                ko().Hf().getClass();
                xn50.a.c(this, c.x.b);
                return true;
            }
            mws0 mws0Var = this.K0;
            if (mws0Var != null) {
                Object k0 = j5g.k0(mws0Var.e.b());
                FragmentImpl fragmentImpl = k0 instanceof FragmentImpl ? (FragmentImpl) k0 : null;
                if (fragmentImpl != null) {
                }
            }
            mws0 mws0Var2 = this.K0;
            if (mws0Var2 != null) {
                mws0Var2.a();
            }
        } else {
            MiniPlayerControllersWrapper miniPlayerControllersWrapper2 = this.X;
            if (miniPlayerControllersWrapper2 != null) {
                miniPlayerControllersWrapper2.bk(cps0.a);
                return true;
            }
        }
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void ao(View view) {
        super.ao(view);
        ian ianVar = this.Z0;
        ianVar.c = view;
        yw90 yw90Var = ianVar.a;
        if (yw90Var != null) {
            yw90Var.d3(view);
        }
        mzp0 mzp0Var = ianVar.b;
        if (mzp0Var != null) {
            mzp0Var.e(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ows0
    public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3() {
        return ((VideoMinimizablePlayerComponent) ko().a.getValue()).b3();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        xn50.a.c(this, c.c0.b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.quk0
    /* renamed from: eo, reason: merged with bridge method [inline-methods] */
    public final km50 sf(Parcelable parcelable) {
        if (parcelable instanceof VideoMinimizableDiscoverySavedState) {
            return (VideoMinimizableDiscoverySavedState) parcelable;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void go(Context context, VideoFile videoFile) {
        b25 s = ((BridgeComponent) ko().g.getValue()).s();
        requireContext();
        s.getClass();
        xn50.a.c(this, c.r0.b.b);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void ho(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, boolean z, boolean z2) {
        com.vk.lists.c cVar;
        com.vk.video.ui.discovery.minimizable.a aVar;
        com.vk.lists.c cVar2;
        com.vk.lists.c cVar3;
        znj0 znj0Var;
        qoj0 g2;
        etn etnVar = this.s0;
        if (etnVar.a()) {
            this.o1 = true;
            kfs0 kfs0Var = this.H0;
            if (kfs0Var != null) {
                kfs0Var.setItems(EmptyList.b);
            }
            com.vk.lists.c cVar4 = this.y0;
            if (cVar4 != null) {
                String str = videoDiscoveryCatalogRepository$Section.c;
                cVar4.s(str != null ? str : "__discovery_catalog_special_section_next_from__");
            }
            if (z2 && (znj0Var = this.B0) != null && (g2 = znj0Var.g()) != null) {
                g2.setItems(EmptyList.b);
            }
            com.vk.lists.c cVar5 = this.y0;
            if (cVar5 != null) {
                cVar5.o();
            }
            if (!z || (cVar3 = this.y0) == null) {
                return;
            }
            cVar3.n(false);
            return;
        }
        if (etnVar.c) {
            this.o1 = true;
            kfs0 kfs0Var2 = this.H0;
            if (kfs0Var2 != null) {
                kfs0Var2.setItems(EmptyList.b);
            }
            com.vk.lists.c cVar6 = this.A0;
            if (cVar6 != null) {
                String str2 = videoDiscoveryCatalogRepository$Section.c;
                cVar6.s(str2 != null ? str2 : "__discovery_catalog_special_section_next_from__");
            }
            com.vk.lists.c cVar7 = this.A0;
            if (cVar7 != null) {
                cVar7.o();
            }
            if (!z || (cVar2 = this.A0) == null) {
                return;
            }
            cVar2.n(false);
            return;
        }
        if (etnVar.e) {
            com.vk.lists.c cVar8 = this.z0;
            if (cVar8 != null) {
                String str3 = videoDiscoveryCatalogRepository$Section.c;
                cVar8.s(str3 != null ? str3 : "__discovery_catalog_special_section_next_from__");
            }
            if (z2 && (aVar = (com.vk.video.ui.discovery.minimizable.a) this.r0.getValue()) != null) {
                znj0 a2 = aVar.a();
                qoj0 g3 = a2 != null ? a2.g() : null;
                if (g3 != null) {
                    g3.setItems(EmptyList.b);
                }
            }
            com.vk.lists.c cVar9 = this.z0;
            if (cVar9 != null) {
                cVar9.o();
            }
            if (!z || (cVar = this.z0) == null) {
                return;
            }
            cVar.n(false);
        }
    }

    public final yg5 io() {
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.X;
        if (miniPlayerControllersWrapper == null) {
            miniPlayerControllersWrapper = null;
        }
        if (miniPlayerControllersWrapper != null) {
            Object obj = miniPlayerControllersWrapper.r;
            i8z i8zVar = obj instanceof i8z ? (i8z) obj : null;
            if (i8zVar != null) {
                return i8zVar.j();
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final DiscoveryAsyncPrefetch jo() {
        return (DiscoveryAsyncPrefetch) this.Y0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VideoMinimizableDiscoveryInternalComponent ko() {
        return (VideoMinimizableDiscoveryInternalComponent) this.Q.getValue();
    }

    @Override // xsna.qtx0
    public final boolean lc() {
        if (no()) {
            m mVar = this.J0;
            if (mVar != null) {
                if (epx.f(mVar.c(), mVar.r ? DiscoveryScreenMotionStates$Landscape.Hidden : DiscoveryScreenMotionStates$Portrait.Hidden)) {
                    return false;
                }
            }
            com.vk.video.ui.discovery.minimizable.announce.a aVar = this.W;
            if ((aVar != null ? aVar : null).n instanceof VideoAnnounceState.Shown) {
                return false;
            }
        } else {
            com.vk.video.ui.discovery.minimizable.announce.a aVar2 = this.W;
            if ((aVar2 != null ? aVar2 : null).n instanceof VideoAnnounceState.Shown) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void lo(VideoMinimizableDiscoverySideEffect.x xVar) {
        ((DonutVideoComponent) ko().J.getValue()).getActionHandler().a(xVar.a, requireContext(), new a5o(true, new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), xVar.b.h())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void mo(of ofVar) {
        Lazy lazy;
        int dimensionPixelSize;
        LinkedHashMap linkedHashMap;
        ab30 ab30Var;
        androidx.constraintlayout.motion.widget.b bVar;
        ArrayList<a.b> arrayList;
        int i;
        if (!(ofVar instanceof MotionLayoutWithFixedTouches)) {
            if (ofVar instanceof ta30) {
                ?? r2 = this.f1;
                wvs0 wvs0Var = (wvs0) r2.getValue();
                if (wvs0Var != null) {
                    ta30 ta30Var = (ta30) ofVar;
                    DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait = DiscoveryScreenMotionStates$Portrait.Hidden;
                    List l = e43.l(new jan(wvs0Var), new ran(wvs0Var), new wdm(wvs0Var), new js20(wvs0Var), new v2v(wvs0Var), new uys(wvs0Var), new c8f0(wvs0Var), new bys(wvs0Var), new dzs(wvs0Var));
                    lazy = r2;
                    List l2 = e43.l(new cus(new ei(DiscoveryScreenTransitions$Portrait.DiscoveryToDiscoveryWithDialogUnderVideo, DiscoveryScreenMotionStates$Portrait.Discovery, DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo), new hq2((PathInterpolator) null, 3), on00.g(new Pair(0, new cus.a(wvs0Var)))), new dus(new ei(DiscoveryScreenTransitions$Portrait.DiscoveryToFullscreenVertical, DiscoveryScreenMotionStates$Portrait.Discovery, DiscoveryScreenMotionStates$Portrait.Fullscreen), new hq2((PathInterpolator) null, 3), on00.g(new Pair(100, new dus.a(wvs0Var)))), new hus(new ei(DiscoveryScreenTransitions$Portrait.HiddenToDiscovery, DiscoveryScreenMotionStates$Portrait.Hidden, DiscoveryScreenMotionStates$Portrait.Discovery), new hq2((PathInterpolator) null, 3), on00.g(new Pair(20, new hus.a(wvs0Var)))), new fus(new ei(DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToDialogFullscreen, DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo, DiscoveryScreenMotionStates$Portrait.DialogFullscreen), new hq2((PathInterpolator) null, 3), on00.g(new Pair(0, new fus.a(wvs0Var)))), new eus(new ei(DiscoveryScreenTransitions$Portrait.DiscoveryToMiniplayer, DiscoveryScreenMotionStates$Portrait.Discovery, DiscoveryScreenMotionStates$Portrait.Miniplayer), new hq2(300L, new AccelerateDecelerateInterpolator()), on00.g(new Pair(80, new eus.a(wvs0Var)), new Pair(100, new eus.b(wvs0Var)))), new ius(new ei(DiscoveryScreenTransitions$Portrait.MiniplayerToHidden, DiscoveryScreenMotionStates$Portrait.Miniplayer, DiscoveryScreenMotionStates$Portrait.Hidden), new hq2((PathInterpolator) null, 3), on00.g(new Pair(100, new ius.a(wvs0Var)))), new jus(new ei(DiscoveryScreenTransitions$Portrait.ReadyToStartToDiscovery, DiscoveryScreenMotionStates$Portrait.ReadyToStart, DiscoveryScreenMotionStates$Portrait.Discovery), new hq2(new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.25f, 1.0f), 1)), new gus(new ei(DiscoveryScreenTransitions$Landscape.FullscreenToFullscreenWithDialog, DiscoveryScreenMotionStates$Landscape.Fullscreen, DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog), new hq2((PathInterpolator) null, 3), on00.g(new Pair(0, new gus.a(wvs0Var)))));
                    ta30Var.getClass();
                    HashMap hashMap = new HashMap();
                    for (Object obj : l) {
                        hashMap.put(((ob30) obj).b, obj);
                    }
                    HashMap hashMap2 = new HashMap();
                    for (Object obj2 : l2) {
                        hashMap2.put(((vmp0) obj2).a.a, obj2);
                    }
                    za30 za30Var = new za30(discoveryScreenMotionStates$Portrait, hashMap2, hashMap, wvs0Var, new ArrayList(ta30Var.e.values()));
                    ta30Var.d = za30Var;
                    za30Var.g = new h630(ta30Var, 1);
                    za30Var.e.add(new tot(new h1j(ta30Var, 24)));
                } else {
                    lazy = r2;
                }
                wvs0 wvs0Var2 = (wvs0) lazy.getValue();
                if (wvs0Var2 == null || wvs0Var2.e == (dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.video_minimized_player_height))) {
                    return;
                }
                wvs0Var2.e = dimensionPixelSize;
                b1z b1zVar = wvs0Var2.b;
                if (b1zVar != null) {
                    b1zVar.invoke();
                    return;
                }
                return;
            }
            return;
        }
        MotionLayout motionLayout = (MotionLayout) ofVar;
        boolean no = no();
        boolean i2 = this.s0.i(((MotionLayoutWithFixedTouches) ofVar).getContext());
        boolean booleanValue = ((Boolean) this.u0.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.w0.getValue()).booleanValue();
        xvs0 xvs0Var = new xvs0(no, i2, booleanValue, booleanValue2);
        yvs0 yvs0Var = new yvs0(motionLayout.getContext().getResources(), (WindowManager) motionLayout.getContext().getSystemService("window"), i2, booleanValue2, booleanValue);
        androidx.constraintlayout.motion.widget.a aVar = new androidx.constraintlayout.motion.widget.a(motionLayout);
        ab30 ab30Var2 = new ab30(aVar, xvs0Var);
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Iterator it = e43.l(new zlp0(R.id.from_hidden_to_expanded, R.id.hidden, R.id.expanded), new zlp0(R.id.from_hidden_to_expanded_match_ratio, R.id.hidden, R.id.expanded_match_ratio)).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = ab30Var2.c;
            ab30Var = ab30Var2;
            Iterator it2 = it;
            if (!hasNext) {
                break;
            }
            zlp0 zlp0Var = (zlp0) it2.next();
            boolean z = no;
            int i3 = zlp0Var.a;
            MotionLayout motionLayout2 = motionLayout;
            a.b bVar2 = new a.b(i3, aVar, zlp0Var.b, zlp0Var.c);
            kdy k = sa30.k();
            ydy ydyVar = new ydy();
            ydyVar.b = R.id.playerContainer;
            MotionLayoutCurveFit motionLayoutCurveFit = MotionLayoutCurveFit.LINEAR;
            yvs0 yvs0Var2 = yvs0Var;
            ydyVar.e = motionLayoutCurveFit.ordinal();
            ydyVar.a = 20;
            ydyVar.i("percentHeight", valueOf);
            ydyVar.i("percentWidth", valueOf2);
            ydyVar.i("percentX", valueOf);
            k.b(ydyVar);
            ddy ddyVar = new ddy();
            ddyVar.b = R.id.relatedVideoItemsBackground;
            s3j0.d(ddyVar, "alpha", valueOf, motionLayoutCurveFit, "curveFit");
            ddyVar.a = 20;
            k.b(ddyVar);
            ydy ydyVar2 = new ydy();
            ydyVar2.b = R.id.relatedVideoItemsBackground;
            ydyVar2.e = motionLayoutCurveFit.ordinal();
            ydyVar2.a = 20;
            ydyVar2.i("percentHeight", valueOf2);
            ydyVar2.i("percentY", valueOf2);
            k.b(ydyVar2);
            if (!booleanValue2) {
                ddy ddyVar2 = new ddy();
                ddyVar2.b = R.id.mainFragmentContainerShadow;
                s3j0.d(ddyVar2, "alpha", valueOf2, motionLayoutCurveFit, "curveFit");
                ddyVar2.a = 20;
                k.b(ddyVar2);
            }
            ddy ddyVar3 = new ddy();
            ddyVar3.b = R.id.playerContainer;
            s3j0.d(ddyVar3, "alpha", valueOf, motionLayoutCurveFit, "curveFit");
            ddyVar3.a = 20;
            ddy a2 = ct.a(k, ddyVar3);
            a2.b = R.id.contentContainer;
            s3j0.d(a2, "alpha", valueOf2, motionLayoutCurveFit, "curveFit");
            a2.a = 20;
            k.b(a2);
            ydy ydyVar3 = new ydy();
            ydyVar3.b = R.id.contentContainer;
            ydyVar3.e = motionLayoutCurveFit.ordinal();
            ydyVar3.a = 20;
            ydyVar3.i("percentHeight", valueOf2);
            ydyVar3.i("percentY", valueOf2);
            k.b(ydyVar3);
            bVar2.a(k);
            linkedHashMap.put(Integer.valueOf(i3), bVar2);
            ab30Var2 = ab30Var;
            it = it2;
            no = z;
            motionLayout = motionLayout2;
            yvs0Var = yvs0Var2;
        }
        yvs0 yvs0Var3 = yvs0Var;
        MotionLayout motionLayout3 = motionLayout;
        boolean z2 = no;
        if (booleanValue2) {
            Iterator it3 = e43.l(new zlp0(R.id.from_discovery_enter_start_to_expanded, R.id.discovery_enter_start, R.id.expanded), new zlp0(R.id.from_discovery_enter_start_to_expanded_match_ratio, R.id.discovery_enter_start, R.id.expanded_match_ratio)).iterator();
            while (it3.hasNext()) {
                zlp0 zlp0Var2 = (zlp0) it3.next();
                int i4 = zlp0Var2.a;
                a.b bVar3 = new a.b(i4, aVar, zlp0Var2.b, zlp0Var2.c);
                bVar3.q = 0;
                bVar3.b(300);
                Iterator it4 = it3;
                bVar3.c(-1, 0, "cubic(0,0,0.25,1)");
                int b2 = an10.b(27.666666f);
                kdy k2 = sa30.k();
                ddy ddyVar4 = new ddy();
                ddyVar4.b = R.id.relatedVideoItemsBackground;
                ddyVar4.a = 0;
                ddyVar4.i("alpha", valueOf2);
                k2.b(ddyVar4);
                ddy ddyVar5 = new ddy();
                ddyVar5.b = R.id.relatedVideoItemsBackground;
                ddyVar5.a = b2;
                ddyVar5.i("alpha", valueOf);
                k2.b(ddyVar5);
                ddy ddyVar6 = new ddy();
                ddyVar6.b = R.id.contentContainer;
                ddyVar6.a = 0;
                ddyVar6.i("alpha", valueOf2);
                k2.b(ddyVar6);
                ddy ddyVar7 = new ddy();
                ddyVar7.b = R.id.contentContainer;
                ddyVar7.a = b2;
                ddyVar7.i("alpha", valueOf);
                linkedHashMap.put(dt.a(k2, ddyVar7, bVar3, k2, i4), bVar3);
                it3 = it4;
                xvs0Var = xvs0Var;
            }
        }
        xvs0 xvs0Var2 = xvs0Var;
        linkedHashMap.put(Integer.valueOf(R.id.from_expanded_match_ratio_to_expanded), new a.b(R.id.from_expanded_match_ratio_to_expanded, aVar, R.id.expanded_match_ratio, R.id.expanded));
        for (zlp0 zlp0Var3 : e43.l(new zlp0(R.id.from_expanded_to_fullscreen_vertical, R.id.expanded, R.id.fullscreen_vertical), new zlp0(R.id.from_expanded_match_ratio_to_fullscreen_vertical, R.id.expanded_match_ratio, R.id.fullscreen_vertical))) {
            int i5 = zlp0Var3.a;
            a.b bVar4 = new a.b(i5, aVar, zlp0Var3.b, zlp0Var3.c);
            bVar4.c(3, 0, null);
            bVar4.b(300);
            kdy k3 = sa30.k();
            ddy ddyVar8 = new ddy();
            ddyVar8.b = R.id.relatedVideoItemsBackground;
            ddyVar8.i("alpha", valueOf);
            ddyVar8.a = 100;
            linkedHashMap.put(dt.a(k3, ddyVar8, bVar4, k3, i5), bVar4);
        }
        for (Iterator it5 = e43.l(new zlp0(R.id.from_expanded_to_dialog_under_video, R.id.expanded, R.id.dialog_under_video), new zlp0(R.id.from_expanded_match_ratio_to_dialog_under_video, R.id.expanded_match_ratio, R.id.dialog_under_video)).iterator(); it5.hasNext(); it5 = it5) {
            zlp0 zlp0Var4 = (zlp0) it5.next();
            int i6 = zlp0Var4.a;
            a.b bVar5 = new a.b(i6, aVar, zlp0Var4.b, zlp0Var4.c);
            bVar5.c(3, 0, null);
            bVar5.q = 2;
            bVar5.b(300);
            kdy k4 = sa30.k();
            ydy ydyVar4 = new ydy();
            ydyVar4.b = R.id.dialogContainer;
            MotionLayoutCurveFit motionLayoutCurveFit2 = MotionLayoutCurveFit.LINEAR;
            ydyVar4.e = motionLayoutCurveFit2.ordinal();
            ydyVar4.a = 0;
            ydyVar4.i("percentHeight", valueOf);
            k4.b(ydyVar4);
            ddy ddyVar9 = new ddy();
            ddyVar9.b = R.id.dialogContainer;
            s3j0.d(ddyVar9, "alpha", valueOf, motionLayoutCurveFit2, "curveFit");
            ddyVar9.a = 0;
            linkedHashMap.put(dt.a(k4, ddyVar9, bVar5, k4, i6), bVar5);
        }
        a.b bVar6 = new a.b(R.id.from_dialog_under_video_to_dialog_expanded, aVar, R.id.dialog_under_video, R.id.dialog_expanded);
        bVar6.q = 2;
        bVar6.c(3, 0, null);
        bVar6.b(300);
        kdy k5 = sa30.k();
        ddy ddyVar10 = new ddy();
        ddyVar10.b = R.id.playerContainer;
        ddyVar10.a = 1;
        ddyVar10.i("elevation", valueOf2);
        k5.b(ddyVar10);
        ddy ddyVar11 = new ddy();
        ddyVar11.b = R.id.touchable_seek_zone;
        ddyVar11.a = 1;
        ddyVar11.i("elevation", valueOf2);
        linkedHashMap.put(dt.a(k5, ddyVar11, bVar6, k5, R.id.from_dialog_under_video_to_dialog_expanded), bVar6);
        for (zlp0 zlp0Var5 : e43.l(new zlp0(R.id.from_dialog_expanded_to_expanded, R.id.dialog_expanded, R.id.expanded), new zlp0(R.id.from_dialog_expanded_to_expanded_match_ratio, R.id.dialog_expanded, R.id.expanded_match_ratio))) {
            int i7 = zlp0Var5.a;
            a.b bVar7 = new a.b(i7, aVar, zlp0Var5.b, zlp0Var5.c);
            bVar7.c(3, 0, null);
            bVar7.b(300);
            kdy k6 = sa30.k();
            ddy ddyVar12 = new ddy();
            ddyVar12.b = R.id.dialogContainer;
            ddyVar12.i("alpha", valueOf);
            ddyVar12.i("curveFit", Integer.valueOf(MotionLayoutCurveFit.LINEAR.ordinal()));
            ddyVar12.a = 100;
            linkedHashMap.put(dt.a(k6, ddyVar12, bVar7, k6, i7), bVar7);
        }
        a.b bVar8 = new a.b(R.id.from_dialog_expanded_to_hidden, aVar, R.id.dialog_expanded, R.id.hidden);
        bVar8.b(300);
        kdy k7 = sa30.k();
        ydy ydyVar5 = new ydy();
        ydyVar5.b = R.id.playerContainer;
        MotionLayoutCurveFit motionLayoutCurveFit3 = MotionLayoutCurveFit.LINEAR;
        ydyVar5.e = motionLayoutCurveFit3.ordinal();
        ydyVar5.a = 80;
        ydyVar5.i("percentHeight", valueOf2);
        ydyVar5.i("percentWidth", valueOf);
        ydyVar5.i("percentX", valueOf);
        k7.b(ydyVar5);
        ddy ddyVar13 = new ddy();
        ddyVar13.b = R.id.playerContainer;
        ddyVar13.i("curveFit", Integer.valueOf(motionLayoutCurveFit3.ordinal()));
        ddyVar13.a = 80;
        ddyVar13.i("alpha", valueOf2);
        k7.b(ddyVar13);
        ydy ydyVar6 = new ydy();
        ydyVar6.b = R.id.playerShadow;
        ydyVar6.e = motionLayoutCurveFit3.ordinal();
        ydyVar6.a = 80;
        ydyVar6.i("percentHeight", valueOf2);
        ydyVar6.i("percentWidth", valueOf);
        ydyVar6.i("percentX", valueOf);
        k7.b(ydyVar6);
        ddy ddyVar14 = new ddy();
        ddyVar14.b = R.id.playerShadow;
        s3j0.d(ddyVar14, "alpha", valueOf2, motionLayoutCurveFit3, "curveFit");
        ddyVar14.a = 80;
        k7.b(ddyVar14);
        if (!booleanValue2) {
            ddy ddyVar15 = new ddy();
            ddyVar15.b = R.id.mainFragmentContainerShadow;
            s3j0.d(ddyVar15, "alpha", valueOf2, motionLayoutCurveFit3, "curveFit");
            ddyVar15.a = 80;
            k7.b(ddyVar15);
        }
        ddy ddyVar16 = new ddy();
        ddyVar16.b = R.id.relatedVideoItemsBackground;
        s3j0.d(ddyVar16, "alpha", valueOf2, motionLayoutCurveFit3, "curveFit");
        ddyVar16.a = 80;
        ddy a3 = ct.a(k7, ddyVar16);
        a3.b = R.id.contentContainer;
        s3j0.d(a3, "alpha", valueOf2, motionLayoutCurveFit3, "curveFit");
        a3.a = 80;
        k7.b(a3);
        ydy ydyVar7 = new ydy();
        ydyVar7.b = R.id.contentContainer;
        ydyVar7.e = motionLayoutCurveFit3.ordinal();
        ydyVar7.a = 80;
        ydyVar7.i("percentHeight", valueOf);
        ydyVar7.i("percentX", valueOf);
        k7.b(ydyVar7);
        ydy ydyVar8 = new ydy();
        ydyVar8.b = R.id.dialogContainer;
        ydyVar8.e = motionLayoutCurveFit3.ordinal();
        ydyVar8.a = 80;
        ydyVar8.i("percentHeight", valueOf2);
        k7.b(ydyVar8);
        ddy ddyVar17 = new ddy();
        ddyVar17.b = R.id.dialogContainer;
        s3j0.d(ddyVar17, "alpha", valueOf, motionLayoutCurveFit3, "curveFit");
        ddyVar17.a = 60;
        ddy a4 = ct.a(k7, ddyVar17);
        a4.b = R.id.dialogContainer;
        s3j0.d(a4, "alpha", valueOf2, motionLayoutCurveFit3, "curveFit");
        a4.a = 80;
        linkedHashMap.put(dt.a(k7, a4, bVar8, k7, R.id.from_dialog_expanded_to_hidden), bVar8);
        a.b bVar9 = new a.b(R.id.from_dialog_under_video_to_hidden, aVar, R.id.dialog_under_video, R.id.hidden);
        bVar9.b(300);
        bVar9.q = 2;
        kdy k8 = sa30.k();
        ydy ydyVar9 = new ydy();
        ydyVar9.b = R.id.playerContainer;
        ydyVar9.e = motionLayoutCurveFit3.ordinal();
        ydyVar9.a = 80;
        ydyVar9.i("percentHeight", valueOf2);
        ydyVar9.i("percentWidth", valueOf);
        ydyVar9.i("percentX", valueOf);
        k8.b(ydyVar9);
        ddy ddyVar18 = new ddy();
        ddyVar18.b = R.id.playerContainer;
        ddyVar18.i("curveFit", Integer.valueOf(motionLayoutCurveFit3.ordinal()));
        ddyVar18.a = 80;
        ddyVar18.i("alpha", valueOf);
        k8.b(ddyVar18);
        ddy ddyVar19 = new ddy();
        ddyVar19.b = R.id.relatedVideoItemsBackground;
        s3j0.d(ddyVar19, "alpha", valueOf, motionLayoutCurveFit3, "curveFit");
        ddyVar19.a = 80;
        k8.b(ddyVar19);
        ydy ydyVar10 = new ydy();
        ydyVar10.b = R.id.relatedVideoItemsBackground;
        ydyVar10.e = motionLayoutCurveFit3.ordinal();
        ydyVar10.a = 80;
        ydyVar10.i("percentHeight", valueOf);
        ydyVar10.i("percentY", valueOf);
        k8.b(ydyVar10);
        if (!booleanValue2) {
            ddy ddyVar20 = new ddy();
            ddyVar20.b = R.id.mainFragmentContainerShadow;
            s3j0.d(ddyVar20, "alpha", valueOf2, motionLayoutCurveFit3, "curveFit");
            ddyVar20.a = 80;
            k8.b(ddyVar20);
        }
        ddy ddyVar21 = new ddy();
        ddyVar21.b = R.id.contentContainer;
        s3j0.d(ddyVar21, "alpha", valueOf2, motionLayoutCurveFit3, "curveFit");
        ddyVar21.a = 80;
        k8.b(ddyVar21);
        ydy ydyVar11 = new ydy();
        ydyVar11.b = R.id.contentContainer;
        ydyVar11.e = motionLayoutCurveFit3.ordinal();
        ydyVar11.a = 80;
        ydyVar11.i("percentHeight", valueOf);
        ydyVar11.i("percentY", valueOf);
        k8.b(ydyVar11);
        ddy ddyVar22 = new ddy();
        ddyVar22.b = R.id.dialogContainer;
        ddyVar22.i("curveFit", Integer.valueOf(motionLayoutCurveFit3.ordinal()));
        ddyVar22.a = 80;
        ddyVar22.i("alpha", valueOf2);
        k8.b(ddyVar22);
        ydy ydyVar12 = new ydy();
        ydyVar12.b = R.id.dialogContainer;
        ydyVar12.e = motionLayoutCurveFit3.ordinal();
        ydyVar12.a = 80;
        ydyVar12.i("percentHeight", valueOf);
        ydyVar12.i("percentY", valueOf);
        k8.b(ydyVar12);
        bVar9.a(k8);
        linkedHashMap.put(Integer.valueOf(R.id.from_dialog_under_video_to_hidden), bVar9);
        a.b bVar10 = new a.b(R.id.from_fullscreen_vertical_to_dialog_under_video, aVar, R.id.fullscreen_vertical, R.id.dialog_under_video);
        bVar10.c(3, 0, null);
        bVar10.b(300);
        kdy k9 = sa30.k();
        ddy ddyVar23 = new ddy();
        ddyVar23.b = R.id.relatedVideoItemsBackground;
        ddyVar23.i("alpha", valueOf);
        ddyVar23.a = 0;
        linkedHashMap.put(dt.a(k9, ddyVar23, bVar10, k9, R.id.from_fullscreen_vertical_to_dialog_under_video), bVar10);
        a.b bVar11 = new a.b(R.id.from_fullscreen_vertical_to_hidden, aVar, R.id.fullscreen_vertical, R.id.hidden);
        bVar11.c(3, 0, null);
        bVar11.b(300);
        kdy k10 = sa30.k();
        ddy ddyVar24 = new ddy();
        ddyVar24.b = R.id.playerContainer;
        ddyVar24.a = 80;
        ddyVar24.i("alpha", valueOf);
        k10.b(ddyVar24);
        ydy ydyVar13 = new ydy();
        ydyVar13.b = R.id.playerContainer;
        ydyVar13.a = 80;
        ydyVar13.i("percentX", valueOf2);
        ydyVar13.i("percentWidth", valueOf2);
        k10.b(ydyVar13);
        bVar11.a(k10);
        linkedHashMap.put(Integer.valueOf(R.id.from_fullscreen_vertical_to_hidden), bVar11);
        if (z2) {
            zlp0 zlp0Var6 = new zlp0(R.id.from_expanded_to_collapsed, R.id.expanded, R.id.collapsed);
            int i8 = R.id.from_expanded_match_ratio_to_collapsed;
            Iterator it6 = e43.l(zlp0Var6, new zlp0(R.id.from_expanded_match_ratio_to_collapsed, R.id.expanded_match_ratio, R.id.collapsed)).iterator();
            while (it6.hasNext()) {
                zlp0 zlp0Var7 = (zlp0) it6.next();
                int i9 = zlp0Var7.a;
                a.b bVar12 = new a.b(i9, aVar, zlp0Var7.b, zlp0Var7.c);
                boolean z3 = bVar12.a == i8;
                bVar12.b(300);
                kdy k11 = sa30.k();
                ydy ydyVar14 = new ydy();
                boolean z4 = z3;
                ydyVar14.b = R.id.playerContainer;
                MotionLayoutCurveFit motionLayoutCurveFit4 = MotionLayoutCurveFit.LINEAR;
                Iterator it7 = it6;
                ydyVar14.e = motionLayoutCurveFit4.ordinal();
                ydyVar14.a = 80;
                ydyVar14.i("percentHeight", Float.valueOf(z4 ? 0.8f : 0.0f));
                ydyVar14.i("percentWidth", valueOf);
                ydyVar14.i("percentX", valueOf);
                k11.b(ydyVar14);
                ddy ddyVar25 = new ddy();
                ddyVar25.b = R.id.relatedVideoItemsBackground;
                s3j0.d(ddyVar25, "alpha", valueOf, motionLayoutCurveFit4, "curveFit");
                ddyVar25.a = 80;
                k11.b(ddyVar25);
                ydy ydyVar15 = new ydy();
                ydyVar15.b = R.id.relatedVideoItemsBackground;
                ydyVar15.e = motionLayoutCurveFit4.ordinal();
                ydyVar15.a = 80;
                ydyVar15.i("percentHeight", Float.valueOf(z4 ? 0.8f : 1.0f));
                ydyVar15.i("percentY", Float.valueOf(z4 ? 0.8f : 1.0f));
                k11.b(ydyVar15);
                if (!booleanValue2) {
                    ddy ddyVar26 = new ddy();
                    ddyVar26.b = R.id.mainFragmentContainerShadow;
                    s3j0.d(ddyVar26, "alpha", valueOf2, motionLayoutCurveFit4, "curveFit");
                    ddyVar26.a = 80;
                    k11.b(ddyVar26);
                }
                ddy ddyVar27 = new ddy();
                ddyVar27.b = R.id.contentContainer;
                s3j0.d(ddyVar27, "alpha", valueOf2, motionLayoutCurveFit4, "curveFit");
                ddyVar27.a = 80;
                k11.b(ddyVar27);
                ydy ydyVar16 = new ydy();
                ydyVar16.b = R.id.contentContainer;
                ydyVar16.e = motionLayoutCurveFit4.ordinal();
                ydyVar16.a = 80;
                ydyVar16.i("percentHeight", valueOf);
                ydyVar16.i("percentY", valueOf);
                k11.b(ydyVar16);
                bVar12.a(k11);
                linkedHashMap.put(Integer.valueOf(i9), bVar12);
                it6 = it7;
                i8 = R.id.from_expanded_match_ratio_to_collapsed;
            }
            a.b bVar13 = new a.b(R.id.from_dialog_expanded_to_collapsed, aVar, R.id.dialog_expanded, R.id.collapsed);
            bVar13.b(300);
            kdy k12 = sa30.k();
            ydy ydyVar17 = new ydy();
            ydyVar17.b = R.id.playerContainer;
            MotionLayoutCurveFit motionLayoutCurveFit5 = MotionLayoutCurveFit.LINEAR;
            ydyVar17.e = motionLayoutCurveFit5.ordinal();
            ydyVar17.a = 80;
            ydyVar17.i("percentHeight", valueOf2);
            ydyVar17.i("percentWidth", valueOf);
            ydyVar17.i("percentX", valueOf);
            k12.b(ydyVar17);
            ydy ydyVar18 = new ydy();
            ydyVar18.b = R.id.playerShadow;
            ydyVar18.e = motionLayoutCurveFit5.ordinal();
            ydyVar18.a = 80;
            ydyVar18.i("percentHeight", valueOf2);
            ydyVar18.i("percentWidth", valueOf);
            ydyVar18.i("percentX", valueOf);
            k12.b(ydyVar18);
            ddy ddyVar28 = new ddy();
            ddyVar28.b = R.id.playerShadow;
            s3j0.d(ddyVar28, "alpha", valueOf2, motionLayoutCurveFit5, "curveFit");
            ddyVar28.a = 80;
            k12.b(ddyVar28);
            if (!booleanValue2) {
                ddy ddyVar29 = new ddy();
                ddyVar29.b = R.id.mainFragmentContainerShadow;
                s3j0.d(ddyVar29, "alpha", valueOf2, motionLayoutCurveFit5, "curveFit");
                ddyVar29.a = 80;
                k12.b(ddyVar29);
            }
            ddy ddyVar30 = new ddy();
            ddyVar30.b = R.id.relatedVideoItemsBackground;
            s3j0.d(ddyVar30, "alpha", valueOf2, motionLayoutCurveFit5, "curveFit");
            ddyVar30.a = 80;
            ddy a5 = ct.a(k12, ddyVar30);
            a5.b = R.id.contentContainer;
            s3j0.d(a5, "alpha", valueOf2, motionLayoutCurveFit5, "curveFit");
            a5.a = 80;
            k12.b(a5);
            ydy ydyVar19 = new ydy();
            ydyVar19.b = R.id.contentContainer;
            ydyVar19.e = motionLayoutCurveFit5.ordinal();
            ydyVar19.a = 80;
            ydyVar19.i("percentHeight", valueOf);
            ydyVar19.i("percentX", valueOf);
            k12.b(ydyVar19);
            ydy ydyVar20 = new ydy();
            ydyVar20.b = R.id.dialogContainer;
            ydyVar20.e = motionLayoutCurveFit5.ordinal();
            ydyVar20.a = 80;
            ydyVar20.i("percentHeight", valueOf2);
            k12.b(ydyVar20);
            ddy ddyVar31 = new ddy();
            ddyVar31.b = R.id.dialogContainer;
            s3j0.d(ddyVar31, "alpha", valueOf, motionLayoutCurveFit5, "curveFit");
            ddyVar31.a = 60;
            ddy a6 = ct.a(k12, ddyVar31);
            a6.b = R.id.dialogContainer;
            s3j0.d(a6, "alpha", valueOf2, motionLayoutCurveFit5, "curveFit");
            a6.a = 80;
            linkedHashMap.put(dt.a(k12, a6, bVar13, k12, R.id.from_dialog_expanded_to_collapsed), bVar13);
            a.b bVar14 = new a.b(R.id.from_dialog_under_video_to_collapsed, aVar, R.id.dialog_under_video, R.id.collapsed);
            bVar14.b(300);
            bVar14.q = 2;
            kdy k13 = sa30.k();
            ydy ydyVar21 = new ydy();
            ydyVar21.b = R.id.playerContainer;
            ydyVar21.e = motionLayoutCurveFit5.ordinal();
            ydyVar21.a = 80;
            ydyVar21.i("percentHeight", valueOf2);
            ydyVar21.i("percentWidth", valueOf);
            ydyVar21.i("percentX", valueOf);
            k13.b(ydyVar21);
            if (booleanValue2) {
                i = R.id.from_dialog_under_video_to_collapsed;
            } else {
                ddy ddyVar32 = new ddy();
                i = R.id.from_dialog_under_video_to_collapsed;
                ddyVar32.b = R.id.mainFragmentContainerShadow;
                s3j0.d(ddyVar32, "alpha", valueOf2, motionLayoutCurveFit5, "curveFit");
                ddyVar32.a = 80;
                k13.b(ddyVar32);
            }
            ddy ddyVar33 = new ddy();
            ddyVar33.b = R.id.relatedVideoItemsBackground;
            s3j0.d(ddyVar33, "alpha", valueOf, motionLayoutCurveFit5, "curveFit");
            ddyVar33.a = 80;
            k13.b(ddyVar33);
            ydy ydyVar22 = new ydy();
            ydyVar22.b = R.id.relatedVideoItemsBackground;
            ydyVar22.e = motionLayoutCurveFit5.ordinal();
            ydyVar22.a = 80;
            ydyVar22.i("percentHeight", valueOf);
            ydyVar22.i("percentY", valueOf);
            k13.b(ydyVar22);
            ddy ddyVar34 = new ddy();
            ddyVar34.b = R.id.contentContainer;
            s3j0.d(ddyVar34, "alpha", valueOf2, motionLayoutCurveFit5, "curveFit");
            ddyVar34.a = 80;
            ddy a7 = ct.a(k13, ddyVar34);
            a7.b = R.id.dialogContainer;
            s3j0.d(a7, "alpha", valueOf2, motionLayoutCurveFit5, "curveFit");
            a7.a = 80;
            k13.b(a7);
            ydy ydyVar23 = new ydy();
            ydyVar23.b = R.id.contentContainer;
            ydyVar23.e = motionLayoutCurveFit5.ordinal();
            ydyVar23.a = 80;
            ydyVar23.i("percentHeight", valueOf);
            ydyVar23.i("percentY", valueOf);
            k13.b(ydyVar23);
            ydy ydyVar24 = new ydy();
            ydyVar24.b = R.id.dialogContainer;
            ydyVar24.e = motionLayoutCurveFit5.ordinal();
            ydyVar24.a = 80;
            ydyVar24.i("percentHeight", valueOf);
            ydyVar24.i("percentY", valueOf);
            k13.b(ydyVar24);
            bVar14.a(k13);
            linkedHashMap.put(Integer.valueOf(i), bVar14);
            a.b bVar15 = new a.b(R.id.from_collapsed_to_hidden, aVar, R.id.collapsed, R.id.hidden);
            bVar15.c(3, 0, null);
            bVar15.b(200);
            linkedHashMap.put(Integer.valueOf(R.id.from_collapsed_to_hidden), bVar15);
            a.b bVar16 = new a.b(R.id.from_fullscreen_vertical_to_collapsed, aVar, R.id.fullscreen_vertical, R.id.collapsed);
            bVar16.c(3, 0, null);
            bVar16.b(300);
            kdy k14 = sa30.k();
            ydy ydyVar25 = new ydy();
            ydyVar25.b = R.id.playerContainer;
            ydyVar25.a = 80;
            ydyVar25.i("percentX", valueOf2);
            ydyVar25.i("percentWidth", valueOf2);
            k14.b(ydyVar25);
            bVar16.a(k14);
            linkedHashMap.put(Integer.valueOf(R.id.from_fullscreen_vertical_to_collapsed), bVar16);
        } else {
            for (zlp0 zlp0Var8 : e43.l(new zlp0(R.id.from_expanded_to_prepared_to_pip, R.id.expanded, R.id.prepared_to_pip), new zlp0(R.id.from_expanded_match_ratio_to_prepared_to_pip, R.id.expanded_match_ratio, R.id.prepared_to_pip_match_ratio))) {
                int i10 = zlp0Var8.a;
                a.b bVar17 = new a.b(i10, aVar, zlp0Var8.b, zlp0Var8.c);
                bVar17.b(300);
                kdy k15 = sa30.k();
                zvs0.a(k15);
                bVar17.a(k15);
                linkedHashMap.put(Integer.valueOf(i10), bVar17);
            }
            a.b bVar18 = new a.b(R.id.from_dialog_under_video_to_prepared_to_pip, aVar, R.id.dialog_under_video, R.id.prepared_to_pip);
            bVar18.b(300);
            kdy k16 = sa30.k();
            zvs0.a(k16);
            bVar18.a(k16);
            linkedHashMap.put(Integer.valueOf(R.id.from_dialog_under_video_to_prepared_to_pip), bVar18);
        }
        a.b bVar19 = new a.b(R.id.from_fullscreen_to_hidden_landscape, aVar, R.id.fullscreen, R.id.hidden_landscape);
        bVar19.c(3, 0, null);
        bVar19.b(300);
        linkedHashMap.put(Integer.valueOf(R.id.from_fullscreen_to_hidden_landscape), bVar19);
        a.b bVar20 = new a.b(R.id.from_fullscreen_with_dialog_to_hidden_landscape, aVar, R.id.fullscreen_with_dialog, R.id.hidden_landscape);
        bVar20.c(3, 0, null);
        bVar20.b(300);
        linkedHashMap.put(Integer.valueOf(R.id.from_fullscreen_with_dialog_to_hidden_landscape), bVar20);
        a.b bVar21 = new a.b(R.id.from_fullscreen_to_fullscreen_with_dialog, aVar, R.id.fullscreen, R.id.fullscreen_with_dialog);
        bVar21.c(3, 0, null);
        bVar21.b(300);
        bVar21.q = 2;
        kdy k17 = sa30.k();
        ddy ddyVar35 = new ddy();
        ddyVar35.b = R.id.dialogContainer;
        ddyVar35.i("alpha", valueOf);
        MotionLayoutCurveFit motionLayoutCurveFit6 = MotionLayoutCurveFit.LINEAR;
        ddyVar35.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
        ddyVar35.a = 0;
        linkedHashMap.put(dt.a(k17, ddyVar35, bVar21, k17, R.id.from_fullscreen_to_fullscreen_with_dialog), bVar21);
        a.b bVar22 = new a.b(R.id.from_fullscreen_to_fullscreen_with_right_promo, aVar, R.id.fullscreen, R.id.fullscreen_with_right_promo);
        bVar22.c(3, 0, null);
        bVar22.b(300);
        bVar22.q = 2;
        kdy k18 = sa30.k();
        ddy ddyVar36 = new ddy();
        ddyVar36.b = R.id.rightPromoContainer;
        s3j0.d(ddyVar36, "alpha", valueOf, motionLayoutCurveFit6, "curveFit");
        ddyVar36.a = 0;
        linkedHashMap.put(dt.a(k18, ddyVar36, bVar22, k18, R.id.from_fullscreen_to_fullscreen_with_right_promo), bVar22);
        a.b bVar23 = new a.b(R.id.from_fullscreen_to_fullscreen_with_bottom_promo, aVar, R.id.fullscreen, R.id.fullscreen_with_bottom_promo);
        bVar23.c(3, 0, null);
        bVar23.b(300);
        bVar23.q = 2;
        kdy k19 = sa30.k();
        ddy ddyVar37 = new ddy();
        ddyVar37.b = R.id.bottomPromoContainer;
        s3j0.d(ddyVar37, "alpha", valueOf, motionLayoutCurveFit6, "curveFit");
        ddyVar37.a = 0;
        linkedHashMap.put(dt.a(k19, ddyVar37, bVar23, k19, R.id.from_fullscreen_to_fullscreen_with_bottom_promo), bVar23);
        a.b bVar24 = new a.b(R.id.from_fullscreen_with_right_promo_to_fullscreen_with_dialog, aVar, R.id.fullscreen_with_right_promo, R.id.fullscreen_with_dialog);
        bVar24.c(3, 0, null);
        bVar24.b(300);
        bVar24.q = 2;
        kdy k20 = sa30.k();
        ddy ddyVar38 = new ddy();
        ddyVar38.b = R.id.dialogContainer;
        s3j0.d(ddyVar38, "alpha", valueOf, motionLayoutCurveFit6, "curveFit");
        ddyVar38.a = 0;
        ddy a8 = ct.a(k20, ddyVar38);
        a8.b = R.id.rightPromoContainer;
        s3j0.d(a8, "alpha", valueOf, motionLayoutCurveFit6, "curveFit");
        a8.a = 75;
        k20.b(a8);
        ydy ydyVar26 = new ydy();
        ydyVar26.b = R.id.rightPromoContainer;
        ydyVar26.i("percentX", valueOf2);
        ydyVar26.e = motionLayoutCurveFit6.ordinal();
        ydyVar26.a = 75;
        k20.b(ydyVar26);
        ydy ydyVar27 = new ydy();
        ydyVar27.b = R.id.playerContainer;
        ydyVar27.i("percentWidth", valueOf2);
        ydyVar27.i("percentX", valueOf2);
        ydyVar27.e = motionLayoutCurveFit6.ordinal();
        ydyVar27.a = 75;
        k20.b(ydyVar27);
        bVar24.a(k20);
        linkedHashMap.put(Integer.valueOf(R.id.from_fullscreen_with_right_promo_to_fullscreen_with_dialog), bVar24);
        a.b bVar25 = new a.b(R.id.from_fullscreen_with_right_promo_to_hidden_landscape, aVar, R.id.fullscreen_with_right_promo, R.id.hidden_landscape);
        int i11 = 0;
        bVar25.c(3, 0, null);
        bVar25.b(300);
        linkedHashMap.put(Integer.valueOf(R.id.from_fullscreen_with_right_promo_to_hidden_landscape), bVar25);
        a.b bVar26 = new a.b(R.id.from_fullscreen_with_bottom_promo_to_hidden_landscape, aVar, R.id.fullscreen_with_bottom_promo, R.id.hidden_landscape);
        bVar26.c(3, 0, null);
        bVar26.b(300);
        linkedHashMap.put(Integer.valueOf(R.id.from_fullscreen_with_bottom_promo_to_hidden_landscape), bVar26);
        a.b bVar27 = new a.b(R.id.from_fullscreen_with_bottom_promo_to_fullscreen_with_dialog, aVar, R.id.fullscreen_with_bottom_promo, R.id.fullscreen_with_dialog);
        bVar27.c(3, 0, null);
        bVar27.b(300);
        bVar27.q = 2;
        kdy k21 = sa30.k();
        ddy ddyVar39 = new ddy();
        ddyVar39.b = R.id.dialogContainer;
        s3j0.d(ddyVar39, "alpha", valueOf, motionLayoutCurveFit6, "curveFit");
        ddyVar39.a = 0;
        linkedHashMap.put(dt.a(k21, ddyVar39, bVar27, k21, R.id.from_fullscreen_with_bottom_promo_to_fullscreen_with_dialog), bVar27);
        if (xvs0Var2.b) {
            a.b bVar28 = new a.b(R.id.from_fullscreen_to_fullscreen_with_similar_slider, aVar, R.id.fullscreen, R.id.fullscreen_with_similar_slider);
            bVar28.c(3, 0, null);
            bVar28.b(300);
            bVar28.q = 0;
            kdy k22 = sa30.k();
            ddy ddyVar40 = new ddy();
            ddyVar40.b = R.id.cover_overlay_view;
            ddyVar40.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar40.a = 0;
            ddyVar40.i("alpha", valueOf2);
            k22.b(ddyVar40);
            ddy ddyVar41 = new ddy();
            ddyVar41.b = R.id.cover_overlay_view;
            ddyVar41.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar41.a = 30;
            Float valueOf3 = Float.valueOf(0.1f);
            ddyVar41.i("alpha", valueOf3);
            k22.b(ddyVar41);
            ddy ddyVar42 = new ddy();
            ddyVar42.b = R.id.cover_overlay_view;
            ddyVar42.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar42.a = 50;
            ddyVar42.i("alpha", Float.valueOf(0.2f));
            k22.b(ddyVar42);
            ddy ddyVar43 = new ddy();
            ddyVar43.b = R.id.cover_overlay_view;
            ddyVar43.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar43.a = 60;
            ddyVar43.i("alpha", Float.valueOf(0.5f));
            k22.b(ddyVar43);
            ddy ddyVar44 = new ddy();
            ddyVar44.b = R.id.cover_overlay_view;
            ddyVar44.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar44.a = 70;
            ddyVar44.i("alpha", Float.valueOf(0.85f));
            k22.b(ddyVar44);
            ddy ddyVar45 = new ddy();
            ddyVar45.b = R.id.cover_overlay_view;
            ddyVar45.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar45.a = 100;
            ddyVar45.i("alpha", valueOf);
            k22.b(ddyVar45);
            ddy ddyVar46 = new ddy();
            ddyVar46.b = R.id.similar_slider_header;
            ddyVar46.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar46.a = 0;
            ddyVar46.i("alpha", valueOf2);
            k22.b(ddyVar46);
            ddy ddyVar47 = new ddy();
            ddyVar47.b = R.id.similar_slider_header;
            ddyVar47.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar47.a = 95;
            ddyVar47.i("alpha", valueOf3);
            k22.b(ddyVar47);
            ddy ddyVar48 = new ddy();
            ddyVar48.b = R.id.similar_slider_header;
            ddyVar48.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar48.a = 100;
            ddyVar48.i("alpha", valueOf);
            k22.b(ddyVar48);
            ddy ddyVar49 = new ddy();
            ddyVar49.b = R.id.about_video_fullscreen_recycler;
            ddyVar49.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar49.a = 100;
            ddyVar49.i("alpha", valueOf);
            k22.b(ddyVar49);
            ddy ddyVar50 = new ddy();
            ddyVar50.b = R.id.about_video_fullscreen_recycler;
            ddyVar50.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            ddyVar50.a = 95;
            ddyVar50.i("alpha", valueOf3);
            k22.b(ddyVar50);
            ddy ddyVar51 = new ddy();
            ddyVar51.b = R.id.about_video_fullscreen_recycler;
            ddyVar51.i("curveFit", Integer.valueOf(motionLayoutCurveFit6.ordinal()));
            i11 = 0;
            ddyVar51.a = 0;
            ddyVar51.i("alpha", valueOf2);
            linkedHashMap.put(dt.a(k22, ddyVar51, bVar28, k22, R.id.from_fullscreen_to_fullscreen_with_similar_slider), bVar28);
        }
        if (z2) {
            a.b bVar29 = new a.b(R.id.from_collapsed_landscape_to_hidden_landscape, aVar, R.id.collapsed_landscape, R.id.hidden_landscape);
            bVar29.c(3, i11, null);
            bVar29.b(200);
            linkedHashMap.put(Integer.valueOf(R.id.from_collapsed_landscape_to_hidden_landscape), bVar29);
            a.b bVar30 = new a.b(R.id.from_collapsed_landscape_to_fullscreen, aVar, R.id.collapsed_landscape, R.id.fullscreen);
            bVar30.c(3, i11, null);
            bVar30.b(300);
            if (!booleanValue2) {
                kdy k23 = sa30.k();
                ddy ddyVar52 = new ddy();
                ddyVar52.b = R.id.mainFragmentContainerShadow;
                s3j0.d(ddyVar52, "alpha", valueOf, motionLayoutCurveFit6, "curveFit");
                ddyVar52.a = 20;
                k23.b(ddyVar52);
                bVar30.a(k23);
            }
            linkedHashMap.put(Integer.valueOf(R.id.from_collapsed_landscape_to_fullscreen), bVar30);
            a.b bVar31 = new a.b(R.id.from_collapsed_landscape_to_fullscreen_with_dialog, aVar, R.id.collapsed_landscape, R.id.fullscreen_with_dialog);
            bVar31.c(3, 0, null);
            bVar31.b(300);
            linkedHashMap.put(Integer.valueOf(R.id.from_collapsed_landscape_to_fullscreen_with_dialog), bVar31);
            a.b bVar32 = new a.b(R.id.from_collapsed_landscape_to_fullscreen_with_right_promo, aVar, R.id.collapsed_landscape, R.id.fullscreen_with_right_promo);
            bVar32.c(3, 0, null);
            bVar32.b(300);
            linkedHashMap.put(Integer.valueOf(R.id.from_collapsed_landscape_to_fullscreen_with_right_promo), bVar32);
            a.b bVar33 = new a.b(R.id.from_collapsed_landscape_to_fullscreen_with_bottom_promo, aVar, R.id.collapsed_landscape, R.id.fullscreen_with_bottom_promo);
            bVar33.c(3, 0, null);
            bVar33.b(300);
            linkedHashMap.put(Integer.valueOf(R.id.from_collapsed_landscape_to_fullscreen_with_bottom_promo), bVar33);
        }
        p490.j(ab30Var);
        ufc ufcVar = new ufc(xvs0Var2);
        yvs0Var3.h(ufcVar);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) ufcVar.c;
        a.b bVar34 = (a.b) linkedHashMap.get(Integer.valueOf(R.id.from_hidden_to_expanded));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            aVar.g.put(((Number) entry.getKey()).intValue(), (androidx.constraintlayout.widget.b) entry.getValue());
        }
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            a.b bVar35 = (a.b) ((Map.Entry) it8.next()).getValue();
            int i12 = bVar35.a;
            if (i12 == -1) {
                throw new IllegalArgumentException("The transition must have an id");
            }
            int i13 = 0;
            while (true) {
                arrayList = aVar.d;
                if (i13 >= arrayList.size()) {
                    i13 = -1;
                    break;
                } else if (arrayList.get(i13).a == i12) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 == -1) {
                arrayList.add(bVar35);
            } else {
                arrayList.set(i13, bVar35);
            }
        }
        aVar.c = bVar34;
        if (bVar34 != null && (bVar = bVar34.l) != null) {
            bVar.c(aVar.p);
        }
        motionLayout3.setScene(aVar);
        motionLayout3.setTransition(R.id.from_hidden_to_expanded);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean no() {
        return ((Boolean) this.R.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        nb30 nb30Var;
        super.onConfigurationChanged(configuration);
        boolean z = configuration.orientation == 2;
        m mVar = this.J0;
        if (mVar != null) {
            of ofVar = mVar.c;
            if (mVar.r != z) {
                mVar.r = z;
                if (ofVar instanceof MotionLayoutWithFixedTouches) {
                    MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = (MotionLayoutWithFixedTouches) ofVar;
                    if (motionLayoutWithFixedTouches.q5()) {
                        int startState = motionLayoutWithFixedTouches.getStartState();
                        int endState = motionLayoutWithFixedTouches.getEndState();
                        if (startState == R.id.view_transition || endState == R.id.view_transition) {
                            nb30Var = m.q(motionLayoutWithFixedTouches.getEndState());
                        }
                    }
                    nb30Var = m.q(motionLayoutWithFixedTouches.getCurrentState());
                } else {
                    aa30 state = ofVar.getState();
                    if (state instanceof aa30.a) {
                        nb30Var = ((aa30.a) state).a;
                    } else {
                        if (!(state instanceof aa30.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nb30Var = ((aa30.b) state).d;
                        if (nb30Var == null) {
                            nb30Var = nb30.a.b;
                        }
                    }
                }
                mVar.p();
                mVar.o(nb30Var);
                if (m.h(nb30Var)) {
                    mVar.k(mVar.e());
                } else {
                    nb30 nb30Var2 = DiscoveryScreenMotionStates$Portrait.Miniplayer;
                    if (nb30Var == nb30Var2 || nb30Var == DiscoveryScreenMotionStates$Landscape.Miniplayer) {
                        if (mVar.r) {
                            nb30Var2 = DiscoveryScreenMotionStates$Landscape.Miniplayer;
                        }
                        mVar.k(nb30Var2);
                    }
                }
            }
        }
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.X;
        if (miniPlayerControllersWrapper != null) {
            miniPlayerControllersWrapper.onConfigurationChanged(configuration);
        }
        r rVar = (r) this.p0.getValue();
        if (rVar != null) {
            boolean z2 = rVar.n;
            rVar.n = z;
            if (z != z2) {
                RecyclerPaginatedView e2 = rVar.e();
                if (e2 != null) {
                    e2.setOnReloadRetryClickListener(null);
                }
                rVar.setOnReloadRetryClickListener(rVar.h);
                RecyclerPaginatedView e3 = rVar.e();
                if (e3 != null) {
                    e3.setOnLoadNextRetryClickListener(null);
                }
                rVar.setOnLoadNextRetryClickListener(rVar.i);
                for (df90 df90Var : (Iterable) rVar.j) {
                    RecyclerPaginatedView e4 = rVar.e();
                    if (e4 != null) {
                        e4.w(df90Var);
                    }
                    RecyclerPaginatedView b2 = rVar.b();
                    if (b2 != null) {
                        b2.w(df90Var);
                    }
                    znj0 d2 = rVar.d();
                    if (d2 != null) {
                        d2.f(new ss3(21, d2, df90Var));
                    }
                    RecyclerPaginatedView b3 = rVar.b();
                    if (b3 != null) {
                        b3.u(df90Var);
                    }
                    znj0 d3 = rVar.d();
                    if (d3 != null) {
                        d3.getClass();
                        d3.f(new xy0(21, d3, df90Var));
                    }
                }
                for (df90 df90Var2 : (Iterable) rVar.k) {
                    RecyclerPaginatedView e5 = rVar.e();
                    if (e5 != null) {
                        e5.M9(df90Var2);
                    }
                    RecyclerPaginatedView b4 = rVar.b();
                    if (b4 != null) {
                        b4.M9(df90Var2);
                    }
                    znj0 d4 = rVar.d();
                    if (d4 != null) {
                        d4.M9(df90Var2);
                    }
                    RecyclerPaginatedView b5 = rVar.b();
                    if (b5 != null) {
                        b5.Om(df90Var2);
                    }
                    znj0 d5 = rVar.d();
                    if (d5 != null) {
                        d5.Om(df90Var2);
                    }
                }
                RecyclerPaginatedView e6 = rVar.e();
                if (e6 != null) {
                    e6.setOnRefreshListener(null);
                }
                rVar.setOnRefreshListener(rVar.l);
                RecyclerPaginatedView e7 = rVar.e();
                if (e7 != null) {
                    e7.setDataObserver(null);
                }
                rVar.setDataObserver(rVar.m);
                rVar.a();
            }
        }
        t tVar = (t) this.q0.getValue();
        if (tVar != null) {
            boolean z3 = tVar.m;
            tVar.m = z;
            if (z != z3) {
                RecyclerPaginatedView d6 = tVar.d();
                if (d6 != null) {
                    d6.setOnReloadRetryClickListener(null);
                }
                RecyclerPaginatedView b6 = tVar.b();
                if (b6 != null) {
                    b6.setOnReloadRetryClickListener(tVar.g);
                }
                RecyclerPaginatedView d7 = tVar.d();
                if (d7 != null) {
                    d7.setOnLoadNextRetryClickListener(null);
                }
                RecyclerPaginatedView b7 = tVar.b();
                if (b7 != null) {
                    b7.setOnLoadNextRetryClickListener(tVar.g);
                }
                for (df90 df90Var3 : (Iterable) tVar.i) {
                    RecyclerPaginatedView d8 = tVar.d();
                    if (d8 != null) {
                        d8.w(df90Var3);
                    }
                    RecyclerPaginatedView b8 = tVar.b();
                    if (b8 != null) {
                        b8.w(df90Var3);
                    }
                    RecyclerPaginatedView b9 = tVar.b();
                    if (b9 != null) {
                        b9.u(df90Var3);
                    }
                }
                for (df90 df90Var4 : (Iterable) tVar.j) {
                    RecyclerPaginatedView d9 = tVar.d();
                    if (d9 != null) {
                        d9.M9(df90Var4);
                    }
                    RecyclerPaginatedView b10 = tVar.b();
                    if (b10 != null) {
                        b10.M9(df90Var4);
                    }
                    RecyclerPaginatedView b11 = tVar.b();
                    if (b11 != null) {
                        b11.Om(df90Var4);
                    }
                }
                RecyclerPaginatedView d10 = tVar.d();
                if (d10 != null) {
                    d10.setOnRefreshListener(null);
                }
                RecyclerPaginatedView b12 = tVar.b();
                if (b12 != null) {
                    b12.setOnRefreshListener(tVar.k);
                }
                RecyclerPaginatedView d11 = tVar.d();
                if (d11 != null) {
                    d11.setDataObserver(null);
                }
                RecyclerPaginatedView b13 = tVar.b();
                if (b13 != null) {
                    b13.setDataObserver(tVar.l);
                }
                tVar.a();
            }
        }
        b bVar = this.U;
        if (bVar != null) {
            cb30 cb30Var = bVar.b;
            cb30Var.g.b.setLandscape(z);
            cb30Var.h.d.setLandscape(z);
            if (this.s0.f) {
                tts0 tts0Var = this.V;
                g5b0 g5b0Var = (tts0Var != null ? tts0Var : null).k;
                if (g5b0Var != null) {
                    g5b0Var.a(this.N0);
                }
            }
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cws0 cws0Var = this.W0;
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            mo2getContext.registerReceiver(cws0Var.c, cws0Var.b, hf8.a, null, 4);
        } else {
            cws0Var.getClass();
        }
        if (bundle != null) {
            q qVar = (q) getFeature().i.c;
            MiniPlayerControllersWrapper.VideoInfo videoInfo = new VideoMinimizableDiscoverySavedState(qVar.b, qVar.l, qVar.n, qVar.d, qVar.e, qVar.c, qVar.t).b;
            if (videoInfo == null || videoInfo.b == null) {
                return;
            }
            ko().Hf().getClass();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Context mo2getContext = mo2getContext();
        cws0 cws0Var = this.W0;
        if (mo2getContext != null) {
            enj.s(mo2getContext, cws0Var.c);
        } else {
            cws0Var.getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.J0 = null;
        this.R0.getClass();
        com.vk.lists.c cVar = this.y0;
        if (cVar != null) {
            cVar.v();
        }
        this.y0 = null;
        com.vk.lists.c cVar2 = this.z0;
        if (cVar2 != null) {
            cVar2.v();
        }
        this.z0 = null;
        com.vk.lists.c cVar3 = this.A0;
        if (cVar3 != null) {
            cVar3.v();
        }
        this.A0 = null;
        this.G0 = null;
        this.K0 = null;
        znj0 znj0Var = this.B0;
        if (znj0Var != null) {
            znj0Var.c.a.M3(znj0Var);
            znj0Var.o.clear();
            znj0Var.h.onComplete();
            znj0Var.g().getClass();
            ((qoj0) znj0Var.l.getValue()).getClass();
            znj0Var.n = null;
            if (gsi0.b().e) {
                mha mhaVar = znj0Var.i;
                if (mhaVar == null) {
                    mhaVar = null;
                }
                b0o0 b0o0Var = mhaVar.f;
                b0o0Var.c.clear();
                b0o0Var.d = EmptyList.b;
            }
        }
        this.B0 = null;
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.X;
        if (miniPlayerControllersWrapper != null) {
            miniPlayerControllersWrapper.t();
        }
        ian ianVar = this.Z0;
        yg5 yg5Var = ianVar.d;
        if (yg5Var != null) {
            yg5Var.T(ianVar.g);
        }
        ianVar.d = null;
        VideoDiscoveryRelatedVideosSnackBarManager videoDiscoveryRelatedVideosSnackBarManager = this.g0;
        if (videoDiscoveryRelatedVideosSnackBarManager != null) {
            ikv0 ikv0Var = videoDiscoveryRelatedVideosSnackBarManager.b;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            io.reactivex.rxjava3.disposables.c cVar4 = videoDiscoveryRelatedVideosSnackBarManager.d;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            videoDiscoveryRelatedVideosSnackBarManager.d = null;
        }
        VideoDiscoveryRelatedAudioSnackBarManager videoDiscoveryRelatedAudioSnackBarManager = this.h0;
        if (videoDiscoveryRelatedAudioSnackBarManager != null) {
            ikv0 ikv0Var2 = videoDiscoveryRelatedAudioSnackBarManager.b;
            if (ikv0Var2 != null) {
                ikv0Var2.a();
            }
            videoDiscoveryRelatedAudioSnackBarManager.b = null;
            videoDiscoveryRelatedAudioSnackBarManager.c = null;
            io.reactivex.rxjava3.disposables.c cVar5 = videoDiscoveryRelatedAudioSnackBarManager.d;
            if (cVar5 != null) {
                cVar5.dispose();
            }
            videoDiscoveryRelatedAudioSnackBarManager.d = null;
        }
        dgs0 dgs0Var = this.i0;
        if (dgs0Var != null) {
            ikv0 ikv0Var3 = dgs0Var.b;
            if (ikv0Var3 != null) {
                ikv0Var3.a();
            }
            io.reactivex.rxjava3.disposables.c cVar6 = dgs0Var.d;
            if (cVar6 != null) {
                cVar6.dispose();
            }
            dgs0Var.d = null;
        }
        ko().Df();
        ko().Ff().getClass();
        cys cysVar = this.Y;
        if (cysVar != null) {
            cysVar.f.a.setVisibility(8);
            cysVar.a = null;
        }
        this.Y = null;
        OrientationManagerImpl orientationManagerImpl = this.x0;
        if (orientationManagerImpl != null) {
            orientationManagerImpl.disable();
        }
        OrientationManagerImpl orientationManagerImpl2 = this.x0;
        if (orientationManagerImpl2 != null) {
            orientationManagerImpl2.b.clear();
            zvj.c(orientationManagerImpl2.c, null);
        }
        this.x0 = null;
        ((VideoAdFreeSubscriptionComponent) ko().h.getValue()).E2().release();
        h31 h31Var = (h31) this.d1.getValue();
        AdvertBannerView advertBannerView = h31Var.f;
        if (advertBannerView != null) {
            advertBannerView.b(false, new defpackage.e(h31Var, 2));
        }
        k31 k31Var = (k31) this.e1.getValue();
        mg0 mg0Var = k31Var.f;
        if (mg0Var != null) {
            dw20 dw20Var = mg0Var.e;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
            mg0Var.e = null;
        }
        k31Var.f = null;
        k31Var.e = null;
        szm0 szm0Var = this.l1;
        if (szm0Var != null) {
            szm0Var.f = null;
            zvj.c(szm0Var.i, null);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        pan panVar;
        super.onPause();
        ctp0 ctp0Var = this.g1;
        if (ctp0Var != null) {
            fwb0 fwb0Var = ctp0Var.f;
            if (fwb0Var == null) {
                fwb0Var = null;
            }
            fwb0Var.b();
        }
        this.g1 = null;
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.X;
        if (miniPlayerControllersWrapper != null) {
            miniPlayerControllersWrapper.onPause();
        }
        pan panVar2 = this.T;
        if (panVar2 != null) {
            panVar2.b();
        }
        pan panVar3 = this.S;
        if (panVar3 != null) {
            panVar3.b();
        }
        ian ianVar = this.Z0;
        yg5 yg5Var = ianVar.d;
        if (yg5Var != null) {
            yg5Var.T(ianVar.g);
        }
        ianVar.d = null;
        znj0 znj0Var = this.B0;
        if (znj0Var == null || (panVar = znj0Var.j) == null) {
            return;
        }
        panVar.b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        pan panVar;
        super.onResume();
        this.a1.a();
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.X;
        if (miniPlayerControllersWrapper != null) {
            miniPlayerControllersWrapper.onResume();
        }
        pan panVar2 = this.S;
        if (panVar2 != null) {
            panVar2.a();
        }
        pan panVar3 = this.T;
        if (panVar3 != null) {
            panVar3.a();
        }
        xn50.a.c(this, c.z0.a.b);
        so(this.L0, false);
        b bVar = this.U;
        if (bVar == null) {
            bVar = null;
        }
        int width = bVar.b.a.getWidth();
        b bVar2 = this.U;
        uo(width, (bVar2 != null ? bVar2 : null).b.a.getHeight(), this.L0);
        yg5 io2 = io();
        ian ianVar = this.Z0;
        ian.a aVar = ianVar.g;
        yg5 yg5Var = ianVar.d;
        if (yg5Var != io2) {
            if (yg5Var != null) {
                yg5Var.T(aVar);
            }
            ianVar.d = io2;
            if (io2 != null) {
                io2.f0(aVar);
            }
        }
        znj0 znj0Var = this.B0;
        if (znj0Var == null || (panVar = znj0Var.j) == null) {
            return;
        }
        panVar.a();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        xn50.a.c(this, c.z0.b.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        xn50.a.c(this, c.z0.C1982c.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean oo() {
        return ((Boolean) this.t0.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void po(VideoMinimizableDiscoverySideEffect.s sVar) {
        int i;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 1;
        if (!(sVar instanceof VideoMinimizableDiscoverySideEffect.s.d)) {
            if (sVar instanceof VideoMinimizableDiscoverySideEffect.s.b) {
                VideoMinimizableDiscoverySideEffect.s.b bVar = (VideoMinimizableDiscoverySideEffect.s.b) sVar;
                MusicInVideoDialogComponent musicInVideoDialogComponent = (MusicInVideoDialogComponent) ko().k.getValue();
                l7s u = bwt0.u(requireContext());
                asf0 asf0Var = new asf0(bVar.c, bVar.a, bVar.b, bVar.d, bVar.e);
                fyd0 fyd0Var = new fyd0(this, 20);
                yus0 yus0Var = new yus0(this, r4);
                MusicInVideoDialogComponent.Companion companion = MusicInVideoDialogComponent.Companion;
                this.j0 = musicInVideoDialogComponent.J1(u, asf0Var, fyd0Var, yus0Var, new a44(26));
                return;
            }
            if (sVar instanceof VideoMinimizableDiscoverySideEffect.s.a) {
                VideoMinimizableDiscoverySideEffect.s.a aVar = (VideoMinimizableDiscoverySideEffect.s.a) sVar;
                this.k0 = ((MusicInVideoDialogComponent) ko().k.getValue()).I7(bwt0.u(requireContext()), new wbb0(aVar.d, aVar.c), new v0s0(i4, this, aVar));
                return;
            }
            if (!(sVar instanceof VideoMinimizableDiscoverySideEffect.s.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((VideoMinimizablePlayerComponent) ko().a.getValue()).b3().P0() instanceof VideoMinimizableState.FullscreenHorizontal) {
                m mVar = this.J0;
                if (mVar != null) {
                    mVar.a(new dp0(mVar, new nih(0, (coj0) this.l0.getValue(), coj0.class, "skipNextOpenTracking", "skipNextOpenTracking()V", 0, 3)));
                    return;
                }
                return;
            }
            kfs0 kfs0Var = this.G0;
            if (kfs0Var != null) {
                Iterator<hfz> it = kfs0Var.h.f.iterator();
                int i6 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (it.next() instanceof AboutVideoItem.SimilarVideoRedesign) {
                        break;
                    } else {
                        i6++;
                    }
                }
                Integer valueOf = Integer.valueOf(i6);
                if (i6 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue() - 1;
                    r4 = intValue >= 0 ? intValue : 0;
                    b bVar2 = this.U;
                    if (bVar2 == null) {
                        bVar2 = null;
                    }
                    RecyclerView recyclerView = bVar2.b.g.f.getRecyclerView();
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null) {
                        return;
                    }
                    recyclerView.post(new hhz(this, r4, linearLayoutManager, i5));
                    return;
                }
                return;
            }
            return;
        }
        VideoMinimizableDiscoverySideEffect.s.d dVar = (VideoMinimizableDiscoverySideEffect.s.d) sVar;
        VideoDiscoveryRelatedAudioSnackBarManager videoDiscoveryRelatedAudioSnackBarManager = this.h0;
        if (videoDiscoveryRelatedAudioSnackBarManager != null) {
            VideoDiscoveryRelatedAudioSnackBarManager.Event event = dVar.a ? VideoDiscoveryRelatedAudioSnackBarManager.Event.Added : VideoDiscoveryRelatedAudioSnackBarManager.Event.Removed;
            Context context = videoDiscoveryRelatedAudioSnackBarManager.a;
            io.reactivex.rxjava3.disposables.c cVar = videoDiscoveryRelatedAudioSnackBarManager.d;
            if (cVar != null) {
                cVar.dispose();
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            asu0 asu0Var = asu0.a;
            asu0Var.getClass();
            videoDiscoveryRelatedAudioSnackBarManager.d = io.reactivex.rxjava3.core.a.s(5000L, timeUnit, asu0.i()).o(asu0Var.d()).subscribe(new axb(videoDiscoveryRelatedAudioSnackBarManager, 4));
            int[] iArr = VideoDiscoveryRelatedAudioSnackBarManager.a.$EnumSwitchMapping$0;
            int i7 = iArr[event.ordinal()];
            if (i7 == 1) {
                i = R.drawable.vk_icon_check_circle_outline_28;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.drawable.vk_icon_delete_outline_28;
            }
            int i8 = iArr[event.ordinal()];
            if (i8 == 1) {
                i2 = R.attr.vk_ui_icon_positive;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.attr.vk_ui_icon_accent;
            }
            ikv0.c.C3058c c3058c = new ikv0.c.C3058c(i, Integer.valueOf(i2), (Size) (null == true ? 1 : 0), 12);
            int i9 = iArr[event.ordinal()];
            if (i9 == 1) {
                i3 = R.string.video_related_music_added_snackbar_title;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string.video_related_music_removed_snackbar_title;
            }
            ikv0.d dVar2 = new ikv0.d(context.getString(i3), (String) (null == true ? 1 : 0), (ikv0.d.a) (null == true ? 1 : 0), 6);
            ikv0 ikv0Var = videoDiscoveryRelatedAudioSnackBarManager.b;
            if (ikv0Var != null) {
                ikv0Var.c.setLeft(c3058c);
                ikv0.d dVar3 = videoDiscoveryRelatedAudioSnackBarManager.c;
                if (dVar3 != null) {
                    dVar3.a.k(dVar2.a());
                    return;
                }
                return;
            }
            videoDiscoveryRelatedAudioSnackBarManager.c = dVar2;
            dhr0.a.getClass();
            ikv0.a aVar2 = new ikv0.a(dhr0.t(context));
            aVar2.e = -1L;
            aVar2.t = c3058c;
            aVar2.u = dVar2;
            aVar2.l = 80;
            aVar2.h = new r0r0(videoDiscoveryRelatedAudioSnackBarManager, 7);
            HashSet hashSet = iah0.a;
            if (fnj.b(context)) {
                aVar2.k = 1;
                aVar2.g(81);
            }
            videoDiscoveryRelatedAudioSnackBarManager.b = pkv0.f(aVar2);
        }
    }

    @Override // xsna.qtx0
    public final yg5 q5() {
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = this.X;
        if (miniPlayerControllersWrapper == null) {
            miniPlayerControllersWrapper = null;
        }
        if (miniPlayerControllersWrapper != null) {
            Object obj = miniPlayerControllersWrapper.r;
            owa0 owa0Var = obj instanceof owa0 ? (owa0) obj : null;
            if (owa0Var != null) {
                return owa0Var.j();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        if (r6 > 1) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qo(VideoMinimizableDiscoverySideEffect.w wVar) {
        boolean z;
        if (!(wVar instanceof VideoMinimizableDiscoverySideEffect.w.b)) {
            if (!(wVar instanceof VideoMinimizableDiscoverySideEffect.w.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ctp0 ctp0Var = this.g1;
            if (ctp0Var != null) {
                fwb0 fwb0Var = ctp0Var.f;
                if (fwb0Var == null) {
                    fwb0Var = null;
                }
                fwb0Var.b();
            }
            this.g1 = null;
            return;
        }
        VideoMinimizableDiscoverySideEffect.w.b bVar = (VideoMinimizableDiscoverySideEffect.w.b) wVar;
        FragmentActivity kn = kn();
        vz9 vz9Var = bVar.a;
        List<vz9> list = bVar.b;
        final ctp0 ctp0Var2 = new ctp0(kn, vz9Var, list, getFeature().z0(), ((CastComponent) ko().e.getValue()).L7(), ((NotificationsSettingsComponent) ko().o.getValue()).a());
        this.g1 = ctp0Var2;
        ctp0Var2.f = new fwb0(kn, new akd0(ctp0Var2, 14));
        View inflate = LayoutInflater.from(bwt0.u(kn)).inflate(R.layout.dialog_tv_retranslation_suggestion, (ViewGroup) null);
        VkText vkText = (VkText) inflate.findViewById(R.id.title);
        if (vkText != null) {
            vkText.setText(vz9Var != null ? inflate.getContext().getString(R.string.dialog_tv_retranslation_suggestion_title_with_device, "Xiaomi MI TV Stick") : inflate.getContext().getString(R.string.dialog_tv_retranslation_suggestion_title_without_device));
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close);
        if (imageView != null) {
            imageView.setOnClickListener(new i1(ctp0Var2, 10));
        }
        final VkButton vkButton = (VkButton) inflate.findViewById(R.id.pick_device);
        if (vkButton != null) {
            vkButton.setOnClickListener(new View.OnClickListener() { // from class: xsna.atp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ctp0 ctp0Var3 = ctp0.this;
                    veg0 veg0Var = ctp0Var3.c;
                    veg0Var.c(MobileOfficialAppsVideoStat$CastConnectOfferModalType.OFFER_MODAL_RECONNECT_MULTI);
                    veg0Var.getClass();
                    qu5.c().getClass();
                    vkButton.getContext();
                    fwb0 fwb0Var2 = ctp0Var3.f;
                    if (fwb0Var2 == null) {
                        fwb0Var2 = null;
                    }
                    fwb0Var2.b();
                    ctp0Var3.d.getClass();
                }
            });
            if (vz9Var != null && list != null) {
                int size = list.size();
                z = true;
            }
            z = false;
            bwt0.p0(vkButton, z);
        }
        VkButton vkButton2 = (VkButton) inflate.findViewById(R.id.connect);
        if (vkButton2 != null) {
            vkButton2.setOnClickListener(new akc(3, ctp0Var2, vkButton2));
        }
        final VkButton vkButton3 = (VkButton) inflate.findViewById(R.id.settings);
        if (vkButton3 != null) {
            vkButton3.setOnClickListener(new View.OnClickListener() { // from class: xsna.btp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mh70 mh70Var = ctp0.this.e;
                    vkButton3.getContext();
                    mh70Var.getClass();
                }
            });
        }
        fwb0 fwb0Var2 = ctp0Var2.f;
        if (fwb0Var2 == null) {
            fwb0Var2 = null;
        }
        fwb0Var2.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        inflate.setLayoutParams(layoutParams);
        fwb0Var2.c = inflate;
        fwb0 fwb0Var3 = ctp0Var2.f;
        if (fwb0Var3 == null) {
            fwb0Var3 = null;
        }
        Activity activity = fwb0Var3.a;
        try {
        } catch (ClassCastException unused) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"FloatingBottomSheetDialog", "Error creating FloatingBottomSheetDialog: context must be AppCompatActivity."});
            }
        } catch (IllegalArgumentException e2) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"FloatingBottomSheetDialog", "Error creating FloatingBottomSheetDialog: " + e2});
            }
        } catch (NoSuchElementException e3) {
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.d, new Object[]{"FloatingBottomSheetDialog", "Error creating FloatingBottomSheetDialog: " + e3});
            }
        }
        if (fwb0Var3.c == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        if (viewGroup == null) {
            throw new NoSuchElementException("Can not find root container.");
        }
        View findViewById = viewGroup.findViewById(R.id.floating_bottom_sheet_root);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        View inflate2 = LayoutInflater.from(activity).inflate(R.layout.dialog_popup_bottom_sheet, (ViewGroup) null);
        fwb0Var3.c(inflate2);
        ViewGroup viewGroup2 = (ViewGroup) inflate2.findViewById(R.id.bottom_sheet);
        if (viewGroup2 != null) {
            viewGroup2.addView(fwb0Var3.c);
        }
        viewGroup.addView(inflate2);
        fwb0.a(viewGroup);
        MobileOfficialAppsVideoStat$CastConnectOfferModalType a2 = ctp0Var2.a();
        veg0 veg0Var = ctp0Var2.c;
        veg0Var.r = false;
        if (veg0Var.j != null) {
            System.currentTimeMillis();
        }
        nsd0 nsd0Var = new nsd0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.EVENT, null, null, null, null, null, 62, null);
        MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal.EventType eventType = MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal.EventType.SHOW_CAST_CONNECT_OFFER_MODAL;
        String str = veg0Var.s;
        if (str == null) {
            str = "";
        }
        SchemeStat$TypeView b2 = SchemeStat$TypeView.a.b(schemeStat$EventItem, "", "", null, new MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal(eventType, a2, new CommonVideoStat$TypeVsidItem(str), veg0Var.a(), Integer.valueOf((int) veg0Var.t)), 8);
        nsd0Var.f = c2;
        nsd0Var.g = b2;
        nsd0Var.q();
    }

    @Override // xsna.wts0
    public final io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> r5() {
        return getFeature().P;
    }

    public final void ro() {
        b bVar = this.U;
        if (bVar == null) {
            bVar = null;
        }
        RecyclerView recyclerView = bVar.b.g.f.getRecyclerView();
        kfs0 kfs0Var = this.G0;
        if (kfs0Var != null) {
            Iterator<hfz> it = kfs0Var.h.f.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next() instanceof AboutVideoItem.SimilarVideoRedesign) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = i >= 0 ? Integer.valueOf(i) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue() - 1;
                if (intValue < 0) {
                    intValue = 0;
                }
                int dimensionPixelSize = this.s0.c ? recyclerView.getResources().getDimensionPixelSize(R.dimen.video_discovery_catalog_tabs_height) : 0;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (recyclerView.isLaidOut()) {
                    recyclerView.postDelayed(new qkf0(recyclerView, intValue, dimensionPixelSize), 150L);
                } else {
                    recyclerView.addOnLayoutChangeListener(new okf0(recyclerView, intValue, dimensionPixelSize));
                }
            }
        }
    }

    public final void so(h4x h4xVar, boolean z) {
        eb30 eb30Var;
        a aVar = this.R0;
        if (((Boolean) aVar.a.getValue()).booleanValue()) {
            return;
        }
        m mVar = VideoMinimizableDiscoveryFragment.this.J0;
        if (mVar != null && (eb30Var = mVar.z) != null) {
            int i = h4xVar.a;
            int i2 = h4xVar.c;
            int i3 = h4xVar.b;
            int i4 = h4xVar.d;
            MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = eb30Var.a;
            int i5 = z ? 100 : 0;
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.expanded || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z4 = motionLayoutWithFixedTouches.Z4(R.id.expanded);
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.j(Z4);
                bVar.G(R.id.playerContainer, 3, i3);
                bVar.G(R.id.contentContainer, 4, i4);
                bVar.C(R.id.playerContainer, "1.7777778");
                s3q0 s3q0Var = s3q0.a;
                motionLayoutWithFixedTouches.l5(R.id.expanded, bVar);
            } else {
                androidx.constraintlayout.widget.b Z42 = motionLayoutWithFixedTouches.Z4(R.id.expanded);
                androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                bVar2.j(Z42);
                bVar2.G(R.id.playerContainer, 3, i3);
                bVar2.G(R.id.contentContainer, 4, i4);
                bVar2.C(R.id.playerContainer, "1.7777778");
                s3q0 s3q0Var2 = s3q0.a;
                motionLayoutWithFixedTouches.m5(R.id.expanded, bVar2, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.expanded_match_ratio || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z43 = motionLayoutWithFixedTouches.Z4(R.id.expanded_match_ratio);
                androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
                bVar3.j(Z43);
                bVar3.G(R.id.playerContainer, 3, i3);
                bVar3.G(R.id.contentContainer, 4, i4);
                bVar3.C(R.id.playerContainer, String.valueOf(eb30Var.c));
                motionLayoutWithFixedTouches.l5(R.id.expanded_match_ratio, bVar3);
            } else {
                androidx.constraintlayout.widget.b Z44 = motionLayoutWithFixedTouches.Z4(R.id.expanded_match_ratio);
                androidx.constraintlayout.widget.b bVar4 = new androidx.constraintlayout.widget.b();
                bVar4.j(Z44);
                bVar4.G(R.id.playerContainer, 3, i3);
                bVar4.G(R.id.contentContainer, 4, i4);
                bVar4.C(R.id.playerContainer, String.valueOf(eb30Var.c));
                motionLayoutWithFixedTouches.m5(R.id.expanded_match_ratio, bVar4, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.expanded_landscape_tablet || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z45 = motionLayoutWithFixedTouches.Z4(R.id.expanded_landscape_tablet);
                androidx.constraintlayout.widget.b bVar5 = new androidx.constraintlayout.widget.b();
                bVar5.j(Z45);
                bVar5.G(R.id.playerContainer, 3, i3);
                bVar5.G(R.id.contentContainer, 4, i4);
                bVar5.G(R.id.tabletRecommendationsContainer, 4, i4);
                bVar5.G(R.id.dialogContainer, 4, i4);
                bVar5.G(R.id.dialogContainer, 3, i3);
                bVar5.G(R.id.dialogContainer, 1, i);
                bVar5.G(R.id.dialogContainer, 2, i2);
                motionLayoutWithFixedTouches.l5(R.id.expanded_landscape_tablet, bVar5);
            } else {
                androidx.constraintlayout.widget.b Z46 = motionLayoutWithFixedTouches.Z4(R.id.expanded_landscape_tablet);
                androidx.constraintlayout.widget.b bVar6 = new androidx.constraintlayout.widget.b();
                bVar6.j(Z46);
                bVar6.G(R.id.playerContainer, 3, i3);
                bVar6.G(R.id.contentContainer, 4, i4);
                bVar6.G(R.id.tabletRecommendationsContainer, 4, i4);
                bVar6.G(R.id.dialogContainer, 4, i4);
                bVar6.G(R.id.dialogContainer, 3, i3);
                bVar6.G(R.id.dialogContainer, 1, i);
                bVar6.G(R.id.dialogContainer, 2, i2);
                motionLayoutWithFixedTouches.m5(R.id.expanded_landscape_tablet, bVar6, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.expanded_landscape_tablet_with_dialog || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z47 = motionLayoutWithFixedTouches.Z4(R.id.expanded_landscape_tablet_with_dialog);
                androidx.constraintlayout.widget.b bVar7 = new androidx.constraintlayout.widget.b();
                bVar7.j(Z47);
                bVar7.G(R.id.playerContainer, 3, i3);
                bVar7.G(R.id.contentContainer, 4, i4);
                bVar7.G(R.id.tabletRecommendationsContainer, 4, i4);
                bVar7.G(R.id.dialogContainer, 4, i4);
                bVar7.G(R.id.dialogContainer, 3, i3);
                bVar7.G(R.id.dialogContainer, 1, i);
                bVar7.G(R.id.dialogContainer, 2, i2);
                motionLayoutWithFixedTouches.l5(R.id.expanded_landscape_tablet_with_dialog, bVar7);
            } else {
                androidx.constraintlayout.widget.b Z48 = motionLayoutWithFixedTouches.Z4(R.id.expanded_landscape_tablet_with_dialog);
                androidx.constraintlayout.widget.b bVar8 = new androidx.constraintlayout.widget.b();
                bVar8.j(Z48);
                bVar8.G(R.id.playerContainer, 3, i3);
                bVar8.G(R.id.contentContainer, 4, i4);
                bVar8.G(R.id.tabletRecommendationsContainer, 4, i4);
                bVar8.G(R.id.dialogContainer, 4, i4);
                bVar8.G(R.id.dialogContainer, 3, i3);
                bVar8.G(R.id.dialogContainer, 1, i);
                bVar8.G(R.id.dialogContainer, 2, i2);
                motionLayoutWithFixedTouches.m5(R.id.expanded_landscape_tablet_with_dialog, bVar8, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.dialog_under_video || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z49 = motionLayoutWithFixedTouches.Z4(R.id.dialog_under_video);
                androidx.constraintlayout.widget.b bVar9 = new androidx.constraintlayout.widget.b();
                bVar9.j(Z49);
                bVar9.G(R.id.playerContainer, 3, i3);
                bVar9.G(R.id.contentContainer, 4, i4);
                bVar9.G(R.id.dialogContainer, 4, i4);
                motionLayoutWithFixedTouches.l5(R.id.dialog_under_video, bVar9);
            } else {
                androidx.constraintlayout.widget.b Z410 = motionLayoutWithFixedTouches.Z4(R.id.dialog_under_video);
                androidx.constraintlayout.widget.b bVar10 = new androidx.constraintlayout.widget.b();
                bVar10.j(Z410);
                bVar10.G(R.id.playerContainer, 3, i3);
                bVar10.G(R.id.contentContainer, 4, i4);
                bVar10.G(R.id.dialogContainer, 4, i4);
                motionLayoutWithFixedTouches.m5(R.id.dialog_under_video, bVar10, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.dialog_expanded || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z411 = motionLayoutWithFixedTouches.Z4(R.id.dialog_expanded);
                androidx.constraintlayout.widget.b bVar11 = new androidx.constraintlayout.widget.b();
                bVar11.j(Z411);
                bVar11.G(R.id.dialogContainer, 3, i3);
                bVar11.G(R.id.dialogContainer, 4, i4);
                bVar11.G(R.id.playerContainer, 3, i3);
                bVar11.G(R.id.contentContainer, 4, i4);
                motionLayoutWithFixedTouches.l5(R.id.dialog_expanded, bVar11);
            } else {
                androidx.constraintlayout.widget.b Z412 = motionLayoutWithFixedTouches.Z4(R.id.dialog_expanded);
                androidx.constraintlayout.widget.b bVar12 = new androidx.constraintlayout.widget.b();
                bVar12.j(Z412);
                bVar12.G(R.id.dialogContainer, 3, i3);
                bVar12.G(R.id.dialogContainer, 4, i4);
                bVar12.G(R.id.playerContainer, 3, i3);
                bVar12.G(R.id.contentContainer, 4, i4);
                motionLayoutWithFixedTouches.m5(R.id.dialog_expanded, bVar12, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.fullscreen_with_dialog || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z413 = motionLayoutWithFixedTouches.Z4(R.id.fullscreen_with_dialog);
                androidx.constraintlayout.widget.b bVar13 = new androidx.constraintlayout.widget.b();
                bVar13.j(Z413);
                bVar13.p(R.id.dialogContainer, motionLayoutWithFixedTouches.getResources().getDimensionPixelSize(R.dimen.video_additional_info_container_width) + i2);
                motionLayoutWithFixedTouches.l5(R.id.fullscreen_with_dialog, bVar13);
            } else {
                androidx.constraintlayout.widget.b Z414 = motionLayoutWithFixedTouches.Z4(R.id.fullscreen_with_dialog);
                androidx.constraintlayout.widget.b bVar14 = new androidx.constraintlayout.widget.b();
                bVar14.j(Z414);
                bVar14.p(R.id.dialogContainer, motionLayoutWithFixedTouches.getResources().getDimensionPixelSize(R.dimen.video_additional_info_container_width) + i2);
                motionLayoutWithFixedTouches.m5(R.id.fullscreen_with_dialog, bVar14, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.fullscreen_with_right_promo || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z415 = motionLayoutWithFixedTouches.Z4(R.id.fullscreen_with_right_promo);
                androidx.constraintlayout.widget.b bVar15 = new androidx.constraintlayout.widget.b();
                bVar15.j(Z415);
                bVar15.p(R.id.rightPromoContainer, motionLayoutWithFixedTouches.getResources().getDimensionPixelSize(R.dimen.video_right_promo_container_width) + i2);
                motionLayoutWithFixedTouches.l5(R.id.fullscreen_with_right_promo, bVar15);
            } else {
                androidx.constraintlayout.widget.b Z416 = motionLayoutWithFixedTouches.Z4(R.id.fullscreen_with_right_promo);
                androidx.constraintlayout.widget.b bVar16 = new androidx.constraintlayout.widget.b();
                bVar16.j(Z416);
                bVar16.p(R.id.rightPromoContainer, motionLayoutWithFixedTouches.getResources().getDimensionPixelSize(R.dimen.video_right_promo_container_width) + i2);
                motionLayoutWithFixedTouches.m5(R.id.fullscreen_with_right_promo, bVar16, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.fullscreen_with_bottom_promo || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z417 = motionLayoutWithFixedTouches.Z4(R.id.fullscreen_with_bottom_promo);
                androidx.constraintlayout.widget.b bVar17 = new androidx.constraintlayout.widget.b();
                bVar17.j(Z417);
                bVar17.n(R.id.bottomPromoContainer, motionLayoutWithFixedTouches.getResources().getDimensionPixelSize(R.dimen.video_bottom_promo_container_height) + i4);
                motionLayoutWithFixedTouches.l5(R.id.fullscreen_with_bottom_promo, bVar17);
            } else {
                androidx.constraintlayout.widget.b Z418 = motionLayoutWithFixedTouches.Z4(R.id.fullscreen_with_bottom_promo);
                androidx.constraintlayout.widget.b bVar18 = new androidx.constraintlayout.widget.b();
                bVar18.j(Z418);
                bVar18.n(R.id.bottomPromoContainer, motionLayoutWithFixedTouches.getResources().getDimensionPixelSize(R.dimen.video_bottom_promo_container_height) + i4);
                motionLayoutWithFixedTouches.m5(R.id.fullscreen_with_bottom_promo, bVar18, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.collapsed || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z419 = motionLayoutWithFixedTouches.Z4(R.id.collapsed);
                androidx.constraintlayout.widget.b bVar19 = new androidx.constraintlayout.widget.b();
                bVar19.j(Z419);
                bVar19.G(R.id.playerContainer, 4, i4);
                motionLayoutWithFixedTouches.l5(R.id.collapsed, bVar19);
            } else {
                androidx.constraintlayout.widget.b Z420 = motionLayoutWithFixedTouches.Z4(R.id.collapsed);
                androidx.constraintlayout.widget.b bVar20 = new androidx.constraintlayout.widget.b();
                bVar20.j(Z420);
                bVar20.G(R.id.playerContainer, 4, i4);
                motionLayoutWithFixedTouches.m5(R.id.collapsed, bVar20, i5);
            }
            if (i5 <= 0 || motionLayoutWithFixedTouches.getCurrentState() != R.id.collapsed_landscape || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z421 = motionLayoutWithFixedTouches.Z4(R.id.collapsed_landscape);
                androidx.constraintlayout.widget.b bVar21 = new androidx.constraintlayout.widget.b();
                bVar21.j(Z421);
                bVar21.G(R.id.playerContainer, 6, i);
                bVar21.G(R.id.playerContainer, 7, i2);
                bVar21.G(R.id.playerContainer, 4, i4);
                motionLayoutWithFixedTouches.l5(R.id.collapsed_landscape, bVar21);
            } else {
                androidx.constraintlayout.widget.b Z422 = motionLayoutWithFixedTouches.Z4(R.id.collapsed_landscape);
                androidx.constraintlayout.widget.b bVar22 = new androidx.constraintlayout.widget.b();
                bVar22.j(Z422);
                bVar22.G(R.id.playerContainer, 6, i);
                bVar22.G(R.id.playerContainer, 7, i2);
                bVar22.G(R.id.playerContainer, 4, i4);
                motionLayoutWithFixedTouches.m5(R.id.collapsed_landscape, bVar22, i5);
            }
            androidx.constraintlayout.widget.b Z423 = motionLayoutWithFixedTouches.Z4(R.id.hidden);
            androidx.constraintlayout.widget.b bVar23 = new androidx.constraintlayout.widget.b();
            bVar23.j(Z423);
            bVar23.G(R.id.playerContainer, 6, i);
            bVar23.G(R.id.playerContainer, 7, i2);
            bVar23.G(R.id.playerContainer, 4, i4);
            motionLayoutWithFixedTouches.l5(R.id.hidden, bVar23);
            androidx.constraintlayout.widget.b Z424 = motionLayoutWithFixedTouches.Z4(R.id.hidden_landscape);
            androidx.constraintlayout.widget.b bVar24 = new androidx.constraintlayout.widget.b();
            bVar24.j(Z424);
            bVar24.G(R.id.playerContainer, 6, i);
            bVar24.G(R.id.playerContainer, 7, i2);
            bVar24.G(R.id.playerContainer, 4, i4);
            motionLayoutWithFixedTouches.l5(R.id.hidden_landscape, bVar24);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"CONSTRAINTS", "Constraints updated. bottomNavHeight=0; insets=" + h4xVar});
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void to(boolean z) {
        if (z) {
            zos0 a2 = ((VideoGrowthComponent) ko().f.getValue()).Af().a(VideoGrowthType.GRAY_BUTTON);
            if (a2 != null) {
                b bVar = this.U;
                if (bVar == null) {
                    bVar = null;
                }
                VideoGrowthButtons videoGrowthButtons = bVar.e;
                videoGrowthButtons.getClass();
                videoGrowthButtons.h = a2.b;
                VideoGrowthAppStore videoGrowthAppStore = VideoGrowthAppStore.GOOGLE;
                videoGrowthButtons.i = a2.c;
                videoGrowthButtons.j = a2.d;
                videoGrowthButtons.a();
            }
            b bVar2 = this.U;
            bwt0.p0((bVar2 != null ? bVar2 : null).e, ((VideoGrowthComponent) ko().f.getValue()).z6().a());
        } else {
            b bVar3 = this.U;
            bwt0.p0((bVar3 != null ? bVar3 : null).e, false);
        }
        ((VideoAdFreeSubscriptionComponent) ko().h.getValue()).E2().b(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x020c, code lost:
    
        if (r13 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020e, code lost:
    
        if (r5 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r7 = r23 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0214, code lost:
    
        r13.i("percentY", java.lang.Float.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0213, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0221, code lost:
    
        throw new java.util.NoSuchElementException("No element of the collection was transformed to a non-null value.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0205, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020a, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0222, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016c, code lost:
    
        r8 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016e, code lost:
    
        if (r8 == com.vkontakte.android.R.id.from_expanded_to_collapsed) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0170, code lost:
    
        if (r8 == com.vkontakte.android.R.id.from_expanded_match_ratio_to_collapsed) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0172, code lost:
    
        r8 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        if (r8.hasNext() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017c, code lost:
    
        r13 = r8.next().a.get(java.lang.Integer.valueOf(com.vkontakte.android.R.id.playerShadow));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0191, code lost:
    
        if (r13 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0193, code lost:
    
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019b, code lost:
    
        if (r13.hasNext() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019d, code lost:
    
        r14 = (xsna.zcy) r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a5, code lost:
    
        if ((r14 instanceof xsna.ydy) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a7, code lost:
    
        r14 = (xsna.ydy) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ac, code lost:
    
        if (r14 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b1, code lost:
    
        if (r14 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b3, code lost:
    
        r14.i("percentY", java.lang.Float.valueOf(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c0, code lost:
    
        throw new java.util.NoSuchElementException("No element of the collection was transformed to a non-null value.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01aa, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01af, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c1, code lost:
    
        r3 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c9, code lost:
    
        if (r3 == com.vkontakte.android.R.id.from_dialog_expanded_to_collapsed) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cb, code lost:
    
        if (r3 != com.vkontakte.android.R.id.from_dialog_expanded_to_hidden) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0222, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0222, code lost:
    
        r9 = r23;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cd, code lost:
    
        r3 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d5, code lost:
    
        if (r3.hasNext() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d7, code lost:
    
        r7 = r3.next().a.get(java.lang.Integer.valueOf(com.vkontakte.android.R.id.dialogContainer));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ec, code lost:
    
        if (r7 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ee, code lost:
    
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f6, code lost:
    
        if (r7.hasNext() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f8, code lost:
    
        r13 = (xsna.zcy) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
    
        if ((r13 instanceof xsna.ydy) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0202, code lost:
    
        r13 = (xsna.ydy) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0207, code lost:
    
        if (r13 != null) goto L122;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uo(int i, int i2, h4x h4xVar) {
        ydy ydyVar;
        m mVar = this.J0;
        if (mVar != null) {
            int intValue = ((Number) this.o0.getValue()).intValue();
            eb30 eb30Var = mVar.z;
            if (eb30Var != null) {
                boolean z = false;
                float f2 = 0;
                float f3 = ((i2 - h4xVar.d) - h4xVar.b) - f2;
                float f4 = i / 1.7777778f;
                float f5 = 2;
                float f6 = 1.0f;
                float f7 = swe0.f(((f3 - f4) / ((f3 - (intValue / 2.0f)) - (f4 / f5))) + 0.001f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                float f8 = f3 + f2;
                float f9 = swe0.f((f8 - (f2 + f4)) / (((i2 / 2) + f8) - (f8 / f5)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = eb30Var.a;
                Collection<a.b> l = e43.l(motionLayoutWithFixedTouches.getScene().h(R.id.from_hidden_to_expanded), motionLayoutWithFixedTouches.getScene().h(R.id.from_hidden_to_expanded_match_ratio), motionLayoutWithFixedTouches.getScene().h(R.id.from_dialog_expanded_to_hidden), motionLayoutWithFixedTouches.getScene().h(R.id.from_dialog_under_video_to_hidden));
                jli0 jli0Var = new jli0(new ulp0(rl3.D(new Integer[]{Integer.valueOf(R.id.from_expanded_match_ratio_to_collapsed), Integer.valueOf(R.id.from_expanded_to_collapsed), Integer.valueOf(R.id.from_dialog_under_video_to_collapsed), Integer.valueOf(R.id.from_dialog_expanded_to_collapsed)}), new db30(1, motionLayoutWithFixedTouches.getScene(), androidx.constraintlayout.motion.widget.a.class, "getTransitionById", "getTransitionById(I)Landroidx/constraintlayout/motion/widget/MotionScene$Transition;", 0)));
                if (eb30Var.b) {
                    l = j5g.u0(jli0Var, l);
                }
                for (a.b bVar : l) {
                    int i3 = bVar.d;
                    ArrayList<kdy> arrayList = bVar.k;
                    boolean z2 = (i3 == R.id.collapsed || i3 == R.id.collapsed_landscape || i3 == R.id.hidden || i3 == R.id.hidden_landscape) ? true : z;
                    float f10 = z2 ? f6 - f7 : f7;
                    Iterator<kdy> it = arrayList.iterator();
                    while (true) {
                        float f11 = f6;
                        if (!it.hasNext()) {
                            break;
                        }
                        ArrayList<zcy> arrayList2 = it.next().a.get(Integer.valueOf(R.id.playerContainer));
                        if (arrayList2 != null) {
                            Iterator<T> it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    ydyVar = null;
                                    break;
                                }
                                zcy zcyVar = (zcy) it2.next();
                                ydyVar = zcyVar instanceof ydy ? (ydy) zcyVar : null;
                                if (ydyVar != null) {
                                    break;
                                }
                            }
                            if (ydyVar == null) {
                                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
                            }
                            ydyVar.i("percentY", Float.valueOf(f10));
                        }
                        f6 = f11;
                    }
                }
            }
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.quk0
    public final Parcelable vb() {
        q qVar = (q) getFeature().i.c;
        return new VideoMinimizableDiscoverySavedState(qVar.b, qVar.l, qVar.n, qVar.d, qVar.e, qVar.c, qVar.t);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        if (fxc0.B().J().e0().a) {
            this.d0 = new nht0(requireContext());
        }
        dhr0 dhr0Var = dhr0.a;
        Context requireContext = requireContext();
        dhr0Var.getClass();
        this.e0 = new edt0(dhr0.t(requireContext));
        this.f0 = new pbx(requireContext());
        this.g0 = new VideoDiscoveryRelatedVideosSnackBarManager(requireContext());
        this.h0 = new VideoDiscoveryRelatedAudioSnackBarManager(requireContext());
        this.i0 = new dgs0(requireContext());
        bpn0 bpn0Var = new bpn0(new rns0(this, 2));
        UxPollsComponent uxPollsComponent = (UxPollsComponent) ko().p.getValue();
        WarmupComponent warmupComponent = (WarmupComponent) ko().q.getValue();
        nwy nwyVar = ko().M;
        qcy<Object> qcyVar = VideoMinimizableDiscoveryInternalComponent.O[1];
        irk irkVar = (irk) nwyVar.c();
        VideoDiscoveryRecommendationsRepository videoDiscoveryRecommendationsRepository = new VideoDiscoveryRecommendationsRepository(uxPollsComponent.o2(), uxPollsComponent.Z4(), bpn0Var);
        Context applicationContext = requireContext().getApplicationContext();
        com.vk.video.ui.discovery.catalog.d dVar = new com.vk.video.ui.discovery.catalog.d(new com.vk.video.ui.discovery.catalog.c(videoDiscoveryRecommendationsRepository, uxPollsComponent.o2(), uxPollsComponent.Z4(), bpn0Var, new dy20(applicationContext), new cff(applicationContext, 3), new ey20(applicationContext), new gy20(applicationContext)), bpn0Var, uxPollsComponent.o2(), uxPollsComponent.Z4());
        eis0 Ud = ((VideoDownloadsComponent) ko().A.getValue()).Ud();
        ezs0 s = fxc0.B().s();
        VideoMinimizableDiscoverySavedState videoMinimizableDiscoverySavedState = km50Var instanceof VideoMinimizableDiscoverySavedState ? (VideoMinimizableDiscoverySavedState) km50Var : null;
        wit0 g0 = ((VideoSubscriptionComponent) ko().y.getValue()).g0();
        vvs0 Y3 = ((VideoMinimizablePlayerComponent) ko().a.getValue()).Y3();
        fks0 J = fxc0.B().J();
        com.vk.video.kidsprofile.restricteduseractions.a e2 = ko().e2();
        u9t0 L = ((VideoPromoComponent) ko().C.getValue()).L();
        VideoAdvertisementsRepository pc = ((VideoAdvertisementsComponent) ko().E.getValue()).pc();
        lyr0 t4 = ((VideoAdvertisementsComponent) ko().E.getValue()).t4();
        VideoPlaylistReversionComponent videoPlaylistReversionComponent = (VideoPlaylistReversionComponent) ko().n.getValue();
        x4r0 x4r0Var = new x4r0(((UxPollsComponent) ko().p.getValue()).o2(), ((UxPollsComponent) ko().p.getValue()).v8());
        Context requireContext2 = requireContext();
        HashSet hashSet = iah0.a;
        boolean d2 = fnj.d(requireContext2);
        WarmupComponent$Companion$STUB$1.a Qe = warmupComponent.Qe();
        h0w0 Ka = ((VkVideoPromoComponent) ko().D.getValue()).Ka();
        return new com.vk.video.ui.discovery.minimizable.g(s, videoDiscoveryRecommendationsRepository, dVar, Ud, bpn0Var, J, videoMinimizableDiscoverySavedState, g0, Y3, e2, videoPlaylistReversionComponent, L, pc, t4, this.i1, x4r0Var, (VideoQueueComponent) ko().d.getValue(), d2, Qe, Ka, ((VideoPlaylistVideosComponent) ko().l.getValue()).U7(), ((VideoSeekComponent) ko().H.getValue()).E1(), ((MusicInVideoComponent) ko().j.getValue()).pb(), ((BridgeComponent) ko().g.getValue()).p().a(), ((BridgeComponent) ko().g.getValue()).s(), ((VideoMinimizablePlayerComponent) ko().a.getValue()).P7(), ko().Ef(), ((VideoAutologinComponent) ko().s.getValue()).u7(), (VideoMinimizablePlayerComponent) ko().a.getValue(), ((DonutVideoComponent) ko().J.getValue()).wb(), new bpn0(new tsk0(this, 22)), ko().Gf(), no(), this.Z0, ((DonutVideoComponent) ko().J.getValue()).Qa(), irkVar, ko().f, ((VideoAdFreeSubscriptionComponent) ko().h.getValue()).t6(), new bpn0(new pis0(this, 4)));
    }

    @Override // xsna.wts0
    public final int xf() {
        mws0 mws0Var = this.K0;
        if (mws0Var != null) {
            return mws0Var.e.b().size();
        }
        return 0;
    }

    /* compiled from: VideoMinimizableDiscoveryFragment.kt */
    public static final class g implements yks0.a {
        public g() {
        }

        @Override // xsna.yks0.a
        public final void He(List list, VideoFile videoFile) {
            xn50.a.c(VideoMinimizableDiscoveryFragment.this, new c.b1(videoFile));
        }

        @Override // xsna.yks0.a
        public final void uf(boolean z) {
            xn50.a.c(VideoMinimizableDiscoveryFragment.this, new c.v(z));
        }

        @Override // xsna.yks0.a
        public final void dismiss() {
        }

        @Override // xsna.yks0.a
        public final void vk(boolean z) {
        }

        @Override // xsna.yks0.a
        public final void L9(VideoFile videoFile, boolean z) {
        }
    }
}
