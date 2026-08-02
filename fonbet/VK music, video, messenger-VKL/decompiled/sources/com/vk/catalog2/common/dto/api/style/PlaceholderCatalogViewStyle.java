package com.vk.catalog2.common.dto.api.style;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: PlaceholderCatalogViewStyle.kt */
/* loaded from: classes16.dex */
public final class PlaceholderCatalogViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<PlaceholderCatalogViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlaceholderCatalogViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style Elongate;
        public static final Style Fit;
        public static final Style Flat;
        public static final Style KidsFilter;
        public static final Style MagicWand;
        public static final Style None;
        public static final Style Secondary;
        public static final Style SingleLine;
        public static final Style VKVideoBanner;
        public static final Style VkVideoKidsBanner;
        public static final Style VkVideoMusicBanner;
        public static final Style WithButton;
        public static final Style WithPointer;
        private final String value;

        /* compiled from: PlaceholderCatalogViewStyle.kt */
        public static final class a {
        }

        static {
            Style style = new Style("None", 0, null);
            None = style;
            Style style2 = new Style("Flat", 1, "flat");
            Flat = style2;
            Style style3 = new Style("MagicWand", 2, "magic_wand");
            MagicWand = style3;
            Style style4 = new Style("Secondary", 3, X3.i.Y);
            Secondary = style4;
            Style style5 = new Style("SingleLine", 4, "single_line");
            SingleLine = style5;
            Style style6 = new Style("KidsFilter", 5, "kids_filters");
            KidsFilter = style6;
            Style style7 = new Style("WithButton", 6, "with_button");
            WithButton = style7;
            Style style8 = new Style("Fit", 7, "fit");
            Fit = style8;
            Style style9 = new Style("WithPointer", 8, "with_pointer");
            WithPointer = style9;
            Style style10 = new Style("Elongate", 9, "elongate");
            Elongate = style10;
            Style style11 = new Style("VKVideoBanner", 10, "vk_video_onboarding_banner");
            VKVideoBanner = style11;
            Style style12 = new Style("VkVideoKidsBanner", 11, "vk_video_kids_onboarding_banner");
            VkVideoKidsBanner = style12;
            Style style13 = new Style("VkVideoMusicBanner", 12, "vk_video_music_onboarding_banner");
            VkVideoMusicBanner = style13;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8, style9, style10, style11, style12, style13};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, String str2) {
            this.value = str2;
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
            return this.value;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PlaceholderCatalogViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaceholderCatalogViewStyle a(Serializer serializer) {
            return new PlaceholderCatalogViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaceholderCatalogViewStyle[i];
        }
    }

    public PlaceholderCatalogViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new PlaceholderCatalogViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlaceholderCatalogViewStyle) && this.b == ((PlaceholderCatalogViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PlaceholderCatalogViewStyle(style=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaceholderCatalogViewStyle(Serializer serializer) {
        this(r2 == null ? Style.None : r2);
        Style.a aVar = Style.Companion;
        int u = serializer.u();
        aVar.getClass();
        Style style = (Style) j5g.b0(u, Style.h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaceholderCatalogViewStyle(int i) {
        this(r2 == null ? Style.None : r2);
        Style.Companion.getClass();
        Style style = (Style) j5g.b0(i, Style.h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaceholderCatalogViewStyle(String str) {
        this(r1 == null ? Style.None : r1);
        Object obj;
        Style.Companion.getClass();
        Iterator<E> it = Style.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((Style) obj).i(), str)) {
                    break;
                }
            }
        }
        Style style = (Style) obj;
    }
}
