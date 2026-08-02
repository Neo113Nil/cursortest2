package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeEventTypeRemoveItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonMarketStat$TypeEventTypeRemoveItem[] $VALUES;

    @pmi0("all")
    public static final CommonMarketStat$TypeEventTypeRemoveItem ALL;

    @pmi0("set_item_amount")
    public static final CommonMarketStat$TypeEventTypeRemoveItem SET_ITEM_AMOUNT;

    static {
        CommonMarketStat$TypeEventTypeRemoveItem commonMarketStat$TypeEventTypeRemoveItem = new CommonMarketStat$TypeEventTypeRemoveItem("SET_ITEM_AMOUNT", 0);
        SET_ITEM_AMOUNT = commonMarketStat$TypeEventTypeRemoveItem;
        CommonMarketStat$TypeEventTypeRemoveItem commonMarketStat$TypeEventTypeRemoveItem2 = new CommonMarketStat$TypeEventTypeRemoveItem("ALL", 1);
        ALL = commonMarketStat$TypeEventTypeRemoveItem2;
        CommonMarketStat$TypeEventTypeRemoveItem[] commonMarketStat$TypeEventTypeRemoveItemArr = {commonMarketStat$TypeEventTypeRemoveItem, commonMarketStat$TypeEventTypeRemoveItem2};
        $VALUES = commonMarketStat$TypeEventTypeRemoveItemArr;
        $ENTRIES = new asp(commonMarketStat$TypeEventTypeRemoveItemArr);
    }

    private CommonMarketStat$TypeEventTypeRemoveItem(String str, int i) {
    }

    public static CommonMarketStat$TypeEventTypeRemoveItem valueOf(String str) {
        return (CommonMarketStat$TypeEventTypeRemoveItem) Enum.valueOf(CommonMarketStat$TypeEventTypeRemoveItem.class, str);
    }

    public static CommonMarketStat$TypeEventTypeRemoveItem[] values() {
        return (CommonMarketStat$TypeEventTypeRemoveItem[]) $VALUES.clone();
    }
}
