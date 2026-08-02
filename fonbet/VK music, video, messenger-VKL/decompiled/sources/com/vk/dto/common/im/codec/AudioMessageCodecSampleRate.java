package com.vk.dto.common.im.codec;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioMessageCodecSampleRate.kt */
/* loaded from: classes18.dex */
public final class AudioMessageCodecSampleRate {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioMessageCodecSampleRate[] $VALUES;
    public static final a Companion;
    public static final AudioMessageCodecSampleRate SAMPLE_RATE_12000;
    public static final AudioMessageCodecSampleRate SAMPLE_RATE_16000;
    public static final AudioMessageCodecSampleRate SAMPLE_RATE_24000;
    public static final AudioMessageCodecSampleRate SAMPLE_RATE_48000;
    public static final AudioMessageCodecSampleRate SAMPLE_RATE_8000;
    private final int value;

    /* compiled from: AudioMessageCodecSampleRate.kt */
    public static final class a {
        public static AudioMessageCodecSampleRate a(int i) {
            for (AudioMessageCodecSampleRate audioMessageCodecSampleRate : AudioMessageCodecSampleRate.values()) {
                if (audioMessageCodecSampleRate.h() == i) {
                    return audioMessageCodecSampleRate;
                }
            }
            return null;
        }
    }

    static {
        AudioMessageCodecSampleRate audioMessageCodecSampleRate = new AudioMessageCodecSampleRate("SAMPLE_RATE_8000", 0, 8000);
        SAMPLE_RATE_8000 = audioMessageCodecSampleRate;
        AudioMessageCodecSampleRate audioMessageCodecSampleRate2 = new AudioMessageCodecSampleRate("SAMPLE_RATE_12000", 1, 12000);
        SAMPLE_RATE_12000 = audioMessageCodecSampleRate2;
        AudioMessageCodecSampleRate audioMessageCodecSampleRate3 = new AudioMessageCodecSampleRate("SAMPLE_RATE_16000", 2, 16000);
        SAMPLE_RATE_16000 = audioMessageCodecSampleRate3;
        AudioMessageCodecSampleRate audioMessageCodecSampleRate4 = new AudioMessageCodecSampleRate("SAMPLE_RATE_24000", 3, 24000);
        SAMPLE_RATE_24000 = audioMessageCodecSampleRate4;
        AudioMessageCodecSampleRate audioMessageCodecSampleRate5 = new AudioMessageCodecSampleRate("SAMPLE_RATE_48000", 4, 48000);
        SAMPLE_RATE_48000 = audioMessageCodecSampleRate5;
        AudioMessageCodecSampleRate[] audioMessageCodecSampleRateArr = {audioMessageCodecSampleRate, audioMessageCodecSampleRate2, audioMessageCodecSampleRate3, audioMessageCodecSampleRate4, audioMessageCodecSampleRate5};
        $VALUES = audioMessageCodecSampleRateArr;
        $ENTRIES = new asp(audioMessageCodecSampleRateArr);
        Companion = new a();
    }

    public AudioMessageCodecSampleRate(String str, int i, int i2) {
        this.value = i2;
    }

    public static AudioMessageCodecSampleRate valueOf(String str) {
        return (AudioMessageCodecSampleRate) Enum.valueOf(AudioMessageCodecSampleRate.class, str);
    }

    public static AudioMessageCodecSampleRate[] values() {
        return (AudioMessageCodecSampleRate[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
