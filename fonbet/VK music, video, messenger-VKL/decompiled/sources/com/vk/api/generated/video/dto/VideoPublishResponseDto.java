package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoPublishResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoPublishResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoPublishResponseDto> CREATOR = new a();

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: VideoPublishResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoPublishResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoPublishResponseDto createFromParcel(Parcel parcel) {
            return new VideoPublishResponseDto((VideoVideoFullDto) parcel.readParcelable(VideoPublishResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPublishResponseDto[] newArray(int i) {
            return new VideoPublishResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoPublishResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final VideoVideoFullDto d() {
        return this.video;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoPublishResponseDto) && epx.f(this.video, ((VideoPublishResponseDto) obj).video);
    }

    public final int hashCode() {
        VideoVideoFullDto videoVideoFullDto = this.video;
        if (videoVideoFullDto == null) {
            return 0;
        }
        return videoVideoFullDto.hashCode();
    }

    public final String toString() {
        return "VideoPublishResponseDto(video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.video, i);
    }

    public VideoPublishResponseDto(VideoVideoFullDto videoVideoFullDto) {
        this.video = videoVideoFullDto;
    }

    public /* synthetic */ VideoPublishResponseDto(VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoVideoFullDto);
    }
}
