package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoKinoMailCountryDto.kt */
/* loaded from: classes15.dex */
public final class VideoKinoMailCountryDto implements Parcelable {
    public static final Parcelable.Creator<VideoKinoMailCountryDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    /* compiled from: VideoKinoMailCountryDto.kt */
    public static final class a implements Parcelable.Creator<VideoKinoMailCountryDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailCountryDto createFromParcel(Parcel parcel) {
            return new VideoKinoMailCountryDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailCountryDto[] newArray(int i) {
            return new VideoKinoMailCountryDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoKinoMailCountryDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
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
        if (!(obj instanceof VideoKinoMailCountryDto)) {
            return false;
        }
        VideoKinoMailCountryDto videoKinoMailCountryDto = (VideoKinoMailCountryDto) obj;
        return epx.f(this.id, videoKinoMailCountryDto.id) && epx.f(this.name, videoKinoMailCountryDto.name);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoKinoMailCountryDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
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
    }

    public VideoKinoMailCountryDto(Integer num, String str) {
        this.id = num;
        this.name = str;
    }

    public /* synthetic */ VideoKinoMailCountryDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
