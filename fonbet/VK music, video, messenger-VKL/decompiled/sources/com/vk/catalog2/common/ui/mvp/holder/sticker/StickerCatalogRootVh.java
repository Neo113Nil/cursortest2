package com.vk.catalog2.common.ui.mvp.holder.sticker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickersBonusBalance;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.sticker.StickerHidingToolbarVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.TabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.music.SearchSuggestion;
import com.vk.lists.c;
import com.vk.movika.tools.controls.seekbar.h;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.android.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.alj;
import xsna.b5a;
import xsna.b8j0;
import xsna.bnn0;
import xsna.bpn0;
import xsna.cck0;
import xsna.dck0;
import xsna.dhr0;
import xsna.dj60;
import xsna.dml;
import xsna.epx;
import xsna.f5z;
import xsna.fnj;
import xsna.fv70;
import xsna.g380;
import xsna.g3a;
import xsna.iah0;
import xsna.j5g;
import xsna.kca;
import xsna.kea;
import xsna.kr6;
import xsna.ltz;
import xsna.mqe0;
import xsna.mzp0;
import xsna.n0q0;
import xsna.nc90;
import xsna.nda;
import xsna.o5a;
import xsna.p2l0;
import xsna.q2l0;
import xsna.qz40;
import xsna.rda;
import xsna.swp;
import xsna.u4a;
import xsna.u4q0;
import xsna.u6a;
import xsna.ux00;
import xsna.vd7;
import xsna.vyh0;
import xsna.wda;
import xsna.yw90;
import xsna.zik0;

