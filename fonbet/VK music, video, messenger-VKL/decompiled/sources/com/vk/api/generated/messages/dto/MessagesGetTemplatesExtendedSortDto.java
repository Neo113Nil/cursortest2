package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetTemplatesExtendedSortDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetTemplatesExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetTemplatesExtendedSortDto[] $VALUES;

    @pmi0("create_time")
    public static final MessagesGetTemplatesExtendedSortDto CREATE_TIME;
    public static final Parcelable.Creator<MessagesGetTemplatesExtendedSortDto> CREATOR;

    @pmi0("usages")
    public static final MessagesGetTemplatesExtendedSortDto USAGES;
    private final String value;

    /* compiled from: MessagesGetTemplatesExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetTemplatesExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetTemplatesExtendedSortDto createFromParcel(Parcel parcel) {
            return MessagesGetTemplatesExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetTemplatesExtendedSortDto[] newArray(int i) {
            return new MessagesGetTemplatesExtendedSortDto[i];
        }
    }

    static {
        MessagesGetTemplatesExtendedSortDto messagesGetTemplatesExtendedSortDto = new MessagesGetTemplatesExtendedSortDto("CREATE_TIME", 0, "create_time");
        CREATE_TIME = messagesGetTemplatesExtendedSortDto;
        MessagesGetTemplatesExtendedSortDto messagesGetTemplatesExtendedSortDto2 = new MessagesGetTemplatesExtendedSortDto("USAGES", 1, "usages");
        USAGES = messagesGetTemplatesExtendedSortDto2;
        MessagesGetTemplatesExtendedSortDto[] messagesGetTemplatesExtendedSortDtoArr = {messagesGetTemplatesExtendedSortDto, messagesGetTemplatesExtendedSortDto2};
        $VALUES = messagesGetTemplatesExtendedSortDtoArr;
        $ENTRIES = new asp(messagesGetTemplatesExtendedSortDtoArr);
        CREATOR = new a();
    }

    private MessagesGetTemplatesExtendedSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetTemplatesExtendedSortDto valueOf(String str) {
        return (MessagesGetTemplatesExtendedSortDto) Enum.valueOf(MessagesGetTemplatesExtendedSortDto.class, str);
    }

    public static MessagesGetTemplatesExtendedSortDto[] values() {
        return (MessagesGetTemplatesExtendedSortDto[]) $VALUES.clone();
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
