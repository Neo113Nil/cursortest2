package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSetSafeModeSettingsAgeDto.kt */
/* loaded from: classes15.dex */
public final class VideoSetSafeModeSettingsAgeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSetSafeModeSettingsAgeDto[] $VALUES;
    public static final Parcelable.Creator<VideoSetSafeModeSettingsAgeDto> CREATOR;

    @pmi0("0")
    public static final VideoSetSafeModeSettingsAgeDto TYPE_0;

    @pmi0("12")
    public static final VideoSetSafeModeSettingsAgeDto TYPE_12;

    @pmi0("16")
    public static final VideoSetSafeModeSettingsAgeDto TYPE_16;

    @pmi0("6")
    public static final VideoSetSafeModeSettingsAgeDto TYPE_6;
    private final int value;

    /* compiled from: VideoSetSafeModeSettingsAgeDto.kt */
    public static final class a implements Parcelable.Creator<VideoSetSafeModeSettingsAgeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSetSafeModeSettingsAgeDto createFromParcel(Parcel parcel) {
            return VideoSetSafeModeSettingsAgeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSetSafeModeSettingsAgeDto[] newArray(int i) {
            return new VideoSetSafeModeSettingsAgeDto[i];
        }
    }

    static {
        VideoSetSafeModeSettingsAgeDto videoSetSafeModeSettingsAgeDto = new VideoSetSafeModeSettingsAgeDto("TYPE_0", 0, 0);
        TYPE_0 = videoSetSafeModeSettingsAgeDto;
        VideoSetSafeModeSettingsAgeDto videoSetSafeModeSettingsAgeDto2 = new VideoSetSafeModeSettingsAgeDto("TYPE_6", 1, 6);
        TYPE_6 = videoSetSafeModeSettingsAgeDto2;
        VideoSetSafeModeSettingsAgeDto videoSetSafeModeSettingsAgeDto3 = new VideoSetSafeModeSettingsAgeDto("TYPE_12", 2, 12);
        TYPE_12 = videoSetSafeModeSettingsAgeDto3;
        VideoSetSafeModeSettingsAgeDto videoSetSafeModeSettingsAgeDto4 = new VideoSetSafeModeSettingsAgeDto("TYPE_16", 3, 16);
        TYPE_16 = videoSetSafeModeSettingsAgeDto4;
        VideoSetSafeModeSettingsAgeDto[] videoSetSafeModeSettingsAgeDtoArr = {videoSetSafeModeSettingsAgeDto, videoSetSafeModeSettingsAgeDto2, videoSetSafeModeSettingsAgeDto3, videoSetSafeModeSettingsAgeDto4};
        $VALUES = videoSetSafeModeSettingsAgeDtoArr;
        $ENTRIES = new asp(videoSetSafeModeSettingsAgeDtoArr);
        CREATOR = new a();
    }

    private VideoSetSafeModeSettingsAgeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoSetSafeModeSettingsAgeDto valueOf(String str) {
        return (VideoSetSafeModeSettingsAgeDto) Enum.valueOf(VideoSetSafeModeSettingsAgeDto.class, str);
    }

    public static VideoSetSafeModeSettingsAgeDto[] values() {
        return (VideoSetSafeModeSettingsAgeDto[]) $VALUES.clone();
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
