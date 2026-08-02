package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipShareClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0(CampaignEx.JSON_KEY_LINK_TYPE)
    private final MobileOfficialAppsCallsStat$LinkType linkType;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("share_link_click")
        public static final EventType SHARE_LINK_CLICK;

        static {
            EventType eventType = new EventType("SHARE_LINK_CLICK", 0);
            SHARE_LINK_CLICK = eventType;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("calls_services")
        public static final Source CALLS_SERVICES;

        @pmi0("calls_services_long_ago")
        public static final Source CALLS_SERVICES_LONG_AGO;

        @pmi0("in_call")
        public static final Source IN_CALL;

        static {
            Source source = new Source("IN_CALL", 0);
            IN_CALL = source;
            Source source2 = new Source("CALLS_SERVICES", 1);
            CALLS_SERVICES = source2;
            Source source3 = new Source("CALLS_SERVICES_LONG_AGO", 2);
            CALLS_SERVICES_LONG_AGO = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCallsStat$TypeVoipShareClick(EventType eventType, Source source, MobileOfficialAppsCallsStat$LinkType mobileOfficialAppsCallsStat$LinkType) {
        this.eventType = eventType;
        this.source = source;
        this.linkType = mobileOfficialAppsCallsStat$LinkType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipShareClick)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipShareClick mobileOfficialAppsCallsStat$TypeVoipShareClick = (MobileOfficialAppsCallsStat$TypeVoipShareClick) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipShareClick.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipShareClick.source && this.linkType == mobileOfficialAppsCallsStat$TypeVoipShareClick.linkType;
    }

    public final int hashCode() {
        int hashCode = (this.source.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        MobileOfficialAppsCallsStat$LinkType mobileOfficialAppsCallsStat$LinkType = this.linkType;
        return hashCode + (mobileOfficialAppsCallsStat$LinkType == null ? 0 : mobileOfficialAppsCallsStat$LinkType.hashCode());
    }

    public final String toString() {
        return "TypeVoipShareClick(eventType=" + this.eventType + ", source=" + this.source + ", linkType=" + this.linkType + ')';
    }

    public /* synthetic */ MobileOfficialAppsCallsStat$TypeVoipShareClick(EventType eventType, Source source, MobileOfficialAppsCallsStat$LinkType mobileOfficialAppsCallsStat$LinkType, int i, zcl zclVar) {
        this(eventType, source, (i & 4) != 0 ? null : mobileOfficialAppsCallsStat$LinkType);
    }
}
