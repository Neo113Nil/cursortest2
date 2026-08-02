package com.vk.dto.common.im.codec;

import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioMessageCodecBitrate.kt */
/* loaded from: classes18.dex */
public final class AudioMessageCodecBitrate {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioMessageCodecBitrate[] $VALUES;
    public static final AudioMessageCodecBitrate BITRATE_128000;
    public static final AudioMessageCodecBitrate BITRATE_16000;
    public static final AudioMessageCodecBitrate BITRATE_256000;
    public static final AudioMessageCodecBitrate BITRATE_32000;
    public static final AudioMessageCodecBitrate BITRATE_48000;
    public static final AudioMessageCodecBitrate BITRATE_64000;
    public static final a Companion;
    private final int value;

    /* compiled from: AudioMessageCodecBitrate.kt */
    public static final class a {
        public static AudioMessageCodecBitrate a(int i) {
            for (AudioMessageCodecBitrate audioMessageCodecBitrate : AudioMessageCodecBitrate.values()) {
                if (audioMessageCodecBitrate.h() == i) {
                    return audioMessageCodecBitrate;
                }
            }
            return null;
        }
    }

    static {
        AudioMessageCodecBitrate audioMessageCodecBitrate = new AudioMessageCodecBitrate("BITRATE_16000", 0, 16000);
        BITRATE_16000 = audioMessageCodecBitrate;
        AudioMessageCodecBitrate audioMessageCodecBitrate2 = new AudioMessageCodecBitrate("BITRATE_32000", 1, 32000);
        BITRATE_32000 = audioMessageCodecBitrate2;
        AudioMessageCodecBitrate audioMessageCodecBitrate3 = new AudioMessageCodecBitrate("BITRATE_48000", 2, 48000);
        BITRATE_48000 = audioMessageCodecBitrate3;
        AudioMessageCodecBitrate audioMessageCodecBitrate4 = new AudioMessageCodecBitrate("BITRATE_64000", 3, RtpSenderHelper.AUDIO_BITRATE_MAX);
        BITRATE_64000 = audioMessageCodecBitrate4;
        AudioMessageCodecBitrate audioMessageCodecBitrate5 = new AudioMessageCodecBitrate("BITRATE_128000", 4, 128000);
        BITRATE_128000 = audioMessageCodecBitrate5;
        AudioMessageCodecBitrate audioMessageCodecBitrate6 = new AudioMessageCodecBitrate("BITRATE_256000", 5, 256000);
        BITRATE_256000 = audioMessageCodecBitrate6;
        AudioMessageCodecBitrate[] audioMessageCodecBitrateArr = {audioMessageCodecBitrate, audioMessageCodecBitrate2, audioMessageCodecBitrate3, audioMessageCodecBitrate4, audioMessageCodecBitrate5, audioMessageCodecBitrate6};
        $VALUES = audioMessageCodecBitrateArr;
        $ENTRIES = new asp(audioMessageCodecBitrateArr);
        Companion = new a();
    }

    public AudioMessageCodecBitrate(String str, int i, int i2) {
        this.value = i2;
    }

    public static AudioMessageCodecBitrate valueOf(String str) {
        return (AudioMessageCodecBitrate) Enum.valueOf(AudioMessageCodecBitrate.class, str);
    }

    public static AudioMessageCodecBitrate[] values() {
        return (AudioMessageCodecBitrate[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
