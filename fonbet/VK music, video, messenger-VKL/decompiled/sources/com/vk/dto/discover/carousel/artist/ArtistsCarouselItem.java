package com.vk.dto.discover.carousel.artist;

import com.vk.core.serialize.Serializer;
import com.vk.dto.discover.carousel.CarouselItem;
import com.vk.dto.music.Artist;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: ArtistsCarouselItem.kt */
/* loaded from: classes18.dex */
public final class ArtistsCarouselItem extends CarouselItem {
    public static final Serializer.c<ArtistsCarouselItem> CREATOR = new a();
    public final Artist b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ArtistsCarouselItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ArtistsCarouselItem a(Serializer serializer) {
            return new ArtistsCarouselItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArtistsCarouselItem[i];
        }
    }

    public ArtistsCarouselItem(Artist artist) {
        this.b = artist;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArtistsCarouselItem) && epx.f(this.b, ((ArtistsCarouselItem) obj).b);
    }

    public final int hashCode() {
        Artist artist = this.b;
        if (artist == null) {
            return 0;
        }
        return artist.hashCode();
    }

    public final String toString() {
        return "ArtistsCarouselItem(artist=" + this.b + ')';
    }

    public ArtistsCarouselItem(JSONObject jSONObject) {
        this(new Artist(jSONObject));
    }

    public ArtistsCarouselItem(Serializer serializer) {
        this((Artist) serializer.G(Artist.class.getClassLoader()));
    }
}
