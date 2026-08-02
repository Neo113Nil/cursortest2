package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.byh0;
import xsna.cn8;
import xsna.d2e0;
import xsna.drm0;
import xsna.e9h;
import xsna.izs;
import xsna.msy;
import xsna.nm60;
import xsna.pyh0;
import xsna.q60;
import xsna.s3q0;
import xsna.udr;
import xsna.vo50;
import xsna.xy2;
import xsna.z24;

/* compiled from: SearchContentVh.kt */
/* loaded from: classes16.dex */
public final class SearchContentVh implements SearchResultsVh, byh0 {
    public final SearchResultsVh b;
    public final SearchResultsVh c;
    public final int d;
    public final z24 e;
    public final q60 f;
    public final Object g;
    public View h;
    public c i;
    public SearchState j;
    public final String k;

    /* compiled from: SearchContentVh.kt */
    public final class a implements c {
        public final View a;
        public final FiltersWithSearchResultVh b;
        public final boolean c;

        public a(SearchContentVh searchContentVh, nm60 nm60Var, ViewGroup viewGroup, Bundle bundle) {
            FiltersWithSearchResultVh filtersWithSearchResultVh = new FiltersWithSearchResultVh(searchContentVh.b, new InitializedLazyImpl(new udr()), searchContentVh.e, searchContentVh.f, true);
            View k5 = filtersWithSearchResultVh.k5((LayoutInflater) nm60Var.c, viewGroup, bundle);
            viewGroup.addView(k5);
            this.a = k5;
            this.b = filtersWithSearchResultVh;
            this.c = true;
        }

        @Override // com.vk.catalog2.common.ui.holders.search.SearchContentVh.c
        public final void a(boolean z) {
            View view = this.a;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
        }

        @Override // com.vk.catalog2.common.ui.holders.search.SearchContentVh.c
        public final boolean b() {
            return this.c;
        }

        @Override // com.vk.catalog2.common.ui.holders.search.SearchContentVh.c
        public final void c(UIBlockList uIBlockList) {
            this.b.b(uIBlockList);
        }

        @Override // com.vk.catalog2.common.ui.holders.search.SearchContentVh.c
        public final void d() {
            this.b.a();
        }
    }

    /* compiled from: SearchContentVh.kt */
    public final class b implements c {
        public View a;
        public final bpn0 b;

        public b(SearchContentVh searchContentVh, e9h e9hVar, ViewGroup viewGroup, Bundle bundle) {
            this.b = new bpn0(new cn8(searchContentVh, this, e9hVar, viewGroup, bundle, 1));
        }

        @Override // com.vk.catalog2.common.ui.holders.search.SearchContentVh.c
        public final void a(boolean z) {
            if (z) {
                bpn0 bpn0Var = this.b;
                if (bpn0Var.isInitialized()) {
                } else {
                    bpn0Var.getValue();
                }
            }
            View view = this.a;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
        }

        @Override // com.vk.catalog2.common.ui.holders.search.SearchContentVh.c
        public final boolean b() {
            return this.b.isInitialized();
        }

        @Override // com.vk.catalog2.common.ui.holders.search.SearchContentVh.c
        public final void c(UIBlockList uIBlockList) {
            bpn0 bpn0Var = this.b;
            if (bpn0Var.isInitialized()) {
                ((FiltersWithSearchResultVh) bpn0Var.getValue()).b(uIBlockList);
            }
        }

        @Override // com.vk.catalog2.common.ui.holders.search.SearchContentVh.c
        public final void d() {
            bpn0 bpn0Var = this.b;
            if (bpn0Var.isInitialized()) {
                ((FiltersWithSearchResultVh) bpn0Var.getValue()).a();
            }
        }
    }

    /* compiled from: SearchContentVh.kt */
    public interface c {
        void a(boolean z);

        boolean b();

        void c(UIBlockList uIBlockList);

        void d();
    }

