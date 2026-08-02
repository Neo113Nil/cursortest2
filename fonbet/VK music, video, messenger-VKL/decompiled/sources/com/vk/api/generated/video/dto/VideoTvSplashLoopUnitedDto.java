package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoTvSplashLoopUnitedDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvSplashLoopUnitedDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvSplashLoopUnitedDto> CREATOR = new a();

    @pmi0("loop_timing")
    private final VideoTvSplashLoopTimingDto loopTiming;

    @pmi0("source")
    private final String source;

    /* compiled from: VideoTvSplashLoopUnitedDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvSplashLoopUnitedDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvSplashLoopUnitedDto createFromParcel(Parcel parcel) {
            return new VideoTvSplashLoopUnitedDto(parcel.readString(), parcel.readInt() == 0 ? null : VideoTvSplashLoopTimingDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvSplashLoopUnitedDto[] newArray(int i) {
            return new VideoTvSplashLoopUnitedDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoTvSplashLoopUnitedDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvSplashLoopUnitedDto)) {
            return false;
        }
        VideoTvSplashLoopUnitedDto videoTvSplashLoopUnitedDto = (VideoTvSplashLoopUnitedDto) obj;
        return epx.f(this.source, videoTvSplashLoopUnitedDto.source) && epx.f(this.loopTiming, videoTvSplashLoopUnitedDto.loopTiming);
    }

    public final int hashCode() {
        String str = this.source;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        VideoTvSplashLoopTimingDto videoTvSplashLoopTimingDto = this.loopTiming;
        return hashCode + (videoTvSplashLoopTimingDto != null ? videoTvSplashLoopTimingDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTvSplashLoopUnitedDto(source=" + this.source + ", loopTiming=" + this.loopTiming + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.source);
        VideoTvSplashLoopTimingDto videoTvSplashLoopTimingDto = this.loopTiming;
        if (videoTvSplashLoopTimingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTvSplashLoopTimingDto.writeToParcel(parcel, i);
        }
    }

    public VideoTvSplashLoopUnitedDto(String str, VideoTvSplashLoopTimingDto videoTvSplashLoopTimingDto) {
        this.source = str;
        this.loopTiming = videoTvSplashLoopTimingDto;
    }

    public /* synthetic */ VideoTvSplashLoopUnitedDto(String str, VideoTvSplashLoopTimingDto videoTvSplashLoopTimingDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : videoTvSplashLoopTimingDto);
    }
}