/* compiled from: StickerCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class StickerCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, rda, wda, SwitchCatalogVh.b, CatalogStatesViewHolder, n0q0, View.OnTouchListener {
    public final SearchResultsImplVh A;
    public final VkSearchQueryVh B;
    public final g3a C;
    public final CatalogViewHolder D;
    public final TabLayoutVh E;
    public final SwitchCatalogVh F;
    public final CatalogViewHolder G;
    public final StickerHidingToolbarVh H;
    public final int p;
    public final boolean q;
    public final mzp0 r;
    public final yw90 s;
    public final boolean t;
    public final String u;
    public final kca v;
    public final CatalogConfiguration w;
    public String x;
    public String y;
    public final ViewPagerVh z;

    public StickerCatalogRootVh() {
        throw null;
    }

    public StickerCatalogRootVh(FragmentActivity fragmentActivity, o5a o5aVar, Bundle bundle, int i, boolean z, mzp0 mzp0Var, yw90 yw90Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        this.p = i;
        this.q = z;
        this.r = mzp0Var;
        this.s = yw90Var;
        this.t = bundle != null ? bundle.getBoolean("no_bottom_navigation", false) : false;
        this.u = bundle != null ? bundle.getString("query") : null;
        kca kcaVar = new kca(new bpn0(new kr6(23)));
        this.v = kcaVar;
        CatalogConfiguration catalogConfiguration = this.m.b.s;
        this.w = catalogConfiguration;
        u6a u6aVar = new u6a(catalogConfiguration.N(), kcaVar, i0(this.m), catalogConfiguration.q(), this.m.b.z);
        this.x = "";
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, null, null, null, N(), null, null, 7166);
        this.z = viewPagerVh;
        u4a u4aVar = this.m;
        u4a a = u4a.a(u4aVar, u4a.a.a(u4aVar.b, null, null, null, null, null, null, i0(u4aVar), null, null, null, null, -134217729, 1048575));
        u4a.a aVar = a.b;
        CatalogConfiguration catalogConfiguration2 = aVar.s;
        kea keaVar = new kea(u6aVar, catalogConfiguration2.K(a), a, new vd7(aVar.e), false, null, null, false, null, null, null, null, null, false, null, 131008);
        SearchResultsImplVh searchResultsImplVh = new SearchResultsImplVh(u6aVar, keaVar, new PaginatedGridListVh(catalogConfiguration2, new c.h((c.m) keaVar), keaVar, a, new p2l0(), new q2l0(), N(), false, R.layout.catalog_list_vertical_with_appbar_behaviour, null, null, 3712), null, null, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        this.A = searchResultsImplVh;
        VkSearchQueryVh vkSearchQueryVh = new VkSearchQueryVh(new SearchQueryVh(R.string.stickers_catalog_hint_search, new cck0(this, 2), new dck0(this, 2), null, new dml(new h(this, 12), null, new b8j0(this, 3), null, null, 0L, 58), 96), null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        this.B = vkSearchQueryVh;
        this.C = catalogConfiguration.S(this.m, null);
        CatalogViewHolder w = catalogConfiguration.w(CatalogDataType.DATA_TYPE_STICKERS_BANNERS, CatalogViewType.SLIDER, null, null, this.m);
        this.D = w;
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new mqe0(this, 14));
        TabLayoutVh tabLayoutVh = new TabLayoutVh(viewPagerVh, 0, null, true, this.m.b.r, 974);
        this.E = tabLayoutVh;
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(viewPagerVh, searchResultsImplVh, errorStateVh, new ProgressVh((Object) null), this, 0, this, null, false, false, null, 1952);
        this.F = switchCatalogVh;
        this.G = catalogConfiguration.w(CatalogDataType.DATA_TYPE_STICKERS_INFO, CatalogViewType.BUTTON, null, null, this.m);
        this.H = new StickerHidingToolbarVh(this.m.b.e, vkSearchQueryVh, w, tabLayoutVh, switchCatalogVh);
    }

    public static String i0(u4a u4aVar) {
        String str = u4aVar.b.A;
        if (str == null || str.equals(X3.i.U)) {
            return "stickers_catalog_search";
        }
        return "stickers_catalog_search__" + u4aVar.b.A;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.F.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Object obj;
        Object obj2;
        if (uIBlock instanceof UIBlockCatalog) {
            mzp0 mzp0Var = this.r;
            if (mzp0Var != null) {
                mzp0Var.c(false);
            }
            UIBlockList uIBlockList = ((UIBlockCatalog) uIBlock).y;
            Iterator<T> it = uIBlockList.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                UIBlock uIBlock2 = (UIBlock) obj;
                if ((uIBlock2 instanceof UIBlockList) && uIBlock2.e == CatalogDataType.DATA_TYPE_STICKERS_BANNERS) {
                    break;
                }
            }
            UIBlock uIBlock3 = (UIBlock) obj;
            if (uIBlock3 == null) {
                Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
                uIBlock3 = UIBlockList.a.a();
            }
            this.D.N6(uIBlock3);
            Iterator<T> it2 = uIBlockList.y.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                UIBlock uIBlock4 = (UIBlock) obj2;
                if ((uIBlock4 instanceof UIBlockList) && uIBlock4.e == CatalogDataType.DATA_TYPE_STICKERS_INFO) {
                    break;
                }
            }
            UIBlockList uIBlockList2 = obj2 instanceof UIBlockList ? (UIBlockList) obj2 : null;
            if (uIBlockList2 == null) {
                Serializer.c<UIBlockList> cVar2 = UIBlockList.CREATOR;
                uIBlockList2 = UIBlockList.a.a();
            }
            ArrayList<UIBlock> arrayList = uIBlockList2.y;
            ArrayList arrayList2 = new ArrayList();
            for (UIBlock uIBlock5 : arrayList) {
                UIBlockStickersBonusBalance uIBlockStickersBonusBalance = uIBlock5 instanceof UIBlockStickersBonusBalance ? (UIBlockStickersBonusBalance) uIBlock5 : null;
                if (uIBlockStickersBonusBalance != null) {
                    arrayList2.add(uIBlockStickersBonusBalance);
                }
            }
            UIBlock uIBlock6 = (UIBlockStickersBonusBalance) j5g.a0(arrayList2);
            if (uIBlock6 == null) {
                Serializer.c<UIBlockList> cVar3 = UIBlockList.CREATOR;
                uIBlock6 = UIBlockList.a.a();
            }
            View view = this.B.p;
            CatalogViewHolder catalogViewHolder = this.G;
            if (view != null) {
                StickerTopBarBonusBalanceVh stickerTopBarBonusBalanceVh = catalogViewHolder instanceof StickerTopBarBonusBalanceVh ? (StickerTopBarBonusBalanceVh) catalogViewHolder : null;
                if (stickerTopBarBonusBalanceVh != null) {
                    stickerTopBarBonusBalanceVh.f = view;
                    stickerTopBarBonusBalanceVh.k5(LayoutInflater.from(view.getContext()), null, null);
                }
            }
            catalogViewHolder.N6(uIBlock6);
            this.H.N6(uIBlock);
            if (mzp0Var != null) {
                mzp0Var.d(null);
            }
            yw90 yw90Var = this.s;
            if (yw90Var != null) {
                yw90Var.a();
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        if (!(this.F.r instanceof vyh0)) {
            return false;
        }
        i8(alj.a);
        ModernSearchView modernSearchView = this.B.b.k;
        if (modernSearchView == null) {
            return true;
        }
        modernSearchView.j(false, false);
        return true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        View k5 = this.H.k5(layoutInflater, viewGroup, null);
        VkSearchQueryVh vkSearchQueryVh = this.B;
        vkSearchQueryVh.Ml(R.drawable.vk_icon_settings_outline_28, R.string.accessibility_settings);
        vkSearchQueryVh.Kf(new dj60(this, 25));
        View view = vkSearchQueryVh.r;
        if (view != null) {
            dhr0.a.e0(R.attr.vk_ui_header_background, view);
        } else if (view != null) {
            view.setBackground(null);
        }
        if (this.q) {
            vkSearchQueryVh.y8();
        }
        k5.post(new a(this, 14));
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            HashSet hashSet = iah0.a;
            if (fnj.b(context)) {
                vkSearchQueryVh.y8();
            }
        }
        this.A.setOnTouchListener(this);
        String str = this.u;
        if (str != null) {
            wda.e0(this, str, null, null, 12);
            i8(vyh0.a);
        }
        i8(ltz.a);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.H.L();
        this.C.b();
    }

    @Override // xsna.wda
    public final boolean c0() {
        return true;
    }

    @Override // xsna.wda
    public final void d0(String str, String str2, SearchInputMethod searchInputMethod) {
        this.x = str;
        this.y = str2;
        this.B.zf(str, false);
        SearchResultsVh.cb(this.A, str, str2, null, false, null, false, 60);
        this.H.b(true, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        return b5aVar.a.subscribe(new ux00(new qz40(this, 28), 20), new fv70(new nc90(15), 16));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.F.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        mzp0 mzp0Var;
        SwitchCatalogVh switchCatalogVh = this.F;
        if (epx.f(switchCatalogVh.r, bnn0Var)) {
            return;
        }
        if ((bnn0Var instanceof swp) && (mzp0Var = this.r) != null) {
            mzp0Var.f();
        }
        this.H.a(bnn0Var.equals(vyh0.a));
        switchCatalogVh.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        ViewGroup viewGroup;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        ModernSearchView modernSearchView;
        boolean z = bnn0Var instanceof vyh0;
        VkSearchQueryVh vkSearchQueryVh = this.B;
        if (!z && (modernSearchView = vkSearchQueryVh.b.k) != null) {
            if (!(bnn0Var instanceof ltz)) {
                modernSearchView.a();
            }
            modernSearchView.b(50L);
        }
        if (bnn0Var instanceof swp) {
            vkSearchQueryVh.hide();
        } else {
            vkSearchQueryVh.c(false);
        }
        ModernSearchView modernSearchView2 = vkSearchQueryVh.b.k;
        if (modernSearchView2 != null) {
            modernSearchView2.setEnabled(!(bnn0Var instanceof ltz));
        }
        boolean z2 = bnn0Var instanceof alj;
        StickerHidingToolbarVh stickerHidingToolbarVh = this.H;
        if (!z2) {
            if (z && (viewGroup = stickerHidingToolbarVh.h) != null) {
                viewGroup.saveHierarchyState(stickerHidingToolbarVh.m);
            }
            AppBarLayout appBarLayout3 = stickerHidingToolbarVh.i;
            if (appBarLayout3 != null) {
                appBarLayout3.removeView(stickerHidingToolbarVh.k);
            }
            stickerHidingToolbarVh.e.hide();
            return;
        }
        SparseArray<Parcelable> sparseArray = stickerHidingToolbarVh.m;
        LinearLayout linearLayout = stickerHidingToolbarVh.k;
        if (linearLayout != null && (((appBarLayout = stickerHidingToolbarVh.i) == null || appBarLayout.indexOfChild(linearLayout) < 0) && (appBarLayout2 = stickerHidingToolbarVh.i) != null)) {
            appBarLayout2.addView(linearLayout, 0);
        }
        stickerHidingToolbarVh.e.show();
        u4q0 u4q0Var = zik0.a;
        if (sparseArray.size() > 0) {
            ViewGroup viewGroup2 = stickerHidingToolbarVh.h;
            if (viewGroup2 != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            sparseArray.clear();
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        g380 g380Var;
        StickerHidingToolbarVh stickerHidingToolbarVh = this.H;
        Iterator it = stickerHidingToolbarVh.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CatalogViewHolder catalogViewHolder = (CatalogViewHolder) it.next();
            g380Var = catalogViewHolder instanceof g380 ? (g380) catalogViewHolder : null;
            if (g380Var != null) {
                g380Var.onConfigurationChanged(configuration);
            }
        }
        stickerHidingToolbarVh.f.onConfigurationChanged(configuration);
        TabLayoutVh tabLayoutVh = this.E;
        g380Var = tabLayoutVh != null ? tabLayoutVh : null;
        if (g380Var != null) {
            g380Var.onConfigurationChanged(configuration);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.E.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.E.onResume();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.v.a(this.x);
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        bnn0 bnn0Var = this.F.r;
        if (bnn0Var instanceof vyh0) {
            this.A.s();
        } else if (bnn0Var instanceof alj) {
            this.z.s();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.z.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.toolbar) {
            s();
            return;
        }
        if (i != R.id.search_suggestion) {
            this.m.b.b.c(false);
            return;
        }
        UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
        if (uIBlockSearchSuggestion != null) {
            SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
            wda.e0(this, searchSuggestion.c, searchSuggestion.f, null, 12);
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
