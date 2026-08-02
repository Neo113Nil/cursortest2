package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSuspendAdsReasonDto.kt */
/* loaded from: classes15.dex */
public final class VideoSuspendAdsReasonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSuspendAdsReasonDto[] $VALUES;

    @pmi0("cold_users_ads_suspended_0")
    public static final VideoSuspendAdsReasonDto COLD_USERS_ADS_SUSPENDED_0;

    @pmi0("cold_users_ads_suspended_1")
    public static final VideoSuspendAdsReasonDto COLD_USERS_ADS_SUSPENDED_1;

    @pmi0("cold_users_ads_suspended_2")
    public static final VideoSuspendAdsReasonDto COLD_USERS_ADS_SUSPENDED_2;

    @pmi0("cold_users_ads_suspended_3")
    public static final VideoSuspendAdsReasonDto COLD_USERS_ADS_SUSPENDED_3;
    public static final Parcelable.Creator<VideoSuspendAdsReasonDto> CREATOR;

    @pmi0("dead_soul_ads_suspended_0")
    public static final VideoSuspendAdsReasonDto DEAD_SOUL_ADS_SUSPENDED_0;

    @pmi0("dead_soul_ads_suspended_1")
    public static final VideoSuspendAdsReasonDto DEAD_SOUL_ADS_SUSPENDED_1;

    @pmi0("dead_soul_ads_suspended_2")
    public static final VideoSuspendAdsReasonDto DEAD_SOUL_ADS_SUSPENDED_2;

    @pmi0("dead_soul_ads_suspended_3")
    public static final VideoSuspendAdsReasonDto DEAD_SOUL_ADS_SUSPENDED_3;

    @pmi0("newreg_ads_suspended")
    public static final VideoSuspendAdsReasonDto NEWREG_ADS_SUSPENDED;

    @pmi0("newreg_ads_suspended_60")
    public static final VideoSuspendAdsReasonDto NEWREG_ADS_SUSPENDED_60;

    @pmi0("newreg_ads_suspended_90")
    public static final VideoSuspendAdsReasonDto NEWREG_ADS_SUSPENDED_90;

    @pmi0("saa_install_ads_suspended")
    public static final VideoSuspendAdsReasonDto SAA_INSTALL_ADS_SUSPENDED;
    private final String value;

    /* compiled from: VideoSuspendAdsReasonDto.kt */
    public static final class a implements Parcelable.Creator<VideoSuspendAdsReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSuspendAdsReasonDto createFromParcel(Parcel parcel) {
            return VideoSuspendAdsReasonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSuspendAdsReasonDto[] newArray(int i) {
            return new VideoSuspendAdsReasonDto[i];
        }
    }

    static {
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto = new VideoSuspendAdsReasonDto("SAA_INSTALL_ADS_SUSPENDED", 0, "saa_install_ads_suspended");
        SAA_INSTALL_ADS_SUSPENDED = videoSuspendAdsReasonDto;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto2 = new VideoSuspendAdsReasonDto("NEWREG_ADS_SUSPENDED", 1, "newreg_ads_suspended");
        NEWREG_ADS_SUSPENDED = videoSuspendAdsReasonDto2;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto3 = new VideoSuspendAdsReasonDto("NEWREG_ADS_SUSPENDED_60", 2, "newreg_ads_suspended_60");
        NEWREG_ADS_SUSPENDED_60 = videoSuspendAdsReasonDto3;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto4 = new VideoSuspendAdsReasonDto("NEWREG_ADS_SUSPENDED_90", 3, "newreg_ads_suspended_90");
        NEWREG_ADS_SUSPENDED_90 = videoSuspendAdsReasonDto4;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto5 = new VideoSuspendAdsReasonDto("DEAD_SOUL_ADS_SUSPENDED_0", 4, "dead_soul_ads_suspended_0");
        DEAD_SOUL_ADS_SUSPENDED_0 = videoSuspendAdsReasonDto5;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto6 = new VideoSuspendAdsReasonDto("DEAD_SOUL_ADS_SUSPENDED_1", 5, "dead_soul_ads_suspended_1");
        DEAD_SOUL_ADS_SUSPENDED_1 = videoSuspendAdsReasonDto6;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto7 = new VideoSuspendAdsReasonDto("DEAD_SOUL_ADS_SUSPENDED_2", 6, "dead_soul_ads_suspended_2");
        DEAD_SOUL_ADS_SUSPENDED_2 = videoSuspendAdsReasonDto7;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto8 = new VideoSuspendAdsReasonDto("DEAD_SOUL_ADS_SUSPENDED_3", 7, "dead_soul_ads_suspended_3");
        DEAD_SOUL_ADS_SUSPENDED_3 = videoSuspendAdsReasonDto8;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto9 = new VideoSuspendAdsReasonDto("COLD_USERS_ADS_SUSPENDED_0", 8, "cold_users_ads_suspended_0");
        COLD_USERS_ADS_SUSPENDED_0 = videoSuspendAdsReasonDto9;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto10 = new VideoSuspendAdsReasonDto("COLD_USERS_ADS_SUSPENDED_1", 9, "cold_users_ads_suspended_1");
        COLD_USERS_ADS_SUSPENDED_1 = videoSuspendAdsReasonDto10;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto11 = new VideoSuspendAdsReasonDto("COLD_USERS_ADS_SUSPENDED_2", 10, "cold_users_ads_suspended_2");
        COLD_USERS_ADS_SUSPENDED_2 = videoSuspendAdsReasonDto11;
        VideoSuspendAdsReasonDto videoSuspendAdsReasonDto12 = new VideoSuspendAdsReasonDto("COLD_USERS_ADS_SUSPENDED_3", 11, "cold_users_ads_suspended_3");
        COLD_USERS_ADS_SUSPENDED_3 = videoSuspendAdsReasonDto12;
        VideoSuspendAdsReasonDto[] videoSuspendAdsReasonDtoArr = {videoSuspendAdsReasonDto, videoSuspendAdsReasonDto2, videoSuspendAdsReasonDto3, videoSuspendAdsReasonDto4, videoSuspendAdsReasonDto5, videoSuspendAdsReasonDto6, videoSuspendAdsReasonDto7, videoSuspendAdsReasonDto8, videoSuspendAdsReasonDto9, videoSuspendAdsReasonDto10, videoSuspendAdsReasonDto11, videoSuspendAdsReasonDto12};
        $VALUES = videoSuspendAdsReasonDtoArr;
        $ENTRIES = new asp(videoSuspendAdsReasonDtoArr);
        CREATOR = new a();
    }

    private VideoSuspendAdsReasonDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<VideoSuspendAdsReasonDto> i() {
        return $ENTRIES;
    }

    public static VideoSuspendAdsReasonDto valueOf(String str) {
        return (VideoSuspendAdsReasonDto) Enum.valueOf(VideoSuspendAdsReasonDto.class, str);
    }

    public static VideoSuspendAdsReasonDto[] values() {
        return (VideoSuspendAdsReasonDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
