package com.vk.core.compose.component.alert;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.asp;
import xsna.epx;
import xsna.gzs;
import xsna.s3q0;
import xsna.sf3;
import xsna.zrp;

/* compiled from: Alert.kt */
/* loaded from: classes17.dex */
public final class Alert$Button {
    public final String a;
    public final gzs<s3q0> b;
    public final Style c;
    public final SemanticsConfiguration d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Alert.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style Negative;
        public static final Style Neutral;

        static {
            Style style = new Style("Neutral", 0);
            Neutral = style;
            Style style2 = new Style("Negative", 1);
            Negative = style2;
            Style[] styleArr = {style, style2};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public Alert$Button(String str, gzs<s3q0> gzsVar, Style style, SemanticsConfiguration semanticsConfiguration) {
        this.a = str;
        this.b = gzsVar;
        this.c = style;
        this.d = semanticsConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alert$Button)) {
            return false;
        }
        Alert$Button alert$Button = (Alert$Button) obj;
        return epx.f(this.a, alert$Button.a) && epx.f(this.b, alert$Button.b) && this.c == alert$Button.c && epx.f(this.d, alert$Button.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + sf3.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        SemanticsConfiguration semanticsConfiguration = this.d;
        return hashCode + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode());
    }

    public final String toString() {
        return "Button(text=" + this.a + ", onClick=" + this.b + ", style=" + this.c + ", semanticsConfiguration=" + this.d + ')';
    }
}
