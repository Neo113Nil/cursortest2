package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetTemplatesSortDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetTemplatesSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetTemplatesSortDto[] $VALUES;

    @pmi0("create_time")
    public static final MessagesGetTemplatesSortDto CREATE_TIME;
    public static final Parcelable.Creator<MessagesGetTemplatesSortDto> CREATOR;

    @pmi0("usages")
    public static final MessagesGetTemplatesSortDto USAGES;
    private final String value;

    /* compiled from: MessagesGetTemplatesSortDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetTemplatesSortDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetTemplatesSortDto createFromParcel(Parcel parcel) {
            return MessagesGetTemplatesSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetTemplatesSortDto[] newArray(int i) {
            return new MessagesGetTemplatesSortDto[i];
        }
    }

    static {
        MessagesGetTemplatesSortDto messagesGetTemplatesSortDto = new MessagesGetTemplatesSortDto("CREATE_TIME", 0, "create_time");
        CREATE_TIME = messagesGetTemplatesSortDto;
        MessagesGetTemplatesSortDto messagesGetTemplatesSortDto2 = new MessagesGetTemplatesSortDto("USAGES", 1, "usages");
        USAGES = messagesGetTemplatesSortDto2;
        MessagesGetTemplatesSortDto[] messagesGetTemplatesSortDtoArr = {messagesGetTemplatesSortDto, messagesGetTemplatesSortDto2};
        $VALUES = messagesGetTemplatesSortDtoArr;
        $ENTRIES = new asp(messagesGetTemplatesSortDtoArr);
        CREATOR = new a();
    }

    private MessagesGetTemplatesSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetTemplatesSortDto valueOf(String str) {
        return (MessagesGetTemplatesSortDto) Enum.valueOf(MessagesGetTemplatesSortDto.class, str);
    }

    public static MessagesGetTemplatesSortDto[] values() {
        return (MessagesGetTemplatesSortDto[]) $VALUES.clone();
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
