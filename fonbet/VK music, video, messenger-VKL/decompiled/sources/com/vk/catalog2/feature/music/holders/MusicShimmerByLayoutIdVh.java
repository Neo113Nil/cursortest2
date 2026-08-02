package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import xsna.f4m;

/* compiled from: MusicShimmerByLayoutIdVh.kt */
/* loaded from: classes16.dex */
public final class MusicShimmerByLayoutIdVh implements CatalogViewHolder, CatalogVisibleViewHolder {
    public final int b;
    public View c;

    public MusicShimmerByLayoutIdVh(int i) {
        this.b = i;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        View view = this.c;
        if (view != null) {
            f4m.j(view);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        ((ShimmerFrameLayout) inflate.findViewById(R.id.shimmer)).c();
        this.c = inflate;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
