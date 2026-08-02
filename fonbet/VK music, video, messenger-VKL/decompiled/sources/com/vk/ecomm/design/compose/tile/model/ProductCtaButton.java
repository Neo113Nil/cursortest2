package com.vk.ecomm.design.compose.tile.model;

import xsna.asp;
import xsna.epx;
import xsna.i5s;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ProductCtaButton.kt */
/* loaded from: classes18.dex */
public final class ProductCtaButton {
    public final Type a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductCtaButton.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type AddToCart;
        public static final Type Call;
        public static final Type GoToCart;
        public static final Type Link;
        public static final Type PartnerLink;
        public static final Type Similar;
        public static final Type Write;

        static {
            Type type = new Type("Write", 0);
            Write = type;
            Type type2 = new Type("Call", 1);
            Call = type2;
            Type type3 = new Type("AddToCart", 2);
            AddToCart = type3;
            Type type4 = new Type("GoToCart", 3);
            GoToCart = type4;
            Type type5 = new Type("Link", 4);
            Link = type5;
            Type type6 = new Type("Similar", 5);
            Similar = type6;
            Type type7 = new Type("PartnerLink", 6);
            PartnerLink = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
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

    public ProductCtaButton(Type type, String str) {
        this.a = type;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCtaButton)) {
            return false;
        }
        ProductCtaButton productCtaButton = (ProductCtaButton) obj;
        return this.a == productCtaButton.a && epx.f(this.b, productCtaButton.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCtaButton(type=");
        sb.append(this.a);
        sb.append(", title=");
        return i5s.a(sb, this.b, ", isEnabled=true)");
    }
}
