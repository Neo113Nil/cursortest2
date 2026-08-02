package com.vk.dto.discover.carousel.artist;

import com.vk.core.serialize.Serializer;
import com.vk.dto.discover.carousel.Carousel;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ArtistsCarousel.kt */
/* loaded from: classes18.dex */
public final class ArtistsCarousel extends Carousel<ArtistsCarouselItem> {
    public static final Serializer.c<ArtistsCarousel> CREATOR = new a();
    public final Object o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ArtistsCarousel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ArtistsCarousel a(Serializer serializer) {
            return new ArtistsCarousel(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArtistsCarousel[i];
        }
    }

    public ArtistsCarousel(JSONObject jSONObject, int i) {
        super(jSONObject, i, "recommended_artists");
        this.o = EmptyList.b;
        JSONArray jSONArray = jSONObject.getJSONArray("artists");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(new ArtistsCarouselItem(jSONArray.getJSONObject(i2)));
        }
        this.o = arrayList;
    }

    @Override // com.vk.dto.discover.carousel.Carousel, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.o);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.vk.dto.discover.carousel.artist.ArtistsCarouselItem>] */
    @Override // com.vk.dto.discover.carousel.Carousel
    public final List<ArtistsCarouselItem> getItems() {
        return this.o;
    }

    public ArtistsCarousel(Serializer serializer) {
        super(serializer);
        RandomAccess randomAccess = EmptyList.b;
        this.o = randomAccess;
        RandomAccess k = serializer.k(ArtistsCarouselItem.class);
        this.o = k != null ? k : randomAccess;
    }
}
