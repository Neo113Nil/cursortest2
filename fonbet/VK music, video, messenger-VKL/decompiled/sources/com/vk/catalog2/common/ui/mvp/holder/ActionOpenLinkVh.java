package com.vk.catalog2.common.ui.mvp.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.util.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;

/* compiled from: ActionOpenLinkVh.kt */
/* loaded from: classes16.dex */
public final class ActionOpenLinkVh implements CatalogViewHolder, View.OnClickListener {
    public final a b;
    public final b5a c;
    public VkGroupItem d;
    public UIBlockAction e;

    public ActionOpenLinkVh(a aVar, b5a b5aVar) {
        this.b = aVar;
        this.c = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.f();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockActionOpenUrl) {
            UIBlockAction uIBlockAction = (UIBlockAction) uIBlock;
            this.e = uIBlockAction;
            VkGroupItem vkGroupItem = this.d;
            if (vkGroupItem == null) {
                vkGroupItem = null;
            }
            this.b.a(vkGroupItem, uIBlockAction);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_action_open_link, viewGroup, false);
        inflate.setOnClickListener(new c98(this, 1));
        this.d = (VkGroupItem) inflate.findViewById(R.id.button);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockAction uIBlockAction = this.e;
        if (uIBlockAction != null) {
            this.c.a(new cfp0(uIBlockAction, null));
            a.e(this.b, view.getContext(), uIBlockAction, uIBlockAction, null, 56);
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
