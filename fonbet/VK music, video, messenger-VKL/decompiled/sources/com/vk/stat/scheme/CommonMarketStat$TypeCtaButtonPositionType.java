package com.vk.stat.scheme;

import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeCtaButtonPositionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonMarketStat$TypeCtaButtonPositionType[] $VALUES;

    @pmi0(BuildConfig.FLAVOR)
    public static final CommonMarketStat$TypeCtaButtonPositionType DEFAULT;

    @pmi0("floating")
    public static final CommonMarketStat$TypeCtaButtonPositionType FLOATING;

    static {
        CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType = new CommonMarketStat$TypeCtaButtonPositionType("DEFAULT", 0);
        DEFAULT = commonMarketStat$TypeCtaButtonPositionType;
        CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType2 = new CommonMarketStat$TypeCtaButtonPositionType("FLOATING", 1);
        FLOATING = commonMarketStat$TypeCtaButtonPositionType2;
        CommonMarketStat$TypeCtaButtonPositionType[] commonMarketStat$TypeCtaButtonPositionTypeArr = {commonMarketStat$TypeCtaButtonPositionType, commonMarketStat$TypeCtaButtonPositionType2};
        $VALUES = commonMarketStat$TypeCtaButtonPositionTypeArr;
        $ENTRIES = new asp(commonMarketStat$TypeCtaButtonPositionTypeArr);
    }

    private CommonMarketStat$TypeCtaButtonPositionType(String str, int i) {
    }

    public static CommonMarketStat$TypeCtaButtonPositionType valueOf(String str) {
        return (CommonMarketStat$TypeCtaButtonPositionType) Enum.valueOf(CommonMarketStat$TypeCtaButtonPositionType.class, str);
    }

    public static CommonMarketStat$TypeCtaButtonPositionType[] values() {
        return (CommonMarketStat$TypeCtaButtonPositionType[]) $VALUES.clone();
    }
}
