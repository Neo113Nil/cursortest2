package com.vk.catalog2.common.ui.mvp.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vkontakte.android.R;
import xsna.c98;
import xsna.xwk;

/* compiled from: ActionAdvButtonVh.kt */
/* loaded from: classes16.dex */
public final class ActionAdvButtonVh implements CatalogViewHolder, View.OnClickListener {
    public ImageView b;
    public TextView c;
    public UIBlockActionOpenUrl d;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockActionOpenUrl) {
            TextView textView = this.c;
            if (textView == null) {
                textView = null;
            }
            UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) uIBlock;
            textView.setText(uIBlockActionOpenUrl.z);
            ImageView imageView = this.b;
            (imageView != null ? imageView : null).setImageResource(R.drawable.vk_icon_advertising_outline_28);
            this.d = uIBlockActionOpenUrl;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_action_list_item_adv_button, viewGroup, false);
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.b = (ImageView) inflate.findViewById(R.id.image);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = this.d;
        String str = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.f : null;
        ActionOpenUrl actionOpenUrl = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.A : null;
        if (str == null || actionOpenUrl == null) {
            return;
        }
        xwk.d().h(view.getContext(), actionOpenUrl, str);
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
