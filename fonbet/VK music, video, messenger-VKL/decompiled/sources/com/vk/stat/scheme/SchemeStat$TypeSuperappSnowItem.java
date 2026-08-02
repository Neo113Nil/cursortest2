package com.vk.stat.scheme;

import com.unity3d.ads.BuildConfig;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeSuperappSnowItem implements SchemeStat$TypeAction.b {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0(BuildConfig.FLAVOR)
        public static final Type DEFAULT;

        @pmi0("shake")
        public static final Type SHAKE;

        static {
            Type type = new Type("DEFAULT", 0);
            DEFAULT = type;
            Type type2 = new Type("SHAKE", 1);
            SHAKE = type2;
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

    public SchemeStat$TypeSuperappSnowItem(Type type) {
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeSuperappSnowItem) && this.type == ((SchemeStat$TypeSuperappSnowItem) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "TypeSuperappSnowItem(type=" + this.type + ')';
    }
}
