package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoEditResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoEditResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoEditResponseDto> CREATOR = new a();

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: ShortVideoEditResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoEditResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoEditResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoEditResponseDto((VideoVideoFullDto) parcel.readParcelable(ShortVideoEditResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoEditResponseDto[] newArray(int i) {
            return new ShortVideoEditResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoEditResponseDto() {
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
        return (obj instanceof ShortVideoEditResponseDto) && epx.f(this.video, ((ShortVideoEditResponseDto) obj).video);
    }

    public final int hashCode() {
        VideoVideoFullDto videoVideoFullDto = this.video;
        if (videoVideoFullDto == null) {
            return 0;
        }
        return videoVideoFullDto.hashCode();
    }

    public final String toString() {
        return "ShortVideoEditResponseDto(video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.video, i);
    }

    public ShortVideoEditResponseDto(VideoVideoFullDto videoVideoFullDto) {
        this.video = videoVideoFullDto;
    }

    public /* synthetic */ ShortVideoEditResponseDto(VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoVideoFullDto);
    }
}
