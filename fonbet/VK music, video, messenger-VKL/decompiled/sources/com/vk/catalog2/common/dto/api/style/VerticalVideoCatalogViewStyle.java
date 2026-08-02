package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.epx;
import xsna.rl3;
import xsna.zrp;

/* compiled from: VerticalVideoCatalogViewStyle.kt */
/* loaded from: classes16.dex */
public final class VerticalVideoCatalogViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<VerticalVideoCatalogViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerticalVideoCatalogViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style FullPlay;
        public static final Style FullPlayDescPubdateAutor;
        public static final Style FullPlayDescViews;
        public static final Style FullPlayDescViewsAuthor;
        public static final Style None;
        public static final Style Search;
        public static final Style TeaserPlay;
        public static final Style TeaserPlayDescPubdateAutor;
        public static final Style TeaserPlayDescViews;
        public static final Style TeaserPlayDescViewsAuthor;
        private final String apiName;

        /* compiled from: VerticalVideoCatalogViewStyle.kt */
        public static final class a {
        }

        static {
            Style style = new Style("None", 0, "none");
            None = style;
            Style style2 = new Style("Search", 1, "search");
            Search = style2;
            Style style3 = new Style("FullPlay", 2, "fullplay");
            FullPlay = style3;
            Style style4 = new Style("FullPlayDescViews", 3, "fullplay_desc_views");
            FullPlayDescViews = style4;
            Style style5 = new Style("FullPlayDescViewsAuthor", 4, "fullplay_desc_views_author");
            FullPlayDescViewsAuthor = style5;
            Style style6 = new Style("FullPlayDescPubdateAutor", 5, "fullplay_desc_pubdate_author");
            FullPlayDescPubdateAutor = style6;
            Style style7 = new Style("TeaserPlay", 6, "teaserplay");
            TeaserPlay = style7;
            Style style8 = new Style("TeaserPlayDescViews", 7, "teaserplay_desc_views");
            TeaserPlayDescViews = style8;
            Style style9 = new Style("TeaserPlayDescViewsAuthor", 8, "teaserplay_desc_views_author");
            TeaserPlayDescViewsAuthor = style9;
            Style style10 = new Style("TeaserPlayDescPubdateAutor", 9, "teaserplay_desc_pubdate_author");
            TeaserPlayDescPubdateAutor = style10;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8, style9, style10};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VerticalVideoCatalogViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VerticalVideoCatalogViewStyle a(Serializer serializer) {
            return new VerticalVideoCatalogViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VerticalVideoCatalogViewStyle[i];
        }
    }

    public VerticalVideoCatalogViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new VerticalVideoCatalogViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerticalVideoCatalogViewStyle) && this.b == ((VerticalVideoCatalogViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VerticalVideoCatalogViewStyle(style=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerticalVideoCatalogViewStyle(Serializer serializer) {
        this(r2 == null ? Style.None : r2);
        Style.a aVar = Style.Companion;
        int u = serializer.u();
        aVar.getClass();
        Style style = (Style) rl3.S(u, Style.values());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerticalVideoCatalogViewStyle(int i) {
        this(r2 == null ? Style.None : r2);
        Style.Companion.getClass();
        Style style = (Style) rl3.S(i, Style.values());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerticalVideoCatalogViewStyle(String str) {
        this(r3 == null ? Style.None : r3);
        Style style;
        Style.Companion.getClass();
        Style[] values = Style.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                style = null;
                break;
            }
            style = values[i];
            if (epx.f(style.h(), str)) {
                break;
            } else {
                i++;
            }
        }
    }
}
