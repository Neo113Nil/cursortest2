package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetByIdsVideoFieldsDto.kt */
/* loaded from: classes.dex */
public final class VideoGetByIdsVideoFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetByIdsVideoFieldsDto[] $VALUES;

    @pmi0("added")
    public static final VideoGetByIdsVideoFieldsDto ADDED;
    public static final Parcelable.Creator<VideoGetByIdsVideoFieldsDto> CREATOR;

    @pmi0("episodes")
    public static final VideoGetByIdsVideoFieldsDto EPISODES;

    @pmi0("files")
    public static final VideoGetByIdsVideoFieldsDto FILES;

    @pmi0("first_frame")
    public static final VideoGetByIdsVideoFieldsDto FIRST_FRAME;

    @pmi0("has_market_items")
    public static final VideoGetByIdsVideoFieldsDto HAS_MARKET_ITEMS;

    @pmi0("image")
    public static final VideoGetByIdsVideoFieldsDto IMAGE;

    @pmi0("is_favorite")
    public static final VideoGetByIdsVideoFieldsDto IS_FAVORITE;

    @pmi0("is_subscribed")
    public static final VideoGetByIdsVideoFieldsDto IS_SUBSCRIBED;

    @pmi0("source_file_name")
    public static final VideoGetByIdsVideoFieldsDto SOURCE_FILE_NAME;

    @pmi0("subtitles")
    public static final VideoGetByIdsVideoFieldsDto SUBTITLES;

    @pmi0("timeline_thumbs")
    public static final VideoGetByIdsVideoFieldsDto TIMELINE_THUMBS;

    @pmi0("trailer")
    public static final VideoGetByIdsVideoFieldsDto TRAILER;

    @pmi0("volume_multiplier")
    public static final VideoGetByIdsVideoFieldsDto VOLUME_MULTIPLIER;
    private final String value;

    /* compiled from: VideoGetByIdsVideoFieldsDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetByIdsVideoFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetByIdsVideoFieldsDto createFromParcel(Parcel parcel) {
            return VideoGetByIdsVideoFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetByIdsVideoFieldsDto[] newArray(int i) {
            return new VideoGetByIdsVideoFieldsDto[i];
        }
    }

    static {
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto = new VideoGetByIdsVideoFieldsDto("ADDED", 0, "added");
        ADDED = videoGetByIdsVideoFieldsDto;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto2 = new VideoGetByIdsVideoFieldsDto("EPISODES", 1, "episodes");
        EPISODES = videoGetByIdsVideoFieldsDto2;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto3 = new VideoGetByIdsVideoFieldsDto("FILES", 2, "files");
        FILES = videoGetByIdsVideoFieldsDto3;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto4 = new VideoGetByIdsVideoFieldsDto("FIRST_FRAME", 3, "first_frame");
        FIRST_FRAME = videoGetByIdsVideoFieldsDto4;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto5 = new VideoGetByIdsVideoFieldsDto("HAS_MARKET_ITEMS", 4, "has_market_items");
        HAS_MARKET_ITEMS = videoGetByIdsVideoFieldsDto5;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto6 = new VideoGetByIdsVideoFieldsDto("IMAGE", 5, "image");
        IMAGE = videoGetByIdsVideoFieldsDto6;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto7 = new VideoGetByIdsVideoFieldsDto("IS_FAVORITE", 6, "is_favorite");
        IS_FAVORITE = videoGetByIdsVideoFieldsDto7;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto8 = new VideoGetByIdsVideoFieldsDto("IS_SUBSCRIBED", 7, "is_subscribed");
        IS_SUBSCRIBED = videoGetByIdsVideoFieldsDto8;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto9 = new VideoGetByIdsVideoFieldsDto("SOURCE_FILE_NAME", 8, "source_file_name");
        SOURCE_FILE_NAME = videoGetByIdsVideoFieldsDto9;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto10 = new VideoGetByIdsVideoFieldsDto("SUBTITLES", 9, "subtitles");
        SUBTITLES = videoGetByIdsVideoFieldsDto10;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto11 = new VideoGetByIdsVideoFieldsDto("TIMELINE_THUMBS", 10, "timeline_thumbs");
        TIMELINE_THUMBS = videoGetByIdsVideoFieldsDto11;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto12 = new VideoGetByIdsVideoFieldsDto("TRAILER", 11, "trailer");
        TRAILER = videoGetByIdsVideoFieldsDto12;
        VideoGetByIdsVideoFieldsDto videoGetByIdsVideoFieldsDto13 = new VideoGetByIdsVideoFieldsDto("VOLUME_MULTIPLIER", 12, "volume_multiplier");
        VOLUME_MULTIPLIER = videoGetByIdsVideoFieldsDto13;
        VideoGetByIdsVideoFieldsDto[] videoGetByIdsVideoFieldsDtoArr = {videoGetByIdsVideoFieldsDto, videoGetByIdsVideoFieldsDto2, videoGetByIdsVideoFieldsDto3, videoGetByIdsVideoFieldsDto4, videoGetByIdsVideoFieldsDto5, videoGetByIdsVideoFieldsDto6, videoGetByIdsVideoFieldsDto7, videoGetByIdsVideoFieldsDto8, videoGetByIdsVideoFieldsDto9, videoGetByIdsVideoFieldsDto10, videoGetByIdsVideoFieldsDto11, videoGetByIdsVideoFieldsDto12, videoGetByIdsVideoFieldsDto13};
        $VALUES = videoGetByIdsVideoFieldsDtoArr;
        $ENTRIES = new asp(videoGetByIdsVideoFieldsDtoArr);
        CREATOR = new a();
    }

    private VideoGetByIdsVideoFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetByIdsVideoFieldsDto valueOf(String str) {
        return (VideoGetByIdsVideoFieldsDto) Enum.valueOf(VideoGetByIdsVideoFieldsDto.class, str);
    }

    public static VideoGetByIdsVideoFieldsDto[] values() {
        return (VideoGetByIdsVideoFieldsDto[]) $VALUES.clone();
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
