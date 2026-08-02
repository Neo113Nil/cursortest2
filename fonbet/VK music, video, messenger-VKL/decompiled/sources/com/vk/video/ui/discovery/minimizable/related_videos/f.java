package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosOrder;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import kotlin.NoWhenBranchMatchedException;
import xsna.m5t0;

/* compiled from: VideoDiscoveryRelatedVideosSourceArgs.kt */
/* loaded from: classes7.dex */
public final class f {
    public static final m5t0.a.C3323a a(VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist) {
        VideoRelatedVideosOrder videoRelatedVideosOrder = playlist.l;
        return videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Shuffled ? new m5t0.a.C3323a(Integer.valueOf(((VideoRelatedVideosOrder.Shuffled) videoRelatedVideosOrder).b), ((VideoRelatedVideosOrder.Shuffled) videoRelatedVideosOrder).c) : m5t0.a.C3323a.c;
    }

    public static final boolean b(VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs) {
        if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist) {
            VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs;
            return (playlist.g == null || playlist.h == null) ? false : true;
        }
        if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
