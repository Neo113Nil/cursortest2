package com.vk.catalog2.common.ui.mvp.holder.group;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import xsna.oq;
import xsna.tlo0;

/* compiled from: CommunitiesVkUiPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class CommunitiesVkUiPlaceholderVh implements CatalogViewHolder {
    public VkPlaceholder b;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPlaceholder) {
            VkPlaceholder vkPlaceholder = this.b;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            String str = ((UIBlockPlaceholder) uIBlock).D;
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, str != null ? oq.d(tlo0.Companion, str) : null)));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkPlaceholder vkPlaceholder = new VkPlaceholder(layoutInflater.getContext(), null, 6, 0);
        vkPlaceholder.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.b = vkPlaceholder;
        return vkPlaceholder;
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
