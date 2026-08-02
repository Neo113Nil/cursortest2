package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoGetChallengeResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetChallengeResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetChallengeResponseDto> CREATOR = new a();

    @pmi0("audio_in_clips_favorite")
    private final Boolean audioInClipsFavorite;

    @pmi0("audio_info")
    private final ShortVideoAudioDto audioInfo;

    @pmi0("can_add_audio_to_favorites")
    private final Boolean canAddAudioToFavorites;

    @pmi0("can_everyone_view_original_video")
    private final Boolean canEveryoneViewOriginalVideo;

    @pmi0("challenge")
    private final ShortVideoChallengeDto challenge;

    @pmi0("compilation_info")
    private final ShortVideoCompilationInfoDto compilationInfo;

    @pmi0("counters")
    private final ShortVideoClipCountersDto counters;

    @pmi0("effect_info")
    private final MasksEffectDto effectInfo;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("has_audio_templates")
    private final Boolean hasAudioTemplates;

    @pmi0("hashtag_info")
    private final ShortVideoChallengeHashtagInfoDto hashtagInfo;

    @pmi0("mask_info")
    private final MasksMaskDto maskInfo;

    @pmi0("place_info")
    private final PlacesPlaceDto placeInfo;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ShortVideoGetChallengeResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetChallengeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetChallengeResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean bool = null;
            ShortVideoChallengeDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoChallengeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoGetChallengeResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(ShortVideoGetChallengeResponseDto.class, parcel, arrayList2, i2, 1);
                }
            }
            ShortVideoClipCountersDto createFromParcel2 = parcel.readInt() == 0 ? null : ShortVideoClipCountersDto.CREATOR.createFromParcel(parcel);
            ShortVideoCompilationInfoDto shortVideoCompilationInfoDto = (ShortVideoCompilationInfoDto) parcel.readParcelable(ShortVideoGetChallengeResponseDto.class.getClassLoader());
            MasksMaskDto masksMaskDto = (MasksMaskDto) parcel.readParcelable(ShortVideoGetChallengeResponseDto.class.getClassLoader());
            MasksEffectDto masksEffectDto = (MasksEffectDto) parcel.readParcelable(ShortVideoGetChallengeResponseDto.class.getClassLoader());
            ShortVideoAudioDto shortVideoAudioDto = (ShortVideoAudioDto) parcel.readParcelable(ShortVideoGetChallengeResponseDto.class.getClassLoader());
            PlacesPlaceDto placesPlaceDto = (PlacesPlaceDto) parcel.readParcelable(ShortVideoGetChallengeResponseDto.class.getClassLoader());
            ShortVideoChallengeHashtagInfoDto createFromParcel3 = parcel.readInt() == 0 ? null : ShortVideoChallengeHashtagInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoGetChallengeResponseDto(createFromParcel, arrayList, arrayList2, createFromParcel2, shortVideoCompilationInfoDto, masksMaskDto, masksEffectDto, shortVideoAudioDto, placesPlaceDto, createFromParcel3, valueOf, valueOf2, valueOf3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetChallengeResponseDto[] newArray(int i) {
            return new ShortVideoGetChallengeResponseDto[i];
        }
    }

    public ShortVideoGetChallengeResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final PlacesPlaceDto B() {
        return this.placeInfo;
    }

    public final List<UsersUserFullDto> C() {
        return this.profiles;
    }

    public final Boolean d() {
        return this.audioInClipsFavorite;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ShortVideoAudioDto e() {
        return this.audioInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetChallengeResponseDto)) {
            return false;
        }
        ShortVideoGetChallengeResponseDto shortVideoGetChallengeResponseDto = (ShortVideoGetChallengeResponseDto) obj;
        return epx.f(this.challenge, shortVideoGetChallengeResponseDto.challenge) && epx.f(this.profiles, shortVideoGetChallengeResponseDto.profiles) && epx.f(this.groups, shortVideoGetChallengeResponseDto.groups) && epx.f(this.counters, shortVideoGetChallengeResponseDto.counters) && epx.f(this.compilationInfo, shortVideoGetChallengeResponseDto.compilationInfo) && epx.f(this.maskInfo, shortVideoGetChallengeResponseDto.maskInfo) && epx.f(this.effectInfo, shortVideoGetChallengeResponseDto.effectInfo) && epx.f(this.audioInfo, shortVideoGetChallengeResponseDto.audioInfo) && epx.f(this.placeInfo, shortVideoGetChallengeResponseDto.placeInfo) && epx.f(this.hashtagInfo, shortVideoGetChallengeResponseDto.hashtagInfo) && epx.f(this.audioInClipsFavorite, shortVideoGetChallengeResponseDto.audioInClipsFavorite) && epx.f(this.canAddAudioToFavorites, shortVideoGetChallengeResponseDto.canAddAudioToFavorites) && epx.f(this.canEveryoneViewOriginalVideo, shortVideoGetChallengeResponseDto.canEveryoneViewOriginalVideo) && epx.f(this.hasAudioTemplates, shortVideoGetChallengeResponseDto.hasAudioTemplates);
    }

    public final Boolean f() {
        return this.canAddAudioToFavorites;
    }

    public final Boolean g() {
        return this.canEveryoneViewOriginalVideo;
    }

    public final int hashCode() {
        ShortVideoChallengeDto shortVideoChallengeDto = this.challenge;
        int hashCode = (shortVideoChallengeDto == null ? 0 : shortVideoChallengeDto.hashCode()) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ShortVideoClipCountersDto shortVideoClipCountersDto = this.counters;
        int hashCode4 = (hashCode3 + (shortVideoClipCountersDto == null ? 0 : shortVideoClipCountersDto.hashCode())) * 31;
        ShortVideoCompilationInfoDto shortVideoCompilationInfoDto = this.compilationInfo;
        int hashCode5 = (hashCode4 + (shortVideoCompilationInfoDto == null ? 0 : shortVideoCompilationInfoDto.hashCode())) * 31;
        MasksMaskDto masksMaskDto = this.maskInfo;
        int hashCode6 = (hashCode5 + (masksMaskDto == null ? 0 : masksMaskDto.hashCode())) * 31;
        MasksEffectDto masksEffectDto = this.effectInfo;
        int hashCode7 = (hashCode6 + (masksEffectDto == null ? 0 : masksEffectDto.hashCode())) * 31;
        ShortVideoAudioDto shortVideoAudioDto = this.audioInfo;
        int hashCode8 = (hashCode7 + (shortVideoAudioDto == null ? 0 : shortVideoAudioDto.hashCode())) * 31;
        PlacesPlaceDto placesPlaceDto = this.placeInfo;
        int hashCode9 = (hashCode8 + (placesPlaceDto == null ? 0 : placesPlaceDto.hashCode())) * 31;
        ShortVideoChallengeHashtagInfoDto shortVideoChallengeHashtagInfoDto = this.hashtagInfo;
        int hashCode10 = (hashCode9 + (shortVideoChallengeHashtagInfoDto == null ? 0 : shortVideoChallengeHashtagInfoDto.hashCode())) * 31;
        Boolean bool = this.audioInClipsFavorite;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canAddAudioToFavorites;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canEveryoneViewOriginalVideo;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasAudioTemplates;
        return hashCode13 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final ShortVideoChallengeDto i() {
        return this.challenge;
    }

    public final ShortVideoCompilationInfoDto j() {
        return this.compilationInfo;
    }

    public final ShortVideoClipCountersDto k() {
        return this.counters;
    }

    public final MasksEffectDto l() {
        return this.effectInfo;
    }

    public final List<GroupsGroupFullDto> n() {
        return this.groups;
    }

    public final Boolean o() {
        return this.hasAudioTemplates;
    }

    public final ShortVideoChallengeHashtagInfoDto p() {
        return this.hashtagInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetChallengeResponseDto(challenge=");
        sb.append(this.challenge);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", counters=");
        sb.append(this.counters);
        sb.append(", compilationInfo=");
        sb.append(this.compilationInfo);
        sb.append(", maskInfo=");
        sb.append(this.maskInfo);
        sb.append(", effectInfo=");
        sb.append(this.effectInfo);
        sb.append(", audioInfo=");
        sb.append(this.audioInfo);
        sb.append(", placeInfo=");
        sb.append(this.placeInfo);
        sb.append(", hashtagInfo=");
        sb.append(this.hashtagInfo);
        sb.append(", audioInClipsFavorite=");
        sb.append(this.audioInClipsFavorite);
        sb.append(", canAddAudioToFavorites=");
        sb.append(this.canAddAudioToFavorites);
        sb.append(", canEveryoneViewOriginalVideo=");
        sb.append(this.canEveryoneViewOriginalVideo);
        sb.append(", hasAudioTemplates=");
        return tn.a(sb, this.hasAudioTemplates, ')');
    }

    public final MasksMaskDto u() {
        return this.maskInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ShortVideoChallengeDto shortVideoChallengeDto = this.challenge;
        if (shortVideoChallengeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoChallengeDto.writeToParcel(parcel, i);
        }
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
        ShortVideoClipCountersDto shortVideoClipCountersDto = this.counters;
        if (shortVideoClipCountersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoClipCountersDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.compilationInfo, i);
        parcel.writeParcelable(this.maskInfo, i);
        parcel.writeParcelable(this.effectInfo, i);
        parcel.writeParcelable(this.audioInfo, i);
        parcel.writeParcelable(this.placeInfo, i);
        ShortVideoChallengeHashtagInfoDto shortVideoChallengeHashtagInfoDto = this.hashtagInfo;
        if (shortVideoChallengeHashtagInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoChallengeHashtagInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.audioInClipsFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canAddAudioToFavorites;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canEveryoneViewOriginalVideo;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.hasAudioTemplates;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public ShortVideoGetChallengeResponseDto(ShortVideoChallengeDto shortVideoChallengeDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, ShortVideoClipCountersDto shortVideoClipCountersDto, ShortVideoCompilationInfoDto shortVideoCompilationInfoDto, MasksMaskDto masksMaskDto, MasksEffectDto masksEffectDto, ShortVideoAudioDto shortVideoAudioDto, PlacesPlaceDto placesPlaceDto, ShortVideoChallengeHashtagInfoDto shortVideoChallengeHashtagInfoDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.challenge = shortVideoChallengeDto;
        this.profiles = list;
        this.groups = list2;
        this.counters = shortVideoClipCountersDto;
        this.compilationInfo = shortVideoCompilationInfoDto;
        this.maskInfo = masksMaskDto;
        this.effectInfo = masksEffectDto;
        this.audioInfo = shortVideoAudioDto;
        this.placeInfo = placesPlaceDto;
        this.hashtagInfo = shortVideoChallengeHashtagInfoDto;
        this.audioInClipsFavorite = bool;
        this.canAddAudioToFavorites = bool2;
        this.canEveryoneViewOriginalVideo = bool3;
        this.hasAudioTemplates = bool4;
    }

    public /* synthetic */ ShortVideoGetChallengeResponseDto(ShortVideoChallengeDto shortVideoChallengeDto, List list, List list2, ShortVideoClipCountersDto shortVideoClipCountersDto, ShortVideoCompilationInfoDto shortVideoCompilationInfoDto, MasksMaskDto masksMaskDto, MasksEffectDto masksEffectDto, ShortVideoAudioDto shortVideoAudioDto, PlacesPlaceDto placesPlaceDto, ShortVideoChallengeHashtagInfoDto shortVideoChallengeHashtagInfoDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : shortVideoChallengeDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : shortVideoClipCountersDto, (i & 16) != 0 ? null : shortVideoCompilationInfoDto, (i & 32) != 0 ? null : masksMaskDto, (i & 64) != 0 ? null : masksEffectDto, (i & 128) != 0 ? null : shortVideoAudioDto, (i & 256) != 0 ? null : placesPlaceDto, (i & 512) != 0 ? null : shortVideoChallengeHashtagInfoDto, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : bool4);
    }
}
