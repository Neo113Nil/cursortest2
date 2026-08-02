package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeDonutClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("level_id")
    private final Long levelId;

    @pmi0("subscription_source")
    private final CommonCommunitiesStat$TypeSubscriptionSource subscriptionSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_donut_banner_goal")
        public static final EventType CLICK_DONUT_BANNER_GOAL;

        @pmi0("click_donut_banner_subscribe")
        public static final EventType CLICK_DONUT_BANNER_SUBSCRIBE;

        @pmi0("click_donut_faq")
        public static final EventType CLICK_DONUT_FAQ;

        @pmi0("click_donut_level_setting")
        public static final EventType CLICK_DONUT_LEVEL_SETTING;

        @pmi0("click_donut_privacy_settings")
        public static final EventType CLICK_DONUT_PRIVACY_SETTINGS;

        @pmi0("click_open_more")
        public static final EventType CLICK_OPEN_MORE;

        @pmi0("click_payment_method_settings")
        public static final EventType CLICK_PAYMENT_METHOD_SETTINGS;

        @pmi0("click_period_settings")
        public static final EventType CLICK_PERIOD_SETTINGS;

        @pmi0("click_select_level")
        public static final EventType CLICK_SELECT_LEVEL;

        @pmi0("click_select_period")
        public static final EventType CLICK_SELECT_PERIOD;

        static {
            EventType eventType = new EventType("CLICK_PERIOD_SETTINGS", 0);
            CLICK_PERIOD_SETTINGS = eventType;
            EventType eventType2 = new EventType("CLICK_DONUT_LEVEL_SETTING", 1);
            CLICK_DONUT_LEVEL_SETTING = eventType2;
            EventType eventType3 = new EventType("CLICK_PAYMENT_METHOD_SETTINGS", 2);
            CLICK_PAYMENT_METHOD_SETTINGS = eventType3;
            EventType eventType4 = new EventType("CLICK_DONUT_PRIVACY_SETTINGS", 3);
            CLICK_DONUT_PRIVACY_SETTINGS = eventType4;
            EventType eventType5 = new EventType("CLICK_SELECT_LEVEL", 4);
            CLICK_SELECT_LEVEL = eventType5;
            EventType eventType6 = new EventType("CLICK_SELECT_PERIOD", 5);
            CLICK_SELECT_PERIOD = eventType6;
            EventType eventType7 = new EventType("CLICK_OPEN_MORE", 6);
            CLICK_OPEN_MORE = eventType7;
            EventType eventType8 = new EventType("CLICK_DONUT_BANNER_GOAL", 7);
            CLICK_DONUT_BANNER_GOAL = eventType8;
            EventType eventType9 = new EventType("CLICK_DONUT_BANNER_SUBSCRIBE", 8);
            CLICK_DONUT_BANNER_SUBSCRIBE = eventType9;
            EventType eventType10 = new EventType("CLICK_DONUT_FAQ", 9);
            CLICK_DONUT_FAQ = eventType10;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10};
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

    public CommonCommunitiesStat$TypeDonutClick(EventType eventType, Long l, CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource) {
        this.eventType = eventType;
        this.levelId = l;
        this.subscriptionSource = commonCommunitiesStat$TypeSubscriptionSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeDonutClick)) {
            return false;
        }
        CommonCommunitiesStat$TypeDonutClick commonCommunitiesStat$TypeDonutClick = (CommonCommunitiesStat$TypeDonutClick) obj;
        return this.eventType == commonCommunitiesStat$TypeDonutClick.eventType && epx.f(this.levelId, commonCommunitiesStat$TypeDonutClick.levelId) && this.subscriptionSource == commonCommunitiesStat$TypeDonutClick.subscriptionSource;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Long l = this.levelId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource = this.subscriptionSource;
        return hashCode2 + (commonCommunitiesStat$TypeSubscriptionSource != null ? commonCommunitiesStat$TypeSubscriptionSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeDonutClick(eventType=" + this.eventType + ", levelId=" + this.levelId + ", subscriptionSource=" + this.subscriptionSource + ')';
    }

    public /* synthetic */ CommonCommunitiesStat$TypeDonutClick(EventType eventType, Long l, CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : commonCommunitiesStat$TypeSubscriptionSource);
    }
}
