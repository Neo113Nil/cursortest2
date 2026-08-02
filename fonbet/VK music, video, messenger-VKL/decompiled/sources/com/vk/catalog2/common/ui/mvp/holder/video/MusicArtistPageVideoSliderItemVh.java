package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.core.utils.b;
import com.vk.dto.common.MusicVideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.fxc0;
import xsna.g620;
import xsna.hdt0;
import xsna.lyd;
import xsna.s490;
import xsna.u4a;
import xsna.xg5;
import xsna.xwk;

/* compiled from: MusicArtistPageVideoSliderItemVh.kt */
/* loaded from: classes16.dex */
public final class MusicArtistPageVideoSliderItemVh extends VideoItemSliderVh {
    public final u4a h0;

    public MusicArtistPageVideoSliderItemVh(u4a u4aVar, hdt0 hdt0Var) {
        super(R.layout.catalog_music_video_slider_small_item, R.dimen.video_catalog_small_slider_content_item_width, u4aVar, fxc0.B(), lyd.g(), xwk.e(), xg5.a(), g620.f(), false, false, false, false, null, hdt0Var, 65024);
        this.h0 = u4aVar;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh
    public final void g(Context context, MusicVideoFile musicVideoFile) {
        UIBlockVideo uIBlockVideo = this.j;
        if (uIBlockVideo == null) {
            return;
        }
        TextView textView = this.H;
        if (textView == null) {
            textView = null;
        }
        textView.setText(s490.d(context, musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary));
        TextView textView2 = this.I;
        if (textView2 != null) {
            textView2.setText(b.C0795b.d(musicVideoFile.F1, musicVideoFile.E1));
        }
        TextView textView3 = this.B;
        if (textView3 != null) {
            bwt0.p0(textView3, false);
        }
        VKImageView vKImageView = this.A;
        if (vKImageView != null) {
            this.h0.b.j.b(vKImageView, ContentType.ARTIST, uIBlockVideo.e, uIBlockVideo.d, -1.0f);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        VKImageView vKImageView = this.A;
        if (vKImageView != null) {
            bwt0.p0(vKImageView, false);
        }
        return k5;
    }
}
