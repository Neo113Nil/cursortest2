package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAddSeriesPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class VideoAddSeriesPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAddSeriesPrivacyDto[] $VALUES;

    @pmi0("all")
    public static final VideoAddSeriesPrivacyDto ALL;
    public static final Parcelable.Creator<VideoAddSeriesPrivacyDto> CREATOR;

    @pmi0("donut")
    public static final VideoAddSeriesPrivacyDto DONUT;

    @pmi0("editors")
    public static final VideoAddSeriesPrivacyDto EDITORS;

    @pmi0("members")
    public static final VideoAddSeriesPrivacyDto MEMBERS;
    private final String value;

    /* compiled from: VideoAddSeriesPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<VideoAddSeriesPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAddSeriesPrivacyDto createFromParcel(Parcel parcel) {
            return VideoAddSeriesPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAddSeriesPrivacyDto[] newArray(int i) {
            return new VideoAddSeriesPrivacyDto[i];
        }
    }

    static {
        VideoAddSeriesPrivacyDto videoAddSeriesPrivacyDto = new VideoAddSeriesPrivacyDto("ALL", 0, "all");
        ALL = videoAddSeriesPrivacyDto;
        VideoAddSeriesPrivacyDto videoAddSeriesPrivacyDto2 = new VideoAddSeriesPrivacyDto("MEMBERS", 1, "members");
        MEMBERS = videoAddSeriesPrivacyDto2;
        VideoAddSeriesPrivacyDto videoAddSeriesPrivacyDto3 = new VideoAddSeriesPrivacyDto("EDITORS", 2, "editors");
        EDITORS = videoAddSeriesPrivacyDto3;
        VideoAddSeriesPrivacyDto videoAddSeriesPrivacyDto4 = new VideoAddSeriesPrivacyDto("DONUT", 3, "donut");
        DONUT = videoAddSeriesPrivacyDto4;
        VideoAddSeriesPrivacyDto[] videoAddSeriesPrivacyDtoArr = {videoAddSeriesPrivacyDto, videoAddSeriesPrivacyDto2, videoAddSeriesPrivacyDto3, videoAddSeriesPrivacyDto4};
        $VALUES = videoAddSeriesPrivacyDtoArr;
        $ENTRIES = new asp(videoAddSeriesPrivacyDtoArr);
        CREATOR = new a();
    }

    private VideoAddSeriesPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoAddSeriesPrivacyDto valueOf(String str) {
        return (VideoAddSeriesPrivacyDto) Enum.valueOf(VideoAddSeriesPrivacyDto.class, str);
    }

    public static VideoAddSeriesPrivacyDto[] values() {
        return (VideoAddSeriesPrivacyDto[]) $VALUES.clone();
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
