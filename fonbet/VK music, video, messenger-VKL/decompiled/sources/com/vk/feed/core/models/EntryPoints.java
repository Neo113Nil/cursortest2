package com.vk.feed.core.models;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fw3;
import xsna.iux0;

/* compiled from: EntryPoints.kt */
/* loaded from: classes18.dex */
public final class EntryPoints extends NewsEntry implements iux0 {
    public static final Serializer.c<EntryPoints> CREATOR = new a();
    public final String i;
    public final List<EntryPointsItem> j;
    public final NewsEntry.TrackData k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EntryPoints> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EntryPoints a(Serializer serializer) {
            String H = serializer.H();
            List j = serializer.j(EntryPointsItem.CREATOR);
            if (j == null) {
                j = EmptyList.b;
            }
            return new EntryPoints(H, j, (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntryPoints[i];
        }
    }

    public EntryPoints(String str, List<EntryPointsItem> list, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = str;
        this.j = list;
        this.k = trackData;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.k;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "friends_entrypoints";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.o0(this.j);
        serializer.i0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryPoints)) {
            return false;
        }
        EntryPoints entryPoints = (EntryPoints) obj;
        return epx.f(this.i, entryPoints.i) && epx.f(this.j, entryPoints.j) && epx.f(this.k, entryPoints.k);
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.i;
    }

    public final int hashCode() {
        return this.k.hashCode() + fw3.a(this.i.hashCode() * 31, 31, this.j);
    }

    public final String toString() {
        return "EntryPoints(title=" + this.i + ", items=" + this.j + ", trackData=" + this.k + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 49;
    }
}
