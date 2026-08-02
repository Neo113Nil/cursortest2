package com.vk.music.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class ShuffleMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShuffleMode[] $VALUES;
    public static final ShuffleMode SHUFFLE_AUTO;
    public static final ShuffleMode SHUFFLE_OFF;
    public static final ShuffleMode SHUFFLE_ON;

    static {
        ShuffleMode shuffleMode = new ShuffleMode("SHUFFLE_AUTO", 0);
        SHUFFLE_AUTO = shuffleMode;
        ShuffleMode shuffleMode2 = new ShuffleMode("SHUFFLE_OFF", 1);
        SHUFFLE_OFF = shuffleMode2;
        ShuffleMode shuffleMode3 = new ShuffleMode("SHUFFLE_ON", 2);
        SHUFFLE_ON = shuffleMode3;
        ShuffleMode[] shuffleModeArr = {shuffleMode, shuffleMode2, shuffleMode3};
        $VALUES = shuffleModeArr;
        $ENTRIES = new asp(shuffleModeArr);
    }

    public ShuffleMode() {
        throw null;
    }

    public static ShuffleMode valueOf(String str) {
        return (ShuffleMode) Enum.valueOf(ShuffleMode.class, str);
    }

    public static ShuffleMode[] values() {
        return (ShuffleMode[]) $VALUES.clone();
    }
}
