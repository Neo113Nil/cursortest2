package com.vk.catalog2.common.ui.mvp.holder.group;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.communities.CatalogGetSearchGroupsRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionResetSearchFilter;
import com.vk.catalog2.common.ui.holders.ErrorStateVkUiVh;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.ProgressVkUiVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.FiltersWithSearchResultVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.TabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesTopBarSearchState;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vk.lists.c;
import com.vk.movika.sdk.base.ui.g0;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.SearchLocationPermissionsController;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.e0;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.g;
import io.reactivex.rxjava3.subjects.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.af0;
import xsna.alj;
import xsna.anj;
import xsna.aog;
import xsna.arf;
import xsna.b25;
import xsna.bn7;
import xsna.bnn0;
import xsna.bog;
import xsna.bpn0;
import xsna.c7;
import xsna.cfp0;
import xsna.cog;
import xsna.cqf;
import xsna.drm0;
import xsna.e43;
import xsna.eg50;
import xsna.enj;
import xsna.epx;
import xsna.eru0;
import xsna.f5z;
import xsna.fha;
import xsna.fpf0;
import xsna.g3a;
import xsna.g620;
import xsna.gf0;
import xsna.gzs;
import xsna.hf8;
import xsna.k14;
import xsna.k7m;
import xsna.kea;
import xsna.l1q0;
import xsna.l50;
import xsna.ltz;
import xsna.lwf0;
import xsna.m7m;
import xsna.mag;
import xsna.msy;
import xsna.mzp0;
import xsna.n0q0;
import xsna.nda;
import xsna.nk;
import xsna.no;
import xsna.o5a;
import xsna.onh0;
import xsna.oo;
import xsna.p41;
import xsna.px0;
import xsna.q3a;
import xsna.qe3;
import xsna.qyh0;
import xsna.rda;
import xsna.rsg0;
import xsna.swp;
import xsna.sx0;
import xsna.t61;
import xsna.t8a;
import xsna.tb4;
import xsna.tp0;
import xsna.tyh0;
import xsna.u40;
import xsna.u4a;
import xsna.ux3;
import xsna.v6j;
import xsna.vd7;
import xsna.vyh0;
import xsna.w40;
import xsna.wd8;
import xsna.wng;
import xsna.xng;
import xsna.xxf0;
import xsna.yfb;
import xsna.ysg0;
import xsna.z23;
import xsna.zak0;
import xsna.zhf0;
import xsna.zjq;
import xsna.zng;
import xsna.zx0;

/* compiled from: CommunitiesCatalogRootVh.kt */
/* loaded from: classes16.dex */
public class CommunitiesCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, SwitchCatalogVh.b, CatalogStatesViewHolder, n0q0, rda {
    public final boolean A;
    public final CatalogGetSearchGroupsRequestFactory B;
    public final VkGroupsSearchParams C;
    public String D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final bpn0 H;
    public final k14 I;
    public c J;
    public final g K;
    public final fha L;
    public final Object M;
    public final Object N;
    public final eg50 O;
    public final boolean P;
    public final CommunitiesSearchTopBarVh Q;
    public final SearchResultsImplVh R;
    public final FiltersWithSearchResultVh S;
    public final SwitchCatalogVh T;
    public HidingToolbarVh U;
    public final qyh0 V;
    public final b W;
    public final a X;
    public boolean Y;
    public final SearchLocationPermissionsController Z;
    public final Object a0;
    public final Object b0;
    public final b25 p;
    public final boolean q;
    public final wng r;
    public final e0 s;
    public final FunctionReferenceImpl t;
    public final xng u;
    public final mzp0 v;
    public final ViewPagerVh w;
    public final TabLayoutVh x;
    public final g3a y;
    public final Object z;

    /* compiled from: CommunitiesCatalogRootVh.kt */
    public static final class a extends BroadcastReceiver {
        public final g3a a;
        public int b = g620.l;

