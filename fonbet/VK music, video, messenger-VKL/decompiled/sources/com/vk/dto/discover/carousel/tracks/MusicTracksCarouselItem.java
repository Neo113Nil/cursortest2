package com.vk.dto.discover.carousel.tracks;

import com.vk.core.serialize.Serializer;
import com.vk.dto.discover.carousel.CarouselItem;
import com.vk.dto.music.MusicTrack;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MusicTracksCarouselItem.kt */
/* loaded from: classes18.dex */
public final class MusicTracksCarouselItem extends CarouselItem {
    public static final Serializer.c<MusicTracksCarouselItem> CREATOR = new a();
    public final MusicTrack b;
    public final List<MusicTrack> c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicTracksCarouselItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicTracksCarouselItem a(Serializer serializer) {
            return new MusicTracksCarouselItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicTracksCarouselItem[i];
        }
    }

    public MusicTracksCarouselItem(MusicTrack musicTrack, List<MusicTrack> list, String str) {
        this.b = musicTrack;
        this.c = list;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.W(this.c);
        serializer.j0(this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicTracksCarouselItem(Serializer serializer) {
        this(r1, r0 == null ? EmptyList.b : r0, serializer.H());
        MusicTrack musicTrack = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
        List k = serializer.k(MusicTrack.class);
    }
}
