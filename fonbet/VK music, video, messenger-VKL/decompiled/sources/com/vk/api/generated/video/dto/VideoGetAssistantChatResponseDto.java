package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoGetAssistantChatResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAssistantChatResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAssistantChatResponseDto> CREATOR = new a();

    @pmi0("chat")
    private final VideoAiAssistantChatDto chat;

    /* compiled from: VideoGetAssistantChatResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAssistantChatResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantChatResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetAssistantChatResponseDto(VideoAiAssistantChatDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantChatResponseDto[] newArray(int i) {
            return new VideoGetAssistantChatResponseDto[i];
        }
    }

    public VideoGetAssistantChatResponseDto(VideoAiAssistantChatDto videoAiAssistantChatDto) {
        this.chat = videoAiAssistantChatDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetAssistantChatResponseDto) && epx.f(this.chat, ((VideoGetAssistantChatResponseDto) obj).chat);
    }

    public final int hashCode() {
        return this.chat.hashCode();
    }

    public final String toString() {
        return "VideoGetAssistantChatResponseDto(chat=" + this.chat + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.chat.writeToParcel(parcel, i);
    }
}
