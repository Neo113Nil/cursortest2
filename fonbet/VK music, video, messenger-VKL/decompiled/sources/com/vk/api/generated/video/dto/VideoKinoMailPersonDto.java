package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoKinoMailPersonDto.kt */
/* loaded from: classes15.dex */
public final class VideoKinoMailPersonDto implements Parcelable {
    public static final Parcelable.Creator<VideoKinoMailPersonDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("name_eng")
    private final String nameEng;

    @pmi0("type")
    private final String type;

    /* compiled from: VideoKinoMailPersonDto.kt */
    public static final class a implements Parcelable.Creator<VideoKinoMailPersonDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailPersonDto createFromParcel(Parcel parcel) {
            return new VideoKinoMailPersonDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailPersonDto[] newArray(int i) {
            return new VideoKinoMailPersonDto[i];
        }
    }

    public VideoKinoMailPersonDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoKinoMailPersonDto)) {
            return false;
        }
        VideoKinoMailPersonDto videoKinoMailPersonDto = (VideoKinoMailPersonDto) obj;
        return epx.f(this.id, videoKinoMailPersonDto.id) && epx.f(this.name, videoKinoMailPersonDto.name) && epx.f(this.nameEng, videoKinoMailPersonDto.nameEng) && epx.f(this.type, videoKinoMailPersonDto.type);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameEng;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoKinoMailPersonDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", nameEng=");
        sb.append(this.nameEng);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.nameEng);
        parcel.writeString(this.type);
    }

    public VideoKinoMailPersonDto(Integer num, String str, String str2, String str3) {
        this.id = num;
        this.name = str;
        this.nameEng = str2;
        this.type = str3;
    }

    public /* synthetic */ VideoKinoMailPersonDto(Integer num, String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