    /* compiled from: SearchContentVh.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchState.values().length];
            try {
                iArr[SearchState.Search.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchState.Suggestion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SearchContentVh() {
        throw null;
    }

    public SearchContentVh(SearchResultsVh searchResultsVh, SearchResultsVh searchResultsVh2, z24 z24Var, q60 q60Var) {
        this.b = searchResultsVh;
        this.c = searchResultsVh2;
        this.d = R.layout.catalog_root_vh_layout;
        this.e = z24Var;
        this.f = q60Var;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new vo50(15));
        this.j = SearchState.Suggestion;
        this.k = searchResultsVh2.dc();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final View H8() {
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            return this.b.H8();
        }
        if (i == 2) {
            return this.c.H8();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.L();
        this.c.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            this.b.N6(uIBlock);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.c.N6(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final UIBlockList O0() {
        SearchResultsVh searchResultsVh;
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            searchResultsVh = this.b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            searchResultsVh = this.c;
        }
        return searchResultsVh.O0();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final String V() {
        SearchResultsVh searchResultsVh;
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            searchResultsVh = this.b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            searchResultsVh = this.c;
        }
        return searchResultsVh.V();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void Zf(String str, String str2, SearchParams searchParams, boolean z, SearchInputMethod searchInputMethod, boolean z2) {
        c cVar;
        c cVar2;
        if (str.length() == 0 && (cVar2 = this.i) != null) {
            cVar2.d();
        }
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            SearchResultsVh.cb(this.c, str, str2, searchParams, false, searchInputMethod, !drm0.N(str), 8);
        } else {
            if (!str.equals(this.b.dc()) && (cVar = this.i) != null) {
                cVar.d();
            }
            this.b.Zf(str, str2, searchParams, z, searchInputMethod, false);
        }
    }

    @Override // xsna.byh0
    public final void a(izs<? super pyh0, ? extends xy2<BaseBoolIntDto>> izsVar) {
        this.b.a(izsVar);
    }

    public final void b() {
        View view = this.h;
        if (view != null) {
            view.setVisibility(this.j == SearchState.Suggestion ? 0 : 8);
        }
        c cVar = this.i;
        if (cVar != null) {
            cVar.a(this.j == SearchState.Search);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final RecyclerPaginatedView ck() {
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            return this.b.ck();
        }
        if (i == 2) {
            return this.c.ck();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void clear() {
        this.b.clear();
        this.c.clear();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final String dc() {
        return this.k;
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void f(boolean z) {
        SearchResultsVh searchResultsVh = this.b;
        searchResultsVh.onPause();
        c cVar = this.i;
        if (cVar != null) {
            cVar.d();
        }
        searchResultsVh.f(false);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c aVar;
        View inflate = layoutInflater.inflate(this.d, viewGroup, false);
        ViewGroup viewGroup2 = inflate instanceof ViewGroup ? (ViewGroup) inflate : null;
        if (viewGroup2 == null) {
            return inflate;
        }
        View k5 = this.c.k5(layoutInflater, viewGroup2, bundle);
        viewGroup2.addView(k5);
        this.h = k5;
        if (((Boolean) this.g.getValue()).booleanValue()) {
            View view = this.h;
            Context context = view != null ? view.getContext() : null;
            if (context == null) {
                throw new IllegalStateException("SuggestionView must be created by that time");
            }
            aVar = new b(this, new e9h(context, 4), viewGroup2, bundle);
        } else {
            aVar = new a(this, new nm60(layoutInflater, 17), viewGroup2, bundle);
        }
        this.i = aVar;
        b();
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.b.onConfigurationChanged(configuration);
        this.c.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            this.b.onPause();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.c.onPause();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            this.b.onResume();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.c.onResume();
        }
    }

    @Override // xsna.rda
    public final void s() {
        int i = d.$EnumSwitchMapping$0[this.j.ordinal()];
        if (i == 1) {
            this.b.s();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.c.s();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void setProgressDrawableFactory(d2e0 d2e0Var) {
        this.b.setProgressDrawableFactory(d2e0Var);
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
    /* renamed from: O0, reason: collision with other method in class */
    public final List<UIBlock> mo78O0() {
        return this.b.mo78O0();
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.search.SearchResultsVh
    public final void q7(String str, UIBlockSearchQuickFilter uIBlockSearchQuickFilter, izs<? super Boolean, s3q0> izsVar) {
    }
}
