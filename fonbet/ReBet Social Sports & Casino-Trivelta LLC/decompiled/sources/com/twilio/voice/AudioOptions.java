package com.twilio.voice;

/* loaded from: classes4.dex */
public class AudioOptions {
    private final int audioJitterBufferMaxPackets;
    private final int audioJitterBufferMinDelayMs;
    private final boolean autoGainControl;
    private final boolean echoCancellation;
    private final boolean highpassFilter;
    private final boolean noiseSuppression;

    public static final class Builder {
        private boolean echoCancellation = true;
        private boolean autoGainControl = true;
        private boolean noiseSuppression = true;
        private boolean highpassFilter = true;
        private int audioJitterBufferMaxPackets = 200;
        private int audioJitterBufferMinDelayMs = 0;

        public Builder audioJitterBufferMaxPackets(int i10) {
            if (i10 < 20) {
                i10 = 20;
            }
            this.audioJitterBufferMaxPackets = i10;
            return this;
        }

        public Builder audioJitterBufferMinDelayMs(int i10) {
            if (i10 < 0) {
                i10 = 0;
            }
            this.audioJitterBufferMinDelayMs = i10;
            return this;
        }

        public Builder autoGainControl(boolean z10) {
            this.autoGainControl = z10;
            return this;
        }

        public AudioOptions build() {
            return new AudioOptions(this);
        }

        public Builder echoCancellation(boolean z10) {
            this.echoCancellation = z10;
            return this;
        }

        public Builder highpassFilter(boolean z10) {
            this.highpassFilter = z10;
            return this;
        }

        public Builder noiseSuppression(boolean z10) {
            this.noiseSuppression = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AudioOptions)) {
            AudioOptions audioOptions = (AudioOptions) obj;
            if (this.echoCancellation == audioOptions.echoCancellation && this.autoGainControl == audioOptions.autoGainControl && this.noiseSuppression == audioOptions.noiseSuppression && this.highpassFilter == audioOptions.highpassFilter && this.audioJitterBufferMaxPackets == audioOptions.audioJitterBufferMaxPackets && this.audioJitterBufferMinDelayMs == audioOptions.audioJitterBufferMinDelayMs) {
                return true;
            }
        }
        return false;
    }

    public int getAudioJitterBufferMaxPackets() {
        return this.audioJitterBufferMaxPackets;
    }

    public int getAudioJitterBufferMinDelayMs() {
        return this.audioJitterBufferMinDelayMs;
    }

    public boolean isAutoGainControlEnabled() {
        return this.autoGainControl;
    }

    public boolean isEchoCancellationEnabled() {
        return this.echoCancellation;
    }

    public boolean isHighpassFilterEnabled() {
        return this.highpassFilter;
    }

    public boolean isNoiseSuppressionEnabled() {
        return this.noiseSuppression;
    }

    public String toString() {
        return "AudioOptions{echoCancellation=" + this.echoCancellation + ", autoGainControl=" + this.autoGainControl + ", noiseSuppression=" + this.noiseSuppression + ", highpassFilter=" + this.highpassFilter + ", audioJitterBufferMaxPackets=" + this.audioJitterBufferMaxPackets + ", audioJitterBufferMinDelayMs=" + this.audioJitterBufferMinDelayMs + '}';
    }

    private AudioOptions(Builder builder) {
        this.echoCancellation = builder.echoCancellation;
        this.autoGainControl = builder.autoGainControl;
        this.noiseSuppression = builder.noiseSuppression;
        this.highpassFilter = builder.highpassFilter;
        this.audioJitterBufferMaxPackets = builder.audioJitterBufferMaxPackets;
        this.audioJitterBufferMinDelayMs = builder.audioJitterBufferMinDelayMs;
    }
}
