package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vkontakte.android.R;
import xsna.f4m;
import xsna.fpf0;
import xsna.k7m;
import xsna.m7m;

/* compiled from: MusicKidsCollectionShimmerVh.kt */
/* loaded from: classes16.dex */
public final class MusicKidsCollectionShimmerVh implements CatalogViewHolder {
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_kids_collection_shimmer, viewGroup, false);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(R.id.shimmer);
        if (((MusicKidsModeComponent) ((k7m) m7m.c(inflate)).a(fpf0.a(MusicKidsModeComponent.class))).n().isEnabled().getValue().booleanValue()) {
            f4m.j(inflate.findViewById(R.id.wide_horizontal_shimmer_view));
        }
        shimmerFrameLayout.c();
        return inflate;
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
