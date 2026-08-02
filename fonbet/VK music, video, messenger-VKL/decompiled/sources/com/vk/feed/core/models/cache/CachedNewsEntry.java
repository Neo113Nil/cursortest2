package com.vk.feed.core.models.cache;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.DebugInfo;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: CachedNewsEntry.kt */
/* loaded from: classes18.dex */
public final class CachedNewsEntry extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CachedNewsEntry> CREATOR = new a();
    public final NewsEntry b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CachedNewsEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CachedNewsEntry a(Serializer serializer) {
            NewsEntry newsEntry = (NewsEntry) serializer.G(NewsEntry.class.getClassLoader());
            newsEntry.e = serializer.m();
            newsEntry.g = (Feedback) serializer.G(Feedback.class.getClassLoader());
            newsEntry.c = serializer.m();
            newsEntry.h = (DebugInfo) serializer.G(DebugInfo.class.getClassLoader());
            return new CachedNewsEntry(newsEntry);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CachedNewsEntry[i];
        }
    }

    public CachedNewsEntry(NewsEntry newsEntry) {
        this.b = newsEntry;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        NewsEntry newsEntry = this.b;
        serializer.i0(newsEntry);
        serializer.L(newsEntry.e ? (byte) 1 : (byte) 0);
        serializer.i0(newsEntry.g);
        serializer.L(newsEntry.c ? (byte) 1 : (byte) 0);
        serializer.i0(newsEntry.h);
    }
}
