package com.vk.movika.sdk.player.base.model;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* loaded from: classes3.dex */
public final class PlayerItemVariant {
    public final String a;
    public final Type b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CUSTOM;
        public static final Type DASH;
        public static final Type HLS;
        public static final Type MP4;

        static {
            Type type = new Type("HLS", 0);
            HLS = type;
            Type type2 = new Type("MP4", 1);
            MP4 = type2;
            Type type3 = new Type("DASH", 2);
            DASH = type3;
            Type type4 = new Type("CUSTOM", 3);
            CUSTOM = type4;
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

    public PlayerItemVariant(String str, Type type, String str2, String str3, String str4) {
        this.a = str;
        this.b = type;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return PlayerItemVariant.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.a, ((PlayerItemVariant) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
