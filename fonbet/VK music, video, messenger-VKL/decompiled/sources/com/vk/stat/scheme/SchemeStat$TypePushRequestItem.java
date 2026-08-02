package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypePushRequestItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("network_signal_info")
    private final SchemeStat$NetworkSignalInfo networkSignalInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("allow")
        public static final EventType ALLOW;

        @pmi0("deny")
        public static final EventType DENY;

        static {
            EventType eventType = new EventType("ALLOW", 0);
            ALLOW = eventType;
            EventType eventType2 = new EventType("DENY", 1);
            DENY = eventType2;
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

    public SchemeStat$TypePushRequestItem(EventType eventType, SchemeStat$NetworkSignalInfo schemeStat$NetworkSignalInfo) {
        this.eventType = eventType;
        this.networkSignalInfo = schemeStat$NetworkSignalInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypePushRequestItem)) {
            return false;
        }
        SchemeStat$TypePushRequestItem schemeStat$TypePushRequestItem = (SchemeStat$TypePushRequestItem) obj;
        return this.eventType == schemeStat$TypePushRequestItem.eventType && epx.f(this.networkSignalInfo, schemeStat$TypePushRequestItem.networkSignalInfo);
    }

    public final int hashCode() {
        return this.networkSignalInfo.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypePushRequestItem(eventType=" + this.eventType + ", networkSignalInfo=" + this.networkSignalInfo + ')';
    }
}
