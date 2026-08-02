package com.vk.catalog2.common.ui.mvp.holder.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vkontakte.android.R;
import xsna.jjc;
import xsna.prd0;
import xsna.wtm0;

/* compiled from: ProfileBlockFilterVh.kt */
/* loaded from: classes16.dex */
public final class ProfileBlockFilterVh implements CatalogViewHolder {
    public final wtm0 b;
    public VkSubnavigationButton c;

    public ProfileBlockFilterVh(wtm0 wtm0Var) {
        this.b = wtm0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockActionFilter) {
            VkSubnavigationButton vkSubnavigationButton = this.c;
            if (vkSubnavigationButton != null) {
                vkSubnavigationButton.setLabel(((UIBlockActionFilter) uIBlock).z.c);
            }
            VkSubnavigationButton vkSubnavigationButton2 = this.c;
            if (vkSubnavigationButton2 != null) {
                vkSubnavigationButton2.setActive(((UIBlockActionFilter) uIBlock).z.e);
            }
            VkSubnavigationButton vkSubnavigationButton3 = this.c;
            if (vkSubnavigationButton3 != null) {
                jjc.g(vkSubnavigationButton3, new prd0(1, this, uIBlock));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_profile_block_filter, viewGroup, false);
        VkSubnavigationButton vkSubnavigationButton = (VkSubnavigationButton) inflate.findViewById(R.id.filter_btn);
        this.c = vkSubnavigationButton;
        if (vkSubnavigationButton != null) {
            vkSubnavigationButton.setMode(SubnavigationButton.Mode.Outline);
        }
        VkSubnavigationButton vkSubnavigationButton2 = this.c;
        if (vkSubnavigationButton2 != null) {
            vkSubnavigationButton2.setAppearance(SubnavigationButton.Appearance.Neutral);
        }
        VkSubnavigationButton vkSubnavigationButton3 = this.c;
        if (vkSubnavigationButton3 != null) {
            vkSubnavigationButton3.setSize(SubnavigationButton.Size.Small);
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
