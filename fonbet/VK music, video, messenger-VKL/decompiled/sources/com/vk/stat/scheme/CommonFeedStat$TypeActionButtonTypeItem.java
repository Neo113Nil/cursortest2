package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonFeedStat.kt */
/* loaded from: classes5.dex */
public final class CommonFeedStat$TypeActionButtonTypeItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonFeedStat$TypeActionButtonTypeItem[] $VALUES;

    @pmi0("buy_ticket")
    public static final CommonFeedStat$TypeActionButtonTypeItem BUY_TICKET;

    @pmi0("donut_goal")
    public static final CommonFeedStat$TypeActionButtonTypeItem DONUT_GOAL;

    @pmi0("donut_level")
    public static final CommonFeedStat$TypeActionButtonTypeItem DONUT_LEVEL;

    @pmi0("donut_levels")
    public static final CommonFeedStat$TypeActionButtonTypeItem DONUT_LEVELS;

    @pmi0("donut_support")
    public static final CommonFeedStat$TypeActionButtonTypeItem DONUT_SUPPORT;

    @pmi0("message_to_channel")
    public static final CommonFeedStat$TypeActionButtonTypeItem MESSAGE_TO_CHANNEL;

    @pmi0("message_to_community")
    public static final CommonFeedStat$TypeActionButtonTypeItem MESSAGE_TO_COMMUNITY;

    @pmi0("online_booking")
    public static final CommonFeedStat$TypeActionButtonTypeItem ONLINE_BOOKING;

    @pmi0("open_market")
    public static final CommonFeedStat$TypeActionButtonTypeItem OPEN_MARKET;

    @pmi0("vk_ticket")
    public static final CommonFeedStat$TypeActionButtonTypeItem VK_TICKET;

    static {
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem = new CommonFeedStat$TypeActionButtonTypeItem("OPEN_MARKET", 0);
        OPEN_MARKET = commonFeedStat$TypeActionButtonTypeItem;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem2 = new CommonFeedStat$TypeActionButtonTypeItem("BUY_TICKET", 1);
        BUY_TICKET = commonFeedStat$TypeActionButtonTypeItem2;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem3 = new CommonFeedStat$TypeActionButtonTypeItem("VK_TICKET", 2);
        VK_TICKET = commonFeedStat$TypeActionButtonTypeItem3;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem4 = new CommonFeedStat$TypeActionButtonTypeItem("MESSAGE_TO_COMMUNITY", 3);
        MESSAGE_TO_COMMUNITY = commonFeedStat$TypeActionButtonTypeItem4;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem5 = new CommonFeedStat$TypeActionButtonTypeItem("MESSAGE_TO_CHANNEL", 4);
        MESSAGE_TO_CHANNEL = commonFeedStat$TypeActionButtonTypeItem5;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem6 = new CommonFeedStat$TypeActionButtonTypeItem("ONLINE_BOOKING", 5);
        ONLINE_BOOKING = commonFeedStat$TypeActionButtonTypeItem6;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem7 = new CommonFeedStat$TypeActionButtonTypeItem("DONUT_LEVELS", 6);
        DONUT_LEVELS = commonFeedStat$TypeActionButtonTypeItem7;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem8 = new CommonFeedStat$TypeActionButtonTypeItem("DONUT_LEVEL", 7);
        DONUT_LEVEL = commonFeedStat$TypeActionButtonTypeItem8;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem9 = new CommonFeedStat$TypeActionButtonTypeItem("DONUT_GOAL", 8);
        DONUT_GOAL = commonFeedStat$TypeActionButtonTypeItem9;
        CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem10 = new CommonFeedStat$TypeActionButtonTypeItem("DONUT_SUPPORT", 9);
        DONUT_SUPPORT = commonFeedStat$TypeActionButtonTypeItem10;
        CommonFeedStat$TypeActionButtonTypeItem[] commonFeedStat$TypeActionButtonTypeItemArr = {commonFeedStat$TypeActionButtonTypeItem, commonFeedStat$TypeActionButtonTypeItem2, commonFeedStat$TypeActionButtonTypeItem3, commonFeedStat$TypeActionButtonTypeItem4, commonFeedStat$TypeActionButtonTypeItem5, commonFeedStat$TypeActionButtonTypeItem6, commonFeedStat$TypeActionButtonTypeItem7, commonFeedStat$TypeActionButtonTypeItem8, commonFeedStat$TypeActionButtonTypeItem9, commonFeedStat$TypeActionButtonTypeItem10};
        $VALUES = commonFeedStat$TypeActionButtonTypeItemArr;
        $ENTRIES = new asp(commonFeedStat$TypeActionButtonTypeItemArr);
    }

    private CommonFeedStat$TypeActionButtonTypeItem(String str, int i) {
    }

    public static zrp<CommonFeedStat$TypeActionButtonTypeItem> h() {
        return $ENTRIES;
    }

    public static CommonFeedStat$TypeActionButtonTypeItem valueOf(String str) {
        return (CommonFeedStat$TypeActionButtonTypeItem) Enum.valueOf(CommonFeedStat$TypeActionButtonTypeItem.class, str);
    }

    public static CommonFeedStat$TypeActionButtonTypeItem[] values() {
        return (CommonFeedStat$TypeActionButtonTypeItem[]) $VALUES.clone();
    }
}
