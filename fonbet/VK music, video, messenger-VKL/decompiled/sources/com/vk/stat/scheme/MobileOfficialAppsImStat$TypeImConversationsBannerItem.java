package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.iq;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsImStat$TypeImConversationsBannerItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("banner_name")
    private final FilteredString filteredBannerName;

    @pmi0("user2_id")
    private final Long user2Id;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click")
        public static final EventType CLICK;

        @pmi0("click_advertiser")
        public static final EventType CLICK_ADVERTISER;

        @pmi0("click_copy_erid")
        public static final EventType CLICK_COPY_ERID;

        @pmi0("click_gifts_action_button")
        public static final EventType CLICK_GIFTS_ACTION_BUTTON;

        @pmi0("click_gifts_for_all")
        public static final EventType CLICK_GIFTS_FOR_ALL;

        @pmi0("click_gifts_shop")
        public static final EventType CLICK_GIFTS_SHOP;

        @pmi0("click_modal")
        public static final EventType CLICK_MODAL;

        @pmi0("click_more")
        public static final EventType CLICK_MORE;

        @pmi0("click_profile")
        public static final EventType CLICK_PROFILE;

        @pmi0("hide")
        public static final EventType HIDE;

        @pmi0("hide_by_view_count")
        public static final EventType HIDE_BY_VIEW_COUNT;

        static {
            EventType eventType = new EventType("CLICK", 0);
            CLICK = eventType;
            EventType eventType2 = new EventType("CLICK_PROFILE", 1);
            CLICK_PROFILE = eventType2;
            EventType eventType3 = new EventType("CLICK_GIFTS_SHOP", 2);
            CLICK_GIFTS_SHOP = eventType3;
            EventType eventType4 = new EventType("CLICK_GIFTS_ACTION_BUTTON", 3);
            CLICK_GIFTS_ACTION_BUTTON = eventType4;
            EventType eventType5 = new EventType("CLICK_MODAL", 4);
            CLICK_MODAL = eventType5;
            EventType eventType6 = new EventType("CLICK_GIFTS_FOR_ALL", 5);
            CLICK_GIFTS_FOR_ALL = eventType6;
            EventType eventType7 = new EventType("HIDE", 6);
            HIDE = eventType7;
            EventType eventType8 = new EventType("CLICK_MORE", 7);
            CLICK_MORE = eventType8;
            EventType eventType9 = new EventType("CLICK_ADVERTISER", 8);
            CLICK_ADVERTISER = eventType9;
            EventType eventType10 = new EventType("CLICK_COPY_ERID", 9);
            CLICK_COPY_ERID = eventType10;
            EventType eventType11 = new EventType("HIDE_BY_VIEW_COUNT", 10);
            HIDE_BY_VIEW_COUNT = eventType11;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11};
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

    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsImStat$TypeImConversationsBannerItem>, a9y<MobileOfficialAppsImStat$TypeImConversationsBannerItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsImStat$TypeImConversationsBannerItem(fai.s(x9yVar, "banner_name"), (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class), fai.B(x9yVar, "user2_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsImStat$TypeImConversationsBannerItem mobileOfficialAppsImStat$TypeImConversationsBannerItem = (MobileOfficialAppsImStat$TypeImConversationsBannerItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("banner_name", mobileOfficialAppsImStat$TypeImConversationsBannerItem.a);
            x9yVar.o("event_type", tru.a().toJson(mobileOfficialAppsImStat$TypeImConversationsBannerItem.a()));
            x9yVar.n("user2_id", mobileOfficialAppsImStat$TypeImConversationsBannerItem.b());
            return x9yVar;
        }
    }

    public MobileOfficialAppsImStat$TypeImConversationsBannerItem(String str, EventType eventType, Long l) {
        this.a = str;
        this.eventType = eventType;
        this.user2Id = l;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredBannerName = filteredString;
        filteredString.a(str);
    }

    public final EventType a() {
        return this.eventType;
    }

    public final Long b() {
        return this.user2Id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImConversationsBannerItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImConversationsBannerItem mobileOfficialAppsImStat$TypeImConversationsBannerItem = (MobileOfficialAppsImStat$TypeImConversationsBannerItem) obj;
        return epx.f(this.a, mobileOfficialAppsImStat$TypeImConversationsBannerItem.a) && this.eventType == mobileOfficialAppsImStat$TypeImConversationsBannerItem.eventType && epx.f(this.user2Id, mobileOfficialAppsImStat$TypeImConversationsBannerItem.user2Id);
    }

    public final int hashCode() {
        int hashCode = (this.eventType.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.user2Id;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeImConversationsBannerItem(bannerName=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", user2Id=");
        return iq.b(sb, this.user2Id, ')');
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImConversationsBannerItem(String str, EventType eventType, Long l, int i, zcl zclVar) {
        this(str, eventType, (i & 4) != 0 ? null : l);
    }
}
