package com.vk.catalog2.common.ui.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionExpandBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.buz;
import xsna.c98;
import xsna.cfp0;
import xsna.drm0;
import xsna.p00;
import xsna.q3a;
import xsna.r9;

/* compiled from: ActionExpandBlockVh.kt */
/* loaded from: classes16.dex */
public final class ActionExpandBlockVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final q3a c;
    public VkGroupItem d;
    public UIBlockActionExpandBlock e;

    public ActionExpandBlockVh(q3a q3aVar, b5a b5aVar) {
        this.b = b5aVar;
        this.c = q3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionExpandBlock uIBlockActionExpandBlock = uIBlock instanceof UIBlockActionExpandBlock ? (UIBlockActionExpandBlock) uIBlock : null;
        if (uIBlockActionExpandBlock == null) {
            return;
        }
        this.e = uIBlockActionExpandBlock;
        VkGroupItem vkGroupItem = this.d;
        if (vkGroupItem == null) {
            return;
        }
        String str = ((UIBlockActionExpandBlock) uIBlock).z;
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
        this.d = (VkGroupItem) inflate.findViewById(R.id.button_text);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionExpandBlock uIBlockActionExpandBlock = this.e;
        if (uIBlockActionExpandBlock != null) {
            this.b.a(new cfp0(uIBlockActionExpandBlock, null));
            this.c.b(new buz(12, new r9(uIBlockActionExpandBlock, 1), new p00(uIBlockActionExpandBlock, 0)), false);
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
