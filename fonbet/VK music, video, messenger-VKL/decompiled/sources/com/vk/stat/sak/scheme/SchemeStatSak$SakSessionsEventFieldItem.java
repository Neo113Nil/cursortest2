package com.vk.stat.sak.scheme;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$SakSessionsEventFieldItem {

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

        @pmi0("limit_settings")
        public static final Name LIMIT_SETTINGS;

        static {
            Name name = new Name("LIMIT_SETTINGS", 0);
            LIMIT_SETTINGS = name;
            Name[] nameArr = {name};
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

    public SchemeStatSak$SakSessionsEventFieldItem(Name name, String str) {
        this.name = name;
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$SakSessionsEventFieldItem)) {
            return false;
        }
        SchemeStatSak$SakSessionsEventFieldItem schemeStatSak$SakSessionsEventFieldItem = (SchemeStatSak$SakSessionsEventFieldItem) obj;
        return this.name == schemeStatSak$SakSessionsEventFieldItem.name && epx.f(this.value, schemeStatSak$SakSessionsEventFieldItem.value);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SakSessionsEventFieldItem(name=");
        sb.append(this.name);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    public /* synthetic */ SchemeStatSak$SakSessionsEventFieldItem(Name name, String str, int i, zcl zclVar) {
        this(name, (i & 2) != 0 ? null : str);
    }
}