        public a(g3a g3aVar) {
            this.a = g3aVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null || action.hashCode() != -1414915502 || !action.equals("com.vkontakte.android.COUNTERS_UPDATED") || this.b == g620.l) {
                return;
            }
            this.b = g620.l;
            this.a.d();
        }
    }

    public CommunitiesCatalogRootVh() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommunitiesCatalogRootVh(Bundle bundle, Activity activity, CommunitiesCatalogFragment communitiesCatalogFragment, o5a o5aVar, b25 b25Var, boolean z, wng wngVar, e0 e0Var, gzs gzsVar, xng xngVar, mzp0 mzp0Var, int i) {
        super(bundle, (Class) null, activity, (nda) o5aVar, false, (f5z) null, 112);
        CatalogGetSearchGroupsRequestFactory catalogGetSearchGroupsRequestFactory;
        kea keaVar;
        u4a u4aVar;
        FiltersWithSearchResultVh filtersWithSearchResultVh;
        FiltersWithSearchResultVh filtersWithSearchResultVh2 = null;
        mzp0 mzp0Var2 = (i & 2048) != 0 ? null : mzp0Var;
        this.p = b25Var;
        this.q = z;
        this.r = wngVar;
        this.s = e0Var;
        this.t = (FunctionReferenceImpl) gzsVar;
        this.u = xngVar;
        this.v = mzp0Var2;
        SearchFeatures searchFeatures = SearchFeatures.GLOBAL_SEARCH_GROUPS_SUGGESTER;
        searchFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean a2 = bVar.a(searchFeatures);
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, null, null, null, N(), null, null, 7166);
        this.w = viewPagerVh;
        this.x = new TabLayoutVh(viewPagerVh, R.layout.catalog_tab_layout, null, false, this.m.b.r, 988);
        u4a u4aVar2 = this.m;
        g3a S = u4aVar2.b.s.S(u4aVar2, null);
        this.y = S;
        af0 af0Var = new af0(9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z = msy.a(lazyThreadSafetyMode, af0Var);
        this.A = this.h.getBoolean("use_filters", true);
        CatalogGetSearchGroupsRequestFactory catalogGetSearchGroupsRequestFactory2 = new CatalogGetSearchGroupsRequestFactory(this.m.b.s.N(), epx.f(this.m.b.s.q(), UserId.d) ? CatalogGetSearchGroupsRequestFactory.SearchGroupsEntrypoint.SearchInService : CatalogGetSearchGroupsRequestFactory.SearchGroupsEntrypoint.SearchFriendGroups, this.m.b.s.q(), null, a2, 8);
        this.B = catalogGetSearchGroupsRequestFactory2;
        this.C = new VkGroupsSearchParams();
        this.D = "";
        this.E = msy.a(lazyThreadSafetyMode, new mag(this, 2));
        this.F = msy.a(lazyThreadSafetyMode, new sx0(this, 21));
        this.G = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(this, 23));
        this.H = new bpn0(new t61(16));
        this.I = new k14(this, activity, communitiesCatalogFragment, 3);
        this.K = new g();
        u4a.a aVar = this.m.b;
        this.L = new fha(aVar.d, aVar.e, new aog(0, ((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class)), StoryViewerComponent.class, "storiesRouter", "getStoriesRouter()Lcom/vk/story/viewer/api/StoryViewerRouter;", 0), new bog(((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class)), StoriesComponent.class, "storiesSeenController", "getStoriesSeenController()Lcom/vk/story/api/domain/repository/StoriesSeenController;", 0));
        this.M = msy.a(lazyThreadSafetyMode, new g0(15));
        this.N = msy.a(lazyThreadSafetyMode, new no(this, 29));
        ErrorStateVkUiVh errorStateVkUiVh = new ErrorStateVkUiVh(this, new oo(this, 26));
        eg50 eg50Var = new eg50();
        this.O = eg50Var;
        ComFeatures comFeatures = ComFeatures.COM_GROUPS_SEARCH_FILTERS;
        comFeatures.getClass();
        boolean a3 = bVar.a(comFeatures);
        this.P = a3;
        this.Q = new CommunitiesSearchTopBarVh(new wd8(1, this, CommunitiesCatalogRootVh.class, "applyTopBarAction", "applyTopBarAction(Lcom/vk/catalog2/common/ui/mvp/holder/group/topbar/CommunitiesTopBarAction;)V", 0, 6), a3);
        u4a u4aVar3 = this.m;
        u4a.a aVar2 = u4aVar3.b;
        u4a a4 = u4a.a(u4aVar3, u4a.a.a(aVar2, null, null, null, null, null, new tyh0(aVar2.s), null, null, null, eg50Var, new onh0(), -524289, 1048551));
        u4a.a aVar3 = a4.b;
        CatalogConfiguration catalogConfiguration = aVar3.s;
        vd7 vd7Var = new vd7(aVar3.e);
        if (a3) {
            catalogGetSearchGroupsRequestFactory = catalogGetSearchGroupsRequestFactory2;
            u4aVar = a4;
            keaVar = new kea(catalogGetSearchGroupsRequestFactory, catalogConfiguration.K(a4), u4aVar, vd7Var, false, null, null, false, null, null, null, null, null, false, new bn7(this, 4), 65472);
        } else {
            catalogGetSearchGroupsRequestFactory = catalogGetSearchGroupsRequestFactory2;
            u4aVar = a4;
            keaVar = new kea(catalogGetSearchGroupsRequestFactory, catalogConfiguration.K(a4), u4aVar, vd7Var, false, null, null, false, null, null, null, null, null, false, null, 131008);
        }
        kea keaVar2 = keaVar;
        c7 c7Var = new c7(this, 19);
        c.h hVar = new c.h((c.m) keaVar2);
        hVar.o = c7Var;
        SearchResultsImplVh searchResultsImplVh = new SearchResultsImplVh(catalogGetSearchGroupsRequestFactory, keaVar2, new VerticalListVh(catalogConfiguration, hVar, keaVar2, u4aVar, N(), false, R.layout.catalog_list_vertical_communities_vkui, null, 864), null, null, null, null, new SearchResultsVh.a(false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), a3 ? new cog(2, this, CommunitiesCatalogRootVh.class, "applyFilter", "applyFilter(Lcom/vk/catalog2/common/dto/ui/UIBlockSearchQuickFilter;Lkotlin/jvm/functions/Function1;)V", 0, 0) : null, 120);
        this.R = searchResultsImplVh;
        if (a3) {
            filtersWithSearchResultVh2 = new FiltersWithSearchResultVh(searchResultsImplVh, new bpn0(new qe3(14)), new u40(this, 25), new cqf(this, 5), false);
            filtersWithSearchResultVh = searchResultsImplVh;
        } else {
            filtersWithSearchResultVh = searchResultsImplVh;
        }
        this.S = filtersWithSearchResultVh2;
        this.T = new SwitchCatalogVh(viewPagerVh, filtersWithSearchResultVh2 != null ? filtersWithSearchResultVh2 : filtersWithSearchResultVh, errorStateVkUiVh, new ProgressVkUiVh(), this, 0, null, null, false, false, null, 2016);
        this.V = new qyh0();
        this.W = new b();
        this.X = new a(S);
        this.Z = new SearchLocationPermissionsController(activity, catalogGetSearchGroupsRequestFactory);
        this.a0 = msy.a(lazyThreadSafetyMode, new w40(this, 23));
        this.b0 = msy.a(lazyThreadSafetyMode, new px0(this, 24));
    }

    public static final int i0(CommunitiesCatalogRootVh communitiesCatalogRootVh, UIBlock uIBlock) {
        boolean z = uIBlock instanceof UIBlockSearchQuickFilter;
        boolean z2 = false;
        if (z && epx.f(((UIBlockSearchQuickFilter) uIBlock).A.d, "sort")) {
            return 0;
        }
        if (uIBlock instanceof UIBlockActionOpenSearchFilter) {
            return 1;
        }
        if (z) {
            SearchQuickFilterItem searchQuickFilterItem = ((UIBlockSearchQuickFilter) uIBlock).A;
            if (searchQuickFilterItem.n.isEmpty()) {
                z2 = searchQuickFilterItem.h;
            } else {
                List<SearchQuickInnerFilterItem> list = searchQuickFilterItem.n;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((SearchQuickInnerFilterItem) it.next()).g) {
                            z2 = true;
                            break;
                        }
                    }
                }
            }
            if (z2) {
                return 2;
            }
        }
        if (z) {
            return 3;
        }
        return uIBlock instanceof UIBlockActionResetSearchFilter ? 4 : 5;
    }

    public static void n0(CommunitiesCatalogRootVh communitiesCatalogRootVh, String str, boolean z, SearchInputMethod searchInputMethod, String str2, int i) {
        boolean z2 = false;
        boolean z3 = (i & 2) == 0;
        boolean z4 = (i & 4) != 0 ? false : z;
        String str3 = (i & 16) != 0 ? null : str2;
        SwitchCatalogVh switchCatalogVh = communitiesCatalogRootVh.T;
        bnn0 bnn0Var = switchCatalogVh.s;
        bnn0 bnn0Var2 = vyh0.a;
        boolean z5 = epx.f(bnn0Var, bnn0Var2) && drm0.N(str) && ((Boolean) communitiesCatalogRootVh.r.invoke()).booleanValue();
        if (drm0.N(str)) {
            bnn0Var2 = alj.a;
        }
        if (z5) {
            if (drm0.N(str)) {
                communitiesCatalogRootVh.l0();
            }
        } else if (!epx.f(bnn0Var2, communitiesCatalogRootVh.T.s)) {
            communitiesCatalogRootVh.i8(bnn0Var2);
        }
        boolean z6 = communitiesCatalogRootVh.A;
        boolean z7 = z6 && !drm0.N(str);
        if (z6 && !drm0.N(communitiesCatalogRootVh.D)) {
            z2 = true;
        }
        if (z7 != z2) {
            ((zak0) communitiesCatalogRootVh.Q.i).setValue(Boolean.valueOf(true ^ communitiesCatalogRootVh.C.I()));
        }
        if (!(switchCatalogVh.r instanceof vyh0)) {
            communitiesCatalogRootVh.D = str;
            return;
        }
        SearchResultsImplVh searchResultsImplVh = communitiesCatalogRootVh.R;
        searchResultsImplVh.b.f = str3;
        SearchResultsVh.cb(searchResultsImplVh, str, null, communitiesCatalogRootVh.C, z3, searchInputMethod, z4, 2);
        communitiesCatalogRootVh.D = str;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.w.A(str);
    }

    public final void A0() {
        String str = this.p.o().c;
        CommunitiesSearchTopBarVh communitiesSearchTopBarVh = this.Q;
        ((zak0) communitiesSearchTopBarVh.l).setValue(str);
        ((zak0) communitiesSearchTopBarVh.k).setValue((Boolean) this.s.invoke());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.v;
        if (mzp0Var != null) {
            UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
            mzp0Var.c(uIBlockCatalog != null && uIBlockCatalog.E);
        }
        UIBlockCatalog uIBlockCatalog2 = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
        if (uIBlockCatalog2 == null) {
            return;
        }
        this.Y = uIBlockCatalog2.A.size() == 1;
        HidingToolbarVh hidingToolbarVh = this.U;
        if (hidingToolbarVh == null) {
            hidingToolbarVh = null;
        }
        hidingToolbarVh.N6(uIBlock);
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (epx.f(this.T.r, vyh0.a)) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        anj.d(this.b, this.X, z23.a("com.vkontakte.android.COUNTERS_UPDATED"), hf8.a, 4);
        this.L.a();
        if (((Boolean) this.M.getValue()).booleanValue()) {
            ((t8a) this.N.getValue()).a();
        }
        q3a q3aVar = this.m.b.e;
        CommunitiesSearchTopBarVh communitiesSearchTopBarVh = this.Q;
        HidingToolbarVh hidingToolbarVh = new HidingToolbarVh(q3aVar, e43.l(communitiesSearchTopBarVh, this.x), this.T, null);
        this.U = hidingToolbarVh;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, null);
        HidingToolbarVh hidingToolbarVh2 = this.U;
        (hidingToolbarVh2 == null ? null : hidingToolbarVh2).j = false;
        (hidingToolbarVh2 != null ? hidingToolbarVh2 : null).a(true);
        k5.post(new ux3(this, 2));
        if (((Boolean) this.r.invoke()).booleanValue()) {
            A0();
        }
        i8(ltz.a);
        ((zak0) communitiesSearchTopBarVh.j).setValue(Boolean.valueOf(this.q));
        return k5;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        enj.s(this.b, this.X);
        HidingToolbarVh hidingToolbarVh = this.U;
        if (hidingToolbarVh == null) {
            hidingToolbarVh = null;
        }
        hidingToolbarVh.L();
        this.R.L();
        FiltersWithSearchResultVh filtersWithSearchResultVh = this.S;
        if (filtersWithSearchResultVh != null) {
            filtersWithSearchResultVh.i = null;
        }
        this.L.b();
        if (((Boolean) this.M.getValue()).booleanValue()) {
            t8a t8aVar = (t8a) this.N.getValue();
            t8aVar.e = null;
            t8aVar.d.dispose();
        }
        this.W.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.T.r;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c h0(q3a q3aVar) {
        return q3aVar.a().b0(lwf0.class).subscribe(new l50(new nk(14), 14));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        mzp0 mzp0Var;
        SwitchCatalogVh switchCatalogVh = this.T;
        bnn0 bnn0Var2 = switchCatalogVh.r;
        if (epx.f(bnn0Var2, bnn0Var)) {
            return;
        }
        if ((bnn0Var instanceof swp) && (mzp0Var = this.v) != null) {
            mzp0Var.f();
        }
        switchCatalogVh.i8(bnn0Var);
        boolean z = bnn0Var instanceof alj;
        TabLayoutVh tabLayoutVh = this.x;
        if (!z || this.Y) {
            tabLayoutVh.hide();
        } else {
            tabLayoutVh.show();
        }
        boolean z2 = bnn0Var instanceof vyh0;
        SearchResultsImplVh searchResultsImplVh = this.R;
        ViewPagerVh viewPagerVh = this.w;
        if (z2) {
            UiTracker uiTracker = UiTracker.a;
            UiTracker.h(this);
            this.O.b = UiTracker.c();
            viewPagerVh.onPause();
            searchResultsImplVh.onResume();
            return;
        }
        if (epx.f(bnn0Var2, vyh0.a)) {
            searchResultsImplVh.onPause();
            this.Q.b("");
            l0();
        }
        viewPagerVh.onResume();
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        boolean equals = bnn0Var.equals(vyh0.a);
        u4a u4aVar = this.m;
        if (equals) {
            SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
        } else {
            SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
            searchStatInfoProvider2.getClass();
            searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Disabled;
        }
        boolean z = bnn0Var instanceof vyh0;
        wng wngVar = this.r;
        CommunitiesSearchTopBarVh communitiesSearchTopBarVh = this.Q;
        if (!z) {
            communitiesSearchTopBarVh.b("");
            if (((Boolean) wngVar.invoke()).booleanValue()) {
                ((zak0) communitiesSearchTopBarVh.m).setValue(CommunitiesTopBarSearchState.Collapsed);
                communitiesSearchTopBarVh.a();
            }
        } else if (((Boolean) wngVar.invoke()).booleanValue()) {
            ((zak0) communitiesSearchTopBarVh.m).setValue(CommunitiesTopBarSearchState.Expanded);
        }
        boolean z2 = bnn0Var instanceof alj;
        TabLayoutVh tabLayoutVh = this.x;
        if (!z2 || this.Y) {
            tabLayoutVh.hide();
        } else {
            tabLayoutVh.show();
        }
        if (bnn0Var instanceof swp) {
            ComposeView composeView = communitiesSearchTopBarVh.d;
            (composeView != null ? composeView : null).setVisibility(8);
        } else {
            ComposeView composeView2 = communitiesSearchTopBarVh.d;
            (composeView2 != null ? composeView2 : null).setVisibility(0);
        }
    }

    public final void j0(v6j v6jVar) {
        ((zak0) this.Q.l).setValue((String) v6jVar.b);
    }

    public final boolean k0() {
        wng wngVar = this.r;
        if (((Boolean) wngVar.invoke()).booleanValue()) {
            bnn0 bnn0Var = this.T.r;
            alj aljVar = alj.a;
            if (!epx.f(bnn0Var, aljVar)) {
                i8(aljVar);
                return true;
            }
        }
        if (((Boolean) wngVar.invoke()).booleanValue()) {
            CommunitiesSearchTopBarVh communitiesSearchTopBarVh = this.Q;
            if (((CommunitiesTopBarSearchState) ((zak0) communitiesSearchTopBarVh.m).getValue()) == CommunitiesTopBarSearchState.Expanded) {
                communitiesSearchTopBarVh.b("");
                ((zak0) communitiesSearchTopBarVh.m).setValue(CommunitiesTopBarSearchState.Collapsed);
                return true;
            }
        }
        return this.m.b.b.c(false);
    }

    public final void l0() {
        if (this.P) {
            FiltersWithSearchResultVh filtersWithSearchResultVh = this.S;
            if (filtersWithSearchResultVh != null) {
                filtersWithSearchResultVh.a();
            }
            VkGroupsSearchParams vkGroupsSearchParams = this.C;
            vkGroupsSearchParams.reset();
            this.B.g = vkGroupsSearchParams.copy();
            ((zak0) this.Q.i).setValue(Boolean.FALSE);
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1009 && i2 == -1) {
            this.y.d();
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        HidingToolbarVh hidingToolbarVh = this.U;
        if (hidingToolbarVh == null) {
            hidingToolbarVh = null;
        }
        hidingToolbarVh.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        this.J = null;
        this.K.b(null);
        if (this.T.r instanceof vyh0) {
            this.R.onPause();
        } else {
            this.w.onPause();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.J = ysg0.b.a.b0(eru0.class).subscribe(new gf0(new arf(this, 2), 14));
        this.K.b(((f) this.m.b.d.b).subscribe(new tp0(new zx0(this, 26), 16)));
        if (((Boolean) this.z.getValue()).booleanValue()) {
            HidingToolbarVh hidingToolbarVh = this.U;
            if (hidingToolbarVh == null) {
                hidingToolbarVh = null;
            }
            hidingToolbarVh.d(true, false);
        }
        if (!(this.T.r instanceof vyh0)) {
            this.w.onResume();
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        l1q0 l1q0Var = UiTracker.i;
        if (l1q0Var.c()) {
            boolean z = l1q0Var.b;
            l1q0Var.b = false;
            if (!z) {
                l1q0Var.f(UiTracker.e().g(this), false);
            }
        }
        this.R.onResume();
    }

    public final RectF p1() {
        zhf0 zhf0Var = (zhf0) ((zak0) this.Q.n).getValue();
        if (zhf0Var != null) {
            return zjq.o(zhf0Var);
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        HidingToolbarVh hidingToolbarVh = this.U;
        if (hidingToolbarVh == null) {
            hidingToolbarVh = null;
        }
        hidingToolbarVh.d(true, true);
        bnn0 bnn0Var = this.T.r;
        if (bnn0Var instanceof vyh0) {
            this.R.s();
        } else if (bnn0Var instanceof alj) {
            this.w.s();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.w.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        UIBlockSearchSuggestion uIBlockSearchSuggestion;
        if (i == R.id.search_suggestion) {
            uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
                this.Q.b(searchSuggestion.c);
                n0(this, searchSuggestion.c, false, SearchInputMethod.Suggest, searchSuggestion.k, 2);
                return;
            }
            return;
        }
        if (i == R.id.search_suggestion_close) {
            uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                SearchSuggestion searchSuggestion2 = uIBlockSearchSuggestion.y;
                this.W.b(rsg0.T(yfb.x(this.V.b(searchSuggestion2.k, searchSuggestion2.b))).subscribe(new zng(new com.vk.movika.sdk.base.utils.b(16), 0), new p41(new tb4(10), 13)));
                this.m.b.e.b(new xxf0(uIBlockSearchSuggestion.Fb()), false);
            }
        }
    }
}
