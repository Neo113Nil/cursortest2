package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.messages.dto.MessagesConversationDto;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CallsGetConversationByCallResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsGetConversationByCallResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsGetConversationByCallResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_CONVERSATION)
    private final MessagesConversationDto conversation;

    /* compiled from: CallsGetConversationByCallResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsGetConversationByCallResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGetConversationByCallResponseDto createFromParcel(Parcel parcel) {
            return new CallsGetConversationByCallResponseDto(parcel.readInt() == 0 ? null : MessagesConversationDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGetConversationByCallResponseDto[] newArray(int i) {
            return new CallsGetConversationByCallResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallsGetConversationByCallResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final MessagesConversationDto d() {
        return this.conversation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallsGetConversationByCallResponseDto) && epx.f(this.conversation, ((CallsGetConversationByCallResponseDto) obj).conversation);
    }

    public final int hashCode() {
        MessagesConversationDto messagesConversationDto = this.conversation;
        if (messagesConversationDto == null) {
            return 0;
        }
        return messagesConversationDto.hashCode();
    }

    public final String toString() {
        return "CallsGetConversationByCallResponseDto(conversation=" + this.conversation + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesConversationDto messagesConversationDto = this.conversation;
        if (messagesConversationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationDto.writeToParcel(parcel, i);
        }
    }

    public CallsGetConversationByCallResponseDto(MessagesConversationDto messagesConversationDto) {
        this.conversation = messagesConversationDto;
    }

    public /* synthetic */ CallsGetConversationByCallResponseDto(MessagesConversationDto messagesConversationDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesConversationDto);
    }
}
