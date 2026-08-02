package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.MultiaccAnalytics;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.ShimmerVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.holders.search.FilterParameters;
import com.vk.catalog2.common.ui.holders.search.SearchContentVh;
import com.vk.catalog2.common.ui.holders.search.SearchFilterVh;
import com.vk.catalog2.common.ui.holders.video.VideoHidingToolbarVh;
import com.vk.catalog2.common.ui.holders.video.VideoOfflineFragmentVh;
import com.vk.catalog2.common.ui.holders.video.VideoSearchParamsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.search.suggester.core.SearchServiceWithSuggestCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoViewPagerVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarExpandableControllerBehaviour;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.autoplay.e;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.ui.SearchParametersBottomView;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import xsna.aas0;
import xsna.alj;
import xsna.b0u0;
import xsna.b9s0;
import xsna.bas0;
import xsna.bg00;
import xsna.bnn0;
import xsna.bpn0;
import xsna.brm0;
import xsna.bw6;
import xsna.c24;
import xsna.cas0;
import xsna.cfp0;
import xsna.d230;
import xsna.dei0;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.fai;
import xsna.fnj;
import xsna.fog0;
import xsna.fxc0;
import xsna.g13;
import xsna.g3a;
import xsna.h0a;
import xsna.h6m0;
import xsna.h94;
import xsna.has0;
import xsna.hg1;
import xsna.hui;
import xsna.ia90;
import xsna.iah0;
import xsna.ikk0;
import xsna.irc0;
import xsna.iut0;
import xsna.j5g;
import xsna.kcj0;
import xsna.lht0;
import xsna.ltz;
import xsna.mf3;
import xsna.msy;
import xsna.mzp0;
import xsna.n99;
import xsna.nda;
import xsna.o0i0;
import xsna.o5a;
import xsna.o99;
import xsna.ofc0;
import xsna.p1s0;
import xsna.q090;
import xsna.rrn0;
import xsna.rzl0;
import xsna.s1v;
import xsna.s3q0;
import xsna.swp;
import xsna.t9t0;
import xsna.tbe0;
import xsna.u4a;
import xsna.uha;
import xsna.vyh0;
import xsna.w2j0;
import xsna.wet0;
import xsna.ww50;
import xsna.wzb0;
import xsna.wzh0;
import xsna.yw90;
import xsna.yys0;
import xsna.z9s0;
import xsna.zqf0;

