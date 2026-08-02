package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoReactAssistantChatReactionStateDto.kt */
/* loaded from: classes15.dex */
public final class VideoReactAssistantChatReactionStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoReactAssistantChatReactionStateDto[] $VALUES;
    public static final Parcelable.Creator<VideoReactAssistantChatReactionStateDto> CREATOR;

    @pmi0("dislike")
    public static final VideoReactAssistantChatReactionStateDto DISLIKE;

    @pmi0("like")
    public static final VideoReactAssistantChatReactionStateDto LIKE;

    @pmi0("unspecified")
    public static final VideoReactAssistantChatReactionStateDto UNSPECIFIED;
    private final String value;

    /* compiled from: VideoReactAssistantChatReactionStateDto.kt */
    public static final class a implements Parcelable.Creator<VideoReactAssistantChatReactionStateDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoReactAssistantChatReactionStateDto createFromParcel(Parcel parcel) {
            return VideoReactAssistantChatReactionStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoReactAssistantChatReactionStateDto[] newArray(int i) {
            return new VideoReactAssistantChatReactionStateDto[i];
        }
    }

    static {
        VideoReactAssistantChatReactionStateDto videoReactAssistantChatReactionStateDto = new VideoReactAssistantChatReactionStateDto("UNSPECIFIED", 0, "unspecified");
        UNSPECIFIED = videoReactAssistantChatReactionStateDto;
        VideoReactAssistantChatReactionStateDto videoReactAssistantChatReactionStateDto2 = new VideoReactAssistantChatReactionStateDto("LIKE", 1, "like");
        LIKE = videoReactAssistantChatReactionStateDto2;
        VideoReactAssistantChatReactionStateDto videoReactAssistantChatReactionStateDto3 = new VideoReactAssistantChatReactionStateDto("DISLIKE", 2, "dislike");
        DISLIKE = videoReactAssistantChatReactionStateDto3;
        VideoReactAssistantChatReactionStateDto[] videoReactAssistantChatReactionStateDtoArr = {videoReactAssistantChatReactionStateDto, videoReactAssistantChatReactionStateDto2, videoReactAssistantChatReactionStateDto3};
        $VALUES = videoReactAssistantChatReactionStateDtoArr;
        $ENTRIES = new asp(videoReactAssistantChatReactionStateDtoArr);
        CREATOR = new a();
    }

    private VideoReactAssistantChatReactionStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoReactAssistantChatReactionStateDto valueOf(String str) {
        return (VideoReactAssistantChatReactionStateDto) Enum.valueOf(VideoReactAssistantChatReactionStateDto.class, str);
    }

    public static VideoReactAssistantChatReactionStateDto[] values() {
        return (VideoReactAssistantChatReactionStateDto[]) $VALUES.clone();
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
