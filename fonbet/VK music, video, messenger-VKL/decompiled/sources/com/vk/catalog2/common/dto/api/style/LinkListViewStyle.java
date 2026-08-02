package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: LinkListViewStyle.kt */
/* loaded from: classes16.dex */
public final class LinkListViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<LinkListViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkListViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style None;
        public static final Style Small;
        public static final Style WithArrowButton;
        private final String value;

        /* compiled from: LinkListViewStyle.kt */
        public static final class a {
            public static Style a(String str) {
                Object obj;
                Iterator<E> it = Style.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Style) obj).i(), str)) {
                        break;
                    }
                }
                Style style = (Style) obj;
                return style == null ? Style.None : style;
            }
        }

        static {
            Style style = new Style("WithArrowButton", 0, "open_section_arrow_button");
            WithArrowButton = style;
            Style style2 = new Style("Small", 1, "small");
            Small = style2;
            Style style3 = new Style("None", 2, null);
            None = style3;
            Style[] styleArr = {style, style2, style3};
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
    public static final class a extends Serializer.c<LinkListViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LinkListViewStyle a(Serializer serializer) {
            return new LinkListViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkListViewStyle[i];
        }
    }

    public LinkListViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.i());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new LinkListViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkListViewStyle) && this.b == ((LinkListViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LinkListViewStyle(style=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkListViewStyle(Serializer serializer) {
        this(Style.a.a(r2));
        Style.a aVar = Style.Companion;
        String H = serializer.H();
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkListViewStyle(int i) {
        this(r2 == null ? Style.None : r2);
        Style.Companion.getClass();
        Style style = (Style) j5g.b0(i, Style.h());
    }
}
