package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.SearchSuggestion;
import xsna.j5g;

/* compiled from: SearchSuggestionCatalogViewStyle.kt */
/* loaded from: classes16.dex */
public final class SearchSuggestionCatalogViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<SearchSuggestionCatalogViewStyle> CREATOR = new a();
    public final SearchSuggestion.Type b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SearchSuggestionCatalogViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchSuggestionCatalogViewStyle a(Serializer serializer) {
            return new SearchSuggestionCatalogViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchSuggestionCatalogViewStyle[i];
        }
    }

    public SearchSuggestionCatalogViewStyle(SearchSuggestion.Type type) {
        this.b = type;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new SearchSuggestionCatalogViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSuggestionCatalogViewStyle) && this.b == ((SearchSuggestionCatalogViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SearchSuggestionCatalogViewStyle(suggestionType=" + this.b + ')';
    }

    public final SearchSuggestion.Type zb() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchSuggestionCatalogViewStyle(int i) {
        this(r2 == null ? SearchSuggestion.Type.Popular : r2);
        SearchSuggestion.Type.Companion.getClass();
        SearchSuggestion.Type type = (SearchSuggestion.Type) j5g.b0(i, SearchSuggestion.Type.i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchSuggestionCatalogViewStyle(Serializer serializer) {
        this(r2 == null ? SearchSuggestion.Type.Popular : r2);
        SearchSuggestion.Type.a aVar = SearchSuggestion.Type.Companion;
        int u = serializer.u();
        aVar.getClass();
        SearchSuggestion.Type type = (SearchSuggestion.Type) j5g.b0(u, SearchSuggestion.Type.i());
    }
}
