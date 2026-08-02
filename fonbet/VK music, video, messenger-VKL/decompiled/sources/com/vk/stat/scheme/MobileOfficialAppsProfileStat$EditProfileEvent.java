package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.X3;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsProfileStat$EditProfileEvent {
    public final transient String a;

    @pmi0("changed_parameter")
    private final ChangedParameter changedParameter;

    @pmi0("edit_profile_event")
    private final EditProfileEvent editProfileEvent;

    @pmi0("short_info_value")
    private final FilteredString filteredShortInfoValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    /* loaded from: classes5.dex */
    public static final class ChangedParameter {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChangedParameter[] $VALUES;

        @pmi0("account")
        public static final ChangedParameter ACCOUNT;

        @pmi0("career")
        public static final ChangedParameter CAREER;

        @pmi0("contacts")
        public static final ChangedParameter CONTACTS;

        @pmi0("education")
        public static final ChangedParameter EDUCATION;

        @pmi0("interests")
        public static final ChangedParameter INTERESTS;

        @pmi0(X3.i.Z)
        public static final ChangedParameter MAIN;

        @pmi0("military")
        public static final ChangedParameter MILITARY;

        @pmi0("personal")
        public static final ChangedParameter PERSONAL;

        @pmi0("relatives")
        public static final ChangedParameter RELATIVES;

        @pmi0("security")
        public static final ChangedParameter SECURITY;

        static {
            ChangedParameter changedParameter = new ChangedParameter("ACCOUNT", 0);
            ACCOUNT = changedParameter;
            ChangedParameter changedParameter2 = new ChangedParameter("SECURITY", 1);
            SECURITY = changedParameter2;
            ChangedParameter changedParameter3 = new ChangedParameter("MAIN", 2);
            MAIN = changedParameter3;
            ChangedParameter changedParameter4 = new ChangedParameter("RELATIVES", 3);
            RELATIVES = changedParameter4;
            ChangedParameter changedParameter5 = new ChangedParameter("CONTACTS", 4);
            CONTACTS = changedParameter5;
            ChangedParameter changedParameter6 = new ChangedParameter("INTERESTS", 5);
            INTERESTS = changedParameter6;
            ChangedParameter changedParameter7 = new ChangedParameter("EDUCATION", 6);
            EDUCATION = changedParameter7;
            ChangedParameter changedParameter8 = new ChangedParameter("CAREER", 7);
            CAREER = changedParameter8;
            ChangedParameter changedParameter9 = new ChangedParameter("PERSONAL", 8);
            PERSONAL = changedParameter9;
            ChangedParameter changedParameter10 = new ChangedParameter("MILITARY", 9);
            MILITARY = changedParameter10;
            ChangedParameter[] changedParameterArr = {changedParameter, changedParameter2, changedParameter3, changedParameter4, changedParameter5, changedParameter6, changedParameter7, changedParameter8, changedParameter9, changedParameter10};
            $VALUES = changedParameterArr;
            $ENTRIES = new asp(changedParameterArr);
        }

        private ChangedParameter(String str, int i) {
        }

        public static ChangedParameter valueOf(String str) {
            return (ChangedParameter) Enum.valueOf(ChangedParameter.class, str);
        }

        public static ChangedParameter[] values() {
            return (ChangedParameter[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    /* loaded from: classes5.dex */
    public static final class EditProfileEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EditProfileEvent[] $VALUES;

        @pmi0("change_info")
        public static final EditProfileEvent CHANGE_INFO;

        @pmi0("click_to_name_change")
        public static final EditProfileEvent CLICK_TO_NAME_CHANGE;

        @pmi0("edit_nickname")
        public static final EditProfileEvent EDIT_NICKNAME;

        @pmi0("edit_short_info")
        public static final EditProfileEvent EDIT_SHORT_INFO;

        @pmi0("nick_off")
        public static final EditProfileEvent NICK_OFF;

        @pmi0("nick_on")
        public static final EditProfileEvent NICK_ON;

        @pmi0("save_change_info")
        public static final EditProfileEvent SAVE_CHANGE_INFO;

        @pmi0("save_profile")
        public static final EditProfileEvent SAVE_PROFILE;

        static {
            EditProfileEvent editProfileEvent = new EditProfileEvent("EDIT_SHORT_INFO", 0);
            EDIT_SHORT_INFO = editProfileEvent;
            EditProfileEvent editProfileEvent2 = new EditProfileEvent("EDIT_NICKNAME", 1);
            EDIT_NICKNAME = editProfileEvent2;
            EditProfileEvent editProfileEvent3 = new EditProfileEvent("NICK_ON", 2);
            NICK_ON = editProfileEvent3;
            EditProfileEvent editProfileEvent4 = new EditProfileEvent("NICK_OFF", 3);
            NICK_OFF = editProfileEvent4;
            EditProfileEvent editProfileEvent5 = new EditProfileEvent("CLICK_TO_NAME_CHANGE", 4);
            CLICK_TO_NAME_CHANGE = editProfileEvent5;
            EditProfileEvent editProfileEvent6 = new EditProfileEvent("CHANGE_INFO", 5);
            CHANGE_INFO = editProfileEvent6;
            EditProfileEvent editProfileEvent7 = new EditProfileEvent("SAVE_CHANGE_INFO", 6);
            SAVE_CHANGE_INFO = editProfileEvent7;
            EditProfileEvent editProfileEvent8 = new EditProfileEvent("SAVE_PROFILE", 7);
            SAVE_PROFILE = editProfileEvent8;
            EditProfileEvent[] editProfileEventArr = {editProfileEvent, editProfileEvent2, editProfileEvent3, editProfileEvent4, editProfileEvent5, editProfileEvent6, editProfileEvent7, editProfileEvent8};
            $VALUES = editProfileEventArr;
            $ENTRIES = new asp(editProfileEventArr);
        }

        private EditProfileEvent(String str, int i) {
        }

        public static EditProfileEvent valueOf(String str) {
            return (EditProfileEvent) Enum.valueOf(EditProfileEvent.class, str);
        }

        public static EditProfileEvent[] values() {
            return (EditProfileEvent[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsProfileStat$EditProfileEvent>, a9y<MobileOfficialAppsProfileStat$EditProfileEvent> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("edit_profile_event");
            Object obj = null;
            EditProfileEvent editProfileEvent = (EditProfileEvent) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), EditProfileEvent.class));
            String C = fai.C(x9yVar, "short_info_value");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("changed_parameter");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) ChangedParameter.class);
            }
            return new MobileOfficialAppsProfileStat$EditProfileEvent(editProfileEvent, C, (ChangedParameter) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsProfileStat$EditProfileEvent mobileOfficialAppsProfileStat$EditProfileEvent = (MobileOfficialAppsProfileStat$EditProfileEvent) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("edit_profile_event", tru.a().toJson(mobileOfficialAppsProfileStat$EditProfileEvent.b()));
            x9yVar.o("short_info_value", mobileOfficialAppsProfileStat$EditProfileEvent.a);
            x9yVar.o("changed_parameter", tru.a().toJson(mobileOfficialAppsProfileStat$EditProfileEvent.a()));
            return x9yVar;
        }
    }

    public MobileOfficialAppsProfileStat$EditProfileEvent() {
        this(null, null, null, 7, null);
    }

    public final ChangedParameter a() {
        return this.changedParameter;
    }

    public final EditProfileEvent b() {
        return this.editProfileEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$EditProfileEvent)) {
            return false;
        }
        MobileOfficialAppsProfileStat$EditProfileEvent mobileOfficialAppsProfileStat$EditProfileEvent = (MobileOfficialAppsProfileStat$EditProfileEvent) obj;
        return this.editProfileEvent == mobileOfficialAppsProfileStat$EditProfileEvent.editProfileEvent && epx.f(this.a, mobileOfficialAppsProfileStat$EditProfileEvent.a) && this.changedParameter == mobileOfficialAppsProfileStat$EditProfileEvent.changedParameter;
    }

    public final int hashCode() {
        EditProfileEvent editProfileEvent = this.editProfileEvent;
        int hashCode = (editProfileEvent == null ? 0 : editProfileEvent.hashCode()) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChangedParameter changedParameter = this.changedParameter;
        return hashCode2 + (changedParameter != null ? changedParameter.hashCode() : 0);
    }

    public final String toString() {
        return "EditProfileEvent(editProfileEvent=" + this.editProfileEvent + ", shortInfoValue=" + this.a + ", changedParameter=" + this.changedParameter + ')';
    }

    public MobileOfficialAppsProfileStat$EditProfileEvent(EditProfileEvent editProfileEvent, String str, ChangedParameter changedParameter) {
        this.editProfileEvent = editProfileEvent;
        this.a = str;
        this.changedParameter = changedParameter;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredShortInfoValue = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$EditProfileEvent(EditProfileEvent editProfileEvent, String str, ChangedParameter changedParameter, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : editProfileEvent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : changedParameter);
    }
}
