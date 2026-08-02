package com.vk.catalog2.common.dto.api.news;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.ck70;
import xsna.epx;

/* compiled from: CatalogNewsEntry.kt */
/* loaded from: classes16.dex */
public final class CatalogNewsEntry extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogNewsEntry> CREATOR = new a();
    public final String b;
    public final NewsEntry c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogNewsEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogNewsEntry a(Serializer serializer) {
            return new CatalogNewsEntry(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogNewsEntry[i];
        }
    }

    public CatalogNewsEntry(String str, NewsEntry newsEntry) {
        this.b = str;
        this.c = newsEntry;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.e0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogNewsEntry)) {
            return false;
        }
        CatalogNewsEntry catalogNewsEntry = (CatalogNewsEntry) obj;
        return epx.f(this.b, catalogNewsEntry.b) && epx.f(this.c, catalogNewsEntry.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogNewsEntry(id=");
        sb.append(this.b);
        sb.append(", newsEntry=");
        return ck70.a(sb, this.c, ')');
    }

    public CatalogNewsEntry(Serializer serializer) {
        this(serializer.H(), (NewsEntry) serializer.A(NewsEntry.class.getClassLoader()));
    }
}