/* compiled from: VideoCatalogSearchRootVh.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogSearchRootVh extends CatalogRootViewHolder implements SearchServiceWithSuggestCatalogRootVh, CatalogVh, SwitchCatalogVh.b {
    public static final int S = iah0.a(40);
    public static final bpn0 T = new bpn0(new fog0(5));
    public static final bpn0 U = new bpn0(new g13(27));
    public final TopBarVh A;
    public final ViewPagerVh B;
    public View C;
    public final VideoSearchFiltersImpl D;
    public final wzh0 E;
    public SearchStatsLoggingInfo F;
    public final SearchContentVh G;
    public final VkSearchQueryVh H;
    public final Object I;
    public final VideoCatalogHeaderVh J;
    public final has0 K;
    public final SwitchCatalogVh L;
    public final VideoHidingToolbarVh M;
    public final VideoSearchParamsVh N;
    public bnn0 O;
    public io.reactivex.rxjava3.disposables.c P;
    public io.reactivex.rxjava3.disposables.c Q;
    public String R;
    public final o5a p;
    public final mzp0 q;
    public final yw90 r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final bpn0 v;
    public final g3a w;
    public final boolean x;
    public final Object y;
    public final Object z;

    /* compiled from: VideoCatalogSearchRootVh.kt */
    public static final class a {
        public static d230 a() {
            return new d230(21);
        }
    }

    /* compiled from: VideoCatalogSearchRootVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterParameters.values().length];
            try {
                iArr[FilterParameters.CATEGORY_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterParameters.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoCatalogSearchRootVh() {
        throw null;
    }

    public VideoCatalogSearchRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, boolean z, yys0 yys0Var, t9t0 t9t0Var, mzp0 mzp0Var, yw90 yw90Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        TopBarVh toolbarVh;
        ProgressVh shimmerVh;
        boolean z2;
        this.p = o5aVar;
        this.q = mzp0Var;
        this.r = yw90Var;
        int i = 13;
        h6m0 h6m0Var = new h6m0(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.s = msy.a(lazyThreadSafetyMode, h6m0Var);
        this.t = msy.a(lazyThreadSafetyMode, new irc0(this, 26));
        this.u = msy.a(lazyThreadSafetyMode, new wzb0(this, fragmentActivity));
        bpn0 bpn0Var = new bpn0(new dei0(this, 23));
        this.v = bpn0Var;
        u4a u4aVar = this.m;
        this.w = u4aVar.b.s.S(u4aVar, null);
        fai faiVar = new fai();
        int i2 = 0;
        boolean z3 = this.m.b.c && fxc0.B().J().x0();
        this.x = z3;
        int i3 = 14;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new ia90(i3));
        this.y = a2;
        int i4 = 22;
        this.z = msy.a(lazyThreadSafetyMode, new ofc0(fragmentActivity, i4));
        if (((Boolean) a2.getValue()).booleanValue()) {
            u4a.a aVar = this.m.b;
            toolbarVh = new ToolbarRedesignVh(aVar.b, aVar.e, null, i0(), z, null, null, null, null, null, null, 8388580);
        } else {
            u4a.a aVar2 = this.m.b;
            toolbarVh = new ToolbarVh(aVar2.b, aVar2.e, null, i0(), z, null, null, null, null, null, null, 4194276);
        }
        this.A = toolbarVh;
        if (t9t0Var == null || (shimmerVh = t9t0Var.create()) == null) {
            z2 = z;
            shimmerVh = new ShimmerVh(z3 ? R.layout.catalog_video_shimmer_tablet_redesign : R.layout.catalog_video_shimmer, 4, z2, e43.l(Integer.valueOf(R.id.toolbar_buttons), Integer.valueOf(R.id.content)));
        } else {
            z2 = z;
        }
        ProgressVh progressVh = shimmerVh;
        ViewPagerVh videoViewPagerVh = this.m.b.s.J() ? new VideoViewPagerVh(this.m, N(), new bas0(toolbarVh), null, faiVar, 668) : new ViewPagerVh(this.m, false, null, false, null, new bas0(toolbarVh), null, N(), faiVar, null, 4846);
        this.B = videoViewPagerVh;
        VideoSearchFiltersImpl videoSearchFiltersImpl = new VideoSearchFiltersImpl();
        this.D = videoSearchFiltersImpl;
        wzh0 wzh0Var = new wzh0(this, this.m, videoSearchFiltersImpl, new rrn0(this, i), fragmentActivity);
        this.E = wzh0Var;
        SearchContentVh c = wzh0Var.c();
        this.G = c;
        VkSearchQueryVh vkSearchQueryVh = new VkSearchQueryVh(new SearchQueryVh(R.string.video_search_hint, new cas0(0, this.m.b.b, nda.class, "onBackPressed", "onBackPressed(Z)Z", 0), new kcj0(this, i3), new q090(0, wzh0Var, wzh0.class, "onParamsIconClicked", "onParamsIconClicked()V", 0, 2), wzh0Var.o, 32), null, null, null, null, 510);
        this.H = vkSearchQueryVh;
        this.I = msy.a(lazyThreadSafetyMode, new zqf0(8));
        u4a u4aVar2 = this.m;
        w2j0 w2j0Var = new w2j0(this, fragmentActivity);
        VideoCatalogHeaderVh videoCatalogHeaderDebrandedVh = BuildInfo.s() ? new VideoCatalogHeaderDebrandedVh(null, null, null, w2j0Var, z2, new c24(i2), null, null, null) : new VideoCatalogHeaderBrandedVh(u4aVar2, null, null, null, null, w2j0Var);
        this.J = videoCatalogHeaderDebrandedVh;
        ErrorStateVh videoOfflineFragmentVh = (yys0Var == null || (videoOfflineFragmentVh = yys0Var.create()) == null) ? new VideoOfflineFragmentVh(this, new ikk0(this, i)) : videoOfflineFragmentVh;
        this.K = new has0();
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(videoViewPagerVh, c, videoOfflineFragmentVh, progressVh, this, R.layout.catalog_root_vh_layout_no_behaviour, this, null, ((Boolean) T.getValue()).booleanValue(), ((Boolean) U.getValue()).booleanValue(), null, 1152);
        this.L = switchCatalogVh;
        VideoHidingToolbarVh videoHidingToolbarVh = new VideoHidingToolbarVh(this.m.b.e, e43.l(videoCatalogHeaderDebrandedVh, vkSearchQueryVh, toolbarVh), switchCatalogVh, new AppBarExpandableControllerBehaviour(), null);
        this.M = videoHidingToolbarVh;
        this.N = new VideoSearchParamsVh(videoHidingToolbarVh, new tbe0(this, i4), new n99(1, wzh0Var, wzh0.class, "onFilterUpdate", "onFilterUpdate(Z)V", 0, 12), ((Boolean) bpn0Var.getValue()).booleanValue(), new o99(1, wzh0Var, wzh0.class, "reloadWithNewSearchParams", "reloadWithNewSearchParams(Lcom/vk/search/params/api/VideoSearchFilters;)V", 0, 15), new bw6(1, wzh0Var, wzh0.class, "onFilterChangedByUser", "onFilterChangedByUser(Z)V", 0, 13), videoSearchFiltersImpl);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.L.A(str);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder, xsna.gha
    public final void A2(String str) {
        i8(alj.a);
        Object obj = (ww50) this.z.getValue();
        bg00 bg00Var = obj instanceof bg00 ? (bg00) obj : null;
        if (bg00Var != null) {
            bg00Var.a();
        }
    }

    @Override // xsna.n0i0
    public final boolean F0() {
        ModernSearchView modernSearchView = this.H.b.k;
        if (modernSearchView != null) {
            return modernSearchView.getFocused();
        }
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.q;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        boolean z = uIBlock instanceof UIBlockCatalog;
        UIBlockCatalog uIBlockCatalog = z ? (UIBlockCatalog) uIBlock : null;
        this.R = uIBlockCatalog != null ? uIBlockCatalog.D : null;
        VideoHidingToolbarVh videoHidingToolbarVh = this.M;
        videoHidingToolbarVh.N6(uIBlock);
        UIBlockCatalog uIBlockCatalog2 = z ? (UIBlockCatalog) uIBlock : null;
        u4a u4aVar = this.m;
        if (uIBlockCatalog2 != null) {
            ArrayList<UIBlock> arrayList = uIBlockCatalog2.A;
            UIBlock uIBlock2 = (UIBlock) j5g.a0(arrayList);
            int size = arrayList.size();
            TopBarVh topBarVh = this.A;
            VideoCatalogHeaderVh videoCatalogHeaderVh = this.J;
            VkSearchQueryVh vkSearchQueryVh = this.H;
            if (size != 1 || uIBlock2 == null) {
                this.F = null;
                SwitchCatalogVh switchCatalogVh = this.L;
                if (switchCatalogVh.r instanceof vyh0) {
                    vkSearchQueryVh.c(false);
                    videoCatalogHeaderVh.hide();
                } else {
                    vkSearchQueryVh.hide();
                    videoCatalogHeaderVh.show();
                }
                if (!(switchCatalogVh.r instanceof vyh0)) {
                    SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
                    searchStatInfoProvider.getClass();
                    searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Disabled;
                }
                topBarVh.hide();
            } else {
                SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) this.h.getParcelable("search_stats_logging_info");
                this.F = searchStatsLoggingInfo;
                if (searchStatsLoggingInfo != null) {
                    SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
                    searchStatInfoProvider2.getClass();
                    searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Enabled;
                    u4aVar.b.m.a = true;
                }
                vkSearchQueryVh.hide();
                videoCatalogHeaderVh.hide();
                topBarVh.N6(uIBlock2);
                topBarVh.show();
                UIBlockList uIBlockList = uIBlock2 instanceof UIBlockList ? (UIBlockList) uIBlock2 : null;
                UIBlockActionSearchMode uIBlockActionSearchMode = uIBlockList != null ? uIBlockList.I : null;
                if (uIBlockActionSearchMode != null && epx.f(uIBlockActionSearchMode.z, "owner_videos")) {
                    videoHidingToolbarVh.a(false);
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
        yw90 yw90Var = this.r;
        if (yw90Var != null) {
            yw90Var.a();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final uha P() {
        return this.K;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        UIBlock uIBlock = cfp0Var.a;
        if (uIBlock.d == CatalogViewType.VIDEO_CHANGE_PROFILE) {
            MultiaccAnalytics.a(MultiaccAnalytics.EventFrom.PROFILE_TAB);
            return;
        }
        if (this.L.r instanceof vyh0) {
            this.E.getClass();
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
        } else if (this.F != null) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, uIBlock, cfp0Var.b, true, null, 16);
        } else if (!(uIBlock instanceof UIBlockGroupFilter)) {
            super.S(cfp0Var);
        } else {
            s1v s1vVar = p1s0.a;
            p1s0.a((UIBlockGroupFilter) uIBlock);
        }
    }

    @Override // xsna.n0i0
    public final void Tg() {
        VideoSearchParamsVh videoSearchParamsVh = this.N;
        wet0 wet0Var = videoSearchParamsVh.f;
        SearchParametersBottomView searchParametersBottomView = videoSearchParamsVh.g;
        if (searchParametersBottomView == null) {
            searchParametersBottomView = null;
        }
        wet0Var.d(searchParametersBottomView.getContext());
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.N.k5(layoutInflater, viewGroup, null);
        bpn0 bpn0Var = this.v;
        k5.setFitsSystemWindows(((Boolean) bpn0Var.getValue()).booleanValue());
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            z9s0 z9s0Var = new z9s0();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(k5, z9s0Var);
        }
        this.C = k5;
        mzp0 mzp0Var = this.q;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        j0(this.b.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
        u4a u4aVar = this.m;
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        b9s0 b9s0Var = catalogConfiguration instanceof b9s0 ? (b9s0) catalogConfiguration : null;
        Bundle bundle2 = this.h;
        if (b9s0Var != null) {
            b9s0Var.g0 = bundle2.getString("embedded_video_id");
            if (fxc0.B().J().e0().a) {
                b9s0Var.j0 = new lht0(layoutInflater.getContext());
                b9s0Var.D.getClass();
            }
        }
        boolean z = bundle2.getBoolean("enable_sound");
        int i = 0;
        if (z) {
            e eVar = e.a;
            e.f(false);
        }
        k5.post(new mf3(this, 13));
        this.A.hide();
        Context context = layoutInflater.getContext();
        HashSet hashSet = iah0.a;
        boolean b2 = fnj.b(context);
        VkSearchQueryVh vkSearchQueryVh = this.H;
        if (b2) {
            vkSearchQueryVh.y8();
        }
        vkSearchQueryVh.hide();
        this.M.a(true);
        wzh0 wzh0Var = this.E;
        this.P = wzh0Var.s();
        this.Q = hg1.c((f) u4aVar.b.d.b, SearchFilterVh.a.C0488a.class).subscribe(new aas0(new rzl0(this, 16), i));
        i8(ltz.a);
        wzh0Var.q.g();
        wzh0Var.n(this.D);
        ModernSearchView modernSearchView = vkSearchQueryVh.b.k;
        if (modernSearchView != null) {
            modernSearchView.f();
            modernSearchView.c(0L);
        }
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        io.reactivex.rxjava3.disposables.c cVar = this.P;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.Q;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        ((io.reactivex.rxjava3.disposables.b) this.m.b.o.b).e();
        this.M.L();
        this.w.b();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Z(byte[] bArr) {
        this.B.e(bArr);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final byte[] b0() {
        return this.B.g();
    }

    @Override // xsna.n0i0
    public final void ca(boolean z) {
        this.N.a(z);
    }

    @Override // xsna.n0i0
    public final String e6() {
        return this.b.getString(R.string.catalog_search_empty_list);
    }

    @Override // xsna.n0i0
    public final void f1(boolean z, boolean z2) {
        boolean z3 = ((Boolean) this.v.getValue()).booleanValue() && z;
        ModernSearchView modernSearchView = this.H.b.k;
        if (modernSearchView != null) {
            modernSearchView.j(z3, z2);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.L.r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int i0() {
        ?? r0 = this.y;
        boolean booleanValue = ((Boolean) r0.getValue()).booleanValue();
        boolean z = this.x;
        return (booleanValue && z) ? R.layout.catalog_toolbar_redesign_tablet : ((Boolean) r0.getValue()).booleanValue() ? R.layout.catalog_toolbar_redesign : z ? R.layout.catalog_toolbar_tablet : R.layout.catalog_toolbar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        if (bnn0Var.equals(alj.a)) {
            this.p.b.finish();
            return;
        }
        SwitchCatalogVh switchCatalogVh = this.L;
        if (bnn0Var.equals(switchCatalogVh.r)) {
            return;
        }
        switchCatalogVh.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        SwitchCatalogVh.a aVar;
        View view;
        ModernSearchView modernSearchView;
        boolean z = bnn0Var instanceof vyh0;
        VkSearchQueryVh vkSearchQueryVh = this.H;
        if (!z && (modernSearchView = vkSearchQueryVh.b.k) != null) {
            modernSearchView.a();
            modernSearchView.b(50L);
        }
        Activity activity = this.b;
        VideoHidingToolbarVh videoHidingToolbarVh = this.M;
        if (z) {
            videoHidingToolbarVh.d(true, true);
            videoHidingToolbarVh.c(false);
            j0(activity.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
        } else {
            videoHidingToolbarVh.c(true);
            j0(activity.getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
        }
        if (z) {
            vkSearchQueryVh.c(true);
        } else {
            vkSearchQueryVh.hide();
        }
        boolean z2 = bnn0Var instanceof alj;
        VideoCatalogHeaderVh videoCatalogHeaderVh = this.J;
        if (z2) {
            videoCatalogHeaderVh.show();
        } else {
            videoCatalogHeaderVh.hide();
        }
        vkSearchQueryVh.b(0);
        vkSearchQueryVh.a();
        vkSearchQueryVh.N2();
        SwitchCatalogVh switchCatalogVh = this.L;
        if (switchCatalogVh.r instanceof vyh0) {
            vkSearchQueryVh.r9();
        } else {
            vkSearchQueryVh.en();
        }
        ModernSearchView modernSearchView2 = vkSearchQueryVh.b.k;
        if (modernSearchView2 != null) {
            bnn0 bnn0Var2 = this.O;
            modernSearchView2.setVisibility((bnn0Var2 == null || (bnn0Var2 instanceof swp) || (bnn0Var instanceof swp)) ? 8 : 0);
        }
        SearchContentVh searchContentVh = this.G;
        ViewPagerVh viewPagerVh = this.B;
        if (z) {
            viewPagerVh.onPause();
            searchContentVh.onResume();
        } else {
            searchContentVh.onPause();
            viewPagerVh.onResume();
        }
        wzh0 wzh0Var = this.E;
        wzh0Var.t(bnn0Var);
        hui huiVar = wzh0Var.q;
        this.w.e();
        if (z && (aVar = switchCatalogVh.m) != null && (view = aVar.b) != null) {
            huiVar.a(view);
            s3q0 s3q0Var = s3q0.a;
        }
        if (this.O instanceof vyh0) {
            huiVar.h();
        }
        this.O = bnn0Var;
    }

    public final void j0(int i) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        SearchContentVh searchContentVh = this.G;
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

    @Override // xsna.n0i0
    public final String j9() {
        ModernSearchView modernSearchView = this.H.b.k;
        if (modernSearchView != null) {
            return modernSearchView.getQuery();
        }
        return null;
    }

    @Override // xsna.n0i0
    public final void jn(String str, boolean z) {
        this.H.zf(str, z);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.M.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        if (this.L.r instanceof vyh0) {
            this.G.onPause();
            this.E.q.f();
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ((h0a) this.u.getValue()).getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        String string;
        Object failure;
        String str;
        if (this.L.r instanceof vyh0) {
            this.G.onResume();
        }
        if (((Boolean) this.I.getValue()).booleanValue()) {
            this.M.d(true, false);
        }
        Bundle bundle = this.h;
        boolean z = bundle.getBoolean("is_system");
        boolean z2 = bundle.getBoolean("enable_sound");
        if (z && (str = this.R) != null) {
            A(str);
        }
        if (z2) {
            e eVar = e.a;
            e.f(false);
        }
        String string2 = bundle.getString("embedded_video_id");
        g3a g3aVar = this.w;
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
            try {
                failure = Uri.decode(Uri.parse(drm0.E(string, '#') ? brm0.y(string, "#", Uri.encode("#")) : string).getQueryParameter(CampaignEx.JSON_KEY_AD_Q));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            String str2 = (String) failure;
            if (str2 == null || drm0.N(str2)) {
                CatalogConfiguration catalogConfiguration2 = u4aVar.b.s;
                b9s0 b9s0Var2 = catalogConfiguration2 instanceof b9s0 ? (b9s0) catalogConfiguration2 : null;
                if (b9s0Var2 != null && !string.equals(b9s0Var2.h0)) {
                    b9s0Var2.h0 = string;
                    g3aVar.d();
                }
            } else {
                o0i0.p(this.E, str2, null, false, null, 14);
            }
        }
        bundle.remove("is_system");
        bundle.remove("enable_sound");
        bundle.remove("embedded_video_id");
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ((h0a) this.u.getValue()).getClass();
        }
    }

    @Override // xsna.n0i0
    public final void ul() {
        ModernSearchView modernSearchView = this.H.b.k;
        if (modernSearchView != null) {
            h94 h94Var = ModernSearchView.y;
            modernSearchView.b(0L);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.B.y(uiTrackingScreen);
    }

    @Override // xsna.n0i0
    public final void y6() {
        VkSearchQueryVh vkSearchQueryVh = this.H;
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

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        UIBlockSearchSuggestion uIBlockSearchSuggestion;
        Activity activity = this.b;
        wzh0 wzh0Var = this.E;
        if (i == R.id.search_suggestion) {
            uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                wzh0Var.q(uIBlockSearchSuggestion, activity);
                return;
            }
            return;
        }
        if (i == R.id.search_suggestion_close) {
            uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                wzh0Var.o(uIBlockSearchSuggestion);
                return;
            }
            return;
        }
        if (i != R.id.content || uIBlock == null) {
            return;
        }
        wzh0Var.a(uIBlock, activity);
    }

    @Override // xsna.n0i0
    public final void z0(boolean z, boolean z2) {
        VkSearchQueryVh vkSearchQueryVh = this.H;
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
