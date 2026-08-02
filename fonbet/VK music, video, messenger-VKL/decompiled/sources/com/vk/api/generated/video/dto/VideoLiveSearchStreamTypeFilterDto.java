package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoLiveSearchStreamTypeFilterDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveSearchStreamTypeFilterDto implements Parcelable {
    public static final Parcelable.Creator<VideoLiveSearchStreamTypeFilterDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    /* compiled from: VideoLiveSearchStreamTypeFilterDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveSearchStreamTypeFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveSearchStreamTypeFilterDto createFromParcel(Parcel parcel) {
            return new VideoLiveSearchStreamTypeFilterDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveSearchStreamTypeFilterDto[] newArray(int i) {
            return new VideoLiveSearchStreamTypeFilterDto[i];
        }
    }

    public VideoLiveSearchStreamTypeFilterDto(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveSearchStreamTypeFilterDto)) {
            return false;
        }
        VideoLiveSearchStreamTypeFilterDto videoLiveSearchStreamTypeFilterDto = (VideoLiveSearchStreamTypeFilterDto) obj;
        return epx.f(this.id, videoLiveSearchStreamTypeFilterDto.id) && epx.f(this.name, videoLiveSearchStreamTypeFilterDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoLiveSearchStreamTypeFilterDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
    }
}
