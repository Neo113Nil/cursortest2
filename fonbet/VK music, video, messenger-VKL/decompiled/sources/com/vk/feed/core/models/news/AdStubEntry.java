package com.vk.feed.core.models.news;

import com.mbridge.msdk.foundation.entity.b;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.epx;

/* compiled from: AdStubEntry.kt */
/* loaded from: classes18.dex */
public final class AdStubEntry extends NewsEntry {
    public static final Serializer.c<AdStubEntry> CREATOR = new a();
    public final NewsEntry.TrackData i;
    public final String j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AdStubEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AdStubEntry a(Serializer serializer) {
            return new AdStubEntry((NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdStubEntry[i];
        }
    }

    public AdStubEntry(NewsEntry.TrackData trackData) {
        super(trackData);
        this.i = trackData;
        this.j = b.JSON_KEY_ADS;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdStubEntry) {
            return epx.f(this.i.b, ((AdStubEntry) obj).i.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 27;
    }
}
