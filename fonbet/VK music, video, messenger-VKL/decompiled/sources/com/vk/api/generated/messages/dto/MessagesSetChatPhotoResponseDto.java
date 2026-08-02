package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesSetChatPhotoResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSetChatPhotoResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesSetChatPhotoResponseDto> CREATOR = new a();

    @pmi0("chat")
    private final MessagesChatDto chat;

    @pmi0("message_id")
    private final Integer messageId;

    /* compiled from: MessagesSetChatPhotoResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSetChatPhotoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSetChatPhotoResponseDto createFromParcel(Parcel parcel) {
            return new MessagesSetChatPhotoResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? MessagesChatDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSetChatPhotoResponseDto[] newArray(int i) {
            return new MessagesSetChatPhotoResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesSetChatPhotoResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSetChatPhotoResponseDto)) {
            return false;
        }
        MessagesSetChatPhotoResponseDto messagesSetChatPhotoResponseDto = (MessagesSetChatPhotoResponseDto) obj;
        return epx.f(this.messageId, messagesSetChatPhotoResponseDto.messageId) && epx.f(this.chat, messagesSetChatPhotoResponseDto.chat);
    }

    public final int hashCode() {
        Integer num = this.messageId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        MessagesChatDto messagesChatDto = this.chat;
        return hashCode + (messagesChatDto != null ? messagesChatDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesSetChatPhotoResponseDto(messageId=" + this.messageId + ", chat=" + this.chat + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.messageId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        MessagesChatDto messagesChatDto = this.chat;
        if (messagesChatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatDto.writeToParcel(parcel, i);
        }
    }

    public MessagesSetChatPhotoResponseDto(Integer num, MessagesChatDto messagesChatDto) {
        this.messageId = num;
        this.chat = messagesChatDto;
    }

    public /* synthetic */ MessagesSetChatPhotoResponseDto(Integer num, MessagesChatDto messagesChatDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : messagesChatDto);
    }
}
