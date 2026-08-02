package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AudioGetPlaylistExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetPlaylistExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetPlaylistExtendedResponseDto> CREATOR = new a();

    @pmi0("album_parts_first_audios")
    private final List<AudioAlbumPartsFirstAudioDto> albumPartsFirstAudios;

    @pmi0("artists")
    private final List<AudioArtistDto> artists;

    @pmi0("audio_ids")
    private final List<AudioAudioRawIdTrackedDto> audioIds;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("extra_recommendations_section_id")
    private final String extraRecommendationsSectionId;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("playlist")
    private final AudioPlaylistDto playlist;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: AudioGetPlaylistExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetPlaylistExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetPlaylistExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) parcel.readParcelable(AudioGetPlaylistExtendedResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AudioGetPlaylistExtendedResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(AudioGetPlaylistExtendedResponseDto.class, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(AudioGetPlaylistExtendedResponseDto.class, parcel, arrayList3, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(AudioAudioRawIdTrackedDto.CREATOR, parcel, arrayList4, i4, 1);
                }
            }
            int i5 = 0;
            ArrayList arrayList6 = arrayList;
            ArrayList arrayList7 = arrayList3;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt5);
                while (i5 != readInt5) {
                    i5 = en.a(AudioAlbumPartsFirstAudioDto.CREATOR, parcel, arrayList8, i5, 1);
                }
                arrayList5 = arrayList8;
            }
            return new AudioGetPlaylistExtendedResponseDto(audioPlaylistDto, arrayList6, arrayList2, arrayList7, arrayList4, readString, arrayList5, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetPlaylistExtendedResponseDto[] newArray(int i) {
            return new AudioGetPlaylistExtendedResponseDto[i];
        }
    }

    public AudioGetPlaylistExtendedResponseDto(AudioPlaylistDto audioPlaylistDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<AudioArtistDto> list3, List<AudioAudioRawIdTrackedDto> list4, String str, List<AudioAlbumPartsFirstAudioDto> list5, Integer num) {
        this.playlist = audioPlaylistDto;
        this.profiles = list;
        this.groups = list2;
        this.artists = list3;
        this.audioIds = list4;
        this.extraRecommendationsSectionId = str;
        this.albumPartsFirstAudios = list5;
        this.duration = num;
    }

    public final List<AudioAlbumPartsFirstAudioDto> d() {
        return this.albumPartsFirstAudios;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AudioArtistDto> e() {
        return this.artists;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetPlaylistExtendedResponseDto)) {
            return false;
        }
        AudioGetPlaylistExtendedResponseDto audioGetPlaylistExtendedResponseDto = (AudioGetPlaylistExtendedResponseDto) obj;
        return epx.f(this.playlist, audioGetPlaylistExtendedResponseDto.playlist) && epx.f(this.profiles, audioGetPlaylistExtendedResponseDto.profiles) && epx.f(this.groups, audioGetPlaylistExtendedResponseDto.groups) && epx.f(this.artists, audioGetPlaylistExtendedResponseDto.artists) && epx.f(this.audioIds, audioGetPlaylistExtendedResponseDto.audioIds) && epx.f(this.extraRecommendationsSectionId, audioGetPlaylistExtendedResponseDto.extraRecommendationsSectionId) && epx.f(this.albumPartsFirstAudios, audioGetPlaylistExtendedResponseDto.albumPartsFirstAudios) && epx.f(this.duration, audioGetPlaylistExtendedResponseDto.duration);
    }

    public final List<AudioAudioRawIdTrackedDto> f() {
        return this.audioIds;
    }

    public final String g() {
        return this.extraRecommendationsSectionId;
    }

    public final int hashCode() {
        int hashCode = this.playlist.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AudioArtistDto> list3 = this.artists;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AudioAudioRawIdTrackedDto> list4 = this.audioIds;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.extraRecommendationsSectionId;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<AudioAlbumPartsFirstAudioDto> list5 = this.albumPartsFirstAudios;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num = this.duration;
        return hashCode7 + (num != null ? num.hashCode() : 0);
    }

    public final List<GroupsGroupFullDto> i() {
        return this.groups;
    }

    public final AudioPlaylistDto j() {
        return this.playlist;
    }

    public final List<UsersUserFullDto> k() {
        return this.profiles;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetPlaylistExtendedResponseDto(playlist=");
        sb.append(this.playlist);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", audioIds=");
        sb.append(this.audioIds);
        sb.append(", extraRecommendationsSectionId=");
        sb.append(this.extraRecommendationsSectionId);
        sb.append(", albumPartsFirstAudios=");
        sb.append(this.albumPartsFirstAudios);
        sb.append(", duration=");
        return uqi.b(sb, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.playlist, i);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<AudioArtistDto> list3 = this.artists;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<AudioAudioRawIdTrackedDto> list4 = this.audioIds;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((AudioAudioRawIdTrackedDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.extraRecommendationsSectionId);
        List<AudioAlbumPartsFirstAudioDto> list5 = this.albumPartsFirstAudios;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((AudioAlbumPartsFirstAudioDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AudioGetPlaylistExtendedResponseDto(AudioPlaylistDto audioPlaylistDto, List list, List list2, List list3, List list4, String str, List list5, Integer num, int i, zcl zclVar) {
        this(audioPlaylistDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? null : num);
    }
}
