package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.epx;
import xsna.rl3;
import xsna.zrp;

/* compiled from: PodcastSliderViewStyle.kt */
/* loaded from: classes16.dex */
public final class PodcastSliderViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<PodcastSliderViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PodcastSliderViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style None;
        public static final Style Search;
        private final String apiName;

        /* compiled from: PodcastSliderViewStyle.kt */
        public static final class a {
            public static Style a(String str) {
                Style style;
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
                    }
                    i++;
                }
                return style == null ? Style.None : style;
            }
        }

        static {
            Style style = new Style("None", 0, "none");
            None = style;
            Style style2 = new Style("Search", 1, "search");
            Search = style2;
            Style[] styleArr = {style, style2};
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
    public static final class a extends Serializer.c<PodcastSliderViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PodcastSliderViewStyle a(Serializer serializer) {
            return new PodcastSliderViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodcastSliderViewStyle[i];
        }
    }

    public PodcastSliderViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new PodcastSliderViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PodcastSliderViewStyle) && this.b == ((PodcastSliderViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PodcastSliderViewStyle(style=" + this.b + ')';
    }

    public final boolean zb() {
        return this.b == Style.Search;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PodcastSliderViewStyle(Serializer serializer) {
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
    public PodcastSliderViewStyle(int i) {
        this(r2 == null ? Style.None : r2);
        Style.Companion.getClass();
        Style style = (Style) rl3.S(i, Style.values());
    }
}
