package com.vk.dto.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.games.GameGenre;
import xsna.i5s;

/* loaded from: classes18.dex */
public class CatalogInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogInfo> CREATOR = new a();
    public final int b;

    @Nullable
    public final String c;
    public final int d;
    public final long e;

    @Nullable
    public final FilterType f;

    @Nullable
    public final String g;

    public enum FilterType {
        INSTALLED("installed"),
        FEATURED("featured"),
        FILTER_NEW("new"),
        HTML_5("html5"),
        RECOMMENDED(null),
        GAMES_CATALOG(null),
        NEW("new");


        @Nullable
        final String serverKey;

        FilterType(@Nullable String str) {
            this.serverKey = str;
        }
    }

    public class a extends Serializer.c<CatalogInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        @Nullable
        public final CatalogInfo a(@NonNull Serializer serializer) {
            return new CatalogInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogInfo[i];
        }
    }

    public CatalogInfo(@NonNull GameGenre gameGenre) {
        this.c = gameGenre.c;
        this.b = -1;
        this.d = gameGenre.b;
        this.f = null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.d);
        serializer.Y(this.e);
        FilterType filterType = this.f;
        serializer.S(filterType == null ? -1 : filterType.ordinal());
        serializer.j0(this.c);
        serializer.S(this.b);
        String str = this.g;
        if (str == null) {
            str = "";
        }
        serializer.j0(str);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("{\"genreId\"=");
        sb.append(this.d);
        sb.append(", \"filterType\"=");
        FilterType filterType = this.f;
        return i5s.a(sb, filterType == null ? "null" : filterType.name(), "}");
    }

    @Nullable
    public final String zb() {
        FilterType filterType = this.f;
        if (filterType == null) {
            return null;
        }
        return filterType.serverKey;
    }

    public CatalogInfo(Serializer serializer) {
        this.d = serializer.u();
        this.e = serializer.w();
        int u = serializer.u();
        this.f = u == -1 ? null : FilterType.values()[u];
        this.c = serializer.H();
        this.b = serializer.u();
        this.g = serializer.H();
    }
}
