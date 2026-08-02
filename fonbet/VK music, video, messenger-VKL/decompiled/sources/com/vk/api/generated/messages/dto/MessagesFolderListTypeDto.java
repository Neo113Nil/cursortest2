package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesFolderListTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesFolderListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesFolderListTypeDto[] $VALUES;

    @pmi0("business_notify")
    public static final MessagesFolderListTypeDto BUSINESS_NOTIFY;
    public static final Parcelable.Creator<MessagesFolderListTypeDto> CREATOR;

    @pmi0("unread")
    public static final MessagesFolderListTypeDto UNREAD;
    private final String value;

    /* compiled from: MessagesFolderListTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesFolderListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesFolderListTypeDto createFromParcel(Parcel parcel) {
            return MessagesFolderListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesFolderListTypeDto[] newArray(int i) {
            return new MessagesFolderListTypeDto[i];
        }
    }

    static {
        MessagesFolderListTypeDto messagesFolderListTypeDto = new MessagesFolderListTypeDto("BUSINESS_NOTIFY", 0, "business_notify");
        BUSINESS_NOTIFY = messagesFolderListTypeDto;
        MessagesFolderListTypeDto messagesFolderListTypeDto2 = new MessagesFolderListTypeDto("UNREAD", 1, "unread");
        UNREAD = messagesFolderListTypeDto2;
        MessagesFolderListTypeDto[] messagesFolderListTypeDtoArr = {messagesFolderListTypeDto, messagesFolderListTypeDto2};
        $VALUES = messagesFolderListTypeDtoArr;
        $ENTRIES = new asp(messagesFolderListTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesFolderListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesFolderListTypeDto valueOf(String str) {
        return (MessagesFolderListTypeDto) Enum.valueOf(MessagesFolderListTypeDto.class, str);
    }

    public static MessagesFolderListTypeDto[] values() {
        return (MessagesFolderListTypeDto[]) $VALUES.clone();
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
