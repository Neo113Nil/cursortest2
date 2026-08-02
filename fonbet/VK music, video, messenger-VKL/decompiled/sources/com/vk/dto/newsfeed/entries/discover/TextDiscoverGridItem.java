package com.vk.dto.newsfeed.entries.discover;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.discover.DiscoverAction;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: TextDiscoverGridItem.kt */
/* loaded from: classes18.dex */
public final class TextDiscoverGridItem extends DiscoverGridItem {
    public static final Serializer.c<TextDiscoverGridItem> CREATOR = new a();
    public final String j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TextDiscoverGridItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TextDiscoverGridItem a(Serializer serializer) {
            return new TextDiscoverGridItem(serializer.H(), (NewsEntry) serializer.G(NewsEntry.class.getClassLoader()), serializer.H(), serializer.u(), serializer.u(), serializer.H(), serializer.H(), serializer.H(), com.vk.core.serialize.a.a(serializer), (DiscoverAction) serializer.G(DiscoverAction.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextDiscoverGridItem[i];
        }
    }

    public TextDiscoverGridItem(String str, NewsEntry newsEntry, String str2, int i, int i2, String str3, String str4, String str5, List<String> list, DiscoverAction discoverAction, String str6) {
        super(str, newsEntry, i, i2, str3, new DiscoverGridItem.a(str4, str5, str6), list, discoverAction);
        this.j = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.j);
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
