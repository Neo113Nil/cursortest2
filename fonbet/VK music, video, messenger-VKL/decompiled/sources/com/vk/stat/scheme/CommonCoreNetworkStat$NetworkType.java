package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonCoreNetworkStat.kt */
/* loaded from: classes11.dex */
public final class CommonCoreNetworkStat$NetworkType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommonCoreNetworkStat$NetworkType[] $VALUES;

    @pmi0("CDMA")
    public static final CommonCoreNetworkStat$NetworkType CDMA;

    @pmi0("CDMAEVDORev0")
    public static final CommonCoreNetworkStat$NetworkType CDMAEVDOREV0;

    @pmi0("CDMAEVDORevA")
    public static final CommonCoreNetworkStat$NetworkType CDMAEVDOREVA;

    @pmi0("CDMAEVDORevB")
    public static final CommonCoreNetworkStat$NetworkType CDMAEVDOREVB;

    @pmi0("EDGE")
    public static final CommonCoreNetworkStat$NetworkType EDGE;

    @pmi0("eHRPD")
    public static final CommonCoreNetworkStat$NetworkType EHRPD;

    @pmi0("GPRS")
    public static final CommonCoreNetworkStat$NetworkType GPRS;

    @pmi0("HSDPA")
    public static final CommonCoreNetworkStat$NetworkType HSDPA;

    @pmi0("HSUPA")
    public static final CommonCoreNetworkStat$NetworkType HSUPA;

    @pmi0("LTE")
    public static final CommonCoreNetworkStat$NetworkType LTE;

    @pmi0("NR")
    public static final CommonCoreNetworkStat$NetworkType NR;

    @pmi0(NativeAdContent.ViewTag.OTHER)
    public static final CommonCoreNetworkStat$NetworkType OTHER;

    @pmi0(GrsBaseInfo.CountryCodeSource.UNKNOWN)
    public static final CommonCoreNetworkStat$NetworkType UNKNOWN;

    @pmi0("WCDMA_UMTS")
    public static final CommonCoreNetworkStat$NetworkType WCDMA_UMTS;

    @pmi0("WIFI")
    public static final CommonCoreNetworkStat$NetworkType WIFI;

    static {
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType = new CommonCoreNetworkStat$NetworkType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = commonCoreNetworkStat$NetworkType;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType2 = new CommonCoreNetworkStat$NetworkType(NativeAdContent.ViewTag.OTHER, 1);
        OTHER = commonCoreNetworkStat$NetworkType2;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType3 = new CommonCoreNetworkStat$NetworkType("WIFI", 2);
        WIFI = commonCoreNetworkStat$NetworkType3;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType4 = new CommonCoreNetworkStat$NetworkType("EDGE", 3);
        EDGE = commonCoreNetworkStat$NetworkType4;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType5 = new CommonCoreNetworkStat$NetworkType("GPRS", 4);
        GPRS = commonCoreNetworkStat$NetworkType5;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType6 = new CommonCoreNetworkStat$NetworkType("LTE", 5);
        LTE = commonCoreNetworkStat$NetworkType6;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType7 = new CommonCoreNetworkStat$NetworkType("NR", 6);
        NR = commonCoreNetworkStat$NetworkType7;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType8 = new CommonCoreNetworkStat$NetworkType("EHRPD", 7);
        EHRPD = commonCoreNetworkStat$NetworkType8;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType9 = new CommonCoreNetworkStat$NetworkType("HSDPA", 8);
        HSDPA = commonCoreNetworkStat$NetworkType9;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType10 = new CommonCoreNetworkStat$NetworkType("HSUPA", 9);
        HSUPA = commonCoreNetworkStat$NetworkType10;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType11 = new CommonCoreNetworkStat$NetworkType("CDMA", 10);
        CDMA = commonCoreNetworkStat$NetworkType11;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType12 = new CommonCoreNetworkStat$NetworkType("CDMAEVDOREV0", 11);
        CDMAEVDOREV0 = commonCoreNetworkStat$NetworkType12;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType13 = new CommonCoreNetworkStat$NetworkType("CDMAEVDOREVA", 12);
        CDMAEVDOREVA = commonCoreNetworkStat$NetworkType13;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType14 = new CommonCoreNetworkStat$NetworkType("CDMAEVDOREVB", 13);
        CDMAEVDOREVB = commonCoreNetworkStat$NetworkType14;
        CommonCoreNetworkStat$NetworkType commonCoreNetworkStat$NetworkType15 = new CommonCoreNetworkStat$NetworkType("WCDMA_UMTS", 14);
        WCDMA_UMTS = commonCoreNetworkStat$NetworkType15;
        CommonCoreNetworkStat$NetworkType[] commonCoreNetworkStat$NetworkTypeArr = {commonCoreNetworkStat$NetworkType, commonCoreNetworkStat$NetworkType2, commonCoreNetworkStat$NetworkType3, commonCoreNetworkStat$NetworkType4, commonCoreNetworkStat$NetworkType5, commonCoreNetworkStat$NetworkType6, commonCoreNetworkStat$NetworkType7, commonCoreNetworkStat$NetworkType8, commonCoreNetworkStat$NetworkType9, commonCoreNetworkStat$NetworkType10, commonCoreNetworkStat$NetworkType11, commonCoreNetworkStat$NetworkType12, commonCoreNetworkStat$NetworkType13, commonCoreNetworkStat$NetworkType14, commonCoreNetworkStat$NetworkType15};
        $VALUES = commonCoreNetworkStat$NetworkTypeArr;
        $ENTRIES = new asp(commonCoreNetworkStat$NetworkTypeArr);
    }

    private CommonCoreNetworkStat$NetworkType(String str, int i) {
    }

    public static CommonCoreNetworkStat$NetworkType valueOf(String str) {
        return (CommonCoreNetworkStat$NetworkType) Enum.valueOf(CommonCoreNetworkStat$NetworkType.class, str);
    }

    public static CommonCoreNetworkStat$NetworkType[] values() {
        return (CommonCoreNetworkStat$NetworkType[]) $VALUES.clone();
    }
}
