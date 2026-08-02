package com.vk.attachpicker.stat.models;

import xsna.asp;
import xsna.epx;
import xsna.f5l0;
import xsna.iq;
import xsna.zrp;

/* compiled from: VkStickerMeta.kt */
/* loaded from: classes15.dex */
public final class VkStickerMeta implements f5l0 {
    public final Type a;
    public final Integer b;
    public final Long c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkStickerMeta.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Animated;
        public static final Type Emoji;
        public static final Type FromPack;
        public static final Type GIF;
        public static final Type Individual;
        public static final Type Vmoji;

        static {
            Type type = new Type("Individual", 0);
            Individual = type;
            Type type2 = new Type("FromPack", 1);
            FromPack = type2;
            Type type3 = new Type("Animated", 2);
            Animated = type3;
            Type type4 = new Type("GIF", 3);
            GIF = type4;
            Type type5 = new Type("Vmoji", 4);
            Vmoji = type5;
            Type type6 = new Type("Emoji", 5);
            Emoji = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
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

    public VkStickerMeta(Type type, Integer num, Long l) {
        this.a = type;
        this.b = num;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkStickerMeta)) {
            return false;
        }
        VkStickerMeta vkStickerMeta = (VkStickerMeta) obj;
        return this.a == vkStickerMeta.a && epx.f(this.b, vkStickerMeta.b) && epx.f(this.c, vkStickerMeta.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.c;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkStickerMeta(type=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", packId=");
        return iq.b(sb, this.c, ')');
    }
}
