package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("finish")
        public static final Type FINISH;

        @pmi0("start")
        public static final Type START;

        static {
            Type type = new Type("START", 0);
            START = type;
            Type type2 = new Type("FINISH", 1);
            FINISH = type2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem) && this.type == ((MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem) obj).type;
    }

    public final int hashCode() {
        Type type = this.type;
        if (type == null) {
            return 0;
        }
        return type.hashCode();
    }

    public final String toString() {
        return "TypeSdkInitializationItem(type=" + this.type + ')';
    }

    public MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem(Type type) {
        this.type = type;
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem(Type type, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type);
    }
}
