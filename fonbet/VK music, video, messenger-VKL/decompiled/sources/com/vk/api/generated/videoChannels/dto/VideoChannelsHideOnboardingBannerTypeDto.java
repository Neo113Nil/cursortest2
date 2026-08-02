package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoChannelsHideOnboardingBannerTypeDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsHideOnboardingBannerTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoChannelsHideOnboardingBannerTypeDto[] $VALUES;

    @pmi0("congrats")
    public static final VideoChannelsHideOnboardingBannerTypeDto CONGRATS;
    public static final Parcelable.Creator<VideoChannelsHideOnboardingBannerTypeDto> CREATOR;

    @pmi0("try_other")
    public static final VideoChannelsHideOnboardingBannerTypeDto TRY_OTHER;
    private final String value;

    /* compiled from: VideoChannelsHideOnboardingBannerTypeDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsHideOnboardingBannerTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsHideOnboardingBannerTypeDto createFromParcel(Parcel parcel) {
            return VideoChannelsHideOnboardingBannerTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsHideOnboardingBannerTypeDto[] newArray(int i) {
            return new VideoChannelsHideOnboardingBannerTypeDto[i];
        }
    }

    static {
        VideoChannelsHideOnboardingBannerTypeDto videoChannelsHideOnboardingBannerTypeDto = new VideoChannelsHideOnboardingBannerTypeDto("CONGRATS", 0, "congrats");
        CONGRATS = videoChannelsHideOnboardingBannerTypeDto;
        VideoChannelsHideOnboardingBannerTypeDto videoChannelsHideOnboardingBannerTypeDto2 = new VideoChannelsHideOnboardingBannerTypeDto("TRY_OTHER", 1, "try_other");
        TRY_OTHER = videoChannelsHideOnboardingBannerTypeDto2;
        VideoChannelsHideOnboardingBannerTypeDto[] videoChannelsHideOnboardingBannerTypeDtoArr = {videoChannelsHideOnboardingBannerTypeDto, videoChannelsHideOnboardingBannerTypeDto2};
        $VALUES = videoChannelsHideOnboardingBannerTypeDtoArr;
        $ENTRIES = new asp(videoChannelsHideOnboardingBannerTypeDtoArr);
        CREATOR = new a();
    }

    private VideoChannelsHideOnboardingBannerTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoChannelsHideOnboardingBannerTypeDto valueOf(String str) {
        return (VideoChannelsHideOnboardingBannerTypeDto) Enum.valueOf(VideoChannelsHideOnboardingBannerTypeDto.class, str);
    }

    public static VideoChannelsHideOnboardingBannerTypeDto[] values() {
        return (VideoChannelsHideOnboardingBannerTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
