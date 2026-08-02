package com.vk.reefton.protocol;

import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum ReefProtocol$NetworkType implements Internal.EnumLite {
    UNKNOWN(0),
    OTHER(1),
    WIFI(2),
    EDGE(3),
    GPRS(4),
    LTE(5),
    EHRPD(6),
    HSDPA(7),
    HSUPA(8),
    CDMA(9),
    CDMAEVDORev0(10),
    CDMAEVDORevA(11),
    CDMAEVDORevB(12),
    WcdmaUmts(13),
    UNRECOGNIZED(-1);

    public static final int CDMAEVDORev0_VALUE = 10;
    public static final int CDMAEVDORevA_VALUE = 11;
    public static final int CDMAEVDORevB_VALUE = 12;
    public static final int CDMA_VALUE = 9;
    public static final int EDGE_VALUE = 3;
    public static final int EHRPD_VALUE = 6;
    public static final int GPRS_VALUE = 4;
    public static final int HSDPA_VALUE = 7;
    public static final int HSUPA_VALUE = 8;
    public static final int LTE_VALUE = 5;
    public static final int OTHER_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    public static final int WIFI_VALUE = 2;
    public static final int WcdmaUmts_VALUE = 13;
    private static final Internal.EnumLiteMap<ReefProtocol$NetworkType> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<ReefProtocol$NetworkType> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final ReefProtocol$NetworkType findValueByNumber(int i) {
            switch (i) {
                case 0:
                    return ReefProtocol$NetworkType.UNKNOWN;
                case 1:
                    return ReefProtocol$NetworkType.OTHER;
                case 2:
                    return ReefProtocol$NetworkType.WIFI;
                case 3:
                    return ReefProtocol$NetworkType.EDGE;
                case 4:
                    return ReefProtocol$NetworkType.GPRS;
                case 5:
                    return ReefProtocol$NetworkType.LTE;
                case 6:
                    return ReefProtocol$NetworkType.EHRPD;
                case 7:
                    return ReefProtocol$NetworkType.HSDPA;
                case 8:
                    return ReefProtocol$NetworkType.HSUPA;
                case 9:
                    return ReefProtocol$NetworkType.CDMA;
                case 10:
                    return ReefProtocol$NetworkType.CDMAEVDORev0;
                case 11:
                    return ReefProtocol$NetworkType.CDMAEVDORevA;
                case 12:
                    return ReefProtocol$NetworkType.CDMAEVDORevB;
                case 13:
                    return ReefProtocol$NetworkType.WcdmaUmts;
                default:
                    return null;
            }
        }
    }

    ReefProtocol$NetworkType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
