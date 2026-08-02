package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeSmbNativeBookingBookingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonMarketStat$TypeSmbNativeBookingBookingType[] $VALUES;

    @pmi0("activity")
    public static final CommonMarketStat$TypeSmbNativeBookingBookingType ACTIVITY;

    @pmi0("individual")
    public static final CommonMarketStat$TypeSmbNativeBookingBookingType INDIVIDUAL;

    static {
        CommonMarketStat$TypeSmbNativeBookingBookingType commonMarketStat$TypeSmbNativeBookingBookingType = new CommonMarketStat$TypeSmbNativeBookingBookingType("INDIVIDUAL", 0);
        INDIVIDUAL = commonMarketStat$TypeSmbNativeBookingBookingType;
        CommonMarketStat$TypeSmbNativeBookingBookingType commonMarketStat$TypeSmbNativeBookingBookingType2 = new CommonMarketStat$TypeSmbNativeBookingBookingType("ACTIVITY", 1);
        ACTIVITY = commonMarketStat$TypeSmbNativeBookingBookingType2;
        CommonMarketStat$TypeSmbNativeBookingBookingType[] commonMarketStat$TypeSmbNativeBookingBookingTypeArr = {commonMarketStat$TypeSmbNativeBookingBookingType, commonMarketStat$TypeSmbNativeBookingBookingType2};
        $VALUES = commonMarketStat$TypeSmbNativeBookingBookingTypeArr;
        $ENTRIES = new asp(commonMarketStat$TypeSmbNativeBookingBookingTypeArr);
    }

    private CommonMarketStat$TypeSmbNativeBookingBookingType(String str, int i) {
    }

    public static CommonMarketStat$TypeSmbNativeBookingBookingType valueOf(String str) {
        return (CommonMarketStat$TypeSmbNativeBookingBookingType) Enum.valueOf(CommonMarketStat$TypeSmbNativeBookingBookingType.class, str);
    }

    public static CommonMarketStat$TypeSmbNativeBookingBookingType[] values() {
        return (CommonMarketStat$TypeSmbNativeBookingBookingType[]) $VALUES.clone();
    }
}
