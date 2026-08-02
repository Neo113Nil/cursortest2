package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetNavigationResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetNavigationResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetNavigationResponseDto> CREATOR = new a();

    @pmi0("state")
    private final VideoNavigationStateDto state;

    /* compiled from: VideoGetNavigationResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetNavigationResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetNavigationResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetNavigationResponseDto(parcel.readInt() == 0 ? null : VideoNavigationStateDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetNavigationResponseDto[] newArray(int i) {
            return new VideoGetNavigationResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoGetNavigationResponseDto() {
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
        return (obj instanceof VideoGetNavigationResponseDto) && epx.f(this.state, ((VideoGetNavigationResponseDto) obj).state);
    }

    public final int hashCode() {
        VideoNavigationStateDto videoNavigationStateDto = this.state;
        if (videoNavigationStateDto == null) {
            return 0;
        }
        return videoNavigationStateDto.hashCode();
    }

    public final String toString() {
        return "VideoGetNavigationResponseDto(state=" + this.state + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoNavigationStateDto videoNavigationStateDto = this.state;
        if (videoNavigationStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoNavigationStateDto.writeToParcel(parcel, i);
        }
    }

    public VideoGetNavigationResponseDto(VideoNavigationStateDto videoNavigationStateDto) {
        this.state = videoNavigationStateDto;
    }

    public /* synthetic */ VideoGetNavigationResponseDto(VideoNavigationStateDto videoNavigationStateDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoNavigationStateDto);
    }
}
