package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.so;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedAdsInsert implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("ads_inserted_count")
    private final int adsInsertedCount;

    @pmi0("ads_recieved_count")
    private final int adsRecievedCount;

    @pmi0("ads_requested_count")
    private final int adsRequestedCount;
    public final transient String b;

    @pmi0("dsp_name")
    private final FilteredString filteredDspName;

    @pmi0("network_name")
    private final FilteredString filteredNetworkName;

    @pmi0("request_source")
    private final RequestSource requestSource;

    @pmi0("revenue")
    private final Float revenue;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedAdsInsert>, a9y<MobileOfficialAppsFeedStat$TypeFeedAdsInsert> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedAdsInsert((RequestSource) dq.f(x9yVar, "request_source", tru.a(), RequestSource.class), fai.p(x9yVar, "ads_requested_count"), fai.p(x9yVar, "ads_recieved_count"), fai.p(x9yVar, "ads_inserted_count"), fai.C(x9yVar, "network_name"), fai.C(x9yVar, "dsp_name"), fai.z(x9yVar, "revenue"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedAdsInsert mobileOfficialAppsFeedStat$TypeFeedAdsInsert = (MobileOfficialAppsFeedStat$TypeFeedAdsInsert) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("request_source", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedAdsInsert.d()));
            x9yVar.n("ads_requested_count", Integer.valueOf(mobileOfficialAppsFeedStat$TypeFeedAdsInsert.c()));
            x9yVar.n("ads_recieved_count", Integer.valueOf(mobileOfficialAppsFeedStat$TypeFeedAdsInsert.b()));
            x9yVar.n("ads_inserted_count", Integer.valueOf(mobileOfficialAppsFeedStat$TypeFeedAdsInsert.a()));
            x9yVar.o("network_name", mobileOfficialAppsFeedStat$TypeFeedAdsInsert.a);
            x9yVar.o("dsp_name", mobileOfficialAppsFeedStat$TypeFeedAdsInsert.b);
            x9yVar.n("revenue", mobileOfficialAppsFeedStat$TypeFeedAdsInsert.e());
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    /* loaded from: classes5.dex */
    public static final class RequestSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestSource[] $VALUES;

        @pmi0("applovin_feed")
        public static final RequestSource APPLOVIN_FEED;

        @pmi0("yandex_community")
        public static final RequestSource YANDEX_COMMUNITY;

        static {
            RequestSource requestSource = new RequestSource("APPLOVIN_FEED", 0);
            APPLOVIN_FEED = requestSource;
            RequestSource requestSource2 = new RequestSource("YANDEX_COMMUNITY", 1);
            YANDEX_COMMUNITY = requestSource2;
            RequestSource[] requestSourceArr = {requestSource, requestSource2};
            $VALUES = requestSourceArr;
            $ENTRIES = new asp(requestSourceArr);
        }

        private RequestSource(String str, int i) {
        }

        public static RequestSource valueOf(String str) {
            return (RequestSource) Enum.valueOf(RequestSource.class, str);
        }

        public static RequestSource[] values() {
            return (RequestSource[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedAdsInsert(RequestSource requestSource, int i, int i2, int i3, String str, String str2, Float f) {
        this.requestSource = requestSource;
        this.adsRequestedCount = i;
        this.adsRecievedCount = i2;
        this.adsInsertedCount = i3;
        this.a = str;
        this.b = str2;
        this.revenue = f;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredNetworkName = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(128));
        this.filteredDspName = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final int a() {
        return this.adsInsertedCount;
    }

    public final int b() {
        return this.adsRecievedCount;
    }

    public final int c() {
        return this.adsRequestedCount;
    }

    public final RequestSource d() {
        return this.requestSource;
    }

    public final Float e() {
        return this.revenue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedAdsInsert)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedAdsInsert mobileOfficialAppsFeedStat$TypeFeedAdsInsert = (MobileOfficialAppsFeedStat$TypeFeedAdsInsert) obj;
        return this.requestSource == mobileOfficialAppsFeedStat$TypeFeedAdsInsert.requestSource && this.adsRequestedCount == mobileOfficialAppsFeedStat$TypeFeedAdsInsert.adsRequestedCount && this.adsRecievedCount == mobileOfficialAppsFeedStat$TypeFeedAdsInsert.adsRecievedCount && this.adsInsertedCount == mobileOfficialAppsFeedStat$TypeFeedAdsInsert.adsInsertedCount && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedAdsInsert.a) && epx.f(this.b, mobileOfficialAppsFeedStat$TypeFeedAdsInsert.b) && epx.f(this.revenue, mobileOfficialAppsFeedStat$TypeFeedAdsInsert.revenue);
    }

    public final int hashCode() {
        int a = shy.a(this.adsInsertedCount, shy.a(this.adsRecievedCount, shy.a(this.adsRequestedCount, this.requestSource.hashCode() * 31, 31), 31), 31);
        String str = this.a;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.revenue;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedAdsInsert(requestSource=");
        sb.append(this.requestSource);
        sb.append(", adsRequestedCount=");
        sb.append(this.adsRequestedCount);
        sb.append(", adsRecievedCount=");
        sb.append(this.adsRecievedCount);
        sb.append(", adsInsertedCount=");
        sb.append(this.adsInsertedCount);
        sb.append(", networkName=");
        sb.append(this.a);
        sb.append(", dspName=");
        sb.append(this.b);
        sb.append(", revenue=");
        return so.b(sb, this.revenue, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedAdsInsert(RequestSource requestSource, int i, int i2, int i3, String str, String str2, Float f, int i4, zcl zclVar) {
        this(requestSource, i, i2, i3, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : f);
    }
}
