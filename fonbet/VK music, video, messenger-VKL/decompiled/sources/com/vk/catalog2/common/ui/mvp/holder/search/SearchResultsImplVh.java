package com.vk.catalog2.common.ui.mvp.holder.search;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.toggle.features.SearchFeatures;
import java.util.ArrayList;
import java.util.List;
import xsna.ayn0;
import xsna.byh0;
import xsna.cog;
import xsna.cqm0;
import xsna.d2e0;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.kea;
import xsna.myc0;
import xsna.n0q0;
import xsna.pyh0;
import xsna.rd50;
import xsna.s3q0;
import xsna.set0;
import xsna.tju;
import xsna.wjf0;
import xsna.wzs;
import xsna.xy2;

/* compiled from: SearchResultsImplVh.kt */
/* loaded from: classes16.dex */
public final class SearchResultsImplVh implements SearchResultsVh, byh0, ResumableViewHolder {
    public final SearchRequestFactory b;
    public final kea c;
    public final CatalogBasePaginatedListVh d;
    public final n0q0 e;
    public final CatalogConfiguration f;
    public final SearchResultsVh.a g;
    public final rd50 h;
    public final wzs<Boolean, gzs<s3q0>, s3q0> i;
    public final set0 j;
    public final wzs<UIBlockSearchQuickFilter, izs<? super Boolean, s3q0>, s3q0> k;
    public ayn0 l;

    public SearchResultsImplVh() {
        throw null;
    }

