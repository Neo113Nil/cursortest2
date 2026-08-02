package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonSearchStat.kt */
/* loaded from: classes5.dex */
public final class CommonSearchStat$TypeSearchLocalServiceItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonSearchStat$TypeSearchLocalServiceItem[] $VALUES;

    @pmi0("invite_to_call")
    public static final CommonSearchStat$TypeSearchLocalServiceItem INVITE_TO_CALL;

    @pmi0("invite_to_call_recommendations")
    public static final CommonSearchStat$TypeSearchLocalServiceItem INVITE_TO_CALL_RECOMMENDATIONS;

    @pmi0("search_archived_dialogs")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_ARCHIVED_DIALOGS;

    @pmi0("search_dialogs")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_DIALOGS;

    @pmi0("search_dialogs_recommendations")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_DIALOGS_RECOMMENDATIONS;

    @pmi0("search_dialog_to_share")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_DIALOG_TO_SHARE;

    @pmi0("search_filter_all_dialogs")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_FILTER_ALL_DIALOGS;

    @pmi0("search_filter_archive_dialogs")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_FILTER_ARCHIVE_DIALOGS;

    @pmi0("search_filter_business_dialogs")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_FILTER_BUSINESS_DIALOGS;

    @pmi0("search_filter_requests_dialogs")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_FILTER_REQUESTS_DIALOGS;

    @pmi0("search_filter_unread_dialogs")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_FILTER_UNREAD_DIALOGS;

    @pmi0("search_invite_to_chat")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_INVITE_TO_CHAT;

    @pmi0("search_msgs_in_dialog")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_MSGS_IN_DIALOG;

    @pmi0("search_notifications_settings")
    public static final CommonSearchStat$TypeSearchLocalServiceItem SEARCH_NOTIFICATIONS_SETTINGS;

    @pmi0("unknown")
    public static final CommonSearchStat$TypeSearchLocalServiceItem UNKNOWN;

    static {
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_DIALOGS", 0);
        SEARCH_DIALOGS = commonSearchStat$TypeSearchLocalServiceItem;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem2 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_DIALOGS_RECOMMENDATIONS", 1);
        SEARCH_DIALOGS_RECOMMENDATIONS = commonSearchStat$TypeSearchLocalServiceItem2;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem3 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_INVITE_TO_CHAT", 2);
        SEARCH_INVITE_TO_CHAT = commonSearchStat$TypeSearchLocalServiceItem3;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem4 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_DIALOG_TO_SHARE", 3);
        SEARCH_DIALOG_TO_SHARE = commonSearchStat$TypeSearchLocalServiceItem4;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem5 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_MSGS_IN_DIALOG", 4);
        SEARCH_MSGS_IN_DIALOG = commonSearchStat$TypeSearchLocalServiceItem5;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem6 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_ARCHIVED_DIALOGS", 5);
        SEARCH_ARCHIVED_DIALOGS = commonSearchStat$TypeSearchLocalServiceItem6;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem7 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_FILTER_UNREAD_DIALOGS", 6);
        SEARCH_FILTER_UNREAD_DIALOGS = commonSearchStat$TypeSearchLocalServiceItem7;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem8 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_FILTER_REQUESTS_DIALOGS", 7);
        SEARCH_FILTER_REQUESTS_DIALOGS = commonSearchStat$TypeSearchLocalServiceItem8;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem9 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_FILTER_BUSINESS_DIALOGS", 8);
        SEARCH_FILTER_BUSINESS_DIALOGS = commonSearchStat$TypeSearchLocalServiceItem9;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem10 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_FILTER_ALL_DIALOGS", 9);
        SEARCH_FILTER_ALL_DIALOGS = commonSearchStat$TypeSearchLocalServiceItem10;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem11 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_FILTER_ARCHIVE_DIALOGS", 10);
        SEARCH_FILTER_ARCHIVE_DIALOGS = commonSearchStat$TypeSearchLocalServiceItem11;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem12 = new CommonSearchStat$TypeSearchLocalServiceItem("SEARCH_NOTIFICATIONS_SETTINGS", 11);
        SEARCH_NOTIFICATIONS_SETTINGS = commonSearchStat$TypeSearchLocalServiceItem12;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem13 = new CommonSearchStat$TypeSearchLocalServiceItem("INVITE_TO_CALL_RECOMMENDATIONS", 12);
        INVITE_TO_CALL_RECOMMENDATIONS = commonSearchStat$TypeSearchLocalServiceItem13;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem14 = new CommonSearchStat$TypeSearchLocalServiceItem("INVITE_TO_CALL", 13);
        INVITE_TO_CALL = commonSearchStat$TypeSearchLocalServiceItem14;
        CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem15 = new CommonSearchStat$TypeSearchLocalServiceItem(GrsBaseInfo.CountryCodeSource.UNKNOWN, 14);
        UNKNOWN = commonSearchStat$TypeSearchLocalServiceItem15;
        CommonSearchStat$TypeSearchLocalServiceItem[] commonSearchStat$TypeSearchLocalServiceItemArr = {commonSearchStat$TypeSearchLocalServiceItem, commonSearchStat$TypeSearchLocalServiceItem2, commonSearchStat$TypeSearchLocalServiceItem3, commonSearchStat$TypeSearchLocalServiceItem4, commonSearchStat$TypeSearchLocalServiceItem5, commonSearchStat$TypeSearchLocalServiceItem6, commonSearchStat$TypeSearchLocalServiceItem7, commonSearchStat$TypeSearchLocalServiceItem8, commonSearchStat$TypeSearchLocalServiceItem9, commonSearchStat$TypeSearchLocalServiceItem10, commonSearchStat$TypeSearchLocalServiceItem11, commonSearchStat$TypeSearchLocalServiceItem12, commonSearchStat$TypeSearchLocalServiceItem13, commonSearchStat$TypeSearchLocalServiceItem14, commonSearchStat$TypeSearchLocalServiceItem15};
        $VALUES = commonSearchStat$TypeSearchLocalServiceItemArr;
        $ENTRIES = new asp(commonSearchStat$TypeSearchLocalServiceItemArr);
    }

    private CommonSearchStat$TypeSearchLocalServiceItem(String str, int i) {
    }

    public static CommonSearchStat$TypeSearchLocalServiceItem valueOf(String str) {
        return (CommonSearchStat$TypeSearchLocalServiceItem) Enum.valueOf(CommonSearchStat$TypeSearchLocalServiceItem.class, str);
    }

    public static CommonSearchStat$TypeSearchLocalServiceItem[] values() {
        return (CommonSearchStat$TypeSearchLocalServiceItem[]) $VALUES.clone();
    }
}
