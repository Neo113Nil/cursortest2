package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoVideoTrackingInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoTrackingInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoTrackingInfoDto> CREATOR = new a();

    @pmi0(NotificationCompat.CATEGORY_NAVIGATION)
    private final VideoNavigationDto navigation;

    @pmi0("recom_info")
    private final VideoRecomInfoDto recomInfo;

    @pmi0("search_info")
    private final VideoSearchInfoDto searchInfo;

    /* compiled from: VideoVideoTrackingInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoTrackingInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoTrackingInfoDto createFromParcel(Parcel parcel) {
            return new VideoVideoTrackingInfoDto(parcel.readInt() == 0 ? null : VideoNavigationDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoRecomInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VideoSearchInfoDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoTrackingInfoDto[] newArray(int i) {
            return new VideoVideoTrackingInfoDto[i];
        }
    }

    public VideoVideoTrackingInfoDto() {
        this(null, null, null, 7, null);
    }

    public final VideoNavigationDto d() {
        return this.navigation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VideoRecomInfoDto e() {
        return this.recomInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoTrackingInfoDto)) {
            return false;
        }
        VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = (VideoVideoTrackingInfoDto) obj;
        return epx.f(this.navigation, videoVideoTrackingInfoDto.navigation) && epx.f(this.recomInfo, videoVideoTrackingInfoDto.recomInfo) && epx.f(this.searchInfo, videoVideoTrackingInfoDto.searchInfo);
    }

    public final VideoSearchInfoDto f() {
        return this.searchInfo;
    }

    public final int hashCode() {
        VideoNavigationDto videoNavigationDto = this.navigation;
        int hashCode = (videoNavigationDto == null ? 0 : videoNavigationDto.hashCode()) * 31;
        VideoRecomInfoDto videoRecomInfoDto = this.recomInfo;
        int hashCode2 = (hashCode + (videoRecomInfoDto == null ? 0 : videoRecomInfoDto.hashCode())) * 31;
        VideoSearchInfoDto videoSearchInfoDto = this.searchInfo;
        return hashCode2 + (videoSearchInfoDto != null ? videoSearchInfoDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoVideoTrackingInfoDto(navigation=" + this.navigation + ", recomInfo=" + this.recomInfo + ", searchInfo=" + this.searchInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoNavigationDto videoNavigationDto = this.navigation;
        if (videoNavigationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoNavigationDto.writeToParcel(parcel, i);
        }
        VideoRecomInfoDto videoRecomInfoDto = this.recomInfo;
        if (videoRecomInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoRecomInfoDto.writeToParcel(parcel, i);
        }
        VideoSearchInfoDto videoSearchInfoDto = this.searchInfo;
        if (videoSearchInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoSearchInfoDto.writeToParcel(parcel, i);
        }
    }

    public VideoVideoTrackingInfoDto(VideoNavigationDto videoNavigationDto, VideoRecomInfoDto videoRecomInfoDto, VideoSearchInfoDto videoSearchInfoDto) {
        this.navigation = videoNavigationDto;
        this.recomInfo = videoRecomInfoDto;
        this.searchInfo = videoSearchInfoDto;
    }

    public /* synthetic */ VideoVideoTrackingInfoDto(VideoNavigationDto videoNavigationDto, VideoRecomInfoDto videoRecomInfoDto, VideoSearchInfoDto videoSearchInfoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoNavigationDto, (i & 2) != 0 ? null : videoRecomInfoDto, (i & 4) != 0 ? null : videoSearchInfoDto);
    }
}
