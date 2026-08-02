package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.TitleIcon;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MusicSnippetShimmerVh.kt */
/* loaded from: classes16.dex */
public final class MusicSnippetShimmerVh implements CatalogViewHolder {
    public TextView b;
    public TextView c;
    public ThumbsImageView d;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPlaceholder) {
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(((UIBlockPlaceholder) uIBlock).A);
            }
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setText(((UIBlockPlaceholder) uIBlock).D);
            }
            ThumbsImageView thumbsImageView = this.d;
            if (thumbsImageView != null) {
                Serializer.c<RadioStation> cVar = RadioStation.CREATOR;
                TitleIcon titleIcon = ((UIBlockPlaceholder) uIBlock).L;
                thumbsImageView.setThumb(RadioStation.a.a(titleIcon != null ? titleIcon.b : null));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_snippets_entry_point_shimmer, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.snippet_title);
        this.c = (TextView) inflate.findViewById(R.id.snippet_subtitle);
        this.d = (ThumbsImageView) inflate.findViewById(R.id.snippet_sign);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(R.id.shimmer);
        ViewGroup.LayoutParams layoutParams = shimmerFrameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = e3m.a(R.dimen.music_catalog_shimmer_height_snippet_banner, inflate.getContext());
        shimmerFrameLayout.setLayoutParams(layoutParams);
        shimmerFrameLayout.c();
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
