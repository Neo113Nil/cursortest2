package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesDeleteChatPhotoResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesDeleteChatPhotoResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesDeleteChatPhotoResponseDto> CREATOR = new a();

    @pmi0("chat")
    private final MessagesChatDto chat;

    @pmi0("message_id")
    private final Integer messageId;

    /* compiled from: MessagesDeleteChatPhotoResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesDeleteChatPhotoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteChatPhotoResponseDto createFromParcel(Parcel parcel) {
            return new MessagesDeleteChatPhotoResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? MessagesChatDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteChatPhotoResponseDto[] newArray(int i) {
            return new MessagesDeleteChatPhotoResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesDeleteChatPhotoResponseDto() {
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
        if (!(obj instanceof MessagesDeleteChatPhotoResponseDto)) {
            return false;
        }
        MessagesDeleteChatPhotoResponseDto messagesDeleteChatPhotoResponseDto = (MessagesDeleteChatPhotoResponseDto) obj;
        return epx.f(this.messageId, messagesDeleteChatPhotoResponseDto.messageId) && epx.f(this.chat, messagesDeleteChatPhotoResponseDto.chat);
    }

    public final int hashCode() {
        Integer num = this.messageId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        MessagesChatDto messagesChatDto = this.chat;
        return hashCode + (messagesChatDto != null ? messagesChatDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesDeleteChatPhotoResponseDto(messageId=" + this.messageId + ", chat=" + this.chat + ')';
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

    public MessagesDeleteChatPhotoResponseDto(Integer num, MessagesChatDto messagesChatDto) {
        this.messageId = num;
        this.chat = messagesChatDto;
    }

    public /* synthetic */ MessagesDeleteChatPhotoResponseDto(Integer num, MessagesChatDto messagesChatDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : messagesChatDto);
    }
}
