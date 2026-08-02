package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsVideoStat$TypeAdsBottomBanner implements SchemeStat$TypeView.b {
    public final transient String a;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_info")
    private final FilteredString filteredEventInfo;

    @pmi0("object_id")
    private final Long objectId;

    @pmi0("video_id")
    private final Long videoId;

    @pmi0("video_owner_id")
    private final Long videoOwnerId;

    @pmi0("vsid")
    private final CommonVideoStat$TypeVsidItem vsid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("complaint")
        public static final EventSubtype COMPLAINT;

        @pmi0("error")
        public static final EventSubtype ERROR;

        @pmi0("hide")
        public static final EventSubtype HIDE;

        @pmi0("request")
        public static final EventSubtype REQUEST;

        @pmi0("response")
        public static final EventSubtype RESPONSE;

        @pmi0("show")
        public static final EventSubtype SHOW;

        static {
            EventSubtype eventSubtype = new EventSubtype("SHOW", 0);
            SHOW = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("RESPONSE", 1);
            RESPONSE = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("REQUEST", 2);
            REQUEST = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("HIDE", 3);
            HIDE = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("ERROR", 4);
            ERROR = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("COMPLAINT", 5);
            COMPLAINT = eventSubtype6;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsVideoStat$TypeAdsBottomBanner>, a9y<MobileOfficialAppsVideoStat$TypeAdsBottomBanner> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventSubtype eventSubtype = (EventSubtype) dq.f(x9yVar, "event_subtype", tru.a(), EventSubtype.class);
            String C = fai.C(x9yVar, "event_info");
            Long B = fai.B(x9yVar, "object_id");
            Long B2 = fai.B(x9yVar, "video_owner_id");
            Long B3 = fai.B(x9yVar, "video_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("vsid");
            return new MobileOfficialAppsVideoStat$TypeAdsBottomBanner(eventSubtype, C, B, B2, B3, (CommonVideoStat$TypeVsidItem) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonVideoStat$TypeVsidItem.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsVideoStat$TypeAdsBottomBanner mobileOfficialAppsVideoStat$TypeAdsBottomBanner = (MobileOfficialAppsVideoStat$TypeAdsBottomBanner) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_subtype", tru.a().toJson(mobileOfficialAppsVideoStat$TypeAdsBottomBanner.a()));
            x9yVar.o("event_info", mobileOfficialAppsVideoStat$TypeAdsBottomBanner.a);
            x9yVar.n("object_id", mobileOfficialAppsVideoStat$TypeAdsBottomBanner.b());
            x9yVar.n("video_owner_id", mobileOfficialAppsVideoStat$TypeAdsBottomBanner.d());
            x9yVar.n("video_id", mobileOfficialAppsVideoStat$TypeAdsBottomBanner.c());
            x9yVar.o("vsid", tru.a().toJson(mobileOfficialAppsVideoStat$TypeAdsBottomBanner.e()));
            return x9yVar;
        }
    }

    public MobileOfficialAppsVideoStat$TypeAdsBottomBanner(EventSubtype eventSubtype, String str, Long l, Long l2, Long l3, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem) {
        this.eventSubtype = eventSubtype;
        this.a = str;
        this.objectId = l;
        this.videoOwnerId = l2;
        this.videoId = l3;
        this.vsid = commonVideoStat$TypeVsidItem;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredEventInfo = filteredString;
        filteredString.a(str);
    }

    public final EventSubtype a() {
        return this.eventSubtype;
    }

    public final Long b() {
        return this.objectId;
    }

    public final Long c() {
        return this.videoId;
    }

    public final Long d() {
        return this.videoOwnerId;
    }

    public final CommonVideoStat$TypeVsidItem e() {
        return this.vsid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeAdsBottomBanner)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeAdsBottomBanner mobileOfficialAppsVideoStat$TypeAdsBottomBanner = (MobileOfficialAppsVideoStat$TypeAdsBottomBanner) obj;
        return this.eventSubtype == mobileOfficialAppsVideoStat$TypeAdsBottomBanner.eventSubtype && epx.f(this.a, mobileOfficialAppsVideoStat$TypeAdsBottomBanner.a) && epx.f(this.objectId, mobileOfficialAppsVideoStat$TypeAdsBottomBanner.objectId) && epx.f(this.videoOwnerId, mobileOfficialAppsVideoStat$TypeAdsBottomBanner.videoOwnerId) && epx.f(this.videoId, mobileOfficialAppsVideoStat$TypeAdsBottomBanner.videoId) && epx.f(this.vsid, mobileOfficialAppsVideoStat$TypeAdsBottomBanner.vsid);
    }

    public final int hashCode() {
        int hashCode = this.eventSubtype.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.objectId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.videoOwnerId;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.videoId;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem = this.vsid;
        return hashCode5 + (commonVideoStat$TypeVsidItem != null ? commonVideoStat$TypeVsidItem.a.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAdsBottomBanner(eventSubtype=" + this.eventSubtype + ", eventInfo=" + this.a + ", objectId=" + this.objectId + ", videoOwnerId=" + this.videoOwnerId + ", videoId=" + this.videoId + ", vsid=" + this.vsid + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeAdsBottomBanner(EventSubtype eventSubtype, String str, Long l, Long l2, Long l3, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, int i, zcl zclVar) {
        this(eventSubtype, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : commonVideoStat$TypeVsidItem);
    }
}
