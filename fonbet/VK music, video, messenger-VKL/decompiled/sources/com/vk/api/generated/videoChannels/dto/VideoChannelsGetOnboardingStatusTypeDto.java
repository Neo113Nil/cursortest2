package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoChannelsGetOnboardingStatusTypeDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsGetOnboardingStatusTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoChannelsGetOnboardingStatusTypeDto[] $VALUES;

    @pmi0("clip_without_channel")
    public static final VideoChannelsGetOnboardingStatusTypeDto CLIP_WITHOUT_CHANNEL;

    @pmi0("clip_with_channel")
    public static final VideoChannelsGetOnboardingStatusTypeDto CLIP_WITH_CHANNEL;
    public static final Parcelable.Creator<VideoChannelsGetOnboardingStatusTypeDto> CREATOR;
    private final String value;

    /* compiled from: VideoChannelsGetOnboardingStatusTypeDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsGetOnboardingStatusTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetOnboardingStatusTypeDto createFromParcel(Parcel parcel) {
            return VideoChannelsGetOnboardingStatusTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetOnboardingStatusTypeDto[] newArray(int i) {
            return new VideoChannelsGetOnboardingStatusTypeDto[i];
        }
    }

    static {
        VideoChannelsGetOnboardingStatusTypeDto videoChannelsGetOnboardingStatusTypeDto = new VideoChannelsGetOnboardingStatusTypeDto("CLIP_WITH_CHANNEL", 0, "clip_with_channel");
        CLIP_WITH_CHANNEL = videoChannelsGetOnboardingStatusTypeDto;
        VideoChannelsGetOnboardingStatusTypeDto videoChannelsGetOnboardingStatusTypeDto2 = new VideoChannelsGetOnboardingStatusTypeDto("CLIP_WITHOUT_CHANNEL", 1, "clip_without_channel");
        CLIP_WITHOUT_CHANNEL = videoChannelsGetOnboardingStatusTypeDto2;
        VideoChannelsGetOnboardingStatusTypeDto[] videoChannelsGetOnboardingStatusTypeDtoArr = {videoChannelsGetOnboardingStatusTypeDto, videoChannelsGetOnboardingStatusTypeDto2};
        $VALUES = videoChannelsGetOnboardingStatusTypeDtoArr;
        $ENTRIES = new asp(videoChannelsGetOnboardingStatusTypeDtoArr);
        CREATOR = new a();
    }

    private VideoChannelsGetOnboardingStatusTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoChannelsGetOnboardingStatusTypeDto valueOf(String str) {
        return (VideoChannelsGetOnboardingStatusTypeDto) Enum.valueOf(VideoChannelsGetOnboardingStatusTypeDto.class, str);
    }

    public static VideoChannelsGetOnboardingStatusTypeDto[] values() {
        return (VideoChannelsGetOnboardingStatusTypeDto[]) $VALUES.clone();
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
