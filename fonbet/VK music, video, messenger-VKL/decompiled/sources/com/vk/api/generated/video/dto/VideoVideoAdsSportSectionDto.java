package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoVideoAdsSportSectionDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsSportSectionDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsSportSectionDto> CREATOR = new a();

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoVideoAdsSportSectionDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsSportSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsSportSectionDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsSportSectionDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsSportSectionDto[] newArray(int i) {
            return new VideoVideoAdsSportSectionDto[i];
        }
    }

    public VideoVideoAdsSportSectionDto(String str, String str2) {
        this.type = str;
        this.url = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAdsSportSectionDto)) {
            return false;
        }
        VideoVideoAdsSportSectionDto videoVideoAdsSportSectionDto = (VideoVideoAdsSportSectionDto) obj;
        return epx.f(this.type, videoVideoAdsSportSectionDto.type) && epx.f(this.url, videoVideoAdsSportSectionDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoAdsSportSectionDto(type=");
        sb.append(this.type);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.url);
    }
}
