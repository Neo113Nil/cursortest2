package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: OwnersContentShortVideoItemDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentShortVideoItemDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentShortVideoItemDto> CREATOR = new a();

    @pmi0("short_video")
    private final VideoVideoFullDto shortVideo;

    /* compiled from: OwnersContentShortVideoItemDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentShortVideoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentShortVideoItemDto createFromParcel(Parcel parcel) {
            return new OwnersContentShortVideoItemDto((VideoVideoFullDto) parcel.readParcelable(OwnersContentShortVideoItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentShortVideoItemDto[] newArray(int i) {
            return new OwnersContentShortVideoItemDto[i];
        }
    }

    public OwnersContentShortVideoItemDto(VideoVideoFullDto videoVideoFullDto) {
        this.shortVideo = videoVideoFullDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OwnersContentShortVideoItemDto) && epx.f(this.shortVideo, ((OwnersContentShortVideoItemDto) obj).shortVideo);
    }

    public final int hashCode() {
        return this.shortVideo.hashCode();
    }

    public final String toString() {
        return "OwnersContentShortVideoItemDto(shortVideo=" + this.shortVideo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.shortVideo, i);
    }
}
