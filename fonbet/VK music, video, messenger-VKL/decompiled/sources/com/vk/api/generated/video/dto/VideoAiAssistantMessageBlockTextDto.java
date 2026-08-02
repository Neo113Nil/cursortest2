package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoAiAssistantMessageBlockTextDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantMessageBlockTextDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantMessageBlockTextDto> CREATOR = new a();

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final String content;

    /* compiled from: VideoAiAssistantMessageBlockTextDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantMessageBlockTextDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockTextDto createFromParcel(Parcel parcel) {
            return new VideoAiAssistantMessageBlockTextDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockTextDto[] newArray(int i) {
            return new VideoAiAssistantMessageBlockTextDto[i];
        }
    }

    public VideoAiAssistantMessageBlockTextDto(String str) {
        this.content = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAiAssistantMessageBlockTextDto) && epx.f(this.content, ((VideoAiAssistantMessageBlockTextDto) obj).content);
    }

    public final int hashCode() {
        return this.content.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoAiAssistantMessageBlockTextDto(content="), this.content, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.content);
    }
}
