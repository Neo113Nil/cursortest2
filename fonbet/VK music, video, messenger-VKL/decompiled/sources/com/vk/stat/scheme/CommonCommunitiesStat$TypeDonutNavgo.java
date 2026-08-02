package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeDonutNavgo implements SchemeStat$TypeNavgo.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("goal_id")
    private final Integer goalId;

    @pmi0("subscription_source")
    private final CommonCommunitiesStat$TypeSubscriptionSource subscriptionSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("open_connect_vk_pay")
        public static final EventType OPEN_CONNECT_VK_PAY;

        @pmi0("open_create_level")
        public static final EventType OPEN_CREATE_LEVEL;

        @pmi0("open_donation_creation")
        public static final EventType OPEN_DONATION_CREATION;

        @pmi0("open_donation_creation_onboarding")
        public static final EventType OPEN_DONATION_CREATION_ONBOARDING;

        @pmi0("open_donut_payment")
        public static final EventType OPEN_DONUT_PAYMENT;

        @pmi0("open_donut_subscription_recovery")
        public static final EventType OPEN_DONUT_SUBSCRIPTION_RECOVERY;

        @pmi0("open_donut_subscription_settings")
        public static final EventType OPEN_DONUT_SUBSCRIPTION_SETTINGS;

        @pmi0("open_donut_tabbar")
        public static final EventType OPEN_DONUT_TABBAR;

        @pmi0("open_entering_bank_detail")
        public static final EventType OPEN_ENTERING_BANK_DETAIL;

        @pmi0("open_select_payment_method")
        public static final EventType OPEN_SELECT_PAYMENT_METHOD;

        @pmi0("open_select_payment_period")
        public static final EventType OPEN_SELECT_PAYMENT_PERIOD;

        @pmi0("open_unsubscribe_popup_change_level")
        public static final EventType OPEN_UNSUBSCRIBE_POPUP_CHANGE_LEVEL;

        @pmi0("open_unsubscribe_popup_change_price")
        public static final EventType OPEN_UNSUBSCRIBE_POPUP_CHANGE_PRICE;

        @pmi0("open_way_to_get_money")
        public static final EventType OPEN_WAY_TO_GET_MONEY;

        static {
            EventType eventType = new EventType("OPEN_DONUT_SUBSCRIPTION_SETTINGS", 0);
            OPEN_DONUT_SUBSCRIPTION_SETTINGS = eventType;
            EventType eventType2 = new EventType("OPEN_DONUT_PAYMENT", 1);
            OPEN_DONUT_PAYMENT = eventType2;
            EventType eventType3 = new EventType("OPEN_DONUT_TABBAR", 2);
            OPEN_DONUT_TABBAR = eventType3;
            EventType eventType4 = new EventType("OPEN_SELECT_PAYMENT_PERIOD", 3);
            OPEN_SELECT_PAYMENT_PERIOD = eventType4;
            EventType eventType5 = new EventType("OPEN_SELECT_PAYMENT_METHOD", 4);
            OPEN_SELECT_PAYMENT_METHOD = eventType5;
            EventType eventType6 = new EventType("OPEN_DONUT_SUBSCRIPTION_RECOVERY", 5);
            OPEN_DONUT_SUBSCRIPTION_RECOVERY = eventType6;
            EventType eventType7 = new EventType("OPEN_UNSUBSCRIBE_POPUP_CHANGE_PRICE", 6);
            OPEN_UNSUBSCRIBE_POPUP_CHANGE_PRICE = eventType7;
            EventType eventType8 = new EventType("OPEN_UNSUBSCRIBE_POPUP_CHANGE_LEVEL", 7);
            OPEN_UNSUBSCRIBE_POPUP_CHANGE_LEVEL = eventType8;
            EventType eventType9 = new EventType("OPEN_DONATION_CREATION_ONBOARDING", 8);
            OPEN_DONATION_CREATION_ONBOARDING = eventType9;
            EventType eventType10 = new EventType("OPEN_DONATION_CREATION", 9);
            OPEN_DONATION_CREATION = eventType10;
            EventType eventType11 = new EventType("OPEN_CREATE_LEVEL", 10);
            OPEN_CREATE_LEVEL = eventType11;
            EventType eventType12 = new EventType("OPEN_WAY_TO_GET_MONEY", 11);
            OPEN_WAY_TO_GET_MONEY = eventType12;
            EventType eventType13 = new EventType("OPEN_ENTERING_BANK_DETAIL", 12);
            OPEN_ENTERING_BANK_DETAIL = eventType13;
            EventType eventType14 = new EventType("OPEN_CONNECT_VK_PAY", 13);
            OPEN_CONNECT_VK_PAY = eventType14;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14};
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

    public CommonCommunitiesStat$TypeDonutNavgo(EventType eventType, Integer num, CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource) {
        this.eventType = eventType;
        this.goalId = num;
        this.subscriptionSource = commonCommunitiesStat$TypeSubscriptionSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeDonutNavgo)) {
            return false;
        }
        CommonCommunitiesStat$TypeDonutNavgo commonCommunitiesStat$TypeDonutNavgo = (CommonCommunitiesStat$TypeDonutNavgo) obj;
        return this.eventType == commonCommunitiesStat$TypeDonutNavgo.eventType && epx.f(this.goalId, commonCommunitiesStat$TypeDonutNavgo.goalId) && this.subscriptionSource == commonCommunitiesStat$TypeDonutNavgo.subscriptionSource;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Integer num = this.goalId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource = this.subscriptionSource;
        return hashCode2 + (commonCommunitiesStat$TypeSubscriptionSource != null ? commonCommunitiesStat$TypeSubscriptionSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeDonutNavgo(eventType=" + this.eventType + ", goalId=" + this.goalId + ", subscriptionSource=" + this.subscriptionSource + ')';
    }

    public /* synthetic */ CommonCommunitiesStat$TypeDonutNavgo(EventType eventType, Integer num, CommonCommunitiesStat$TypeSubscriptionSource commonCommunitiesStat$TypeSubscriptionSource, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : commonCommunitiesStat$TypeSubscriptionSource);
    }
}
