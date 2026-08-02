package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockLegalNotice;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;

/* compiled from: LegalNoticeVh.kt */
/* loaded from: classes16.dex */
public final class LegalNoticeVh implements CatalogViewHolder {
    public TextView b;
    public TextView c;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockLegalNotice) {
            TextView textView = this.b;
            if (textView == null) {
                textView = null;
            }
            UIBlockLegalNotice uIBlockLegalNotice = (UIBlockLegalNotice) uIBlock;
            textView.setText(uIBlockLegalNotice.y);
            TextView textView2 = this.c;
            (textView2 != null ? textView2 : null).setText(uIBlockLegalNotice.z);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_legal_notice, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
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
