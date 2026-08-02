package com.vk.ecomm.market.good.ui.restriction;

import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: ProductCardRestrictionViewState.kt */
/* loaded from: classes18.dex */
public final class ProductCardRestrictionViewState {
    public final Icon a;
    public final b b;
    public final Button c;
    public final Button d;

    /* compiled from: ProductCardRestrictionViewState.kt */
    public static final class Button {
        public final Mode a;
        public final c b;
        public final boolean c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProductCardRestrictionViewState.kt */
        public static final class Mode {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Mode[] $VALUES;
            public static final Mode Primary;
            public static final Mode Tertiary;

            static {
                Mode mode = new Mode("Primary", 0);
                Primary = mode;
                Mode mode2 = new Mode("Tertiary", 1);
                Tertiary = mode2;
                Mode[] modeArr = {mode, mode2};
                $VALUES = modeArr;
                $ENTRIES = new asp(modeArr);
            }

            public Mode() {
                throw null;
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }
        }

        public Button(Mode mode, c cVar, boolean z) {
            this.a = mode;
            this.b = cVar;
            this.c = z;
        }

        public static Button a(Button button, boolean z) {
            Mode mode = button.a;
            c cVar = button.b;
            button.getClass();
            return new Button(mode, cVar, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.a == button.a && epx.f(this.b, button.b) && this.c == button.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(mode=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", isLoading=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductCardRestrictionViewState.kt */
    public static final class Icon {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Icon[] $VALUES;
        public static final Icon Error;
        public static final Icon Help;
        public static final Icon Hide;
        public static final Icon Lock;

        static {
            Icon icon = new Icon("Error", 0);
            Error = icon;
            Icon icon2 = new Icon("Lock", 1);
            Lock = icon2;
            Icon icon3 = new Icon("Help", 2);
            Help = icon3;
            Icon icon4 = new Icon("Hide", 3);
            Hide = icon4;
            Icon[] iconArr = {icon, icon2, icon3, icon4};
            $VALUES = iconArr;
            $ENTRIES = new asp(iconArr);
        }

        public Icon() {
            throw null;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    public ProductCardRestrictionViewState(Icon icon, b bVar, Button button, Button button2) {
        this.a = icon;
        this.b = bVar;
        this.c = button;
        this.d = button2;
    }

    public static ProductCardRestrictionViewState a(ProductCardRestrictionViewState productCardRestrictionViewState, Button button) {
        return new ProductCardRestrictionViewState(productCardRestrictionViewState.a, productCardRestrictionViewState.b, button, productCardRestrictionViewState.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCardRestrictionViewState)) {
            return false;
        }
        ProductCardRestrictionViewState productCardRestrictionViewState = (ProductCardRestrictionViewState) obj;
        return this.a == productCardRestrictionViewState.a && epx.f(this.b, productCardRestrictionViewState.b) && epx.f(this.c, productCardRestrictionViewState.c) && epx.f(this.d, productCardRestrictionViewState.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Button button = this.c;
        int hashCode2 = (hashCode + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.d;
        return hashCode2 + (button2 != null ? button2.hashCode() : 0);
    }

    public final String toString() {
        return "ProductCardRestrictionViewState(icon=" + this.a + ", restriction=" + this.b + ", firstButton=" + this.c + ", secondButton=" + this.d + ')';
    }
}
