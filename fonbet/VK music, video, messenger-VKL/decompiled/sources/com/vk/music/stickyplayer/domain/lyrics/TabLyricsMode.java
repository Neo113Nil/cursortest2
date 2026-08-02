package com.vk.music.stickyplayer.domain.lyrics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabLyricsMode.kt */
/* loaded from: classes3.dex */
public final class TabLyricsMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TabLyricsMode[] $VALUES;
    public static final TabLyricsMode CONTENT;
    public static final TabLyricsMode ERROR;
    public static final TabLyricsMode LOADING;
    public static final TabLyricsMode PLACEHOLDER;

    static {
        TabLyricsMode tabLyricsMode = new TabLyricsMode("LOADING", 0);
        LOADING = tabLyricsMode;
        TabLyricsMode tabLyricsMode2 = new TabLyricsMode("CONTENT", 1);
        CONTENT = tabLyricsMode2;
        TabLyricsMode tabLyricsMode3 = new TabLyricsMode("PLACEHOLDER", 2);
        PLACEHOLDER = tabLyricsMode3;
        TabLyricsMode tabLyricsMode4 = new TabLyricsMode("ERROR", 3);
        ERROR = tabLyricsMode4;
        TabLyricsMode[] tabLyricsModeArr = {tabLyricsMode, tabLyricsMode2, tabLyricsMode3, tabLyricsMode4};
        $VALUES = tabLyricsModeArr;
        $ENTRIES = new asp(tabLyricsModeArr);
    }

    public TabLyricsMode() {
        throw null;
    }

    public static TabLyricsMode valueOf(String str) {
        return (TabLyricsMode) Enum.valueOf(TabLyricsMode.class, str);
    }

    public static TabLyricsMode[] values() {
        return (TabLyricsMode[]) $VALUES.clone();
    }
}
