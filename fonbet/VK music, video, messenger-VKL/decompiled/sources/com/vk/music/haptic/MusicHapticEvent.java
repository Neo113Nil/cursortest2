package com.vk.music.haptic;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicHapticEvent.kt */
/* loaded from: classes3.dex */
public final class MusicHapticEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicHapticEvent[] $VALUES;
    public static final MusicHapticEvent ERROR;
    public static final MusicHapticEvent LIGHT;
    public static final MusicHapticEvent RIGID;
    public static final MusicHapticEvent SOFT;
    public static final MusicHapticEvent SUCCESS;
    private final int value;

    static {
        MusicHapticEvent musicHapticEvent = new MusicHapticEvent("SUCCESS", 0, 16);
        SUCCESS = musicHapticEvent;
        MusicHapticEvent musicHapticEvent2 = new MusicHapticEvent("ERROR", 1, 17);
        ERROR = musicHapticEvent2;
        MusicHapticEvent musicHapticEvent3 = new MusicHapticEvent("RIGID", 2, 0);
        RIGID = musicHapticEvent3;
        MusicHapticEvent musicHapticEvent4 = new MusicHapticEvent("LIGHT", 3, 27);
        LIGHT = musicHapticEvent4;
        MusicHapticEvent musicHapticEvent5 = new MusicHapticEvent("SOFT", 4, 21);
        SOFT = musicHapticEvent5;
        MusicHapticEvent[] musicHapticEventArr = {musicHapticEvent, musicHapticEvent2, musicHapticEvent3, musicHapticEvent4, musicHapticEvent5};
        $VALUES = musicHapticEventArr;
        $ENTRIES = new asp(musicHapticEventArr);
    }

    public MusicHapticEvent(String str, int i, int i2) {
        this.value = i2;
    }

    public static MusicHapticEvent valueOf(String str) {
        return (MusicHapticEvent) Enum.valueOf(MusicHapticEvent.class, str);
    }

    public static MusicHapticEvent[] values() {
        return (MusicHapticEvent[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
