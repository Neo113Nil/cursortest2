package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesChangeConversationMemberRestrictionsActionDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChangeConversationMemberRestrictionsActionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesChangeConversationMemberRestrictionsActionDto[] $VALUES;
    public static final Parcelable.Creator<MessagesChangeConversationMemberRestrictionsActionDto> CREATOR;

    @pmi0("ro")
    public static final MessagesChangeConversationMemberRestrictionsActionDto RO;

    @pmi0("rw")
    public static final MessagesChangeConversationMemberRestrictionsActionDto RW;
    private final String value;

    /* compiled from: MessagesChangeConversationMemberRestrictionsActionDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChangeConversationMemberRestrictionsActionDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChangeConversationMemberRestrictionsActionDto createFromParcel(Parcel parcel) {
            return MessagesChangeConversationMemberRestrictionsActionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChangeConversationMemberRestrictionsActionDto[] newArray(int i) {
            return new MessagesChangeConversationMemberRestrictionsActionDto[i];
        }
    }

    static {
        MessagesChangeConversationMemberRestrictionsActionDto messagesChangeConversationMemberRestrictionsActionDto = new MessagesChangeConversationMemberRestrictionsActionDto("RO", 0, "ro");
        RO = messagesChangeConversationMemberRestrictionsActionDto;
        MessagesChangeConversationMemberRestrictionsActionDto messagesChangeConversationMemberRestrictionsActionDto2 = new MessagesChangeConversationMemberRestrictionsActionDto("RW", 1, "rw");
        RW = messagesChangeConversationMemberRestrictionsActionDto2;
        MessagesChangeConversationMemberRestrictionsActionDto[] messagesChangeConversationMemberRestrictionsActionDtoArr = {messagesChangeConversationMemberRestrictionsActionDto, messagesChangeConversationMemberRestrictionsActionDto2};
        $VALUES = messagesChangeConversationMemberRestrictionsActionDtoArr;
        $ENTRIES = new asp(messagesChangeConversationMemberRestrictionsActionDtoArr);
        CREATOR = new a();
    }

    private MessagesChangeConversationMemberRestrictionsActionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesChangeConversationMemberRestrictionsActionDto valueOf(String str) {
        return (MessagesChangeConversationMemberRestrictionsActionDto) Enum.valueOf(MessagesChangeConversationMemberRestrictionsActionDto.class, str);
    }

    public static MessagesChangeConversationMemberRestrictionsActionDto[] values() {
        return (MessagesChangeConversationMemberRestrictionsActionDto[]) $VALUES.clone();
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
