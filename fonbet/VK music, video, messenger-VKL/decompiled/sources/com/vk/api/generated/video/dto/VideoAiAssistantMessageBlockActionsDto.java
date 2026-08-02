package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoAiAssistantMessageBlockActionsDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantMessageBlockActionsDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantMessageBlockActionsDto> CREATOR = new a();

    @pmi0("reaction")
    private final VideoAiAssistantReactionDto reaction;

    /* compiled from: VideoAiAssistantMessageBlockActionsDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantMessageBlockActionsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockActionsDto createFromParcel(Parcel parcel) {
            return new VideoAiAssistantMessageBlockActionsDto(parcel.readInt() == 0 ? null : VideoAiAssistantReactionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockActionsDto[] newArray(int i) {
            return new VideoAiAssistantMessageBlockActionsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoAiAssistantMessageBlockActionsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAiAssistantMessageBlockActionsDto) && epx.f(this.reaction, ((VideoAiAssistantMessageBlockActionsDto) obj).reaction);
    }

    public final int hashCode() {
        VideoAiAssistantReactionDto videoAiAssistantReactionDto = this.reaction;
        if (videoAiAssistantReactionDto == null) {
            return 0;
        }
        return videoAiAssistantReactionDto.hashCode();
    }

    public final String toString() {
        return "VideoAiAssistantMessageBlockActionsDto(reaction=" + this.reaction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoAiAssistantReactionDto videoAiAssistantReactionDto = this.reaction;
        if (videoAiAssistantReactionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantReactionDto.writeToParcel(parcel, i);
        }
    }

    public VideoAiAssistantMessageBlockActionsDto(VideoAiAssistantReactionDto videoAiAssistantReactionDto) {
        this.reaction = videoAiAssistantReactionDto;
    }

    public /* synthetic */ VideoAiAssistantMessageBlockActionsDto(VideoAiAssistantReactionDto videoAiAssistantReactionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoAiAssistantReactionDto);
    }
}
