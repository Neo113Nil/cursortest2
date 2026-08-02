package com.vk.dto.newsfeed.entries;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.iux0;
import xsna.tdx;

/* compiled from: InterestingStoriesEntry.kt */
/* loaded from: classes18.dex */
public final class InterestingStoriesEntry extends NewsEntry implements iux0 {
    public static final Serializer.c<InterestingStoriesEntry> CREATOR = new a();
    public final NewsEntry.TrackData i;
    public final String j;
    public tdx k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InterestingStoriesEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InterestingStoriesEntry a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "stories_interesting_block";
            }
            NewsEntry.TrackData trackData = (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader());
            if (trackData == null) {
                trackData = new NewsEntry.TrackData(null, 0, 0L, false, false, null, null, 0, 255, null);
            }
            return new InterestingStoriesEntry(trackData, H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InterestingStoriesEntry[i];
        }
    }

    public InterestingStoriesEntry(NewsEntry.TrackData trackData, String str) {
        super(trackData);
        this.i = trackData;
        this.j = str;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return Db();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return Db();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        tdx tdxVar = this.k;
        return (tdxVar != null ? tdxVar.e : null) == DiscoverBlockType.PHONE_BOOK_STORIES ? "discover_feed_block" : "stories_interesting";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.j);
        serializer.i0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!InterestingStoriesEntry.class.equals(obj != null ? obj.getClass() : null) || !(obj instanceof InterestingStoriesEntry)) {
            return false;
        }
        ((InterestingStoriesEntry) obj).getClass();
        return true;
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        tdx tdxVar = this.k;
        if (tdxVar != null) {
            return tdxVar.a;
        }
        return null;
    }

    public final int hashCode() {
        return 65;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 65;
    }
}
