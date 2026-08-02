package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoSendAssistantMessageResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoSendAssistantMessageResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoSendAssistantMessageResponseDto> CREATOR = new a();

    @pmi0("sse_url")
    private final String sseUrl;

    /* compiled from: VideoSendAssistantMessageResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoSendAssistantMessageResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSendAssistantMessageResponseDto createFromParcel(Parcel parcel) {
            return new VideoSendAssistantMessageResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSendAssistantMessageResponseDto[] newArray(int i) {
            return new VideoSendAssistantMessageResponseDto[i];
        }
    }

    public VideoSendAssistantMessageResponseDto(String str) {
        this.sseUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoSendAssistantMessageResponseDto) && epx.f(this.sseUrl, ((VideoSendAssistantMessageResponseDto) obj).sseUrl);
    }

    public final int hashCode() {
        return this.sseUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoSendAssistantMessageResponseDto(sseUrl="), this.sseUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sseUrl);
    }
}
