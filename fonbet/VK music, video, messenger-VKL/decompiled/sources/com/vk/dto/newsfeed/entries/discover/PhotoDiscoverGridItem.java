package com.vk.dto.newsfeed.entries.discover;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.discover.DiscoverAction;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;

/* compiled from: PhotoDiscoverGridItem.kt */
/* loaded from: classes18.dex */
public final class PhotoDiscoverGridItem extends DiscoverGridItem {
    public static final Serializer.c<PhotoDiscoverGridItem> CREATOR = new a();
    public final PhotoAttachment j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PhotoDiscoverGridItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoDiscoverGridItem a(Serializer serializer) {
            return new PhotoDiscoverGridItem(serializer.H(), (NewsEntry) serializer.G(NewsEntry.class.getClassLoader()), (PhotoAttachment) serializer.G(PhotoAttachment.class.getClassLoader()), serializer.u(), serializer.u(), serializer.H(), serializer.H(), serializer.H(), com.vk.core.serialize.a.a(serializer), (DiscoverAction) serializer.G(DiscoverAction.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoDiscoverGridItem[i];
        }
    }

    public PhotoDiscoverGridItem(String str, NewsEntry newsEntry, PhotoAttachment photoAttachment, int i, int i2, String str2, String str3, String str4, List<String> list, DiscoverAction discoverAction, String str5) {
        super(str, newsEntry, i, i2, str2, new DiscoverGridItem.a(str3, str4, str5), list, discoverAction);
        this.j = photoAttachment;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.j);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.j0(this.f);
        DiscoverGridItem.a aVar = this.g;
        serializer.j0(aVar.a);
        serializer.j0(aVar.b);
        serializer.j0(aVar.c);
        serializer.l0(this.h);
        serializer.i0(this.i);
    }
}
