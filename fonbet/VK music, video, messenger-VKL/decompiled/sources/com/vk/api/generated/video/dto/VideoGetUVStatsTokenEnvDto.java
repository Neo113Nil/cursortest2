package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetUVStatsTokenEnvDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetUVStatsTokenEnvDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetUVStatsTokenEnvDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetUVStatsTokenEnvDto> CREATOR;

    @pmi0("development")
    public static final VideoGetUVStatsTokenEnvDto DEVELOPMENT;

    @pmi0("production")
    public static final VideoGetUVStatsTokenEnvDto PRODUCTION;
    private final String value;

    /* compiled from: VideoGetUVStatsTokenEnvDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetUVStatsTokenEnvDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetUVStatsTokenEnvDto createFromParcel(Parcel parcel) {
            return VideoGetUVStatsTokenEnvDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetUVStatsTokenEnvDto[] newArray(int i) {
            return new VideoGetUVStatsTokenEnvDto[i];
        }
    }

    static {
        VideoGetUVStatsTokenEnvDto videoGetUVStatsTokenEnvDto = new VideoGetUVStatsTokenEnvDto("DEVELOPMENT", 0, "development");
        DEVELOPMENT = videoGetUVStatsTokenEnvDto;
        VideoGetUVStatsTokenEnvDto videoGetUVStatsTokenEnvDto2 = new VideoGetUVStatsTokenEnvDto("PRODUCTION", 1, "production");
        PRODUCTION = videoGetUVStatsTokenEnvDto2;
        VideoGetUVStatsTokenEnvDto[] videoGetUVStatsTokenEnvDtoArr = {videoGetUVStatsTokenEnvDto, videoGetUVStatsTokenEnvDto2};
        $VALUES = videoGetUVStatsTokenEnvDtoArr;
        $ENTRIES = new asp(videoGetUVStatsTokenEnvDtoArr);
        CREATOR = new a();
    }

    private VideoGetUVStatsTokenEnvDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetUVStatsTokenEnvDto valueOf(String str) {
        return (VideoGetUVStatsTokenEnvDto) Enum.valueOf(VideoGetUVStatsTokenEnvDto.class, str);
    }

    public static VideoGetUVStatsTokenEnvDto[] values() {
        return (VideoGetUVStatsTokenEnvDto[]) $VALUES.clone();
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
