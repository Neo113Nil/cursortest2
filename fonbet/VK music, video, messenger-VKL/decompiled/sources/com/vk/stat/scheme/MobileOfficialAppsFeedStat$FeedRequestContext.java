package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.core.CommonCode;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.a9y;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tn;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedRequestContext {
    public final transient String a;

    @pmi0("app_start_entrypoint")
    private final MobileOfficialAppsFeedStat$AppStartEntrypoint appStartEntrypoint;
    public final transient String b;

    @pmi0("cache_status")
    private final MobileOfficialAppsFeedStat$CacheStatus cacheStatus;

    @pmi0("client_cache_status")
    private final MobileOfficialAppsFeedStat$ClientCacheStatus clientCacheStatus;

    @pmi0("delay")
    private final Long delay;

    @pmi0("feed_id")
    private final String feedId;

    @pmi0(StatCustomFieldKey.API_METHOD)
    private final FilteredString filteredApiMethod;

    @pmi0("start_from")
    private final FilteredString filteredStartFrom;

    @pmi0(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)
    private final MobileOfficialAppsFeedStat$FeedIntent intent;

    @pmi0("is_app_in_background")
    private final Boolean isAppInBackground;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("page_size")
    private final int pageSize;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final Long requestId;

    @pmi0("screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen screen;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$FeedRequestContext>, a9y<MobileOfficialAppsFeedStat$FeedRequestContext> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            int p = fai.p(x9yVar, "page_size");
            String s = fai.s(x9yVar, "feed_id");
            MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent = (MobileOfficialAppsFeedStat$FeedIntent) dq.f(x9yVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, tru.a(), MobileOfficialAppsFeedStat$FeedIntent.class);
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) dq.f(x9yVar, "screen", tru.a(), MobileOfficialAppsCoreNavStat$EventScreen.class);
            MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = (MobileOfficialAppsCoreDeviceStat$NetworkInfo) dq.f(x9yVar, "network_info", tru.a(), MobileOfficialAppsCoreDeviceStat$NetworkInfo.class);
            String s2 = fai.s(x9yVar, StatCustomFieldKey.API_METHOD);
            String C = fai.C(x9yVar, "start_from");
            Gson a = tru.a();
            b9y q = x9yVar.q("client_cache_status");
            MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus = (MobileOfficialAppsFeedStat$ClientCacheStatus) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), MobileOfficialAppsFeedStat$ClientCacheStatus.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("cache_status");
            MobileOfficialAppsFeedStat$CacheStatus mobileOfficialAppsFeedStat$CacheStatus = (MobileOfficialAppsFeedStat$CacheStatus) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), MobileOfficialAppsFeedStat$CacheStatus.class));
            Long B = fai.B(x9yVar, CommonUrlParts.REQUEST_ID);
            Long B2 = fai.B(x9yVar, "delay");
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("app_start_entrypoint");
            return new MobileOfficialAppsFeedStat$FeedRequestContext(p, s, mobileOfficialAppsFeedStat$FeedIntent, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsCoreDeviceStat$NetworkInfo, s2, C, mobileOfficialAppsFeedStat$ClientCacheStatus, mobileOfficialAppsFeedStat$CacheStatus, B, B2, (MobileOfficialAppsFeedStat$AppStartEntrypoint) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(q3.k(), MobileOfficialAppsFeedStat$AppStartEntrypoint.class)), fai.y(x9yVar, "is_app_in_background"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$FeedRequestContext mobileOfficialAppsFeedStat$FeedRequestContext = (MobileOfficialAppsFeedStat$FeedRequestContext) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("page_size", Integer.valueOf(mobileOfficialAppsFeedStat$FeedRequestContext.h()));
            x9yVar.o("feed_id", mobileOfficialAppsFeedStat$FeedRequestContext.e());
            x9yVar.o(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, tru.a().toJson(mobileOfficialAppsFeedStat$FeedRequestContext.f()));
            x9yVar.o("screen", tru.a().toJson(mobileOfficialAppsFeedStat$FeedRequestContext.j()));
            x9yVar.o("network_info", tru.a().toJson(mobileOfficialAppsFeedStat$FeedRequestContext.g()));
            x9yVar.o(StatCustomFieldKey.API_METHOD, mobileOfficialAppsFeedStat$FeedRequestContext.a);
            x9yVar.o("start_from", mobileOfficialAppsFeedStat$FeedRequestContext.b);
            x9yVar.o("client_cache_status", tru.a().toJson(mobileOfficialAppsFeedStat$FeedRequestContext.c()));
            x9yVar.o("cache_status", tru.a().toJson(mobileOfficialAppsFeedStat$FeedRequestContext.b()));
            x9yVar.n(CommonUrlParts.REQUEST_ID, mobileOfficialAppsFeedStat$FeedRequestContext.i());
            x9yVar.n("delay", mobileOfficialAppsFeedStat$FeedRequestContext.d());
            x9yVar.o("app_start_entrypoint", tru.a().toJson(mobileOfficialAppsFeedStat$FeedRequestContext.a()));
            x9yVar.m(mobileOfficialAppsFeedStat$FeedRequestContext.k(), "is_app_in_background");
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$FeedRequestContext(int i, String str, MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, String str2, String str3, MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus, MobileOfficialAppsFeedStat$CacheStatus mobileOfficialAppsFeedStat$CacheStatus, Long l, Long l2, MobileOfficialAppsFeedStat$AppStartEntrypoint mobileOfficialAppsFeedStat$AppStartEntrypoint, Boolean bool) {
        this.pageSize = i;
        this.feedId = str;
        this.intent = mobileOfficialAppsFeedStat$FeedIntent;
        this.screen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        this.a = str2;
        this.b = str3;
        this.clientCacheStatus = mobileOfficialAppsFeedStat$ClientCacheStatus;
        this.cacheStatus = mobileOfficialAppsFeedStat$CacheStatus;
        this.requestId = l;
        this.delay = l2;
        this.appStartEntrypoint = mobileOfficialAppsFeedStat$AppStartEntrypoint;
        this.isAppInBackground = bool;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredApiMethod = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredStartFrom = filteredString2;
        filteredString.a(str2);
        filteredString2.a(str3);
    }

    public final MobileOfficialAppsFeedStat$AppStartEntrypoint a() {
        return this.appStartEntrypoint;
    }

    public final MobileOfficialAppsFeedStat$CacheStatus b() {
        return this.cacheStatus;
    }

    public final MobileOfficialAppsFeedStat$ClientCacheStatus c() {
        return this.clientCacheStatus;
    }

    public final Long d() {
        return this.delay;
    }

    public final String e() {
        return this.feedId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedRequestContext)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedRequestContext mobileOfficialAppsFeedStat$FeedRequestContext = (MobileOfficialAppsFeedStat$FeedRequestContext) obj;
        return this.pageSize == mobileOfficialAppsFeedStat$FeedRequestContext.pageSize && epx.f(this.feedId, mobileOfficialAppsFeedStat$FeedRequestContext.feedId) && this.intent == mobileOfficialAppsFeedStat$FeedRequestContext.intent && this.screen == mobileOfficialAppsFeedStat$FeedRequestContext.screen && epx.f(this.networkInfo, mobileOfficialAppsFeedStat$FeedRequestContext.networkInfo) && epx.f(this.a, mobileOfficialAppsFeedStat$FeedRequestContext.a) && epx.f(this.b, mobileOfficialAppsFeedStat$FeedRequestContext.b) && this.clientCacheStatus == mobileOfficialAppsFeedStat$FeedRequestContext.clientCacheStatus && epx.f(this.cacheStatus, mobileOfficialAppsFeedStat$FeedRequestContext.cacheStatus) && epx.f(this.requestId, mobileOfficialAppsFeedStat$FeedRequestContext.requestId) && epx.f(this.delay, mobileOfficialAppsFeedStat$FeedRequestContext.delay) && this.appStartEntrypoint == mobileOfficialAppsFeedStat$FeedRequestContext.appStartEntrypoint && epx.f(this.isAppInBackground, mobileOfficialAppsFeedStat$FeedRequestContext.isAppInBackground);
    }

    public final MobileOfficialAppsFeedStat$FeedIntent f() {
        return this.intent;
    }

    public final MobileOfficialAppsCoreDeviceStat$NetworkInfo g() {
        return this.networkInfo;
    }

    public final int h() {
        return this.pageSize;
    }

    public final int hashCode() {
        int a = urd0.a((this.networkInfo.hashCode() + ((this.screen.hashCode() + ((this.intent.hashCode() + urd0.a(Integer.hashCode(this.pageSize) * 31, 31, this.feedId)) * 31)) * 31)) * 31, 31, this.a);
        String str = this.b;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus = this.clientCacheStatus;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$ClientCacheStatus == null ? 0 : mobileOfficialAppsFeedStat$ClientCacheStatus.hashCode())) * 31;
        MobileOfficialAppsFeedStat$CacheStatus mobileOfficialAppsFeedStat$CacheStatus = this.cacheStatus;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsFeedStat$CacheStatus == null ? 0 : mobileOfficialAppsFeedStat$CacheStatus.hashCode())) * 31;
        Long l = this.requestId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.delay;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        MobileOfficialAppsFeedStat$AppStartEntrypoint mobileOfficialAppsFeedStat$AppStartEntrypoint = this.appStartEntrypoint;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsFeedStat$AppStartEntrypoint == null ? 0 : mobileOfficialAppsFeedStat$AppStartEntrypoint.hashCode())) * 31;
        Boolean bool = this.isAppInBackground;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final Long i() {
        return this.requestId;
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen j() {
        return this.screen;
    }

    public final Boolean k() {
        return this.isAppInBackground;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedRequestContext(pageSize=");
        sb.append(this.pageSize);
        sb.append(", feedId=");
        sb.append(this.feedId);
        sb.append(", intent=");
        sb.append(this.intent);
        sb.append(", screen=");
        sb.append(this.screen);
        sb.append(", networkInfo=");
        sb.append(this.networkInfo);
        sb.append(", apiMethod=");
        sb.append(this.a);
        sb.append(", startFrom=");
        sb.append(this.b);
        sb.append(", clientCacheStatus=");
        sb.append(this.clientCacheStatus);
        sb.append(", cacheStatus=");
        sb.append(this.cacheStatus);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", delay=");
        sb.append(this.delay);
        sb.append(", appStartEntrypoint=");
        sb.append(this.appStartEntrypoint);
        sb.append(", isAppInBackground=");
        return tn.a(sb, this.isAppInBackground, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedRequestContext(int i, String str, MobileOfficialAppsFeedStat$FeedIntent mobileOfficialAppsFeedStat$FeedIntent, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, String str2, String str3, MobileOfficialAppsFeedStat$ClientCacheStatus mobileOfficialAppsFeedStat$ClientCacheStatus, MobileOfficialAppsFeedStat$CacheStatus mobileOfficialAppsFeedStat$CacheStatus, Long l, Long l2, MobileOfficialAppsFeedStat$AppStartEntrypoint mobileOfficialAppsFeedStat$AppStartEntrypoint, Boolean bool, int i2, zcl zclVar) {
        this(i, str, mobileOfficialAppsFeedStat$FeedIntent, mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsCoreDeviceStat$NetworkInfo, str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : mobileOfficialAppsFeedStat$ClientCacheStatus, (i2 & 256) != 0 ? null : mobileOfficialAppsFeedStat$CacheStatus, (i2 & 512) != 0 ? null : l, (i2 & 1024) != 0 ? null : l2, (i2 & 2048) != 0 ? null : mobileOfficialAppsFeedStat$AppStartEntrypoint, (i2 & 4096) != 0 ? null : bool);
    }
}
