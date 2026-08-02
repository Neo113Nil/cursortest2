package com.vk.catalog2.common.ui.mvp.holder.friends;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.search.CatalogGetPeopleSearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.FriendsSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.f;
import kotlin.LazyThreadSafetyMode;
import xsna.alj;
import xsna.anj;
import xsna.b5a;
import xsna.bnn0;
import xsna.cfp0;
import xsna.e43;
import xsna.ecm;
import xsna.eg50;
import xsna.ekh;
import xsna.enj;
import xsna.epx;
import xsna.f20;
import xsna.f5z;
import xsna.fha;
import xsna.fms;
import xsna.fpf0;
import xsna.g3a;
import xsna.g620;
import xsna.gzs;
import xsna.h1j;
import xsna.h48;
import xsna.hf8;
import xsna.hms;
import xsna.i7p0;
import xsna.ims;
import xsna.j9b;
import xsna.jg0;
import xsna.jms;
import xsna.k7m;
import xsna.k9b;
import xsna.kea;
import xsna.kms;
import xsna.l1q0;
import xsna.l50;
import xsna.l7;
import xsna.ltz;
import xsna.m3a;
import xsna.m7m;
import xsna.mru0;
import xsna.msy;
import xsna.n0q0;
import xsna.nda;
import xsna.nfj;
import xsna.o5a;
import xsna.onh0;
import xsna.oq;
import xsna.qt0;
import xsna.r5a;
import xsna.rda;
import xsna.s6k;
import xsna.sa80;
import xsna.swp;
import xsna.tcn;
import xsna.tlo0;
import xsna.tyh0;
import xsna.u4a;
import xsna.ubq;
import xsna.vd7;
import xsna.vyh0;
import xsna.w7p0;
import xsna.wia;
import xsna.wzf;
import xsna.wzh;
import xsna.x52;
import xsna.xsh0;
import xsna.ysg0;
import xsna.z23;
import xsna.zhf0;
import xsna.zjq;

