package com.vk.catalog2.common.ui.mvp.holder.music;

import android.content.Context;
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
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import xsna.c9b0;
import xsna.cho;
import xsna.e43;
import xsna.ey2;
import xsna.xx1;

/* compiled from: MusicPlaylistChartGridVh.kt */
/* loaded from: classes16.dex */
public final class MusicPlaylistChartGridVh implements CatalogViewHolder, View.OnClickListener, cho {
    public final MusicPlaylistVh b;
    public View c;
    public TextView d;
    public TextView e;
    public TextView f;

    public MusicPlaylistChartGridVh(MusicPlaylistVh musicPlaylistVh) {
        this.b = musicPlaylistVh;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Context context;
        CharSequence d;
        if (uIBlock instanceof UIBlockMusicPlaylist) {
            this.b.N6(uIBlock);
            UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
            Playlist playlist = uIBlockMusicPlaylist.z;
            TextView textView = this.d;
            if (textView != null) {
                textView.setText(String.valueOf(uIBlockMusicPlaylist.y));
            }
            TextView textView2 = this.e;
            if (textView2 != null) {
                View view = this.c;
                if ((view == null || (context = view.getContext()) == null) && (context = e43.a) == null) {
                    context = null;
                }
                if (xx1.u(playlist)) {
                    d = playlist.i;
                    if (d == null) {
                        d = "";
                    }
                } else {
                    d = (xx1.x(playlist) && xx1.w(playlist)) ? c9b0.d(context, playlist) : c9b0.g(context, playlist);
                }
                ey2.i(textView2, d);
            }
            TextView textView3 = this.f;
            if (textView3 != null) {
                ey2.i(textView3, playlist.h);
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
        this.c = k5;
        this.d = (TextView) k5.findViewById(R.id.playlist_title);
        this.e = (TextView) k5.findViewById(R.id.playlist_snippet1);
        this.f = (TextView) k5.findViewById(R.id.playlist_snippet2);
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
