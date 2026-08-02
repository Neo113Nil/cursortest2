package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMessagingSyncContactsClickItem implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("modal_sync_contacts_share_chat_link_click")
        public static final EventType MODAL_SYNC_CONTACTS_SHARE_CHAT_LINK_CLICK;

        static {
            EventType eventType = new EventType("MODAL_SYNC_CONTACTS_SHARE_CHAT_LINK_CLICK", 0);
            MODAL_SYNC_CONTACTS_SHARE_CHAT_LINK_CLICK = eventType;
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

    public SchemeStat$TypeMessagingSyncContactsClickItem(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeMessagingSyncContactsClickItem) && this.eventType == ((SchemeStat$TypeMessagingSyncContactsClickItem) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeMessagingSyncContactsClickItem(eventType=" + this.eventType + ')';
    }
}
