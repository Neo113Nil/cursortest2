package com.vk.core.ui.bottomsheet.actionsheet;

import com.vkontakte.android.R;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.yu20;
import xsna.zrp;

/* compiled from: ModalActionSheetItem.kt */
/* loaded from: classes17.dex */
public final class ModalActionSheetListItem extends yu20 {
    public final int a;
    public final Appearance b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final IconSize g;
    public final boolean h;
    public final boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModalActionSheetItem.kt */
    public static final class Appearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance Default;
        public static final Appearance Disabled;
        public static final Appearance Negative;
        public static final Appearance TintedDisable;
        private final int iconColor;
        private final int textColor;

        static {
            Appearance appearance = new Appearance("Default", 0, R.attr.vk_ui_text_primary, R.attr.vk_ui_icon_accent);
            Default = appearance;
            Appearance appearance2 = new Appearance("Negative", 1, R.attr.vk_ui_text_negative, R.attr.vk_ui_icon_negative);
            Negative = appearance2;
            Appearance appearance3 = new Appearance("Disabled", 2, R.attr.vk_ui_text_secondary, R.attr.vk_ui_icon_secondary);
            Disabled = appearance3;
            Appearance appearance4 = new Appearance("TintedDisable", 3, R.attr.vk_ui_text_secondary, R.attr.vk_ui_icon_secondary);
            TintedDisable = appearance4;
            Appearance[] appearanceArr = {appearance, appearance2, appearance3, appearance4};
            $VALUES = appearanceArr;
            $ENTRIES = new asp(appearanceArr);
        }

        public Appearance(String str, int i, int i2, int i3) {
            this.textColor = i2;
            this.iconColor = i3;
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconColor;
        }

        public final int i() {
            return this.textColor;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModalActionSheetItem.kt */
    public static final class IconSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconSize[] $VALUES;
        public static final IconSize Large;
        public static final IconSize Medium;
        public static final IconSize Small;
        private final int size;

        static {
            IconSize iconSize = new IconSize("Small", 0, 20);
            Small = iconSize;
            IconSize iconSize2 = new IconSize("Medium", 1, 24);
            Medium = iconSize2;
            IconSize iconSize3 = new IconSize("Large", 2, 28);
            Large = iconSize3;
            IconSize[] iconSizeArr = {iconSize, iconSize2, iconSize3};
            $VALUES = iconSizeArr;
            $ENTRIES = new asp(iconSizeArr);
        }

        public IconSize(String str, int i, int i2) {
            this.size = i2;
        }

        public static zrp<IconSize> h() {
            return $ENTRIES;
        }

        public static IconSize valueOf(String str) {
            return (IconSize) Enum.valueOf(IconSize.class, str);
        }

        public static IconSize[] values() {
            return (IconSize[]) $VALUES.clone();
        }

        public final int i() {
            return this.size;
        }
    }

    public ModalActionSheetListItem(int i, Appearance appearance, String str, String str2, String str3, int i2, IconSize iconSize, boolean z, boolean z2, int i3) {
        appearance = (i3 & 2) != 0 ? Appearance.Default : appearance;
        str2 = (i3 & 8) != 0 ? null : str2;
        str3 = (i3 & 16) != 0 ? null : str3;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        iconSize = (i3 & 64) != 0 ? IconSize.Large : iconSize;
        z = (i3 & 128) != 0 ? false : z;
        z2 = (i3 & 256) != 0 ? false : z2;
        this.a = i;
        this.b = appearance;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i2;
        this.g = iconSize;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalActionSheetListItem)) {
            return false;
        }
        ModalActionSheetListItem modalActionSheetListItem = (ModalActionSheetListItem) obj;
        return this.a == modalActionSheetListItem.a && this.b == modalActionSheetListItem.b && epx.f(this.c, modalActionSheetListItem.c) && epx.f(this.d, modalActionSheetListItem.d) && epx.f(this.e, modalActionSheetListItem.e) && this.f == modalActionSheetListItem.f && this.g == modalActionSheetListItem.g && this.h == modalActionSheetListItem.h && this.i == modalActionSheetListItem.i;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Boolean.hashCode(this.i) + qoy.b((this.g.hashCode() + shy.a(this.f, (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalActionSheetListItem(id=");
        sb.append(this.a);
        sb.append(", appearance=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", alias=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconResId=");
        sb.append(this.f);
        sb.append(", iconSize=");
        sb.append(this.g);
        sb.append(", isChecked=");
        sb.append(this.h);
        sb.append(", isMultilineTitle=");
        return q0.a(sb, this.i, ')');
    }
}
