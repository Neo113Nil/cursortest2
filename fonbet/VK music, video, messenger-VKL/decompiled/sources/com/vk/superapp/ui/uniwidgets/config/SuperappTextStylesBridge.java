package com.vk.superapp.ui.uniwidgets.config;

import com.vk.superapp.bridges.SuperappUiDesignBridge;
import io.reactivex.rxjava3.subjects.b;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.dzg0;
import xsna.zrp;

/* compiled from: SuperappTextStylesBridge.kt */
/* loaded from: classes11.dex */
public interface SuperappTextStylesBridge {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperappTextStylesBridge.kt */
    /* loaded from: classes6.dex */
    public static final class FontWeight {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FontWeight[] $VALUES;
        public static final FontWeight BOLD;
        public static final FontWeight LIGHT;
        public static final FontWeight MEDIUM;
        public static final FontWeight REGULAR;

        /* compiled from: SuperappTextStylesBridge.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FontWeight.values().length];
                try {
                    iArr[FontWeight.LIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FontWeight.REGULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FontWeight.MEDIUM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FontWeight.BOLD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            FontWeight fontWeight = new FontWeight("LIGHT", 0);
            LIGHT = fontWeight;
            FontWeight fontWeight2 = new FontWeight("REGULAR", 1);
            REGULAR = fontWeight2;
            FontWeight fontWeight3 = new FontWeight("MEDIUM", 2);
            MEDIUM = fontWeight3;
            FontWeight fontWeight4 = new FontWeight("BOLD", 3);
            BOLD = fontWeight4;
            FontWeight[] fontWeightArr = {fontWeight, fontWeight2, fontWeight3, fontWeight4};
            $VALUES = fontWeightArr;
            $ENTRIES = new asp(fontWeightArr);
        }

        public FontWeight() {
            throw null;
        }

        public static FontWeight valueOf(String str) {
            return (FontWeight) Enum.valueOf(FontWeight.class, str);
        }

        public static FontWeight[] values() {
            return (FontWeight[]) $VALUES.clone();
        }

        public final SuperappUiDesignBridge.FontFamily h() {
            int i = a.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return SuperappUiDesignBridge.FontFamily.LIGHT;
            }
            if (i == 2) {
                return SuperappUiDesignBridge.FontFamily.REGULAR;
            }
            if (i == 3) {
                return SuperappUiDesignBridge.FontFamily.MEDIUM;
            }
            if (i == 4) {
                return SuperappUiDesignBridge.FontFamily.BOLD;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: SuperappTextStylesBridge.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final FontWeight d;
        public final dzg0 e;

        public a(float f, float f2, float f3, FontWeight fontWeight, dzg0 dzg0Var) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = fontWeight;
            this.e = dzg0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && this.d == aVar.d && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + b.a(this.c, b.a(this.b, Float.hashCode(this.a) * 31, 31), 31)) * 31);
        }

        public final String toString() {
            return "TextStyle(size=" + this.a + ", lineHeight=" + this.b + ", letterSpacing=" + this.c + ", defaultWeight=" + this.d + ", fontProvider=" + this.e + ')';
        }
    }

    a a();

    a b();

    a c();

    a d();

    a e();

    a f();

    a g();

    a h();

    a i();
}
