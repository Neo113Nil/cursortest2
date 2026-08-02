package com.vk.search.integration.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchTab.kt */
/* loaded from: classes5.dex */
public final class SearchTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchTab[] $VALUES;
    public static final SearchTab CLIPS;
    public static final SearchTab MARKET;
    public static final SearchTab MUSIC;
    public static final SearchTab PHOTOS;
    public static final SearchTab VIDEOS;
    public static final SearchTab WALL;

    static {
        SearchTab searchTab = new SearchTab("CLIPS", 0);
        CLIPS = searchTab;
        SearchTab searchTab2 = new SearchTab("MARKET", 1);
        MARKET = searchTab2;
        SearchTab searchTab3 = new SearchTab("MUSIC", 2);
        MUSIC = searchTab3;
        SearchTab searchTab4 = new SearchTab("PHOTOS", 3);
        PHOTOS = searchTab4;
        SearchTab searchTab5 = new SearchTab("VIDEOS", 4);
        VIDEOS = searchTab5;
        SearchTab searchTab6 = new SearchTab("WALL", 5);
        WALL = searchTab6;
        SearchTab[] searchTabArr = {searchTab, searchTab2, searchTab3, searchTab4, searchTab5, searchTab6};
        $VALUES = searchTabArr;
        $ENTRIES = new asp(searchTabArr);
    }

    public SearchTab() {
        throw null;
    }

    public static zrp<SearchTab> h() {
        return $ENTRIES;
    }

    public static SearchTab valueOf(String str) {
        return (SearchTab) Enum.valueOf(SearchTab.class, str);
    }

    public static SearchTab[] values() {
        return (SearchTab[]) $VALUES.clone();
    }
}
