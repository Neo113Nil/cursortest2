package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonSearchStat.kt */
/* loaded from: classes5.dex */
public final class CommonSearchStat$TypeSearchLocalBlockItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonSearchStat$TypeSearchLocalBlockItem[] $VALUES;

    @pmi0("except_friends")
    public static final CommonSearchStat$TypeSearchLocalBlockItem EXCEPT_FRIENDS;

    @pmi0("friends")
    public static final CommonSearchStat$TypeSearchLocalBlockItem FRIENDS;

    @pmi0("people_important")
    public static final CommonSearchStat$TypeSearchLocalBlockItem PEOPLE_IMPORTANT;

    @pmi0("people_recommendations")
    public static final CommonSearchStat$TypeSearchLocalBlockItem PEOPLE_RECOMMENDATIONS;

    @pmi0("search_cache_recommendations_important")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_CACHE_RECOMMENDATIONS_IMPORTANT;

    @pmi0("search_cache_recommendations_recent")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_CACHE_RECOMMENDATIONS_RECENT;

    @pmi0("search_local_contacts_no_vk")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_LOCAL_CONTACTS_NO_VK;

    @pmi0("search_local_dialogs")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_LOCAL_DIALOGS;

    @pmi0("search_local_recommendations_important")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_LOCAL_RECOMMENDATIONS_IMPORTANT;

    @pmi0("search_local_recommendations_recent")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_LOCAL_RECOMMENDATIONS_RECENT;

    @pmi0("search_notifications_settings")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_NOTIFICATIONS_SETTINGS;

    @pmi0("search_other_dialogs")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_OTHER_DIALOGS;

    @pmi0("search_playlist_card")
    public static final CommonSearchStat$TypeSearchLocalBlockItem SEARCH_PLAYLIST_CARD;

    @pmi0("unknown")
    public static final CommonSearchStat$TypeSearchLocalBlockItem UNKNOWN;

    static {
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_CACHE_RECOMMENDATIONS_IMPORTANT", 0);
        SEARCH_CACHE_RECOMMENDATIONS_IMPORTANT = commonSearchStat$TypeSearchLocalBlockItem;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem2 = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_CACHE_RECOMMENDATIONS_RECENT", 1);
        SEARCH_CACHE_RECOMMENDATIONS_RECENT = commonSearchStat$TypeSearchLocalBlockItem2;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem3 = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_LOCAL_RECOMMENDATIONS_IMPORTANT", 2);
        SEARCH_LOCAL_RECOMMENDATIONS_IMPORTANT = commonSearchStat$TypeSearchLocalBlockItem3;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem4 = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_LOCAL_RECOMMENDATIONS_RECENT", 3);
        SEARCH_LOCAL_RECOMMENDATIONS_RECENT = commonSearchStat$TypeSearchLocalBlockItem4;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem5 = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_LOCAL_DIALOGS", 4);
        SEARCH_LOCAL_DIALOGS = commonSearchStat$TypeSearchLocalBlockItem5;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem6 = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_OTHER_DIALOGS", 5);
        SEARCH_OTHER_DIALOGS = commonSearchStat$TypeSearchLocalBlockItem6;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem7 = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_LOCAL_CONTACTS_NO_VK", 6);
        SEARCH_LOCAL_CONTACTS_NO_VK = commonSearchStat$TypeSearchLocalBlockItem7;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem8 = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_NOTIFICATIONS_SETTINGS", 7);
        SEARCH_NOTIFICATIONS_SETTINGS = commonSearchStat$TypeSearchLocalBlockItem8;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem9 = new CommonSearchStat$TypeSearchLocalBlockItem("SEARCH_PLAYLIST_CARD", 8);
        SEARCH_PLAYLIST_CARD = commonSearchStat$TypeSearchLocalBlockItem9;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem10 = new CommonSearchStat$TypeSearchLocalBlockItem("PEOPLE_IMPORTANT", 9);
        PEOPLE_IMPORTANT = commonSearchStat$TypeSearchLocalBlockItem10;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem11 = new CommonSearchStat$TypeSearchLocalBlockItem("PEOPLE_RECOMMENDATIONS", 10);
        PEOPLE_RECOMMENDATIONS = commonSearchStat$TypeSearchLocalBlockItem11;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem12 = new CommonSearchStat$TypeSearchLocalBlockItem(Privacy.FRIENDS, 11);
        FRIENDS = commonSearchStat$TypeSearchLocalBlockItem12;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem13 = new CommonSearchStat$TypeSearchLocalBlockItem("EXCEPT_FRIENDS", 12);
        EXCEPT_FRIENDS = commonSearchStat$TypeSearchLocalBlockItem13;
        CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem14 = new CommonSearchStat$TypeSearchLocalBlockItem(GrsBaseInfo.CountryCodeSource.UNKNOWN, 13);
        UNKNOWN = commonSearchStat$TypeSearchLocalBlockItem14;
        CommonSearchStat$TypeSearchLocalBlockItem[] commonSearchStat$TypeSearchLocalBlockItemArr = {commonSearchStat$TypeSearchLocalBlockItem, commonSearchStat$TypeSearchLocalBlockItem2, commonSearchStat$TypeSearchLocalBlockItem3, commonSearchStat$TypeSearchLocalBlockItem4, commonSearchStat$TypeSearchLocalBlockItem5, commonSearchStat$TypeSearchLocalBlockItem6, commonSearchStat$TypeSearchLocalBlockItem7, commonSearchStat$TypeSearchLocalBlockItem8, commonSearchStat$TypeSearchLocalBlockItem9, commonSearchStat$TypeSearchLocalBlockItem10, commonSearchStat$TypeSearchLocalBlockItem11, commonSearchStat$TypeSearchLocalBlockItem12, commonSearchStat$TypeSearchLocalBlockItem13, commonSearchStat$TypeSearchLocalBlockItem14};
        $VALUES = commonSearchStat$TypeSearchLocalBlockItemArr;
        $ENTRIES = new asp(commonSearchStat$TypeSearchLocalBlockItemArr);
    }

    private CommonSearchStat$TypeSearchLocalBlockItem(String str, int i) {
    }

    public static CommonSearchStat$TypeSearchLocalBlockItem valueOf(String str) {
        return (CommonSearchStat$TypeSearchLocalBlockItem) Enum.valueOf(CommonSearchStat$TypeSearchLocalBlockItem.class, str);
    }

    public static CommonSearchStat$TypeSearchLocalBlockItem[] values() {
        return (CommonSearchStat$TypeSearchLocalBlockItem[]) $VALUES.clone();
    }
}
