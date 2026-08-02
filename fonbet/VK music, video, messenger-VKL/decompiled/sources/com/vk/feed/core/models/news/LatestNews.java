package com.vk.feed.core.models.news;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;

/* compiled from: LatestNews.kt */
/* loaded from: classes18.dex */
public final class LatestNews extends NewsEntry {
    public static final Serializer.c<LatestNews> CREATOR = new a();
    public final int i;
    public final int j;
    public final ArrayList<LatestNewsItem> k;
    public final NewsEntry.TrackData l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LatestNews> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LatestNews a(Serializer serializer) {
            return new LatestNews(serializer.u(), serializer.u(), serializer.j(LatestNewsItem.CREATOR), (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LatestNews[i];
        }
    }

    public LatestNews(int i, int i2, ArrayList<LatestNewsItem> arrayList, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = i;
        this.j = i2;
        this.k = arrayList;
        this.l = trackData;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return "grouped_news";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return "grouped_news";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.l;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "grouped_news";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.o0(this.k);
        serializer.i0(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatestNews) {
            LatestNews latestNews = (LatestNews) obj;
            if (this.i == latestNews.i && this.j == latestNews.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.i) * 31) + this.j;
    }

    public final String toString() {
        return "LatestNews(blockId=" + this.i + ", blockType=" + this.j + ", items=" + this.k + ", trackData=" + this.l + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 20;
    }
}
