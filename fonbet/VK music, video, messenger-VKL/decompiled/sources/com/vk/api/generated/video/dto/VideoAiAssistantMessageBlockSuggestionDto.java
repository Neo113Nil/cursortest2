package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoAiAssistantMessageBlockSuggestionDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantMessageBlockSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantMessageBlockSuggestionDto> CREATOR = new a();

    @pmi0("action")
    private final ActionDto action;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final String content;

    @pmi0("prompt")
    private final String prompt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAiAssistantMessageBlockSuggestionDto.kt */
    public static final class ActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;
        public static final Parcelable.Creator<ActionDto> CREATOR;

        @pmi0("open_chat")
        public static final ActionDto OPEN_CHAT;

        @pmi0("send_message")
        public static final ActionDto SEND_MESSAGE;
        private final String value;

        /* compiled from: VideoAiAssistantMessageBlockSuggestionDto.kt */
        public static final class a implements Parcelable.Creator<ActionDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionDto createFromParcel(Parcel parcel) {
                return ActionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionDto[] newArray(int i) {
                return new ActionDto[i];
            }
        }

        static {
            ActionDto actionDto = new ActionDto("SEND_MESSAGE", 0, "send_message");
            SEND_MESSAGE = actionDto;
            ActionDto actionDto2 = new ActionDto("OPEN_CHAT", 1, "open_chat");
            OPEN_CHAT = actionDto2;
            ActionDto[] actionDtoArr = {actionDto, actionDto2};
            $VALUES = actionDtoArr;
            $ENTRIES = new asp(actionDtoArr);
            CREATOR = new a();
        }

        private ActionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionDto valueOf(String str) {
            return (ActionDto) Enum.valueOf(ActionDto.class, str);
        }

        public static ActionDto[] values() {
            return (ActionDto[]) $VALUES.clone();
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

    /* compiled from: VideoAiAssistantMessageBlockSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantMessageBlockSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockSuggestionDto createFromParcel(Parcel parcel) {
            return new VideoAiAssistantMessageBlockSuggestionDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ActionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockSuggestionDto[] newArray(int i) {
            return new VideoAiAssistantMessageBlockSuggestionDto[i];
        }
    }

    public VideoAiAssistantMessageBlockSuggestionDto(String str, String str2, ActionDto actionDto) {
        this.content = str;
        this.prompt = str2;
        this.action = actionDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantMessageBlockSuggestionDto)) {
            return false;
        }
        VideoAiAssistantMessageBlockSuggestionDto videoAiAssistantMessageBlockSuggestionDto = (VideoAiAssistantMessageBlockSuggestionDto) obj;
        return epx.f(this.content, videoAiAssistantMessageBlockSuggestionDto.content) && epx.f(this.prompt, videoAiAssistantMessageBlockSuggestionDto.prompt) && this.action == videoAiAssistantMessageBlockSuggestionDto.action;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.content.hashCode() * 31, 31, this.prompt);
        ActionDto actionDto = this.action;
        return a2 + (actionDto == null ? 0 : actionDto.hashCode());
    }

    public final String toString() {
        return "VideoAiAssistantMessageBlockSuggestionDto(content=" + this.content + ", prompt=" + this.prompt + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.content);
        parcel.writeString(this.prompt);
        ActionDto actionDto = this.action;
        if (actionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoAiAssistantMessageBlockSuggestionDto(String str, String str2, ActionDto actionDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : actionDto);
    }
}
