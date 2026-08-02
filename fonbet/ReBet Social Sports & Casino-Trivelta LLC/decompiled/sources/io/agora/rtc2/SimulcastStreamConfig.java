package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import io.agora.rtc2.video.VideoEncoderConfiguration;

/* loaded from: classes3.dex */
public class SimulcastStreamConfig {
    public int bitrate;
    public VideoEncoderConfiguration.VideoDimensions dimensions;
    public int framerate;

    public SimulcastStreamConfig() {
        this.dimensions = new VideoEncoderConfiguration.VideoDimensions(-1, -1);
        this.bitrate = -1;
        this.framerate = 5;
    }

    @CalledByNative
    public int getBitrate() {
        return this.bitrate;
    }

    @CalledByNative
    public int getDimensionsHeight() {
        return this.dimensions.height;
    }

    @CalledByNative
    public int getDimensionsWidth() {
        return this.dimensions.width;
    }

    @CalledByNative
    public int getFramerate() {
        return this.framerate;
    }

    public SimulcastStreamConfig(VideoEncoderConfiguration.VideoDimensions videoDimensions, int i10, int i11) {
        this.dimensions = videoDimensions;
        this.bitrate = i10;
        this.framerate = i11;
    }
}
