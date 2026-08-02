package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$VkbridgeErrorItem {

    @pmi0("code")
    private final int code;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("api_error")
        public static final Type API_ERROR;

        @pmi0("auth_error")
        public static final Type AUTH_ERROR;

        @pmi0("client_error")
        public static final Type CLIENT_ERROR;

        static {
            Type type = new Type("CLIENT_ERROR", 0);
            CLIENT_ERROR = type;
            Type type2 = new Type("API_ERROR", 1);
            API_ERROR = type2;
            Type type3 = new Type("AUTH_ERROR", 2);
            AUTH_ERROR = type3;
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

    public SchemeStat$VkbridgeErrorItem(Type type, int i) {
        this.type = type;
        this.code = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$VkbridgeErrorItem)) {
            return false;
        }
        SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem = (SchemeStat$VkbridgeErrorItem) obj;
        return this.type == schemeStat$VkbridgeErrorItem.type && this.code == schemeStat$VkbridgeErrorItem.code;
    }

    public final int hashCode() {
        return Integer.hashCode(this.code) + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkbridgeErrorItem(type=");
        sb.append(this.type);
        sb.append(", code=");
        return vu5.b(sb, this.code, ')');
    }
}
