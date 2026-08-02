package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCoreNetworkStat.kt */
/* loaded from: classes5.dex */
public final class CommonCoreNetworkStat$NetworkBadConnectionAction implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCoreNetworkStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("bad_connection")
        public static final EventType BAD_CONNECTION;

        @pmi0("bad_connection_cellular")
        public static final EventType BAD_CONNECTION_CELLULAR;

        @pmi0("bad_connection_wifi")
        public static final EventType BAD_CONNECTION_WIFI;

        @pmi0("banner_primary_button_click")
        public static final EventType BANNER_PRIMARY_BUTTON_CLICK;

        @pmi0("banner_secondary_button_click")
        public static final EventType BANNER_SECONDARY_BUTTON_CLICK;

        @pmi0("banner_shown")
        public static final EventType BANNER_SHOWN;

        @pmi0("connection_restored")
        public static final EventType CONNECTION_RESTORED;

        @pmi0("network_stable")
        public static final EventType NETWORK_STABLE;

        @pmi0("network_unstable")
        public static final EventType NETWORK_UNSTABLE;

        @pmi0("tunnel_off")
        public static final EventType TUNNEL_OFF;

        @pmi0("tunnel_on")
        public static final EventType TUNNEL_ON;

        static {
            EventType eventType = new EventType("TUNNEL_ON", 0);
            TUNNEL_ON = eventType;
            EventType eventType2 = new EventType("TUNNEL_OFF", 1);
            TUNNEL_OFF = eventType2;
            EventType eventType3 = new EventType("NETWORK_STABLE", 2);
            NETWORK_STABLE = eventType3;
            EventType eventType4 = new EventType("NETWORK_UNSTABLE", 3);
            NETWORK_UNSTABLE = eventType4;
            EventType eventType5 = new EventType("BAD_CONNECTION", 4);
            BAD_CONNECTION = eventType5;
            EventType eventType6 = new EventType("BAD_CONNECTION_WIFI", 5);
            BAD_CONNECTION_WIFI = eventType6;
            EventType eventType7 = new EventType("BAD_CONNECTION_CELLULAR", 6);
            BAD_CONNECTION_CELLULAR = eventType7;
            EventType eventType8 = new EventType("BANNER_SHOWN", 7);
            BANNER_SHOWN = eventType8;
            EventType eventType9 = new EventType("BANNER_PRIMARY_BUTTON_CLICK", 8);
            BANNER_PRIMARY_BUTTON_CLICK = eventType9;
            EventType eventType10 = new EventType("BANNER_SECONDARY_BUTTON_CLICK", 9);
            BANNER_SECONDARY_BUTTON_CLICK = eventType10;
            EventType eventType11 = new EventType("CONNECTION_RESTORED", 10);
            CONNECTION_RESTORED = eventType11;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11};
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

    public CommonCoreNetworkStat$NetworkBadConnectionAction(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCoreNetworkStat$NetworkBadConnectionAction) && this.eventType == ((CommonCoreNetworkStat$NetworkBadConnectionAction) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "NetworkBadConnectionAction(eventType=" + this.eventType + ')';
    }
}
