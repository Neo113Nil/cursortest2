package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonVasStat.kt */
/* loaded from: classes5.dex */
public final class CommonVasStat$TypeBadgesEvent {

    @pmi0("event_name")
    private final EventName eventName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVasStat.kt */
    public static final class EventName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventName[] $VALUES;

        @pmi0("click_choose_donut_amount")
        public static final EventName CLICK_CHOOSE_DONUT_AMOUNT;

        @pmi0("click_send_badge")
        public static final EventName CLICK_SEND_BADGE;

        @pmi0("click_unlock_instructions_cta")
        public static final EventName CLICK_UNLOCK_INSTRUCTIONS_CTA;

        @pmi0("hide_badges_collection__c")
        public static final EventName HIDE_BADGES_COLLECTION__C;

        @pmi0("open_badge")
        public static final EventName OPEN_BADGE;

        @pmi0("open_badges_all")
        public static final EventName OPEN_BADGES_ALL;

        @pmi0("open_badges_catalog")
        public static final EventName OPEN_BADGES_CATALOG;

        @pmi0("open_badges_catalog_tab")
        public static final EventName OPEN_BADGES_CATALOG_TAB;

        @pmi0("open_badges_collection_all__c")
        public static final EventName OPEN_BADGES_COLLECTION_ALL__C;

        @pmi0("open_badges_collection_all__u")
        public static final EventName OPEN_BADGES_COLLECTION_ALL__U;

        @pmi0("open_badges_collection_badge__c")
        public static final EventName OPEN_BADGES_COLLECTION_BADGE__C;

        @pmi0("open_badges_collection_badge__u")
        public static final EventName OPEN_BADGES_COLLECTION_BADGE__U;

        @pmi0("open_badges_friends")
        public static final EventName OPEN_BADGES_FRIENDS;

        @pmi0("open_donut_block")
        public static final EventName OPEN_DONUT_BLOCK;

        @pmi0("open_sender")
        public static final EventName OPEN_SENDER;

        @pmi0("privacy_badges_collection__all")
        public static final EventName PRIVACY_BADGES_COLLECTION__ALL;

        @pmi0("privacy_badges_collection__f")
        public static final EventName PRIVACY_BADGES_COLLECTION__F;

        @pmi0("privacy_badges_collection__ff")
        public static final EventName PRIVACY_BADGES_COLLECTION__FF;

        @pmi0("privacy_badges_collection__pf")
        public static final EventName PRIVACY_BADGES_COLLECTION__PF;

        @pmi0("privacy_badges_collection__self")
        public static final EventName PRIVACY_BADGES_COLLECTION__SELF;

        @pmi0("shop_select_badge")
        public static final EventName SHOP_SELECT_BADGE;

        @pmi0("show_donut_block")
        public static final EventName SHOW_DONUT_BLOCK;

        @pmi0("show_unlock_instructions")
        public static final EventName SHOW_UNLOCK_INSTRUCTIONS;

        @pmi0("unhide_owner_received_badges__c")
        public static final EventName UNHIDE_OWNER_RECEIVED_BADGES__C;

