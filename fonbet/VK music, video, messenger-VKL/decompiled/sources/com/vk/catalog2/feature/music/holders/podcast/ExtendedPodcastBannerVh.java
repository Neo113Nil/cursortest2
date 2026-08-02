package com.vk.catalog2.feature.music.holders.podcast;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockExtendedPodcastItem;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.c98;
import xsna.cn70;
import xsna.xwk;

/* compiled from: ExtendedPodcastBannerVh.kt */
/* loaded from: classes16.dex */
public final class ExtendedPodcastBannerVh implements CatalogViewHolder, View.OnClickListener {
    public UIBlockExtendedPodcastItem b;
    public TextView c;
    public VKImageView d;
    public VKImageView e;
    public ThumbsImageView f;
    public TextView g;
    public TextView h;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockExtendedPodcastItem) {
            UIBlockExtendedPodcastItem uIBlockExtendedPodcastItem = (UIBlockExtendedPodcastItem) uIBlock;
            this.b = uIBlockExtendedPodcastItem;
            ExtendedPodcast extendedPodcast = uIBlockExtendedPodcastItem.y;
            TextView textView = this.g;
            if (textView == null) {
                textView = null;
            }
            textView.setText(extendedPodcast.f.d);
            TextView textView2 = this.h;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(extendedPodcast.b);
            TextView textView3 = this.c;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(extendedPodcast.c);
            VKImageView vKImageView = this.d;
            if (vKImageView == null) {
                vKImageView = null;
            }
            Image image = extendedPodcast.d;
            ImageSize Cb = image != null ? image.Cb(vKImageView.getLayoutParams().width, true, false) : null;
            vKImageView.load(Cb != null ? Cb.d.d : null);
            VKImageView vKImageView2 = this.e;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            Image image2 = extendedPodcast.e;
            ImageSize Cb2 = image2 != null ? image2.Cb(vKImageView2.getLayoutParams().width, true, false) : null;
            vKImageView2.load(Cb2 != null ? Cb2.d.d : null);
            ThumbsImageView thumbsImageView = this.f;
            if (thumbsImageView == null) {
                thumbsImageView = null;
            }
            thumbsImageView.setThumbs(extendedPodcast.f.f);
            ThumbsImageView thumbsImageView2 = this.f;
            (thumbsImageView2 != null ? thumbsImageView2 : null).setCornerRadius(12.0f);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_extended_podcast_banner, viewGroup, false);
        this.c = (TextView) inflate.findViewById(R.id.tag_on_banner);
        View findViewById = inflate.findViewById(R.id.image_header_background);
        ((VKImageView) findViewById).z0(cn70.c(12), cn70.c(12), cn70.c(0), cn70.c(0));
        this.d = (VKImageView) findViewById;
        this.e = (VKImageView) inflate.findViewById(R.id.image_podcast_background_cover);
        this.f = (ThumbsImageView) inflate.findViewById(R.id.image_podcast_cover);
        this.g = (TextView) inflate.findViewById(R.id.text_title);
        this.h = (TextView) inflate.findViewById(R.id.text_subtitle);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ExtendedPodcast extendedPodcast;
        Podcast podcast;
        if (view == null) {
            return;
        }
        UIBlockExtendedPodcastItem uIBlockExtendedPodcastItem = this.b;
        xwk.d().e().d(view.getContext(), Uri.parse((uIBlockExtendedPodcastItem == null || (extendedPodcast = uIBlockExtendedPodcastItem.y) == null || (podcast = extendedPodcast.f) == null) ? null : podcast.d()), LaunchContext.A, null);
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
