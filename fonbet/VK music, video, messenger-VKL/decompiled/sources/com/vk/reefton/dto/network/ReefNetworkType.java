package com.vk.reefton.dto.network;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefNetworkType.kt */
/* loaded from: classes5.dex */
public final class ReefNetworkType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefNetworkType[] $VALUES;
    public static final ReefNetworkType CDMA;
    public static final ReefNetworkType CDMAEVDOREV0;
    public static final ReefNetworkType CDMAEVDOREVA;
    public static final ReefNetworkType CDMAEVDOREVB;
    public static final ReefNetworkType EDGE;
    public static final ReefNetworkType EHRPD;
    public static final ReefNetworkType GPRS;
    public static final ReefNetworkType HSDPA;
    public static final ReefNetworkType HSUPA;
    public static final ReefNetworkType LTE;
    public static final ReefNetworkType OTHER;
    public static final ReefNetworkType UNKNOWN;
    public static final ReefNetworkType WCDMA_UMTS;
    public static final ReefNetworkType WIFI;

    static {
        ReefNetworkType reefNetworkType = new ReefNetworkType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = reefNetworkType;
        ReefNetworkType reefNetworkType2 = new ReefNetworkType(NativeAdContent.ViewTag.OTHER, 1);
        OTHER = reefNetworkType2;
        ReefNetworkType reefNetworkType3 = new ReefNetworkType("WIFI", 2);
        WIFI = reefNetworkType3;
        ReefNetworkType reefNetworkType4 = new ReefNetworkType("EDGE", 3);
        EDGE = reefNetworkType4;
        ReefNetworkType reefNetworkType5 = new ReefNetworkType("GPRS", 4);
        GPRS = reefNetworkType5;
        ReefNetworkType reefNetworkType6 = new ReefNetworkType("LTE", 5);
        LTE = reefNetworkType6;
        ReefNetworkType reefNetworkType7 = new ReefNetworkType("EHRPD", 6);
        EHRPD = reefNetworkType7;
        ReefNetworkType reefNetworkType8 = new ReefNetworkType("HSDPA", 7);
        HSDPA = reefNetworkType8;
        ReefNetworkType reefNetworkType9 = new ReefNetworkType("HSUPA", 8);
        HSUPA = reefNetworkType9;
        ReefNetworkType reefNetworkType10 = new ReefNetworkType("CDMA", 9);
        CDMA = reefNetworkType10;
        ReefNetworkType reefNetworkType11 = new ReefNetworkType("CDMAEVDOREV0", 10);
        CDMAEVDOREV0 = reefNetworkType11;
        ReefNetworkType reefNetworkType12 = new ReefNetworkType("CDMAEVDOREVA", 11);
        CDMAEVDOREVA = reefNetworkType12;
        ReefNetworkType reefNetworkType13 = new ReefNetworkType("CDMAEVDOREVB", 12);
        CDMAEVDOREVB = reefNetworkType13;
        ReefNetworkType reefNetworkType14 = new ReefNetworkType("WCDMA_UMTS", 13);
        WCDMA_UMTS = reefNetworkType14;
        ReefNetworkType[] reefNetworkTypeArr = {reefNetworkType, reefNetworkType2, reefNetworkType3, reefNetworkType4, reefNetworkType5, reefNetworkType6, reefNetworkType7, reefNetworkType8, reefNetworkType9, reefNetworkType10, reefNetworkType11, reefNetworkType12, reefNetworkType13, reefNetworkType14};
        $VALUES = reefNetworkTypeArr;
        $ENTRIES = new asp(reefNetworkTypeArr);
    }

    public ReefNetworkType() {
        throw null;
    }

    public static ReefNetworkType valueOf(String str) {
        return (ReefNetworkType) Enum.valueOf(ReefNetworkType.class, str);
    }

    public static ReefNetworkType[] values() {
        return (ReefNetworkType[]) $VALUES.clone();
    }
}
