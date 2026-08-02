package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.ErrorStateWithIconVh;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.lists.c;
import com.vk.movika.sdk.base.ui.t;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.j0;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.alj;
import xsna.bjc;
import xsna.bnn0;
import xsna.cfp0;
import xsna.drm0;
import xsna.e43;
import xsna.eg50;
import xsna.epx;
import xsna.f5z;
import xsna.fkq0;
import xsna.fxc0;
import xsna.g3a;
import xsna.jjt0;
import xsna.kea;
import xsna.ltz;
import xsna.mhj0;
import xsna.msy;
import xsna.nda;
import xsna.o5a;
import xsna.onh0;
import xsna.oon0;
import xsna.p11;
import xsna.sba;
import xsna.sd5;
import xsna.swp;
import xsna.sx0;
import xsna.sx3;
import xsna.t61;
import xsna.txh0;
import xsna.tyh0;
import xsna.u4a;
import xsna.uzp0;
import xsna.vd5;
import xsna.vd7;
import xsna.vyh0;
import xsna.wd5;
import xsna.wia;
import xsna.xd5;
import xsna.y6;

/* compiled from: AuthorsCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class AuthorsCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, CatalogStatesViewHolder, SwitchCatalogVh.b, TopBarVh.a {
    public final SwitchCatalogVh A;
    public final HidingToolbarVh B;
    public bnn0 C;
    public final boolean p;
    public final g3a q;
    public final sd5 r;
    public final xd5 s;
    public final Object t;
    public final Object u;
    public final TopBarVh v;
    public final ViewPagerVh w;
    public final FirstPinnedTabLayoutVh x;
    public final mhj0 y;
    public final SearchResultsImplVh z;

    public AuthorsCatalogRootVh() {
        throw null;
    }

    public AuthorsCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        AuthorsCatalogRootVh authorsCatalogRootVh;
        TopBarVh toolbarVh;
        String string;
        boolean z = this.m.b.c && fxc0.B().J().x0();
        this.p = z;
        u4a u4aVar = this.m;
        this.q = u4aVar.b.s.S(u4aVar, null);
        String str = (bundle == null || (string = bundle.getString("title")) == null) ? "" : string;
        String string2 = bundle != null ? bundle.getString("hint") : null;
        this.r = new sd5(this);
        this.s = new xd5();
        t tVar = new t(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, tVar);
        txh0 txh0Var = new txh0(new sx0(this, 2), new com.vk.movika.sdk.base.logic.interactor.b(this, 3), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        Lazy a = msy.a(lazyThreadSafetyMode, new t61(2));
        this.u = a;
        if (((Boolean) a.getValue()).booleanValue()) {
            u4a.a aVar = this.m.b;
            toolbarVh = new ToolbarRedesignVh(aVar.b, aVar.e, str, j0(), false, null, null, null, new vd5(0, this, AuthorsCatalogRootVh.class, "onScrollToTopClicked", "onScrollToTopClicked()Z", 8), string2, txh0Var, 3735536);
            authorsCatalogRootVh = this;
        } else {
            u4a.a aVar2 = this.m.b;
            authorsCatalogRootVh = this;
            toolbarVh = new ToolbarVh(aVar2.b, aVar2.e, str, j0(), false, null, null, null, null, new wd5(0, this, AuthorsCatalogRootVh.class, "onScrollToTopClicked", "onScrollToTopClicked()Z", 8), string2, 3735536);
        }
        TopBarVh topBarVh = toolbarVh;
        authorsCatalogRootVh.v = topBarVh;
        ViewPagerVh videoViewPagerVh = authorsCatalogRootVh.m.b.s.J() ? new VideoViewPagerVh(authorsCatalogRootVh.m, authorsCatalogRootVh.N(), null, null, null, 988) : new ViewPagerVh(authorsCatalogRootVh.m, false, null, false, null, null, null, authorsCatalogRootVh.N(), null, null, 7150);
        authorsCatalogRootVh.w = videoViewPagerVh;
        FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = new FirstPinnedTabLayoutVh(videoViewPagerVh, authorsCatalogRootVh.m.b.r, new jjt0(), Integer.valueOf(R.drawable.catalog_first_pinned_indicator), z, null, null, null, null, 7690);
        authorsCatalogRootVh.x = firstPinnedTabLayoutVh;
        ErrorStateWithIconVh errorStateWithIconVh = new ErrorStateWithIconVh(authorsCatalogRootVh, new y6(authorsCatalogRootVh, 4));
        ProgressVh progressVh = new ProgressVh((Object) null);
        eg50 eg50Var = new eg50();
        mhj0 mhj0Var = new mhj0(authorsCatalogRootVh.m.b.s.N());
        authorsCatalogRootVh.y = mhj0Var;
        u4a u4aVar2 = authorsCatalogRootVh.m;
        wia N = authorsCatalogRootVh.N();
        u4a.a aVar3 = u4aVar2.b;
        u4a a2 = u4a.a(u4aVar2, u4a.a.a(aVar3, null, null, null, null, null, new tyh0(aVar3.s), null, null, null, eg50Var, new onh0(), -524289, 1048551));
        u4a.a aVar4 = a2.b;
        CatalogConfiguration catalogConfiguration = aVar4.s;
        kea keaVar = new kea(mhj0Var, catalogConfiguration.K(a2), a2, new vd7(aVar4.e), false, null, null, false, null, null, null, null, null, false, null, 131008);
        p11 p11Var = new p11(6);
        c.h hVar = new c.h((c.m) keaVar);
        hVar.o = p11Var;
        SearchResultsImplVh searchResultsImplVh = new SearchResultsImplVh(mhj0Var, keaVar, new VerticalListVh(catalogConfiguration, hVar, keaVar, a2, N, false, R.layout.catalog_list_vertical_with_appbar_behaviour, null, 864), null, null, null, null, new SearchResultsVh.a(false, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), null, 376);
        authorsCatalogRootVh.z = searchResultsImplVh;
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(videoViewPagerVh, searchResultsImplVh, errorStateWithIconVh, progressVh, this, 0, null, null, false, false, null, 2016);
        this.A = switchCatalogVh;
        this.B = new HidingToolbarVh(this.m.b.e, e43.l(topBarVh, firstPinnedTabLayoutVh), switchCatalogVh, null);
    }

    public static final void i0(AuthorsCatalogRootVh authorsCatalogRootVh) {
        if (authorsCatalogRootVh.A.r instanceof vyh0) {
            return;
        }
        DisableableViewPager disableableViewPager = authorsCatalogRootVh.w.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        PagerAdapter adapter = disableableViewPager.getAdapter();
        sba sbaVar = adapter instanceof sba ? (sba) adapter : null;
        if (sbaVar != null) {
            sbaVar.s();
        }
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.A.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh.a
    public final void B(String str) {
        this.y.p = str;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.B.N6(uIBlock);
        UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
        if (uIBlockCatalog != null) {
            if (!(this.A.r instanceof vyh0)) {
                this.x.show();
            }
            TopBarVh topBarVh = this.v;
            topBarVh.N6(uIBlockCatalog);
            topBarVh.show();
        }
        ViewPagerVh viewPagerVh = this.w;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        sd5 sd5Var = this.r;
        disableableViewPager.removeOnPageChangeListener(sd5Var);
        DisableableViewPager disableableViewPager2 = viewPagerVh.o;
        (disableableViewPager2 != null ? disableableViewPager2 : null).addOnPageChangeListener(sd5Var);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.A.r instanceof vyh0) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 16);
            return;
        }
        xd5 xd5Var = this.s;
        xd5Var.getClass();
        UIBlock uIBlock = cfp0Var.a;
        boolean z = uIBlock instanceof UIBlockLink;
        if (z) {
            UIBlockLink uIBlockLink = (UIBlockLink) uIBlock;
            if (drm0.D(uIBlockLink.y.e, "/video/subscriptions_chooser", false)) {
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, uIBlockLink.r(), null, 46, null), new j0(), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                return;
            }
        }
        if (z) {
            UIBlockLink uIBlockLink2 = (UIBlockLink) uIBlock;
            if (drm0.D(uIBlockLink2.y.e, "/app52196272", false)) {
                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, uIBlockLink2.r(), null, 46, null), new MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem(MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem.EventType.MOVE_YOUTUBE_SUBS_START), 2);
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(c2, b2, uzp0Var2.a).q();
                return;
            }
        }
        Object obj = cfp0Var.b;
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType)) {
            super.S(cfp0Var);
            return;
        }
        SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(fkq0.e(uIBlock.g).b), null, xd5Var.a.e(uIBlock), null, 42, null), new MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick((MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType) obj), 2);
        UiTracker uiTracker3 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
        uzp0 uzp0Var3 = UiTracker.h;
        uzp0Var3.getClass();
        new bjc(c3, b3, uzp0Var3.a).q();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        HidingToolbarVh hidingToolbarVh = this.B;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, null);
        k5.post(new sx3(this, 1));
        this.v.R9(this);
        hidingToolbarVh.a(true);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        DisableableViewPager disableableViewPager = this.w.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.removeOnPageChangeListener(this.r);
        u4a u4aVar = this.m;
        ((io.reactivex.rxjava3.disposables.b) u4aVar.b.o.b).e();
        this.B.L();
        u4aVar.b.e.b(new oon0("author_hide_unhide", null, false, false, 14), false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Z(byte[] bArr) {
        this.w.e(bArr);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final byte[] b0() {
        return this.w.g();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.A.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        SwitchCatalogVh switchCatalogVh = this.A;
        if (bnn0Var.equals(switchCatalogVh.r)) {
            return;
        }
        switchCatalogVh.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        boolean z = bnn0Var instanceof alj;
        FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.x;
        if (z) {
            firstPinnedTabLayoutVh.show();
        } else {
            firstPinnedTabLayoutVh.hide();
        }
        vyh0 vyh0Var = vyh0.a;
        boolean equals = bnn0Var.equals(vyh0Var);
        SearchResultsImplVh searchResultsImplVh = this.z;
        ViewPagerVh viewPagerVh = this.w;
        if (equals) {
            viewPagerVh.onPause();
            searchResultsImplVh.onResume();
        } else {
            if (z && viewPagerVh.n == null) {
                this.q.d();
            }
            if (epx.f(this.C, vyh0Var)) {
                searchResultsImplVh.onPause();
            }
            viewPagerVh.onResume();
        }
        this.C = bnn0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int j0() {
        ?? r0 = this.u;
        boolean booleanValue = ((Boolean) r0.getValue()).booleanValue();
        boolean z = this.p;
        return (booleanValue && z) ? R.layout.catalog_toolbar_redesign_tablet : ((Boolean) r0.getValue()).booleanValue() ? R.layout.catalog_toolbar_redesign : z ? R.layout.catalog_toolbar_tablet : R.layout.catalog_toolbar;
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh.a
    public final void o(String str) {
        this.y.q = str;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.B.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        if (this.A.r instanceof vyh0) {
            this.z.onPause();
        } else {
            this.x.onPause();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        if (this.A.r instanceof vyh0) {
            this.z.onResume();
        } else {
            this.x.onResume();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh.a
    public final void setSearchQuery(String str) {
        if (str.length() <= 0) {
            i8(alj.a);
        } else {
            SearchResultsVh.cb(this.z, str, null, null, false, null, false, 62);
            i8(vyh0.a);
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
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
