package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.MultiaccAnalytics;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.ShimmerVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.container.WarmupContainerVh;
import com.vk.catalog2.common.ui.holders.search.FilterParameters;
import com.vk.catalog2.common.ui.holders.search.SearchContentVh;
import com.vk.catalog2.common.ui.holders.search.SearchFilterVh;
import com.vk.catalog2.common.ui.holders.video.VideoHidingToolbarVh;
import com.vk.catalog2.common.ui.holders.video.VideoOfflineFragmentVh;
import com.vk.catalog2.common.ui.holders.video.VideoPinnedSectionOfflineException;
import com.vk.catalog2.common.ui.holders.video.VideoSearchParamsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.reload.CatalogReloadTrigger;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.a;
import com.vk.catalog2.common.ui.mvp.holder.search.suggester.core.SearchServiceWithSuggestCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.a;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarExpandableControllerBehaviour;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.onboarding.Onboarding;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.autoplay.e;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.movika.sdk.base.ui.l;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.ui.SearchParametersBottomView;
import com.vk.splashscreen.api.SplashScreenState;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.data.VideoGrowthCommunitySource;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.subjects.f;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.d;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.acd;
import xsna.acp0;
import xsna.aha;
import xsna.ajd0;
import xsna.akd0;
import xsna.alj;
import xsna.anj;
import xsna.ap80;
import xsna.ape0;
import xsna.asu0;
import xsna.awm0;
import xsna.b0u0;
import xsna.b25;
import xsna.b9s0;
import xsna.bdn;
import xsna.be80;
import xsna.bg00;
import xsna.bnn0;
import xsna.bpn0;
import xsna.brm0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.d2c0;
import xsna.d3j0;
import xsna.dhr0;
import xsna.drm0;
import xsna.e43;
import xsna.egi;
import xsna.ejf0;
import xsna.enj;
import xsna.epx;
import xsna.f0s0;
import xsna.f4m;
import xsna.f5z;
import xsna.f84;
import xsna.fem0;
import xsna.fnj;
import xsna.fxc0;
import xsna.fyd0;
import xsna.fyi0;
import xsna.g3a;
import xsna.g620;
import xsna.g8n0;
import xsna.g9l0;
import xsna.gas0;
import xsna.ghn0;
import xsna.gj2;
import xsna.gko;
import xsna.grp0;
import xsna.gzs;
import xsna.h0a;
import xsna.h0t0;
import xsna.h7v;
import xsna.h94;
import xsna.has0;
import xsna.hf8;
import xsna.hg1;
import xsna.hpj;
import xsna.hri0;
import xsna.hui;
import xsna.i0q0;
import xsna.i6m0;
import xsna.i86;
import xsna.iah0;
import xsna.ic1;
import xsna.icn0;
import xsna.ie00;
import xsna.ih80;
import xsna.ipi;
import xsna.iri0;
import xsna.iut0;
import xsna.izs;
import xsna.j5g;
import xsna.j8n0;
import xsna.jcf0;
import xsna.jjt0;
import xsna.kld0;
import xsna.ko60;
import xsna.ku70;
import xsna.kzt0;
import xsna.l7v;
import xsna.las0;
import xsna.lhp;
import xsna.ltz;
import xsna.mll0;
import xsna.msy;
import xsna.mwm0;
import xsna.myc0;
import xsna.mzp0;
import xsna.mzt0;
import xsna.nda;
import xsna.nnb0;
import xsna.nrq0;
import xsna.nz9;
import xsna.o0i0;
import xsna.o330;
import xsna.o9s0;
import xsna.orj0;
import xsna.p1s0;
import xsna.p9s0;
import xsna.pgn;
import xsna.pla;
import xsna.prq0;
import xsna.pv7;
import xsna.q0r;
import xsna.q3t0;
import xsna.qc00;
import xsna.qcy;
import xsna.qlb0;
import xsna.qp3;
import xsna.qrf;
import xsna.qs9;
import xsna.r0j0;
import xsna.r0r0;
import xsna.r6i0;
import xsna.r8s0;
import xsna.r9s0;
import xsna.rj01;
import xsna.rl3;
import xsna.rme0;
import xsna.s1v;
import xsna.s3q0;
import xsna.s9s0;
import xsna.sba;
import xsna.sd;
import xsna.stg0;
import xsna.swp;
import xsna.sxq0;
import xsna.t9s0;
import xsna.t9t0;
import xsna.tfm0;
import xsna.ttz;
import xsna.txh0;
import xsna.u2k0;
import xsna.u4a;
import xsna.u4q0;
import xsna.u9s0;
import xsna.uh80;
import xsna.uha;
import xsna.uis;
import xsna.utk0;
import xsna.uv80;
import xsna.uyq0;
import xsna.v9s0;
import xsna.vgb0;
import xsna.vhn0;
import xsna.vpn0;
import xsna.vyh0;
import xsna.wb7;
import xsna.wc00;
import xsna.wet0;
import xsna.wg8;
import xsna.whn0;
import xsna.wvw;
import xsna.ww50;
import xsna.wzh0;
import xsna.x1e0;
import xsna.x8c;
import xsna.xbj0;
import xsna.xca;
import xsna.xkk0;
import xsna.xz9;
import xsna.xzh0;
import xsna.yei0;
import xsna.yqd0;
import xsna.yw90;
import xsna.yys0;
import xsna.z23;
import xsna.z4d0;
import xsna.zik0;
import xsna.zvj;

