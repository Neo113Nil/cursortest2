package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryRevDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetHistoryRevDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetHistoryRevDto[] $VALUES;

    @pmi0("1")
    public static final MessagesGetHistoryRevDto CHRONOLOGICAL;
    public static final Parcelable.Creator<MessagesGetHistoryRevDto> CREATOR;

    @pmi0("0")
    public static final MessagesGetHistoryRevDto REVERSE_CHRONOLOGICAL;
    private final int value;

    /* compiled from: MessagesGetHistoryRevDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetHistoryRevDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryRevDto createFromParcel(Parcel parcel) {
            return MessagesGetHistoryRevDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryRevDto[] newArray(int i) {
            return new MessagesGetHistoryRevDto[i];
        }
    }

    static {
        MessagesGetHistoryRevDto messagesGetHistoryRevDto = new MessagesGetHistoryRevDto("CHRONOLOGICAL", 0, 1);
        CHRONOLOGICAL = messagesGetHistoryRevDto;
        MessagesGetHistoryRevDto messagesGetHistoryRevDto2 = new MessagesGetHistoryRevDto("REVERSE_CHRONOLOGICAL", 1, 0);
        REVERSE_CHRONOLOGICAL = messagesGetHistoryRevDto2;
        MessagesGetHistoryRevDto[] messagesGetHistoryRevDtoArr = {messagesGetHistoryRevDto, messagesGetHistoryRevDto2};
        $VALUES = messagesGetHistoryRevDtoArr;
        $ENTRIES = new asp(messagesGetHistoryRevDtoArr);
        CREATOR = new a();
    }

    private MessagesGetHistoryRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessagesGetHistoryRevDto valueOf(String str) {
        return (MessagesGetHistoryRevDto) Enum.valueOf(MessagesGetHistoryRevDto.class, str);
    }

    public static MessagesGetHistoryRevDto[] values() {
        return (MessagesGetHistoryRevDto[]) $VALUES.clone();
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
