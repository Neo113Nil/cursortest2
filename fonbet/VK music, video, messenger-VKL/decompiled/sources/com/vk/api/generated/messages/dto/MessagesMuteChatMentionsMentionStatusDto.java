package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesMuteChatMentionsMentionStatusDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMuteChatMentionsMentionStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesMuteChatMentionsMentionStatusDto[] $VALUES;

    @pmi0("all")
    public static final MessagesMuteChatMentionsMentionStatusDto ALL;

    @pmi0("allOnline")
    public static final MessagesMuteChatMentionsMentionStatusDto ALLONLINE;
    public static final Parcelable.Creator<MessagesMuteChatMentionsMentionStatusDto> CREATOR;

    @pmi0("none")
    public static final MessagesMuteChatMentionsMentionStatusDto NONE;
    private final String value;

    /* compiled from: MessagesMuteChatMentionsMentionStatusDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMuteChatMentionsMentionStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMuteChatMentionsMentionStatusDto createFromParcel(Parcel parcel) {
            return MessagesMuteChatMentionsMentionStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMuteChatMentionsMentionStatusDto[] newArray(int i) {
            return new MessagesMuteChatMentionsMentionStatusDto[i];
        }
    }

    static {
        MessagesMuteChatMentionsMentionStatusDto messagesMuteChatMentionsMentionStatusDto = new MessagesMuteChatMentionsMentionStatusDto("ALL", 0, "all");
        ALL = messagesMuteChatMentionsMentionStatusDto;
        MessagesMuteChatMentionsMentionStatusDto messagesMuteChatMentionsMentionStatusDto2 = new MessagesMuteChatMentionsMentionStatusDto("ALLONLINE", 1, "allOnline");
        ALLONLINE = messagesMuteChatMentionsMentionStatusDto2;
        MessagesMuteChatMentionsMentionStatusDto messagesMuteChatMentionsMentionStatusDto3 = new MessagesMuteChatMentionsMentionStatusDto("NONE", 2, "none");
        NONE = messagesMuteChatMentionsMentionStatusDto3;
        MessagesMuteChatMentionsMentionStatusDto[] messagesMuteChatMentionsMentionStatusDtoArr = {messagesMuteChatMentionsMentionStatusDto, messagesMuteChatMentionsMentionStatusDto2, messagesMuteChatMentionsMentionStatusDto3};
        $VALUES = messagesMuteChatMentionsMentionStatusDtoArr;
        $ENTRIES = new asp(messagesMuteChatMentionsMentionStatusDtoArr);
        CREATOR = new a();
    }

    private MessagesMuteChatMentionsMentionStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesMuteChatMentionsMentionStatusDto valueOf(String str) {
        return (MessagesMuteChatMentionsMentionStatusDto) Enum.valueOf(MessagesMuteChatMentionsMentionStatusDto.class, str);
    }

    public static MessagesMuteChatMentionsMentionStatusDto[] values() {
        return (MessagesMuteChatMentionsMentionStatusDto[]) $VALUES.clone();
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
