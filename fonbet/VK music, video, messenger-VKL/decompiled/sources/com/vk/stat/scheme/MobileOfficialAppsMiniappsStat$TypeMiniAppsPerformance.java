package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance implements SchemeStat$EventBenchmarkMain.b {
    public final transient String a;

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("app_init_time")
    private final String appInitTime;

    @pmi0("device_tier")
    private final Integer deviceTier;

    @pmi0("embedded_url_time")
    private final String embeddedUrlTime;

    @pmi0("end_time")
    private final String endTime;

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0("error_description")
    private final String errorDescription;

    @pmi0("session_uuid")
    private final FilteredString filteredSessionUuid;

    @pmi0("from_cache")
    private final Boolean fromCache;

    @pmi0("get_service_app_time")
    private final String getServiceAppTime;

    @pmi0("has_odr_archive")
    private final Boolean hasOdrArchive;

    @pmi0("is_odr")
    private final Boolean isOdr;

    @pmi0("is_success")
    private final Boolean isSuccess;

    @pmi0("is_vpn")
    private final Boolean isVpn;

    @pmi0("odr_end_load_time")
    private final String odrEndLoadTime;

    @pmi0("odr_start_load_time")
    private final String odrStartLoadTime;

    @pmi0("odr_unzip_time")
    private final String odrUnzipTime;

    @pmi0("odr_version")
    private final Integer odrVersion;

    @pmi0("resolve_screen_name_time")
    private final String resolveScreenNameTime;

    @pmi0("screen_open_time")
    private final String screenOpenTime;

    @pmi0("start_time")
    private final String startTime;

    @pmi0("start_user_interaction_time")
    private final String startUserInteractionTime;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("webview_dns_look_up_time")
    private final String webviewDnsLookUpTime;

    @pmi0("webview_end_load_time")
    private final String webviewEndLoadTime;

    @pmi0("webview_render_time")
    private final String webviewRenderTime;

    @pmi0("webview_start_load_time")
    private final String webviewStartLoadTime;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance>, a9y<MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance(fai.C(x9yVar, "start_time"), fai.C(x9yVar, "resolve_screen_name_time"), fai.C(x9yVar, "get_service_app_time"), fai.C(x9yVar, "embedded_url_time"), fai.C(x9yVar, "screen_open_time"), fai.C(x9yVar, "odr_start_load_time"), fai.C(x9yVar, "odr_end_load_time"), fai.C(x9yVar, "odr_unzip_time"), fai.C(x9yVar, "webview_start_load_time"), fai.C(x9yVar, "webview_dns_look_up_time"), fai.C(x9yVar, "webview_end_load_time"), fai.C(x9yVar, "webview_render_time"), fai.C(x9yVar, "app_init_time"), fai.C(x9yVar, "end_time"), fai.y(x9yVar, "is_success"), fai.A(x9yVar, "app_id"), fai.C(x9yVar, "webview_url"), fai.y(x9yVar, "from_cache"), fai.y(x9yVar, "is_odr"), fai.y(x9yVar, "has_odr_archive"), fai.A(x9yVar, "odr_version"), fai.A(x9yVar, "error_code"), fai.C(x9yVar, "error_description"), fai.C(x9yVar, "track_code"), fai.C(x9yVar, "session_uuid"), fai.y(x9yVar, "is_vpn"), fai.A(x9yVar, "device_tier"), fai.C(x9yVar, "start_user_interaction_time"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance = (MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("start_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.q());
            x9yVar.o("resolve_screen_name_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.o());
            x9yVar.o("get_service_app_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.i());
            x9yVar.o("embedded_url_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.d());
            x9yVar.o("screen_open_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.p());
            x9yVar.o("odr_start_load_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.l());
            x9yVar.o("odr_end_load_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.k());
            x9yVar.o("odr_unzip_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.m());
            x9yVar.o("webview_start_load_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.w());
            x9yVar.o("webview_dns_look_up_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.t());
            x9yVar.o("webview_end_load_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.u());
            x9yVar.o("webview_render_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.v());
            x9yVar.o("app_init_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.b());
            x9yVar.o("end_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.e());
            x9yVar.m(mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.z(), "is_success");
            x9yVar.n("app_id", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.a());
            x9yVar.o("webview_url", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.x());
            x9yVar.m(mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.h(), "from_cache");
            x9yVar.m(mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.y(), "is_odr");
            x9yVar.m(mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.j(), "has_odr_archive");
            x9yVar.n("odr_version", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.n());
            x9yVar.n("error_code", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.f());
            x9yVar.o("error_description", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.g());
            x9yVar.o("track_code", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.s());
            x9yVar.o("session_uuid", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.a);
            x9yVar.m(mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.A(), "is_vpn");
            x9yVar.n("device_tier", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.c());
            x9yVar.o("start_user_interaction_time", mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.r());
            return x9yVar;
        }
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    public final Boolean A() {
        return this.isVpn;
    }

    public final Integer a() {
        return this.appId;
    }

    public final String b() {
        return this.appInitTime;
    }

    public final Integer c() {
        return this.deviceTier;
    }

    public final String d() {
        return this.embeddedUrlTime;
    }

    public final String e() {
        return this.endTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance = (MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance) obj;
        return epx.f(this.startTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.startTime) && epx.f(this.resolveScreenNameTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.resolveScreenNameTime) && epx.f(this.getServiceAppTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.getServiceAppTime) && epx.f(this.embeddedUrlTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.embeddedUrlTime) && epx.f(this.screenOpenTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.screenOpenTime) && epx.f(this.odrStartLoadTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.odrStartLoadTime) && epx.f(this.odrEndLoadTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.odrEndLoadTime) && epx.f(this.odrUnzipTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.odrUnzipTime) && epx.f(this.webviewStartLoadTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.webviewStartLoadTime) && epx.f(this.webviewDnsLookUpTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.webviewDnsLookUpTime) && epx.f(this.webviewEndLoadTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.webviewEndLoadTime) && epx.f(this.webviewRenderTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.webviewRenderTime) && epx.f(this.appInitTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.appInitTime) && epx.f(this.endTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.endTime) && epx.f(this.isSuccess, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.isSuccess) && epx.f(this.appId, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.appId) && epx.f(this.webviewUrl, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.webviewUrl) && epx.f(this.fromCache, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.fromCache) && epx.f(this.isOdr, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.isOdr) && epx.f(this.hasOdrArchive, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.hasOdrArchive) && epx.f(this.odrVersion, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.odrVersion) && epx.f(this.errorCode, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.errorCode) && epx.f(this.errorDescription, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.errorDescription) && epx.f(this.trackCode, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.trackCode) && epx.f(this.a, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.a) && epx.f(this.isVpn, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.isVpn) && epx.f(this.deviceTier, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.deviceTier) && epx.f(this.startUserInteractionTime, mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.startUserInteractionTime);
    }

    public final Integer f() {
        return this.errorCode;
    }

    public final String g() {
        return this.errorDescription;
    }

    public final Boolean h() {
        return this.fromCache;
    }

    public final int hashCode() {
        String str = this.startTime;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resolveScreenNameTime;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.getServiceAppTime;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.embeddedUrlTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.screenOpenTime;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.odrStartLoadTime;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.odrEndLoadTime;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.odrUnzipTime;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.webviewStartLoadTime;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.webviewDnsLookUpTime;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.webviewEndLoadTime;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.webviewRenderTime;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.appInitTime;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.endTime;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.isSuccess;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.appId;
        int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str15 = this.webviewUrl;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool2 = this.fromCache;
        int hashCode18 = (hashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOdr;
        int hashCode19 = (hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasOdrArchive;
        int hashCode20 = (hashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num2 = this.odrVersion;
        int hashCode21 = (hashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.errorCode;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str16 = this.errorDescription;
        int hashCode23 = (hashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.trackCode;
        int hashCode24 = (hashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.a;
        int hashCode25 = (hashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool5 = this.isVpn;
        int hashCode26 = (hashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.deviceTier;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str19 = this.startUserInteractionTime;
        return hashCode27 + (str19 != null ? str19.hashCode() : 0);
    }

    public final String i() {
        return this.getServiceAppTime;
    }

    public final Boolean j() {
        return this.hasOdrArchive;
    }

    public final String k() {
        return this.odrEndLoadTime;
    }

    public final String l() {
        return this.odrStartLoadTime;
    }

    public final String m() {
        return this.odrUnzipTime;
    }

    public final Integer n() {
        return this.odrVersion;
    }

    public final String o() {
        return this.resolveScreenNameTime;
    }

    public final String p() {
        return this.screenOpenTime;
    }

    public final String q() {
        return this.startTime;
    }

    public final String r() {
        return this.startUserInteractionTime;
    }

    public final String s() {
        return this.trackCode;
    }

    public final String t() {
        return this.webviewDnsLookUpTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppsPerformance(startTime=");
        sb.append(this.startTime);
        sb.append(", resolveScreenNameTime=");
        sb.append(this.resolveScreenNameTime);
        sb.append(", getServiceAppTime=");
        sb.append(this.getServiceAppTime);
        sb.append(", embeddedUrlTime=");
        sb.append(this.embeddedUrlTime);
        sb.append(", screenOpenTime=");
        sb.append(this.screenOpenTime);
        sb.append(", odrStartLoadTime=");
        sb.append(this.odrStartLoadTime);
        sb.append(", odrEndLoadTime=");
        sb.append(this.odrEndLoadTime);
        sb.append(", odrUnzipTime=");
        sb.append(this.odrUnzipTime);
        sb.append(", webviewStartLoadTime=");
        sb.append(this.webviewStartLoadTime);
        sb.append(", webviewDnsLookUpTime=");
        sb.append(this.webviewDnsLookUpTime);
        sb.append(", webviewEndLoadTime=");
        sb.append(this.webviewEndLoadTime);
        sb.append(", webviewRenderTime=");
        sb.append(this.webviewRenderTime);
        sb.append(", appInitTime=");
        sb.append(this.appInitTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", isSuccess=");
        sb.append(this.isSuccess);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", fromCache=");
        sb.append(this.fromCache);
        sb.append(", isOdr=");
        sb.append(this.isOdr);
        sb.append(", hasOdrArchive=");
        sb.append(this.hasOdrArchive);
        sb.append(", odrVersion=");
        sb.append(this.odrVersion);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorDescription=");
        sb.append(this.errorDescription);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", sessionUuid=");
        sb.append(this.a);
        sb.append(", isVpn=");
        sb.append(this.isVpn);
        sb.append(", deviceTier=");
        sb.append(this.deviceTier);
        sb.append(", startUserInteractionTime=");
        return ho8.a(sb, this.startUserInteractionTime, ')');
    }

    public final String u() {
        return this.webviewEndLoadTime;
    }

    public final String v() {
        return this.webviewRenderTime;
    }

    public final String w() {
        return this.webviewStartLoadTime;
    }

    public final String x() {
        return this.webviewUrl;
    }

    public final Boolean y() {
        return this.isOdr;
    }

    public final Boolean z() {
        return this.isSuccess;
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, Integer num, String str15, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, String str16, String str17, String str18, Boolean bool5, Integer num4, String str19) {
        this.startTime = str;
        this.resolveScreenNameTime = str2;
        this.getServiceAppTime = str3;
        this.embeddedUrlTime = str4;
        this.screenOpenTime = str5;
        this.odrStartLoadTime = str6;
        this.odrEndLoadTime = str7;
        this.odrUnzipTime = str8;
        this.webviewStartLoadTime = str9;
        this.webviewDnsLookUpTime = str10;
        this.webviewEndLoadTime = str11;
        this.webviewRenderTime = str12;
        this.appInitTime = str13;
        this.endTime = str14;
        this.isSuccess = bool;
        this.appId = num;
        this.webviewUrl = str15;
        this.fromCache = bool2;
        this.isOdr = bool3;
        this.hasOdrArchive = bool4;
        this.odrVersion = num2;
        this.errorCode = num3;
        this.errorDescription = str16;
        this.trackCode = str17;
        this.a = str18;
        this.isVpn = bool5;
        this.deviceTier = num4;
        this.startUserInteractionTime = str19;
        FilteredString filteredString = new FilteredString(lhg.b(36));
        this.filteredSessionUuid = filteredString;
        filteredString.a(str18);
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, Integer num, String str15, Boolean bool2, Boolean bool3, Boolean bool4, Integer num2, Integer num3, String str16, String str17, String str18, Boolean bool5, Integer num4, String str19, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : num, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : bool2, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool3, (i & 524288) != 0 ? null : bool4, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num2, (i & 2097152) != 0 ? null : num3, (i & 4194304) != 0 ? null : str16, (i & 8388608) != 0 ? null : str17, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str18, (i & 33554432) != 0 ? null : bool5, (i & 67108864) != 0 ? null : num4, (i & 134217728) != 0 ? null : str19);
    }
}
