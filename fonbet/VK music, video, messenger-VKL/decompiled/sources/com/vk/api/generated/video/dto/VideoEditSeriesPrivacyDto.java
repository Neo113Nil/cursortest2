package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoEditSeriesPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class VideoEditSeriesPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoEditSeriesPrivacyDto[] $VALUES;

    @pmi0("all")
    public static final VideoEditSeriesPrivacyDto ALL;
    public static final Parcelable.Creator<VideoEditSeriesPrivacyDto> CREATOR;

    @pmi0("donut")
    public static final VideoEditSeriesPrivacyDto DONUT;

    @pmi0("editors")
    public static final VideoEditSeriesPrivacyDto EDITORS;

    @pmi0("members")
    public static final VideoEditSeriesPrivacyDto MEMBERS;
    private final String value;

    /* compiled from: VideoEditSeriesPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<VideoEditSeriesPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoEditSeriesPrivacyDto createFromParcel(Parcel parcel) {
            return VideoEditSeriesPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEditSeriesPrivacyDto[] newArray(int i) {
            return new VideoEditSeriesPrivacyDto[i];
        }
    }

    static {
        VideoEditSeriesPrivacyDto videoEditSeriesPrivacyDto = new VideoEditSeriesPrivacyDto("ALL", 0, "all");
        ALL = videoEditSeriesPrivacyDto;
        VideoEditSeriesPrivacyDto videoEditSeriesPrivacyDto2 = new VideoEditSeriesPrivacyDto("MEMBERS", 1, "members");
        MEMBERS = videoEditSeriesPrivacyDto2;
        VideoEditSeriesPrivacyDto videoEditSeriesPrivacyDto3 = new VideoEditSeriesPrivacyDto("EDITORS", 2, "editors");
        EDITORS = videoEditSeriesPrivacyDto3;
        VideoEditSeriesPrivacyDto videoEditSeriesPrivacyDto4 = new VideoEditSeriesPrivacyDto("DONUT", 3, "donut");
        DONUT = videoEditSeriesPrivacyDto4;
        VideoEditSeriesPrivacyDto[] videoEditSeriesPrivacyDtoArr = {videoEditSeriesPrivacyDto, videoEditSeriesPrivacyDto2, videoEditSeriesPrivacyDto3, videoEditSeriesPrivacyDto4};
        $VALUES = videoEditSeriesPrivacyDtoArr;
        $ENTRIES = new asp(videoEditSeriesPrivacyDtoArr);
        CREATOR = new a();
    }

    private VideoEditSeriesPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoEditSeriesPrivacyDto valueOf(String str) {
        return (VideoEditSeriesPrivacyDto) Enum.valueOf(VideoEditSeriesPrivacyDto.class, str);
    }

    public static VideoEditSeriesPrivacyDto[] values() {
        return (VideoEditSeriesPrivacyDto[]) $VALUES.clone();
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
