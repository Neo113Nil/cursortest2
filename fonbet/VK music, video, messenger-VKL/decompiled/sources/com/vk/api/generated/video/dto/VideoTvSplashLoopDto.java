package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoTvSplashLoopDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvSplashLoopDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvSplashLoopDto> CREATOR = new a();

    @pmi0("splash_loop_in")
    private final VideoTvSplashLoopPartDto splashLoopIn;

    @pmi0("splash_loop_main")
    private final VideoTvSplashLoopPartDto splashLoopMain;

    @pmi0("splash_loop_out")
    private final VideoTvSplashLoopPartDto splashLoopOut;

    /* compiled from: VideoTvSplashLoopDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvSplashLoopDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvSplashLoopDto createFromParcel(Parcel parcel) {
            return new VideoTvSplashLoopDto(parcel.readInt() == 0 ? null : VideoTvSplashLoopPartDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoTvSplashLoopPartDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VideoTvSplashLoopPartDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvSplashLoopDto[] newArray(int i) {
            return new VideoTvSplashLoopDto[i];
        }
    }

    public VideoTvSplashLoopDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvSplashLoopDto)) {
            return false;
        }
        VideoTvSplashLoopDto videoTvSplashLoopDto = (VideoTvSplashLoopDto) obj;
        return epx.f(this.splashLoopIn, videoTvSplashLoopDto.splashLoopIn) && epx.f(this.splashLoopMain, videoTvSplashLoopDto.splashLoopMain) && epx.f(this.splashLoopOut, videoTvSplashLoopDto.splashLoopOut);
    }

    public final int hashCode() {
        VideoTvSplashLoopPartDto videoTvSplashLoopPartDto = this.splashLoopIn;
        int hashCode = (videoTvSplashLoopPartDto == null ? 0 : videoTvSplashLoopPartDto.hashCode()) * 31;
        VideoTvSplashLoopPartDto videoTvSplashLoopPartDto2 = this.splashLoopMain;
        int hashCode2 = (hashCode + (videoTvSplashLoopPartDto2 == null ? 0 : videoTvSplashLoopPartDto2.hashCode())) * 31;
        VideoTvSplashLoopPartDto videoTvSplashLoopPartDto3 = this.splashLoopOut;
        return hashCode2 + (videoTvSplashLoopPartDto3 != null ? videoTvSplashLoopPartDto3.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTvSplashLoopDto(splashLoopIn=" + this.splashLoopIn + ", splashLoopMain=" + this.splashLoopMain + ", splashLoopOut=" + this.splashLoopOut + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoTvSplashLoopPartDto videoTvSplashLoopPartDto = this.splashLoopIn;
        if (videoTvSplashLoopPartDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTvSplashLoopPartDto.writeToParcel(parcel, i);
        }
        VideoTvSplashLoopPartDto videoTvSplashLoopPartDto2 = this.splashLoopMain;
        if (videoTvSplashLoopPartDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTvSplashLoopPartDto2.writeToParcel(parcel, i);
        }
        VideoTvSplashLoopPartDto videoTvSplashLoopPartDto3 = this.splashLoopOut;
        if (videoTvSplashLoopPartDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTvSplashLoopPartDto3.writeToParcel(parcel, i);
        }
    }

    public VideoTvSplashLoopDto(VideoTvSplashLoopPartDto videoTvSplashLoopPartDto, VideoTvSplashLoopPartDto videoTvSplashLoopPartDto2, VideoTvSplashLoopPartDto videoTvSplashLoopPartDto3) {
        this.splashLoopIn = videoTvSplashLoopPartDto;
        this.splashLoopMain = videoTvSplashLoopPartDto2;
        this.splashLoopOut = videoTvSplashLoopPartDto3;
    }

    public /* synthetic */ VideoTvSplashLoopDto(VideoTvSplashLoopPartDto videoTvSplashLoopPartDto, VideoTvSplashLoopPartDto videoTvSplashLoopPartDto2, VideoTvSplashLoopPartDto videoTvSplashLoopPartDto3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoTvSplashLoopPartDto, (i & 2) != 0 ? null : videoTvSplashLoopPartDto2, (i & 4) != 0 ? null : videoTvSplashLoopPartDto3);
    }
}
