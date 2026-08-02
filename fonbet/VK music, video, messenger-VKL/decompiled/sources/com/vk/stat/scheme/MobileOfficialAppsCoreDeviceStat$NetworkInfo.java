package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.T3;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreDeviceStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreDeviceStat$NetworkInfo {

    @pmi0("network_effective_type")
    private final NetworkEffectiveType networkEffectiveType;

    @pmi0(StatCustomFieldKey.NETWORK_TYPE)
    private final NetworkType networkType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreDeviceStat.kt */
    public static final class NetworkEffectiveType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NetworkEffectiveType[] $VALUES;
        public static final NetworkEffectiveType SLOW_2G;
        public static final NetworkEffectiveType TYPE_2G;
        public static final NetworkEffectiveType TYPE_3G;
        public static final NetworkEffectiveType TYPE_4G;
        public static final NetworkEffectiveType TYPE_5G;
        private final String value;

        /* compiled from: MobileOfficialAppsCoreDeviceStat.kt */
        public static final class Serializer implements uay<NetworkEffectiveType> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(((NetworkEffectiveType) obj).value);
            }
        }

        static {
            NetworkEffectiveType networkEffectiveType = new NetworkEffectiveType("SLOW_2G", 0, "slow-2g");
            SLOW_2G = networkEffectiveType;
            NetworkEffectiveType networkEffectiveType2 = new NetworkEffectiveType("TYPE_2G", 1, "2g");
            TYPE_2G = networkEffectiveType2;
            NetworkEffectiveType networkEffectiveType3 = new NetworkEffectiveType("TYPE_3G", 2, T3.a);
            TYPE_3G = networkEffectiveType3;
            NetworkEffectiveType networkEffectiveType4 = new NetworkEffectiveType("TYPE_4G", 3, "4g");
            TYPE_4G = networkEffectiveType4;
            NetworkEffectiveType networkEffectiveType5 = new NetworkEffectiveType("TYPE_5G", 4, "5g");
            TYPE_5G = networkEffectiveType5;
            NetworkEffectiveType[] networkEffectiveTypeArr = {networkEffectiveType, networkEffectiveType2, networkEffectiveType3, networkEffectiveType4, networkEffectiveType5};
            $VALUES = networkEffectiveTypeArr;
            $ENTRIES = new asp(networkEffectiveTypeArr);
        }

        public NetworkEffectiveType(String str, int i, String str2) {
            this.value = str2;
        }

        public static NetworkEffectiveType valueOf(String str) {
            return (NetworkEffectiveType) Enum.valueOf(NetworkEffectiveType.class, str);
        }

        public static NetworkEffectiveType[] values() {
            return (NetworkEffectiveType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreDeviceStat.kt */
    public static final class NetworkType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NetworkType[] $VALUES;

        @pmi0("CDMA")
        public static final NetworkType CDMA;

        @pmi0("CDMAEVDORev0")
        public static final NetworkType CDMAEVDOREV0;

        @pmi0("CDMAEVDORevA")
        public static final NetworkType CDMAEVDOREVA;

        @pmi0("CDMAEVDORevB")
        public static final NetworkType CDMAEVDOREVB;

        @pmi0("EDGE")
        public static final NetworkType EDGE;

        @pmi0("eHRPD")
        public static final NetworkType EHRPD;

        @pmi0("GPRS")
        public static final NetworkType GPRS;

        @pmi0("HSDPA")
        public static final NetworkType HSDPA;

        @pmi0("HSUPA")
        public static final NetworkType HSUPA;

        @pmi0("LTE")
        public static final NetworkType LTE;

        @pmi0("NR")
        public static final NetworkType NR;

        @pmi0(NativeAdContent.ViewTag.OTHER)
        public static final NetworkType OTHER;

        @pmi0(GrsBaseInfo.CountryCodeSource.UNKNOWN)
        public static final NetworkType UNKNOWN;

        @pmi0("WCDMA_UMTS")
        public static final NetworkType WCDMA_UMTS;

        @pmi0("WIFI")
        public static final NetworkType WIFI;

        static {
            NetworkType networkType = new NetworkType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = networkType;
            NetworkType networkType2 = new NetworkType(NativeAdContent.ViewTag.OTHER, 1);
            OTHER = networkType2;
            NetworkType networkType3 = new NetworkType("WIFI", 2);
            WIFI = networkType3;
            NetworkType networkType4 = new NetworkType("EDGE", 3);
            EDGE = networkType4;
            NetworkType networkType5 = new NetworkType("GPRS", 4);
            GPRS = networkType5;
            NetworkType networkType6 = new NetworkType("LTE", 5);
            LTE = networkType6;
            NetworkType networkType7 = new NetworkType("NR", 6);
            NR = networkType7;
            NetworkType networkType8 = new NetworkType("EHRPD", 7);
            EHRPD = networkType8;
            NetworkType networkType9 = new NetworkType("HSDPA", 8);
            HSDPA = networkType9;
            NetworkType networkType10 = new NetworkType("HSUPA", 9);
            HSUPA = networkType10;
            NetworkType networkType11 = new NetworkType("CDMA", 10);
            CDMA = networkType11;
            NetworkType networkType12 = new NetworkType("CDMAEVDOREV0", 11);
            CDMAEVDOREV0 = networkType12;
            NetworkType networkType13 = new NetworkType("CDMAEVDOREVA", 12);
            CDMAEVDOREVA = networkType13;
            NetworkType networkType14 = new NetworkType("CDMAEVDOREVB", 13);
            CDMAEVDOREVB = networkType14;
            NetworkType networkType15 = new NetworkType("WCDMA_UMTS", 14);
            WCDMA_UMTS = networkType15;
            NetworkType[] networkTypeArr = {networkType, networkType2, networkType3, networkType4, networkType5, networkType6, networkType7, networkType8, networkType9, networkType10, networkType11, networkType12, networkType13, networkType14, networkType15};
            $VALUES = networkTypeArr;
            $ENTRIES = new asp(networkTypeArr);
        }

        private NetworkType(String str, int i) {
        }

        public static NetworkType valueOf(String str) {
            return (NetworkType) Enum.valueOf(NetworkType.class, str);
        }

        public static NetworkType[] values() {
            return (NetworkType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCoreDeviceStat$NetworkInfo(NetworkType networkType, NetworkEffectiveType networkEffectiveType) {
        this.networkType = networkType;
        this.networkEffectiveType = networkEffectiveType;
    }

    public final NetworkEffectiveType a() {
        return this.networkEffectiveType;
    }

    public final NetworkType b() {
        return this.networkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreDeviceStat$NetworkInfo)) {
            return false;
        }
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = (MobileOfficialAppsCoreDeviceStat$NetworkInfo) obj;
        return this.networkType == mobileOfficialAppsCoreDeviceStat$NetworkInfo.networkType && this.networkEffectiveType == mobileOfficialAppsCoreDeviceStat$NetworkInfo.networkEffectiveType;
    }

    public final int hashCode() {
        int hashCode = this.networkType.hashCode() * 31;
        NetworkEffectiveType networkEffectiveType = this.networkEffectiveType;
        return hashCode + (networkEffectiveType == null ? 0 : networkEffectiveType.hashCode());
    }

    public final String toString() {
        return "NetworkInfo(networkType=" + this.networkType + ", networkEffectiveType=" + this.networkEffectiveType + ')';
    }

    public /* synthetic */ MobileOfficialAppsCoreDeviceStat$NetworkInfo(NetworkType networkType, NetworkEffectiveType networkEffectiveType, int i, zcl zclVar) {
        this(networkType, (i & 2) != 0 ? null : networkEffectiveType);
    }
}
