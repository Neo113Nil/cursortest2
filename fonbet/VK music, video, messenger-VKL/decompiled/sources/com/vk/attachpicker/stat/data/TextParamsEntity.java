package com.vk.attachpicker.stat.data;

import xsna.asp;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: TextParamsEntity.kt */
/* loaded from: classes15.dex */
public final class TextParamsEntity {
    public final Integer a;
    public final int b;
    public final int c;
    public final Align d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextParamsEntity.kt */
    public static final class Align {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;
        public static final Align Center;
        public static final Align End;
        public static final Align Start;

        static {
            Align align = new Align("Start", 0);
            Start = align;
            Align align2 = new Align("Center", 1);
            Center = align2;
            Align align3 = new Align("End", 2);
            End = align3;
            Align[] alignArr = {align, align2, align3};
            $VALUES = alignArr;
            $ENTRIES = new asp(alignArr);
        }

        public Align() {
            throw null;
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    public TextParamsEntity(Integer num, int i, int i2, Align align, String str, String str2, int i3, int i4) {
        this.a = num;
        this.b = i;
        this.c = i2;
        this.d = align;
        this.e = str;
        this.f = str2;
        this.g = i3;
        this.h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextParamsEntity)) {
            return false;
        }
        TextParamsEntity textParamsEntity = (TextParamsEntity) obj;
        return epx.f(this.a, textParamsEntity.a) && this.b == textParamsEntity.b && this.c == textParamsEntity.c && this.d == textParamsEntity.d && epx.f(this.e, textParamsEntity.e) && epx.f(this.f, textParamsEntity.f) && this.g == textParamsEntity.g && this.h == textParamsEntity.h;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Integer.hashCode(this.h) + shy.a(this.g, urd0.a(urd0.a((this.d.hashCode() + shy.a(this.c, shy.a(this.b, (num == null ? 0 : num.hashCode()) * 31, 31), 31)) * 31, 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextParamsEntity(id=");
        sb.append(this.a);
        sb.append(", photoId=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", align=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", font=");
        sb.append(this.f);
        sb.append(", textColor=");
        sb.append(this.g);
        sb.append(", backgroundColor=");
        return vu5.b(sb, this.h, ')');
    }
}
