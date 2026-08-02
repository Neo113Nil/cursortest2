package com.vk.catalog2.common.ui.mvp.holder.search;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.RecyclerPaginatedView;
import java.util.List;
import xsna.ayn0;
import xsna.j5g;

/* compiled from: SearchFeatureResultsVh.kt */
/* loaded from: classes16.dex */
public final class SearchFeatureResultsVh implements CommonSearchResultsVh {
    public final CatalogBasePaginatedListVh b;
    public final CatalogConfiguration c;
    public ayn0 d;

    public SearchFeatureResultsVh(CatalogBasePaginatedListVh catalogBasePaginatedListVh, CatalogConfiguration catalogConfiguration) {
        this.b = catalogBasePaginatedListVh;
        this.c = catalogConfiguration;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.L();
        ayn0 ayn0Var = this.d;
        if (ayn0Var != null) {
            ayn0Var.a();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.b.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    /* renamed from: O0 */
    public final List<UIBlock> mo78O0() {
        return j5g.O0(this.b.h.d);
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final String V() {
        UIBlock uIBlock = (UIBlock) j5g.a0(j5g.O0(this.b.h.d));
        if (uIBlock != null) {
            return uIBlock.c;
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final RecyclerPaginatedView ck() {
        RecyclerPaginatedView recyclerPaginatedView = this.b.n;
        if (recyclerPaginatedView != null) {
            return recyclerPaginatedView;
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CatalogBasePaginatedListVh catalogBasePaginatedListVh = this.b;
        View k5 = catalogBasePaginatedListVh.k5(layoutInflater, viewGroup, bundle);
        RecyclerView recyclerView = ck().getRecyclerView();
        CatalogConfiguration catalogConfiguration = this.c;
        if (catalogConfiguration != null) {
            catalogConfiguration.T(recyclerView);
        }
        this.d = catalogBasePaginatedListVh.Pa();
        return k5;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        ayn0 ayn0Var = this.d;
        if (ayn0Var != null) {
            ayn0Var.b();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        this.b.onPause();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        this.b.onResume();
    }

    @Override // xsna.rda
    public final void s() {
        this.b.s();
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        RecyclerPaginatedView recyclerPaginatedView = this.b.n;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        recyclerPaginatedView.b(onTouchListener);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
