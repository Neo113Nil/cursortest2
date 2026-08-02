package com.vk.music.player.domain.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LyricsMode.kt */
/* loaded from: classes3.dex */
public final class LyricsMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LyricsMode[] $VALUES;
    public static final LyricsMode COLLAPSED;
    public static final LyricsMode CONTENT;
    public static final LyricsMode ERROR;
    public static final LyricsMode LOADING;
    public static final LyricsMode PLACEHOLDER;

    static {
        LyricsMode lyricsMode = new LyricsMode("COLLAPSED", 0);
        COLLAPSED = lyricsMode;
        LyricsMode lyricsMode2 = new LyricsMode("LOADING", 1);
        LOADING = lyricsMode2;
        LyricsMode lyricsMode3 = new LyricsMode("CONTENT", 2);
        CONTENT = lyricsMode3;
        LyricsMode lyricsMode4 = new LyricsMode("PLACEHOLDER", 3);
        PLACEHOLDER = lyricsMode4;
        LyricsMode lyricsMode5 = new LyricsMode("ERROR", 4);
        ERROR = lyricsMode5;
        LyricsMode[] lyricsModeArr = {lyricsMode, lyricsMode2, lyricsMode3, lyricsMode4, lyricsMode5};
        $VALUES = lyricsModeArr;
        $ENTRIES = new asp(lyricsModeArr);
    }

    public LyricsMode() {
        throw null;
    }

    public static LyricsMode valueOf(String str) {
        return (LyricsMode) Enum.valueOf(LyricsMode.class, str);
    }

    public static LyricsMode[] values() {
        return (LyricsMode[]) $VALUES.clone();
    }
}
