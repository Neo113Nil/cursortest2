package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoKinoMailGenreDto.kt */
/* loaded from: classes15.dex */
public final class VideoKinoMailGenreDto implements Parcelable {
    public static final Parcelable.Creator<VideoKinoMailGenreDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    /* compiled from: VideoKinoMailGenreDto.kt */
    public static final class a implements Parcelable.Creator<VideoKinoMailGenreDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailGenreDto createFromParcel(Parcel parcel) {
            return new VideoKinoMailGenreDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailGenreDto[] newArray(int i) {
            return new VideoKinoMailGenreDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoKinoMailGenreDto() {
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
        if (!(obj instanceof VideoKinoMailGenreDto)) {
            return false;
        }
        VideoKinoMailGenreDto videoKinoMailGenreDto = (VideoKinoMailGenreDto) obj;
        return epx.f(this.id, videoKinoMailGenreDto.id) && epx.f(this.name, videoKinoMailGenreDto.name);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoKinoMailGenreDto(id=");
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

    public VideoKinoMailGenreDto(Integer num, String str) {
        this.id = num;
        this.name = str;
    }

    public /* synthetic */ VideoKinoMailGenreDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
