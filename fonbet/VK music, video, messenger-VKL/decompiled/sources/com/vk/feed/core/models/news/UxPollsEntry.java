package com.vk.feed.core.models.news;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.epx;

/* compiled from: UxPollsEntry.kt */
/* loaded from: classes18.dex */
public final class UxPollsEntry extends NewsEntry implements Serializer.StreamParcelable {
    public static final Serializer.c<UxPollsEntry> CREATOR = new a();
    public final String i;
    public final NewsEntry.TrackData j;
    public final String k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UxPollsEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UxPollsEntry a(Serializer serializer) {
            return new UxPollsEntry(serializer.H(), (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UxPollsEntry[i];
        }
    }

    public UxPollsEntry(String str, NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = str;
        this.j = trackData;
        this.k = "uxpoll_block";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.j;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.k;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.i0(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPollsEntry)) {
            return false;
        }
        UxPollsEntry uxPollsEntry = (UxPollsEntry) obj;
        return epx.f(this.i, uxPollsEntry.i) && epx.f(this.j.b, uxPollsEntry.j.b);
    }

    public final int hashCode() {
        int hashCode = this.i.hashCode() * 31;
        String str = this.j.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UxPollsEntry(trigger=" + this.i + ", trackData=" + this.j + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 55;
    }
}
