package com.vk.superapp.api.dto.geo.directions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: DateTime.kt */
/* loaded from: classes6.dex */
public final class DateTime {

    @pmi0("type")
    private final Type type;

    @pmi0("value")
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DateTime.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("2")
        public static final Type ARRIVE_BY;

        @pmi0("1")
        public static final Type DEPART_AT;

        @pmi0("0")
        public static final Type NOW;

        static {
            Type type = new Type("NOW", 0);
            NOW = type;
            Type type2 = new Type("DEPART_AT", 1);
            DEPART_AT = type2;
            Type type3 = new Type("ARRIVE_BY", 2);
            ARRIVE_BY = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public DateTime(Type type, String str) {
        this.type = type;
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTime)) {
            return false;
        }
        DateTime dateTime = (DateTime) obj;
        return this.type == dateTime.type && epx.f(this.value, dateTime.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DateTime(type=");
        sb.append(this.type);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    public DateTime(Type type, Date date) {
        this(type, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.getDefault()).format(date));
    }
}
