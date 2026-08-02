package com.vk.stat.sak.scheme;

import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$NavigationFieldItem {

    @pmi0("int_value")
    private final Integer intValue;

    @pmi0("name")
    private final Name name;

    @pmi0("str_value")
    private final String strValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("close_tab")
        public static final Name CLOSE_TAB;

        @pmi0("esia_away")
        public static final Name ESIA_AWAY;

        @pmi0("esia_synchronized_data")
        public static final Name ESIA_SYNCHRONIZED_DATA;

        @pmi0("esia_trusted")
        public static final Name ESIA_TRUSTED;

        @pmi0("jump_destination")
        public static final Name JUMP_DESTINATION;

        @pmi0("leave_unchanged")
        public static final Name LEAVE_UNCHANGED;

        @pmi0("mail_mobile")
        public static final Name MAIL_MOBILE;

        @pmi0("mail_web")
        public static final Name MAIL_WEB;

        @pmi0("multiacc_settings")
        public static final Name MULTIACC_SETTINGS;

        @pmi0("notification_settings")
        public static final Name NOTIFICATION_SETTINGS;

        @pmi0("number_of_accounts")
        public static final Name NUMBER_OF_ACCOUNTS;

        @pmi0("oauth_synchronized_data")
        public static final Name OAUTH_SYNCHRONIZED_DATA;

        @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
        public static final Name PASSWORD;

        @pmi0("transition_account")
        public static final Name TRANSITION_ACCOUNT;

        @pmi0("verification_away")
        public static final Name VERIFICATION_AWAY;

        @pmi0("verification_oauth")
        public static final Name VERIFICATION_OAUTH;

        static {
            Name name = new Name("CLOSE_TAB", 0);
            CLOSE_TAB = name;
            Name name2 = new Name("ESIA_AWAY", 1);
            ESIA_AWAY = name2;
            Name name3 = new Name("LEAVE_UNCHANGED", 2);
            LEAVE_UNCHANGED = name3;
            Name name4 = new Name("ESIA_SYNCHRONIZED_DATA", 3);
            ESIA_SYNCHRONIZED_DATA = name4;
            Name name5 = new Name("OAUTH_SYNCHRONIZED_DATA", 4);
            OAUTH_SYNCHRONIZED_DATA = name5;
            Name name6 = new Name("ESIA_TRUSTED", 5);
            ESIA_TRUSTED = name6;
            Name name7 = new Name("VERIFICATION_AWAY", 6);
            VERIFICATION_AWAY = name7;
            Name name8 = new Name("VERIFICATION_OAUTH", 7);
            VERIFICATION_OAUTH = name8;
            Name name9 = new Name("MULTIACC_SETTINGS", 8);
            MULTIACC_SETTINGS = name9;
            Name name10 = new Name("MAIL_MOBILE", 9);
            MAIL_MOBILE = name10;
            Name name11 = new Name("MAIL_WEB", 10);
            MAIL_WEB = name11;
            Name name12 = new Name("JUMP_DESTINATION", 11);
            JUMP_DESTINATION = name12;
            Name name13 = new Name("PASSWORD", 12);
            PASSWORD = name13;
            Name name14 = new Name("NOTIFICATION_SETTINGS", 13);
            NOTIFICATION_SETTINGS = name14;
            Name name15 = new Name("NUMBER_OF_ACCOUNTS", 14);
            NUMBER_OF_ACCOUNTS = name15;
            Name name16 = new Name("TRANSITION_ACCOUNT", 15);
            TRANSITION_ACCOUNT = name16;
            Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15, name16};
            $VALUES = nameArr;
            $ENTRIES = new asp(nameArr);
        }

        private Name(String str, int i) {
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    public SchemeStatSak$NavigationFieldItem(Name name, String str, Integer num) {
        this.name = name;
        this.strValue = str;
        this.intValue = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$NavigationFieldItem)) {
            return false;
        }
        SchemeStatSak$NavigationFieldItem schemeStatSak$NavigationFieldItem = (SchemeStatSak$NavigationFieldItem) obj;
        return this.name == schemeStatSak$NavigationFieldItem.name && epx.f(this.strValue, schemeStatSak$NavigationFieldItem.strValue) && epx.f(this.intValue, schemeStatSak$NavigationFieldItem.intValue);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.strValue;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.intValue;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationFieldItem(name=");
        sb.append(this.name);
        sb.append(", strValue=");
        sb.append(this.strValue);
        sb.append(", intValue=");
        return uqi.b(sb, this.intValue, ')');
    }

    public /* synthetic */ SchemeStatSak$NavigationFieldItem(Name name, String str, Integer num, int i, zcl zclVar) {
        this(name, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
