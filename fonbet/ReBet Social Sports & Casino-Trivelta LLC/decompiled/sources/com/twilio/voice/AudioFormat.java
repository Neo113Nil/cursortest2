package com.twilio.voice;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class AudioFormat {
    public static final int AUDIO_SAMPLE_STEREO = 2;
    private int channelCount;
    private int sampleRate;
    public static final int AUDIO_SAMPLE_RATE_8000 = 8000;
    public static final int AUDIO_SAMPLE_RATE_16000 = 16000;
    public static final int AUDIO_SAMPLE_RATE_24000 = 24000;
    public static final int AUDIO_SAMPLE_RATE_32000 = 32000;
    public static final int AUDIO_SAMPLE_RATE_44100 = 44100;
    public static final int AUDIO_SAMPLE_RATE_48000 = 48000;
    static final Integer[] validSampleRates = {Integer.valueOf(AUDIO_SAMPLE_RATE_8000), Integer.valueOf(AUDIO_SAMPLE_RATE_16000), Integer.valueOf(AUDIO_SAMPLE_RATE_24000), Integer.valueOf(AUDIO_SAMPLE_RATE_32000), Integer.valueOf(AUDIO_SAMPLE_RATE_44100), Integer.valueOf(AUDIO_SAMPLE_RATE_48000)};
    public static int AUDIO_SAMPLE_MONO = 1;
    static final Integer[] validChannelCounts = {Integer.valueOf(AUDIO_SAMPLE_MONO), 2};

    public AudioFormat(int i10, int i11) {
        this.sampleRate = -1;
        this.channelCount = -1;
        Preconditions.checkArgument(Arrays.asList(validSampleRates).contains(Integer.valueOf(i10)), String.format("Unsupported sample rate %s", Integer.valueOf(i10)));
        Preconditions.checkArgument(Arrays.asList(validChannelCounts).contains(Integer.valueOf(i11)), String.format("Unsupported channel count %s", Integer.valueOf(i11)));
        this.sampleRate = i10;
        this.channelCount = i11;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }
}