    public SearchResultsImplVh(SearchRequestFactory searchRequestFactory, kea keaVar, CatalogBasePaginatedListVh catalogBasePaginatedListVh, VideoSearchFiltersImpl videoSearchFiltersImpl, n0q0 n0q0Var, CatalogConfiguration catalogConfiguration, wzs wzsVar, SearchResultsVh.a aVar, cog cogVar, int i) {
        videoSearchFiltersImpl = (i & 8) != 0 ? null : videoSearchFiltersImpl;
        n0q0Var = (i & 16) != 0 ? null : n0q0Var;
        catalogConfiguration = (i & 32) != 0 ? null : catalogConfiguration;
        wzsVar = (i & 64) != 0 ? null : wzsVar;
        aVar = (i & 128) != 0 ? new SearchResultsVh.a(false, 127) : aVar;
        cogVar = (i & 256) != 0 ? null : cogVar;
        rd50 rd50Var = new rd50();
        this.b = searchRequestFactory;
        this.c = keaVar;
        this.d = catalogBasePaginatedListVh;
        this.e = n0q0Var;
        this.f = catalogConfiguration;
        this.g = aVar;
        this.h = rd50Var;
        this.i = wzsVar;
        this.j = videoSearchFiltersImpl;
        this.k = cogVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final View H8() {
        return this.d.l();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        ((io.reactivex.rxjava3.disposables.b) this.h.c).e();
        this.d.L();
        ayn0 ayn0Var = this.l;
        if (ayn0Var != null) {
            ayn0Var.a();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.d.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final UIBlockList O0() {
        return this.c.l;
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final String V() {
        UIBlockList uIBlockList = this.c.l;
        if (uIBlockList != null) {
            return uIBlockList.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Zf(String str, String str2, SearchParams searchParams, boolean z, SearchInputMethod searchInputMethod, boolean z2) {
        boolean z3;
        boolean z4;
        boolean a;
        set0 l;
        Boolean bool;
        int length = str.length();
        set0 set0Var = this.j;
        if (length == 0 && set0Var != null) {
            set0Var.reset();
        }
        SearchRequestFactory searchRequestFactory = this.b;
        if (set0Var != null) {
            set0 l2 = searchRequestFactory.l();
            if (l2 != null) {
                VideoSearchFiltersImpl videoSearchFiltersImpl = (VideoSearchFiltersImpl) l2;
                bool = Boolean.valueOf(set0Var.d() == videoSearchFiltersImpl.d && set0Var.p() == videoSearchFiltersImpl.f && set0Var.v() == videoSearchFiltersImpl.e && epx.f(set0Var.j(), videoSearchFiltersImpl.l) && epx.f(set0Var.K(), videoSearchFiltersImpl.m) && epx.f(set0Var.k(), videoSearchFiltersImpl.n) && epx.f(set0Var.f(), videoSearchFiltersImpl.o));
            } else {
                bool = null;
            }
            if (bool != null) {
                z3 = bool.booleanValue();
                if (!z2 && myc0.f(str) && set0Var != null && (l = searchRequestFactory.l()) != null) {
                    ((VideoSearchFiltersImpl) l).R(set0Var);
                }
                boolean f = epx.f(searchRequestFactory.i, str2);
                SearchResultsVh.a aVar = this.g;
                z4 = (f || aVar.f) && epx.f(searchRequestFactory.e, str) && epx.f(searchRequestFactory.g, searchParams) && searchRequestFactory.m() == z && z3;
                if (z4 || searchRequestFactory.h || !z2) {
                    if (z4 || aVar.d) {
                        searchRequestFactory.i = str2 != null ? cqm0.a(str2) : null;
                        searchRequestFactory.n(z);
                        searchRequestFactory.e = str;
                        searchRequestFactory.g = searchParams != null ? searchParams.copy() : null;
                        searchRequestFactory.h = z2;
                        searchRequestFactory.o(searchInputMethod);
                        SearchFeatures searchFeatures = SearchFeatures.FIX_RECYCLER_BIND_ON_LAYOUT;
                        searchFeatures.getClass();
                        a = com.vk.toggle.b.A.a(searchFeatures);
                        CatalogBasePaginatedListVh catalogBasePaginatedListVh = this.d;
                        if (a) {
                            RecyclerPaginatedView recyclerPaginatedView = catalogBasePaginatedListVh.n;
                            wjf0.c((recyclerPaginatedView != null ? recyclerPaginatedView : null).getRecyclerView(), new tju(this, 26));
                            return;
                        } else {
                            if (aVar.a) {
                                catalogBasePaginatedListVh.clear();
                            }
                            f(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        z3 = true;
        if (!z2) {
            ((VideoSearchFiltersImpl) l).R(set0Var);
        }
        boolean f2 = epx.f(searchRequestFactory.i, str2);
        SearchResultsVh.a aVar2 = this.g;
        if (f2) {
            if (z4) {
            }
            if (z4) {
            }
            searchRequestFactory.i = str2 != null ? cqm0.a(str2) : null;
            searchRequestFactory.n(z);
            searchRequestFactory.e = str;
            searchRequestFactory.g = searchParams != null ? searchParams.copy() : null;
            searchRequestFactory.h = z2;
            searchRequestFactory.o(searchInputMethod);
            SearchFeatures searchFeatures2 = SearchFeatures.FIX_RECYCLER_BIND_ON_LAYOUT;
            searchFeatures2.getClass();
            a = com.vk.toggle.b.A.a(searchFeatures2);
            CatalogBasePaginatedListVh catalogBasePaginatedListVh2 = this.d;
            if (a) {
            }
        }
        if (z4) {
        }
        if (z4) {
        }
        searchRequestFactory.i = str2 != null ? cqm0.a(str2) : null;
        searchRequestFactory.n(z);
        searchRequestFactory.e = str;
        searchRequestFactory.g = searchParams != null ? searchParams.copy() : null;
        searchRequestFactory.h = z2;
        searchRequestFactory.o(searchInputMethod);
        SearchFeatures searchFeatures22 = SearchFeatures.FIX_RECYCLER_BIND_ON_LAYOUT;
        searchFeatures22.getClass();
        a = com.vk.toggle.b.A.a(searchFeatures22);
        CatalogBasePaginatedListVh catalogBasePaginatedListVh22 = this.d;
        if (a) {
        }
    }

    @Override // xsna.byh0
    public final void a(izs<? super pyh0, ? extends xy2<BaseBoolIntDto>> izsVar) {
        this.h.a(izsVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final RecyclerPaginatedView ck() {
        return this.d.l();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void clear() {
        SearchRequestFactory searchRequestFactory = this.b;
        searchRequestFactory.e = null;
        searchRequestFactory.g = null;
        this.c.c();
        this.d.clear();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final String dc() {
        return this.b.e;
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void f(boolean z) {
        kea keaVar = this.c;
        io.reactivex.rxjava3.disposables.c cVar = keaVar.f;
        if (cVar != null) {
            cVar.dispose();
        }
        SearchResultsVh.a aVar = this.g;
        boolean z2 = aVar.a;
        CatalogBasePaginatedListVh catalogBasePaginatedListVh = this.d;
        if (z2) {
            keaVar.c();
            keaVar.o();
            RecyclerPaginatedView l = catalogBasePaginatedListVh.l();
            if (l != null) {
                l.e0();
                return;
            }
            return;
        }
        kea.w(keaVar, aVar.b, null, false, 2);
        RecyclerPaginatedView l2 = catalogBasePaginatedListVh.l();
        if (l2 != null) {
            UIBlockList uIBlockList = keaVar.l;
            ArrayList<UIBlock> arrayList = uIBlockList != null ? uIBlockList.y : null;
            if (arrayList == null || arrayList.isEmpty()) {
                l2.e0();
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    @SuppressLint({"ClickableViewAccessibility"})
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerPaginatedView l;
        RecyclerPaginatedView l2;
        RecyclerView recyclerView;
        CatalogConfiguration catalogConfiguration;
        CatalogBasePaginatedListVh catalogBasePaginatedListVh = this.d;
        final View k5 = catalogBasePaginatedListVh.k5(layoutInflater, viewGroup, bundle);
        RecyclerPaginatedView l3 = catalogBasePaginatedListVh.l();
        if (l3 != null && (recyclerView = l3.getRecyclerView()) != null && (catalogConfiguration = this.f) != null) {
            catalogConfiguration.T(recyclerView);
        }
        RecyclerPaginatedView l4 = catalogBasePaginatedListVh.l();
        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = l4 instanceof CatalogRecyclerPaginatedView ? (CatalogRecyclerPaginatedView) l4 : null;
        if (catalogRecyclerPaginatedView != null) {
            catalogRecyclerPaginatedView.setCustomFooterLoadingAction(this.i);
        }
        this.l = catalogBasePaginatedListVh.Pa();
        SearchResultsVh.a aVar = this.g;
        if (aVar.c && (l2 = catalogBasePaginatedListVh.l()) != null) {
            l2.e0();
        }
        SearchFeatures searchFeatures = SearchFeatures.SEARCH_INSIDE_COMMUNITY;
        searchFeatures.getClass();
        if (com.vk.toggle.b.A.a(searchFeatures) && (l = catalogBasePaginatedListVh.l()) != null) {
            l.setIgnoreRequestChildRectangleOnScreen(Boolean.TRUE);
        }
        if (aVar.e) {
            setOnTouchListener(new View.OnTouchListener() { // from class: xsna.iyh0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    mhy.d(k5.getRootView());
                    return false;
                }
            });
        }
        return k5;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        ayn0 ayn0Var = this.l;
        if (ayn0Var != null) {
            ayn0Var.b();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        this.d.onPause();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        n0q0 n0q0Var = this.e;
        if (n0q0Var != null) {
            UiTracker.h(n0q0Var);
        }
        this.d.onResume();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void q7(String str, UIBlockSearchQuickFilter uIBlockSearchQuickFilter, izs<? super Boolean, s3q0> izsVar) {
        set0 l;
        Integer num;
        this.d.onPause();
        SearchRequestFactory searchRequestFactory = this.b;
        searchRequestFactory.i = null;
        wzs<UIBlockSearchQuickFilter, izs<? super Boolean, s3q0>, s3q0> wzsVar = this.k;
        if (wzsVar != null) {
            wzsVar.invoke(uIBlockSearchQuickFilter, izsVar);
            f(false);
            return;
        }
        set0 set0Var = this.j;
        if (uIBlockSearchQuickFilter == null) {
            if (set0Var != null) {
                set0Var.C();
            }
            if (set0Var != null) {
                set0Var.l();
            }
            if (set0Var != null) {
                set0Var.reset();
            }
            izsVar.invoke(Boolean.TRUE);
            set0 l2 = searchRequestFactory.l();
            if (l2 != null) {
                ((VideoSearchFiltersImpl) l2).reset();
            }
            f(false);
            return;
        }
        SearchQuickFilterItem searchQuickFilterItem = uIBlockSearchQuickFilter.A;
        switch (str.hashCode()) {
            case -1992012396:
                if (str.equals("duration")) {
                    String str2 = ((SearchQuickInnerFilterItem) j5g.Y(searchQuickFilterItem.n)).e;
                    if (set0Var != null) {
                        Integer F = set0Var.F(str2);
                        set0Var.C0(F != null ? F.intValue() : -1);
                    }
                    if (set0Var != null) {
                        set0Var.M(str2);
                        break;
                    }
                }
                break;
            case -1406328437:
                if (str.equals("author") && set0Var != null) {
                    set0Var.u(!searchQuickFilterItem.h);
                    break;
                }
                break;
            case 3324:
                if (str.equals("hd") && set0Var != null) {
                    set0Var.G(!searchQuickFilterItem.h);
                    break;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    if (set0Var != null) {
                        set0Var.o(0, 0);
                    }
                    if (set0Var != null) {
                        set0Var.b(null);
                        break;
                    }
                }
                break;
            case 3536286:
                if (str.equals("sort") && (num = ((SearchQuickInnerFilterItem) j5g.Y(searchQuickFilterItem.n)).f) != null) {
                    int intValue = num.intValue();
                    if (set0Var != null) {
                        set0Var.n(intValue);
                    }
                    if (set0Var != null) {
                        set0Var.i(String.valueOf(intValue));
                        break;
                    }
                }
                break;
            case 831846208:
                if (str.equals("content_type")) {
                    List<SearchQuickInnerFilterItem> list = searchQuickFilterItem.n;
                    boolean z = searchQuickFilterItem.h;
                    SearchQuickInnerFilterItem searchQuickInnerFilterItem = (SearchQuickInnerFilterItem) j5g.a0(list);
                    String str3 = searchQuickInnerFilterItem != null ? searchQuickInnerFilterItem.e : null;
                    if (str3 == null) {
                        if (set0Var != null) {
                            set0Var.u(!z);
                        }
                        if (!z) {
                            if (set0Var != null) {
                                set0Var.a(searchQuickFilterItem.f);
                                break;
                            }
                        } else if (set0Var != null) {
                            set0Var.a(null);
                            break;
                        }
                    } else {
                        if (set0Var != null) {
                            Integer F2 = set0Var.F(str3);
                            set0Var.g(F2 != null ? F2.intValue() : -1);
                        }
                        if (set0Var != null) {
                            set0Var.a(str3);
                            break;
                        }
                    }
                }
                break;
        }
        if (set0Var != null && (l = searchRequestFactory.l()) != null) {
            ((VideoSearchFiltersImpl) l).R(set0Var);
        }
        izsVar.invoke(Boolean.valueOf(set0Var != null ? set0Var.I() : true));
        f(false);
    }

    @Override // xsna.rda
    public final void s() {
        this.d.s();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        RecyclerPaginatedView l = this.d.l();
        if (l != null) {
            l.b(onTouchListener);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void setProgressDrawableFactory(d2e0 d2e0Var) {
        RecyclerPaginatedView l = this.d.l();
        if (l != null) {
            l.setProgressDrawableFactory(d2e0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    /* renamed from: O0 */
    public final List<UIBlock> mo78O0() {
        return j5g.O0(this.d.h.d);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
