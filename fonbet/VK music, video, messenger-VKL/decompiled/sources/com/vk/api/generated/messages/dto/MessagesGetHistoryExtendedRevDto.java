package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryExtendedRevDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetHistoryExtendedRevDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetHistoryExtendedRevDto[] $VALUES;

    @pmi0("1")
    public static final MessagesGetHistoryExtendedRevDto CHRONOLOGICAL;
    public static final Parcelable.Creator<MessagesGetHistoryExtendedRevDto> CREATOR;

    @pmi0("0")
    public static final MessagesGetHistoryExtendedRevDto REVERSE_CHRONOLOGICAL;
    private final int value;

    /* compiled from: MessagesGetHistoryExtendedRevDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetHistoryExtendedRevDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryExtendedRevDto createFromParcel(Parcel parcel) {
            return MessagesGetHistoryExtendedRevDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryExtendedRevDto[] newArray(int i) {
            return new MessagesGetHistoryExtendedRevDto[i];
        }
    }

    static {
        MessagesGetHistoryExtendedRevDto messagesGetHistoryExtendedRevDto = new MessagesGetHistoryExtendedRevDto("CHRONOLOGICAL", 0, 1);
        CHRONOLOGICAL = messagesGetHistoryExtendedRevDto;
        MessagesGetHistoryExtendedRevDto messagesGetHistoryExtendedRevDto2 = new MessagesGetHistoryExtendedRevDto("REVERSE_CHRONOLOGICAL", 1, 0);
        REVERSE_CHRONOLOGICAL = messagesGetHistoryExtendedRevDto2;
        MessagesGetHistoryExtendedRevDto[] messagesGetHistoryExtendedRevDtoArr = {messagesGetHistoryExtendedRevDto, messagesGetHistoryExtendedRevDto2};
        $VALUES = messagesGetHistoryExtendedRevDtoArr;
        $ENTRIES = new asp(messagesGetHistoryExtendedRevDtoArr);
        CREATOR = new a();
    }

    private MessagesGetHistoryExtendedRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessagesGetHistoryExtendedRevDto valueOf(String str) {
        return (MessagesGetHistoryExtendedRevDto) Enum.valueOf(MessagesGetHistoryExtendedRevDto.class, str);
    }

    public static MessagesGetHistoryExtendedRevDto[] values() {
        return (MessagesGetHistoryExtendedRevDto[]) $VALUES.clone();
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
