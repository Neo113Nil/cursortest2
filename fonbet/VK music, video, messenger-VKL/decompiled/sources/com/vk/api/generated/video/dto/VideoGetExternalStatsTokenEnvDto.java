package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetExternalStatsTokenEnvDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetExternalStatsTokenEnvDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetExternalStatsTokenEnvDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetExternalStatsTokenEnvDto> CREATOR;

    @pmi0("development")
    public static final VideoGetExternalStatsTokenEnvDto DEVELOPMENT;

    @pmi0("production")
    public static final VideoGetExternalStatsTokenEnvDto PRODUCTION;
    private final String value;

    /* compiled from: VideoGetExternalStatsTokenEnvDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetExternalStatsTokenEnvDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetExternalStatsTokenEnvDto createFromParcel(Parcel parcel) {
            return VideoGetExternalStatsTokenEnvDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetExternalStatsTokenEnvDto[] newArray(int i) {
            return new VideoGetExternalStatsTokenEnvDto[i];
        }
    }

    static {
        VideoGetExternalStatsTokenEnvDto videoGetExternalStatsTokenEnvDto = new VideoGetExternalStatsTokenEnvDto("DEVELOPMENT", 0, "development");
        DEVELOPMENT = videoGetExternalStatsTokenEnvDto;
        VideoGetExternalStatsTokenEnvDto videoGetExternalStatsTokenEnvDto2 = new VideoGetExternalStatsTokenEnvDto("PRODUCTION", 1, "production");
        PRODUCTION = videoGetExternalStatsTokenEnvDto2;
        VideoGetExternalStatsTokenEnvDto[] videoGetExternalStatsTokenEnvDtoArr = {videoGetExternalStatsTokenEnvDto, videoGetExternalStatsTokenEnvDto2};
        $VALUES = videoGetExternalStatsTokenEnvDtoArr;
        $ENTRIES = new asp(videoGetExternalStatsTokenEnvDtoArr);
        CREATOR = new a();
    }

    private VideoGetExternalStatsTokenEnvDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetExternalStatsTokenEnvDto valueOf(String str) {
        return (VideoGetExternalStatsTokenEnvDto) Enum.valueOf(VideoGetExternalStatsTokenEnvDto.class, str);
    }

    public static VideoGetExternalStatsTokenEnvDto[] values() {
        return (VideoGetExternalStatsTokenEnvDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
