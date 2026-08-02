package com.vk.stat.sak.scheme;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$MultiaccountFieldItem {

    @pmi0("name")
    private final Name name;

    @pmi0("value")
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("from_profile_type")
        public static final Name FROM_PROFILE_TYPE;

        @pmi0("to_profile_type")
        public static final Name TO_PROFILE_TYPE;

        @pmi0("to_switcher_from")
        public static final Name TO_SWITCHER_FROM;

        static {
            Name name = new Name("TO_SWITCHER_FROM", 0);
            TO_SWITCHER_FROM = name;
            Name name2 = new Name("FROM_PROFILE_TYPE", 1);
            FROM_PROFILE_TYPE = name2;
            Name name3 = new Name("TO_PROFILE_TYPE", 2);
            TO_PROFILE_TYPE = name3;
            Name[] nameArr = {name, name2, name3};
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

    public SchemeStatSak$MultiaccountFieldItem(Name name, String str) {
        this.name = name;
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$MultiaccountFieldItem)) {
            return false;
        }
        SchemeStatSak$MultiaccountFieldItem schemeStatSak$MultiaccountFieldItem = (SchemeStatSak$MultiaccountFieldItem) obj;
        return this.name == schemeStatSak$MultiaccountFieldItem.name && epx.f(this.value, schemeStatSak$MultiaccountFieldItem.value);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiaccountFieldItem(name=");
        sb.append(this.name);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    public /* synthetic */ SchemeStatSak$MultiaccountFieldItem(Name name, String str, int i, zcl zclVar) {
        this(name, (i & 2) != 0 ? null : str);
    }
}
