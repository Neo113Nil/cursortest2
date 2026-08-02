package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipImportContactsClick implements SchemeStat$TypeClick.b {

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

        @pmi0("import_contacts_click")
        public static final EventType IMPORT_CONTACTS_CLICK;

        static {
            EventType eventType = new EventType("IMPORT_CONTACTS_CLICK", 0);
            IMPORT_CONTACTS_CLICK = eventType;
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

        static {
            Source source = new Source("CALLS_SERVICES", 0);
            CALLS_SERVICES = source;
            Source[] sourceArr = {source};
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

    public MobileOfficialAppsCallsStat$TypeVoipImportContactsClick(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipImportContactsClick)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipImportContactsClick mobileOfficialAppsCallsStat$TypeVoipImportContactsClick = (MobileOfficialAppsCallsStat$TypeVoipImportContactsClick) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipImportContactsClick.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipImportContactsClick.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVoipImportContactsClick(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
