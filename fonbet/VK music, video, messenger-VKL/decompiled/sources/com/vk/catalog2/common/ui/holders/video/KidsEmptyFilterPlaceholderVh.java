package com.vk.catalog2.common.ui.holders.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.ire;
import xsna.q3a;

/* compiled from: KidsEmptyFilterPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class KidsEmptyFilterPlaceholderVh implements CatalogViewHolder {
    public final q3a b;
    public String c;

    public KidsEmptyFilterPlaceholderVh(q3a q3aVar) {
        this.b = q3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.c = uIBlock.b;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_video_kids_filter_placeholder, viewGroup, false);
        bwt0.i0((VkButton) inflate.findViewById(R.id.video_kids_filters_reset_button), new ire(this, 23));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        this.c = uIBlock.b;
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