/* compiled from: VideoCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogRootVh extends CatalogRootViewHolder implements SearchServiceWithSuggestCatalogRootVh, CatalogVh, SwitchCatalogVh.b, mzt0 {
    public static final int M0 = iah0.a(40);
    public static final bpn0 N0 = new bpn0(new ku70(13));
    public static final bpn0 O0 = new bpn0(new ap80(12));
    public final yw90 A;
    public final VideoHidingToolbarVh A0;
    public final gzs<FullSourceJoinApi> B;
    public final VideoSearchParamsVh B0;
    public final xkk0 C;
    public bnn0 C0;
    public final Object D;
    public bnn0 D0;
    public final Object E;
    public boolean E0;
    public final Object F;
    public io.reactivex.rxjava3.disposables.c F0;
    public final Object G;
    public io.reactivex.rxjava3.disposables.c G0;
    public final Object H;
    public hpj H0;
    public final Object I;
    public String I0;
    public final Object J;
    public boolean J0;
    public final Object K;
    public final Object K0;
    public final bpn0 L;
    public final com.vk.catalog2.common.ui.mvp.holder.video.a L0;
    public final Object M;
    public final Object N;
    public final Object O;
    public final g3a P;
    public final VideoCatalogId Q;
    public final boolean R;
    public final boolean S;
    public final aha T;
    public final LinkedHashSet U;
    public final r9s0 V;
    public final q0r W;
    public final Object X;
    public final h7v Y;
    public final ToolbarVh Z;
    public final ViewPagerVh a0;
    public View b0;
    public UIBlockList c0;
    public final FirstPinnedTabLayoutVh d0;
    public final VideoSearchFiltersImpl e0;
    public final wzh0 f0;
    public final bpn0 g0;
    public SearchStatsLoggingInfo h0;
    public final VkTopBarSearchQueryVh i0;
    public final ChildTopBarWrapperVh j0;
    public final SearchContentVh k0;
    public final VkSearchQueryVh l0;
    public boolean m0;
    public final mwm0 n0;
    public final icn0 o0;
    public final nda p;
    public final boolean p0;
    public final boolean q;
    public final bpn0 q0;
    public final xca r;
    public final Object r0;
    public final gzs<s3q0> s;
    public final bpn0 s0;
    public final gzs<s3q0> t;
    public final VideoCatalogRootVh$donutReceiver$1 t0;
    public final izs<Long, s3q0> u;
    public final gas0 u0;
    public final mzp0 v;
    public final VideoCatalogHeaderVh v0;
    public final yw90 w;
    public final Object w0;
    public final gzs<Boolean> x;
    public final has0 x0;
    public final be80 y;
    public final SwitchCatalogVh y0;
    public final f0s0 z;
    public final WarmupContainerVh z0;

    /* compiled from: VideoCatalogRootVh.kt */
    public static final class a {
        public static awm0 a() {
            return new awm0(6);
        }
    }

    /* compiled from: VideoCatalogRootVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SUPERAPP_TRAFFIC_GROUP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FilterParameters.values().length];
            try {
                iArr2[FilterParameters.CATEGORY_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[FilterParameters.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public VideoCatalogRootVh() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x063c, code lost:
    
        if (r0 != null) goto L167;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v40, types: [xsna.q9s0] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh$donutReceiver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, nda ndaVar, boolean z, rj01 rj01Var, yys0 yys0Var, t9t0 t9t0Var, las0 las0Var, i86 i86Var, acp0 acp0Var, prq0 prq0Var, r6i0 r6i0Var, mzp0 mzp0Var, yw90 yw90Var, gzs gzsVar, be80 be80Var, ih80 ih80Var, f0s0 f0s0Var, nnb0 nnb0Var, x8c x8cVar, yw90 yw90Var2, j8n0 j8n0Var, xkk0 xkk0Var, boolean z2, int i) {
        super(r40, (Class) null, (Activity) fragmentActivity, ndaVar, false, (f5z) null, 112);
        gzs gzsVar2;
        ShimmerVh shimmerVh;
        ProgressVh shimmerVh2;
        ErrorStateVh videoOfflineFragmentVh;
        Bundle bundle2 = (i & 2) != 0 ? null : bundle;
        xca xcaVar = (i & 32) != 0 ? egi.c : rj01Var;
        yys0 yys0Var2 = (i & 64) != 0 ? null : yys0Var;
        t9t0 t9t0Var2 = (i & 128) != 0 ? null : t9t0Var;
        las0 las0Var2 = (i & 256) != 0 ? null : las0Var;
        gzs g9l0Var = (i & 512) != 0 ? new g9l0(4) : i86Var;
        acp0 acp0Var2 = (i & 1024) != 0 ? null : acp0Var;
        prq0 prq0Var2 = (i & 2048) != 0 ? null : prq0Var;
        r6i0 r6i0Var2 = (i & 4096) != 0 ? null : r6i0Var;
        mzp0 mzp0Var2 = (i & 8192) != 0 ? null : mzp0Var;
        yw90 yw90Var3 = (i & 16384) != 0 ? null : yw90Var;
        f0s0 f0s0Var2 = (262144 & i) != 0 ? null : f0s0Var;
        nnb0 nnb0Var2 = (i & 524288) != 0 ? null : nnb0Var;
        x8c x8cVar2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : x8cVar;
        yw90 yw90Var4 = (i & 2097152) != 0 ? null : yw90Var2;
        j8n0 j8n0Var2 = (i & 4194304) != 0 ? null : j8n0Var;
        xkk0 xkk0Var2 = (i & 8388608) != 0 ? null : xkk0Var;
        Bundle bundle3 = bundle2;
        yys0 yys0Var3 = yys0Var2;
        t9t0 t9t0Var3 = t9t0Var2;
        las0 las0Var3 = las0Var2;
        this.p = ndaVar;
        this.q = z;
        this.r = xcaVar;
        this.s = acp0Var2;
        this.t = prq0Var2;
        this.u = r6i0Var2;
        this.v = mzp0Var2;
        this.w = yw90Var3;
        this.x = gzsVar;
        this.y = be80Var;
        this.z = f0s0Var2;
        this.A = yw90Var4;
        this.B = j8n0Var2;
        this.C = xkk0Var2;
        iri0 iri0Var = new iri0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D = msy.a(lazyThreadSafetyMode, iri0Var);
        int i2 = 16;
        this.E = msy.a(lazyThreadSafetyMode, new tfm0(this, i2));
        this.F = msy.a(lazyThreadSafetyMode, new ghn0(this, fragmentActivity));
        this.G = msy.a(lazyThreadSafetyMode, new mll0(this, 12));
        this.H = msy.a(lazyThreadSafetyMode, new rme0(this, i2));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new sxq0(this, 2));
        this.I = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new ajd0(this, 19));
        this.J = a3;
        int i3 = 11;
        Lazy a4 = msy.a(lazyThreadSafetyMode, new vpn0(this, i3));
        this.K = a4;
        this.L = new bpn0(new g8n0(this, i3));
        this.M = msy.a(lazyThreadSafetyMode, new f84(27));
        this.N = msy.a(lazyThreadSafetyMode, new wc00(fragmentActivity, 1));
        this.O = msy.a(lazyThreadSafetyMode, new d3j0(this, i3));
        u4a u4aVar = this.m;
        this.P = u4aVar.b.s.S(u4aVar, null);
        Serializable serializable = bundle3 != null ? bundle3.getSerializable("video_catalog_id") : null;
        VideoCatalogId videoCatalogId = serializable instanceof VideoCatalogId ? (VideoCatalogId) serializable : null;
        this.Q = videoCatalogId;
        VideoCatalogId videoCatalogId2 = VideoCatalogId.HOME;
        this.R = videoCatalogId == videoCatalogId2 || videoCatalogId == VideoCatalogId.SUBSCRIPTIONS || videoCatalogId == VideoCatalogId.PROFILE;
        this.S = videoCatalogId == VideoCatalogId.SUBSCRIPTIONS;
        this.m.b.getClass();
        this.T = new aha(fragmentActivity, ih80Var, null);
        this.U = new LinkedHashSet();
        this.V = new r9s0(this);
        qs9 qs9Var = new qs9(this);
        this.W = new q0r(this, 7);
        this.X = msy.a(lazyThreadSafetyMode, new uv80(12));
        boolean z3 = this.m.b.c && fxc0.B().J().x0();
        boolean z4 = ((Boolean) g9l0Var.invoke()).booleanValue() || z;
        bpn0 bpn0Var = pla.a;
        l7v b2 = ((wvw) (bpn0Var == null ? null : bpn0Var).getValue()).b();
        this.Y = b2;
        u4a.a aVar = this.m.b;
        ToolbarVh toolbarVh = new ToolbarVh(aVar.b, aVar.e, null, z3 ? R.layout.catalog_toolbar_tablet : R.layout.catalog_toolbar, z, null, null, r6i0Var2, null, null, null, 4186084);
        this.Z = toolbarVh;
        if (t9t0Var3 == null || (shimmerVh2 = t9t0Var3.create()) == null) {
            Integer i4 = videoCatalogId != null ? videoCatalogId.i() : null;
            List<Integer> h = videoCatalogId != null ? videoCatalogId.h() : null;
            if (i4 == null || h == null) {
                gzsVar2 = g9l0Var;
                shimmerVh = null;
            } else {
                gzsVar2 = g9l0Var;
                shimmerVh = new ShimmerVh(i4.intValue(), 12, false, h);
            }
            if (shimmerVh != null) {
                shimmerVh2 = shimmerVh;
            } else {
                shimmerVh2 = new ShimmerVh(z3 ? R.layout.catalog_video_shimmer_tablet_redesign : R.layout.catalog_video_shimmer, 4, z4, e43.l(Integer.valueOf(R.id.toolbar_buttons), Integer.valueOf(R.id.content)));
            }
        } else {
            gzsVar2 = g9l0Var;
        }
        ViewPagerVh videoViewPagerVh = this.m.b.s.J() ? new VideoViewPagerVh(this.m, N(), new t9s0(toolbarVh), this, qs9Var, 540) : new ViewPagerVh(this.m, false, null, false, this, new t9s0(toolbarVh), null, N(), qs9Var, null, 4718);
        this.a0 = videoViewPagerVh;
        FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = new FirstPinnedTabLayoutVh(videoViewPagerVh, this.m.b.r, new jjt0(), Integer.valueOf(R.drawable.catalog_first_pinned_indicator), z3, b2, nnb0Var2, x8cVar2, videoCatalogId == videoCatalogId2 ? new pv7(this) : null, 10);
        this.d0 = firstPinnedTabLayoutVh;
        VideoSearchFiltersImpl videoSearchFiltersImpl = new VideoSearchFiltersImpl();
        this.e0 = videoSearchFiltersImpl;
        wzh0 wzh0Var = new wzh0(this, this.m, videoSearchFiltersImpl, new i6m0(this, 11), fragmentActivity);
        this.f0 = wzh0Var;
        this.g0 = new bpn0(new ko60(10));
        ProgressVh progressVh = shimmerVh2;
        VkTopBarSearchQueryVh vkTopBarSearchQueryVh = new VkTopBarSearchQueryVh(R.string.video_search_hint, wzh0Var.o, new grp0(true, false), new txh0(new qrf(0, ndaVar, nda.class, "onBackPressed", "onBackPressed(Z)Z", 0, 1), new x1e0(this, 23), new xzh0(0, wzh0Var, wzh0.class, "onParamsIconClicked", "onParamsIconClicked()V", 0, 1), new jcf0(this, 17), new z4d0(this, 27), new acd(0, this, VideoCatalogRootVh.class, "onSearchIconClick", "onSearchIconClick()V", 0, 5), 64), VkTopBar.m.b.a, VkTopBar.j.a.a, gzsVar2, 0L, VkTopBarSearchQueryVh.IconOrder.OptionalThirdSearch, 256);
        this.i0 = vkTopBarSearchQueryVh;
        ChildTopBarWrapperVh childTopBarWrapperVh = new ChildTopBarWrapperVh(fragmentActivity, vkTopBarSearchQueryVh);
        this.j0 = childTopBarWrapperVh;
        SearchContentVh c = wzh0Var.c();
        this.k0 = c;
        VkSearchQueryVh vkSearchQueryVh = new VkSearchQueryVh(new SearchQueryVh(R.string.video_search_hint, new v9s0(0, this.m.b.b, nda.class, "onBackPressed", "onBackPressed(Z)Z", 0), new akd0(this, 18), new uis(0, wzh0Var, wzh0.class, "onParamsIconClicked", "onParamsIconClicked()V", 0, 1), wzh0Var.o, 32), gzsVar2, new stg0(this, 20), new yei0(this, 15), null, 482);
        this.l0 = vkSearchQueryVh;
        mwm0 mwm0Var = new mwm0(fragmentActivity, 8);
        this.n0 = mwm0Var;
        r0r0 r0r0Var = new r0r0(this, 5);
        VkSearchQueryVh vkSearchQueryVh2 = vkSearchQueryVh;
        this.o0 = new icn0(this, 6);
        this.p0 = bundle3 != null && bundle3.containsKey("video_catalog_id");
        this.q0 = new bpn0(new l(23, this, bundle3));
        bpn0 bpn0Var2 = new bpn0(new p9s0(0, this, bundle3));
        this.r0 = msy.a(lazyThreadSafetyMode, new uh80(11));
        this.s0 = new bpn0(new orj0(this, 18));
        this.t0 = new BroadcastReceiver() { // from class: com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh$donutReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action != null && action.hashCode() == 3866578 && action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
                    VideoCatalogRootVh videoCatalogRootVh = VideoCatalogRootVh.this;
                    if (videoCatalogRootVh.r.d(CatalogReloadTrigger.DONUT_SUBSCRIPTION)) {
                        videoCatalogRootVh.P.d();
                    }
                }
            }
        };
        this.u0 = new gas0(fragmentActivity, ((Boolean) bpn0Var2.getValue()).booleanValue(), this.q, o0(), (nz9) a4.getValue(), (r8s0) a3.getValue(), (xz9) a2.getValue());
        u4a u4aVar2 = this.m;
        vgb0 vgb0Var = new vgb0(0, this, VideoCatalogRootVh.class, "onSearchIconClick", "onSearchIconClick()V", 0, 3);
        r0r0Var = ((Boolean) bpn0Var2.getValue()).booleanValue() ? r0r0Var : null;
        boolean z5 = this.q;
        mwm0Var = o0() ? mwm0Var : null;
        ejf0 ejf0Var = new ejf0(this, fragmentActivity);
        VideoCatalogHeaderVh videoCatalogHeaderDebrandedVh = BuildInfo.s() ? new VideoCatalogHeaderDebrandedVh(videoCatalogId, vgb0Var, r0r0Var, ejf0Var, z5, gzsVar2, mwm0Var, new fyd0(this, 17), new yqd0(this, 16)) : new VideoCatalogHeaderBrandedVh(u4aVar2, videoCatalogId, vgb0Var, r0r0Var, mwm0Var, ejf0Var);
        this.v0 = videoCatalogHeaderDebrandedVh;
        if (yys0Var3 != null) {
            o0();
            videoOfflineFragmentVh = yys0Var3.create();
        }
        videoOfflineFragmentVh = new VideoOfflineFragmentVh(this, new uyq0(this, 2));
        this.w0 = msy.a(lazyThreadSafetyMode, new xbj0(5));
        this.x0 = new has0();
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(videoViewPagerVh, c, videoOfflineFragmentVh, progressVh, this, R.layout.catalog_root_vh_layout_no_behaviour, this, null, ((Boolean) N0.getValue()).booleanValue(), ((Boolean) O0.getValue()).booleanValue(), null, 1152);
        this.y0 = switchCatalogVh;
        if (las0Var3 != null) {
            las0Var3.create();
        }
        WarmupContainerVh warmupContainerVh = new WarmupContainerVh(switchCatalogVh);
        this.z0 = warmupContainerVh;
        VideoHidingToolbarVh videoHidingToolbarVh = new VideoHidingToolbarVh(this.m.b.e, rl3.I(new CatalogViewHolder[]{p0() ? childTopBarWrapperVh : null, p0() ? null : videoCatalogHeaderDebrandedVh, p0() ? null : vkSearchQueryVh2, firstPinnedTabLayoutVh, toolbarVh}), warmupContainerVh, new AppBarExpandableControllerBehaviour(), new AppBarLayout.f() { // from class: xsna.q9s0
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void a(AppBarLayout appBarLayout, int i5) {
                View childAt;
                int i6 = VideoCatalogRootVh.M0;
                if (appBarLayout.getTotalScrollRange() == 0 || (childAt = appBarLayout.getChildAt(0)) == null) {
                    return;
                }
                float abs = Math.abs(f4m.e(childAt).top / childAt.getHeight());
                if (abs > 1.0f) {
                    abs = 1.0f;
                }
                FirstPinnedTabLayoutVh firstPinnedTabLayoutVh2 = VideoCatalogRootVh.this.d0;
                Integer num = firstPinnedTabLayoutVh2.q;
                if (num != null) {
                    int intValue = num.intValue();
                    FirstPinnedTabLayout firstPinnedTabLayout = firstPinnedTabLayoutVh2.p;
                    if (firstPinnedTabLayout == null) {
                        firstPinnedTabLayout = null;
                    }
                    f4m.k(((int) (firstPinnedTabLayoutVh2.t.b * abs)) + intValue, firstPinnedTabLayout);
                }
            }
        });
        this.A0 = videoHidingToolbarVh;
        this.B0 = new VideoSearchParamsVh(videoHidingToolbarVh, new hri0(this, 13), new wg8(1, wzh0Var, wzh0.class, "onFilterUpdate", "onFilterUpdate(Z)V", 0, 7), n0(), new qp3(1, wzh0Var, wzh0.class, "reloadWithNewSearchParams", "reloadWithNewSearchParams(Lcom/vk/search/params/api/VideoSearchFilters;)V", 0, 5), new ic1(1, wzh0Var, wzh0.class, "onFilterChangedByUser", "onFilterChangedByUser(Z)V", 0, 10), videoSearchFiltersImpl);
        this.J0 = true;
        this.K0 = msy.a(lazyThreadSafetyMode, new fem0(fragmentActivity, 6));
        this.L0 = new com.vk.catalog2.common.ui.mvp.holder.video.a(new a.C0510a(this.R, new qc00(17), new d2c0(12), r0(), asu0.a.d()), new wb7(this), (h0t0) this.H.getValue());
    }

    public static String j0(String str) {
        Object failure;
        if (str == null) {
            return null;
        }
        try {
            if (drm0.E(str, '#')) {
                str = brm0.y(str, "#", Uri.encode("#"));
            }
            failure = Uri.decode(Uri.parse(str).getQueryParameter(CampaignEx.JSON_KEY_AD_Q));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    public static long r0() {
        Long l = fxc0.B().J().e0().c;
        if (l != null) {
            L.e("VideoSlowNetworkHandler", qlb0.a(l.longValue(), "Received time from the toggle = ", " seconds"));
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 10L;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.y0.A(str);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder, xsna.gha
    public final void A2(String str) {
        i8(alj.a);
        Object obj = (ww50) this.N.getValue();
        bg00 bg00Var = obj instanceof bg00 ? (bg00) obj : null;
        if (bg00Var != null) {
            bg00Var.a();
        }
    }

    @Override // xsna.n0i0
    public final boolean F0() {
        if (p0()) {
            Boolean c9 = this.i0.c9();
            if (c9 != null) {
                return c9.booleanValue();
            }
            return false;
        }
        ModernSearchView modernSearchView = this.l0.b.k;
        if (modernSearchView != null) {
            return modernSearchView.getFocused();
        }
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.v;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        boolean z = uIBlock instanceof UIBlockCatalog;
        UIBlockCatalog uIBlockCatalog = z ? (UIBlockCatalog) uIBlock : null;
        this.I0 = uIBlockCatalog != null ? uIBlockCatalog.D : null;
        if (z) {
            this.a0.b(uIBlock, this.W);
        }
        VideoHidingToolbarVh videoHidingToolbarVh = this.A0;
        videoHidingToolbarVh.N6(uIBlock);
        UIBlockCatalog uIBlockCatalog2 = z ? (UIBlockCatalog) uIBlock : null;
        u4a u4aVar = this.m;
        if (uIBlockCatalog2 != null) {
            ArrayList<UIBlock> arrayList = uIBlockCatalog2.A;
            UIBlock uIBlock2 = (UIBlock) j5g.a0(arrayList);
            int size = arrayList.size();
            FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.d0;
            VkSearchQueryVh vkSearchQueryVh = this.l0;
            ToolbarVh toolbarVh = this.Z;
            VideoCatalogHeaderVh videoCatalogHeaderVh = this.v0;
            VkTopBarSearchQueryVh vkTopBarSearchQueryVh = this.i0;
            if (size != 1 || uIBlock2 == null) {
                this.h0 = null;
                this.J0 = true;
                SwitchCatalogVh switchCatalogVh = this.y0;
                if (switchCatalogVh.r instanceof vyh0) {
                    if (p0()) {
                        vkTopBarSearchQueryVh.show();
                    } else {
                        vkSearchQueryVh.c(false);
                        videoCatalogHeaderVh.hide();
                    }
                } else if (p0()) {
                    vkTopBarSearchQueryVh.show();
                } else {
                    vkSearchQueryVh.hide();
                    videoCatalogHeaderVh.show();
                }
                if (!(switchCatalogVh.r instanceof vyh0)) {
                    firstPinnedTabLayoutVh.show();
                    SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
                    searchStatInfoProvider.getClass();
                    searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Disabled;
                }
                toolbarVh.hide();
            } else {
                SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) this.h.getParcelable("search_stats_logging_info");
                this.h0 = searchStatsLoggingInfo;
                if (searchStatsLoggingInfo != null) {
                    SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
                    searchStatInfoProvider2.getClass();
                    searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Enabled;
                    u4aVar.b.m.a = true;
                }
                this.J0 = false;
                vkSearchQueryVh.hide();
                firstPinnedTabLayoutVh.hide();
                if (!this.p0) {
                    if (p0()) {
                        vkTopBarSearchQueryVh.hide();
                    } else {
                        videoCatalogHeaderVh.hide();
                    }
                    toolbarVh.N6(uIBlock2);
                    toolbarVh.show();
                    UIBlockList uIBlockList = uIBlock2 instanceof UIBlockList ? (UIBlockList) uIBlock2 : null;
                    UIBlockActionSearchMode uIBlockActionSearchMode = uIBlockList != null ? uIBlockList.I : null;
                    if (uIBlockActionSearchMode != null && epx.f(uIBlockActionSearchMode.z, "owner_videos")) {
                        videoHidingToolbarVh.a(false);
                    }
                } else if (p0()) {
                    vkTopBarSearchQueryVh.show();
                } else {
                    videoCatalogHeaderVh.show();
                    toolbarVh.hide();
                }
            }
        }
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        b9s0 b9s0Var = catalogConfiguration instanceof b9s0 ? (b9s0) catalogConfiguration : null;
        if ((b9s0Var != null ? b9s0Var.f0 : null) != null) {
            fxc0.B().Y().i(this.b, b9s0Var.f0, new VideoFeedDialogParams.Discover("from_link", null, null, false, null, null, 0L, false, null, null, 1020, null));
            b9s0Var.f0 = null;
        }
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
        yw90 yw90Var = this.w;
        if (yw90Var != null) {
            yw90Var.a();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final uha P() {
        return this.x0;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.Q == VideoCatalogId.HOME) {
            Object obj = cfp0Var.b;
            if (obj instanceof kzt0) {
                kzt0 kzt0Var = (kzt0) obj;
                String str = kzt0Var.b.b;
                int i = kzt0Var.d;
                s1v s1vVar = p1s0.a;
                p1s0.b(MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.EventType.CLICK_TAB, i, str);
                return;
            }
        }
        UIBlock uIBlock = cfp0Var.a;
        if (uIBlock.d == CatalogViewType.VIDEO_CHANGE_PROFILE) {
            MultiaccAnalytics.a(MultiaccAnalytics.EventFrom.PROFILE_TAB);
            return;
        }
        if ((this.y0.r instanceof vyh0) || (uIBlock instanceof UIBlockSearchSuggestion)) {
            this.f0.getClass();
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
        } else if (this.h0 != null) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, uIBlock, cfp0Var.b, true, null, 16);
        } else if (!(uIBlock instanceof UIBlockGroupFilter)) {
            super.S(cfp0Var);
        } else {
            s1v s1vVar2 = p1s0.a;
            p1s0.a((UIBlockGroupFilter) uIBlock);
        }
    }

    @Override // xsna.n0i0
    public final void Tg() {
        VideoSearchParamsVh videoSearchParamsVh = this.B0;
        wet0 wet0Var = videoSearchParamsVh.f;
        SearchParametersBottomView searchParametersBottomView = videoSearchParamsVh.g;
        if (searchParametersBottomView == null) {
            searchParametersBottomView = null;
        }
        wet0Var.d(searchParametersBottomView.getContext());
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        if (!(this.y0.r instanceof vyh0) || this.m0) {
            this.m0 = false;
            return false;
        }
        this.f0.g();
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Activity activity;
        gas0 gas0Var;
        boolean z;
        bpn0 bpn0Var;
        Context context;
        View k5 = this.B0.k5(layoutInflater, viewGroup, null);
        vhn0 a2 = whn0.a();
        bdn bdnVar = bdn.a;
        this.H0 = zvj.a(d.a.a(a2, ie00.a.U()));
        k5.setFitsSystemWindows(n0());
        if (n0()) {
            r0j0 r0j0Var = new r0j0(1);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(k5, r0j0Var);
        }
        this.b0 = k5;
        k0().b0(this.V);
        mzp0 mzp0Var = this.v;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        Activity activity2 = this.b;
        s0(activity2.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
        u4a u4aVar = this.m;
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        b9s0 b9s0Var = catalogConfiguration instanceof b9s0 ? (b9s0) catalogConfiguration : null;
        Bundle bundle2 = this.h;
        if (b9s0Var != null) {
            b9s0Var.g0 = bundle2.getString("embedded_video_id");
            if (fxc0.B().J().e0().a) {
                b9s0Var.j0 = new s9s0(r0(), this);
                b9s0Var.D.getClass();
            }
        }
        CatalogConfiguration catalogConfiguration2 = aVar2.s;
        b9s0 b9s0Var2 = catalogConfiguration2 instanceof b9s0 ? (b9s0) catalogConfiguration2 : null;
        if (b9s0Var2 != null) {
            b9s0Var2.i0 = this.B;
        }
        if (bundle2.getBoolean("enable_sound")) {
            e eVar = e.a;
            e.f(false);
        }
        k5.post(new sd(this, 15));
        String j0 = j0(bundle2.getString("key_url"));
        if (p0()) {
            Context context2 = k5.getContext();
            gas0 gas0Var2 = this.u0;
            Activity activity3 = gas0Var2.a;
            bpn0 bpn0Var2 = gas0Var2.k;
            boolean z2 = gas0Var2.h;
            VkTopBarSearchQueryVh vkTopBarSearchQueryVh = this.i0;
            if (z2 && ((Boolean) bpn0Var2.getValue()).booleanValue()) {
                int i = dhr0.M() ? R.drawable.vk_video_kids_search_dark_28h : R.drawable.vk_video_kids_search_light_28h;
                VkTopBarSearchQueryVh.b bVar = vkTopBarSearchQueryVh.r;
                VkTopBarSearchQueryVh.a aVar3 = bVar.j;
                a.b bVar2 = aVar3.b;
                gko.b bVar3 = gko.Companion;
                Context context3 = e43.a;
                view = k5;
                vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(bVar, false, null, false, null, false, null, false, null, VkTopBarSearchQueryVh.a.a(aVar3, false, a.b.a(bVar2, new gko(i), (context3 != null ? context3 : null).getString(R.string.search), ipi.a.a, null, 116), false, null, null, false, null, 4093), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
                gas0Var = gas0Var2;
                activity = activity3;
                bpn0Var = bpn0Var2;
                z = z2;
            } else {
                view = k5;
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                VkTopBarSearchQueryVh.b bVar4 = vkTopBarSearchQueryVh.r;
                VkTopBarSearchQueryVh.a aVar4 = bVar4.j;
                a.b bVar5 = aVar4.b;
                gko.b bVar6 = gko.Companion;
                Context context4 = e43.a;
                if (context4 == null) {
                    context4 = null;
                }
                String string = context4.getString(R.string.search);
                activity = activity3;
                gas0Var = gas0Var2;
                z = z2;
                bpn0Var = bpn0Var2;
                vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(bVar4, false, null, false, null, false, null, false, null, VkTopBarSearchQueryVh.a.a(aVar4, false, a.b.a(bVar5, new gko(R.drawable.vk_icon_search_outline_28), string, null, null, 116), false, null, null, false, null, 4093), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
            }
            if (z) {
                vkTopBarSearchQueryVh.sj(activity.getString(R.string.video_catalog_header));
                int i2 = ((Boolean) bpn0Var.getValue()).booleanValue() ? R.drawable.vk_video_kids_logo_video_36h : R.drawable.vk_icon_logo_vk_video_color_28;
                VkTopBar vkTopBar = vkTopBarSearchQueryVh.l;
                if (vkTopBar != null && (context = vkTopBar.getContext()) != null) {
                    VKImageView vKImageView = new VKImageView(context, null, 6, 0);
                    vKImageView.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(44), iah0.a(32)));
                    vKImageView.setImageResource(i2);
                    vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(vkTopBarSearchQueryVh.r, false, new VkTopBar.c.e(vKImageView), false, null, false, null, false, null, null, 1019));
                }
                vkTopBarSearchQueryVh.l();
            }
            if (gas0Var.d) {
                vkTopBarSearchQueryVh.Kf(this.n0);
            } else if (gas0Var.b) {
                vkTopBarSearchQueryVh.Ml(R.drawable.vk_icon_add_outline_28, R.string.add);
                vkTopBarSearchQueryVh.Kf(this.o0);
            }
            if (((Boolean) gas0Var.i.getValue()).booleanValue()) {
                LottieAnimationView lottieAnimationView = gas0Var.n;
                if (lottieAnimationView == null) {
                    lottieAnimationView = new LottieAnimationView(context2);
                    lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    gas0Var.n = lottieAnimationView;
                    gas0Var.e.getClass();
                }
                bwt0.i0(lottieAnimationView, new ape0(gas0Var, context2));
                vkTopBarSearchQueryVh.e(lottieAnimationView);
            }
            if (!z) {
                vkTopBarSearchQueryVh.sj(activity.getString(R.string.video_catalog_header_new));
                vkTopBarSearchQueryVh.c();
                if (gas0Var.c) {
                    vkTopBarSearchQueryVh.N2();
                }
            }
        } else {
            view = k5;
        }
        this.Z.hide();
        Context context5 = layoutInflater.getContext();
        HashSet hashSet = iah0.a;
        boolean b2 = fnj.b(context5);
        VkSearchQueryVh vkSearchQueryVh = this.l0;
        if (b2) {
            vkSearchQueryVh.y8();
        }
        vkSearchQueryVh.Ml(R.drawable.vk_icon_add_outline_28, R.string.catalog_video_toolbar_action_add_description);
        vkSearchQueryVh.Kf(new nrq0(context5, 4));
        vkSearchQueryVh.hide();
        this.A0.a(true);
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            rg(new IOException());
        } else if (j0 == null || drm0.N(j0)) {
            CatalogConfiguration catalogConfiguration3 = this.P.b;
            i8(catalogConfiguration3.O(catalogConfiguration3.q()) ? alj.a : ltz.a);
        } else {
            this.m0 = true;
            o0i0.p(this.f0, j0, null, false, null, 14);
        }
        com.vk.catalog2.common.ui.mvp.holder.video.a aVar5 = this.L0;
        aVar5.getClass();
        if (aVar5.a.a && !aVar5.g) {
            aVar5.g = true;
            aVar5.c.getClass();
        }
        aVar5.a();
        this.F0 = this.f0.s();
        this.G0 = hg1.c((f) aVar2.d.b, SearchFilterVh.a.C0488a.class).subscribe(new o330(new u2k0(this, 18), 24));
        if (o0()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.vkontakte.android.COUNTERS_UPDATED");
            intentFilter.addAction("com.vkontakte.android.FRIEND_REQUESTS_CHANGED");
            anj.d(activity2, (VideoCatalogRootVh$notificationReceiver$2$1) this.s0.getValue(), intentFilter, hf8.a, 4);
        }
        anj.d(activity2, this.t0, z23.a("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID"), hf8.a, 4);
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        hpj hpjVar = this.H0;
        if (hpjVar != null) {
            zvj.c(hpjVar, null);
        }
        this.H0 = null;
        gas0 gas0Var = this.u0;
        if (((Boolean) gas0Var.i.getValue()).booleanValue()) {
            gas0Var.e.getClass();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.F0;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.G0;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.U.clear();
        com.vk.catalog2.common.ui.mvp.holder.video.a aVar = this.L0;
        aVar.getClass();
        aVar.e.a(true);
        aVar.h.a(true);
        aVar.f = false;
        if (aVar.g) {
            aVar.g = false;
            aVar.c.getClass();
        }
        ((io.reactivex.rxjava3.disposables.b) this.m.b.o.b).e();
        this.A0.L();
        boolean o0 = o0();
        Activity activity = this.b;
        if (o0) {
            enj.s(activity, (VideoCatalogRootVh$notificationReceiver$2$1) this.s0.getValue());
        }
        enj.s(activity, this.t0);
        k0().B(this.V);
        this.P.b();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Z(byte[] bArr) {
        this.a0.e(bArr);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final byte[] b0() {
        return this.a0.g();
    }

    @Override // xsna.n0i0
    public final void ca(boolean z) {
        this.B0.a(z);
    }

    @Override // xsna.n0i0
    public final String e6() {
        return this.b.getString(R.string.catalog_search_empty_list);
    }

    @Override // xsna.n0i0
    public final void f1(boolean z, boolean z2) {
        boolean z3 = false;
        if (p0()) {
            if (n0() && z) {
                z3 = true;
            }
            this.i0.g(z3, z2);
            return;
        }
        if (n0() && z) {
            z3 = true;
        }
        ModernSearchView modernSearchView = this.l0.b.k;
        if (modernSearchView != null) {
            modernSearchView.j(z3, z2);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.y0.r;
    }

    public final boolean i0(Context context, Onboarding onboarding) {
        String string = this.h.getString("key_url");
        be80 be80Var = this.y;
        if (string != null || this.Q != VideoCatalogId.HOME) {
            be80Var.getClass();
        }
        if (BuildInfo.q()) {
            be80Var.getClass();
        }
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        boolean z = bnn0Var instanceof ltz;
        com.vk.catalog2.common.ui.mvp.holder.video.a aVar = this.L0;
        com.vk.catalog2.common.ui.mvp.holder.video.b bVar = aVar.d;
        h0t0 h0t0Var = aVar.c;
        if (!z) {
            h0t0Var.getClass();
        }
        aVar.a.b.invoke();
        h0t0Var.getClass();
        aVar.a();
        SwitchCatalogVh switchCatalogVh = this.y0;
        if (bnn0Var.equals(switchCatalogVh.r)) {
            return;
        }
        CompletableFuture<s3q0> completableFuture = o9s0.a;
        if ((bnn0Var instanceof swp) || (bnn0Var instanceof vyh0)) {
            o9s0.a.complete(s3q0.a);
        }
        switchCatalogVh.i8(bnn0Var);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        bnn0 bnn0Var2;
        SwitchCatalogVh.a aVar;
        View view;
        yw90 yw90Var;
        utk0 state;
        boolean z = bnn0Var instanceof vyh0;
        VkTopBarSearchQueryVh vkTopBarSearchQueryVh = this.i0;
        VkSearchQueryVh vkSearchQueryVh = this.l0;
        if (!z) {
            if (p0()) {
                vkTopBarSearchQueryVh.k3();
                vkTopBarSearchQueryVh.Km(50L);
            } else {
                ModernSearchView modernSearchView = vkSearchQueryVh.b.k;
                if (modernSearchView != null) {
                    modernSearchView.a();
                    modernSearchView.b(50L);
                }
            }
        }
        Activity activity = this.b;
        VideoHidingToolbarVh videoHidingToolbarVh = this.A0;
        if (z) {
            videoHidingToolbarVh.d(true, true);
            videoHidingToolbarVh.c(false);
            s0(activity.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
        } else {
            videoHidingToolbarVh.c(true);
            s0(activity.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
        }
        if (!BuildInfo.s() || !(bnn0Var instanceof swp) || !(((swp) bnn0Var).a instanceof VideoPinnedSectionOfflineException)) {
            boolean z2 = bnn0Var instanceof alj;
            boolean z3 = this.J0;
            FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.d0;
            if (z3 && z2) {
                firstPinnedTabLayoutVh.show();
            } else {
                firstPinnedTabLayoutVh.hide();
            }
            if (!p0()) {
                if (z) {
                    vkSearchQueryVh.c(true);
                } else {
                    vkSearchQueryVh.hide();
                }
                VideoCatalogHeaderVh videoCatalogHeaderVh = this.v0;
                if (z2) {
                    videoCatalogHeaderVh.show();
                } else {
                    videoCatalogHeaderVh.hide();
                }
            } else if (z || z2) {
                vkTopBarSearchQueryVh.show();
            } else {
                vkTopBarSearchQueryVh.hide();
            }
        }
        boolean z4 = this.s != null;
        gas0 gas0Var = this.u0;
        if (z) {
            if (p0()) {
                gas0Var.getClass();
                vkTopBarSearchQueryVh.c();
                vkTopBarSearchQueryVh.N2();
            } else {
                vkSearchQueryVh.b(0);
                vkSearchQueryVh.a();
                vkSearchQueryVh.N2();
            }
        } else if (p0()) {
            if (gas0Var.h) {
                vkTopBarSearchQueryVh.y8();
                vkTopBarSearchQueryVh.l();
            } else {
                vkTopBarSearchQueryVh.c();
                if (gas0Var.c) {
                    vkTopBarSearchQueryVh.N2();
                } else {
                    vkTopBarSearchQueryVh.y8();
                }
            }
        } else if (z4) {
            vkSearchQueryVh.d(vkSearchQueryVh.k, true);
            vkSearchQueryVh.y8();
        } else if (!this.q) {
            vkSearchQueryVh.a();
            vkSearchQueryVh.y8();
            vkSearchQueryVh.b(iah0.a(8));
        }
        SwitchCatalogVh switchCatalogVh = this.y0;
        if (switchCatalogVh.r instanceof vyh0) {
            vkSearchQueryVh.r9();
        } else {
            vkSearchQueryVh.en();
        }
        v0();
        if (p0()) {
            boolean f = epx.f(bnn0Var, alj.a);
            ChildTopBarWrapperVh childTopBarWrapperVh = this.j0;
            if (f) {
                VkImage vkImage = childTopBarWrapperVh.f;
                if (vkImage != null) {
                    vkImage.setVisibility(((Boolean) childTopBarWrapperVh.e.getValue()).booleanValue() ? 0 : 8);
                }
                vkTopBarSearchQueryVh.Ll();
                vkTopBarSearchQueryVh.Km(0L);
                vkTopBarSearchQueryVh.Tk();
                vkTopBarSearchQueryVh.hc();
                if (gas0Var.d || gas0Var.b) {
                    vkTopBarSearchQueryVh.en();
                }
                if (((Boolean) gas0Var.i.getValue()).booleanValue()) {
                    LottieAnimationView lottieAnimationView = gas0Var.n;
                    if (lottieAnimationView != null) {
                        vkTopBarSearchQueryVh.e(lottieAnimationView);
                    }
                } else {
                    vkTopBarSearchQueryVh.xi();
                }
            } else if (epx.f(bnn0Var, vyh0.a)) {
                VkImage vkImage2 = childTopBarWrapperVh.f;
                if (vkImage2 != null) {
                    vkImage2.setVisibility(8);
                }
                vkTopBarSearchQueryVh.r9();
                vkTopBarSearchQueryVh.xi();
                vkTopBarSearchQueryVh.d();
                vkTopBarSearchQueryVh.m();
            } else if (!epx.f(bnn0Var, lhp.a) && !(bnn0Var instanceof swp) && !epx.f(bnn0Var, ltz.a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ModernSearchView modernSearchView2 = vkSearchQueryVh.b.k;
            if (modernSearchView2 != null) {
                if (!z && ((bnn0Var2 = this.C0) == null || (bnn0Var2 instanceof swp) || (bnn0Var instanceof swp))) {
                    r3 = 8;
                }
                modernSearchView2.setVisibility(r3);
            }
        }
        ViewPagerVh viewPagerVh = this.a0;
        SearchContentVh searchContentVh = this.k0;
        if (z) {
            viewPagerVh.onPause();
            searchContentVh.onResume();
        } else {
            searchContentVh.onPause();
            viewPagerVh.onResume();
        }
        wzh0 wzh0Var = this.f0;
        wzh0Var.t(bnn0Var);
        hui huiVar = wzh0Var.q;
        boolean z5 = bnn0Var instanceof alj;
        xkk0 xkk0Var = this.C;
        com.vk.catalog2.common.ui.mvp.holder.video.a aVar2 = this.L0;
        g3a g3aVar = this.P;
        if (z5) {
            this.e0.k = null;
            if (viewPagerVh.n == null) {
                g3aVar.d();
            } else {
                aVar2.c.getClass();
                if (((Boolean) this.X.getValue()).booleanValue()) {
                    if (((xkk0Var == null || (state = xkk0Var.getState()) == null) ? null : (SplashScreenState) state.getValue()) != SplashScreenState.HIDDEN) {
                        hpj hpjVar = this.H0;
                        if (hpjVar != null) {
                            myc0.h(hpjVar, null, null, new u9s0(this, null), 3);
                        }
                        if (this.S && !this.E0 && (yw90Var = this.A) != null) {
                            yw90Var.a();
                            yw90Var.stop();
                            this.E0 = true;
                        }
                    }
                }
                l0();
                if (this.S) {
                    yw90Var.a();
                    yw90Var.stop();
                    this.E0 = true;
                }
            }
        }
        this.T.a(bnn0Var instanceof swp);
        g3aVar.e();
        if (z && (aVar = switchCatalogVh.m) != null && (view = aVar.b) != null) {
            huiVar.a(view);
            s3q0 s3q0Var = s3q0.a;
        }
        if (this.C0 instanceof vyh0) {
            huiVar.h();
        }
        boolean z6 = bnn0Var instanceof ltz;
        boolean z7 = this.C0 instanceof ltz;
        aVar2.getClass();
        ttz ttzVar = aVar2.h;
        if (z6 && !z7) {
            aVar2.b();
            aVar2.c.getClass();
            if (((Boolean) aVar2.a.b.invoke()).booleanValue()) {
                ttzVar.b(TimeUnit.SECONDS.toMillis(15L));
            }
        } else if (!z6) {
            aVar2.e.a(true);
            ttzVar.a(true);
        }
        this.C0 = bnn0Var;
    }

    @Override // xsna.n0i0
    public final String j9() {
        if (p0()) {
            String i = this.i0.i();
            if (drm0.N(i)) {
                return null;
            }
            return i;
        }
        ModernSearchView modernSearchView = this.l0.b.k;
        if (modernSearchView != null) {
            return modernSearchView.getQuery();
        }
        return null;
    }

    @Override // xsna.n0i0
    public final void jn(String str, boolean z) {
        if (p0()) {
            this.i0.zf(str, z);
        } else {
            this.l0.zf(str, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b25 k0() {
        return (b25) this.E.getValue();
    }

    public final void l0() {
        Bundle bundle = this.h;
        boolean z = bundle.getBoolean("need_show_login_on_launch");
        if (z) {
            bundle.remove("need_show_login_on_launch");
        }
        boolean booleanValue = this.x.invoke().booleanValue();
        Onboarding onboarding = Onboarding.TwoStep;
        Activity activity = this.b;
        i0(activity, onboarding);
        i0(activity, Onboarding.NewUser);
        i0(activity, Onboarding.KidsModeFullscreen);
        i0(activity, Onboarding.PromoCampaign);
        boolean P = fxc0.B().J().P();
        f0s0 f0s0Var = this.z;
        if (P && f0s0Var != null) {
            f0s0Var.e(activity);
        }
        if (fxc0.B().J().d0() && f0s0Var != null) {
            f0s0Var.c(activity);
        }
        k0().getClass();
        if (z || booleanValue || f0s0Var == null) {
            return;
        }
        f0s0Var.d(activity);
    }

    public final boolean n0() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    public final boolean o0() {
        return ((Boolean) this.q0.getValue()).booleanValue();
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.A0.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        if (this.y0.r instanceof vyh0) {
            this.k0.onPause();
            this.f0.q.f();
        } else {
            this.d0.onPause();
        }
        pgn pgnVar = this.T.f;
        qcy<Object> qcyVar = aha.l[0];
        pgnVar.b(null);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ((h0a) this.F.getValue()).getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        String string;
        String str;
        SwitchCatalogVh switchCatalogVh = this.y0;
        if (switchCatalogVh.r instanceof vyh0) {
            this.k0.onResume();
        } else {
            this.d0.onResume();
        }
        if (((Boolean) this.r0.getValue()).booleanValue()) {
            this.A0.d(true, false);
        }
        u0();
        Bundle bundle = this.h;
        boolean z = bundle.getBoolean("is_system");
        boolean z2 = bundle.getBoolean("enable_sound");
        if (z && (str = this.I0) != null) {
            A(str);
        }
        if (z2) {
            e eVar = e.a;
            e.f(false);
        }
        String string2 = bundle.getString("embedded_video_id");
        g3a g3aVar = this.P;
        u4a u4aVar = this.m;
        if (string2 != null) {
            CatalogConfiguration catalogConfiguration = u4aVar.b.s;
            b9s0 b9s0Var = catalogConfiguration instanceof b9s0 ? (b9s0) catalogConfiguration : null;
            if (b9s0Var != null && !string2.equals(b9s0Var.g0)) {
                b9s0Var.g0 = string2;
                g3aVar.d();
            }
        }
        if (u4aVar.b.s.J() && (string = bundle.getString("key_url")) != null) {
            String j0 = j0(string);
            if (j0 == null || drm0.N(j0)) {
                CatalogConfiguration catalogConfiguration2 = u4aVar.b.s;
                b9s0 b9s0Var2 = catalogConfiguration2 instanceof b9s0 ? (b9s0) catalogConfiguration2 : null;
                if (b9s0Var2 != null && !string.equals(b9s0Var2.h0)) {
                    b9s0Var2.h0 = string;
                    g3aVar.d();
                }
            } else {
                o0i0.p(this.f0, j0, null, false, null, 14);
            }
        }
        bundle.remove("is_system");
        bundle.remove("enable_sound");
        bundle.remove("embedded_video_id");
        this.T.a(switchCatalogVh.r instanceof swp);
        v0();
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ((h0a) this.F.getValue()).getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean p0() {
        return ((Boolean) this.M.getValue()).booleanValue();
    }

    public final void q0(boolean z) {
        Object failure;
        ModernSearchView modernSearchView;
        String path;
        String str;
        wzh0 wzh0Var = this.f0;
        wzh0Var.q.g();
        try {
            UIBlockList uIBlockList = this.c0;
            failure = new URL(uIBlockList != null ? uIBlockList.M : null);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        URL url = (URL) failure;
        String q0 = (url == null || (path = url.getPath()) == null || (str = path.toString()) == null) ? null : drm0.q0(str, '/');
        VkSearchQueryVh vkSearchQueryVh = this.l0;
        if (q0 == null) {
            t0();
        } else {
            boolean contains = ((List) this.g0.getValue()).contains(q0);
            if (!contains) {
                t0();
            } else {
                if (!contains) {
                    throw new NoWhenBranchMatchedException();
                }
                UIBlockList uIBlockList2 = this.c0;
                String string = this.b.getString(R.string.video_search_category_hint, uIBlockList2 != null ? uIBlockList2.z : null);
                if (p0()) {
                    this.i0.P1(string);
                } else {
                    vkSearchQueryVh.P1(string);
                }
            }
        }
        UIBlockList uIBlockList3 = this.c0;
        String str2 = uIBlockList3 != null ? uIBlockList3.b : null;
        VideoSearchFiltersImpl videoSearchFiltersImpl = this.e0;
        videoSearchFiltersImpl.j = str2;
        wzh0Var.n(videoSearchFiltersImpl);
        if (p0() || (modernSearchView = vkSearchQueryVh.b.k) == null) {
            return;
        }
        modernSearchView.f();
        if (!z) {
            modernSearchView.c(0L);
            return;
        }
        ImageView imageView = modernSearchView.e;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    public final void s0(int i) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        SearchContentVh searchContentVh = this.k0;
        RecyclerPaginatedView ck = searchContentVh.b.ck();
        if (ck != null && (recyclerView2 = ck.getRecyclerView()) != null) {
            f4m.v(i, recyclerView2);
        }
        RecyclerPaginatedView ck2 = searchContentVh.c.ck();
        if (ck2 == null || (recyclerView = ck2.getRecyclerView()) == null) {
            return;
        }
        f4m.v(i, recyclerView);
    }

    public final void t0() {
        boolean p0 = p0();
        Activity activity = this.b;
        if (p0) {
            this.i0.P1(activity.getString(R.string.video_search_hint));
        } else {
            this.l0.P1(activity.getString(R.string.video_search_hint));
        }
    }

    @Override // xsna.mzt0
    public final void u(UIBlock uIBlock) {
        sba sbaVar;
        if (uIBlock instanceof UIBlockList) {
            this.c0 = (UIBlockList) uIBlock;
            v0();
            if (BuildInfo.s()) {
                ViewPagerVh viewPagerVh = this.a0;
                String str = viewPagerVh.q;
                if (str != null) {
                    UIBlockList uIBlockList = this.c0;
                    if (epx.f(uIBlockList != null ? uIBlockList.b : null, str) && (sbaVar = viewPagerVh.s) != null) {
                        SparseArray<View> sparseArray = sbaVar.s;
                        int i = sbaVar.u;
                        u4q0 u4q0Var = zik0.a;
                        View view = sparseArray.get(i);
                        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = view instanceof CatalogRecyclerPaginatedView ? (CatalogRecyclerPaginatedView) view : null;
                        if (catalogRecyclerPaginatedView != null && catalogRecyclerPaginatedView.c.getVisibility() == 0) {
                            this.D0 = this.y0.r;
                            rg(new VideoPinnedSectionOfflineException());
                            return;
                        }
                    }
                }
                bnn0 bnn0Var = this.D0;
                if (bnn0Var != null) {
                    i8(bnn0Var);
                }
                this.D0 = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void u0() {
        boolean z;
        VkTopBar.l.c cVar;
        if (o0()) {
            int h = BuildInfo.q() ? g620.y : g620.h();
            if (!p0()) {
                this.v0.Jm(h);
                return;
            }
            gas0 gas0Var = this.u0;
            VkTopBarSearchQueryVh vkTopBarSearchQueryVh = this.i0;
            if (gas0Var.d && h != gas0Var.m) {
                gas0Var.m = h;
                gj2 gj2Var = (gj2) gas0Var.l.getValue();
                if (h > 0) {
                    vkTopBarSearchQueryVh.getClass();
                    cVar = new VkTopBar.l.c(h, VkCounter.CounterAppearance.Appearance.AccentRed, null, 12);
                } else {
                    cVar = null;
                }
                VkTopBarSearchQueryVh.b bVar = vkTopBarSearchQueryVh.r;
                VkTopBarSearchQueryVh.a aVar = bVar.j;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(bVar, false, null, false, null, false, null, false, null, VkTopBarSearchQueryVh.a.a(aVar, false, null, true, new a.b(gj2Var, context.getString(R.string.video_catalog_header_accessibility_open_notifications), cVar, com.vk.core.compose.component.semantics.b.a(null, new fyi0(11), 3), 72), null, false, null, 3903), ApiInvocationException.ErrorCodes.IDS_BLOCKED));
                if (h > 0) {
                    i0q0.f(new kld0(gas0Var, 23));
                }
            }
            if (this.y0.r instanceof swp) {
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_OFFLINE_REFINEMENT_BUGS;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d()) {
                        z = true;
                        if (!(this.y0.r instanceof alj) || z) {
                        }
                        this.i0.r9();
                        return;
                    }
                }
            }
            z = false;
            if (this.y0.r instanceof alj) {
            }
        }
    }

    @Override // xsna.n0i0
    public final void ul() {
        if (p0()) {
            this.i0.Km(0L);
            return;
        }
        ModernSearchView modernSearchView = this.l0.b.k;
        if (modernSearchView != null) {
            h94 h94Var = ModernSearchView.y;
            modernSearchView.b(0L);
        }
    }

    public final void v0() {
        DisableableViewPager disableableViewPager = this.a0.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.setTouchEnabled(true);
        View view = this.z0.c;
        if (view != null) {
            f4m.j(view);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.a0.y(uiTrackingScreen);
    }

    @Override // xsna.n0i0
    public final void y6() {
        if (p0()) {
            VkTopBarSearchQueryVh vkTopBarSearchQueryVh = this.i0;
            vkTopBarSearchQueryVh.Ta();
            vkTopBarSearchQueryVh.Fb();
            return;
        }
        VkSearchQueryVh vkSearchQueryVh = this.l0;
        ModernSearchView modernSearchView = vkSearchQueryVh.b.k;
        if (modernSearchView != null) {
            modernSearchView.f();
        }
        ModernSearchView modernSearchView2 = vkSearchQueryVh.b.k;
        if (modernSearchView2 != null) {
            h94 h94Var = ModernSearchView.y;
            modernSearchView2.c(0L);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        Activity activity = this.b;
        wzh0 wzh0Var = this.f0;
        if (i == R.id.search_suggestion) {
            UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                wzh0Var.q(uIBlockSearchSuggestion, activity);
            }
        } else if (i == R.id.search_suggestion_close) {
            UIBlockSearchSuggestion uIBlockSearchSuggestion2 = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion2 != null) {
                wzh0Var.o(uIBlockSearchSuggestion2);
            }
        } else if (i == R.id.content && uIBlock != null) {
            wzh0Var.a(uIBlock, activity);
        }
        CatalogViewType catalogViewType = uIBlock != null ? uIBlock.d : null;
        if ((catalogViewType == null ? -1 : b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) == 1) {
            q3t0.a(VideoPipStateHolder.a, (VideoGrowthComponent) this.O.getValue(), uIBlock.g.b, this.b, VideoGrowthCommunitySource.SUPERAPP_BANNER);
        }
    }

    @Override // xsna.n0i0
    public final void z0(boolean z, boolean z2) {
        if (p0()) {
            return;
        }
        VkSearchQueryVh vkSearchQueryVh = this.l0;
        if (z) {
            ModernSearchView modernSearchView = vkSearchQueryVh.b.k;
            if (modernSearchView != null) {
                modernSearchView.p.c(z2);
                return;
            }
            return;
        }
        ModernSearchView modernSearchView2 = vkSearchQueryVh.b.k;
        if (modernSearchView2 != null) {
            modernSearchView2.p.a(z2);
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
