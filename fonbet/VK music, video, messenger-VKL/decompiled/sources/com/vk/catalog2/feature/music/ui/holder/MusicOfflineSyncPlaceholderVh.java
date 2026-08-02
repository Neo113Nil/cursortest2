package com.vk.catalog2.feature.music.ui.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockOfflineSyncPlaceholder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.dii;

/* compiled from: MusicOfflineSyncPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class MusicOfflineSyncPlaceholderVh implements CatalogViewHolder {
    public ComposeView b;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ComposeView composeView;
        if ((uIBlock instanceof UIBlockOfflineSyncPlaceholder) && (composeView = this.b) != null) {
            composeView.setContent(dii.b);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_offline_sync_placeholder_view, viewGroup, false);
        this.b = (ComposeView) inflate.findViewById(R.id.catalog_placeholder);
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
