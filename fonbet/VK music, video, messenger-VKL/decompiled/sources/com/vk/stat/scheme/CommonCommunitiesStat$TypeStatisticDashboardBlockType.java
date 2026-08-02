package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeStatisticDashboardBlockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonCommunitiesStat$TypeStatisticDashboardBlockType[] $VALUES;

    @pmi0("albums")
    public static final CommonCommunitiesStat$TypeStatisticDashboardBlockType ALBUMS;

    @pmi0("auditory")
    public static final CommonCommunitiesStat$TypeStatisticDashboardBlockType AUDITORY;

    @pmi0("business_tools")
    public static final CommonCommunitiesStat$TypeStatisticDashboardBlockType BUSINESS_TOOLS;

    @pmi0("common")
    public static final CommonCommunitiesStat$TypeStatisticDashboardBlockType COMMON;

    @pmi0("goods")
    public static final CommonCommunitiesStat$TypeStatisticDashboardBlockType GOODS;

    @pmi0("group")
    public static final CommonCommunitiesStat$TypeStatisticDashboardBlockType GROUP;

    @pmi0("other")
    public static final CommonCommunitiesStat$TypeStatisticDashboardBlockType OTHER;

    static {
        CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType = new CommonCommunitiesStat$TypeStatisticDashboardBlockType("COMMON", 0);
        COMMON = commonCommunitiesStat$TypeStatisticDashboardBlockType;
        CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType2 = new CommonCommunitiesStat$TypeStatisticDashboardBlockType("AUDITORY", 1);
        AUDITORY = commonCommunitiesStat$TypeStatisticDashboardBlockType2;
        CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType3 = new CommonCommunitiesStat$TypeStatisticDashboardBlockType("GOODS", 2);
        GOODS = commonCommunitiesStat$TypeStatisticDashboardBlockType3;
        CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType4 = new CommonCommunitiesStat$TypeStatisticDashboardBlockType("ALBUMS", 3);
        ALBUMS = commonCommunitiesStat$TypeStatisticDashboardBlockType4;
        CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType5 = new CommonCommunitiesStat$TypeStatisticDashboardBlockType("GROUP", 4);
        GROUP = commonCommunitiesStat$TypeStatisticDashboardBlockType5;
        CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType6 = new CommonCommunitiesStat$TypeStatisticDashboardBlockType("BUSINESS_TOOLS", 5);
        BUSINESS_TOOLS = commonCommunitiesStat$TypeStatisticDashboardBlockType6;
        CommonCommunitiesStat$TypeStatisticDashboardBlockType commonCommunitiesStat$TypeStatisticDashboardBlockType7 = new CommonCommunitiesStat$TypeStatisticDashboardBlockType(NativeAdContent.ViewTag.OTHER, 6);
        OTHER = commonCommunitiesStat$TypeStatisticDashboardBlockType7;
        CommonCommunitiesStat$TypeStatisticDashboardBlockType[] commonCommunitiesStat$TypeStatisticDashboardBlockTypeArr = {commonCommunitiesStat$TypeStatisticDashboardBlockType, commonCommunitiesStat$TypeStatisticDashboardBlockType2, commonCommunitiesStat$TypeStatisticDashboardBlockType3, commonCommunitiesStat$TypeStatisticDashboardBlockType4, commonCommunitiesStat$TypeStatisticDashboardBlockType5, commonCommunitiesStat$TypeStatisticDashboardBlockType6, commonCommunitiesStat$TypeStatisticDashboardBlockType7};
        $VALUES = commonCommunitiesStat$TypeStatisticDashboardBlockTypeArr;
        $ENTRIES = new asp(commonCommunitiesStat$TypeStatisticDashboardBlockTypeArr);
    }

    private CommonCommunitiesStat$TypeStatisticDashboardBlockType(String str, int i) {
    }

    public static CommonCommunitiesStat$TypeStatisticDashboardBlockType valueOf(String str) {
        return (CommonCommunitiesStat$TypeStatisticDashboardBlockType) Enum.valueOf(CommonCommunitiesStat$TypeStatisticDashboardBlockType.class, str);
    }

    public static CommonCommunitiesStat$TypeStatisticDashboardBlockType[] values() {
        return (CommonCommunitiesStat$TypeStatisticDashboardBlockType[]) $VALUES.clone();
    }
}
