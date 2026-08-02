package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: AudioBookSliderViewStyle.kt */
/* loaded from: classes16.dex */
public final class AudioBookSliderViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<AudioBookSliderViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioBookSliderViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style None;
        public static final Style Search;
        public static final Style SyntheticOffline;
        private final String apiName;

        /* compiled from: AudioBookSliderViewStyle.kt */
        public static final class a {
            public static Style a(String str) {
                Object obj;
                Iterator<E> it = Style.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Style) obj).h(), str)) {
                        break;
                    }
                }
                Style style = (Style) obj;
                return style == null ? Style.None : style;
            }
        }

        static {
            Style style = new Style("None", 0, "none");
            None = style;
            Style style2 = new Style("Search", 1, "search");
            Search = style2;
            Style style3 = new Style("SyntheticOffline", 2, "synthetic_offline");
            SyntheticOffline = style3;
            Style[] styleArr = {style, style2, style3};
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
    public static final class a extends Serializer.c<AudioBookSliderViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioBookSliderViewStyle a(Serializer serializer) {
            return new AudioBookSliderViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioBookSliderViewStyle[i];
        }
    }

    public AudioBookSliderViewStyle(Style style) {
        this.b = style;
    }

    public final boolean Ab() {
        return this.b == Style.Search;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new AudioBookSliderViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioBookSliderViewStyle) && this.b == ((AudioBookSliderViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AudioBookSliderViewStyle(style=" + this.b + ')';
    }

    public final boolean zb() {
        return this.b == Style.SyntheticOffline;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookSliderViewStyle(Serializer serializer) {
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
    public AudioBookSliderViewStyle(int i) {
        this(r2 == null ? Style.None : r2);
        Style.Companion.getClass();
        Style style = (Style) j5g.b0(i, Style.i());
    }
}
