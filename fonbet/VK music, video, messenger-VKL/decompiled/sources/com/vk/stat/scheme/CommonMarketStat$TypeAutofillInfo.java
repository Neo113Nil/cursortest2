package com.vk.stat.scheme;

import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeAutofillInfo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonMarketStat$TypeAutofillInfo[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final CommonMarketStat$TypeAutofillInfo ADDRESS;

    @pmi0("city")
    public static final CommonMarketStat$TypeAutofillInfo CITY;

    @pmi0("delivery_point")
    public static final CommonMarketStat$TypeAutofillInfo DELIVERY_POINT;

    @pmi0("delivery_type")
    public static final CommonMarketStat$TypeAutofillInfo DELIVERY_TYPE;

    @pmi0("name")
    public static final CommonMarketStat$TypeAutofillInfo NAME;

    @pmi0("surname")
    public static final CommonMarketStat$TypeAutofillInfo SURNAME;

    @pmi0("user_phone")
    public static final CommonMarketStat$TypeAutofillInfo USER_PHONE;

    static {
        CommonMarketStat$TypeAutofillInfo commonMarketStat$TypeAutofillInfo = new CommonMarketStat$TypeAutofillInfo("NAME", 0);
        NAME = commonMarketStat$TypeAutofillInfo;
        CommonMarketStat$TypeAutofillInfo commonMarketStat$TypeAutofillInfo2 = new CommonMarketStat$TypeAutofillInfo("SURNAME", 1);
        SURNAME = commonMarketStat$TypeAutofillInfo2;
        CommonMarketStat$TypeAutofillInfo commonMarketStat$TypeAutofillInfo3 = new CommonMarketStat$TypeAutofillInfo("USER_PHONE", 2);
        USER_PHONE = commonMarketStat$TypeAutofillInfo3;
        CommonMarketStat$TypeAutofillInfo commonMarketStat$TypeAutofillInfo4 = new CommonMarketStat$TypeAutofillInfo("DELIVERY_TYPE", 3);
        DELIVERY_TYPE = commonMarketStat$TypeAutofillInfo4;
        CommonMarketStat$TypeAutofillInfo commonMarketStat$TypeAutofillInfo5 = new CommonMarketStat$TypeAutofillInfo("DELIVERY_POINT", 4);
        DELIVERY_POINT = commonMarketStat$TypeAutofillInfo5;
        CommonMarketStat$TypeAutofillInfo commonMarketStat$TypeAutofillInfo6 = new CommonMarketStat$TypeAutofillInfo("CITY", 5);
        CITY = commonMarketStat$TypeAutofillInfo6;
        CommonMarketStat$TypeAutofillInfo commonMarketStat$TypeAutofillInfo7 = new CommonMarketStat$TypeAutofillInfo("ADDRESS", 6);
        ADDRESS = commonMarketStat$TypeAutofillInfo7;
        CommonMarketStat$TypeAutofillInfo[] commonMarketStat$TypeAutofillInfoArr = {commonMarketStat$TypeAutofillInfo, commonMarketStat$TypeAutofillInfo2, commonMarketStat$TypeAutofillInfo3, commonMarketStat$TypeAutofillInfo4, commonMarketStat$TypeAutofillInfo5, commonMarketStat$TypeAutofillInfo6, commonMarketStat$TypeAutofillInfo7};
        $VALUES = commonMarketStat$TypeAutofillInfoArr;
        $ENTRIES = new asp(commonMarketStat$TypeAutofillInfoArr);
    }

    private CommonMarketStat$TypeAutofillInfo(String str, int i) {
    }

    public static CommonMarketStat$TypeAutofillInfo valueOf(String str) {
        return (CommonMarketStat$TypeAutofillInfo) Enum.valueOf(CommonMarketStat$TypeAutofillInfo.class, str);
    }

    public static CommonMarketStat$TypeAutofillInfo[] values() {
        return (CommonMarketStat$TypeAutofillInfo[]) $VALUES.clone();
    }
}
