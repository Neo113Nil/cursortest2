package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAddSeasonPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class VideoAddSeasonPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAddSeasonPrivacyDto[] $VALUES;

    @pmi0("all")
    public static final VideoAddSeasonPrivacyDto ALL;
    public static final Parcelable.Creator<VideoAddSeasonPrivacyDto> CREATOR;

    @pmi0("donut")
    public static final VideoAddSeasonPrivacyDto DONUT;

    @pmi0("editors")
    public static final VideoAddSeasonPrivacyDto EDITORS;

    @pmi0("members")
    public static final VideoAddSeasonPrivacyDto MEMBERS;
    private final String value;

    /* compiled from: VideoAddSeasonPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<VideoAddSeasonPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAddSeasonPrivacyDto createFromParcel(Parcel parcel) {
            return VideoAddSeasonPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAddSeasonPrivacyDto[] newArray(int i) {
            return new VideoAddSeasonPrivacyDto[i];
        }
    }

    static {
        VideoAddSeasonPrivacyDto videoAddSeasonPrivacyDto = new VideoAddSeasonPrivacyDto("ALL", 0, "all");
        ALL = videoAddSeasonPrivacyDto;
        VideoAddSeasonPrivacyDto videoAddSeasonPrivacyDto2 = new VideoAddSeasonPrivacyDto("MEMBERS", 1, "members");
        MEMBERS = videoAddSeasonPrivacyDto2;
        VideoAddSeasonPrivacyDto videoAddSeasonPrivacyDto3 = new VideoAddSeasonPrivacyDto("EDITORS", 2, "editors");
        EDITORS = videoAddSeasonPrivacyDto3;
        VideoAddSeasonPrivacyDto videoAddSeasonPrivacyDto4 = new VideoAddSeasonPrivacyDto("DONUT", 3, "donut");
        DONUT = videoAddSeasonPrivacyDto4;
        VideoAddSeasonPrivacyDto[] videoAddSeasonPrivacyDtoArr = {videoAddSeasonPrivacyDto, videoAddSeasonPrivacyDto2, videoAddSeasonPrivacyDto3, videoAddSeasonPrivacyDto4};
        $VALUES = videoAddSeasonPrivacyDtoArr;
        $ENTRIES = new asp(videoAddSeasonPrivacyDtoArr);
        CREATOR = new a();
    }

    private VideoAddSeasonPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoAddSeasonPrivacyDto valueOf(String str) {
        return (VideoAddSeasonPrivacyDto) Enum.valueOf(VideoAddSeasonPrivacyDto.class, str);
    }

    public static VideoAddSeasonPrivacyDto[] values() {
        return (VideoAddSeasonPrivacyDto[]) $VALUES.clone();
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
