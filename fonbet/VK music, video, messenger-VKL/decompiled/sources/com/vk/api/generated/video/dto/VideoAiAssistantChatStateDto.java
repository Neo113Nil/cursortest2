package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAiAssistantChatStateDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantChatStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAiAssistantChatStateDto[] $VALUES;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    public static final VideoAiAssistantChatStateDto ACTIVE;
    public static final Parcelable.Creator<VideoAiAssistantChatStateDto> CREATOR;

    @pmi0("finished")
    public static final VideoAiAssistantChatStateDto FINISHED;
    private final String value;

    /* compiled from: VideoAiAssistantChatStateDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantChatStateDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantChatStateDto createFromParcel(Parcel parcel) {
            return VideoAiAssistantChatStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantChatStateDto[] newArray(int i) {
            return new VideoAiAssistantChatStateDto[i];
        }
    }

    static {
        VideoAiAssistantChatStateDto videoAiAssistantChatStateDto = new VideoAiAssistantChatStateDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
        ACTIVE = videoAiAssistantChatStateDto;
        VideoAiAssistantChatStateDto videoAiAssistantChatStateDto2 = new VideoAiAssistantChatStateDto("FINISHED", 1, "finished");
        FINISHED = videoAiAssistantChatStateDto2;
        VideoAiAssistantChatStateDto[] videoAiAssistantChatStateDtoArr = {videoAiAssistantChatStateDto, videoAiAssistantChatStateDto2};
        $VALUES = videoAiAssistantChatStateDtoArr;
        $ENTRIES = new asp(videoAiAssistantChatStateDtoArr);
        CREATOR = new a();
    }

    private VideoAiAssistantChatStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoAiAssistantChatStateDto valueOf(String str) {
        return (VideoAiAssistantChatStateDto) Enum.valueOf(VideoAiAssistantChatStateDto.class, str);
    }

    public static VideoAiAssistantChatStateDto[] values() {
        return (VideoAiAssistantChatStateDto[]) $VALUES.clone();
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
