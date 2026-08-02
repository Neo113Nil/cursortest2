package com.vk.voip.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioDevice.kt */
/* loaded from: classes7.dex */
public final class AudioDevice {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioDevice[] $VALUES;
    public static final AudioDevice BLUETOOTH;
    public static final AudioDevice EARPIECE;
    public static final AudioDevice NONE;
    public static final AudioDevice SPEAKER_PHONE;
    public static final AudioDevice WIRED_HEADSET;

    static {
        AudioDevice audioDevice = new AudioDevice("BLUETOOTH", 0);
        BLUETOOTH = audioDevice;
        AudioDevice audioDevice2 = new AudioDevice("WIRED_HEADSET", 1);
        WIRED_HEADSET = audioDevice2;
        AudioDevice audioDevice3 = new AudioDevice("EARPIECE", 2);
        EARPIECE = audioDevice3;
        AudioDevice audioDevice4 = new AudioDevice("SPEAKER_PHONE", 3);
        SPEAKER_PHONE = audioDevice4;
        AudioDevice audioDevice5 = new AudioDevice("NONE", 4);
        NONE = audioDevice5;
        AudioDevice[] audioDeviceArr = {audioDevice, audioDevice2, audioDevice3, audioDevice4, audioDevice5};
        $VALUES = audioDeviceArr;
        $ENTRIES = new asp(audioDeviceArr);
    }

    public AudioDevice() {
        throw null;
    }

    public static AudioDevice valueOf(String str) {
        return (AudioDevice) Enum.valueOf(AudioDevice.class, str);
    }

    public static AudioDevice[] values() {
        return (AudioDevice[]) $VALUES.clone();
    }
}
