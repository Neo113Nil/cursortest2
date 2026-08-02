package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoKinoMailSeasonDto.kt */
/* loaded from: classes15.dex */
public final class VideoKinoMailSeasonDto implements Parcelable {
    public static final Parcelable.Creator<VideoKinoMailSeasonDto> CREATOR = new a();

    @pmi0("episode_total")
    private final Integer episodeTotal;

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("name_eng")
    private final String nameEng;

    @pmi0("season_num")
    private final Integer seasonNum;

    /* compiled from: VideoKinoMailSeasonDto.kt */
    public static final class a implements Parcelable.Creator<VideoKinoMailSeasonDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailSeasonDto createFromParcel(Parcel parcel) {
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            Integer num = null;
            Integer num2 = valueOf2;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new VideoKinoMailSeasonDto(valueOf, num2, readString, readString2, num);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailSeasonDto[] newArray(int i) {
            return new VideoKinoMailSeasonDto[i];
        }
    }

    public VideoKinoMailSeasonDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoKinoMailSeasonDto)) {
            return false;
        }
        VideoKinoMailSeasonDto videoKinoMailSeasonDto = (VideoKinoMailSeasonDto) obj;
        return epx.f(this.id, videoKinoMailSeasonDto.id) && epx.f(this.episodeTotal, videoKinoMailSeasonDto.episodeTotal) && epx.f(this.name, videoKinoMailSeasonDto.name) && epx.f(this.nameEng, videoKinoMailSeasonDto.nameEng) && epx.f(this.seasonNum, videoKinoMailSeasonDto.seasonNum);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.episodeTotal;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameEng;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.seasonNum;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoKinoMailSeasonDto(id=");
        sb.append(this.id);
        sb.append(", episodeTotal=");
        sb.append(this.episodeTotal);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", nameEng=");
        sb.append(this.nameEng);
        sb.append(", seasonNum=");
        return uqi.b(sb, this.seasonNum, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.episodeTotal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.nameEng);
        Integer num3 = this.seasonNum;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public VideoKinoMailSeasonDto(Integer num, Integer num2, String str, String str2, Integer num3) {
        this.id = num;
        this.episodeTotal = num2;
        this.name = str;
        this.nameEng = str2;
        this.seasonNum = num3;
    }

    public /* synthetic */ VideoKinoMailSeasonDto(Integer num, Integer num2, String str, String str2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num3);
    }
}
