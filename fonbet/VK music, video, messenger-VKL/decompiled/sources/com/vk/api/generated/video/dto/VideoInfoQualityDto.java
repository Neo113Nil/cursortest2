package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoInfoQualityDto.kt */
/* loaded from: classes15.dex */
public final class VideoInfoQualityDto implements Parcelable {
    public static final Parcelable.Creator<VideoInfoQualityDto> CREATOR = new a();

    @pmi0("codec")
    private final String codec;

    @pmi0("name")
    private final String name;

    @pmi0("size")
    private final long size;

    /* compiled from: VideoInfoQualityDto.kt */
    public static final class a implements Parcelable.Creator<VideoInfoQualityDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoInfoQualityDto createFromParcel(Parcel parcel) {
            return new VideoInfoQualityDto(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInfoQualityDto[] newArray(int i) {
            return new VideoInfoQualityDto[i];
        }
    }

    public VideoInfoQualityDto(String str, long j, String str2) {
        this.name = str;
        this.size = j;
        this.codec = str2;
    }

    public final String d() {
        return this.codec;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfoQualityDto)) {
            return false;
        }
        VideoInfoQualityDto videoInfoQualityDto = (VideoInfoQualityDto) obj;
        return epx.f(this.name, videoInfoQualityDto.name) && this.size == videoInfoQualityDto.size && epx.f(this.codec, videoInfoQualityDto.codec);
    }

    public final long f() {
        return this.size;
    }

    public final int hashCode() {
        return this.codec.hashCode() + bh10.a(this.name.hashCode() * 31, 31, this.size);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInfoQualityDto(name=");
        sb.append(this.name);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", codec=");
        return ho8.a(sb, this.codec, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeLong(this.size);
        parcel.writeString(this.codec);
    }
}
