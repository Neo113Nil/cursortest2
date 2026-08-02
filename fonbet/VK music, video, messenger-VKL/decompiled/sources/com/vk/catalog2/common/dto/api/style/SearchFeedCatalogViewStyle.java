package com.vk.catalog2.common.dto.api.style;

import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: SearchFeedCatalogViewStyle.kt */
/* loaded from: classes16.dex */
public final class SearchFeedCatalogViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<SearchFeedCatalogViewStyle> CREATOR = new a();
    public final int b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SearchFeedCatalogViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchFeedCatalogViewStyle a(Serializer serializer) {
            return new SearchFeedCatalogViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchFeedCatalogViewStyle[i];
        }
    }

    public SearchFeedCatalogViewStyle(int i) {
        this.b = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new SearchFeedCatalogViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchFeedCatalogViewStyle) && this.b == ((SearchFeedCatalogViewStyle) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("SearchFeedCatalogViewStyle(postDisplayItemViewType="), this.b, ')');
    }

    public SearchFeedCatalogViewStyle(Serializer serializer) {
        this(serializer.u());
    }
}
