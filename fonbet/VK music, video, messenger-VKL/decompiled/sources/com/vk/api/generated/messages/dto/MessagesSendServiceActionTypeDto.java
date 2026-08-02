package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesSendServiceActionTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSendServiceActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesSendServiceActionTypeDto[] $VALUES;

    @pmi0("chat_screenshot")
    public static final MessagesSendServiceActionTypeDto CHAT_SCREENSHOT;
    public static final Parcelable.Creator<MessagesSendServiceActionTypeDto> CREATOR;
    private final String value;

    /* compiled from: MessagesSendServiceActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSendServiceActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSendServiceActionTypeDto createFromParcel(Parcel parcel) {
            return MessagesSendServiceActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSendServiceActionTypeDto[] newArray(int i) {
            return new MessagesSendServiceActionTypeDto[i];
        }
    }

    static {
        MessagesSendServiceActionTypeDto messagesSendServiceActionTypeDto = new MessagesSendServiceActionTypeDto("CHAT_SCREENSHOT", 0, "chat_screenshot");
        CHAT_SCREENSHOT = messagesSendServiceActionTypeDto;
        MessagesSendServiceActionTypeDto[] messagesSendServiceActionTypeDtoArr = {messagesSendServiceActionTypeDto};
        $VALUES = messagesSendServiceActionTypeDtoArr;
        $ENTRIES = new asp(messagesSendServiceActionTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesSendServiceActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesSendServiceActionTypeDto valueOf(String str) {
        return (MessagesSendServiceActionTypeDto) Enum.valueOf(MessagesSendServiceActionTypeDto.class, str);
    }

    public static MessagesSendServiceActionTypeDto[] values() {
        return (MessagesSendServiceActionTypeDto[]) $VALUES.clone();
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
