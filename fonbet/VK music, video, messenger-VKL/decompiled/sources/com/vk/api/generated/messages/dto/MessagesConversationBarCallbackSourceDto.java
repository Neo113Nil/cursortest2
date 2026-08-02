package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesConversationBarCallbackSourceDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarCallbackSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesConversationBarCallbackSourceDto[] $VALUES;

    @pmi0("antispam_modal")
    public static final MessagesConversationBarCallbackSourceDto ANTISPAM_MODAL;
    public static final Parcelable.Creator<MessagesConversationBarCallbackSourceDto> CREATOR;

    @pmi0("old_spam_modal")
    public static final MessagesConversationBarCallbackSourceDto OLD_SPAM_MODAL;
    private final String value;

    /* compiled from: MessagesConversationBarCallbackSourceDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarCallbackSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarCallbackSourceDto createFromParcel(Parcel parcel) {
            return MessagesConversationBarCallbackSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarCallbackSourceDto[] newArray(int i) {
            return new MessagesConversationBarCallbackSourceDto[i];
        }
    }

    static {
        MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto = new MessagesConversationBarCallbackSourceDto("ANTISPAM_MODAL", 0, "antispam_modal");
        ANTISPAM_MODAL = messagesConversationBarCallbackSourceDto;
        MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto2 = new MessagesConversationBarCallbackSourceDto("OLD_SPAM_MODAL", 1, "old_spam_modal");
        OLD_SPAM_MODAL = messagesConversationBarCallbackSourceDto2;
        MessagesConversationBarCallbackSourceDto[] messagesConversationBarCallbackSourceDtoArr = {messagesConversationBarCallbackSourceDto, messagesConversationBarCallbackSourceDto2};
        $VALUES = messagesConversationBarCallbackSourceDtoArr;
        $ENTRIES = new asp(messagesConversationBarCallbackSourceDtoArr);
        CREATOR = new a();
    }

    private MessagesConversationBarCallbackSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<MessagesConversationBarCallbackSourceDto> i() {
        return $ENTRIES;
    }

    public static MessagesConversationBarCallbackSourceDto valueOf(String str) {
        return (MessagesConversationBarCallbackSourceDto) Enum.valueOf(MessagesConversationBarCallbackSourceDto.class, str);
    }

    public static MessagesConversationBarCallbackSourceDto[] values() {
        return (MessagesConversationBarCallbackSourceDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
