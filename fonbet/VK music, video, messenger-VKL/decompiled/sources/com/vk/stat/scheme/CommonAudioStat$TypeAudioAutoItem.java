package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioAutoItem implements SchemeStat$TypeAction.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("audio_auto_off")
        public static final EventSubtype AUDIO_AUTO_OFF;

        @pmi0("audio_auto_on")
        public static final EventSubtype AUDIO_AUTO_ON;

        static {
            EventSubtype eventSubtype = new EventSubtype("AUDIO_AUTO_ON", 0);
            AUDIO_AUTO_ON = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("AUDIO_AUTO_OFF", 1);
            AUDIO_AUTO_OFF = eventSubtype2;
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
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("carplay")
        public static final EventType CARPLAY;

        static {
            EventType eventType = new EventType("CARPLAY", 0);
            CARPLAY = eventType;
            EventType[] eventTypeArr = {eventType};
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

    public CommonAudioStat$TypeAudioAutoItem(EventType eventType, EventSubtype eventSubtype) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioAutoItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioAutoItem commonAudioStat$TypeAudioAutoItem = (CommonAudioStat$TypeAudioAutoItem) obj;
        return this.eventType == commonAudioStat$TypeAudioAutoItem.eventType && this.eventSubtype == commonAudioStat$TypeAudioAutoItem.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "TypeAudioAutoItem(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioAutoItem(EventType eventType, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSubtype);
    }
}
