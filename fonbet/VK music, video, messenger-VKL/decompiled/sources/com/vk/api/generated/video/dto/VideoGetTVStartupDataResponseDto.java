package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetTVStartupDataResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetTVStartupDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetTVStartupDataResponseDto> CREATOR = new a();

    @pmi0("common")
    private final VideoCommonStartupAppDataDto common;

    @pmi0("kids_onboarding")
    private final List<String> kidsOnboarding;

    @pmi0("logo")
    private final String logo;

    @pmi0("spalsh_loop_united")
    private final VideoTvSplashLoopUnitedDto spalshLoopUnited;

    @pmi0("splash_loop")
    private final VideoTvSplashLoopDto splashLoop;

    @pmi0("splash_screen")
    private final String splashScreen;

    @pmi0("super_splash")
    private final String superSplash;

    /* compiled from: VideoGetTVStartupDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetTVStartupDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetTVStartupDataResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetTVStartupDataResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : VideoTvSplashLoopDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoTvSplashLoopUnitedDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VideoCommonStartupAppDataDto.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetTVStartupDataResponseDto[] newArray(int i) {
            return new VideoGetTVStartupDataResponseDto[i];
        }
    }

    public VideoGetTVStartupDataResponseDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetTVStartupDataResponseDto)) {
            return false;
        }
        VideoGetTVStartupDataResponseDto videoGetTVStartupDataResponseDto = (VideoGetTVStartupDataResponseDto) obj;
        return epx.f(this.logo, videoGetTVStartupDataResponseDto.logo) && epx.f(this.splashScreen, videoGetTVStartupDataResponseDto.splashScreen) && epx.f(this.superSplash, videoGetTVStartupDataResponseDto.superSplash) && epx.f(this.splashLoop, videoGetTVStartupDataResponseDto.splashLoop) && epx.f(this.spalshLoopUnited, videoGetTVStartupDataResponseDto.spalshLoopUnited) && epx.f(this.common, videoGetTVStartupDataResponseDto.common) && epx.f(this.kidsOnboarding, videoGetTVStartupDataResponseDto.kidsOnboarding);
    }

    public final int hashCode() {
        String str = this.logo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.splashScreen;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.superSplash;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VideoTvSplashLoopDto videoTvSplashLoopDto = this.splashLoop;
        int hashCode4 = (hashCode3 + (videoTvSplashLoopDto == null ? 0 : videoTvSplashLoopDto.hashCode())) * 31;
        VideoTvSplashLoopUnitedDto videoTvSplashLoopUnitedDto = this.spalshLoopUnited;
        int hashCode5 = (hashCode4 + (videoTvSplashLoopUnitedDto == null ? 0 : videoTvSplashLoopUnitedDto.hashCode())) * 31;
        VideoCommonStartupAppDataDto videoCommonStartupAppDataDto = this.common;
        int hashCode6 = (hashCode5 + (videoCommonStartupAppDataDto == null ? 0 : videoCommonStartupAppDataDto.hashCode())) * 31;
        List<String> list = this.kidsOnboarding;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetTVStartupDataResponseDto(logo=");
        sb.append(this.logo);
        sb.append(", splashScreen=");
        sb.append(this.splashScreen);
        sb.append(", superSplash=");
        sb.append(this.superSplash);
        sb.append(", splashLoop=");
        sb.append(this.splashLoop);
        sb.append(", spalshLoopUnited=");
        sb.append(this.spalshLoopUnited);
        sb.append(", common=");
        sb.append(this.common);
        sb.append(", kidsOnboarding=");
        return ms9.a(')', sb, this.kidsOnboarding);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.logo);
        parcel.writeString(this.splashScreen);
        parcel.writeString(this.superSplash);
        VideoTvSplashLoopDto videoTvSplashLoopDto = this.splashLoop;
        if (videoTvSplashLoopDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTvSplashLoopDto.writeToParcel(parcel, i);
        }
        VideoTvSplashLoopUnitedDto videoTvSplashLoopUnitedDto = this.spalshLoopUnited;
        if (videoTvSplashLoopUnitedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTvSplashLoopUnitedDto.writeToParcel(parcel, i);
        }
        VideoCommonStartupAppDataDto videoCommonStartupAppDataDto = this.common;
        if (videoCommonStartupAppDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCommonStartupAppDataDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.kidsOnboarding);
    }

    public VideoGetTVStartupDataResponseDto(String str, String str2, String str3, VideoTvSplashLoopDto videoTvSplashLoopDto, VideoTvSplashLoopUnitedDto videoTvSplashLoopUnitedDto, VideoCommonStartupAppDataDto videoCommonStartupAppDataDto, List<String> list) {
        this.logo = str;
        this.splashScreen = str2;
        this.superSplash = str3;
        this.splashLoop = videoTvSplashLoopDto;
        this.spalshLoopUnited = videoTvSplashLoopUnitedDto;
        this.common = videoCommonStartupAppDataDto;
        this.kidsOnboarding = list;
    }

    public /* synthetic */ VideoGetTVStartupDataResponseDto(String str, String str2, String str3, VideoTvSplashLoopDto videoTvSplashLoopDto, VideoTvSplashLoopUnitedDto videoTvSplashLoopUnitedDto, VideoCommonStartupAppDataDto videoCommonStartupAppDataDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : videoTvSplashLoopDto, (i & 16) != 0 ? null : videoTvSplashLoopUnitedDto, (i & 32) != 0 ? null : videoCommonStartupAppDataDto, (i & 64) != 0 ? null : list);
    }
}
