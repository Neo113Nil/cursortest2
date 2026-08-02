package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MusicTextShimmer.kt */
/* loaded from: classes16.dex */
public final class MusicTextShimmer implements CatalogViewHolder {
    public final int b;

    public MusicTextShimmer(int i) {
        this.b = i;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        VkTextSkeleton vkTextSkeleton = new VkTextSkeleton(layoutInflater.getContext(), null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context = vkTextSkeleton.getContext();
        int i = R.dimen.vk_ui_spacing_size2_xl;
        layoutParams.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size2_xl, context));
        layoutParams.setMarginEnd(e3m.a(R.dimen.vk_ui_spacing_size2_xl, vkTextSkeleton.getContext()));
        Context context2 = vkTextSkeleton.getContext();
        int i2 = R.dimen.vk_ui_spacing_size_xl;
        int i3 = this.b;
        if (i3 == 2132019153) {
            i = R.dimen.vk_ui_spacing_size4_xl;
        } else if (i3 != 2132019624 && i3 != 2132019157) {
            i = R.dimen.vk_ui_spacing_size_xl;
        }
        int a = e3m.a(i, context2);
        Context context3 = vkTextSkeleton.getContext();
        if (i3 != 2132019153) {
            if (i3 != 2132019624) {
                if (i3 == 2132019157) {
                    i2 = R.dimen.vk_ui_spacing_size_m;
                }
            }
            int a2 = e3m.a(i2, context3);
            layoutParams.topMargin = a;
            layoutParams.bottomMargin = a2;
            vkTextSkeleton.setLayoutParams(layoutParams);
            vkTextSkeleton.setTextAppearance(i3);
            vkTextSkeleton.setLines(1);
            vkTextSkeleton.setSingleLineWidth(e3m.a(R.dimen.music_catalog_shimmer_header_width, vkTextSkeleton.getContext()));
            frameLayout.addView(vkTextSkeleton);
            return frameLayout;
        }
        i2 = R.dimen.vk_ui_spacing_size_l;
        int a22 = e3m.a(i2, context3);
        layoutParams.topMargin = a;
        layoutParams.bottomMargin = a22;
        vkTextSkeleton.setLayoutParams(layoutParams);
        vkTextSkeleton.setTextAppearance(i3);
        vkTextSkeleton.setLines(1);
        vkTextSkeleton.setSingleLineWidth(e3m.a(R.dimen.music_catalog_shimmer_header_width, vkTextSkeleton.getContext()));
        frameLayout.addView(vkTextSkeleton);
        return frameLayout;
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
