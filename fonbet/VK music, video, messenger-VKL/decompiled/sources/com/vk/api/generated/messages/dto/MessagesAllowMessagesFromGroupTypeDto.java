package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesAllowMessagesFromGroupTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesAllowMessagesFromGroupTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesAllowMessagesFromGroupTypeDto[] $VALUES;

    @pmi0("all")
    public static final MessagesAllowMessagesFromGroupTypeDto ALL;

    @pmi0("business_notify")
    public static final MessagesAllowMessagesFromGroupTypeDto BUSINESS_NOTIFY;
    public static final Parcelable.Creator<MessagesAllowMessagesFromGroupTypeDto> CREATOR;

    @pmi0(SignalingProtocol.KEY_CHAT_DIRECT)
    public static final MessagesAllowMessagesFromGroupTypeDto DIRECT;
    private final String value;

    /* compiled from: MessagesAllowMessagesFromGroupTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesAllowMessagesFromGroupTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesAllowMessagesFromGroupTypeDto createFromParcel(Parcel parcel) {
            return MessagesAllowMessagesFromGroupTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesAllowMessagesFromGroupTypeDto[] newArray(int i) {
            return new MessagesAllowMessagesFromGroupTypeDto[i];
        }
    }

    static {
        MessagesAllowMessagesFromGroupTypeDto messagesAllowMessagesFromGroupTypeDto = new MessagesAllowMessagesFromGroupTypeDto("ALL", 0, "all");
        ALL = messagesAllowMessagesFromGroupTypeDto;
        MessagesAllowMessagesFromGroupTypeDto messagesAllowMessagesFromGroupTypeDto2 = new MessagesAllowMessagesFromGroupTypeDto("BUSINESS_NOTIFY", 1, "business_notify");
        BUSINESS_NOTIFY = messagesAllowMessagesFromGroupTypeDto2;
        MessagesAllowMessagesFromGroupTypeDto messagesAllowMessagesFromGroupTypeDto3 = new MessagesAllowMessagesFromGroupTypeDto("DIRECT", 2, SignalingProtocol.KEY_CHAT_DIRECT);
        DIRECT = messagesAllowMessagesFromGroupTypeDto3;
        MessagesAllowMessagesFromGroupTypeDto[] messagesAllowMessagesFromGroupTypeDtoArr = {messagesAllowMessagesFromGroupTypeDto, messagesAllowMessagesFromGroupTypeDto2, messagesAllowMessagesFromGroupTypeDto3};
        $VALUES = messagesAllowMessagesFromGroupTypeDtoArr;
        $ENTRIES = new asp(messagesAllowMessagesFromGroupTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesAllowMessagesFromGroupTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesAllowMessagesFromGroupTypeDto valueOf(String str) {
        return (MessagesAllowMessagesFromGroupTypeDto) Enum.valueOf(MessagesAllowMessagesFromGroupTypeDto.class, str);
    }

    public static MessagesAllowMessagesFromGroupTypeDto[] values() {
        return (MessagesAllowMessagesFromGroupTypeDto[]) $VALUES.clone();
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
