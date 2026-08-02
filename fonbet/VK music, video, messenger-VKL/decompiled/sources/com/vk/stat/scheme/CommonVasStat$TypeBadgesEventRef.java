package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonVasStat.kt */
/* loaded from: classes5.dex */
public final class CommonVasStat$TypeBadgesEventRef {

    @pmi0("event_name")
    private final EventName eventName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVasStat.kt */
    public static final class EventName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventName[] $VALUES;

        @pmi0("collection_block")
        public static final EventName COLLECTION_BLOCK;

        @pmi0("collecton_all")
        public static final EventName COLLECTON_ALL;

        @pmi0("comment_img")
        public static final EventName COMMENT_IMG;

        @pmi0("comment_link")
        public static final EventName COMMENT_LINK;

        @pmi0("notification")
        public static final EventName NOTIFICATION;

        @pmi0("pin")
        public static final EventName PIN;

        @pmi0("post_btn")
        public static final EventName POST_BTN;

        @pmi0("profile_details")
        public static final EventName PROFILE_DETAILS;

        @pmi0("push")
        public static final EventName PUSH;

        @pmi0("sender_list")
        public static final EventName SENDER_LIST;

        @pmi0("tab")
        public static final EventName TAB;

        static {
            EventName eventName = new EventName("SENDER_LIST", 0);
            SENDER_LIST = eventName;
            EventName eventName2 = new EventName("TAB", 1);
            TAB = eventName2;
            EventName eventName3 = new EventName("NOTIFICATION", 2);
            NOTIFICATION = eventName3;
            EventName eventName4 = new EventName("PUSH", 3);
            PUSH = eventName4;
            EventName eventName5 = new EventName("PIN", 4);
            PIN = eventName5;
            EventName eventName6 = new EventName("COMMENT_IMG", 5);
            COMMENT_IMG = eventName6;
            EventName eventName7 = new EventName("COMMENT_LINK", 6);
            COMMENT_LINK = eventName7;
            EventName eventName8 = new EventName("PROFILE_DETAILS", 7);
            PROFILE_DETAILS = eventName8;
            EventName eventName9 = new EventName("COLLECTION_BLOCK", 8);
            COLLECTION_BLOCK = eventName9;
            EventName eventName10 = new EventName("COLLECTON_ALL", 9);
            COLLECTON_ALL = eventName10;
            EventName eventName11 = new EventName("POST_BTN", 10);
            POST_BTN = eventName11;
            EventName[] eventNameArr = {eventName, eventName2, eventName3, eventName4, eventName5, eventName6, eventName7, eventName8, eventName9, eventName10, eventName11};
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

    public CommonVasStat$TypeBadgesEventRef(EventName eventName) {
        this.eventName = eventName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonVasStat$TypeBadgesEventRef) && this.eventName == ((CommonVasStat$TypeBadgesEventRef) obj).eventName;
    }

    public final int hashCode() {
        return this.eventName.hashCode();
    }

    public final String toString() {
        return "TypeBadgesEventRef(eventName=" + this.eventName + ')';
    }
}