/* compiled from: FriendsCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class FriendsCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, rda, SwitchCatalogVh.b, CatalogStatesViewHolder, n0q0 {
    public Integer A;
    public final wzh B;
    public final FriendsSearchQueryVh C;
    public final SwitchCatalogVh D;
    public final HidingToolbarVh E;
    public final a F;
    public final Handler G;
    public final x52 H;
    public final Object p;
    public final VkTopBarVh q;
    public final Object r;
    public final eg50 s;
    public final r5a t;
    public final SearchResultsImplVh u;
    public final VkPeopleSearchParams v;
    public final FriendsViewPagerVh w;
    public final g3a x;
    public c y;
    public int z;

    /* compiled from: FriendsCatalogRootVh.kt */
    public static final class a extends BroadcastReceiver {
        public final g3a a;
        public int b = g620.g;

        public a(g3a g3aVar) {
            this.a = g3aVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null || action.hashCode() != -1414915502 || !action.equals("com.vkontakte.android.COUNTERS_UPDATED") || this.b == g620.g) {
                return;
            }
            this.b = g620.g;
            this.a.d();
        }
    }

    public FriendsCatalogRootVh() {
        throw null;
    }

    public FriendsCatalogRootVh(FragmentActivity fragmentActivity, FriendsCatalogFragment friendsCatalogFragment, o5a o5aVar, Bundle bundle, String str, boolean z, gzs gzsVar, j9b j9bVar, k9b k9bVar, xsh0 xsh0Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        f20 f20Var = new f20(16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p = msy.a(lazyThreadSafetyMode, f20Var);
        u4a.a aVar = this.m.b;
        VkTopBarVh vkTopBarVh = new VkTopBarVh(aVar.b, aVar.e, new i7p0(null, j9bVar, k9bVar, null, 9), new w7p0(!z, gzsVar, b.a(null, new qt0(28), 3), b.a(null, new tcn(fragmentActivity, 9), 3), null, null, null, null, null, 32542), oq.d(tlo0.Companion, str), null, null, null, 4032);
        this.q = vkTopBarVh;
        this.r = msy.a(lazyThreadSafetyMode, new jg0(20));
        eg50 eg50Var = new eg50();
        this.s = eg50Var;
        r5a r5aVar = new r5a(this.m.b.s.N(), CatalogGetPeopleSearchRequestFactory.SearchPeopleEntrypoint.SearchInService);
        this.t = r5aVar;
        u4a u4aVar = this.m;
        wia N = N();
        u4a.a aVar2 = u4aVar.b;
        u4a a2 = u4a.a(u4aVar, u4a.a.a(aVar2, null, null, null, null, null, new tyh0(aVar2.s), null, null, null, eg50Var, new onh0(), -524289, 1048551));
        u4a.a aVar3 = a2.b;
        CatalogConfiguration catalogConfiguration = aVar3.s;
        kea keaVar = new kea(r5aVar, catalogConfiguration.K(a2), a2, new vd7(aVar3.e), false, null, null, false, null, null, null, null, null, false, null, 131008);
        l7 l7Var = new l7(fragmentActivity, 24);
        c.h hVar = new c.h((c.m) keaVar);
        hVar.o = l7Var;
        SearchResultsImplVh searchResultsImplVh = new SearchResultsImplVh(r5aVar, keaVar, new VerticalListVh(catalogConfiguration, hVar, keaVar, a2, N, false, R.layout.catalog_list_vertical_with_appbar_behaviour, null, 864), null, null, null, null, new SearchResultsVh.a(false, 125), null, 376);
        this.u = searchResultsImplVh;
        this.v = new VkPeopleSearchParams();
        u4a u4aVar2 = this.m;
        ims imsVar = new ims(((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class)), StoriesComponent.class, "storiesSeenController", "getStoriesSeenController()Lcom/vk/story/api/domain/repository/StoriesSeenController;", 0);
        jms jmsVar = new jms(0, ((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class)), StoryViewerComponent.class, "storiesRouter", "getStoriesRouter()Lcom/vk/story/viewer/api/StoryViewerRouter;", 0);
        FriendsViewPagerVh friendsViewPagerVh = new FriendsViewPagerVh(u4aVar2, false, null, false, null, null, null, N(), null, null, 7166);
        u4a.a aVar4 = u4aVar2.b;
        friendsViewPagerVh.A = new fha(aVar4.d, aVar4.e, jmsVar, imsVar);
        this.w = friendsViewPagerVh;
        ProgressVh progressVh = new ProgressVh((Object) null);
        u4a u4aVar3 = this.m;
        g3a S = u4aVar3.b.s.S(u4aVar3, null);
        this.x = S;
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new h1j(this, 15));
        wzh wzhVar = new wzh(this, 12);
        this.B = wzhVar;
        FriendsSearchQueryVh friendsSearchQueryVh = new FriendsSearchQueryVh(wzhVar, new ecm(this, 11), new ekh(this, 6), new fms(this, xsh0Var, fragmentActivity, friendsCatalogFragment, 0), new kms(1, this, FriendsCatalogRootVh.class, "searchFromCode", "searchFromCode(Ljava/lang/String;Z)V", 0));
        this.C = friendsSearchQueryVh;
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(friendsViewPagerVh, searchResultsImplVh, errorStateVh, progressVh, this, 0, null, null, false, false, null, 2016);
        this.D = switchCatalogVh;
        this.E = new HidingToolbarVh(this.m.b.e, e43.l(vkTopBarVh, friendsSearchQueryVh), switchCatalogVh, null);
        this.F = new a(S);
        this.G = new Handler(Looper.getMainLooper());
        this.H = new x52(this, 5);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.D.A(str);
    }

    public final void A0() {
        this.q.m();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.E.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.D.r instanceof vyh0) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
        } else {
            super.S(cfp0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        if (!(this.D.r instanceof vyh0)) {
            return false;
        }
        i8(alj.a);
        return true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        int paddingBottom;
        anj.d(this.b, this.F, z23.a("com.vkontakte.android.COUNTERS_UPDATED"), hf8.a, 4);
        HidingToolbarVh hidingToolbarVh = this.E;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, null);
        hidingToolbarVh.j = false;
        hidingToolbarVh.a(true);
        this.G.post(this.H);
        i8(ltz.a);
        VkSearchView vkSearchView = this.C.h;
        if (vkSearchView != null) {
            vkSearchView.setHint(R.string.friends_catalog_search_hint);
        }
        int i = this.z;
        this.z = i;
        FriendsViewPagerVh friendsViewPagerVh = this.w;
        friendsViewPagerVh.z = i;
        DisableableViewPager disableableViewPager = friendsViewPagerVh.o;
        if (disableableViewPager != null) {
            if (disableableViewPager == null) {
                disableableViewPager = null;
            }
            int i2 = 0;
            while (i2 < disableableViewPager.getChildCount()) {
                int i3 = i2 + 1;
                View childAt = disableableViewPager.getChildAt(i2);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = childAt instanceof CatalogRecyclerPaginatedView ? (CatalogRecyclerPaginatedView) childAt : null;
                if (catalogRecyclerPaginatedView != null) {
                    catalogRecyclerPaginatedView.setBottomInsetForScrollableContent(friendsViewPagerVh.z);
                }
                i2 = i3;
            }
        }
        RecyclerPaginatedView l = this.u.d.l();
        if (l != null && (recyclerView = l.getRecyclerView()) != null) {
            Integer num = this.A;
            if (num != null) {
                paddingBottom = num.intValue();
            } else {
                paddingBottom = recyclerView.getPaddingBottom();
                this.A = Integer.valueOf(paddingBottom);
            }
            h48.a(recyclerView, paddingBottom, i, 0);
        }
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.G.removeCallbacks(this.H);
        this.x.b();
        enj.s(this.b, this.F);
        this.A = null;
        this.E.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return ((f) m3aVar.b).subscribe(new hms(new s6k(this, 17), 0));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        return b5aVar.a.b0(sa80.class).subscribe(new ubq(new wzf(this, 19), 2));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.D.r;
    }

    public final void i0() {
        this.q.getClass();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        SwitchCatalogVh switchCatalogVh = this.D;
        bnn0 bnn0Var2 = switchCatalogVh.r;
        if (epx.f(bnn0Var2, bnn0Var)) {
            return;
        }
        switchCatalogVh.i8(bnn0Var);
        vyh0 vyh0Var = vyh0.a;
        boolean equals = bnn0Var.equals(vyh0Var);
        SearchResultsImplVh searchResultsImplVh = this.u;
        FriendsViewPagerVh friendsViewPagerVh = this.w;
        if (!equals) {
            if (epx.f(bnn0Var2, vyh0Var)) {
                searchResultsImplVh.onPause();
            }
            friendsViewPagerVh.onResume();
        } else {
            UiTracker uiTracker = UiTracker.a;
            UiTracker.h(this);
            this.s.b = UiTracker.c();
            friendsViewPagerVh.onPause();
            searchResultsImplVh.onResume();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        boolean z = bnn0Var instanceof vyh0;
        u4a u4aVar = this.m;
        if (z) {
            SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
        } else {
            SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
            searchStatInfoProvider2.getClass();
            searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Disabled;
        }
        VkPeopleSearchParams vkPeopleSearchParams = this.v;
        boolean I = vkPeopleSearchParams.I();
        FriendsSearchQueryVh friendsSearchQueryVh = this.C;
        if (!z) {
            if (!I) {
                vkPeopleSearchParams.reset();
                this.u.clear();
            }
            VkSearchView vkSearchView = friendsSearchQueryVh.h;
            if (vkSearchView != null) {
                vkSearchView.U4();
                vkSearchView.d0();
            }
        }
        VkSearchView vkSearchView2 = friendsSearchQueryVh.h;
        if (vkSearchView2 != null) {
            vkSearchView2.f5(z);
        }
        boolean z2 = z && !I;
        VkSearchView vkSearchView3 = friendsSearchQueryVh.h;
        if (vkSearchView3 != null) {
            vkSearchView3.h5(true, z2);
        }
        boolean z3 = !z;
        HidingToolbarVh hidingToolbarVh = this.E;
        hidingToolbarVh.d(z3, true);
        hidingToolbarVh.c(z3);
    }

    public final void j0() {
        this.x.d();
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.E.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        io.reactivex.rxjava3.disposables.c cVar = this.y;
        if (cVar != null) {
            cVar.dispose();
        }
        this.y = null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.y = ysg0.b.a.b0(mru0.class).subscribe(new l50(new nfj(this, 19), 26));
        SwitchCatalogVh switchCatalogVh = this.D;
        boolean z = switchCatalogVh.r instanceof vyh0;
        if (((Boolean) this.r.getValue()).booleanValue()) {
            this.E.d(!z, false);
        }
        if (!(switchCatalogVh.r instanceof vyh0)) {
            this.w.onResume();
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        l1q0 l1q0Var = UiTracker.i;
        if (l1q0Var.c()) {
            boolean z2 = l1q0Var.b;
            l1q0Var.b = false;
            if (z2) {
                return;
            }
            l1q0Var.f(UiTracker.e().g(this), false);
        }
    }

    public final RectF p1() {
        zhf0 zhf0Var;
        VkTopBar vkTopBar = this.q.n;
        if (vkTopBar == null || (zhf0Var = vkTopBar.getLeftAvatarRect()) == null) {
            zhf0Var = zhf0.e;
        }
        return zjq.o(zhf0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        bnn0 bnn0Var = this.D.r;
        if (bnn0Var instanceof vyh0) {
            this.u.s();
        } else if (bnn0Var instanceof alj) {
            this.E.d(true, true);
            this.w.s();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS;
        this.w.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.toolbar) {
            s();
        } else {
            this.m.b.b.c(false);
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
