package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final boolean eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_toggle_show_channel_links")
        public static final EventType CLICK_TOGGLE_SHOW_CHANNEL_LINKS;

        static {
            EventType eventType = new EventType("CLICK_TOGGLE_SHOW_CHANNEL_LINKS", 0);
            CLICK_TOGGLE_SHOW_CHANNEL_LINKS = eventType;
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

    public MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks(EventType eventType, boolean z) {
        this.eventType = eventType;
        this.eventSubtype = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks = (MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks.eventSubtype;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.eventSubtype) + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoClickToggleShowChannelLinks(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        return defpackage.q0.a(sb, this.eventSubtype, ')');
    }
}
