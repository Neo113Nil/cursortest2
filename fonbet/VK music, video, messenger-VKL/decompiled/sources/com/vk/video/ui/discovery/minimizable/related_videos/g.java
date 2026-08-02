package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoDiscoveryRelatedVideosSource.kt */
/* loaded from: classes7.dex */
public final class g {
    public static final VideoAlbum a(VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource) {
        if (videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist) {
            return ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource).b;
        }
        if (videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist) {
            return ((VideoDiscoveryRelatedVideosSource.TemporaryPlaylist) videoDiscoveryRelatedVideosSource).c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
