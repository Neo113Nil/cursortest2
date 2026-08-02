package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeClickPreferenceValueItem implements SchemeStat$TypeClick.b {
    public final transient String a;
    public final transient String b;

    @pmi0("value_new")
    private final FilteredString filteredValueNew;

    @pmi0("value_old")
    private final FilteredString filteredValueOld;

    @pmi0("name")
    private final Name name;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("app_icon")
        public static final Name APP_ICON;

        @pmi0("go_to_messenger_banner")
        public static final Name GO_TO_MESSENGER_BANNER;

        @pmi0("go_to_sferum_banner")
        public static final Name GO_TO_SFERUM_BANNER;

        @pmi0("music_location")
        public static final Name MUSIC_LOCATION;

        static {
            Name name = new Name("APP_ICON", 0);
            APP_ICON = name;
            Name name2 = new Name("GO_TO_SFERUM_BANNER", 1);
            GO_TO_SFERUM_BANNER = name2;
            Name name3 = new Name("GO_TO_MESSENGER_BANNER", 2);
            GO_TO_MESSENGER_BANNER = name3;
            Name name4 = new Name("MUSIC_LOCATION", 3);
            MUSIC_LOCATION = name4;
            Name[] nameArr = {name, name2, name3, name4};
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

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeClickPreferenceValueItem>, a9y<SchemeStat$TypeClickPreferenceValueItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$TypeClickPreferenceValueItem((Type) dq.f(x9yVar, "type", tru.a(), Type.class), (Name) dq.f(x9yVar, "name", tru.a(), Name.class), fai.s(x9yVar, "value_old"), fai.s(x9yVar, "value_new"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeClickPreferenceValueItem schemeStat$TypeClickPreferenceValueItem = (SchemeStat$TypeClickPreferenceValueItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("type", tru.a().toJson(schemeStat$TypeClickPreferenceValueItem.b()));
            x9yVar.o("name", tru.a().toJson(schemeStat$TypeClickPreferenceValueItem.a()));
            x9yVar.o("value_old", schemeStat$TypeClickPreferenceValueItem.a);
            x9yVar.o("value_new", schemeStat$TypeClickPreferenceValueItem.b);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("appearance")
        public static final Type APPEARANCE;

        @pmi0("general")
        public static final Type GENERAL;

        static {
            Type type = new Type("APPEARANCE", 0);
            APPEARANCE = type;
            Type type2 = new Type("GENERAL", 1);
            GENERAL = type2;
            Type[] typeArr = {type, type2};
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

    public SchemeStat$TypeClickPreferenceValueItem(Type type, Name name, String str, String str2) {
        this.type = type;
        this.name = name;
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredValueOld = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(64));
        this.filteredValueNew = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final Name a() {
        return this.name;
    }

    public final Type b() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClickPreferenceValueItem)) {
            return false;
        }
        SchemeStat$TypeClickPreferenceValueItem schemeStat$TypeClickPreferenceValueItem = (SchemeStat$TypeClickPreferenceValueItem) obj;
        return this.type == schemeStat$TypeClickPreferenceValueItem.type && this.name == schemeStat$TypeClickPreferenceValueItem.name && epx.f(this.a, schemeStat$TypeClickPreferenceValueItem.a) && epx.f(this.b, schemeStat$TypeClickPreferenceValueItem.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + urd0.a((this.name.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClickPreferenceValueItem(type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", valueOld=");
        sb.append(this.a);
        sb.append(", valueNew=");
        return ho8.a(sb, this.b, ')');
    }
}
