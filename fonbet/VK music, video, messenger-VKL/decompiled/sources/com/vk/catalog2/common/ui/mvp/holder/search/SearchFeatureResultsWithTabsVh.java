package com.vk.catalog2.common.ui.mvp.holder.search;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.RecyclerPaginatedView;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SearchFeatureResultsWithTabsVh.kt */
/* loaded from: classes16.dex */
public final class SearchFeatureResultsWithTabsVh implements CommonSearchResultsVh {
    public final TabsOrListVh b;
    public View c;

    public SearchFeatureResultsWithTabsVh(TabsOrListVh tabsOrListVh) {
        this.b = tabsOrListVh;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.b.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    /* renamed from: O0 */
    public final List<UIBlock> mo78O0() {
        return EmptyList.b;
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final String V() {
        return this.b.z;
    }

    @Override // com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh
    public final /* bridge */ /* synthetic */ RecyclerPaginatedView ck() {
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.b.k5(layoutInflater, viewGroup, bundle);
        this.c = k5;
        return k5;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.b.A.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        this.b.n.onPause();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        this.b.n.onResume();
    }

    @Override // xsna.rda
    public final void s() {
        this.b.s();
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
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
