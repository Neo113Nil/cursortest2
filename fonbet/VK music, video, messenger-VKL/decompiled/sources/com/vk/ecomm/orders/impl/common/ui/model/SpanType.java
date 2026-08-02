package com.vk.ecomm.orders.impl.common.ui.model;

import xsna.asp;
import xsna.zrp;

/* compiled from: SpanValue.kt */
/* loaded from: classes18.dex */
public interface SpanType {

    /* compiled from: SpanValue.kt */
    public static final class Text implements SpanType {
        public final Color a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpanValue.kt */
        public static final class Color {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Color[] $VALUES;
            public static final Color Primary;
            public static final Color Secondary;

            static {
                Color color = new Color("Primary", 0);
                Primary = color;
                Color color2 = new Color("Secondary", 1);
                Secondary = color2;
                Color[] colorArr = {color, color2};
                $VALUES = colorArr;
                $ENTRIES = new asp(colorArr);
            }

            public Color() {
                throw null;
            }

            public static Color valueOf(String str) {
                return (Color) Enum.valueOf(Color.class, str);
            }

            public static Color[] values() {
                return (Color[]) $VALUES.clone();
            }
        }

        public Text(Color color) {
            this.a = color;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && this.a == ((Text) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Text(color=" + this.a + ')';
        }
    }

    /* compiled from: SpanValue.kt */
    public static final class a implements SpanType {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 763813114;
        }

        public final String toString() {
            return "Link";
        }
    }
}
