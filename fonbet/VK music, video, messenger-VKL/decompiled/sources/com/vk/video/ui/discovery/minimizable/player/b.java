package com.vk.video.ui.discovery.minimizable.player;

import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;

/* compiled from: VideoPlayerStatus.kt */
/* loaded from: classes7.dex */
public final class b {
    public static final boolean a(VideoPlayerStatus videoPlayerStatus) {
        return (videoPlayerStatus instanceof VideoPlayerStatus.AdPaused) || videoPlayerStatus.equals(VideoPlayerStatus.AdPlaying.b);
    }

    public static final boolean b(VideoPlayerStatus videoPlayerStatus) {
        return (videoPlayerStatus instanceof VideoPlayerStatus.Paused) || (videoPlayerStatus instanceof VideoPlayerStatus.AdPaused);
    }

    public static final boolean c(VideoPlayerStatus videoPlayerStatus) {
        return videoPlayerStatus.equals(VideoPlayerStatus.Playing.b) || videoPlayerStatus.equals(VideoPlayerStatus.AdPlaying.b);
    }

    public static final boolean d(VideoPlayerStatus videoPlayerStatus) {
        if (c(videoPlayerStatus)) {
            return true;
        }
        VideoPlayerStatus.Paused paused = videoPlayerStatus instanceof VideoPlayerStatus.Paused ? (VideoPlayerStatus.Paused) videoPlayerStatus : null;
        if (paused != null && !paused.b) {
            return true;
        }
        VideoPlayerStatus.AdPaused adPaused = videoPlayerStatus instanceof VideoPlayerStatus.AdPaused ? (VideoPlayerStatus.AdPaused) videoPlayerStatus : null;
        return (adPaused == null || adPaused.b) ? false : true;
    }
}
