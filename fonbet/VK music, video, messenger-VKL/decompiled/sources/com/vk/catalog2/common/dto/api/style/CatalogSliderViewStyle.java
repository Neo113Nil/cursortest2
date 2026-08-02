package com.vk.catalog2.common.dto.api.style;

import com.unity3d.ads.BuildConfig;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: CatalogSliderViewStyle.kt */
/* loaded from: classes16.dex */
public final class CatalogSliderViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<CatalogSliderViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSliderViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style Default;
        public static final Style GraySticky;
        public static final Style Inline;
        public static final Style None;
        private final String value;

        /* compiled from: CatalogSliderViewStyle.kt */
        public static final class a {
        }

        static {
            Style style = new Style("None", 0, null);
            None = style;
            Style style2 = new Style("Default", 1, BuildConfig.FLAVOR);
            Default = style2;
            Style style3 = new Style("Inline", 2, "inline");
            Inline = style3;
            Style style4 = new Style("GraySticky", 3, "gray_sticky");
            GraySticky = style4;
            Style[] styleArr = {style, style2, style3, style4};
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
    public static final class a extends Serializer.c<CatalogSliderViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSliderViewStyle a(Serializer serializer) {
            return new CatalogSliderViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSliderViewStyle[i];
        }
    }

    public CatalogSliderViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new CatalogSliderViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogSliderViewStyle) && this.b == ((CatalogSliderViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CatalogSliderViewStyle(style=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSliderViewStyle(Serializer serializer) {
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
    public CatalogSliderViewStyle(int i) {
        this(r2 == null ? Style.None : r2);
        Style.Companion.getClass();
        Style style = (Style) j5g.b0(i, Style.h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSliderViewStyle(String str) {
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
