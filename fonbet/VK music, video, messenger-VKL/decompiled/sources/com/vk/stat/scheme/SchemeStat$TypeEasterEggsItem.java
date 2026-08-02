package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeEasterEggsItem implements SchemeStat$TypeAction.b {

    @pmi0("egg_event_id")
    private final int eggEventId;

    @pmi0("egg_id")
    private final int eggId;

    @pmi0("egg_position_id")
    private final int eggPositionId;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("egg_show")
        public static final EventType EGG_SHOW;

        @pmi0("popup_action")
        public static final EventType POPUP_ACTION;

        @pmi0("popup_show")
        public static final EventType POPUP_SHOW;

        static {
            EventType eventType = new EventType("EGG_SHOW", 0);
            EGG_SHOW = eventType;
            EventType eventType2 = new EventType("POPUP_SHOW", 1);
            POPUP_SHOW = eventType2;
            EventType eventType3 = new EventType("POPUP_ACTION", 2);
            POPUP_ACTION = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public SchemeStat$TypeEasterEggsItem(int i, int i2, int i3, EventType eventType) {
        this.eggId = i;
        this.eggEventId = i2;
        this.eggPositionId = i3;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeEasterEggsItem)) {
            return false;
        }
        SchemeStat$TypeEasterEggsItem schemeStat$TypeEasterEggsItem = (SchemeStat$TypeEasterEggsItem) obj;
        return this.eggId == schemeStat$TypeEasterEggsItem.eggId && this.eggEventId == schemeStat$TypeEasterEggsItem.eggEventId && this.eggPositionId == schemeStat$TypeEasterEggsItem.eggPositionId && this.eventType == schemeStat$TypeEasterEggsItem.eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode() + shy.a(this.eggPositionId, shy.a(this.eggEventId, Integer.hashCode(this.eggId) * 31, 31), 31);
    }

    public final String toString() {
        return "TypeEasterEggsItem(eggId=" + this.eggId + ", eggEventId=" + this.eggEventId + ", eggPositionId=" + this.eggPositionId + ", eventType=" + this.eventType + ')';
    }
}
