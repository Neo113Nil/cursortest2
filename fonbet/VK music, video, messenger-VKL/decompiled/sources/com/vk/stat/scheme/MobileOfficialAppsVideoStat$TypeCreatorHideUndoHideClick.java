package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("hide_creator_from_subscriptions")
        public static final EventType HIDE_CREATOR_FROM_SUBSCRIPTIONS;

        @pmi0("undo_hide_creator_from_subscriptions")
        public static final EventType UNDO_HIDE_CREATOR_FROM_SUBSCRIPTIONS;

        static {
            EventType eventType = new EventType("HIDE_CREATOR_FROM_SUBSCRIPTIONS", 0);
            HIDE_CREATOR_FROM_SUBSCRIPTIONS = eventType;
            EventType eventType2 = new EventType("UNDO_HIDE_CREATOR_FROM_SUBSCRIPTIONS", 1);
            UNDO_HIDE_CREATOR_FROM_SUBSCRIPTIONS = eventType2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick) && this.eventType == ((MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick) obj).eventType;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        if (eventType == null) {
            return 0;
        }
        return eventType.hashCode();
    }

    public final String toString() {
        return "TypeCreatorHideUndoHideClick(eventType=" + this.eventType + ')';
    }

    public MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick(EventType eventType) {
        this.eventType = eventType;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick(EventType eventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType);
    }
}
