package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.C4572u;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.xt20;
import xsna.yt20;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsAdsStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("actual_ad_format")
    private final ActualAdFormat actualAdFormat;

    @pmi0("actual_slot_id")
    private final int actualSlotId;

    @pmi0("ad_format")
    private final AdFormat adFormat;
    public final transient String b;
    public final transient String c;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("ad_source")
    private final FilteredString filteredAdSource;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final FilteredString filteredRequestId;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("has_my_target_ad")
    private final boolean hasMyTargetAd;

    @pmi0("mini_app_id")
    private final int miniAppId;

    @pmi0("mini_app_url")
    private final String miniAppUrl;

    @pmi0("skipped_reasons")
    private final List<SchemeStat$AppsAdsSkippedReasonItem> skippedReasons;

    @pmi0("skipped_slots")
    private final List<Integer> skippedSlots;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class ActualAdFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActualAdFormat[] $VALUES;

        @pmi0("interstitial")
        public static final ActualAdFormat INTERSTITIAL;

        @pmi0("multi_interstitial")
        public static final ActualAdFormat MULTI_INTERSTITIAL;

        @pmi0(C4572u.j)
        public static final ActualAdFormat REWARD;

        @pmi0("splash_banner")
        public static final ActualAdFormat SPLASH_BANNER;

        static {
            ActualAdFormat actualAdFormat = new ActualAdFormat("REWARD", 0);
            REWARD = actualAdFormat;
            ActualAdFormat actualAdFormat2 = new ActualAdFormat("INTERSTITIAL", 1);
            INTERSTITIAL = actualAdFormat2;
            ActualAdFormat actualAdFormat3 = new ActualAdFormat("MULTI_INTERSTITIAL", 2);
            MULTI_INTERSTITIAL = actualAdFormat3;
            ActualAdFormat actualAdFormat4 = new ActualAdFormat("SPLASH_BANNER", 3);
            SPLASH_BANNER = actualAdFormat4;
            ActualAdFormat[] actualAdFormatArr = {actualAdFormat, actualAdFormat2, actualAdFormat3, actualAdFormat4};
            $VALUES = actualAdFormatArr;
            $ENTRIES = new asp(actualAdFormatArr);
        }

        private ActualAdFormat(String str, int i) {
        }

        public static ActualAdFormat valueOf(String str) {
            return (ActualAdFormat) Enum.valueOf(ActualAdFormat.class, str);
        }

        public static ActualAdFormat[] values() {
            return (ActualAdFormat[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class AdFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdFormat[] $VALUES;

        @pmi0("interstitial")
        public static final AdFormat INTERSTITIAL;

        @pmi0(C4572u.j)
        public static final AdFormat REWARD;

        @pmi0("splash_banner")
        public static final AdFormat SPLASH_BANNER;

        static {
            AdFormat adFormat = new AdFormat("REWARD", 0);
            REWARD = adFormat;
            AdFormat adFormat2 = new AdFormat("INTERSTITIAL", 1);
            INTERSTITIAL = adFormat2;
            AdFormat adFormat3 = new AdFormat("SPLASH_BANNER", 2);
            SPLASH_BANNER = adFormat3;
            AdFormat[] adFormatArr = {adFormat, adFormat2, adFormat3};
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

        @pmi0("click_ad")
        public static final EventType CLICK_AD;

        @pmi0("hide_by_user")
        public static final EventType HIDE_BY_USER;

        @pmi0("show_ad")
        public static final EventType SHOW_AD;

        @pmi0("show_ad_failed")
        public static final EventType SHOW_AD_FAILED;

        static {
            EventType eventType = new EventType("SHOW_AD", 0);
            SHOW_AD = eventType;
            EventType eventType2 = new EventType("CLICK_AD", 1);
            CLICK_AD = eventType2;
            EventType eventType3 = new EventType("HIDE_BY_USER", 2);
            HIDE_BY_USER = eventType3;
            EventType eventType4 = new EventType("SHOW_AD_FAILED", 3);
            SHOW_AD_FAILED = eventType4;
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
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative>, a9y<MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            int p = fai.p(x9yVar, "mini_app_id");
            String s = fai.s(x9yVar, "mini_app_url");
            boolean m = fai.m(x9yVar, "has_my_target_ad");
            int p2 = fai.p(x9yVar, "actual_slot_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("event_type");
            Object obj = null;
            EventType eventType = (EventType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), EventType.class));
            String C = fai.C(x9yVar, "track_code");
            String C2 = fai.C(x9yVar, "ad_source");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("ad_format");
            AdFormat adFormat = (AdFormat) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), AdFormat.class));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("actual_ad_format");
            ActualAdFormat actualAdFormat = (ActualAdFormat) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(q3.k(), ActualAdFormat.class));
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("skipped_reasons");
            List list = (List) ((q4 == null || (q4 instanceof u9y)) ? null : a4.fromJson(x9yVar.q("skipped_reasons").k(), new xt20().getType()));
            Gson a5 = tru.a();
            b9y q5 = x9yVar.q("skipped_slots");
            if (q5 != null && !(q5 instanceof u9y)) {
                obj = a5.fromJson(x9yVar.q("skipped_slots").k(), new yt20().getType());
            }
            return new MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative(p, s, m, p2, eventType, C, C2, adFormat, actualAdFormat, list, (List) obj, fai.C(x9yVar, CommonUrlParts.REQUEST_ID));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative = (MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("mini_app_id", Integer.valueOf(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.f()));
            x9yVar.o("mini_app_url", mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.g());
            x9yVar.m(Boolean.valueOf(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.e()), "has_my_target_ad");
            x9yVar.n("actual_slot_id", Integer.valueOf(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.b()));
            x9yVar.o("event_type", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.d()));
            x9yVar.o("track_code", mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.a);
            x9yVar.o("ad_source", mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.b);
            x9yVar.o("ad_format", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.c()));
            x9yVar.o("actual_ad_format", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.a()));
            x9yVar.o("skipped_reasons", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.h()));
            x9yVar.o("skipped_slots", tru.a().toJson(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.i()));
            x9yVar.o(CommonUrlParts.REQUEST_ID, mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.c);
            return x9yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative(int i, String str, boolean z, int i2, EventType eventType, String str2, String str3, AdFormat adFormat, ActualAdFormat actualAdFormat, List<? extends SchemeStat$AppsAdsSkippedReasonItem> list, List<Integer> list2, String str4) {
        this.miniAppId = i;
        this.miniAppUrl = str;
        this.hasMyTargetAd = z;
        this.actualSlotId = i2;
        this.eventType = eventType;
        this.a = str2;
        this.b = str3;
        this.adFormat = adFormat;
        this.actualAdFormat = actualAdFormat;
        this.skippedReasons = list;
        this.skippedSlots = list2;
        this.c = str4;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(128));
        this.filteredAdSource = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(36));
        this.filteredRequestId = filteredString3;
        filteredString.a(str2);
        filteredString2.a(str3);
        filteredString3.a(str4);
    }

    public final ActualAdFormat a() {
        return this.actualAdFormat;
    }

    public final int b() {
        return this.actualSlotId;
    }

    public final AdFormat c() {
        return this.adFormat;
    }

    public final EventType d() {
        return this.eventType;
    }

    public final boolean e() {
        return this.hasMyTargetAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative)) {
            return false;
        }
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative = (MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative) obj;
        return this.miniAppId == mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.miniAppId && epx.f(this.miniAppUrl, mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.miniAppUrl) && this.hasMyTargetAd == mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.hasMyTargetAd && this.actualSlotId == mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.actualSlotId && this.eventType == mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.eventType && epx.f(this.a, mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.a) && epx.f(this.b, mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.b) && this.adFormat == mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.adFormat && this.actualAdFormat == mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.actualAdFormat && epx.f(this.skippedReasons, mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.skippedReasons) && epx.f(this.skippedSlots, mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.skippedSlots) && epx.f(this.c, mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.c);
    }

    public final int f() {
        return this.miniAppId;
    }

    public final String g() {
        return this.miniAppUrl;
    }

    public final List<SchemeStat$AppsAdsSkippedReasonItem> h() {
        return this.skippedReasons;
    }

    public final int hashCode() {
        int a = shy.a(this.actualSlotId, qoy.b(urd0.a(Integer.hashCode(this.miniAppId) * 31, 31, this.miniAppUrl), 31, this.hasMyTargetAd), 31);
        EventType eventType = this.eventType;
        int hashCode = (a + (eventType == null ? 0 : eventType.hashCode())) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdFormat adFormat = this.adFormat;
        int hashCode4 = (hashCode3 + (adFormat == null ? 0 : adFormat.hashCode())) * 31;
        ActualAdFormat actualAdFormat = this.actualAdFormat;
        int hashCode5 = (hashCode4 + (actualAdFormat == null ? 0 : actualAdFormat.hashCode())) * 31;
        List<SchemeStat$AppsAdsSkippedReasonItem> list = this.skippedReasons;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.skippedSlots;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final List<Integer> i() {
        return this.skippedSlots;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppsAdsNative(miniAppId=");
        sb.append(this.miniAppId);
        sb.append(", miniAppUrl=");
        sb.append(this.miniAppUrl);
        sb.append(", hasMyTargetAd=");
        sb.append(this.hasMyTargetAd);
        sb.append(", actualSlotId=");
        sb.append(this.actualSlotId);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", trackCode=");
        sb.append(this.a);
        sb.append(", adSource=");
        sb.append(this.b);
        sb.append(", adFormat=");
        sb.append(this.adFormat);
        sb.append(", actualAdFormat=");
        sb.append(this.actualAdFormat);
        sb.append(", skippedReasons=");
        sb.append(this.skippedReasons);
        sb.append(", skippedSlots=");
        sb.append(this.skippedSlots);
        sb.append(", requestId=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative(int i, String str, boolean z, int i2, EventType eventType, String str2, String str3, AdFormat adFormat, ActualAdFormat actualAdFormat, List list, List list2, String str4, int i3, zcl zclVar) {
        this(i, str, z, i2, (i3 & 16) != 0 ? null : eventType, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : adFormat, (i3 & 256) != 0 ? null : actualAdFormat, (i3 & 512) != 0 ? null : list, (i3 & 1024) != 0 ? null : list2, (i3 & 2048) != 0 ? null : str4);
    }
}
