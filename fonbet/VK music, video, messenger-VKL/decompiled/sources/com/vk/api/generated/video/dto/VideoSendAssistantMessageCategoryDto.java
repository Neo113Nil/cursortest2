package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSendAssistantMessageCategoryDto.kt */
/* loaded from: classes15.dex */
public final class VideoSendAssistantMessageCategoryDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSendAssistantMessageCategoryDto[] $VALUES;

    @pmi0("common")
    public static final VideoSendAssistantMessageCategoryDto COMMON;
    public static final Parcelable.Creator<VideoSendAssistantMessageCategoryDto> CREATOR;

    @pmi0("music")
    public static final VideoSendAssistantMessageCategoryDto MUSIC;
    private final String value;

    /* compiled from: VideoSendAssistantMessageCategoryDto.kt */
    public static final class a implements Parcelable.Creator<VideoSendAssistantMessageCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSendAssistantMessageCategoryDto createFromParcel(Parcel parcel) {
            return VideoSendAssistantMessageCategoryDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSendAssistantMessageCategoryDto[] newArray(int i) {
            return new VideoSendAssistantMessageCategoryDto[i];
        }
    }

    static {
        VideoSendAssistantMessageCategoryDto videoSendAssistantMessageCategoryDto = new VideoSendAssistantMessageCategoryDto("COMMON", 0, "common");
        COMMON = videoSendAssistantMessageCategoryDto;
        VideoSendAssistantMessageCategoryDto videoSendAssistantMessageCategoryDto2 = new VideoSendAssistantMessageCategoryDto("MUSIC", 1, "music");
        MUSIC = videoSendAssistantMessageCategoryDto2;
        VideoSendAssistantMessageCategoryDto[] videoSendAssistantMessageCategoryDtoArr = {videoSendAssistantMessageCategoryDto, videoSendAssistantMessageCategoryDto2};
        $VALUES = videoSendAssistantMessageCategoryDtoArr;
        $ENTRIES = new asp(videoSendAssistantMessageCategoryDtoArr);
        CREATOR = new a();
    }

    private VideoSendAssistantMessageCategoryDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoSendAssistantMessageCategoryDto valueOf(String str) {
        return (VideoSendAssistantMessageCategoryDto) Enum.valueOf(VideoSendAssistantMessageCategoryDto.class, str);
    }

    public static VideoSendAssistantMessageCategoryDto[] values() {
        return (VideoSendAssistantMessageCategoryDto[]) $VALUES.clone();
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
