package com.vk.im.engine.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchMode.kt */
/* loaded from: classes2.dex */
public final class SearchMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchMode[] $VALUES;
    public static final SearchMode CHANNELS;
    public static final SearchMode MESSAGES;
    public static final SearchMode PEERS;

    static {
        SearchMode searchMode = new SearchMode("MESSAGES", 0);
        MESSAGES = searchMode;
        SearchMode searchMode2 = new SearchMode("PEERS", 1);
        PEERS = searchMode2;
        SearchMode searchMode3 = new SearchMode("CHANNELS", 2);
        CHANNELS = searchMode3;
        SearchMode[] searchModeArr = {searchMode, searchMode2, searchMode3};
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
