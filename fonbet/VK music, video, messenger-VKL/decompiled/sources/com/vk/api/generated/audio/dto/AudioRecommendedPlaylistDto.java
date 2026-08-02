package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AudioRecommendedPlaylistDto.kt */
/* loaded from: classes14.dex */
public final class AudioRecommendedPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<AudioRecommendedPlaylistDto> CREATOR = new a();

    @pmi0("audios")
    private final List<String> audios;

    @pmi0("color")
    private final String color;

    @pmi0("cover")
    private final String cover;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_curator")
    private final Boolean isCurator;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("percentage")
    private final Float percentage;

    @pmi0("percentage_title")
    private final String percentageTitle;

    @pmi0("photo")
    private final AudioPhotoDto photo;

    @pmi0("withOwner")
    private final Boolean withOwner;

    /* compiled from: AudioRecommendedPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<AudioRecommendedPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioRecommendedPlaylistDto createFromParcel(Parcel parcel) {
            Float valueOf;
            Boolean bool;
            Boolean valueOf2;
            Boolean bool2;
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId = (UserId) parcel.readParcelable(AudioRecommendedPlaylistDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Float.valueOf(parcel.readFloat());
                bool = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = bool;
                bool2 = valueOf2;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                bool2 = bool;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Float f = valueOf;
            Boolean bool3 = valueOf2;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            AudioPhotoDto audioPhotoDto = (AudioPhotoDto) parcel.readParcelable(AudioRecommendedPlaylistDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioRecommendedPlaylistDto(valueOf3, userId, f, readString, bool3, createStringArrayList, readString2, readString3, audioPhotoDto, bool2);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioRecommendedPlaylistDto[] newArray(int i) {
            return new AudioRecommendedPlaylistDto[i];
        }
    }

    public AudioRecommendedPlaylistDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final List<String> d() {
        return this.audios;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioRecommendedPlaylistDto)) {
            return false;
        }
        AudioRecommendedPlaylistDto audioRecommendedPlaylistDto = (AudioRecommendedPlaylistDto) obj;
        return epx.f(this.id, audioRecommendedPlaylistDto.id) && epx.f(this.ownerId, audioRecommendedPlaylistDto.ownerId) && epx.f(this.percentage, audioRecommendedPlaylistDto.percentage) && epx.f(this.percentageTitle, audioRecommendedPlaylistDto.percentageTitle) && epx.f(this.isCurator, audioRecommendedPlaylistDto.isCurator) && epx.f(this.audios, audioRecommendedPlaylistDto.audios) && epx.f(this.color, audioRecommendedPlaylistDto.color) && epx.f(this.cover, audioRecommendedPlaylistDto.cover) && epx.f(this.photo, audioRecommendedPlaylistDto.photo) && epx.f(this.withOwner, audioRecommendedPlaylistDto.withOwner);
    }

    public final String f() {
        return this.cover;
    }

    public final Integer g() {
        return this.id;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Float f = this.percentage;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.percentageTitle;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isCurator;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.audios;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.color;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cover;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AudioPhotoDto audioPhotoDto = this.photo;
        int hashCode9 = (hashCode8 + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        Boolean bool2 = this.withOwner;
        return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Float i() {
        return this.percentage;
    }

    public final String j() {
        return this.percentageTitle;
    }

    public final AudioPhotoDto k() {
        return this.photo;
    }

    public final Boolean l() {
        return this.withOwner;
    }

    public final Boolean n() {
        return this.isCurator;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioRecommendedPlaylistDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", percentage=");
        sb.append(this.percentage);
        sb.append(", percentageTitle=");
        sb.append(this.percentageTitle);
        sb.append(", isCurator=");
        sb.append(this.isCurator);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", withOwner=");
        return tn.a(sb, this.withOwner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.ownerId, i);
        Float f = this.percentage;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.percentageTitle);
        Boolean bool = this.isCurator;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeStringList(this.audios);
        parcel.writeString(this.color);
        parcel.writeString(this.cover);
        parcel.writeParcelable(this.photo, i);
        Boolean bool2 = this.withOwner;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public AudioRecommendedPlaylistDto(Integer num, UserId userId, Float f, String str, Boolean bool, List<String> list, String str2, String str3, AudioPhotoDto audioPhotoDto, Boolean bool2) {
        this.id = num;
        this.ownerId = userId;
        this.percentage = f;
        this.percentageTitle = str;
        this.isCurator = bool;
        this.audios = list;
        this.color = str2;
        this.cover = str3;
        this.photo = audioPhotoDto;
        this.withOwner = bool2;
    }

    public /* synthetic */ AudioRecommendedPlaylistDto(Integer num, UserId userId, Float f, String str, Boolean bool, List list, String str2, String str3, AudioPhotoDto audioPhotoDto, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : audioPhotoDto, (i & 512) != 0 ? null : bool2);
    }
}
