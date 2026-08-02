package com.vk.auth.logout_menu;

import xsna.asp;
import xsna.zrp;

/* compiled from: LogoutItem.kt */
/* loaded from: classes15.dex */
public final class LogoutItem {
    public final Type a;
    public final int b;
    public final String c;
    public final String d;
    public final a e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogoutItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ADD_ACCOUNT;
        public static final Type DEFAULT;
        public static final Type LOGOUT;
        public static final Type SWITCH_ACCOUNT;

        static {
            Type type = new Type("DEFAULT", 0);
            DEFAULT = type;
            Type type2 = new Type("LOGOUT", 1);
            LOGOUT = type2;
            Type type3 = new Type("ADD_ACCOUNT", 2);
            ADD_ACCOUNT = type3;
            Type type4 = new Type("SWITCH_ACCOUNT", 3);
            SWITCH_ACCOUNT = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    /* compiled from: LogoutItem.kt */
    public interface a {
        void invoke();
    }

    public LogoutItem(Type type, int i, String str, String str2, a aVar) {
        this.a = type;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = aVar;
    }
}
