package com.vk.voip.ui.prodstat.analytics.contact.action;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipImportContactsAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.iid0;
import xsna.jdw0;
import xsna.mdw0;
import xsna.vew0;
import xsna.zrp;

/* compiled from: VoipContactsActionAnalytics.kt */
/* loaded from: classes11.dex */
public final class VoipContactsActionAnalytics extends vew0<Event> implements jdw0.b {
    public static final a b = new a();

    /* compiled from: VoipContactsActionAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface Event extends mdw0 {

        /* compiled from: VoipContactsActionAnalytics.kt */
        public static final class ImportContacts implements Event {
            public final Type a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VoipContactsActionAnalytics.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type DENIED;
                public static final Type GRANTED;
                public static final Type SUCCESS;

                static {
                    Type type = new Type("GRANTED", 0);
                    GRANTED = type;
                    Type type2 = new Type("DENIED", 1);
                    DENIED = type2;
                    Type type3 = new Type("SUCCESS", 2);
                    SUCCESS = type3;
                    Type[] typeArr = {type, type2, type3};
                    $VALUES = typeArr;
                    $ENTRIES = new asp(typeArr);
                }

                public Type() {
                    throw null;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public ImportContacts(Type type) {
                this.a = type;
            }

            public final Type b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ImportContacts) && this.a == ((ImportContacts) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ImportContacts(type=" + this.a + ')';
            }
        }
    }

    /* compiled from: VoipContactsActionAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof Event;
        }
    }

    /* compiled from: VoipContactsActionAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Event.ImportContacts.Type.values().length];
            try {
                iArr[Event.ImportContacts.Type.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Event.ImportContacts.Type.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Event.ImportContacts.Type.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.jdw0.b
    public final boolean a(mdw0 mdw0Var) {
        if (!(mdw0Var instanceof Event)) {
            return false;
        }
        b((Event) mdw0Var);
        return true;
    }

    @Override // xsna.kdw0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(Event event) {
        MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType eventType;
        if (!(event instanceof Event.ImportContacts)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = b.$EnumSwitchMapping$0[((Event.ImportContacts) event).b().ordinal()];
        if (i == 1) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.ACCEPT_IMPORT_CONTACTS;
        } else if (i == 2) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.DECLINE_IMPORT_CONTACTS;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.IMPORT_CONTACTS_SUCCESS;
        }
        MobileOfficialAppsCallsStat$TypeVoipImportContactsAction mobileOfficialAppsCallsStat$TypeVoipImportContactsAction = new MobileOfficialAppsCallsStat$TypeVoipImportContactsAction(eventType, MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.Source.CALLS_SERVICES);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction a2 = SchemeStat$TypeAction.a.a(null, null, mobileOfficialAppsCallsStat$TypeVoipImportContactsAction);
        iid0 iid0Var = this.a;
        iid0Var.f = c;
        iid0Var.g = a2;
        iid0Var.q();
    }
}
