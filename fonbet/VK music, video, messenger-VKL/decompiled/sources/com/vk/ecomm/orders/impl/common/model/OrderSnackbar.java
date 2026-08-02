package com.vk.ecomm.orders.impl.common.model;

import xsna.asp;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: OrderSnackbar.kt */
/* loaded from: classes18.dex */
public final class OrderSnackbar {
    public final tlo0.f a;
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrderSnackbar.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style Error;
        public static final Style Normal;

        static {
            Style style = new Style("Normal", 0);
            Normal = style;
            Style style2 = new Style("Error", 1);
            Error = style2;
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

    public OrderSnackbar(tlo0.f fVar, Style style) {
        this.a = fVar;
        this.b = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSnackbar)) {
            return false;
        }
        OrderSnackbar orderSnackbar = (OrderSnackbar) obj;
        return this.a.equals(orderSnackbar.a) && this.b == orderSnackbar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "OrderSnackbar(title=" + this.a + ", style=" + this.b + ')';
    }
}
