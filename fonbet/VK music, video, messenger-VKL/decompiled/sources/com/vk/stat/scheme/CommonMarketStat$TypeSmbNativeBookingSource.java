package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeSmbNativeBookingSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonMarketStat$TypeSmbNativeBookingSource[] $VALUES;

    @pmi0("record")
    public static final CommonMarketStat$TypeSmbNativeBookingSource RECORD;

    @pmi0("repeat_record")
    public static final CommonMarketStat$TypeSmbNativeBookingSource REPEAT_RECORD;

    static {
        CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource = new CommonMarketStat$TypeSmbNativeBookingSource("RECORD", 0);
        RECORD = commonMarketStat$TypeSmbNativeBookingSource;
        CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource2 = new CommonMarketStat$TypeSmbNativeBookingSource("REPEAT_RECORD", 1);
        REPEAT_RECORD = commonMarketStat$TypeSmbNativeBookingSource2;
        CommonMarketStat$TypeSmbNativeBookingSource[] commonMarketStat$TypeSmbNativeBookingSourceArr = {commonMarketStat$TypeSmbNativeBookingSource, commonMarketStat$TypeSmbNativeBookingSource2};
        $VALUES = commonMarketStat$TypeSmbNativeBookingSourceArr;
        $ENTRIES = new asp(commonMarketStat$TypeSmbNativeBookingSourceArr);
    }

    private CommonMarketStat$TypeSmbNativeBookingSource(String str, int i) {
    }

    public static CommonMarketStat$TypeSmbNativeBookingSource valueOf(String str) {
        return (CommonMarketStat$TypeSmbNativeBookingSource) Enum.valueOf(CommonMarketStat$TypeSmbNativeBookingSource.class, str);
    }

    public static CommonMarketStat$TypeSmbNativeBookingSource[] values() {
        return (CommonMarketStat$TypeSmbNativeBookingSource[]) $VALUES.clone();
    }
}
