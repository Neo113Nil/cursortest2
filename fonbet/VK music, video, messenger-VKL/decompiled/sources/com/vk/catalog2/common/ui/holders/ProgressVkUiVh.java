package com.vk.catalog2.common.ui.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: ProgressVkUiVh.kt */
/* loaded from: classes16.dex */
public final class ProgressVkUiVh extends ProgressVh {
    public ProgressVkUiVh() {
        super((Object) null);
    }

    @Override // com.vk.catalog2.common.ui.holders.ProgressVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.catalog_vk_ui_spinner, viewGroup, false);
    }
}
