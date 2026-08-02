package com.vk.stickers.api.models.question;

import xsna.asp;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: StoryQuestionInfo.kt */
/* loaded from: classes5.dex */
public final class StoryQuestionInfo {
    public final String a;
    public final String b;
    public final int c;
    public final a d;
    public final Style e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryQuestionInfo.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style ACCENT;
        public static final Style BLUE;
        public static final a Companion;
        public static final Style DARK;
        public static final Style LIGHT;
        private final String stringValue;

        /* compiled from: StoryQuestionInfo.kt */
        public static final class a {
        }

        static {
            Style style = new Style("LIGHT", 0, "light");
            LIGHT = style;
            Style style2 = new Style("DARK", 1, "black");
            DARK = style2;
            Style style3 = new Style("BLUE", 2, "dark");
            BLUE = style3;
            Style style4 = new Style("ACCENT", 3, "accent");
            ACCENT = style4;
            Style[] styleArr = {style, style2, style3, style4};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, String str2) {
            this.stringValue = str2;
        }

        public static zrp<Style> h() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public final String i() {
            return this.stringValue;
        }
    }

    /* compiled from: StoryQuestionInfo.kt */
    public static final class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public final int i;
        public int j;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
        }

        public static a a(a aVar) {
            int i = aVar.a;
            int i2 = aVar.b;
            int i3 = aVar.c;
            int i4 = aVar.d;
            int i5 = aVar.e;
            int i6 = aVar.f;
            int i7 = aVar.g;
            int i8 = aVar.h;
            int i9 = aVar.i;
            int i10 = aVar.j;
            aVar.getClass();
            return new a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j;
        }

        public final int hashCode() {
            return Integer.hashCode(this.j) + shy.a(this.i, shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewColors(backgroundColor=");
            sb.append(this.a);
            sb.append(", buttonColor=");
            sb.append(this.b);
            sb.append(", questionHintColor=");
            sb.append(this.c);
            sb.append(", questionTextColor=");
            sb.append(this.d);
            sb.append(", buttonHintColor=");
            sb.append(this.e);
            sb.append(", buttonTextColor=");
            sb.append(this.f);
            sb.append(", answerFieldBackgroundColor=");
            sb.append(this.g);
            sb.append(", answerFieldTextColor=");
            sb.append(this.h);
            sb.append(", selectStyleButtonColor=");
            sb.append(this.i);
            sb.append(", cursorColor=");
            return vu5.b(sb, this.j, ')');
        }
    }

    public StoryQuestionInfo(String str, String str2, int i, a aVar, Style style) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = aVar;
        this.e = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryQuestionInfo)) {
            return false;
        }
        StoryQuestionInfo storyQuestionInfo = (StoryQuestionInfo) obj;
        return epx.f(this.a, storyQuestionInfo.a) && epx.f(this.b, storyQuestionInfo.b) && this.c == storyQuestionInfo.c && epx.f(this.d, storyQuestionInfo.d) && this.e == storyQuestionInfo.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        return "StoryQuestionInfo(questionText=" + this.a + ", buttonText=" + this.b + ", layoutWidth=" + this.c + ", colors=" + this.d + ", style=" + this.e + ')';
    }
}
