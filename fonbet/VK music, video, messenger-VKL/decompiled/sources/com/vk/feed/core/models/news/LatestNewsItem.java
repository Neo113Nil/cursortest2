package com.vk.feed.core.models.news;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.bh10;
import xsna.epx;
import xsna.rsx0;

/* compiled from: LatestNewsItem.kt */
/* loaded from: classes18.dex */
public final class LatestNewsItem extends NewsEntry implements rsx0 {
    public static final Serializer.c<LatestNewsItem> CREATOR = new a();
    public final Image i;
    public final int j;
    public final String k;
    public final int l;
    public final UserId m;
    public final String n;
    public final int o;
    public final NewsEntry.TrackData p;
    public final String q;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LatestNewsItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LatestNewsItem a(Serializer serializer) {
            return new LatestNewsItem((Image) serializer.G(Image.class.getClassLoader()), serializer.u(), serializer.H(), serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.u(), (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LatestNewsItem[i];
        }
    }

    public LatestNewsItem(Image image, int i, String str, int i2, UserId userId, String str2, int i3, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = image;
        this.j = i;
        this.k = str;
        this.l = i2;
        this.m = userId;
        this.n = str2;
        this.o = i3;
        this.p = trackData;
        this.q = trackData.b;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return "wall" + this.m + '_' + this.j;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append('_');
        sb.append(this.j);
        return sb.toString();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.p;
    }

    @Override // xsna.rsx0
    public final int D() {
        return this.l;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "grouped_news";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.i);
        serializer.S(this.j);
        serializer.j0(this.k);
        serializer.S(this.l);
        serializer.e0(this.m);
        serializer.j0(this.n);
        serializer.S(this.o);
        serializer.i0(this.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatestNewsItem) {
            LatestNewsItem latestNewsItem = (LatestNewsItem) obj;
            if (epx.f(this.m, latestNewsItem.m) && this.j == latestNewsItem.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return bh10.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.m.b) + this.j;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 20;
    }
}
