package com.twilio.voice;

/* loaded from: classes4.dex */
class MonitorThresholds {
    private int maxDurationConstantAudioInputLevel;
    private int maxDurationConstantAudioOutputLevel;
    private int maxJitterThreshold;
    private int maxPacketsLostFraction;
    private int maxRttThreshold;
    private int minMosScoreThreshold;

    public static class Builder {
        private int minMosScoreThreshold = -1;
        private int maxDurationConstantAudioInputLevel = -1;
        private int maxDurationConstantAudioOutputLevel = -1;
        private int maxPacketsLostFraction = -1;
        private int maxJitterThreshold = -1;
        private int maxRttThreshold = -1;

        public Builder audioConstantInputLevelSampleCounter(int i10) {
            this.maxDurationConstantAudioInputLevel = i10;
            return this;
        }

        public Builder audioConstantOutputLevelSampleCounter(int i10) {
            this.maxDurationConstantAudioOutputLevel = i10;
            return this;
        }

        public MonitorThresholds build() {
            return new MonitorThresholds(this);
        }

        public Builder jitterThreshold(int i10) {
            this.maxJitterThreshold = i10;
            return this;
        }

        public Builder mosScoreThreshold(int i10) {
            this.minMosScoreThreshold = i10;
            return this;
        }

        public Builder packetsLostFraction(int i10) {
            this.maxPacketsLostFraction = i10;
            return this;
        }

        public Builder rttThreshold(int i10) {
            this.maxRttThreshold = i10;
            return this;
        }
    }

    public int getMaxDurationConstantAudioInputLevel() {
        return this.maxDurationConstantAudioInputLevel;
    }

    public int getMaxDurationConstantAudioOutputLevel() {
        return this.maxDurationConstantAudioOutputLevel;
    }

    public int getMaxJitterThreshold() {
        return this.maxJitterThreshold;
    }

    public int getMaxPacketsLostFraction() {
        return this.maxPacketsLostFraction;
    }

    public int getMaxRttThreshold() {
        return this.maxRttThreshold;
    }

    public int getMinMosScoreThreshold() {
        return this.minMosScoreThreshold;
    }

    private MonitorThresholds(Builder builder) {
        this.minMosScoreThreshold = builder.minMosScoreThreshold;
        this.maxDurationConstantAudioOutputLevel = builder.maxDurationConstantAudioOutputLevel;
        this.maxDurationConstantAudioInputLevel = builder.maxDurationConstantAudioInputLevel;
        this.maxPacketsLostFraction = builder.maxPacketsLostFraction;
        this.maxJitterThreshold = builder.maxJitterThreshold;
        this.maxRttThreshold = builder.maxRttThreshold;
    }
}
