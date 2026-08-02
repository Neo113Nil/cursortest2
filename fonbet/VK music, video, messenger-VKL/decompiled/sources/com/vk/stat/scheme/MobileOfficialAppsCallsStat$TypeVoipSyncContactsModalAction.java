package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("reason")
    private final Reason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("modal_sync_contacts_accept_import_contacts")
        public static final EventType MODAL_SYNC_CONTACTS_ACCEPT_IMPORT_CONTACTS;

        @pmi0("modal_sync_contacts_decline_import_contacts")
        public static final EventType MODAL_SYNC_CONTACTS_DECLINE_IMPORT_CONTACTS;

        @pmi0("modal_sync_contacts_import_contacts_success")
        public static final EventType MODAL_SYNC_CONTACTS_IMPORT_CONTACTS_SUCCESS;

        @pmi0("modal_sync_contacts_show")
        public static final EventType MODAL_SYNC_CONTACTS_SHOW;

        static {
            EventType eventType = new EventType("MODAL_SYNC_CONTACTS_SHOW", 0);
            MODAL_SYNC_CONTACTS_SHOW = eventType;
            EventType eventType2 = new EventType("MODAL_SYNC_CONTACTS_ACCEPT_IMPORT_CONTACTS", 1);
            MODAL_SYNC_CONTACTS_ACCEPT_IMPORT_CONTACTS = eventType2;
            EventType eventType3 = new EventType("MODAL_SYNC_CONTACTS_DECLINE_IMPORT_CONTACTS", 2);
            MODAL_SYNC_CONTACTS_DECLINE_IMPORT_CONTACTS = eventType3;
            EventType eventType4 = new EventType("MODAL_SYNC_CONTACTS_IMPORT_CONTACTS_SUCCESS", 3);
            MODAL_SYNC_CONTACTS_IMPORT_CONTACTS_SUCCESS = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
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
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;

        @pmi0("already_synced")
        public static final Reason ALREADY_SYNCED;

        @pmi0("no_sync")
        public static final Reason NO_SYNC;

        static {
            Reason reason = new Reason("ALREADY_SYNCED", 0);
            ALREADY_SYNCED = reason;
            Reason reason2 = new Reason("NO_SYNC", 1);
            NO_SYNC = reason2;
            Reason[] reasonArr = {reason, reason2};
            $VALUES = reasonArr;
            $ENTRIES = new asp(reasonArr);
        }

        private Reason(String str, int i) {
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(EventType eventType, Reason reason) {
        this.eventType = eventType;
        this.reason = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction = (MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.eventType && this.reason == mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.reason;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Reason reason = this.reason;
        return hashCode + (reason == null ? 0 : reason.hashCode());
    }

    public final String toString() {
        return "TypeVoipSyncContactsModalAction(eventType=" + this.eventType + ", reason=" + this.reason + ')';
    }

    public /* synthetic */ MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(EventType eventType, Reason reason, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : reason);
    }
}
