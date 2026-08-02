package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoVideoAdsMobileDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsMobileDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsMobileDto> CREATOR = new a();

    @pmi0("instreamads")
    private final VideoVideoAdsMobileInstreamadsDto instreamads;

    @pmi0("version")
    private final String version;

    /* compiled from: VideoVideoAdsMobileDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsMobileDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsMobileDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsMobileDto(parcel.readString(), VideoVideoAdsMobileInstreamadsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsMobileDto[] newArray(int i) {
            return new VideoVideoAdsMobileDto[i];
        }
    }

    public VideoVideoAdsMobileDto(String str, VideoVideoAdsMobileInstreamadsDto videoVideoAdsMobileInstreamadsDto) {
        this.version = str;
        this.instreamads = videoVideoAdsMobileInstreamadsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAdsMobileDto)) {
            return false;
        }
        VideoVideoAdsMobileDto videoVideoAdsMobileDto = (VideoVideoAdsMobileDto) obj;
        return epx.f(this.version, videoVideoAdsMobileDto.version) && epx.f(this.instreamads, videoVideoAdsMobileDto.instreamads);
    }

    public final int hashCode() {
        return this.instreamads.hashCode() + (this.version.hashCode() * 31);
    }

    public final String toString() {
        return "VideoVideoAdsMobileDto(version=" + this.version + ", instreamads=" + this.instreamads + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.version);
        this.instreamads.writeToParcel(parcel, i);
    }
}
