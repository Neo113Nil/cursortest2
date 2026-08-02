package com.vk.catalog2.common.ui.holders.search;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchState.kt */
/* loaded from: classes16.dex */
public final class SearchState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchState[] $VALUES;
    public static final SearchState Search;
    public static final SearchState Suggestion;

    static {
        SearchState searchState = new SearchState("Search", 0);
        Search = searchState;
        SearchState searchState2 = new SearchState("Suggestion", 1);
        Suggestion = searchState2;
        SearchState[] searchStateArr = {searchState, searchState2};
        $VALUES = searchStateArr;
        $ENTRIES = new asp(searchStateArr);
    }

    public SearchState() {
        throw null;
    }

    public static SearchState valueOf(String str) {
        return (SearchState) Enum.valueOf(SearchState.class, str);
    }

    public static SearchState[] values() {
        return (SearchState[]) $VALUES.clone();
    }
}
