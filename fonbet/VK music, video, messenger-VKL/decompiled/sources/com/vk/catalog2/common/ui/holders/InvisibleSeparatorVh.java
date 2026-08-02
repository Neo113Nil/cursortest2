package com.vk.catalog2.common.ui.holders;

import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vkontakte.android.R;

/* compiled from: InvisibleSeparatorVh.kt */
/* loaded from: classes16.dex */
public final class InvisibleSeparatorVh extends SeparatorVh {
    public InvisibleSeparatorVh() {
        super(R.layout.catalog_separator_island_transparent, null, R.attr.vk_ui_transparent, 2);
    }

    @Override // com.vk.catalog2.common.ui.holders.SeparatorVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        View view = this.e;
        if (view == null) {
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
        super.N6(uIBlock);
    }
}
