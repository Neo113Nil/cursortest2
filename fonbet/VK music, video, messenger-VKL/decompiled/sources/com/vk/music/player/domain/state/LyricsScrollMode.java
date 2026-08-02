package com.vk.music.player.domain.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LyricsScrollMode.kt */
/* loaded from: classes3.dex */
public final class LyricsScrollMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LyricsScrollMode[] $VALUES;
    public static final LyricsScrollMode AUTO;
    public static final LyricsScrollMode MANUAL;

    static {
        LyricsScrollMode lyricsScrollMode = new LyricsScrollMode("MANUAL", 0);
        MANUAL = lyricsScrollMode;
        LyricsScrollMode lyricsScrollMode2 = new LyricsScrollMode("AUTO", 1);
        AUTO = lyricsScrollMode2;
        LyricsScrollMode[] lyricsScrollModeArr = {lyricsScrollMode, lyricsScrollMode2};
        $VALUES = lyricsScrollModeArr;
        $ENTRIES = new asp(lyricsScrollModeArr);
    }

    public LyricsScrollMode() {
        throw null;
    }

    public static LyricsScrollMode valueOf(String str) {
        return (LyricsScrollMode) Enum.valueOf(LyricsScrollMode.class, str);
    }

    public static LyricsScrollMode[] values() {
        return (LyricsScrollMode[]) $VALUES.clone();
    }
}
