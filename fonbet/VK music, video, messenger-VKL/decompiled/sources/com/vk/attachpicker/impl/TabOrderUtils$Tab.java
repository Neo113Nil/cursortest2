package com.vk.attachpicker.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabOrderUtils.kt */
/* loaded from: classes15.dex */
public final class TabOrderUtils$Tab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TabOrderUtils$Tab[] $VALUES;
    public static final TabOrderUtils$Tab ACHIEVEMENTS;
    public static final TabOrderUtils$Tab DOCUMENTS;
    public static final TabOrderUtils$Tab GALLERY;
    public static final TabOrderUtils$Tab GAMES;
    public static final TabOrderUtils$Tab GIFTS;
    public static final TabOrderUtils$Tab GRAFFITI;
    public static final TabOrderUtils$Tab MAP;
    public static final TabOrderUtils$Tab MUSIC;
    public static final TabOrderUtils$Tab PHOTO_VK;
    public static final TabOrderUtils$Tab POLL;
    public static final TabOrderUtils$Tab SERVICES;
    public static final TabOrderUtils$Tab STORIES;
    public static final TabOrderUtils$Tab UNKNOWN;
    public static final TabOrderUtils$Tab VIDEO_VK;

    static {
        TabOrderUtils$Tab tabOrderUtils$Tab = new TabOrderUtils$Tab(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = tabOrderUtils$Tab;
        TabOrderUtils$Tab tabOrderUtils$Tab2 = new TabOrderUtils$Tab("STORIES", 1);
        STORIES = tabOrderUtils$Tab2;
        TabOrderUtils$Tab tabOrderUtils$Tab3 = new TabOrderUtils$Tab("GALLERY", 2);
        GALLERY = tabOrderUtils$Tab3;
        TabOrderUtils$Tab tabOrderUtils$Tab4 = new TabOrderUtils$Tab("ACHIEVEMENTS", 3);
        ACHIEVEMENTS = tabOrderUtils$Tab4;
        TabOrderUtils$Tab tabOrderUtils$Tab5 = new TabOrderUtils$Tab("MUSIC", 4);
        MUSIC = tabOrderUtils$Tab5;
        TabOrderUtils$Tab tabOrderUtils$Tab6 = new TabOrderUtils$Tab("SERVICES", 5);
        SERVICES = tabOrderUtils$Tab6;
        TabOrderUtils$Tab tabOrderUtils$Tab7 = new TabOrderUtils$Tab("GIFTS", 6);
        GIFTS = tabOrderUtils$Tab7;
        TabOrderUtils$Tab tabOrderUtils$Tab8 = new TabOrderUtils$Tab("MAP", 7);
        MAP = tabOrderUtils$Tab8;
        TabOrderUtils$Tab tabOrderUtils$Tab9 = new TabOrderUtils$Tab("DOCUMENTS", 8);
        DOCUMENTS = tabOrderUtils$Tab9;
        TabOrderUtils$Tab tabOrderUtils$Tab10 = new TabOrderUtils$Tab("POLL", 9);
        POLL = tabOrderUtils$Tab10;
        TabOrderUtils$Tab tabOrderUtils$Tab11 = new TabOrderUtils$Tab("GAMES", 10);
        GAMES = tabOrderUtils$Tab11;
        TabOrderUtils$Tab tabOrderUtils$Tab12 = new TabOrderUtils$Tab("GRAFFITI", 11);
        GRAFFITI = tabOrderUtils$Tab12;
        TabOrderUtils$Tab tabOrderUtils$Tab13 = new TabOrderUtils$Tab("PHOTO_VK", 12);
        PHOTO_VK = tabOrderUtils$Tab13;
        TabOrderUtils$Tab tabOrderUtils$Tab14 = new TabOrderUtils$Tab("VIDEO_VK", 13);
        VIDEO_VK = tabOrderUtils$Tab14;
        TabOrderUtils$Tab[] tabOrderUtils$TabArr = {tabOrderUtils$Tab, tabOrderUtils$Tab2, tabOrderUtils$Tab3, tabOrderUtils$Tab4, tabOrderUtils$Tab5, tabOrderUtils$Tab6, tabOrderUtils$Tab7, tabOrderUtils$Tab8, tabOrderUtils$Tab9, tabOrderUtils$Tab10, tabOrderUtils$Tab11, tabOrderUtils$Tab12, tabOrderUtils$Tab13, tabOrderUtils$Tab14};
        $VALUES = tabOrderUtils$TabArr;
        $ENTRIES = new asp(tabOrderUtils$TabArr);
    }

    public TabOrderUtils$Tab() {
        throw null;
    }

    public static zrp<TabOrderUtils$Tab> h() {
        return $ENTRIES;
    }

    public static TabOrderUtils$Tab valueOf(String str) {
        return (TabOrderUtils$Tab) Enum.valueOf(TabOrderUtils$Tab.class, str);
    }

    public static TabOrderUtils$Tab[] values() {
        return (TabOrderUtils$Tab[]) $VALUES.clone();
    }
}
