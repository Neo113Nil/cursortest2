package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.epx;
import xsna.rl3;
import xsna.zrp;

/* compiled from: OpenSectionViewStyle.kt */
/* loaded from: classes16.dex */
public final class OpenSectionViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<OpenSectionViewStyle> CREATOR = new a();
    public final ButtonStyle b;
    public final ButtonIcon c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenSectionViewStyle.kt */
    public static final class ButtonIcon {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonIcon[] $VALUES;
        public static final ButtonIcon ADD;
        public static final a Companion;
        public static final ButtonIcon NONE;
        private final String iconName;

        /* compiled from: OpenSectionViewStyle.kt */
        public static final class a {
            public static ButtonIcon a(String str) {
                ButtonIcon buttonIcon;
                ButtonIcon[] values = ButtonIcon.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        buttonIcon = null;
                        break;
                    }
                    buttonIcon = values[i];
                    if (epx.f(buttonIcon.h(), str)) {
                        break;
                    }
                    i++;
                }
                return buttonIcon == null ? ButtonIcon.NONE : buttonIcon;
            }
        }

        static {
            ButtonIcon buttonIcon = new ButtonIcon("NONE", 0, "none");
            NONE = buttonIcon;
            ButtonIcon buttonIcon2 = new ButtonIcon("ADD", 1, "add");
            ADD = buttonIcon2;
            ButtonIcon[] buttonIconArr = {buttonIcon, buttonIcon2};
            $VALUES = buttonIconArr;
            $ENTRIES = new asp(buttonIconArr);
            Companion = new a();
        }

        public ButtonIcon(String str, int i, String str2) {
            this.iconName = str2;
        }

        public static ButtonIcon valueOf(String str) {
            return (ButtonIcon) Enum.valueOf(ButtonIcon.class, str);
        }

        public static ButtonIcon[] values() {
            return (ButtonIcon[]) $VALUES.clone();
        }

        public final String h() {
            return this.iconName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenSectionViewStyle.kt */
    public static final class ButtonStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final a Companion;
        public static final ButtonStyle FLAT;
        public static final ButtonStyle NONE;
        public static final ButtonStyle SQUARE;
        public static final ButtonStyle SQUARE_THEMED;
        public static final ButtonStyle SearchNavigationLinks;
        private final String apiName;

        /* compiled from: OpenSectionViewStyle.kt */
        public static final class a {
            public static ButtonStyle a(String str) {
                ButtonStyle buttonStyle;
                ButtonStyle[] values = ButtonStyle.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        buttonStyle = null;
                        break;
                    }
                    buttonStyle = values[i];
                    if (epx.f(buttonStyle.h(), str)) {
                        break;
                    }
                    i++;
                }
                return buttonStyle == null ? ButtonStyle.NONE : buttonStyle;
            }
        }

        static {
            ButtonStyle buttonStyle = new ButtonStyle("NONE", 0, "none");
            NONE = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("SQUARE", 1, "square");
            SQUARE = buttonStyle2;
            ButtonStyle buttonStyle3 = new ButtonStyle("SQUARE_THEMED", 2, "square_theme");
            SQUARE_THEMED = buttonStyle3;
            ButtonStyle buttonStyle4 = new ButtonStyle("FLAT", 3, "flat");
            FLAT = buttonStyle4;
            ButtonStyle buttonStyle5 = new ButtonStyle("SearchNavigationLinks", 4, "search_navigation_link");
            SearchNavigationLinks = buttonStyle5;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4, buttonStyle5};
            $VALUES = buttonStyleArr;
            $ENTRIES = new asp(buttonStyleArr);
            Companion = new a();
        }

        public ButtonStyle(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<OpenSectionViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OpenSectionViewStyle a(Serializer serializer) {
            return new OpenSectionViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenSectionViewStyle[i];
        }
    }

    public OpenSectionViewStyle(ButtonStyle buttonStyle, ButtonIcon buttonIcon) {
        this.b = buttonStyle;
        this.c = buttonIcon;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.h());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new OpenSectionViewStyle(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenSectionViewStyle)) {
            return false;
        }
        OpenSectionViewStyle openSectionViewStyle = (OpenSectionViewStyle) obj;
        return this.b == openSectionViewStyle.b && this.c == openSectionViewStyle.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenSectionViewStyle(buttonStyle=" + this.b + ", icon=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenSectionViewStyle(int i) {
        this(r0, r3 == null ? ButtonIcon.NONE : r3);
        ButtonStyle.Companion.getClass();
        ButtonStyle buttonStyle = (ButtonStyle) rl3.S(i / 1000, ButtonStyle.values());
        buttonStyle = buttonStyle == null ? ButtonStyle.NONE : buttonStyle;
        ButtonIcon.Companion.getClass();
        ButtonIcon buttonIcon = (ButtonIcon) rl3.S(i % 1000, ButtonIcon.values());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenSectionViewStyle(Serializer serializer) {
        this(r0, ButtonIcon.a.a(r3));
        ButtonStyle.a aVar = ButtonStyle.Companion;
        String H = serializer.H();
        aVar.getClass();
        ButtonStyle a2 = ButtonStyle.a.a(H);
        ButtonIcon.a aVar2 = ButtonIcon.Companion;
        String I = serializer.I();
        aVar2.getClass();
    }
}
