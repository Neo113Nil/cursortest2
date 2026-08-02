package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesConversationCardButtonTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationCardButtonTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesConversationCardButtonTypeDto[] $VALUES;

    @pmi0("accept_message_request")
    public static final MessagesConversationCardButtonTypeDto ACCEPT_MESSAGE_REQUEST;
    public static final Parcelable.Creator<MessagesConversationCardButtonTypeDto> CREATOR;

    @pmi0("custom_action")
    public static final MessagesConversationCardButtonTypeDto CUSTOM_ACTION;

    @pmi0("open_miniapp")
    public static final MessagesConversationCardButtonTypeDto OPEN_MINIAPP;

    @pmi0("reject_message_request")
    public static final MessagesConversationCardButtonTypeDto REJECT_MESSAGE_REQUEST;

    @pmi0("send_message_request")
    public static final MessagesConversationCardButtonTypeDto SEND_MESSAGE_REQUEST;
    private final String value;

    /* compiled from: MessagesConversationCardButtonTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationCardButtonTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCardButtonTypeDto createFromParcel(Parcel parcel) {
            return MessagesConversationCardButtonTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCardButtonTypeDto[] newArray(int i) {
            return new MessagesConversationCardButtonTypeDto[i];
        }
    }

    static {
        MessagesConversationCardButtonTypeDto messagesConversationCardButtonTypeDto = new MessagesConversationCardButtonTypeDto("SEND_MESSAGE_REQUEST", 0, "send_message_request");
        SEND_MESSAGE_REQUEST = messagesConversationCardButtonTypeDto;
        MessagesConversationCardButtonTypeDto messagesConversationCardButtonTypeDto2 = new MessagesConversationCardButtonTypeDto("ACCEPT_MESSAGE_REQUEST", 1, "accept_message_request");
        ACCEPT_MESSAGE_REQUEST = messagesConversationCardButtonTypeDto2;
        MessagesConversationCardButtonTypeDto messagesConversationCardButtonTypeDto3 = new MessagesConversationCardButtonTypeDto("REJECT_MESSAGE_REQUEST", 2, "reject_message_request");
        REJECT_MESSAGE_REQUEST = messagesConversationCardButtonTypeDto3;
        MessagesConversationCardButtonTypeDto messagesConversationCardButtonTypeDto4 = new MessagesConversationCardButtonTypeDto("OPEN_MINIAPP", 3, "open_miniapp");
        OPEN_MINIAPP = messagesConversationCardButtonTypeDto4;
        MessagesConversationCardButtonTypeDto messagesConversationCardButtonTypeDto5 = new MessagesConversationCardButtonTypeDto("CUSTOM_ACTION", 4, "custom_action");
        CUSTOM_ACTION = messagesConversationCardButtonTypeDto5;
        MessagesConversationCardButtonTypeDto[] messagesConversationCardButtonTypeDtoArr = {messagesConversationCardButtonTypeDto, messagesConversationCardButtonTypeDto2, messagesConversationCardButtonTypeDto3, messagesConversationCardButtonTypeDto4, messagesConversationCardButtonTypeDto5};
        $VALUES = messagesConversationCardButtonTypeDtoArr;
        $ENTRIES = new asp(messagesConversationCardButtonTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesConversationCardButtonTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesConversationCardButtonTypeDto valueOf(String str) {
        return (MessagesConversationCardButtonTypeDto) Enum.valueOf(MessagesConversationCardButtonTypeDto.class, str);
    }

    public static MessagesConversationCardButtonTypeDto[] values() {
        return (MessagesConversationCardButtonTypeDto[]) $VALUES.clone();
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
