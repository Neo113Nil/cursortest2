package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetAssistantSearchPreviewCategoryDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAssistantSearchPreviewCategoryDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetAssistantSearchPreviewCategoryDto[] $VALUES;

    @pmi0("common")
    public static final VideoGetAssistantSearchPreviewCategoryDto COMMON;
    public static final Parcelable.Creator<VideoGetAssistantSearchPreviewCategoryDto> CREATOR;

    @pmi0("music")
    public static final VideoGetAssistantSearchPreviewCategoryDto MUSIC;
    private final String value;

    /* compiled from: VideoGetAssistantSearchPreviewCategoryDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAssistantSearchPreviewCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantSearchPreviewCategoryDto createFromParcel(Parcel parcel) {
            return VideoGetAssistantSearchPreviewCategoryDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantSearchPreviewCategoryDto[] newArray(int i) {
            return new VideoGetAssistantSearchPreviewCategoryDto[i];
        }
    }

    static {
        VideoGetAssistantSearchPreviewCategoryDto videoGetAssistantSearchPreviewCategoryDto = new VideoGetAssistantSearchPreviewCategoryDto("COMMON", 0, "common");
        COMMON = videoGetAssistantSearchPreviewCategoryDto;
        VideoGetAssistantSearchPreviewCategoryDto videoGetAssistantSearchPreviewCategoryDto2 = new VideoGetAssistantSearchPreviewCategoryDto("MUSIC", 1, "music");
        MUSIC = videoGetAssistantSearchPreviewCategoryDto2;
        VideoGetAssistantSearchPreviewCategoryDto[] videoGetAssistantSearchPreviewCategoryDtoArr = {videoGetAssistantSearchPreviewCategoryDto, videoGetAssistantSearchPreviewCategoryDto2};
        $VALUES = videoGetAssistantSearchPreviewCategoryDtoArr;
        $ENTRIES = new asp(videoGetAssistantSearchPreviewCategoryDtoArr);
        CREATOR = new a();
    }

    private VideoGetAssistantSearchPreviewCategoryDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetAssistantSearchPreviewCategoryDto valueOf(String str) {
        return (VideoGetAssistantSearchPreviewCategoryDto) Enum.valueOf(VideoGetAssistantSearchPreviewCategoryDto.class, str);
    }

    public static VideoGetAssistantSearchPreviewCategoryDto[] values() {
        return (VideoGetAssistantSearchPreviewCategoryDto[]) $VALUES.clone();
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
