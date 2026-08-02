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
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.f4m;

/* compiled from: MusicShimmerVh.kt */
/* loaded from: classes16.dex */
public final class MusicShimmerVh implements CatalogViewHolder {
    public final int b;
    public final Integer c;
    public final Integer d;
    public final int e;

    public /* synthetic */ MusicShimmerVh(int i) {
        this(i, R.layout.catalog_music_tracks_shimmer, null, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.e, viewGroup, false);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        ViewGroup.LayoutParams layoutParams = shimmerFrameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = e3m.a(this.b, shimmerFrameLayout.getContext());
        shimmerFrameLayout.setLayoutParams(layoutParams);
        Integer num = this.c;
        if (num != null) {
            int a = e3m.a(num.intValue(), shimmerFrameLayout.getContext());
            f4m.r(a, shimmerFrameLayout);
            f4m.s(a, shimmerFrameLayout);
        }
        Integer num2 = this.d;
        if (num2 != null) {
            int a2 = e3m.a(num2.intValue(), shimmerFrameLayout.getContext());
            f4m.t(a2, shimmerFrameLayout);
            f4m.q(a2, shimmerFrameLayout);
        }
        shimmerFrameLayout.c();
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    public MusicShimmerVh(int i, int i2, Integer num, Integer num2) {
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = i2;
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
