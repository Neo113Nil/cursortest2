package com.vk.catalog2.common.ui.holders.video.playlist.cover;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vkontakte.android.R;
import xsna.cfp0;

/* compiled from: VideoPlaylistCover.kt */
/* loaded from: classes16.dex */
public abstract class VideoPlaylistCover extends CatalogClickableViewHolder {
    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final cfp0 a(int i, UIBlock uIBlock) {
        if (!(uIBlock instanceof UIBlockVideoAlbum)) {
            return super.a(i, uIBlock);
        }
        if (i == R.id.subscribe_button) {
            return new cfp0(uIBlock, new VideoAlbumAnalyticsInfo(((UIBlockVideoAlbum) uIBlock).y.l ? VideoAlbumAnalyticsInfo.ClickTarget.Unsubscribe : VideoAlbumAnalyticsInfo.ClickTarget.Subscribe, null));
        }
        return i == R.id.watch_button ? new cfp0(uIBlock, new VideoAlbumAnalyticsInfo(VideoAlbumAnalyticsInfo.ClickTarget.PlayAll, null)) : super.a(i, uIBlock);
    }

    public abstract void c(UIBlock uIBlock);

    public abstract void d(float f);
}
