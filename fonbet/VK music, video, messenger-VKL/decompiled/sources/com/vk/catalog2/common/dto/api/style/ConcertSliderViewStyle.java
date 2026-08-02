package com.vk.catalog2.common.dto.api.style;

import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: ConcertSliderViewStyle.kt */
/* loaded from: classes16.dex */
public final class ConcertSliderViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<ConcertSliderViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConcertSliderViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style Default;
        public static final Style None;
        public static final Style Secondary;
        private final String value;

        /* compiled from: ConcertSliderViewStyle.kt */
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
            Style style = new Style("None", 0, null);
            None = style;
            Style style2 = new Style("Default", 1, BuildConfig.FLAVOR);
            Default = style2;
            Style style3 = new Style("Secondary", 2, X3.i.Y);
            Secondary = style3;
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
    public static final class a extends Serializer.c<ConcertSliderViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ConcertSliderViewStyle a(Serializer serializer) {
            return new ConcertSliderViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConcertSliderViewStyle[i];
        }
    }

    public ConcertSliderViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new ConcertSliderViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConcertSliderViewStyle) && this.b == ((ConcertSliderViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ConcertSliderViewStyle(style=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConcertSliderViewStyle(Serializer serializer) {
        this(r2 == null ? Style.None : r2);
        Style.a aVar = Style.Companion;
        int u = serializer.u();
        aVar.getClass();
        Style style = (Style) j5g.b0(u, Style.h());
    }
}
