package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vkontakte.android.R;

/* compiled from: ClipsMusicTemplatesCatalogHeaderShowAll.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicTemplatesCatalogHeaderShowAll extends HeaderShowAllVh {
    @Override // com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh, com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        ((TextView) k5.findViewById(R.id.title)).setTextSize(2, 19.0f);
        return k5;
    }
}
