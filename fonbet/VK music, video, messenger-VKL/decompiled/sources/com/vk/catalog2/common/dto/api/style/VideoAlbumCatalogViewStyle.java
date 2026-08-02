package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.zrp;

/* compiled from: VideoAlbumCatalogViewStyle.kt */
/* loaded from: classes16.dex */
public final class VideoAlbumCatalogViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<VideoAlbumCatalogViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAlbumCatalogViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style Classic;
        public static final a Companion;
        public static final Style PlaylistShowcase;
        public static final Style VerticalCover;
        private final String apiName;

        /* compiled from: VideoAlbumCatalogViewStyle.kt */
        public static final class a {
        }

        static {
            Style style = new Style("Classic", 0, "classic");
            Classic = style;
            Style style2 = new Style("VerticalCover", 1, "vertical_cover");
            VerticalCover = style2;
            Style style3 = new Style("PlaylistShowcase", 2, "playlist_showcase");
            PlaylistShowcase = style3;
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
    public static final class a extends Serializer.c<VideoAlbumCatalogViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoAlbumCatalogViewStyle a(Serializer serializer) {
            return new VideoAlbumCatalogViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoAlbumCatalogViewStyle[i];
        }
    }

    public VideoAlbumCatalogViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new VideoAlbumCatalogViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAlbumCatalogViewStyle) && this.b == ((VideoAlbumCatalogViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VideoAlbumCatalogViewStyle(style=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoAlbumCatalogViewStyle(Serializer serializer) {
        this(r2 == null ? Style.Classic : r2);
        Style.a aVar = Style.Companion;
        int u = serializer.u();
        aVar.getClass();
        Style style = (Style) j5g.b0(u, Style.i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoAlbumCatalogViewStyle(int i) {
        this(r2 == null ? Style.Classic : r2);
        Style.Companion.getClass();
        Style style = (Style) j5g.b0(i, Style.i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoAlbumCatalogViewStyle(String str) {
        this(r1 == null ? Style.Classic : r1);
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
