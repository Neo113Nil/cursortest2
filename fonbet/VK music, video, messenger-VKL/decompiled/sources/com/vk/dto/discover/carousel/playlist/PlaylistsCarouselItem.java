package com.vk.dto.discover.carousel.playlist;

import com.vk.core.serialize.Serializer;
import com.vk.dto.discover.carousel.CarouselItem;
import com.vk.dto.music.Playlist;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: PlaylistsCarouselItem.kt */
/* loaded from: classes18.dex */
public final class PlaylistsCarouselItem extends CarouselItem {
    public static final Serializer.c<PlaylistsCarouselItem> CREATOR = new a();
    public final Playlist b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PlaylistsCarouselItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistsCarouselItem a(Serializer serializer) {
            return new PlaylistsCarouselItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistsCarouselItem[i];
        }
    }

    public PlaylistsCarouselItem(Playlist playlist) {
        this.b = playlist;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlaylistsCarouselItem) && epx.f(this.b, ((PlaylistsCarouselItem) obj).b);
    }

    public final int hashCode() {
        Playlist playlist = this.b;
        if (playlist == null) {
            return 0;
        }
        return playlist.hashCode();
    }

    public final String toString() {
        return "PlaylistsCarouselItem(playlist=" + this.b + ')';
    }

    public PlaylistsCarouselItem(JSONObject jSONObject) {
        this(new Playlist(jSONObject));
    }

    public PlaylistsCarouselItem(Serializer serializer) {
        this((Playlist) serializer.G(Playlist.class.getClassLoader()));
    }
}
