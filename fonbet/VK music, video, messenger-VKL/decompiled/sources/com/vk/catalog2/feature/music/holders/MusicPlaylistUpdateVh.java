package com.vk.catalog2.feature.music.holders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylistUpdate;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.AudioFollowingsUpdateItem;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.b780;
import xsna.c98;
import xsna.e3m;
import xsna.iah0;
import xsna.maz;
import xsna.xwk;

/* compiled from: MusicPlaylistUpdateVh.kt */
/* loaded from: classes16.dex */
public final class MusicPlaylistUpdateVh implements CatalogViewHolder, View.OnClickListener {
    public UIBlockMusicPlaylistUpdate b;
    public View c;
    public VKImageView d;
    public TextView e;
    public TextView f;
    public TextView g;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        if (uIBlock instanceof UIBlockMusicPlaylistUpdate) {
            UIBlockMusicPlaylistUpdate uIBlockMusicPlaylistUpdate = (UIBlockMusicPlaylistUpdate) uIBlock;
            AudioFollowingsUpdateItem audioFollowingsUpdateItem = uIBlockMusicPlaylistUpdate.y;
            this.b = uIBlockMusicPlaylistUpdate;
            VKImageView vKImageView = this.d;
            if (vKImageView != null) {
                Thumb thumb = audioFollowingsUpdateItem.g;
                if (thumb != null) {
                    int z = iah0.z(vKImageView.getContext());
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    str = thumb.Ab(z, false);
                } else {
                    str = null;
                }
                vKImageView.s0(str);
            }
            TextView textView = this.e;
            if (textView != null) {
                textView.setText(audioFollowingsUpdateItem.c);
            }
            TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.setText(audioFollowingsUpdateItem.d);
            }
            TextView textView3 = this.g;
            if (textView3 != null) {
                textView3.setText(audioFollowingsUpdateItem.e);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_playlist_update, viewGroup, false);
        this.c = inflate;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.playlist_image);
        vKImageView.setOnClickListener(new c98(this, 1));
        vKImageView.W();
        vKImageView.setOnLoadCallback(new a(vKImageView));
        this.d = vKImageView;
        this.e = (TextView) inflate.findViewById(R.id.playlist_title);
        this.f = (TextView) inflate.findViewById(R.id.playlist_subtitle);
        this.g = (TextView) inflate.findViewById(R.id.playlist_description);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockMusicPlaylistUpdate uIBlockMusicPlaylistUpdate;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockMusicPlaylistUpdate = this.b) == null) {
            return;
        }
        maz e = xwk.d().e();
        String str = uIBlockMusicPlaylistUpdate.y.f;
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.d = uIBlockMusicPlaylistUpdate.f;
        maz.c(e, h, str, aVar.a(), null, null, 24);
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

    /* compiled from: MusicPlaylistUpdateVh.kt */
    public static final class a implements b780 {
        public final /* synthetic */ VKImageView b;

        public a(VKImageView vKImageView) {
            this.b = vKImageView;
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            this.b.W();
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
