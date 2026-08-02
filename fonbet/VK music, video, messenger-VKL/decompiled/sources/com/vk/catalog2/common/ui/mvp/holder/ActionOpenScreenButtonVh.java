package com.vk.catalog2.common.ui.mvp.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.ams;
import xsna.c98;

/* compiled from: ActionOpenScreenButtonVh.kt */
/* loaded from: classes16.dex */
public final class ActionOpenScreenButtonVh implements CatalogViewHolder, View.OnClickListener {
    public TextView b;
    public UIBlockActionOpenScreen c;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockActionOpenScreen) {
            TextView textView = this.b;
            if (textView == null) {
                textView = null;
            }
            UIBlockActionOpenScreen uIBlockActionOpenScreen = (UIBlockActionOpenScreen) uIBlock;
            textView.setText(uIBlockActionOpenScreen.z);
            this.c = uIBlockActionOpenScreen;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_action_list_item_button, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.button);
        this.b = textView;
        textView.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionOpenScreen uIBlockActionOpenScreen;
        String str;
        if (view == null || (uIBlockActionOpenScreen = this.c) == null || (str = uIBlockActionOpenScreen.A) == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1822967846) {
            if (str.equals("recommendations")) {
                ams.a().a(view.getContext(), true);
            }
        } else if (hashCode == -1209078378) {
            if (str.equals("birthdays")) {
                ams.a().h(view.getContext());
            }
        } else if (hashCode == -1004912850 && str.equals("friends_requests")) {
            ams.a().m(view.getContext());
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
