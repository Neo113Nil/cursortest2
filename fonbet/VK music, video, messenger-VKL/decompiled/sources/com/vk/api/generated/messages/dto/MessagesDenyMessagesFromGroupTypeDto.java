package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesDenyMessagesFromGroupTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesDenyMessagesFromGroupTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesDenyMessagesFromGroupTypeDto[] $VALUES;

    @pmi0("all")
    public static final MessagesDenyMessagesFromGroupTypeDto ALL;

    @pmi0("business_notify")
    public static final MessagesDenyMessagesFromGroupTypeDto BUSINESS_NOTIFY;
    public static final Parcelable.Creator<MessagesDenyMessagesFromGroupTypeDto> CREATOR;

    @pmi0(SignalingProtocol.KEY_CHAT_DIRECT)
    public static final MessagesDenyMessagesFromGroupTypeDto DIRECT;
    private final String value;

    /* compiled from: MessagesDenyMessagesFromGroupTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesDenyMessagesFromGroupTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesDenyMessagesFromGroupTypeDto createFromParcel(Parcel parcel) {
            return MessagesDenyMessagesFromGroupTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesDenyMessagesFromGroupTypeDto[] newArray(int i) {
            return new MessagesDenyMessagesFromGroupTypeDto[i];
        }
    }

    static {
        MessagesDenyMessagesFromGroupTypeDto messagesDenyMessagesFromGroupTypeDto = new MessagesDenyMessagesFromGroupTypeDto("ALL", 0, "all");
        ALL = messagesDenyMessagesFromGroupTypeDto;
        MessagesDenyMessagesFromGroupTypeDto messagesDenyMessagesFromGroupTypeDto2 = new MessagesDenyMessagesFromGroupTypeDto("BUSINESS_NOTIFY", 1, "business_notify");
        BUSINESS_NOTIFY = messagesDenyMessagesFromGroupTypeDto2;
        MessagesDenyMessagesFromGroupTypeDto messagesDenyMessagesFromGroupTypeDto3 = new MessagesDenyMessagesFromGroupTypeDto("DIRECT", 2, SignalingProtocol.KEY_CHAT_DIRECT);
        DIRECT = messagesDenyMessagesFromGroupTypeDto3;
        MessagesDenyMessagesFromGroupTypeDto[] messagesDenyMessagesFromGroupTypeDtoArr = {messagesDenyMessagesFromGroupTypeDto, messagesDenyMessagesFromGroupTypeDto2, messagesDenyMessagesFromGroupTypeDto3};
        $VALUES = messagesDenyMessagesFromGroupTypeDtoArr;
        $ENTRIES = new asp(messagesDenyMessagesFromGroupTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesDenyMessagesFromGroupTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesDenyMessagesFromGroupTypeDto valueOf(String str) {
        return (MessagesDenyMessagesFromGroupTypeDto) Enum.valueOf(MessagesDenyMessagesFromGroupTypeDto.class, str);
    }

    public static MessagesDenyMessagesFromGroupTypeDto[] values() {
        return (MessagesDenyMessagesFromGroupTypeDto[]) $VALUES.clone();
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
