package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesDeleteConversationSourceDto.kt */
/* loaded from: classes15.dex */
public final class MessagesDeleteConversationSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesDeleteConversationSourceDto[] $VALUES;

    @pmi0("antispam_modal")
    public static final MessagesDeleteConversationSourceDto ANTISPAM_MODAL;
    public static final Parcelable.Creator<MessagesDeleteConversationSourceDto> CREATOR;

    @pmi0("im_chats")
    public static final MessagesDeleteConversationSourceDto IM_CHATS;

    @pmi0("old_spam_modal")
    public static final MessagesDeleteConversationSourceDto OLD_SPAM_MODAL;
    private final String value;

    /* compiled from: MessagesDeleteConversationSourceDto.kt */
    public static final class a implements Parcelable.Creator<MessagesDeleteConversationSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteConversationSourceDto createFromParcel(Parcel parcel) {
            return MessagesDeleteConversationSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteConversationSourceDto[] newArray(int i) {
            return new MessagesDeleteConversationSourceDto[i];
        }
    }

    static {
        MessagesDeleteConversationSourceDto messagesDeleteConversationSourceDto = new MessagesDeleteConversationSourceDto("ANTISPAM_MODAL", 0, "antispam_modal");
        ANTISPAM_MODAL = messagesDeleteConversationSourceDto;
        MessagesDeleteConversationSourceDto messagesDeleteConversationSourceDto2 = new MessagesDeleteConversationSourceDto("IM_CHATS", 1, "im_chats");
        IM_CHATS = messagesDeleteConversationSourceDto2;
        MessagesDeleteConversationSourceDto messagesDeleteConversationSourceDto3 = new MessagesDeleteConversationSourceDto("OLD_SPAM_MODAL", 2, "old_spam_modal");
        OLD_SPAM_MODAL = messagesDeleteConversationSourceDto3;
        MessagesDeleteConversationSourceDto[] messagesDeleteConversationSourceDtoArr = {messagesDeleteConversationSourceDto, messagesDeleteConversationSourceDto2, messagesDeleteConversationSourceDto3};
        $VALUES = messagesDeleteConversationSourceDtoArr;
        $ENTRIES = new asp(messagesDeleteConversationSourceDtoArr);
        CREATOR = new a();
    }

    private MessagesDeleteConversationSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesDeleteConversationSourceDto valueOf(String str) {
        return (MessagesDeleteConversationSourceDto) Enum.valueOf(MessagesDeleteConversationSourceDto.class, str);
    }

    public static MessagesDeleteConversationSourceDto[] values() {
        return (MessagesDeleteConversationSourceDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
