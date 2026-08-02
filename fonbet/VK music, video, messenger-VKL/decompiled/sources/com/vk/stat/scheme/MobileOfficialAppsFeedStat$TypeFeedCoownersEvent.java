package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedCoownersEvent implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("item_owner_id")
    private final Long itemOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("coowners_setup_invitations_button_click")
        public static final EventType COOWNERS_SETUP_INVITATIONS_BUTTON_CLICK;

        static {
            EventType eventType = new EventType("COOWNERS_SETUP_INVITATIONS_BUTTON_CLICK", 0);
            COOWNERS_SETUP_INVITATIONS_BUTTON_CLICK = eventType;
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

    public MobileOfficialAppsFeedStat$TypeFeedCoownersEvent(EventType eventType, Long l) {
        this.eventType = eventType;
        this.itemOwnerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedCoownersEvent)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedCoownersEvent mobileOfficialAppsFeedStat$TypeFeedCoownersEvent = (MobileOfficialAppsFeedStat$TypeFeedCoownersEvent) obj;
        return this.eventType == mobileOfficialAppsFeedStat$TypeFeedCoownersEvent.eventType && epx.f(this.itemOwnerId, mobileOfficialAppsFeedStat$TypeFeedCoownersEvent.itemOwnerId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Long l = this.itemOwnerId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedCoownersEvent(eventType=");
        sb.append(this.eventType);
        sb.append(", itemOwnerId=");
        return iq.b(sb, this.itemOwnerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedCoownersEvent(EventType eventType, Long l, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : l);
    }
}
