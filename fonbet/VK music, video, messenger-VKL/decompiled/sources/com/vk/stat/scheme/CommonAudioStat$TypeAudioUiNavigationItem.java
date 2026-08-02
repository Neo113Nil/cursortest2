package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioUiNavigationItem implements SchemeStat$TypeNavgo.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("tap_goto")
        public static final EventType TAP_GOTO;

        @pmi0("tap_goto_toolbar")
        public static final EventType TAP_GOTO_TOOLBAR;

        static {
            EventType eventType = new EventType("TAP_GOTO", 0);
            TAP_GOTO = eventType;
            EventType eventType2 = new EventType("TAP_GOTO_TOOLBAR", 1);
            TAP_GOTO_TOOLBAR = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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

    public CommonAudioStat$TypeAudioUiNavigationItem(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonAudioStat$TypeAudioUiNavigationItem) && this.eventType == ((CommonAudioStat$TypeAudioUiNavigationItem) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeAudioUiNavigationItem(eventType=" + this.eventType + ')';
    }
}
