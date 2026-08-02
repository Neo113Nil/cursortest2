package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoReactAssistantMessageReactionStateDto.kt */
/* loaded from: classes15.dex */
public final class VideoReactAssistantMessageReactionStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoReactAssistantMessageReactionStateDto[] $VALUES;
    public static final Parcelable.Creator<VideoReactAssistantMessageReactionStateDto> CREATOR;

    @pmi0("dislike")
    public static final VideoReactAssistantMessageReactionStateDto DISLIKE;

    @pmi0("like")
    public static final VideoReactAssistantMessageReactionStateDto LIKE;

    @pmi0("unspecified")
    public static final VideoReactAssistantMessageReactionStateDto UNSPECIFIED;
    private final String value;

    /* compiled from: VideoReactAssistantMessageReactionStateDto.kt */
    public static final class a implements Parcelable.Creator<VideoReactAssistantMessageReactionStateDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoReactAssistantMessageReactionStateDto createFromParcel(Parcel parcel) {
            return VideoReactAssistantMessageReactionStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoReactAssistantMessageReactionStateDto[] newArray(int i) {
            return new VideoReactAssistantMessageReactionStateDto[i];
        }
    }

    static {
        VideoReactAssistantMessageReactionStateDto videoReactAssistantMessageReactionStateDto = new VideoReactAssistantMessageReactionStateDto("UNSPECIFIED", 0, "unspecified");
        UNSPECIFIED = videoReactAssistantMessageReactionStateDto;
        VideoReactAssistantMessageReactionStateDto videoReactAssistantMessageReactionStateDto2 = new VideoReactAssistantMessageReactionStateDto("LIKE", 1, "like");
        LIKE = videoReactAssistantMessageReactionStateDto2;
        VideoReactAssistantMessageReactionStateDto videoReactAssistantMessageReactionStateDto3 = new VideoReactAssistantMessageReactionStateDto("DISLIKE", 2, "dislike");
        DISLIKE = videoReactAssistantMessageReactionStateDto3;
        VideoReactAssistantMessageReactionStateDto[] videoReactAssistantMessageReactionStateDtoArr = {videoReactAssistantMessageReactionStateDto, videoReactAssistantMessageReactionStateDto2, videoReactAssistantMessageReactionStateDto3};
        $VALUES = videoReactAssistantMessageReactionStateDtoArr;
        $ENTRIES = new asp(videoReactAssistantMessageReactionStateDtoArr);
        CREATOR = new a();
    }

    private VideoReactAssistantMessageReactionStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoReactAssistantMessageReactionStateDto valueOf(String str) {
        return (VideoReactAssistantMessageReactionStateDto) Enum.valueOf(VideoReactAssistantMessageReactionStateDto.class, str);
    }

    public static VideoReactAssistantMessageReactionStateDto[] values() {
        return (VideoReactAssistantMessageReactionStateDto[]) $VALUES.clone();
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
