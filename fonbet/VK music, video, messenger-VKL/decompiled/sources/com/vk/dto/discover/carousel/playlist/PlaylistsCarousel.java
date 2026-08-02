package com.vk.dto.discover.carousel.playlist;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.audio.dto.AudioGetFeedPlaylistsBlockResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.discover.carousel.Carousel;
import com.vk.music.playlist.PlaylistCarouselItemStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PlaylistsCarousel.kt */
/* loaded from: classes18.dex */
public final class PlaylistsCarousel extends Carousel<PlaylistsCarouselItem> {
    public static final Serializer.c<PlaylistsCarousel> CREATOR = new a();
    public List<PlaylistsCarouselItem> o;
    public final PlaylistCarouselItemStyle p;
    public AudioGetFeedPlaylistsBlockResponseDto.TypeDto q;
    public Integer r;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PlaylistsCarousel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistsCarousel a(Serializer serializer) {
            return new PlaylistsCarousel(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistsCarousel[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Enum] */
    public PlaylistsCarousel(JSONObject jSONObject, int i) {
        super(jSONObject, i, "recommended_playlists");
        PlaylistCarouselItemStyle playlistCarouselItemStyle;
        this.o = EmptyList.b;
        PlaylistCarouselItemStyle playlistCarouselItemStyle2 = PlaylistCarouselItemStyle.EXTENDED;
        this.p = playlistCarouselItemStyle2;
        try {
            playlistCarouselItemStyle = Enum.valueOf(PlaylistCarouselItemStyle.class, jSONObject.optString(TtmlNode.TAG_STYLE).toUpperCase(Locale.ROOT).toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            playlistCarouselItemStyle = null;
        }
        this.p = playlistCarouselItemStyle != null ? playlistCarouselItemStyle : playlistCarouselItemStyle2;
        JSONArray optJSONArray = jSONObject.optJSONArray("playlists");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(new PlaylistsCarouselItem(optJSONArray.getJSONObject(i2)));
            }
            this.o = arrayList;
        }
    }

    @Override // com.vk.dto.discover.carousel.Carousel, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.o);
        serializer.g0(this.p);
        serializer.e0(this.q);
        Integer num = this.r;
        serializer.S(num != null ? num.intValue() : 0);
    }

    @Override // com.vk.dto.discover.carousel.Carousel
    public final List<PlaylistsCarouselItem> getItems() {
        return this.o;
    }

    public PlaylistsCarousel(Serializer serializer) {
        super(serializer);
        List list = EmptyList.b;
        this.o = list;
        PlaylistCarouselItemStyle playlistCarouselItemStyle = PlaylistCarouselItemStyle.EXTENDED;
        this.p = playlistCarouselItemStyle;
        List k = serializer.k(PlaylistsCarouselItem.class);
        this.o = k != null ? k : list;
        PlaylistCarouselItemStyle playlistCarouselItemStyle2 = (PlaylistCarouselItemStyle) serializer.C();
        this.p = playlistCarouselItemStyle2 != null ? playlistCarouselItemStyle2 : playlistCarouselItemStyle;
        this.q = (AudioGetFeedPlaylistsBlockResponseDto.TypeDto) serializer.A(AudioGetFeedPlaylistsBlockResponseDto.TypeDto.class.getClassLoader());
        this.r = Integer.valueOf(serializer.u());
    }
}
