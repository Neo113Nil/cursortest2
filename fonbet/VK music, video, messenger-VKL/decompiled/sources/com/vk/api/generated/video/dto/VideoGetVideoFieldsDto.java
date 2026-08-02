package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetVideoFieldsDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetVideoFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetVideoFieldsDto[] $VALUES;

    @pmi0("attached_short_videos_counter")
    public static final VideoGetVideoFieldsDto ATTACHED_SHORT_VIDEOS_COUNTER;
    public static final Parcelable.Creator<VideoGetVideoFieldsDto> CREATOR;

    @pmi0("embed")
    public static final VideoGetVideoFieldsDto EMBED;

    @pmi0("is_subscribed")
    public static final VideoGetVideoFieldsDto IS_SUBSCRIBED;

    @pmi0("privacy")
    public static final VideoGetVideoFieldsDto PRIVACY;

    @pmi0("trailer")
    public static final VideoGetVideoFieldsDto TRAILER;
    private final String value;

    /* compiled from: VideoGetVideoFieldsDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetVideoFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetVideoFieldsDto createFromParcel(Parcel parcel) {
            return VideoGetVideoFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetVideoFieldsDto[] newArray(int i) {
            return new VideoGetVideoFieldsDto[i];
        }
    }

    static {
        VideoGetVideoFieldsDto videoGetVideoFieldsDto = new VideoGetVideoFieldsDto("ATTACHED_SHORT_VIDEOS_COUNTER", 0, "attached_short_videos_counter");
        ATTACHED_SHORT_VIDEOS_COUNTER = videoGetVideoFieldsDto;
        VideoGetVideoFieldsDto videoGetVideoFieldsDto2 = new VideoGetVideoFieldsDto("EMBED", 1, "embed");
        EMBED = videoGetVideoFieldsDto2;
        VideoGetVideoFieldsDto videoGetVideoFieldsDto3 = new VideoGetVideoFieldsDto("IS_SUBSCRIBED", 2, "is_subscribed");
        IS_SUBSCRIBED = videoGetVideoFieldsDto3;
        VideoGetVideoFieldsDto videoGetVideoFieldsDto4 = new VideoGetVideoFieldsDto("PRIVACY", 3, "privacy");
        PRIVACY = videoGetVideoFieldsDto4;
        VideoGetVideoFieldsDto videoGetVideoFieldsDto5 = new VideoGetVideoFieldsDto("TRAILER", 4, "trailer");
        TRAILER = videoGetVideoFieldsDto5;
        VideoGetVideoFieldsDto[] videoGetVideoFieldsDtoArr = {videoGetVideoFieldsDto, videoGetVideoFieldsDto2, videoGetVideoFieldsDto3, videoGetVideoFieldsDto4, videoGetVideoFieldsDto5};
        $VALUES = videoGetVideoFieldsDtoArr;
        $ENTRIES = new asp(videoGetVideoFieldsDtoArr);
        CREATOR = new a();
    }

    private VideoGetVideoFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetVideoFieldsDto valueOf(String str) {
        return (VideoGetVideoFieldsDto) Enum.valueOf(VideoGetVideoFieldsDto.class, str);
    }

    public static VideoGetVideoFieldsDto[] values() {
        return (VideoGetVideoFieldsDto[]) $VALUES.clone();
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
