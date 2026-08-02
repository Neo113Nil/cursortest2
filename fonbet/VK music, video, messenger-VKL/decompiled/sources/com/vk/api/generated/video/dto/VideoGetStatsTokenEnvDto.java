package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetStatsTokenEnvDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetStatsTokenEnvDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetStatsTokenEnvDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetStatsTokenEnvDto> CREATOR;

    @pmi0("development")
    public static final VideoGetStatsTokenEnvDto DEVELOPMENT;

    @pmi0("production")
    public static final VideoGetStatsTokenEnvDto PRODUCTION;
    private final String value;

    /* compiled from: VideoGetStatsTokenEnvDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetStatsTokenEnvDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetStatsTokenEnvDto createFromParcel(Parcel parcel) {
            return VideoGetStatsTokenEnvDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetStatsTokenEnvDto[] newArray(int i) {
            return new VideoGetStatsTokenEnvDto[i];
        }
    }

    static {
        VideoGetStatsTokenEnvDto videoGetStatsTokenEnvDto = new VideoGetStatsTokenEnvDto("DEVELOPMENT", 0, "development");
        DEVELOPMENT = videoGetStatsTokenEnvDto;
        VideoGetStatsTokenEnvDto videoGetStatsTokenEnvDto2 = new VideoGetStatsTokenEnvDto("PRODUCTION", 1, "production");
        PRODUCTION = videoGetStatsTokenEnvDto2;
        VideoGetStatsTokenEnvDto[] videoGetStatsTokenEnvDtoArr = {videoGetStatsTokenEnvDto, videoGetStatsTokenEnvDto2};
        $VALUES = videoGetStatsTokenEnvDtoArr;
        $ENTRIES = new asp(videoGetStatsTokenEnvDtoArr);
        CREATOR = new a();
    }

    private VideoGetStatsTokenEnvDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetStatsTokenEnvDto valueOf(String str) {
        return (VideoGetStatsTokenEnvDto) Enum.valueOf(VideoGetStatsTokenEnvDto.class, str);
    }

    public static VideoGetStatsTokenEnvDto[] values() {
        return (VideoGetStatsTokenEnvDto[]) $VALUES.clone();
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
