package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import com.vk.music.search.history.SearchHistoryModel;
import xsna.asp;
import xsna.j5g;
import xsna.zrp;

/* compiled from: SearchHistoryViewStyle.kt */
/* loaded from: classes16.dex */
public final class SearchHistoryViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<SearchHistoryViewStyle> CREATOR = new a();
    public final Style b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchHistoryViewStyle.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style Album;
        public static final Style Artist;
        public static final Style AudioBook;
        public static final a Companion;
        public static final Style Curator;
        public static final Style Playlist;
        public static final Style Podcast;
        public static final Style RadioStation;
        public static final Style Track;
        public static final Style TrackLyrics;
        public static final Style Video;
        private final String apiName;

        /* compiled from: SearchHistoryViewStyle.kt */
        public static final class a {
        }

        static {
            Style style = new Style("Track", 0, SearchHistoryModel.Type.Track.i());
            Track = style;
            Style style2 = new Style("TrackLyrics", 1, SearchHistoryModel.Type.TrackLyrics.i());
            TrackLyrics = style2;
            Style style3 = new Style("Artist", 2, SearchHistoryModel.Type.Artist.i());
            Artist = style3;
            Style style4 = new Style("Curator", 3, SearchHistoryModel.Type.Curator.i());
            Curator = style4;
            Style style5 = new Style("Podcast", 4, SearchHistoryModel.Type.Podcast.i());
            Podcast = style5;
            Style style6 = new Style("AudioBook", 5, SearchHistoryModel.Type.AudioBook.i());
            AudioBook = style6;
            Style style7 = new Style("Album", 6, SearchHistoryModel.Type.Album.i());
            Album = style7;
            Style style8 = new Style("Playlist", 7, SearchHistoryModel.Type.Playlist.i());
            Playlist = style8;
            Style style9 = new Style("RadioStation", 8, SearchHistoryModel.Type.RadioStation.i());
            RadioStation = style9;
            Style style10 = new Style("Video", 9, SearchHistoryModel.Type.Video.i());
            Video = style10;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8, style9, style10};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, String str2) {
            this.apiName = str2;
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
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SearchHistoryViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchHistoryViewStyle a(Serializer serializer) {
            return new SearchHistoryViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchHistoryViewStyle[i];
        }
    }

    public SearchHistoryViewStyle(Style style) {
        this.b = style;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new SearchHistoryViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchHistoryViewStyle) && this.b == ((SearchHistoryViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SearchHistoryViewStyle(style=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchHistoryViewStyle(Serializer serializer) {
        this(r2);
        Style.a aVar = Style.Companion;
        int u = serializer.u();
        aVar.getClass();
        Style style = (Style) j5g.b0(u, Style.h());
        if (style != null) {
            return;
        }
        throw new IllegalStateException("Inconsistent data");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchHistoryViewStyle(int i) {
        this(r2);
        Style.Companion.getClass();
        Style style = (Style) j5g.b0(i, Style.h());
        if (style != null) {
            return;
        }
        throw new IllegalStateException("Inconsistent data");
    }
}
