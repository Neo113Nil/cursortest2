package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoEditSeasonPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class VideoEditSeasonPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoEditSeasonPrivacyDto[] $VALUES;

    @pmi0("all")
    public static final VideoEditSeasonPrivacyDto ALL;
    public static final Parcelable.Creator<VideoEditSeasonPrivacyDto> CREATOR;

    @pmi0("donut")
    public static final VideoEditSeasonPrivacyDto DONUT;

    @pmi0("editors")
    public static final VideoEditSeasonPrivacyDto EDITORS;

    @pmi0("members")
    public static final VideoEditSeasonPrivacyDto MEMBERS;
    private final String value;

    /* compiled from: VideoEditSeasonPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<VideoEditSeasonPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoEditSeasonPrivacyDto createFromParcel(Parcel parcel) {
            return VideoEditSeasonPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEditSeasonPrivacyDto[] newArray(int i) {
            return new VideoEditSeasonPrivacyDto[i];
        }
    }

    static {
        VideoEditSeasonPrivacyDto videoEditSeasonPrivacyDto = new VideoEditSeasonPrivacyDto("ALL", 0, "all");
        ALL = videoEditSeasonPrivacyDto;
        VideoEditSeasonPrivacyDto videoEditSeasonPrivacyDto2 = new VideoEditSeasonPrivacyDto("MEMBERS", 1, "members");
        MEMBERS = videoEditSeasonPrivacyDto2;
        VideoEditSeasonPrivacyDto videoEditSeasonPrivacyDto3 = new VideoEditSeasonPrivacyDto("EDITORS", 2, "editors");
        EDITORS = videoEditSeasonPrivacyDto3;
        VideoEditSeasonPrivacyDto videoEditSeasonPrivacyDto4 = new VideoEditSeasonPrivacyDto("DONUT", 3, "donut");
        DONUT = videoEditSeasonPrivacyDto4;
        VideoEditSeasonPrivacyDto[] videoEditSeasonPrivacyDtoArr = {videoEditSeasonPrivacyDto, videoEditSeasonPrivacyDto2, videoEditSeasonPrivacyDto3, videoEditSeasonPrivacyDto4};
        $VALUES = videoEditSeasonPrivacyDtoArr;
        $ENTRIES = new asp(videoEditSeasonPrivacyDtoArr);
        CREATOR = new a();
    }

    private VideoEditSeasonPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoEditSeasonPrivacyDto valueOf(String str) {
        return (VideoEditSeasonPrivacyDto) Enum.valueOf(VideoEditSeasonPrivacyDto.class, str);
    }

    public static VideoEditSeasonPrivacyDto[] values() {
        return (VideoEditSeasonPrivacyDto[]) $VALUES.clone();
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
