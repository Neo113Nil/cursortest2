package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: ShortVideoSetCoOwnerStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSetCoOwnerStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoSetCoOwnerStatusResponseDto> CREATOR = new a();

    @pmi0("result")
    private final boolean result;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: ShortVideoSetCoOwnerStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSetCoOwnerStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSetCoOwnerStatusResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoSetCoOwnerStatusResponseDto(parcel.readInt() != 0, (VideoVideoFullDto) parcel.readParcelable(ShortVideoSetCoOwnerStatusResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSetCoOwnerStatusResponseDto[] newArray(int i) {
            return new ShortVideoSetCoOwnerStatusResponseDto[i];
        }
    }

    public ShortVideoSetCoOwnerStatusResponseDto(boolean z, VideoVideoFullDto videoVideoFullDto) {
        this.result = z;
        this.video = videoVideoFullDto;
    }

    public final boolean d() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoSetCoOwnerStatusResponseDto)) {
            return false;
        }
        ShortVideoSetCoOwnerStatusResponseDto shortVideoSetCoOwnerStatusResponseDto = (ShortVideoSetCoOwnerStatusResponseDto) obj;
        return this.result == shortVideoSetCoOwnerStatusResponseDto.result && epx.f(this.video, shortVideoSetCoOwnerStatusResponseDto.video);
    }

    public final int hashCode() {
        return this.video.hashCode() + (Boolean.hashCode(this.result) * 31);
    }

    public final String toString() {
        return "ShortVideoSetCoOwnerStatusResponseDto(result=" + this.result + ", video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.result ? 1 : 0);
        parcel.writeParcelable(this.video, i);
    }
}
