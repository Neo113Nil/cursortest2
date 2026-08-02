package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesConversationCardTypeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationCardTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesConversationCardTypeDto[] $VALUES;
    public static final Parcelable.Creator<MessagesConversationCardTypeDto> CREATOR;

    @pmi0("custom")
    public static final MessagesConversationCardTypeDto CUSTOM;

    @pmi0("gift")
    public static final MessagesConversationCardTypeDto GIFT;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final MessagesConversationCardTypeDto PROFILE;
    private final String value;

    /* compiled from: MessagesConversationCardTypeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationCardTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCardTypeDto createFromParcel(Parcel parcel) {
            return MessagesConversationCardTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCardTypeDto[] newArray(int i) {
            return new MessagesConversationCardTypeDto[i];
        }
    }

    static {
        MessagesConversationCardTypeDto messagesConversationCardTypeDto = new MessagesConversationCardTypeDto("PROFILE", 0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = messagesConversationCardTypeDto;
        MessagesConversationCardTypeDto messagesConversationCardTypeDto2 = new MessagesConversationCardTypeDto("CUSTOM", 1, "custom");
        CUSTOM = messagesConversationCardTypeDto2;
        MessagesConversationCardTypeDto messagesConversationCardTypeDto3 = new MessagesConversationCardTypeDto("GIFT", 2, "gift");
        GIFT = messagesConversationCardTypeDto3;
        MessagesConversationCardTypeDto[] messagesConversationCardTypeDtoArr = {messagesConversationCardTypeDto, messagesConversationCardTypeDto2, messagesConversationCardTypeDto3};
        $VALUES = messagesConversationCardTypeDtoArr;
        $ENTRIES = new asp(messagesConversationCardTypeDtoArr);
        CREATOR = new a();
    }

    private MessagesConversationCardTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesConversationCardTypeDto valueOf(String str) {
        return (MessagesConversationCardTypeDto) Enum.valueOf(MessagesConversationCardTypeDto.class, str);
    }

    public static MessagesConversationCardTypeDto[] values() {
        return (MessagesConversationCardTypeDto[]) $VALUES.clone();
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
