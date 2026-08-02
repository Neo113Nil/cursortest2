package com.vk.ecomm.market.good.ui;

import com.ironsource.X3;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: ProductActionButtonsItem.kt */
/* loaded from: classes18.dex */
public final class ProductActionButton {
    public final CharSequence a;
    public final Type b;
    public final Style c;
    public final Action d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductActionButtonsItem.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style PRIMARY;
        public static final Style SECONDARY;
        private final String style;

        /* compiled from: ProductActionButtonsItem.kt */
        public static final class a {
        }

        static {
            Style style = new Style("PRIMARY", 0, "primary");
            PRIMARY = style;
            Style style2 = new Style("SECONDARY", 1, X3.i.Y);
            SECONDARY = style2;
            Style[] styleArr = {style, style2};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, String str2) {
            this.style = str2;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public final String h() {
            return this.style;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProductActionButtonsItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CONTACT;
        public static final Type CUSTOM;
        public static final Type LINK;
        public static final Type LINK_MINIAPP;
        public static final Type NATIVE_CART;
        public static final Type UNDEFINED;

        static {
            Type type = new Type("NATIVE_CART", 0);
            NATIVE_CART = type;
            Type type2 = new Type("CONTACT", 1);
            CONTACT = type2;
            Type type3 = new Type("LINK", 2);
            LINK = type3;
            Type type4 = new Type("LINK_MINIAPP", 3);
            LINK_MINIAPP = type4;
            Type type5 = new Type("CUSTOM", 4);
            CUSTOM = type5;
            Type type6 = new Type("UNDEFINED", 5);
            UNDEFINED = type6;
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

    /* compiled from: ProductActionButtonsItem.kt */
    public static final class a {
        public static ProductActionButton a(LinkButton linkButton) {
            Style style = null;
            if (linkButton == null) {
                return null;
            }
            String str = linkButton.b;
            Type type = Type.CUSTOM;
            Style.a aVar = Style.Companion;
            String str2 = linkButton.d;
            aVar.getClass();
            Style[] values = Style.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Style style2 = values[i];
                String h = style2.h();
                Locale locale = Locale.ROOT;
                if (h.toLowerCase(locale).equals(str2 != null ? str2.toLowerCase(locale) : null)) {
                    style = style2;
                    break;
                }
                i++;
            }
            if (style == null) {
                style = Style.PRIMARY;
            }
            return new ProductActionButton(str, type, style, linkButton.c);
        }
    }

    public ProductActionButton(CharSequence charSequence, Type type, Style style, Action action) {
        this.a = charSequence;
        this.b = type;
        this.c = style;
        this.d = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductActionButton)) {
            return false;
        }
        ProductActionButton productActionButton = (ProductActionButton) obj;
        return epx.f(this.a, productActionButton.a) && this.b == productActionButton.b && this.c == productActionButton.c && epx.f(this.d, productActionButton.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Action action = this.d;
        return hashCode + (action == null ? 0 : action.hashCode());
    }

    public final String toString() {
        return "ProductActionButton(title=" + ((Object) this.a) + ", type=" + this.b + ", style=" + this.c + ", action=" + this.d + ')';
    }
}
