package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesDeleteDialogSourceDto.kt */
/* loaded from: classes15.dex */
public final class MessagesDeleteDialogSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesDeleteDialogSourceDto[] $VALUES;

    @pmi0("antispam_modal")
    public static final MessagesDeleteDialogSourceDto ANTISPAM_MODAL;
    public static final Parcelable.Creator<MessagesDeleteDialogSourceDto> CREATOR;

    @pmi0("im_chats")
    public static final MessagesDeleteDialogSourceDto IM_CHATS;

    @pmi0("old_spam_modal")
    public static final MessagesDeleteDialogSourceDto OLD_SPAM_MODAL;
    private final String value;

    /* compiled from: MessagesDeleteDialogSourceDto.kt */
    public static final class a implements Parcelable.Creator<MessagesDeleteDialogSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteDialogSourceDto createFromParcel(Parcel parcel) {
            return MessagesDeleteDialogSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteDialogSourceDto[] newArray(int i) {
            return new MessagesDeleteDialogSourceDto[i];
        }
    }

    static {
        MessagesDeleteDialogSourceDto messagesDeleteDialogSourceDto = new MessagesDeleteDialogSourceDto("ANTISPAM_MODAL", 0, "antispam_modal");
        ANTISPAM_MODAL = messagesDeleteDialogSourceDto;
        MessagesDeleteDialogSourceDto messagesDeleteDialogSourceDto2 = new MessagesDeleteDialogSourceDto("IM_CHATS", 1, "im_chats");
        IM_CHATS = messagesDeleteDialogSourceDto2;
        MessagesDeleteDialogSourceDto messagesDeleteDialogSourceDto3 = new MessagesDeleteDialogSourceDto("OLD_SPAM_MODAL", 2, "old_spam_modal");
        OLD_SPAM_MODAL = messagesDeleteDialogSourceDto3;
        MessagesDeleteDialogSourceDto[] messagesDeleteDialogSourceDtoArr = {messagesDeleteDialogSourceDto, messagesDeleteDialogSourceDto2, messagesDeleteDialogSourceDto3};
        $VALUES = messagesDeleteDialogSourceDtoArr;
        $ENTRIES = new asp(messagesDeleteDialogSourceDtoArr);
        CREATOR = new a();
    }

    private MessagesDeleteDialogSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesDeleteDialogSourceDto valueOf(String str) {
        return (MessagesDeleteDialogSourceDto) Enum.valueOf(MessagesDeleteDialogSourceDto.class, str);
    }

    public static MessagesDeleteDialogSourceDto[] values() {
        return (MessagesDeleteDialogSourceDto[]) $VALUES.clone();
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
