package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoGetStreamSearchOptionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetStreamSearchOptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetStreamSearchOptionsResponseDto> CREATOR = new a();

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("filters")
    private final VideoLiveSearchFiltersDto filters;

    /* compiled from: VideoGetStreamSearchOptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetStreamSearchOptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetStreamSearchOptionsResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetStreamSearchOptionsResponseDto((BaseBoolIntDto) parcel.readParcelable(VideoGetStreamSearchOptionsResponseDto.class.getClassLoader()), VideoLiveSearchFiltersDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetStreamSearchOptionsResponseDto[] newArray(int i) {
            return new VideoGetStreamSearchOptionsResponseDto[i];
        }
    }

    public VideoGetStreamSearchOptionsResponseDto(BaseBoolIntDto baseBoolIntDto, VideoLiveSearchFiltersDto videoLiveSearchFiltersDto) {
        this.enabled = baseBoolIntDto;
        this.filters = videoLiveSearchFiltersDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetStreamSearchOptionsResponseDto)) {
            return false;
        }
        VideoGetStreamSearchOptionsResponseDto videoGetStreamSearchOptionsResponseDto = (VideoGetStreamSearchOptionsResponseDto) obj;
        return this.enabled == videoGetStreamSearchOptionsResponseDto.enabled && epx.f(this.filters, videoGetStreamSearchOptionsResponseDto.filters);
    }

    public final int hashCode() {
        return this.filters.hashCode() + (this.enabled.hashCode() * 31);
    }

    public final String toString() {
        return "VideoGetStreamSearchOptionsResponseDto(enabled=" + this.enabled + ", filters=" + this.filters + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.enabled, i);
        this.filters.writeToParcel(parcel, i);
    }
}
