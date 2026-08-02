package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeNetworkCommon implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("config_version")
    private final Integer configVersion;

    @pmi0("connection_time")
    private final int connectionTime;

    @pmi0("connection_tls_time")
    private final Integer connectionTlsTime;

    @pmi0("domain_lookup_time")
    private final Integer domainLookupTime;

    @pmi0("fail_reason")
    private final String failReason;

    @pmi0("http_client")
    private final HttpClient httpClient;

    @pmi0("http_request_body_size")
    private final Integer httpRequestBodySize;

    @pmi0("http_request_host")
    private final String httpRequestHost;

    @pmi0("http_request_method")
    private final String httpRequestMethod;

    @pmi0("http_request_uri")
    private final String httpRequestUri;

    @pmi0("http_response_code")
    private final int httpResponseCode;

    @pmi0("http_response_content_type")
    private final String httpResponseContentType;

    @pmi0("http_response_stat_key")
    private final Integer httpResponseStatKey;

    @pmi0("is_background")
    private final boolean isBackground;

    @pmi0("is_cache")
    private final Boolean isCache;

    @pmi0("is_connection_reused")
    private final boolean isConnectionReused;

    @pmi0("is_failed")
    private final Boolean isFailed;

    @pmi0("is_http_keep_alive")
    private final Boolean isHttpKeepAlive;

    @pmi0("is_proxy")
    private final boolean isProxy;

    @pmi0("is_roaming")
    private final Boolean isRoaming;

    @pmi0("is_vpn")
    private final Boolean isVpn;

    @pmi0(StatCustomFieldKey.NETWORK_TYPE)
    private final NetworkType networkType;

    @pmi0("protocol")
    private final String protocol;

    @pmi0("proxy_ipv4")
    private final String proxyIpv4;

    @pmi0("response_size")
    private final int responseSize;

    @pmi0("response_time")
    private final Integer responseTime;

    @pmi0("response_ttfb")
    private final int responseTtfb;

    @pmi0("rtt")
    private final Integer rtt;

    @pmi0("session_time")
    private final Integer sessionTime;

    @pmi0("tls_version")
    private final String tlsVersion;

    @pmi0("trace_id")
    private final String traceId;

    @pmi0("vk_proxy_ipv4")
    private final String vkProxyIpv4;

    @pmi0("vk_proxy_mode")
    private final VkProxyMode vkProxyMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class HttpClient {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HttpClient[] $VALUES;

        @pmi0("cronet")
        public static final HttpClient CRONET;

        @pmi0("okhttp")
        public static final HttpClient OKHTTP;

        @pmi0("okhttp_exec")
        public static final HttpClient OKHTTP_EXEC;

        @pmi0("platform")
        public static final HttpClient PLATFORM;

        static {
            HttpClient httpClient = new HttpClient("PLATFORM", 0);
            PLATFORM = httpClient;
            HttpClient httpClient2 = new HttpClient("CRONET", 1);
            CRONET = httpClient2;
            HttpClient httpClient3 = new HttpClient("OKHTTP", 2);
            OKHTTP = httpClient3;
            HttpClient httpClient4 = new HttpClient("OKHTTP_EXEC", 3);
            OKHTTP_EXEC = httpClient4;
            HttpClient[] httpClientArr = {httpClient, httpClient2, httpClient3, httpClient4};
            $VALUES = httpClientArr;
            $ENTRIES = new asp(httpClientArr);
        }

        private HttpClient(String str, int i) {
        }

        public static HttpClient valueOf(String str) {
            return (HttpClient) Enum.valueOf(HttpClient.class, str);
        }

        public static HttpClient[] values() {
            return (HttpClient[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class VkProxyMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkProxyMode[] $VALUES;

        @pmi0("forced_by_cookie")
        public static final VkProxyMode FORCED_BY_COOKIE;

        @pmi0("off")
        public static final VkProxyMode OFF;

        @pmi0("on")
        public static final VkProxyMode ON;

        static {
            VkProxyMode vkProxyMode = new VkProxyMode("OFF", 0);
            OFF = vkProxyMode;
            VkProxyMode vkProxyMode2 = new VkProxyMode("ON", 1);
            ON = vkProxyMode2;
            VkProxyMode vkProxyMode3 = new VkProxyMode("FORCED_BY_COOKIE", 2);
            FORCED_BY_COOKIE = vkProxyMode3;
            VkProxyMode[] vkProxyModeArr = {vkProxyMode, vkProxyMode2, vkProxyMode3};
            $VALUES = vkProxyModeArr;
            $ENTRIES = new asp(vkProxyModeArr);
        }

        private VkProxyMode(String str, int i) {
        }

        public static VkProxyMode valueOf(String str) {
            return (VkProxyMode) Enum.valueOf(VkProxyMode.class, str);
        }

        public static VkProxyMode[] values() {
            return (VkProxyMode[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeNetworkCommon(int i, int i2, int i3, boolean z, String str, String str2, int i4, NetworkType networkType, boolean z2, VkProxyMode vkProxyMode, boolean z3, Integer num, Integer num2, Integer num3, Integer num4, String str3, String str4, Boolean bool, HttpClient httpClient, String str5, String str6, Integer num5, Integer num6, String str7, Boolean bool2, Boolean bool3, Boolean bool4, String str8, Boolean bool5, String str9, Integer num7, Integer num8, String str10) {
        this.connectionTime = i;
        this.responseTtfb = i2;
        this.responseSize = i3;
        this.isConnectionReused = z;
        this.httpRequestMethod = str;
        this.httpRequestHost = str2;
        this.httpResponseCode = i4;
        this.networkType = networkType;
        this.isProxy = z2;
        this.vkProxyMode = vkProxyMode;
        this.isBackground = z3;
        this.domainLookupTime = num;
        this.rtt = num2;
        this.responseTime = num3;
        this.connectionTlsTime = num4;
        this.protocol = str3;
        this.tlsVersion = str4;
        this.isHttpKeepAlive = bool;
        this.httpClient = httpClient;
        this.httpRequestUri = str5;
        this.httpResponseContentType = str6;
        this.httpResponseStatKey = num5;
        this.httpRequestBodySize = num6;
        this.proxyIpv4 = str7;
        this.isCache = bool2;
        this.isVpn = bool3;
        this.isRoaming = bool4;
        this.vkProxyIpv4 = str8;
        this.isFailed = bool5;
        this.failReason = str9;
        this.sessionTime = num7;
        this.configVersion = num8;
        this.traceId = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeNetworkCommon)) {
            return false;
        }
        SchemeStat$TypeNetworkCommon schemeStat$TypeNetworkCommon = (SchemeStat$TypeNetworkCommon) obj;
        return this.connectionTime == schemeStat$TypeNetworkCommon.connectionTime && this.responseTtfb == schemeStat$TypeNetworkCommon.responseTtfb && this.responseSize == schemeStat$TypeNetworkCommon.responseSize && this.isConnectionReused == schemeStat$TypeNetworkCommon.isConnectionReused && epx.f(this.httpRequestMethod, schemeStat$TypeNetworkCommon.httpRequestMethod) && epx.f(this.httpRequestHost, schemeStat$TypeNetworkCommon.httpRequestHost) && this.httpResponseCode == schemeStat$TypeNetworkCommon.httpResponseCode && this.networkType == schemeStat$TypeNetworkCommon.networkType && this.isProxy == schemeStat$TypeNetworkCommon.isProxy && this.vkProxyMode == schemeStat$TypeNetworkCommon.vkProxyMode && this.isBackground == schemeStat$TypeNetworkCommon.isBackground && epx.f(this.domainLookupTime, schemeStat$TypeNetworkCommon.domainLookupTime) && epx.f(this.rtt, schemeStat$TypeNetworkCommon.rtt) && epx.f(this.responseTime, schemeStat$TypeNetworkCommon.responseTime) && epx.f(this.connectionTlsTime, schemeStat$TypeNetworkCommon.connectionTlsTime) && epx.f(this.protocol, schemeStat$TypeNetworkCommon.protocol) && epx.f(this.tlsVersion, schemeStat$TypeNetworkCommon.tlsVersion) && epx.f(this.isHttpKeepAlive, schemeStat$TypeNetworkCommon.isHttpKeepAlive) && this.httpClient == schemeStat$TypeNetworkCommon.httpClient && epx.f(this.httpRequestUri, schemeStat$TypeNetworkCommon.httpRequestUri) && epx.f(this.httpResponseContentType, schemeStat$TypeNetworkCommon.httpResponseContentType) && epx.f(this.httpResponseStatKey, schemeStat$TypeNetworkCommon.httpResponseStatKey) && epx.f(this.httpRequestBodySize, schemeStat$TypeNetworkCommon.httpRequestBodySize) && epx.f(this.proxyIpv4, schemeStat$TypeNetworkCommon.proxyIpv4) && epx.f(this.isCache, schemeStat$TypeNetworkCommon.isCache) && epx.f(this.isVpn, schemeStat$TypeNetworkCommon.isVpn) && epx.f(this.isRoaming, schemeStat$TypeNetworkCommon.isRoaming) && epx.f(this.vkProxyIpv4, schemeStat$TypeNetworkCommon.vkProxyIpv4) && epx.f(this.isFailed, schemeStat$TypeNetworkCommon.isFailed) && epx.f(this.failReason, schemeStat$TypeNetworkCommon.failReason) && epx.f(this.sessionTime, schemeStat$TypeNetworkCommon.sessionTime) && epx.f(this.configVersion, schemeStat$TypeNetworkCommon.configVersion) && epx.f(this.traceId, schemeStat$TypeNetworkCommon.traceId);
    }

    public final int hashCode() {
        int b = qoy.b((this.vkProxyMode.hashCode() + qoy.b((this.networkType.hashCode() + shy.a(this.httpResponseCode, urd0.a(urd0.a(qoy.b(shy.a(this.responseSize, shy.a(this.responseTtfb, Integer.hashCode(this.connectionTime) * 31, 31), 31), 31, this.isConnectionReused), 31, this.httpRequestMethod), 31, this.httpRequestHost), 31)) * 31, 31, this.isProxy)) * 31, 31, this.isBackground);
        Integer num = this.domainLookupTime;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rtt;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.responseTime;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.connectionTlsTime;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.protocol;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tlsVersion;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isHttpKeepAlive;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        HttpClient httpClient = this.httpClient;
        int hashCode8 = (hashCode7 + (httpClient == null ? 0 : httpClient.hashCode())) * 31;
        String str3 = this.httpRequestUri;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.httpResponseContentType;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.httpResponseStatKey;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.httpRequestBodySize;
        int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.proxyIpv4;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isCache;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isVpn;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isRoaming;
        int hashCode16 = (hashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.vkProxyIpv4;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool5 = this.isFailed;
        int hashCode18 = (hashCode17 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str7 = this.failReason;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num7 = this.sessionTime;
        int hashCode20 = (hashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.configVersion;
        int hashCode21 = (hashCode20 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str8 = this.traceId;
        return hashCode21 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeNetworkCommon(connectionTime=");
        sb.append(this.connectionTime);
        sb.append(", responseTtfb=");
        sb.append(this.responseTtfb);
        sb.append(", responseSize=");
        sb.append(this.responseSize);
        sb.append(", isConnectionReused=");
        sb.append(this.isConnectionReused);
        sb.append(", httpRequestMethod=");
        sb.append(this.httpRequestMethod);
        sb.append(", httpRequestHost=");
        sb.append(this.httpRequestHost);
        sb.append(", httpResponseCode=");
        sb.append(this.httpResponseCode);
        sb.append(", networkType=");
        sb.append(this.networkType);
        sb.append(", isProxy=");
        sb.append(this.isProxy);
        sb.append(", vkProxyMode=");
        sb.append(this.vkProxyMode);
        sb.append(", isBackground=");
        sb.append(this.isBackground);
        sb.append(", domainLookupTime=");
        sb.append(this.domainLookupTime);
        sb.append(", rtt=");
        sb.append(this.rtt);
        sb.append(", responseTime=");
        sb.append(this.responseTime);
        sb.append(", connectionTlsTime=");
        sb.append(this.connectionTlsTime);
        sb.append(", protocol=");
        sb.append(this.protocol);
        sb.append(", tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(", isHttpKeepAlive=");
        sb.append(this.isHttpKeepAlive);
        sb.append(", httpClient=");
        sb.append(this.httpClient);
        sb.append(", httpRequestUri=");
        sb.append(this.httpRequestUri);
        sb.append(", httpResponseContentType=");
        sb.append(this.httpResponseContentType);
        sb.append(", httpResponseStatKey=");
        sb.append(this.httpResponseStatKey);
        sb.append(", httpRequestBodySize=");
        sb.append(this.httpRequestBodySize);
        sb.append(", proxyIpv4=");
        sb.append(this.proxyIpv4);
        sb.append(", isCache=");
        sb.append(this.isCache);
        sb.append(", isVpn=");
        sb.append(this.isVpn);
        sb.append(", isRoaming=");
        sb.append(this.isRoaming);
        sb.append(", vkProxyIpv4=");
        sb.append(this.vkProxyIpv4);
        sb.append(", isFailed=");
        sb.append(this.isFailed);
        sb.append(", failReason=");
        sb.append(this.failReason);
        sb.append(", sessionTime=");
        sb.append(this.sessionTime);
        sb.append(", configVersion=");
        sb.append(this.configVersion);
        sb.append(", traceId=");
        return ho8.a(sb, this.traceId, ')');
    }

    public /* synthetic */ SchemeStat$TypeNetworkCommon(int i, int i2, int i3, boolean z, String str, String str2, int i4, NetworkType networkType, boolean z2, VkProxyMode vkProxyMode, boolean z3, Integer num, Integer num2, Integer num3, Integer num4, String str3, String str4, Boolean bool, HttpClient httpClient, String str5, String str6, Integer num5, Integer num6, String str7, Boolean bool2, Boolean bool3, Boolean bool4, String str8, Boolean bool5, String str9, Integer num7, Integer num8, String str10, int i5, int i6, zcl zclVar) {
        this(i, i2, i3, z, str, str2, i4, networkType, z2, vkProxyMode, z3, (i5 & 2048) != 0 ? null : num, (i5 & 4096) != 0 ? null : num2, (i5 & 8192) != 0 ? null : num3, (i5 & 16384) != 0 ? null : num4, (32768 & i5) != 0 ? null : str3, (65536 & i5) != 0 ? null : str4, (131072 & i5) != 0 ? null : bool, (262144 & i5) != 0 ? null : httpClient, (524288 & i5) != 0 ? null : str5, (1048576 & i5) != 0 ? null : str6, (2097152 & i5) != 0 ? null : num5, (4194304 & i5) != 0 ? null : num6, (8388608 & i5) != 0 ? null : str7, (16777216 & i5) != 0 ? null : bool2, (33554432 & i5) != 0 ? null : bool3, (67108864 & i5) != 0 ? null : bool4, (134217728 & i5) != 0 ? null : str8, (268435456 & i5) != 0 ? null : bool5, (536870912 & i5) != 0 ? null : str9, (1073741824 & i5) != 0 ? null : num7, (i5 & Integer.MIN_VALUE) != 0 ? null : num8, (i6 & 1) != 0 ? null : str10);
    }
}
