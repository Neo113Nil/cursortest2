package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoGetAssistantSearchPreviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAssistantSearchPreviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAssistantSearchPreviewResponseDto> CREATOR = new a();

    @pmi0("message")
    private final VideoAiAssistantMessageDto message;

    /* compiled from: VideoGetAssistantSearchPreviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAssistantSearchPreviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantSearchPreviewResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetAssistantSearchPreviewResponseDto(VideoAiAssistantMessageDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAssistantSearchPreviewResponseDto[] newArray(int i) {
            return new VideoGetAssistantSearchPreviewResponseDto[i];
        }
    }

    public VideoGetAssistantSearchPreviewResponseDto(VideoAiAssistantMessageDto videoAiAssistantMessageDto) {
        this.message = videoAiAssistantMessageDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetAssistantSearchPreviewResponseDto) && epx.f(this.message, ((VideoGetAssistantSearchPreviewResponseDto) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return "VideoGetAssistantSearchPreviewResponseDto(message=" + this.message + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.message.writeToParcel(parcel, i);
    }
}
