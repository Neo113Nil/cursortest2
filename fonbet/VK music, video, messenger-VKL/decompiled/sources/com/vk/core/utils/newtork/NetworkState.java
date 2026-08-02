package com.vk.core.utils.newtork;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.T3;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.bpn0;
import xsna.cu2;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.j90;
import xsna.msy;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: NetworkState.kt */
/* loaded from: classes.dex */
public final class NetworkState {
    public static final bpn0 g = new bpn0(new cu2(5));
    public final String a;
    public final Set<Integer> b;
    public final int c;
    public final boolean d;
    public final a e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new j90(this, 7));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkState.kt */
    /* loaded from: classes17.dex */
    public static final class ConnectionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ConnectionType[] $VALUES;
        public static final ConnectionType ETHERNET;
        public static final ConnectionType MOBILE;
        public static final ConnectionType OTHER;
        public static final ConnectionType UNKNOWN;
        public static final ConnectionType WIFI;
        private final String value;

        static {
            ConnectionType connectionType = new ConnectionType("ETHERNET", 0, T3.e);
            ETHERNET = connectionType;
            ConnectionType connectionType2 = new ConnectionType("MOBILE", 1, "mobile");
            MOBILE = connectionType2;
            ConnectionType connectionType3 = new ConnectionType(NativeAdContent.ViewTag.OTHER, 2, "other");
            OTHER = connectionType3;
            ConnectionType connectionType4 = new ConnectionType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
            UNKNOWN = connectionType4;
            ConnectionType connectionType5 = new ConnectionType("WIFI", 4, "wifi");
            WIFI = connectionType5;
            ConnectionType[] connectionTypeArr = {connectionType, connectionType2, connectionType3, connectionType4, connectionType5};
            $VALUES = connectionTypeArr;
            $ENTRIES = new asp(connectionTypeArr);
        }

        public ConnectionType(String str, int i, String str2) {
            this.value = str2;
        }

        public static ConnectionType valueOf(String str) {
            return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
        }

        public static ConnectionType[] values() {
            return (ConnectionType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: NetworkState.kt */
    public static final class a {
        public static final a e = new a(null, -1, false, false);
        public final boolean a;
        public final boolean b;
        public final int c;
        public final String d;

        public a(String str, int i, boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
            this.c = i;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
            String str = this.d;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Meta(isRoaming=");
            sb.append(this.a);
            sb.append(", isMetered=");
            sb.append(this.b);
            sb.append(", backgroundStatus=");
            sb.append(this.c);
            sb.append(", simOperatorName=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public NetworkState(String str, Set<Integer> set, int i, boolean z, a aVar) {
        this.a = str;
        this.b = set;
        this.c = i;
        this.d = z;
        this.e = aVar;
    }

    public final String a() {
        if (!this.d) {
            return "none";
        }
        d().getClass();
        switch (this.c) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "CDMA0";
            case 6:
                return "CDMAA";
            case 7:
                return "CDMA1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "iDEN";
            case 12:
                return "CDMAB";
            case 13:
                return "LTE";
            case 14:
                return "CDMAeHRPD";
            case 15:
                return "HSPA+";
            case 16:
                return "GSM";
            case 17:
                return "TDSCDMA";
            case 18:
                return "IWLAN";
            case 19:
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 20:
                return "NR";
        }
    }

    public final String b() {
        if (!this.d) {
            return "unknown";
        }
        NetworkType d = d();
        d.getClass();
        if (d == NetworkType.ETHERNET) {
            return T3.e;
        }
        if (d().l()) {
            return "mobile";
        }
        NetworkType d2 = d();
        d2.getClass();
        return d2 == NetworkType.WIFI ? "wifi" : "other";
    }

    public final String c() {
        return !this.d ? "none" : d().o(2) ? "EDGE" : d().o(1) ? "GPRS" : d() == NetworkType.WIFI ? "wifi" : d() == NetworkType.MOBILE_2G ? "2G" : d() == NetworkType.MOBILE_3G ? "3G" : d() == NetworkType.MOBILE_4G ? "LTE" : d() == NetworkType.MOBILE_5G ? "5G" : "undefine";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NetworkType d() {
        return (NetworkType) this.f.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return epx.f(this.a, networkState.a) && epx.f(this.b, networkState.b) && this.c == networkState.c && this.d == networkState.d && epx.f(this.e, networkState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(shy.a(this.c, fw3.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        return "NetworkState(id=" + this.a + ", transports=" + this.b + ", subtypeId=" + this.c + ", hasNetwork=" + this.d + ", meta=" + this.e + ')';
    }
}
