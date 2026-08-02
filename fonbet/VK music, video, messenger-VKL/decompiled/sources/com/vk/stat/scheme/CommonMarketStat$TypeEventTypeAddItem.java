package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeEventTypeAddItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonMarketStat$TypeEventTypeAddItem[] $VALUES;

    @pmi0("add_item")
    public static final CommonMarketStat$TypeEventTypeAddItem ADD_ITEM;

    @pmi0("set_item_amount")
    public static final CommonMarketStat$TypeEventTypeAddItem SET_ITEM_AMOUNT;

    static {
        CommonMarketStat$TypeEventTypeAddItem commonMarketStat$TypeEventTypeAddItem = new CommonMarketStat$TypeEventTypeAddItem("ADD_ITEM", 0);
        ADD_ITEM = commonMarketStat$TypeEventTypeAddItem;
        CommonMarketStat$TypeEventTypeAddItem commonMarketStat$TypeEventTypeAddItem2 = new CommonMarketStat$TypeEventTypeAddItem("SET_ITEM_AMOUNT", 1);
        SET_ITEM_AMOUNT = commonMarketStat$TypeEventTypeAddItem2;
        CommonMarketStat$TypeEventTypeAddItem[] commonMarketStat$TypeEventTypeAddItemArr = {commonMarketStat$TypeEventTypeAddItem, commonMarketStat$TypeEventTypeAddItem2};
        $VALUES = commonMarketStat$TypeEventTypeAddItemArr;
        $ENTRIES = new asp(commonMarketStat$TypeEventTypeAddItemArr);
    }

    private CommonMarketStat$TypeEventTypeAddItem(String str, int i) {
    }

    public static CommonMarketStat$TypeEventTypeAddItem valueOf(String str) {
        return (CommonMarketStat$TypeEventTypeAddItem) Enum.valueOf(CommonMarketStat$TypeEventTypeAddItem.class, str);
    }

    public static CommonMarketStat$TypeEventTypeAddItem[] values() {
        return (CommonMarketStat$TypeEventTypeAddItem[]) $VALUES.clone();
    }
}
