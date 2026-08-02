package com.vk.dto.newsfeed.entries;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DzenArticleBlockItem;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;

/* compiled from: DzenArticlesBlock.kt */
/* loaded from: classes18.dex */
public final class DzenArticlesBlock extends NewsEntry {
    public static final Serializer.c<DzenArticlesBlock> CREATOR = new a();
    public final String i;
    public final String j;
    public final ArrayList<DzenArticleBlockItem> k;
    public final NewsEntry.TrackData l;
    public final String m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DzenArticlesBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DzenArticlesBlock a(Serializer serializer) {
            return new DzenArticlesBlock(serializer.H(), serializer.H(), serializer.B(DzenArticleBlockItem.class.getClassLoader()), (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DzenArticlesBlock[i];
        }
    }

    public DzenArticlesBlock(String str, String str2, ArrayList<DzenArticleBlockItem> arrayList, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = str;
        this.j = str2;
        this.k = arrayList;
        this.l = trackData;
        this.m = "dzen_block";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return this.m;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return this.m;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.l;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.m;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.f0(this.k);
        serializer.i0(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DzenArticlesBlock) {
            String str = this.l.b;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = ((DzenArticlesBlock) obj).l.b;
            if (hashCode == (str2 != null ? str2.hashCode() : 0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.l.b;
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DzenArticlesBlock(title=" + this.i + ", iconStr=" + this.j + ", articles=" + this.k + ", trackData=" + this.l + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 70;
    }
}
