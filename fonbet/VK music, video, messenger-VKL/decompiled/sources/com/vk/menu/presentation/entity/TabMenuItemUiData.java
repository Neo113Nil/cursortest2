package com.vk.menu.presentation.entity;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.scheme.SchemeStat$TypeNavigationTabClick;
import com.vkontakte.android.R;
import java.util.Locale;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabMenuItemUiData.kt */
/* loaded from: classes.dex */
public final class TabMenuItemUiData {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TabMenuItemUiData[] $VALUES;
    public static final TabMenuItemUiData CLIPS;
    public static final a Companion;
    public static final TabMenuItemUiData FEEDBACK;
    public static final TabMenuItemUiData FRIENDS;
    public static final TabMenuItemUiData GAMES;
    public static final TabMenuItemUiData GROUPS;
    public static final TabMenuItemUiData HOME;
    public static final TabMenuItemUiData HUB;
    public static final TabMenuItemUiData IM;
    public static final TabMenuItemUiData MANAGED_GROUP;
    public static final TabMenuItemUiData MUSIC;
    public static final TabMenuItemUiData OVERVIEW;
    public static final TabMenuItemUiData PROFILE;
    public static final TabMenuItemUiData VIDEO;
    private final int id;
    private final String stat;
    private final SchemeStat$TypeNavigationTabClick.TabId statTabId;

    /* compiled from: TabMenuItemUiData.kt */
    public static final class a {
        public static TabMenuItemUiData a(int i) {
            for (TabMenuItemUiData tabMenuItemUiData : TabMenuItemUiData.values()) {
                if (tabMenuItemUiData.h() == i) {
                    return tabMenuItemUiData;
                }
            }
            return null;
        }

        public static TabMenuItemUiData b(String str) {
            for (TabMenuItemUiData tabMenuItemUiData : TabMenuItemUiData.values()) {
                if (epx.f(tabMenuItemUiData.name(), str.toUpperCase(Locale.ENGLISH))) {
                    return tabMenuItemUiData;
                }
            }
            return null;
        }
    }

    static {
        TabMenuItemUiData tabMenuItemUiData = new TabMenuItemUiData("HOME", 0, R.id.tab_news, "news", SchemeStat$TypeNavigationTabClick.TabId.NEWS);
        HOME = tabMenuItemUiData;
        TabMenuItemUiData tabMenuItemUiData2 = new TabMenuItemUiData("HUB", 1, R.id.tab_discover, "atlas", SchemeStat$TypeNavigationTabClick.TabId.ATLAS);
        HUB = tabMenuItemUiData2;
        TabMenuItemUiData tabMenuItemUiData3 = new TabMenuItemUiData("IM", 2, R.id.tab_messages, "messages", SchemeStat$TypeNavigationTabClick.TabId.MESSAGES);
        IM = tabMenuItemUiData3;
        TabMenuItemUiData tabMenuItemUiData4 = new TabMenuItemUiData("CLIPS", 3, R.id.tab_clips, "clips", SchemeStat$TypeNavigationTabClick.TabId.CLIPS);
        CLIPS = tabMenuItemUiData4;
        TabMenuItemUiData tabMenuItemUiData5 = new TabMenuItemUiData(Privacy.FRIENDS, 4, R.id.tab_friends, "friends", SchemeStat$TypeNavigationTabClick.TabId.FRIENDS);
        FRIENDS = tabMenuItemUiData5;
        TabMenuItemUiData tabMenuItemUiData6 = new TabMenuItemUiData("PROFILE", 5, R.id.tab_profile, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, SchemeStat$TypeNavigationTabClick.TabId.PROFILE);
        PROFILE = tabMenuItemUiData6;
        TabMenuItemUiData tabMenuItemUiData7 = new TabMenuItemUiData("GROUPS", 6, R.id.tab_groups, "groups", SchemeStat$TypeNavigationTabClick.TabId.GROUPS);
        GROUPS = tabMenuItemUiData7;
        TabMenuItemUiData tabMenuItemUiData8 = new TabMenuItemUiData("FEEDBACK", 7, R.id.tab_feedback, "feedback", SchemeStat$TypeNavigationTabClick.TabId.FEEDBACK);
        FEEDBACK = tabMenuItemUiData8;
        TabMenuItemUiData tabMenuItemUiData9 = new TabMenuItemUiData("MUSIC", 8, R.id.tab_music, "music", SchemeStat$TypeNavigationTabClick.TabId.MUSIC);
        MUSIC = tabMenuItemUiData9;
        TabMenuItemUiData tabMenuItemUiData10 = new TabMenuItemUiData(SignalingProtocol.MEDIA_OPTION_VIDEO, 9, R.id.tab_video, "video", SchemeStat$TypeNavigationTabClick.TabId.VIDEO);
        VIDEO = tabMenuItemUiData10;
        TabMenuItemUiData tabMenuItemUiData11 = new TabMenuItemUiData("GAMES", 10, R.id.tab_games, "games", SchemeStat$TypeNavigationTabClick.TabId.GAMES);
        GAMES = tabMenuItemUiData11;
        TabMenuItemUiData tabMenuItemUiData12 = new TabMenuItemUiData("OVERVIEW", 11, R.id.tab_overview, "overview", SchemeStat$TypeNavigationTabClick.TabId.OVERVIEW);
        OVERVIEW = tabMenuItemUiData12;
        TabMenuItemUiData tabMenuItemUiData13 = new TabMenuItemUiData("MANAGED_GROUP", 12, R.id.tab_managed_group, "managed_group", SchemeStat$TypeNavigationTabClick.TabId.MANAGED_GROUP);
        MANAGED_GROUP = tabMenuItemUiData13;
        TabMenuItemUiData[] tabMenuItemUiDataArr = {tabMenuItemUiData, tabMenuItemUiData2, tabMenuItemUiData3, tabMenuItemUiData4, tabMenuItemUiData5, tabMenuItemUiData6, tabMenuItemUiData7, tabMenuItemUiData8, tabMenuItemUiData9, tabMenuItemUiData10, tabMenuItemUiData11, tabMenuItemUiData12, tabMenuItemUiData13};
        $VALUES = tabMenuItemUiDataArr;
        $ENTRIES = new asp(tabMenuItemUiDataArr);
        Companion = new a();
    }

    public TabMenuItemUiData(String str, int i, int i2, String str2, SchemeStat$TypeNavigationTabClick.TabId tabId) {
        this.id = i2;
        this.stat = str2;
        this.statTabId = tabId;
    }

    public static TabMenuItemUiData valueOf(String str) {
        return (TabMenuItemUiData) Enum.valueOf(TabMenuItemUiData.class, str);
    }

    public static TabMenuItemUiData[] values() {
        return (TabMenuItemUiData[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }

    public final String i() {
        return this.stat;
    }

    public final SchemeStat$TypeNavigationTabClick.TabId j() {
        return this.statTabId;
    }
}
