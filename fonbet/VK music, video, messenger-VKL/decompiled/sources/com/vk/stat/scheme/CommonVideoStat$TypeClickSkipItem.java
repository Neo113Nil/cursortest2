package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeClickSkipItem implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("auto")
        public static final EventSubtype AUTO;

        @pmi0("click")
        public static final EventSubtype CLICK;

        static {
            EventSubtype eventSubtype = new EventSubtype("CLICK", 0);
            CLICK = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("AUTO", 1);
            AUTO = eventSubtype2;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("skip_credits_button_tap")
        public static final EventType SKIP_CREDITS_BUTTON_TAP;

        @pmi0("skip_intro_button_tap")
        public static final EventType SKIP_INTRO_BUTTON_TAP;

        @pmi0("watch_credits_button_tap")
        public static final EventType WATCH_CREDITS_BUTTON_TAP;

        @pmi0("watch_intro_button_tap")
        public static final EventType WATCH_INTRO_BUTTON_TAP;

        static {
            EventType eventType = new EventType("SKIP_INTRO_BUTTON_TAP", 0);
            SKIP_INTRO_BUTTON_TAP = eventType;
            EventType eventType2 = new EventType("SKIP_CREDITS_BUTTON_TAP", 1);
            SKIP_CREDITS_BUTTON_TAP = eventType2;
            EventType eventType3 = new EventType("WATCH_INTRO_BUTTON_TAP", 2);
            WATCH_INTRO_BUTTON_TAP = eventType3;
            EventType eventType4 = new EventType("WATCH_CREDITS_BUTTON_TAP", 3);
            WATCH_CREDITS_BUTTON_TAP = eventType4;
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

    public CommonVideoStat$TypeClickSkipItem(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeClickSkipItem)) {
            return false;
        }
        CommonVideoStat$TypeClickSkipItem commonVideoStat$TypeClickSkipItem = (CommonVideoStat$TypeClickSkipItem) obj;
        return this.eventType == commonVideoStat$TypeClickSkipItem.eventType && this.eventSubtype == commonVideoStat$TypeClickSkipItem.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeClickSkipItem(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ CommonVideoStat$TypeClickSkipItem(EventType eventType, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSubtype);
    }
}
