package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import io.agora.rtc2.video.VideoEncoderConfiguration;

/* loaded from: classes3.dex */
public class SimulcastConfig {
    public final StreamLayerConfig[] configs = new StreamLayerConfig[StreamLayerIndex.STREAM_LAYER_COUNT_MAX.getValue()];
    public boolean publishFallbackEnable;

    public class StreamLayerConfig {
        public VideoEncoderConfiguration.VideoDimensions dimensions;
        public boolean enable;
        public int framerate;

        public StreamLayerConfig() {
            this.dimensions = new VideoEncoderConfiguration.VideoDimensions(0, 0);
            this.framerate = 0;
            this.enable = false;
        }

        @CalledByNative("StreamLayerConfig")
        public int getDimensionsHeight() {
            return this.dimensions.height;
        }

        @CalledByNative("StreamLayerConfig")
        public int getDimensionsWidth() {
            return this.dimensions.width;
        }

        @CalledByNative("StreamLayerConfig")
        public int getFramerate() {
            return this.framerate;
        }

        @CalledByNative("StreamLayerConfig")
        public boolean isEnabled() {
            return this.enable;
        }

        public StreamLayerConfig(VideoEncoderConfiguration.VideoDimensions videoDimensions, int i10, boolean z10) {
            this.dimensions = videoDimensions;
            this.framerate = i10;
            this.enable = z10;
        }
    }

    public enum StreamLayerIndex {
        STREAM_LAYER_1(0),
        STREAM_LAYER_2(1),
        STREAM_LAYER_3(2),
        STREAM_LAYER_4(3),
        STREAM_LAYER_5(4),
        STREAM_LAYER_6(5),
        STREAM_LOW(6),
        STREAM_LAYER_COUNT_MAX(7);

        private int value;

        StreamLayerIndex(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public SimulcastConfig() {
        for (int i10 = 0; i10 < StreamLayerIndex.STREAM_LAYER_COUNT_MAX.getValue(); i10++) {
            this.configs[i10] = new StreamLayerConfig();
        }
        this.publishFallbackEnable = false;
    }
}
