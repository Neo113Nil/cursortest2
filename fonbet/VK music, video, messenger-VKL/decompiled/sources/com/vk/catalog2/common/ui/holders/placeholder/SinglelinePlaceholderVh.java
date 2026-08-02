package com.vk.catalog2.common.ui.holders.placeholder;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: SinglelinePlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class SinglelinePlaceholderVh implements CatalogViewHolder {
    public TextView b;
    public View c;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPlaceholder) {
            String str = ((UIBlockPlaceholder) uIBlock).D;
            Spanned fromHtml = str != null ? Html.fromHtml(str, 0) : null;
            TextView textView = this.b;
            if (textView == null) {
                textView = null;
            }
            textView.setText(fromHtml);
            View view = this.c;
            bwt0.Q(view != null ? view : null, R.id.catalog_ui_test_placeholder, uIBlock.b);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_singleline_placeholder_view, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.catalog_placeholder_view_text);
        this.c = inflate;
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
