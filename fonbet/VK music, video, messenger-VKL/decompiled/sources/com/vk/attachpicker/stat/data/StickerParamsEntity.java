package com.vk.attachpicker.stat.data;

import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.shy;
import xsna.zrp;

/* compiled from: StickerParamsEntity.kt */
/* loaded from: classes15.dex */
public final class StickerParamsEntity {
    public final Integer a;
    public final int b;
    public final Type c;
    public final Integer d;
    public final Long e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickerParamsEntity.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Animated;
        public static final Type Emoji;
        public static final Type FromPack;
        public static final Type GIF;
        public static final Type Individual;
        public static final Type Vimoji;

        static {
            Type type = new Type("Individual", 0);
            Individual = type;
            Type type2 = new Type("FromPack", 1);
            FromPack = type2;
            Type type3 = new Type("Animated", 2);
            Animated = type3;
            Type type4 = new Type("GIF", 3);
            GIF = type4;
            Type type5 = new Type("Vimoji", 4);
            Vimoji = type5;
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

    public StickerParamsEntity(Integer num, int i, Type type, Integer num2, Long l) {
        this.a = num;
        this.b = i;
        this.c = type;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerParamsEntity)) {
            return false;
        }
        StickerParamsEntity stickerParamsEntity = (StickerParamsEntity) obj;
        return epx.f(this.a, stickerParamsEntity.a) && this.b == stickerParamsEntity.b && this.c == stickerParamsEntity.c && epx.f(this.d, stickerParamsEntity.d) && epx.f(this.e, stickerParamsEntity.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (this.c.hashCode() + shy.a(this.b, (num == null ? 0 : num.hashCode()) * 31, 31)) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerParamsEntity(id=");
        sb.append(this.a);
        sb.append(", photoId=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", stickerId=");
        sb.append(this.d);
        sb.append(", packId=");
        return iq.b(sb, this.e, ')');
    }
}
