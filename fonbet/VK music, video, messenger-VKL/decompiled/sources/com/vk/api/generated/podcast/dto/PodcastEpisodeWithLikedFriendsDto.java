package com.vk.api.generated.podcast.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PodcastEpisodeWithLikedFriendsDto.kt */
/* loaded from: classes15.dex */
public final class PodcastEpisodeWithLikedFriendsDto implements Parcelable {
    public static final Parcelable.Creator<PodcastEpisodeWithLikedFriendsDto> CREATOR = new a();

    @pmi0("episode")
    private final AudioAudioDto episode;

    @pmi0("friends_liked")
    private final List<Integer> friendsLiked;

    /* compiled from: PodcastEpisodeWithLikedFriendsDto.kt */
    public static final class a implements Parcelable.Creator<PodcastEpisodeWithLikedFriendsDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastEpisodeWithLikedFriendsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new PodcastEpisodeWithLikedFriendsDto(arrayList, (AudioAudioDto) parcel.readParcelable(PodcastEpisodeWithLikedFriendsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastEpisodeWithLikedFriendsDto[] newArray(int i) {
            return new PodcastEpisodeWithLikedFriendsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PodcastEpisodeWithLikedFriendsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final AudioAudioDto d() {
        return this.episode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.friendsLiked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastEpisodeWithLikedFriendsDto)) {
            return false;
        }
        PodcastEpisodeWithLikedFriendsDto podcastEpisodeWithLikedFriendsDto = (PodcastEpisodeWithLikedFriendsDto) obj;
        return epx.f(this.friendsLiked, podcastEpisodeWithLikedFriendsDto.friendsLiked) && epx.f(this.episode, podcastEpisodeWithLikedFriendsDto.episode);
    }

    public final int hashCode() {
        List<Integer> list = this.friendsLiked;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        AudioAudioDto audioAudioDto = this.episode;
        return hashCode + (audioAudioDto != null ? audioAudioDto.hashCode() : 0);
    }

    public final String toString() {
        return "PodcastEpisodeWithLikedFriendsDto(friendsLiked=" + this.friendsLiked + ", episode=" + this.episode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Integer> list = this.friendsLiked;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeParcelable(this.episode, i);
    }

    public PodcastEpisodeWithLikedFriendsDto(List<Integer> list, AudioAudioDto audioAudioDto) {
        this.friendsLiked = list;
        this.episode = audioAudioDto;
    }

    public /* synthetic */ PodcastEpisodeWithLikedFriendsDto(List list, AudioAudioDto audioAudioDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : audioAudioDto);
    }
}
