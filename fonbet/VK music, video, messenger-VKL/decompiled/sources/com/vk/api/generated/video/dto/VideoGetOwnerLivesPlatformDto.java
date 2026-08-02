package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetOwnerLivesPlatformDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetOwnerLivesPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetOwnerLivesPlatformDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetOwnerLivesPlatformDto> CREATOR;

    @pmi0("desktop")
    public static final VideoGetOwnerLivesPlatformDto DESKTOP;

    @pmi0("mobile")
    public static final VideoGetOwnerLivesPlatformDto MOBILE;
    private final String value;

    /* compiled from: VideoGetOwnerLivesPlatformDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetOwnerLivesPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetOwnerLivesPlatformDto createFromParcel(Parcel parcel) {
            return VideoGetOwnerLivesPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetOwnerLivesPlatformDto[] newArray(int i) {
            return new VideoGetOwnerLivesPlatformDto[i];
        }
    }

    static {
        VideoGetOwnerLivesPlatformDto videoGetOwnerLivesPlatformDto = new VideoGetOwnerLivesPlatformDto("DESKTOP", 0, "desktop");
        DESKTOP = videoGetOwnerLivesPlatformDto;
        VideoGetOwnerLivesPlatformDto videoGetOwnerLivesPlatformDto2 = new VideoGetOwnerLivesPlatformDto("MOBILE", 1, "mobile");
        MOBILE = videoGetOwnerLivesPlatformDto2;
        VideoGetOwnerLivesPlatformDto[] videoGetOwnerLivesPlatformDtoArr = {videoGetOwnerLivesPlatformDto, videoGetOwnerLivesPlatformDto2};
        $VALUES = videoGetOwnerLivesPlatformDtoArr;
        $ENTRIES = new asp(videoGetOwnerLivesPlatformDtoArr);
        CREATOR = new a();
    }

    private VideoGetOwnerLivesPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetOwnerLivesPlatformDto valueOf(String str) {
        return (VideoGetOwnerLivesPlatformDto) Enum.valueOf(VideoGetOwnerLivesPlatformDto.class, str);
    }

    public static VideoGetOwnerLivesPlatformDto[] values() {
        return (VideoGetOwnerLivesPlatformDto[]) $VALUES.clone();
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
