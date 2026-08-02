package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: MusicKidsArtistsShimmerVh.kt */
/* loaded from: classes16.dex */
public final class MusicKidsArtistsShimmerVh implements CatalogViewHolder {
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(layoutInflater.getContext(), null, 6);
        LinearLayout linearLayout = new LinearLayout(shimmerFrameLayout.getContext());
        linearLayout.setOrientation(0);
        for (int i = 0; i < 8; i++) {
            linearLayout.addView(viewGroup != null ? bwt0.I(R.layout.catalog_music_artist_shimmer, viewGroup, false) : null);
        }
        shimmerFrameLayout.addView(linearLayout);
        shimmerFrameLayout.c();
        return shimmerFrameLayout;
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
