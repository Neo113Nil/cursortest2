package com.vk.feed.core.models.discover;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import xsna.epx;
import xsna.iux0;

/* compiled from: DiscoverMediaBlock.kt */
/* loaded from: classes18.dex */
public final class DiscoverMediaBlock extends NewsEntry implements iux0 {
    public static final Serializer.c<DiscoverMediaBlock> CREATOR = new a();
    public final String i;
    public final ArrayList<DiscoverGridItem> j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final String o;
    public final NewsEntry.TrackData p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DiscoverMediaBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverMediaBlock a(Serializer serializer) {
            String H = serializer.H();
            ArrayList k = serializer.k(DiscoverGridItem.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new DiscoverMediaBlock(H, k, serializer.u(), serializer.u(), serializer.H(), serializer.H(), serializer.H(), (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverMediaBlock[i];
        }
    }

    public DiscoverMediaBlock(String str, ArrayList<DiscoverGridItem> arrayList, int i, int i2, String str2, String str3, String str4, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = str;
        this.j = arrayList;
        this.k = i;
        this.l = i2;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.p = trackData;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return this.i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return this.i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.p;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.i;
    }

    public final DiscoverGridItem Eb(NewsEntry newsEntry) {
        ArrayList<DiscoverGridItem> arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            DiscoverGridItem discoverGridItem = arrayList.get(i);
            if (epx.f(discoverGridItem.c, newsEntry)) {
                return discoverGridItem;
            }
        }
        return null;
    }

    public final boolean Fb() {
        String str = this.n;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = this.o;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    public final boolean Gb() {
        String str = this.m;
        return true ^ (str == null || str.length() == 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.W(this.j);
        serializer.S(this.k);
        serializer.S(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.i0(this.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return DiscoverMediaBlock.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.p.b, ((DiscoverMediaBlock) obj).p.b);
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.m;
    }

    public final int hashCode() {
        String str = this.p.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DiscoverMediaBlock(typeName=" + this.i + ", items=" + this.j + ", rows=" + this.k + ", columns=" + this.l + ", title=" + this.m + ", footerText=" + this.n + ", footerButtonText=" + this.o + ", trackData=" + this.p + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 56;
    }
}
