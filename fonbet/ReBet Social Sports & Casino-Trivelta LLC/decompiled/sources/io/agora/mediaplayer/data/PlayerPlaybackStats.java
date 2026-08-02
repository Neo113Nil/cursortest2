package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class PlayerPlaybackStats {
    private long videoFps = 0;
    private long videoBitrateInKbps = 0;
    private long audioBitrateInKbps = 0;
    private long totalBitrateInKbps = 0;

    @CalledByNative
    public PlayerPlaybackStats() {
    }

    public long getAudioBitrate() {
        return this.audioBitrateInKbps;
    }

    public long getTotalBitrate() {
        return this.totalBitrateInKbps;
    }

    public long getVideoBitrate() {
        return this.videoBitrateInKbps;
    }

    public long getVideoFps() {
        return this.videoFps;
    }

    @CalledByNative
    public void setAudioBitrate(long j10) {
        this.audioBitrateInKbps = j10;
    }

    @CalledByNative
    public void setTotalBitrate(long j10) {
        this.totalBitrateInKbps = j10;
    }

    @CalledByNative
    public void setVideoBitrate(long j10) {
        this.videoBitrateInKbps = j10;
    }

    @CalledByNative
    public void setVideoFps(long j10) {
        this.videoFps = j10;
    }

    public String toString() {
        return "PlayerPlaybackStats{videoFps=" + this.videoFps + ", videoBitrate=" + this.videoBitrateInKbps + ", audioBitrate=" + this.audioBitrateInKbps + ", totalBitrate=" + this.totalBitrateInKbps + '}';
    }
}
