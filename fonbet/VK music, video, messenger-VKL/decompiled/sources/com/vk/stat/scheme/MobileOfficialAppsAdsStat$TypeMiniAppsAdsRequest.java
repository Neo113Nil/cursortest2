package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.C4572u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsAdsStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("ad_format")
    private final AdFormat adFormat;
    public final transient String b;
    public final transient String c;
    public final transient String d;
    public final transient String e;

    @pmi0("ecpm")
    private final Float ecpm;

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("ad_source")
    private final FilteredString filteredAdSource;

    @pmi0("dsp_source")
    private final FilteredString filteredDspSource;

    @pmi0("error_message")
    private final FilteredString filteredErrorMessage;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final FilteredString filteredRequestId;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("mini_app_id")
    private final int miniAppId;

    @pmi0("mini_app_url")
    private final String miniAppUrl;

    @pmi0("request_subtype")
    private final RequestSubtype requestSubtype;

    @pmi0("request_type")
    private final RequestType requestType;

    @pmi0("slot_id")
    private final Integer slotId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class AdFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdFormat[] $VALUES;

        @pmi0("banner")
        public static final AdFormat BANNER;

        @pmi0("interstitial")
        public static final AdFormat INTERSTITIAL;

        @pmi0("multi_interstitial")
        public static final AdFormat MULTI_INTERSTITIAL;

        @pmi0(C4572u.j)
        public static final AdFormat REWARD;

        @pmi0("splash_banner")
        public static final AdFormat SPLASH_BANNER;

        static {
            AdFormat adFormat = new AdFormat("REWARD", 0);
            REWARD = adFormat;
            AdFormat adFormat2 = new AdFormat("INTERSTITIAL", 1);
            INTERSTITIAL = adFormat2;
            AdFormat adFormat3 = new AdFormat("MULTI_INTERSTITIAL", 2);
            MULTI_INTERSTITIAL = adFormat3;
            AdFormat adFormat4 = new AdFormat("SPLASH_BANNER", 3);
            SPLASH_BANNER = adFormat4;
            AdFormat adFormat5 = new AdFormat("BANNER", 4);
            BANNER = adFormat5;
            AdFormat[] adFormatArr = {adFormat, adFormat2, adFormat3, adFormat4, adFormat5};
            $VALUES = adFormatArr;
            $ENTRIES = new asp(adFormatArr);
        }

        private AdFormat(String str, int i) {
        }

        public static AdFormat valueOf(String str) {
            return (AdFormat) Enum.valueOf(AdFormat.class, str);
        }

        public static AdFormat[] values() {
            return (AdFormat[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("impression")
        public static final EventType IMPRESSION;

        @pmi0("load")
        public static final EventType LOAD;

        @pmi0("request")
        public static final EventType REQUEST;

        @pmi0("show")
        public static final EventType SHOW;

        static {
            EventType eventType = new EventType("REQUEST", 0);
            REQUEST = eventType;
            EventType eventType2 = new EventType("LOAD", 1);
            LOAD = eventType2;
            EventType eventType3 = new EventType("SHOW", 2);
            SHOW = eventType3;
            EventType eventType4 = new EventType("IMPRESSION", 3);
            IMPRESSION = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsAdsStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest>, a9y<MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            int p = fai.p(x9yVar, "mini_app_id");
            String s = fai.s(x9yVar, "mini_app_url");
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            RequestType requestType = (RequestType) dq.f(x9yVar, "request_type", tru.a(), RequestType.class);
            RequestSubtype requestSubtype = (RequestSubtype) dq.f(x9yVar, "request_subtype", tru.a(), RequestSubtype.class);
            String C = fai.C(x9yVar, "track_code");
            Gson a = tru.a();
            b9y q = x9yVar.q("ad_format");
            return new MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest(p, s, eventType, requestType, requestSubtype, C, (AdFormat) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), AdFormat.class)), fai.C(x9yVar, "ad_source"), fai.A(x9yVar, "slot_id"), fai.C(x9yVar, "dsp_source"), fai.z(x9yVar, "ecpm"), fai.A(x9yVar, "error_code"), fai.C(x9yVar, "error_message"), fai.C(x9yVar, CommonUrlParts.REQUEST_ID));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest = (MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("mini_app_id", Integer.valueOf(mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.e()));
            x9yVar.o("mini_app_url", mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.f());
            x9yVar.o("event_type", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.d()));
            x9yVar.o("request_type", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.h()));
            x9yVar.o("request_subtype", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.g()));
            x9yVar.o("track_code", mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.a);
            x9yVar.o("ad_format", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.a()));
            x9yVar.o("ad_source", mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.b);
            x9yVar.n("slot_id", mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.i());
            x9yVar.o("dsp_source", mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.c);
            x9yVar.n("ecpm", mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.b());
            x9yVar.n("error_code", mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.c());
            x9yVar.o("error_message", mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.d);
            x9yVar.o(CommonUrlParts.REQUEST_ID, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.e);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class RequestSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestSubtype[] $VALUES;

        @pmi0("check")
        public static final RequestSubtype CHECK;

        @pmi0("load_next")
        public static final RequestSubtype LOAD_NEXT;

        @pmi0("preload")
        public static final RequestSubtype PRELOAD;

        @pmi0("show")
        public static final RequestSubtype SHOW;

        static {
            RequestSubtype requestSubtype = new RequestSubtype("PRELOAD", 0);
            PRELOAD = requestSubtype;
            RequestSubtype requestSubtype2 = new RequestSubtype("CHECK", 1);
            CHECK = requestSubtype2;
            RequestSubtype requestSubtype3 = new RequestSubtype("SHOW", 2);
            SHOW = requestSubtype3;
            RequestSubtype requestSubtype4 = new RequestSubtype("LOAD_NEXT", 3);
            LOAD_NEXT = requestSubtype4;
            RequestSubtype[] requestSubtypeArr = {requestSubtype, requestSubtype2, requestSubtype3, requestSubtype4};
            $VALUES = requestSubtypeArr;
            $ENTRIES = new asp(requestSubtypeArr);
        }

        private RequestSubtype(String str, int i) {
        }

        public static RequestSubtype valueOf(String str) {
            return (RequestSubtype) Enum.valueOf(RequestSubtype.class, str);
        }

        public static RequestSubtype[] values() {
            return (RequestSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class RequestType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestType[] $VALUES;

        @pmi0("bridge")
        public static final RequestType BRIDGE;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final RequestType CLOSE;

        @pmi0("splash")
        public static final RequestType SPLASH;

        static {
            RequestType requestType = new RequestType("BRIDGE", 0);
            BRIDGE = requestType;
            RequestType requestType2 = new RequestType("SPLASH", 1);
            SPLASH = requestType2;
            RequestType requestType3 = new RequestType("CLOSE", 2);
            CLOSE = requestType3;
            RequestType[] requestTypeArr = {requestType, requestType2, requestType3};
            $VALUES = requestTypeArr;
            $ENTRIES = new asp(requestTypeArr);
        }

        private RequestType(String str, int i) {
        }

        public static RequestType valueOf(String str) {
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }

        public static RequestType[] values() {
            return (RequestType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest(int i, String str, EventType eventType, RequestType requestType, RequestSubtype requestSubtype, String str2, AdFormat adFormat, String str3, Integer num, String str4, Float f, Integer num2, String str5, String str6) {
        this.miniAppId = i;
        this.miniAppUrl = str;
        this.eventType = eventType;
        this.requestType = requestType;
        this.requestSubtype = requestSubtype;
        this.a = str2;
        this.adFormat = adFormat;
        this.b = str3;
        this.slotId = num;
        this.c = str4;
        this.ecpm = f;
        this.errorCode = num2;
        this.d = str5;
        this.e = str6;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(128));
        this.filteredAdSource = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(128));
        this.filteredDspSource = filteredString3;
        FilteredString filteredString4 = new FilteredString(lhg.b(256));
        this.filteredErrorMessage = filteredString4;
        FilteredString filteredString5 = new FilteredString(lhg.b(36));
        this.filteredRequestId = filteredString5;
        filteredString.a(str2);
        filteredString2.a(str3);
        filteredString3.a(str4);
        filteredString4.a(str5);
        filteredString5.a(str6);
    }

    public final AdFormat a() {
        return this.adFormat;
    }

    public final Float b() {
        return this.ecpm;
    }

    public final Integer c() {
        return this.errorCode;
    }

    public final EventType d() {
        return this.eventType;
    }

    public final int e() {
        return this.miniAppId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest)) {
            return false;
        }
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest = (MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest) obj;
        return this.miniAppId == mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.miniAppId && epx.f(this.miniAppUrl, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.miniAppUrl) && this.eventType == mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.eventType && this.requestType == mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.requestType && this.requestSubtype == mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.requestSubtype && epx.f(this.a, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.a) && this.adFormat == mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.adFormat && epx.f(this.b, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.b) && epx.f(this.slotId, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.slotId) && epx.f(this.c, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.c) && epx.f(this.ecpm, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.ecpm) && epx.f(this.errorCode, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.errorCode) && epx.f(this.d, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.d) && epx.f(this.e, mobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.e);
    }

    public final String f() {
        return this.miniAppUrl;
    }

    public final RequestSubtype g() {
        return this.requestSubtype;
    }

    public final RequestType h() {
        return this.requestType;
    }

    public final int hashCode() {
        int hashCode = (this.requestSubtype.hashCode() + ((this.requestType.hashCode() + ((this.eventType.hashCode() + urd0.a(Integer.hashCode(this.miniAppId) * 31, 31, this.miniAppUrl)) * 31)) * 31)) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdFormat adFormat = this.adFormat;
        int hashCode3 = (hashCode2 + (adFormat == null ? 0 : adFormat.hashCode())) * 31;
        String str2 = this.b;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.slotId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.c;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.ecpm;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.errorCode;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.d;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Integer i() {
        return this.slotId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppsAdsRequest(miniAppId=");
        sb.append(this.miniAppId);
        sb.append(", miniAppUrl=");
        sb.append(this.miniAppUrl);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", requestType=");
        sb.append(this.requestType);
        sb.append(", requestSubtype=");
        sb.append(this.requestSubtype);
        sb.append(", trackCode=");
        sb.append(this.a);
        sb.append(", adFormat=");
        sb.append(this.adFormat);
        sb.append(", adSource=");
        sb.append(this.b);
        sb.append(", slotId=");
        sb.append(this.slotId);
        sb.append(", dspSource=");
        sb.append(this.c);
        sb.append(", ecpm=");
        sb.append(this.ecpm);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        sb.append(this.d);
        sb.append(", requestId=");
        return ho8.a(sb, this.e, ')');
    }

    public /* synthetic */ MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest(int i, String str, EventType eventType, RequestType requestType, RequestSubtype requestSubtype, String str2, AdFormat adFormat, String str3, Integer num, String str4, Float f, Integer num2, String str5, String str6, int i2, zcl zclVar) {
        this(i, str, eventType, requestType, requestSubtype, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : adFormat, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : num2, (i2 & 4096) != 0 ? null : str5, (i2 & 8192) != 0 ? null : str6);
    }
}
