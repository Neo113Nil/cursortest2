package com.vk.catalog2.common.ui.holders.search;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.drm0;
import xsna.ysg0;

/* compiled from: ActionOpenSearchTabVh.kt */
/* loaded from: classes16.dex */
public final class ActionOpenSearchTabVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public VkGroupItem c;
    public UIBlockActionOpenSearchTab d;

    public ActionOpenSearchTabVh(b5a b5aVar) {
        this.b = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlock instanceof UIBlockActionOpenSearchTab ? (UIBlockActionOpenSearchTab) uIBlock : null;
        if (uIBlockActionOpenSearchTab == null) {
            return;
        }
        this.d = uIBlockActionOpenSearchTab;
        VkGroupItem vkGroupItem = this.c;
        if (vkGroupItem == null) {
            return;
        }
        String str = ((UIBlockActionOpenSearchTab) uIBlock).z;
        if (!drm0.N(str)) {
            vkGroupItem.setText(str);
        }
        vkGroupItem.setRightIconType(VkGroupItem.IconType.Chevron);
        VkGroupItem.b(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_chevron_16), null, 6);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_action_open_show_all, viewGroup, false);
        inflate.findViewById(R.id.button).setOnClickListener(new c98(this, 1));
        this.c = (VkGroupItem) inflate.findViewById(R.id.button_text);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = this.d;
        if (uIBlockActionOpenSearchTab != null) {
            this.b.a(new cfp0(uIBlockActionOpenSearchTab, null));
            ysg0.b.a(new UIBlockActionOpenSearchTab.a(uIBlockActionOpenSearchTab.A));
        }
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
