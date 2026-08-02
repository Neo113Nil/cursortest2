package com.vk.dto.newsfeed.entries.discover;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.discover.DiscoverAction;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import xsna.zcl;

/* compiled from: VideoDiscoverGridItem.kt */
/* loaded from: classes18.dex */
public final class VideoDiscoverGridItem extends DiscoverGridItem {
    public static final Serializer.c<VideoDiscoverGridItem> CREATOR = new a();
    public final VideoAttachment j;
    public final boolean k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoDiscoverGridItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoDiscoverGridItem a(Serializer serializer) {
            return new VideoDiscoverGridItem(serializer.H(), (NewsEntry) serializer.G(NewsEntry.class.getClassLoader()), (VideoAttachment) serializer.G(VideoAttachment.class.getClassLoader()), serializer.u(), serializer.u(), serializer.H(), serializer.H(), serializer.H(), com.vk.core.serialize.a.a(serializer), (DiscoverAction) serializer.G(DiscoverAction.class.getClassLoader()), serializer.m(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoDiscoverGridItem[i];
        }
    }

    public /* synthetic */ VideoDiscoverGridItem(String str, NewsEntry newsEntry, VideoAttachment videoAttachment, int i, int i2, String str2, String str3, String str4, List list, DiscoverAction discoverAction, boolean z, String str5, int i3, zcl zclVar) {
        this(str, newsEntry, videoAttachment, i, i2, str2, str3, str4, list, discoverAction, (i3 & 1024) != 0 ? true : z, str5);
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
        serializer.L(this.k ? (byte) 1 : (byte) 0);
    }

    public VideoDiscoverGridItem(String str, NewsEntry newsEntry, VideoAttachment videoAttachment, int i, int i2, String str2, String str3, String str4, List<String> list, DiscoverAction discoverAction, boolean z, String str5) {
        super(str, newsEntry, i, i2, str2, new DiscoverGridItem.a(str3, str4, str5), list, discoverAction);
        this.j = videoAttachment;
        this.k = z;
    }
}
