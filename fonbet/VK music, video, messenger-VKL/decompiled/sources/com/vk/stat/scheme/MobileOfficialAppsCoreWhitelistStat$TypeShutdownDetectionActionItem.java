package com.vk.stat.scheme;

import com.ironsource.O6;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreWhitelistStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem implements SchemeStat$TypeAction.b {

    @pmi0(O6.R0)
    private final String carrier;

    @pmi0("hosts_availability")
    private final List<MobileOfficialAppsCoreWhitelistStat$HostStatus> hostsAvailability;

    @pmi0("is_vpn")
    private final Boolean isVpn;

    @pmi0("is_whitelist_enabled")
    private final Boolean isWhitelistEnabled;

    @pmi0(StatCustomFieldKey.NETWORK_TYPE)
    private final NetworkType networkType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreWhitelistStat.kt */
    public static final class NetworkType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NetworkType[] $VALUES;

        @pmi0("cellular")
        public static final NetworkType CELLULAR;

        @pmi0("wifi")
        public static final NetworkType WIFI;

        static {
            NetworkType networkType = new NetworkType("WIFI", 0);
            WIFI = networkType;
            NetworkType networkType2 = new NetworkType("CELLULAR", 1);
            CELLULAR = networkType2;
            NetworkType[] networkTypeArr = {networkType, networkType2};
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

    public MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem(NetworkType networkType, String str, Boolean bool, Boolean bool2, List<MobileOfficialAppsCoreWhitelistStat$HostStatus> list) {
        this.networkType = networkType;
        this.carrier = str;
        this.isWhitelistEnabled = bool;
        this.isVpn = bool2;
        this.hostsAvailability = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem)) {
            return false;
        }
        MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem = (MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem) obj;
        return this.networkType == mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.networkType && epx.f(this.carrier, mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.carrier) && epx.f(this.isWhitelistEnabled, mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.isWhitelistEnabled) && epx.f(this.isVpn, mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.isVpn) && epx.f(this.hostsAvailability, mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.hostsAvailability);
    }

    public final int hashCode() {
        int hashCode = this.networkType.hashCode() * 31;
        String str = this.carrier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isWhitelistEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isVpn;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<MobileOfficialAppsCoreWhitelistStat$HostStatus> list = this.hostsAvailability;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeShutdownDetectionActionItem(networkType=");
        sb.append(this.networkType);
        sb.append(", carrier=");
        sb.append(this.carrier);
        sb.append(", isWhitelistEnabled=");
        sb.append(this.isWhitelistEnabled);
        sb.append(", isVpn=");
        sb.append(this.isVpn);
        sb.append(", hostsAvailability=");
        return ms9.a(')', sb, this.hostsAvailability);
    }

    public /* synthetic */ MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem(NetworkType networkType, String str, Boolean bool, Boolean bool2, List list, int i, zcl zclVar) {
        this(networkType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : list);
    }
}
