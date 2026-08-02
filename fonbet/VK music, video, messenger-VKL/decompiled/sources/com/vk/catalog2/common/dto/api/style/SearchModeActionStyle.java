package com.vk.catalog2.common.dto.api.style;

import com.unity3d.ads.BuildConfig;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SearchModeActionStyle.kt */
/* loaded from: classes16.dex */
public final class SearchModeActionStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<SearchModeActionStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchModeActionStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style AfterToolbar;
        public static final a Companion;
        public static final Style Expandable;
        private final String value;

        /* compiled from: SearchModeActionStyle.kt */
        public static final class a {
        }

        static {
            Style style = new Style("Expandable", 0, BuildConfig.FLAVOR);
            Expandable = style;
            Style style2 = new Style("AfterToolbar", 1, "after_toolbar");
            AfterToolbar = style2;
            Style[] styleArr = {style, style2};
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
    public static final class a extends Serializer.c<SearchModeActionStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchModeActionStyle a(Serializer serializer) {
            return new SearchModeActionStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchModeActionStyle[i];
        }
    }

    public SearchModeActionStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new SearchModeActionStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchModeActionStyle) && this.b == ((SearchModeActionStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SearchModeActionStyle(style=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchModeActionStyle(Serializer serializer) {
        this(r2 == null ? Style.Expandable : r2);
        Style.a aVar = Style.Companion;
        int u = serializer.u();
        aVar.getClass();
        Style style = (Style) j5g.b0(u, Style.h());
    }

    public /* synthetic */ SearchModeActionStyle(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchModeActionStyle(String str) {
        this(r1 == null ? Style.Expandable : r1);
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
