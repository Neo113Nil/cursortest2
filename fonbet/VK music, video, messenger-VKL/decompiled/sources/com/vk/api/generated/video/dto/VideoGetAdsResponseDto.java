package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetAdsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAdsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAdsResponseDto> CREATOR = new a();

    @pmi0("banners")
    private final VideoVideoAdsBannersDto banners;

    @pmi0("instream")
    private final VideoVideoAdsInstreamDto instream;

    @pmi0("mobile_instream")
    private final VideoVideoAdsMobileDto mobileInstream;

    @pmi0("sport")
    private final VideoVideoAdsSportDto sport;

    /* compiled from: VideoGetAdsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAdsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAdsResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetAdsResponseDto(parcel.readInt() == 0 ? null : VideoVideoAdsInstreamDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoVideoAdsSportDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoVideoAdsMobileDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VideoVideoAdsBannersDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAdsResponseDto[] newArray(int i) {
            return new VideoGetAdsResponseDto[i];
        }
    }

    public VideoGetAdsResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final VideoVideoAdsBannersDto d() {
        return this.banners;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoVideoAdsMobileDto e() {
        return this.mobileInstream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetAdsResponseDto)) {
            return false;
        }
        VideoGetAdsResponseDto videoGetAdsResponseDto = (VideoGetAdsResponseDto) obj;
        return epx.f(this.instream, videoGetAdsResponseDto.instream) && epx.f(this.sport, videoGetAdsResponseDto.sport) && epx.f(this.mobileInstream, videoGetAdsResponseDto.mobileInstream) && epx.f(this.banners, videoGetAdsResponseDto.banners);
    }

    public final VideoVideoAdsSportDto f() {
        return this.sport;
    }

    public final int hashCode() {
        VideoVideoAdsInstreamDto videoVideoAdsInstreamDto = this.instream;
        int hashCode = (videoVideoAdsInstreamDto == null ? 0 : videoVideoAdsInstreamDto.hashCode()) * 31;
        VideoVideoAdsSportDto videoVideoAdsSportDto = this.sport;
        int hashCode2 = (hashCode + (videoVideoAdsSportDto == null ? 0 : videoVideoAdsSportDto.hashCode())) * 31;
        VideoVideoAdsMobileDto videoVideoAdsMobileDto = this.mobileInstream;
        int hashCode3 = (hashCode2 + (videoVideoAdsMobileDto == null ? 0 : videoVideoAdsMobileDto.hashCode())) * 31;
        VideoVideoAdsBannersDto videoVideoAdsBannersDto = this.banners;
        return hashCode3 + (videoVideoAdsBannersDto != null ? videoVideoAdsBannersDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoGetAdsResponseDto(instream=" + this.instream + ", sport=" + this.sport + ", mobileInstream=" + this.mobileInstream + ", banners=" + this.banners + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoVideoAdsInstreamDto videoVideoAdsInstreamDto = this.instream;
        if (videoVideoAdsInstreamDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoAdsInstreamDto.writeToParcel(parcel, i);
        }
        VideoVideoAdsSportDto videoVideoAdsSportDto = this.sport;
        if (videoVideoAdsSportDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoAdsSportDto.writeToParcel(parcel, i);
        }
        VideoVideoAdsMobileDto videoVideoAdsMobileDto = this.mobileInstream;
        if (videoVideoAdsMobileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoAdsMobileDto.writeToParcel(parcel, i);
        }
        VideoVideoAdsBannersDto videoVideoAdsBannersDto = this.banners;
        if (videoVideoAdsBannersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoAdsBannersDto.writeToParcel(parcel, i);
        }
    }

    public VideoGetAdsResponseDto(VideoVideoAdsInstreamDto videoVideoAdsInstreamDto, VideoVideoAdsSportDto videoVideoAdsSportDto, VideoVideoAdsMobileDto videoVideoAdsMobileDto, VideoVideoAdsBannersDto videoVideoAdsBannersDto) {
        this.instream = videoVideoAdsInstreamDto;
        this.sport = videoVideoAdsSportDto;
        this.mobileInstream = videoVideoAdsMobileDto;
        this.banners = videoVideoAdsBannersDto;
    }

    public /* synthetic */ VideoGetAdsResponseDto(VideoVideoAdsInstreamDto videoVideoAdsInstreamDto, VideoVideoAdsSportDto videoVideoAdsSportDto, VideoVideoAdsMobileDto videoVideoAdsMobileDto, VideoVideoAdsBannersDto videoVideoAdsBannersDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoVideoAdsInstreamDto, (i & 2) != 0 ? null : videoVideoAdsSportDto, (i & 4) != 0 ? null : videoVideoAdsMobileDto, (i & 8) != 0 ? null : videoVideoAdsBannersDto);
    }
}
