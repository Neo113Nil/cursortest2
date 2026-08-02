package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("calls_services_click")
        public static final EventType CALLS_SERVICES_CLICK;

        static {
            EventType eventType = new EventType("CALLS_SERVICES_CLICK", 0);
            CALLS_SERVICES_CLICK = eventType;
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

        @pmi0("im")
        public static final Source IM;

        @pmi0("mini_apps_catalog_recommendations")
        public static final Source MINI_APPS_CATALOG_RECOMMENDATIONS;

        static {
            Source source = new Source("CALLS_SERVICES", 0);
            CALLS_SERVICES = source;
            Source source2 = new Source("IM", 1);
            IM = source2;
            Source source3 = new Source("MINI_APPS_CATALOG_RECOMMENDATIONS", 2);
            MINI_APPS_CATALOG_RECOMMENDATIONS = source3;
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

    public MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick = (MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVoipCallsServicesClick(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
