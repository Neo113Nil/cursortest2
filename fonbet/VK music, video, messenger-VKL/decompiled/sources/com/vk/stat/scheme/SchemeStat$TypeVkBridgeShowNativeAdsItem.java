package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.C4572u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.stat.scheme.SchemeStat$TypeVkBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.n9h0;
import xsna.o9h0;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeVkBridgeShowNativeAdsItem implements SchemeStat$TypeVkBridge.b {
    public final transient String a;

    @pmi0("actual_ad_format")
    private final ActualAdFormat actualAdFormat;

    @pmi0("actual_slot_id")
    private final Integer actualSlotId;

    @pmi0("ad_format")
    private final AdFormat adFormat;
    public final transient String b;

    @pmi0("banner_id")
    private final Integer bannerId;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("ad_source")
    private final FilteredString filteredAdSource;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final FilteredString filteredRequestId;

    @pmi0("has_my_target_ad")
    private final Boolean hasMyTargetAd;

    @pmi0("skipped_reasons")
    private final List<SchemeStat$AppsAdsSkippedReasonItem> skippedReasons;

    @pmi0("skipped_slots")
    private final List<Integer> skippedSlots;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class ActualAdFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActualAdFormat[] $VALUES;

        @pmi0("banner")
        public static final ActualAdFormat BANNER;

        @pmi0("interstitial")
        public static final ActualAdFormat INTERSTITIAL;

        @pmi0("mobweb_interstital")
        public static final ActualAdFormat MOBWEB_INTERSTITAL;

        @pmi0("mobweb_interstitial")
        public static final ActualAdFormat MOBWEB_INTERSTITIAL;

        @pmi0("multi_interstitial")
        public static final ActualAdFormat MULTI_INTERSTITIAL;

        @pmi0("preloader")
        public static final ActualAdFormat PRELOADER;

        @pmi0(C4572u.j)
        public static final ActualAdFormat REWARD;

        static {
            ActualAdFormat actualAdFormat = new ActualAdFormat("REWARD", 0);
            REWARD = actualAdFormat;
            ActualAdFormat actualAdFormat2 = new ActualAdFormat("INTERSTITIAL", 1);
            INTERSTITIAL = actualAdFormat2;
            ActualAdFormat actualAdFormat3 = new ActualAdFormat("MULTI_INTERSTITIAL", 2);
            MULTI_INTERSTITIAL = actualAdFormat3;
            ActualAdFormat actualAdFormat4 = new ActualAdFormat("MOBWEB_INTERSTITAL", 3);
            MOBWEB_INTERSTITAL = actualAdFormat4;
            ActualAdFormat actualAdFormat5 = new ActualAdFormat("MOBWEB_INTERSTITIAL", 4);
            MOBWEB_INTERSTITIAL = actualAdFormat5;
            ActualAdFormat actualAdFormat6 = new ActualAdFormat("PRELOADER", 5);
            PRELOADER = actualAdFormat6;
            ActualAdFormat actualAdFormat7 = new ActualAdFormat("BANNER", 6);
            BANNER = actualAdFormat7;
            ActualAdFormat[] actualAdFormatArr = {actualAdFormat, actualAdFormat2, actualAdFormat3, actualAdFormat4, actualAdFormat5, actualAdFormat6, actualAdFormat7};
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
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class AdFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdFormat[] $VALUES;

        @pmi0("banner")
        public static final AdFormat BANNER;

        @pmi0("interstitial")
        public static final AdFormat INTERSTITIAL;

        @pmi0("preloader")
        public static final AdFormat PRELOADER;

        @pmi0(C4572u.j)
        public static final AdFormat REWARD;

        static {
            AdFormat adFormat = new AdFormat("REWARD", 0);
            REWARD = adFormat;
            AdFormat adFormat2 = new AdFormat("INTERSTITIAL", 1);
            INTERSTITIAL = adFormat2;
            AdFormat adFormat3 = new AdFormat("PRELOADER", 2);
            PRELOADER = adFormat3;
            AdFormat adFormat4 = new AdFormat("BANNER", 3);
            BANNER = adFormat4;
            AdFormat[] adFormatArr = {adFormat, adFormat2, adFormat3, adFormat4};
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
    /* compiled from: SchemeStat.kt */
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

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeVkBridgeShowNativeAdsItem>, a9y<SchemeStat$TypeVkBridgeShowNativeAdsItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("ad_format");
            Object obj = null;
            AdFormat adFormat = (AdFormat) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), AdFormat.class));
            String C = fai.C(x9yVar, "ad_source");
            Boolean y = fai.y(x9yVar, "has_my_target_ad");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("skipped_slots");
            List list = (List) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(x9yVar.q("skipped_slots").k(), new n9h0().getType()));
            Integer A = fai.A(x9yVar, "actual_slot_id");
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("actual_ad_format");
            ActualAdFormat actualAdFormat = (ActualAdFormat) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(q3.k(), ActualAdFormat.class));
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("skipped_reasons");
            List list2 = (List) ((q4 == null || (q4 instanceof u9y)) ? null : a4.fromJson(x9yVar.q("skipped_reasons").k(), new o9h0().getType()));
            Gson a5 = tru.a();
            b9y q5 = x9yVar.q("event_type");
            if (q5 != null && !(q5 instanceof u9y)) {
                obj = a5.fromJson(q5.k(), (Class<Object>) EventType.class);
            }
            return new SchemeStat$TypeVkBridgeShowNativeAdsItem(adFormat, C, y, list, A, actualAdFormat, list2, (EventType) obj, fai.A(x9yVar, "banner_id"), fai.C(x9yVar, CommonUrlParts.REQUEST_ID));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeVkBridgeShowNativeAdsItem schemeStat$TypeVkBridgeShowNativeAdsItem = (SchemeStat$TypeVkBridgeShowNativeAdsItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("ad_format", tru.a().toJson(schemeStat$TypeVkBridgeShowNativeAdsItem.c()));
            x9yVar.o("ad_source", schemeStat$TypeVkBridgeShowNativeAdsItem.a);
            x9yVar.m(schemeStat$TypeVkBridgeShowNativeAdsItem.f(), "has_my_target_ad");
            x9yVar.o("skipped_slots", tru.a().toJson(schemeStat$TypeVkBridgeShowNativeAdsItem.h()));
            x9yVar.n("actual_slot_id", schemeStat$TypeVkBridgeShowNativeAdsItem.b());
            x9yVar.o("actual_ad_format", tru.a().toJson(schemeStat$TypeVkBridgeShowNativeAdsItem.a()));
            x9yVar.o("skipped_reasons", tru.a().toJson(schemeStat$TypeVkBridgeShowNativeAdsItem.g()));
            x9yVar.o("event_type", tru.a().toJson(schemeStat$TypeVkBridgeShowNativeAdsItem.e()));
            x9yVar.n("banner_id", schemeStat$TypeVkBridgeShowNativeAdsItem.d());
            x9yVar.o(CommonUrlParts.REQUEST_ID, schemeStat$TypeVkBridgeShowNativeAdsItem.b);
            return x9yVar;
        }
    }

    public SchemeStat$TypeVkBridgeShowNativeAdsItem() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final ActualAdFormat a() {
        return this.actualAdFormat;
    }

    public final Integer b() {
        return this.actualSlotId;
    }

    public final AdFormat c() {
        return this.adFormat;
    }

    public final Integer d() {
        return this.bannerId;
    }

    public final EventType e() {
        return this.eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeVkBridgeShowNativeAdsItem)) {
            return false;
        }
        SchemeStat$TypeVkBridgeShowNativeAdsItem schemeStat$TypeVkBridgeShowNativeAdsItem = (SchemeStat$TypeVkBridgeShowNativeAdsItem) obj;
        return this.adFormat == schemeStat$TypeVkBridgeShowNativeAdsItem.adFormat && epx.f(this.a, schemeStat$TypeVkBridgeShowNativeAdsItem.a) && epx.f(this.hasMyTargetAd, schemeStat$TypeVkBridgeShowNativeAdsItem.hasMyTargetAd) && epx.f(this.skippedSlots, schemeStat$TypeVkBridgeShowNativeAdsItem.skippedSlots) && epx.f(this.actualSlotId, schemeStat$TypeVkBridgeShowNativeAdsItem.actualSlotId) && this.actualAdFormat == schemeStat$TypeVkBridgeShowNativeAdsItem.actualAdFormat && epx.f(this.skippedReasons, schemeStat$TypeVkBridgeShowNativeAdsItem.skippedReasons) && this.eventType == schemeStat$TypeVkBridgeShowNativeAdsItem.eventType && epx.f(this.bannerId, schemeStat$TypeVkBridgeShowNativeAdsItem.bannerId) && epx.f(this.b, schemeStat$TypeVkBridgeShowNativeAdsItem.b);
    }

    public final Boolean f() {
        return this.hasMyTargetAd;
    }

    public final List<SchemeStat$AppsAdsSkippedReasonItem> g() {
        return this.skippedReasons;
    }

    public final List<Integer> h() {
        return this.skippedSlots;
    }

    public final int hashCode() {
        AdFormat adFormat = this.adFormat;
        int hashCode = (adFormat == null ? 0 : adFormat.hashCode()) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasMyTargetAd;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list = this.skippedSlots;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.actualSlotId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        ActualAdFormat actualAdFormat = this.actualAdFormat;
        int hashCode6 = (hashCode5 + (actualAdFormat == null ? 0 : actualAdFormat.hashCode())) * 31;
        List<SchemeStat$AppsAdsSkippedReasonItem> list2 = this.skippedReasons;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        EventType eventType = this.eventType;
        int hashCode8 = (hashCode7 + (eventType == null ? 0 : eventType.hashCode())) * 31;
        Integer num2 = this.bannerId;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.b;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVkBridgeShowNativeAdsItem(adFormat=");
        sb.append(this.adFormat);
        sb.append(", adSource=");
        sb.append(this.a);
        sb.append(", hasMyTargetAd=");
        sb.append(this.hasMyTargetAd);
        sb.append(", skippedSlots=");
        sb.append(this.skippedSlots);
        sb.append(", actualSlotId=");
        sb.append(this.actualSlotId);
        sb.append(", actualAdFormat=");
        sb.append(this.actualAdFormat);
        sb.append(", skippedReasons=");
        sb.append(this.skippedReasons);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", bannerId=");
        sb.append(this.bannerId);
        sb.append(", requestId=");
        return ho8.a(sb, this.b, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeVkBridgeShowNativeAdsItem(AdFormat adFormat, String str, Boolean bool, List<Integer> list, Integer num, ActualAdFormat actualAdFormat, List<? extends SchemeStat$AppsAdsSkippedReasonItem> list2, EventType eventType, Integer num2, String str2) {
        this.adFormat = adFormat;
        this.a = str;
        this.hasMyTargetAd = bool;
        this.skippedSlots = list;
        this.actualSlotId = num;
        this.actualAdFormat = actualAdFormat;
        this.skippedReasons = list2;
        this.eventType = eventType;
        this.bannerId = num2;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredAdSource = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(36));
        this.filteredRequestId = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public /* synthetic */ SchemeStat$TypeVkBridgeShowNativeAdsItem(AdFormat adFormat, String str, Boolean bool, List list, Integer num, ActualAdFormat actualAdFormat, List list2, EventType eventType, Integer num2, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : adFormat, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : actualAdFormat, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : eventType, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : str2);
    }
}
