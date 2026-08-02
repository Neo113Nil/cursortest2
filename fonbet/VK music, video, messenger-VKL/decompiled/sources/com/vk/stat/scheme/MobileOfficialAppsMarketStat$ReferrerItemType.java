package com.vk.stat.scheme;

import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.uay;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsMarketStat$ReferrerItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsMarketStat$ReferrerItemType[] $VALUES;
    public static final MobileOfficialAppsMarketStat$ReferrerItemType OTHER_GOODS;
    public static final MobileOfficialAppsMarketStat$ReferrerItemType RECOMMENDED_GOODS;
    public static final MobileOfficialAppsMarketStat$ReferrerItemType SIMILAR_ITEMS;
    public static final MobileOfficialAppsMarketStat$ReferrerItemType SIMILAR_ITEMS_BOOKMARKS;
    private final String value;

    /* compiled from: MobileOfficialAppsMarketStat.kt */
    public static final class Serializer implements uay<MobileOfficialAppsMarketStat$ReferrerItemType> {
        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            return new hay(((MobileOfficialAppsMarketStat$ReferrerItemType) obj).value);
        }
    }

    static {
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = new MobileOfficialAppsMarketStat$ReferrerItemType("OTHER_GOODS", 0, "other_goods");
        OTHER_GOODS = mobileOfficialAppsMarketStat$ReferrerItemType;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType2 = new MobileOfficialAppsMarketStat$ReferrerItemType("RECOMMENDED_GOODS", 1, "recommended_goods");
        RECOMMENDED_GOODS = mobileOfficialAppsMarketStat$ReferrerItemType2;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType3 = new MobileOfficialAppsMarketStat$ReferrerItemType("SIMILAR_ITEMS", 2, "similar_items");
        SIMILAR_ITEMS = mobileOfficialAppsMarketStat$ReferrerItemType3;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType4 = new MobileOfficialAppsMarketStat$ReferrerItemType("SIMILAR_ITEMS_BOOKMARKS", 3, "similar_items_bookmarks");
        SIMILAR_ITEMS_BOOKMARKS = mobileOfficialAppsMarketStat$ReferrerItemType4;
        MobileOfficialAppsMarketStat$ReferrerItemType[] mobileOfficialAppsMarketStat$ReferrerItemTypeArr = {mobileOfficialAppsMarketStat$ReferrerItemType, mobileOfficialAppsMarketStat$ReferrerItemType2, mobileOfficialAppsMarketStat$ReferrerItemType3, mobileOfficialAppsMarketStat$ReferrerItemType4};
        $VALUES = mobileOfficialAppsMarketStat$ReferrerItemTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsMarketStat$ReferrerItemTypeArr);
    }

    public MobileOfficialAppsMarketStat$ReferrerItemType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobileOfficialAppsMarketStat$ReferrerItemType valueOf(String str) {
        return (MobileOfficialAppsMarketStat$ReferrerItemType) Enum.valueOf(MobileOfficialAppsMarketStat$ReferrerItemType.class, str);
    }

    public static MobileOfficialAppsMarketStat$ReferrerItemType[] values() {
        return (MobileOfficialAppsMarketStat$ReferrerItemType[]) $VALUES.clone();
    }
}
