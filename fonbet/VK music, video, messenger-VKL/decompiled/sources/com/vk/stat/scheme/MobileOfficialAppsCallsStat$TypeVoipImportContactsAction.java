package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipImportContactsAction implements SchemeStat$TypeAction.b {

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

        @pmi0("accept_import_contacts")
        public static final EventType ACCEPT_IMPORT_CONTACTS;

        @pmi0("decline_import_contacts")
        public static final EventType DECLINE_IMPORT_CONTACTS;

        @pmi0("import_contacts_success")
        public static final EventType IMPORT_CONTACTS_SUCCESS;

        static {
            EventType eventType = new EventType("ACCEPT_IMPORT_CONTACTS", 0);
            ACCEPT_IMPORT_CONTACTS = eventType;
            EventType eventType2 = new EventType("DECLINE_IMPORT_CONTACTS", 1);
            DECLINE_IMPORT_CONTACTS = eventType2;
            EventType eventType3 = new EventType("IMPORT_CONTACTS_SUCCESS", 2);
            IMPORT_CONTACTS_SUCCESS = eventType3;
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

    public MobileOfficialAppsCallsStat$TypeVoipImportContactsAction(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipImportContactsAction)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipImportContactsAction mobileOfficialAppsCallsStat$TypeVoipImportContactsAction = (MobileOfficialAppsCallsStat$TypeVoipImportContactsAction) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipImportContactsAction.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipImportContactsAction.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVoipImportContactsAction(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
