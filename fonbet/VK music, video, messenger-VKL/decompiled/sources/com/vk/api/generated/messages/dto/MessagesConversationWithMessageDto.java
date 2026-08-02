package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationWithMessageDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationWithMessageDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationWithMessageDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_CONVERSATION)
    private final MessagesConversationDto conversation;

    @pmi0("last_message")
    private final MessagesMessageDto lastMessage;

    /* compiled from: MessagesConversationWithMessageDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationWithMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationWithMessageDto createFromParcel(Parcel parcel) {
            return new MessagesConversationWithMessageDto(MessagesConversationDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessagesMessageDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationWithMessageDto[] newArray(int i) {
            return new MessagesConversationWithMessageDto[i];
        }
    }

    public MessagesConversationWithMessageDto(MessagesConversationDto messagesConversationDto, MessagesMessageDto messagesMessageDto) {
        this.conversation = messagesConversationDto;
        this.lastMessage = messagesMessageDto;
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
        if (!(obj instanceof MessagesConversationWithMessageDto)) {
            return false;
        }
        MessagesConversationWithMessageDto messagesConversationWithMessageDto = (MessagesConversationWithMessageDto) obj;
        return epx.f(this.conversation, messagesConversationWithMessageDto.conversation) && epx.f(this.lastMessage, messagesConversationWithMessageDto.lastMessage);
    }

    public final int hashCode() {
        int hashCode = this.conversation.hashCode() * 31;
        MessagesMessageDto messagesMessageDto = this.lastMessage;
        return hashCode + (messagesMessageDto == null ? 0 : messagesMessageDto.hashCode());
    }

    public final String toString() {
        return "MessagesConversationWithMessageDto(conversation=" + this.conversation + ", lastMessage=" + this.lastMessage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.conversation.writeToParcel(parcel, i);
        MessagesMessageDto messagesMessageDto = this.lastMessage;
        if (messagesMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesConversationWithMessageDto(MessagesConversationDto messagesConversationDto, MessagesMessageDto messagesMessageDto, int i, zcl zclVar) {
        this(messagesConversationDto, (i & 2) != 0 ? null : messagesMessageDto);
    }
}
