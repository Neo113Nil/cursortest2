package com.vk.stat.scheme;

import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$RatingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonMarketStat$RatingType[] $VALUES;

    @pmi0("community")
    public static final CommonMarketStat$RatingType COMMUNITY;

    @pmi0("integration_item")
    public static final CommonMarketStat$RatingType INTEGRATION_ITEM;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    public static final CommonMarketStat$RatingType ITEM;

    @pmi0("ozon_item")
    public static final CommonMarketStat$RatingType OZON_ITEM;

    static {
        CommonMarketStat$RatingType commonMarketStat$RatingType = new CommonMarketStat$RatingType("ITEM", 0);
        ITEM = commonMarketStat$RatingType;
        CommonMarketStat$RatingType commonMarketStat$RatingType2 = new CommonMarketStat$RatingType("COMMUNITY", 1);
        COMMUNITY = commonMarketStat$RatingType2;
        CommonMarketStat$RatingType commonMarketStat$RatingType3 = new CommonMarketStat$RatingType("OZON_ITEM", 2);
        OZON_ITEM = commonMarketStat$RatingType3;
        CommonMarketStat$RatingType commonMarketStat$RatingType4 = new CommonMarketStat$RatingType("INTEGRATION_ITEM", 3);
        INTEGRATION_ITEM = commonMarketStat$RatingType4;
        CommonMarketStat$RatingType[] commonMarketStat$RatingTypeArr = {commonMarketStat$RatingType, commonMarketStat$RatingType2, commonMarketStat$RatingType3, commonMarketStat$RatingType4};
        $VALUES = commonMarketStat$RatingTypeArr;
        $ENTRIES = new asp(commonMarketStat$RatingTypeArr);
    }

    private CommonMarketStat$RatingType(String str, int i) {
    }

    public static CommonMarketStat$RatingType valueOf(String str) {
        return (CommonMarketStat$RatingType) Enum.valueOf(CommonMarketStat$RatingType.class, str);
    }

    public static CommonMarketStat$RatingType[] values() {
        return (CommonMarketStat$RatingType[]) $VALUES.clone();
    }
}
