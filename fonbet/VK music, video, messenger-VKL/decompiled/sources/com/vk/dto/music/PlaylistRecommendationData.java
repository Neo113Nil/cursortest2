package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import xsna.epx;

/* compiled from: PlaylistRecommendationData.kt */
/* loaded from: classes18.dex */
public final class PlaylistRecommendationData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PlaylistRecommendationData> CREATOR = new a();
    public final Playlist b;
    public final RecommendedPlaylist c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PlaylistRecommendationData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistRecommendationData a(Serializer serializer) {
            return new PlaylistRecommendationData((Playlist) serializer.A(Playlist.class.getClassLoader()), (RecommendedPlaylist) serializer.A(RecommendedPlaylist.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistRecommendationData[i];
        }
    }

    public PlaylistRecommendationData(Playlist playlist, RecommendedPlaylist recommendedPlaylist) {
        this.b = playlist;
        this.c = recommendedPlaylist;
    }

    public final RecommendedPlaylist Ab() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.e0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistRecommendationData)) {
            return false;
        }
        PlaylistRecommendationData playlistRecommendationData = (PlaylistRecommendationData) obj;
        return epx.f(this.b, playlistRecommendationData.b) && epx.f(this.c, playlistRecommendationData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistRecommendationData(playlist=" + this.b + ", recommendedPlaylist=" + this.c + ')';
    }

    public final Playlist zb() {
        return this.b;
    }
}
