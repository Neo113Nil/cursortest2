package com.vk.catalog2.common.ui.mvp.holder.music;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.holders.MusicPlaylistVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.cho;

/* compiled from: MusicPlaylistChartListVh.kt */
/* loaded from: classes16.dex */
public final class MusicPlaylistChartListVh implements CatalogViewHolder, View.OnClickListener, cho {
    public final MusicPlaylistVh b;
    public TextView c;

    public MusicPlaylistChartListVh(MusicPlaylistVh musicPlaylistVh) {
        this.b = musicPlaylistVh;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicPlaylist) {
            this.b.N6(uIBlock);
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(String.valueOf(((UIBlockMusicPlaylist) uIBlock).y));
            }
        }
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        this.b.d(z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.b.k5(layoutInflater, viewGroup, bundle);
        this.c = (TextView) k5.findViewById(R.id.playlist_number);
        return k5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.onClick(view);
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
