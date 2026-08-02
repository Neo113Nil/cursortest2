package com.vk.dto.newsfeed.entries.discover.community;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.GeoAttachment;

/* compiled from: CommunityMediaGeoDiscoverGridItem.kt */
/* loaded from: classes18.dex */
public final class CommunityMediaGeoDiscoverGridItem extends DiscoverGridItem {
    public static final Serializer.c<CommunityMediaGeoDiscoverGridItem> CREATOR = new a();
    public final GeoAttachment j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommunityMediaGeoDiscoverGridItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommunityMediaGeoDiscoverGridItem a(Serializer serializer) {
            return new CommunityMediaGeoDiscoverGridItem(serializer.H(), (NewsEntry) serializer.G(NewsEntry.class.getClassLoader()), (GeoAttachment) serializer.G(GeoAttachment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommunityMediaGeoDiscoverGridItem[i];
        }
    }

    public CommunityMediaGeoDiscoverGridItem(String str, NewsEntry newsEntry, GeoAttachment geoAttachment) {
        super(str, newsEntry, 1, 1, null, new DiscoverGridItem.a(null, null, null), null, null);
        this.j = geoAttachment;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.j);
    }
}
