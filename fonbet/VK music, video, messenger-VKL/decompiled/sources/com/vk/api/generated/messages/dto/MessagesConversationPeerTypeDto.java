package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesConversationPeerTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationPeerTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesConversationPeerTypeDto[] $VALUES;

    @pmi0("chat")
    public static final MessagesConversationPeerTypeDto CHAT;

    @pmi0("contact")
    public static final MessagesConversationPeerTypeDto CONTACT;
    public static final Parcelable.Creator<MessagesConversationPeerTypeDto> CREATOR;

    @pmi0("email")
    public static final MessagesConversationPeerTypeDto EMAIL;

    @pmi0("group")
    public static final MessagesConversationPeerTypeDto GROUP;

    @pmi0("user")
    public static final MessagesConversationPeerTypeDto USER;
    private final String value;

    /* compiled from: MessagesConversationPeerTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationPeerTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationPeerTypeDto createFromParcel(Parcel parcel) {
            return MessagesConversationPeerTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationPeerTypeDto[] newArray(int i) {
            return new MessagesConversationPeerTypeDto[i];
        }
    }

    static {
        MessagesConversationPeerTypeDto messagesConversationPeerTypeDto = new MessagesConversationPeerTypeDto("CHAT", 0, "chat");
        CHAT = messagesConversationPeerTypeDto;
        MessagesConversationPeerTypeDto messagesConversationPeerTypeDto2 = new MessagesConversationPeerTypeDto(CommonConstant.RETKEY.EMAIL, 1, "email");
        EMAIL = messagesConversationPeerTypeDto2;
        MessagesConversationPeerTypeDto messagesConversationPeerTypeDto3 = new MessagesConversationPeerTypeDto("USER", 2, "user");
        USER = messagesConversationPeerTypeDto3;
        MessagesConversationPeerTypeDto messagesConversationPeerTypeDto4 = new MessagesConversationPeerTypeDto("GROUP", 3, "group");
        GROUP = messagesConversationPeerTypeDto4;
        MessagesConversationPeerTypeDto messagesConversationPeerTypeDto5 = new MessagesConversationPeerTypeDto("CONTACT", 4, "contact");
        CONTACT = messagesConversationPeerTypeDto5;
        MessagesConversationPeerTypeDto[] messagesConversationPeerTypeDtoArr = {messagesConversationPeerTypeDto, messagesConversationPeerTypeDto2, messagesConversationPeerTypeDto3, messagesConversationPeerTypeDto4, messagesConversationPeerTypeDto5};
        $VALUES = messagesConversationPeerTypeDtoArr;
        $ENTRIES = new asp(messagesConversationPeerTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesConversationPeerTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesConversationPeerTypeDto valueOf(String str) {
        return (MessagesConversationPeerTypeDto) Enum.valueOf(MessagesConversationPeerTypeDto.class, str);
    }

    public static MessagesConversationPeerTypeDto[] values() {
        return (MessagesConversationPeerTypeDto[]) $VALUES.clone();
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
