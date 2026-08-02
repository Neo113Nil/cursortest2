package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoKinoMailPictureDto.kt */
/* loaded from: classes15.dex */
public final class VideoKinoMailPictureDto implements Parcelable {
    public static final Parcelable.Creator<VideoKinoMailPictureDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: VideoKinoMailPictureDto.kt */
    public static final class a implements Parcelable.Creator<VideoKinoMailPictureDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailPictureDto createFromParcel(Parcel parcel) {
            return new VideoKinoMailPictureDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoKinoMailPictureDto[] newArray(int i) {
            return new VideoKinoMailPictureDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoKinoMailPictureDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoKinoMailPictureDto) && epx.f(this.url, ((VideoKinoMailPictureDto) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoKinoMailPictureDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }

    public VideoKinoMailPictureDto(String str) {
        this.url = str;
    }

    public /* synthetic */ VideoKinoMailPictureDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
