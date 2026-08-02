package com.vk.dto.discover.carousel.tracks;

import com.vk.core.serialize.Serializer;
import com.vk.dto.discover.carousel.Carousel;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.j5g;

/* compiled from: MusicTracksCarousel.kt */
/* loaded from: classes18.dex */
public final class MusicTracksCarousel extends Carousel<MusicTracksCarouselItem> {
    public static final Serializer.c<MusicTracksCarousel> CREATOR = new a();
    public final Object o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicTracksCarousel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicTracksCarousel a(Serializer serializer) {
            return new MusicTracksCarousel(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicTracksCarousel[i];
        }
    }

    public MusicTracksCarousel(JSONObject jSONObject, int i) {
        super(jSONObject, i, "recommended_audios");
        JSONArray jSONArray = jSONObject.getJSONArray("audios");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(new MusicTrack(jSONArray.getJSONObject(i2)));
        }
        List H0 = j5g.H0(arrayList, 3);
        String optString = jSONObject.optString("playlist_id");
        List list = H0;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new MusicTracksCarouselItem((MusicTrack) it.next(), H0, optString));
        }
        this.o = arrayList2;
    }

    @Override // com.vk.dto.discover.carousel.Carousel, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.o);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.vk.dto.discover.carousel.tracks.MusicTracksCarouselItem>] */
    @Override // com.vk.dto.discover.carousel.Carousel
    public final List<MusicTracksCarouselItem> getItems() {
        return this.o;
    }

    public MusicTracksCarousel(Serializer serializer) {
        super(serializer);
        Object k = serializer.k(MusicTracksCarouselItem.class);
        this.o = k == null ? EmptyList.b : k;
    }
}
