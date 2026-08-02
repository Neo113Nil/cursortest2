package com.vk.music.player.core.helper;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OneVideoPlaybackPreparer.kt */
/* loaded from: classes3.dex */
public final class AudioPlayerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioPlayerType[] $VALUES;
    public static final AudioPlayerType EXO;
    public static final AudioPlayerType UV;

    static {
        AudioPlayerType audioPlayerType = new AudioPlayerType("EXO", 0);
        EXO = audioPlayerType;
        AudioPlayerType audioPlayerType2 = new AudioPlayerType("UV", 1);
        UV = audioPlayerType2;
        AudioPlayerType[] audioPlayerTypeArr = {audioPlayerType, audioPlayerType2};
        $VALUES = audioPlayerTypeArr;
        $ENTRIES = new asp(audioPlayerTypeArr);
    }

    public AudioPlayerType() {
        throw null;
    }

    public static AudioPlayerType valueOf(String str) {
        return (AudioPlayerType) Enum.valueOf(AudioPlayerType.class, str);
    }

    public static AudioPlayerType[] values() {
        return (AudioPlayerType[]) $VALUES.clone();
    }
}
