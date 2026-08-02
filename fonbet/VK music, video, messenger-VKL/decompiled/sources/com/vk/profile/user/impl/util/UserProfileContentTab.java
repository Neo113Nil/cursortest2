package com.vk.profile.user.impl.util;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentTabExt.kt */
/* loaded from: classes5.dex */
public final class UserProfileContentTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserProfileContentTab[] $VALUES;
    public static final UserProfileContentTab ARCHIVE_WALL;
    public static final UserProfileContentTab ARTICLES;
    public static final UserProfileContentTab AUDIOS;
    public static final UserProfileContentTab GIFTS;
    public static final UserProfileContentTab NARRATIVES;
    public static final UserProfileContentTab PHOTOS;
    public static final UserProfileContentTab SHORT_CLIPS;
    public static final UserProfileContentTab VIDEOS;
    public static final UserProfileContentTab WALL;
    private final String serverName;

    static {
        UserProfileContentTab userProfileContentTab = new UserProfileContentTab("WALL", 0, "wall");
        WALL = userProfileContentTab;
        UserProfileContentTab userProfileContentTab2 = new UserProfileContentTab("PHOTOS", 1, "photos");
        PHOTOS = userProfileContentTab2;
        UserProfileContentTab userProfileContentTab3 = new UserProfileContentTab("SHORT_CLIPS", 2, "short_videos");
        SHORT_CLIPS = userProfileContentTab3;
        UserProfileContentTab userProfileContentTab4 = new UserProfileContentTab("VIDEOS", 3, "videos");
        VIDEOS = userProfileContentTab4;
        UserProfileContentTab userProfileContentTab5 = new UserProfileContentTab("AUDIOS", 4, "audios");
        AUDIOS = userProfileContentTab5;
        UserProfileContentTab userProfileContentTab6 = new UserProfileContentTab("NARRATIVES", 5, "narratives");
        NARRATIVES = userProfileContentTab6;
        UserProfileContentTab userProfileContentTab7 = new UserProfileContentTab("ARTICLES", 6, "articles");
        ARTICLES = userProfileContentTab7;
        UserProfileContentTab userProfileContentTab8 = new UserProfileContentTab("GIFTS", 7, "gifts");
        GIFTS = userProfileContentTab8;
        UserProfileContentTab userProfileContentTab9 = new UserProfileContentTab("ARCHIVE_WALL", 8, "archive_wall");
        ARCHIVE_WALL = userProfileContentTab9;
        UserProfileContentTab[] userProfileContentTabArr = {userProfileContentTab, userProfileContentTab2, userProfileContentTab3, userProfileContentTab4, userProfileContentTab5, userProfileContentTab6, userProfileContentTab7, userProfileContentTab8, userProfileContentTab9};
        $VALUES = userProfileContentTabArr;
        $ENTRIES = new asp(userProfileContentTabArr);
    }

    public UserProfileContentTab(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static UserProfileContentTab valueOf(String str) {
        return (UserProfileContentTab) Enum.valueOf(UserProfileContentTab.class, str);
    }

    public static UserProfileContentTab[] values() {
        return (UserProfileContentTab[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
