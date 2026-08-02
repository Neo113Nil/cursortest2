package com.vk.movika.sdk.base.model;

import xsna.asp;
import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.zrp;

/* loaded from: classes3.dex */
public final class VideoVariant {
    public final String a;
    public final Type b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;

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

    public VideoVariant(String str, Type type, String str2, String str3, Long l, Long l2, String str4, String str5, String str6) {
        this.a = str;
        this.b = type;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = l2;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVariant)) {
            return false;
        }
        VideoVariant videoVariant = (VideoVariant) obj;
        return epx.f(this.a, videoVariant.a) && this.b == videoVariant.b && epx.f(this.c, videoVariant.c) && epx.f(this.d, videoVariant.d) && epx.f(this.e, videoVariant.e) && epx.f(this.f, videoVariant.f) && epx.f(this.g, videoVariant.g) && epx.f(this.h, videoVariant.h) && epx.f(this.i, videoVariant.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.e;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVariant(url=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", standard=");
        n6j.b(sb, this.c, ", resolution=", this.d, ", size=");
        sb.append(this.e);
        sb.append(", bitrate=");
        sb.append(this.f);
        sb.append(", cover=");
        n6j.b(sb, this.g, ", preview=", this.h, ", payload=");
        return i5s.a(sb, this.i, ")");
    }
}
