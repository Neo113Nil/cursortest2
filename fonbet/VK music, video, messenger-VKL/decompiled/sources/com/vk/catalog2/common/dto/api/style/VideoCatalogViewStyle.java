package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: VideoCatalogViewStyle.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<VideoCatalogViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCatalogViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style AuthorVideos;
        public static final Style AuthorsCircle;
        public static final a Companion;
        public static final Style InvisibleAuthor;
        public static final Style Large;
        public static final Style LargeWithDescription;
        public static final Style None;
        public static final Style Showcase;
        public static final Style ShowcaseWithDescription;
        public static final Style VideoPage;
        public static final Style WithDescription;
        private final String apiName;

        /* compiled from: VideoCatalogViewStyle.kt */
        public static final class a {
        }

        static {
            Style style = new Style("None", 0, "none");
            None = style;
            Style style2 = new Style("AuthorVideos", 1, "authors_video");
            AuthorVideos = style2;
            Style style3 = new Style("AuthorsCircle", 2, "author_circle");
            AuthorsCircle = style3;
            Style style4 = new Style("InvisibleAuthor", 3, "invisible_author");
            InvisibleAuthor = style4;
            Style style5 = new Style("Showcase", 4, "showcase");
            Showcase = style5;
            Style style6 = new Style("ShowcaseWithDescription", 5, "showcase_with_description");
            ShowcaseWithDescription = style6;
            Style style7 = new Style("Large", 6, "large");
            Large = style7;
            Style style8 = new Style("WithDescription", 7, "with_description");
            WithDescription = style8;
            Style style9 = new Style("LargeWithDescription", 8, "large_with_description");
            LargeWithDescription = style9;
            Style style10 = new Style("VideoPage", 9, "video_page");
            VideoPage = style10;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8, style9, style10};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static zrp<Style> i() {
            return $ENTRIES;
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
    public static final class a extends Serializer.c<VideoCatalogViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoCatalogViewStyle a(Serializer serializer) {
            return new VideoCatalogViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoCatalogViewStyle[i];
        }
    }

    public VideoCatalogViewStyle(Style style) {
        this.b = style;
    }

    public final boolean Ab() {
        return this.b == Style.InvisibleAuthor;
    }

    public final boolean Bb() {
        Style style = Style.Large;
        Style style2 = this.b;
        return style2 == style || style2 == Style.LargeWithDescription;
    }

    public final boolean Cb() {
        Style style = Style.WithDescription;
        Style style2 = this.b;
        return style2 == style || style2 == Style.LargeWithDescription || style2 == Style.ShowcaseWithDescription;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new VideoCatalogViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoCatalogViewStyle) && this.b == ((VideoCatalogViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VideoCatalogViewStyle(style=" + this.b + ')';
    }

    public final Style zb() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoCatalogViewStyle(Serializer serializer) {
        this(r2 == null ? Style.None : r2);
        Style.a aVar = Style.Companion;
        int u = serializer.u();
        aVar.getClass();
        Style style = (Style) j5g.b0(u, Style.i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoCatalogViewStyle(int i) {
        this(r2 == null ? Style.None : r2);
        Style.Companion.getClass();
        Style style = (Style) j5g.b0(i, Style.i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoCatalogViewStyle(String str) {
        this(r1 == null ? Style.None : r1);
        Object obj;
        Style.Companion.getClass();
        Iterator<E> it = Style.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((Style) obj).h(), str)) {
                    break;
                }
            }
        }
        Style style = (Style) obj;
    }
}
