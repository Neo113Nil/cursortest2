package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistCatalogFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoSeason;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.List;
import xsna.b5a;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.e3m;
import xsna.fem0;
import xsna.fxc0;
import xsna.g7s0;
import xsna.iw50;
import xsna.j5g;
import xsna.jwx;
import xsna.lpg0;
import xsna.m33;
import xsna.rl3;
import xsna.ydt0;

/* compiled from: VideoVerticalAlbumVh.kt */
/* loaded from: classes16.dex */
public final class VideoVerticalAlbumVh implements CatalogViewHolder, View.OnClickListener {
    public final lpg0 b;
    public final b5a c;
    public final SearchStatInfoProvider d;
    public final int e;
    public final g7s0 f;
    public TextView g;
    public VKImageView h;
    public TextView i;
    public VkContentBadge j;
    public UIBlockVideoAlbum k;
    public int l;
    public final bpn0 m;

    public VideoVerticalAlbumVh(lpg0 lpg0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, int i) {
        int i2 = (i & 8) != 0 ? R.layout.catalog_video_playlist_vertical_item : R.layout.catalog_video_playlist_vertical_item_slider;
        g7s0 B = fxc0.B();
        this.b = lpg0Var;
        this.c = b5aVar;
        this.d = searchStatInfoProvider;
        this.e = i2;
        this.f = B;
        this.m = new bpn0(new fem0(this, 9));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        jwx jwxVar;
        UIBlockVideoAlbum uIBlockVideoAlbum = uIBlock instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) uIBlock : null;
        if (uIBlockVideoAlbum == null) {
            return;
        }
        VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.setText(videoAlbum.d);
        VideoAlbum videoAlbum2 = ((UIBlockVideoAlbum) uIBlock).y;
        if (((Boolean) this.m.getValue()).booleanValue()) {
            VkContentBadge vkContentBadge = this.j;
            if (vkContentBadge == null) {
                vkContentBadge = null;
            }
            bwt0.p0(vkContentBadge, videoAlbum2.f > 1);
            VkContentBadge vkContentBadge2 = this.j;
            VkContentBadge vkContentBadge3 = vkContentBadge2 == null ? null : vkContentBadge2;
            if (vkContentBadge2 == null) {
                vkContentBadge2 = null;
            }
            Resources resources = vkContentBadge2.getResources();
            List<VideoSeason> list = videoAlbum2.q;
            boolean z = list.size() > 1;
            int i = videoAlbum2.f;
            String quantityString = resources.getQuantityString(R.plurals.catalog_album_video_total_title, i, Integer.valueOf(i));
            String quantityString2 = resources.getQuantityString(R.plurals.catalog_album_video_seasons_count, list.size(), Integer.valueOf(list.size()));
            if (!z) {
                quantityString2 = null;
            }
            vkContentBadge3.setText(j5g.g0(rl3.I(new String[]{quantityString2, quantityString}), " · ", null, null, 0, null, 62));
            VkContentBadge vkContentBadge4 = this.j;
            if (vkContentBadge4 == null) {
                vkContentBadge4 = null;
            }
            vkContentBadge4.setSize(VkContentBadge.Size.Medium);
        } else {
            TextView textView2 = this.i;
            if (textView2 == null) {
                textView2 = null;
            }
            bwt0.p0(textView2, videoAlbum2.f > 1);
            TextView textView3 = this.i;
            TextView textView4 = textView3 == null ? null : textView3;
            if (textView3 == null) {
                textView3 = null;
            }
            Resources resources2 = textView3.getResources();
            int i2 = videoAlbum2.f;
            textView4.setText(resources2.getQuantityString(R.plurals.catalog_album_video_total_title, i2, Integer.valueOf(i2)));
        }
        VKImageView vKImageView = this.h;
        if (vKImageView == null) {
            vKImageView = null;
        }
        if (videoAlbum.i) {
            bpn0 bpn0Var = VideoOverlayView.I;
            jwxVar = VideoOverlayView.b.c();
        } else {
            jwxVar = null;
        }
        vKImageView.setPostprocessor(jwxVar);
        VKImageView vKImageView2 = this.h;
        if (vKImageView2 == null) {
            vKImageView2 = null;
        }
        ImageSize Cb = videoAlbum.h.Cb(this.l, true, false);
        vKImageView2.load(Cb != null ? Cb.d.d : null);
        this.k = uIBlockVideoAlbum;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.e, viewGroup, false);
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.h = (VKImageView) inflate.findViewById(R.id.preview);
        this.i = (TextView) inflate.findViewById(R.id.count);
        this.j = (VkContentBadge) inflate.findViewById(R.id.badge);
        VKImageView vKImageView = this.h;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.setPlaceholderImage(m33.a(R.drawable.catalog_album_placeholder_old, inflate.getContext()));
        inflate.setOnClickListener(new c98(this, 1));
        this.l = inflate.getWidth() > 0 ? inflate.getWidth() : inflate.getMeasuredWidth() > 0 ? inflate.getMeasuredWidth() : bwt0.y(R.dimen.video_catalog_vertical_playlist_item_max_width, inflate);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockVideoAlbum uIBlockVideoAlbum;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockVideoAlbum = this.k) == null) {
            return;
        }
        VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
        this.c.a(new cfp0(uIBlockVideoAlbum, new VideoAlbumAnalyticsInfo(VideoAlbumAnalyticsInfo.ClickTarget.Open, null)));
        SearchStatsLoggingInfo b = this.d.b(SchemeStat$EventItem.Type.VIDEO_PLAYLIST, uIBlockVideoAlbum.f, false);
        int i = videoAlbum.b;
        if (i <= 0) {
            ydt0.e(this.f.Y(), h, videoAlbum, null, b, 12);
            return;
        }
        UserId userId = videoAlbum.c;
        VideoPlaylistCatalogFragment.b bVar = new VideoPlaylistCatalogFragment.b(VideoPlaylistCatalogFragment.class);
        iw50 iw50Var = bVar.b;
        Bundle bundle = iw50Var.a;
        Bundle bundle2 = iw50Var.a;
        bundle.putParcelable("owner_id", userId);
        bundle2.putInt("album_id", i);
        String str = uIBlockVideoAlbum.f;
        if (str != null) {
            bundle2.putString("ref", str);
        }
        String str2 = videoAlbum.n;
        if (str2 != null) {
            bundle2.putString("track_code", str2);
        }
        if (b != null) {
            bundle2.putParcelable("search_stats_logging_info", b);
        }
        this.b.a(h, bVar);
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
