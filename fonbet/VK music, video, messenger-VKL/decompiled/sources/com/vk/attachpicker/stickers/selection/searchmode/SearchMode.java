package com.vk.attachpicker.stickers.selection.searchmode;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchMode.kt */
/* loaded from: classes15.dex */
public final class SearchMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchMode[] $VALUES;
    public static final SearchMode FULL;
    public static final SearchMode GIF;

    static {
        SearchMode searchMode = new SearchMode("FULL", 0);
        FULL = searchMode;
        SearchMode searchMode2 = new SearchMode("GIF", 1);
        GIF = searchMode2;
        SearchMode[] searchModeArr = {searchMode, searchMode2};
        $VALUES = searchModeArr;
        $ENTRIES = new asp(searchModeArr);
    }

    public SearchMode() {
        throw null;
    }

    public static SearchMode valueOf(String str) {
        return (SearchMode) Enum.valueOf(SearchMode.class, str);
    }

    public static SearchMode[] values() {
        return (SearchMode[]) $VALUES.clone();
    }
}
