package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeAppLoadingApi implements SchemeStat$EventBenchmarkMain.b {
    public final transient String a;
    public final transient String b;

    @pmi0("error_type")
    private final ErrorType errorType;

    @pmi0(StatCustomFieldKey.API_METHOD)
    private final FilteredString filteredApiMethod;

    @pmi0("error_description")
    private final FilteredString filteredErrorDescription;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("request_end_time")
    private final String requestEndTime;

    @pmi0("request_start_time")
    private final String requestStartTime;

    @pmi0("retry_count")
    private final int retryCount;

    @pmi0("screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen screen;

    @pmi0("type")
    private final Type type;

    @pmi0("type_feed_screen_info")
    private final SchemeStat$TypeFeedScreenInfo typeFeedScreenInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ErrorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @pmi0("parse")
        public static final ErrorType PARSE;

        @pmi0("timeout")
        public static final ErrorType TIMEOUT;

        static {
            ErrorType errorType = new ErrorType("PARSE", 0);
            PARSE = errorType;
            ErrorType errorType2 = new ErrorType("TIMEOUT", 1);
            TIMEOUT = errorType2;
            ErrorType[] errorTypeArr = {errorType, errorType2};
            $VALUES = errorTypeArr;
            $ENTRIES = new asp(errorTypeArr);
        }

        private ErrorType(String str, int i) {
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeAppLoadingApi>, a9y<SchemeStat$TypeAppLoadingApi> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = (MobileOfficialAppsCoreDeviceStat$NetworkInfo) dq.f(x9yVar, "network_info", tru.a(), MobileOfficialAppsCoreDeviceStat$NetworkInfo.class);
            String s = fai.s(x9yVar, StatCustomFieldKey.API_METHOD);
            ErrorType errorType = (ErrorType) dq.f(x9yVar, "error_type", tru.a(), ErrorType.class);
            String s2 = fai.s(x9yVar, "request_start_time");
            String s3 = fai.s(x9yVar, "request_end_time");
            int p = fai.p(x9yVar, "retry_count");
            Gson a = tru.a();
            b9y q = x9yVar.q("screen");
            Object obj = null;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), MobileOfficialAppsCoreNavStat$EventScreen.class));
            String C = fai.C(x9yVar, "error_description");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("type");
            Type type = (Type) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), Type.class));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("type_feed_screen_info");
            if (q3 != null && !(q3 instanceof u9y)) {
                obj = a3.fromJson(q3.k(), (Class<Object>) SchemeStat$TypeFeedScreenInfo.class);
            }
            return new SchemeStat$TypeAppLoadingApi(mobileOfficialAppsCoreDeviceStat$NetworkInfo, s, errorType, s2, s3, p, mobileOfficialAppsCoreNavStat$EventScreen, C, type, (SchemeStat$TypeFeedScreenInfo) obj, null);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeAppLoadingApi schemeStat$TypeAppLoadingApi = (SchemeStat$TypeAppLoadingApi) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("network_info", tru.a().toJson(schemeStat$TypeAppLoadingApi.b()));
            x9yVar.o(StatCustomFieldKey.API_METHOD, schemeStat$TypeAppLoadingApi.a);
            x9yVar.o("error_type", tru.a().toJson(schemeStat$TypeAppLoadingApi.a()));
            x9yVar.o("request_start_time", schemeStat$TypeAppLoadingApi.d());
            x9yVar.o("request_end_time", schemeStat$TypeAppLoadingApi.c());
            x9yVar.n("retry_count", Integer.valueOf(schemeStat$TypeAppLoadingApi.e()));
            x9yVar.o("screen", tru.a().toJson(schemeStat$TypeAppLoadingApi.f()));
            x9yVar.o("error_description", schemeStat$TypeAppLoadingApi.b);
            x9yVar.o("type", tru.a().toJson(schemeStat$TypeAppLoadingApi.g()));
            x9yVar.o("type_feed_screen_info", tru.a().toJson(schemeStat$TypeAppLoadingApi.h()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_feed_screen_info")
        public static final Type TYPE_FEED_SCREEN_INFO;

        static {
            Type type = new Type("TYPE_FEED_SCREEN_INFO", 0);
            TYPE_FEED_SCREEN_INFO = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SchemeStat$TypeAppLoadingApi(MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, String str, ErrorType errorType, String str2, String str3, int i, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str4, Type type, SchemeStat$TypeFeedScreenInfo schemeStat$TypeFeedScreenInfo, zcl zclVar) {
        this(mobileOfficialAppsCoreDeviceStat$NetworkInfo, str, errorType, str2, str3, i, mobileOfficialAppsCoreNavStat$EventScreen, str4, type, schemeStat$TypeFeedScreenInfo);
    }

    public final ErrorType a() {
        return this.errorType;
    }

    public final MobileOfficialAppsCoreDeviceStat$NetworkInfo b() {
        return this.networkInfo;
    }

    public final String c() {
        return this.requestEndTime;
    }

    public final String d() {
        return this.requestStartTime;
    }

    public final int e() {
        return this.retryCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAppLoadingApi)) {
            return false;
        }
        SchemeStat$TypeAppLoadingApi schemeStat$TypeAppLoadingApi = (SchemeStat$TypeAppLoadingApi) obj;
        return epx.f(this.networkInfo, schemeStat$TypeAppLoadingApi.networkInfo) && epx.f(this.a, schemeStat$TypeAppLoadingApi.a) && this.errorType == schemeStat$TypeAppLoadingApi.errorType && epx.f(this.requestStartTime, schemeStat$TypeAppLoadingApi.requestStartTime) && epx.f(this.requestEndTime, schemeStat$TypeAppLoadingApi.requestEndTime) && this.retryCount == schemeStat$TypeAppLoadingApi.retryCount && this.screen == schemeStat$TypeAppLoadingApi.screen && epx.f(this.b, schemeStat$TypeAppLoadingApi.b) && this.type == schemeStat$TypeAppLoadingApi.type && epx.f(this.typeFeedScreenInfo, schemeStat$TypeAppLoadingApi.typeFeedScreenInfo);
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen f() {
        return this.screen;
    }

    public final Type g() {
        return this.type;
    }

    public final SchemeStat$TypeFeedScreenInfo h() {
        return this.typeFeedScreenInfo;
    }

    public final int hashCode() {
        int a = shy.a(this.retryCount, urd0.a(urd0.a((this.errorType.hashCode() + urd0.a(this.networkInfo.hashCode() * 31, 31, this.a)) * 31, 31, this.requestStartTime), 31, this.requestEndTime), 31);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.screen;
        int hashCode = (a + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Type type = this.type;
        int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        SchemeStat$TypeFeedScreenInfo schemeStat$TypeFeedScreenInfo = this.typeFeedScreenInfo;
        return hashCode3 + (schemeStat$TypeFeedScreenInfo != null ? schemeStat$TypeFeedScreenInfo.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAppLoadingApi(networkInfo=" + this.networkInfo + ", apiMethod=" + this.a + ", errorType=" + this.errorType + ", requestStartTime=" + this.requestStartTime + ", requestEndTime=" + this.requestEndTime + ", retryCount=" + this.retryCount + ", screen=" + this.screen + ", errorDescription=" + this.b + ", type=" + this.type + ", typeFeedScreenInfo=" + this.typeFeedScreenInfo + ')';
    }

    private SchemeStat$TypeAppLoadingApi(MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, String str, ErrorType errorType, String str2, String str3, int i, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str4, Type type, SchemeStat$TypeFeedScreenInfo schemeStat$TypeFeedScreenInfo) {
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        this.a = str;
        this.errorType = errorType;
        this.requestStartTime = str2;
        this.requestEndTime = str3;
        this.retryCount = i;
        this.screen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.b = str4;
        this.type = type;
        this.typeFeedScreenInfo = schemeStat$TypeFeedScreenInfo;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredApiMethod = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredErrorDescription = filteredString2;
        filteredString.a(str);
        filteredString2.a(str4);
    }

    public /* synthetic */ SchemeStat$TypeAppLoadingApi(MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, String str, ErrorType errorType, String str2, String str3, int i, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str4, Type type, SchemeStat$TypeFeedScreenInfo schemeStat$TypeFeedScreenInfo, int i2, zcl zclVar) {
        this(mobileOfficialAppsCoreDeviceStat$NetworkInfo, str, errorType, str2, str3, i, (i2 & 64) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : type, (i2 & 512) != 0 ? null : schemeStat$TypeFeedScreenInfo);
    }
}