        static {
            EventName eventName = new EventName("OPEN_BADGES_ALL", 0);
            OPEN_BADGES_ALL = eventName;
            EventName eventName2 = new EventName("OPEN_BADGES_FRIENDS", 1);
            OPEN_BADGES_FRIENDS = eventName2;
            EventName eventName3 = new EventName("OPEN_SENDER", 2);
            OPEN_SENDER = eventName3;
            EventName eventName4 = new EventName("OPEN_BADGE", 3);
            OPEN_BADGE = eventName4;
            EventName eventName5 = new EventName("OPEN_BADGES_COLLECTION_ALL__U", 4);
            OPEN_BADGES_COLLECTION_ALL__U = eventName5;
            EventName eventName6 = new EventName("OPEN_BADGES_COLLECTION_BADGE__U", 5);
            OPEN_BADGES_COLLECTION_BADGE__U = eventName6;
            EventName eventName7 = new EventName("OPEN_BADGES_COLLECTION_ALL__C", 6);
            OPEN_BADGES_COLLECTION_ALL__C = eventName7;
            EventName eventName8 = new EventName("OPEN_BADGES_COLLECTION_BADGE__C", 7);
            OPEN_BADGES_COLLECTION_BADGE__C = eventName8;
            EventName eventName9 = new EventName("OPEN_BADGES_CATALOG", 8);
            OPEN_BADGES_CATALOG = eventName9;
            EventName eventName10 = new EventName("OPEN_BADGES_CATALOG_TAB", 9);
            OPEN_BADGES_CATALOG_TAB = eventName10;
            EventName eventName11 = new EventName("SHOW_DONUT_BLOCK", 10);
            SHOW_DONUT_BLOCK = eventName11;
            EventName eventName12 = new EventName("OPEN_DONUT_BLOCK", 11);
            OPEN_DONUT_BLOCK = eventName12;
            EventName eventName13 = new EventName("CLICK_CHOOSE_DONUT_AMOUNT", 12);
            CLICK_CHOOSE_DONUT_AMOUNT = eventName13;
            EventName eventName14 = new EventName("SHOP_SELECT_BADGE", 13);
            SHOP_SELECT_BADGE = eventName14;
            EventName eventName15 = new EventName("CLICK_SEND_BADGE", 14);
            CLICK_SEND_BADGE = eventName15;
            EventName eventName16 = new EventName("SHOW_UNLOCK_INSTRUCTIONS", 15);
            SHOW_UNLOCK_INSTRUCTIONS = eventName16;
            EventName eventName17 = new EventName("CLICK_UNLOCK_INSTRUCTIONS_CTA", 16);
            CLICK_UNLOCK_INSTRUCTIONS_CTA = eventName17;
            EventName eventName18 = new EventName("PRIVACY_BADGES_COLLECTION__ALL", 17);
            PRIVACY_BADGES_COLLECTION__ALL = eventName18;
            EventName eventName19 = new EventName("PRIVACY_BADGES_COLLECTION__F", 18);
            PRIVACY_BADGES_COLLECTION__F = eventName19;
            EventName eventName20 = new EventName("PRIVACY_BADGES_COLLECTION__FF", 19);
            PRIVACY_BADGES_COLLECTION__FF = eventName20;
            EventName eventName21 = new EventName("PRIVACY_BADGES_COLLECTION__PF", 20);
            PRIVACY_BADGES_COLLECTION__PF = eventName21;
            EventName eventName22 = new EventName("PRIVACY_BADGES_COLLECTION__SELF", 21);
            PRIVACY_BADGES_COLLECTION__SELF = eventName22;
            EventName eventName23 = new EventName("HIDE_BADGES_COLLECTION__C", 22);
            HIDE_BADGES_COLLECTION__C = eventName23;
            EventName eventName24 = new EventName("UNHIDE_OWNER_RECEIVED_BADGES__C", 23);
            UNHIDE_OWNER_RECEIVED_BADGES__C = eventName24;
            EventName[] eventNameArr = {eventName, eventName2, eventName3, eventName4, eventName5, eventName6, eventName7, eventName8, eventName9, eventName10, eventName11, eventName12, eventName13, eventName14, eventName15, eventName16, eventName17, eventName18, eventName19, eventName20, eventName21, eventName22, eventName23, eventName24};
            $VALUES = eventNameArr;
            $ENTRIES = new asp(eventNameArr);
        }

        private EventName(String str, int i) {
        }

        public static EventName valueOf(String str) {
            return (EventName) Enum.valueOf(EventName.class, str);
        }

        public static EventName[] values() {
            return (EventName[]) $VALUES.clone();
        }
    }

    public CommonVasStat$TypeBadgesEvent(EventName eventName) {
        this.eventName = eventName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonVasStat$TypeBadgesEvent) && this.eventName == ((CommonVasStat$TypeBadgesEvent) obj).eventName;
    }

    public final int hashCode() {
        return this.eventName.hashCode();
    }

    public final String toString() {
        return "TypeBadgesEvent(eventName=" + this.eventName + ')';
    }
}
