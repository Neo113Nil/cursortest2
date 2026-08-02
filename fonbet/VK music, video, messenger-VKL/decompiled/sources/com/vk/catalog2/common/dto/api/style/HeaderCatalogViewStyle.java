package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: HeaderCatalogViewStyle.kt */
/* loaded from: classes16.dex */
public final class HeaderCatalogViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<HeaderCatalogViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HeaderCatalogViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style Flat;
        public static final Style Highlight;
        public static final Style None;
        public static final Style ProfileHeader;
        public static final Style TwoLine;
        private final String value;

        /* compiled from: HeaderCatalogViewStyle.kt */
        public static final class a {
        }

        static {
            Style style = new Style("None", 0, null);
            None = style;
            Style style2 = new Style("Highlight", 1, "highlight");
            Highlight = style2;
            Style style3 = new Style("Flat", 2, "flat");
            Flat = style3;
            Style style4 = new Style("ProfileHeader", 3, "profile_header");
            ProfileHeader = style4;
            Style style5 = new Style("TwoLine", 4, "two_line_header");
            TwoLine = style5;
            Style[] styleArr = {style, style2, style3, style4, style5};
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
    public static final class a extends Serializer.c<HeaderCatalogViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HeaderCatalogViewStyle a(Serializer serializer) {
            return new HeaderCatalogViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HeaderCatalogViewStyle[i];
        }
    }

    public HeaderCatalogViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new HeaderCatalogViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeaderCatalogViewStyle) && this.b == ((HeaderCatalogViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "HeaderCatalogViewStyle(style=" + this.b + ')';
    }

    public final Style zb() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HeaderCatalogViewStyle(Serializer serializer) {
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
    public HeaderCatalogViewStyle(int i) {
        this(r2 == null ? Style.None : r2);
        Style.Companion.getClass();
        Style style = (Style) j5g.b0(i, Style.h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HeaderCatalogViewStyle(String str) {
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
