package com.vk.ecomm.catalog.impl.catalog.root;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.AnimSearchQueryVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.AnimStartSearchView;
import com.vkontakte.android.R;

/* compiled from: AnimSearchQueryButtonWrapperVH.kt */
/* loaded from: classes18.dex */
public final class AnimSearchQueryButtonWrapperVH implements CatalogViewHolder {
    public final AnimSearchQueryVh b;
    public View c;
    public View d;
    public View e;

    public AnimSearchQueryButtonWrapperVH(AnimSearchQueryVh animSearchQueryVh) {
        this.b = animSearchQueryVh;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.b.getClass();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_classified_button_wrapper_vh, viewGroup, false);
        this.c = inflate.findViewById(R.id.search_container_cart_button);
        this.d = inflate.findViewById(R.id.search_container_overflow_button);
        this.e = inflate.findViewById(R.id.search_container_bookmark_button);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.container_search);
        AnimSearchQueryVh animSearchQueryVh = this.b;
        viewGroup2.addView(animSearchQueryVh.k5(layoutInflater, viewGroup2, bundle));
        AnimStartSearchView animStartSearchView = animSearchQueryVh.g;
        if (animStartSearchView != null) {
            animStartSearchView.setMaxTextLength(255);
        }
        return inflate;
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
