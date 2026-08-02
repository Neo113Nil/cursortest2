package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesConversationBarHideSourceDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarHideSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesConversationBarHideSourceDto[] $VALUES;

    @pmi0("action")
    public static final MessagesConversationBarHideSourceDto ACTION;

    @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
    public static final MessagesConversationBarHideSourceDto CLOSE;
    public static final Parcelable.Creator<MessagesConversationBarHideSourceDto> CREATOR;

    @pmi0("views_limit")
    public static final MessagesConversationBarHideSourceDto VIEWS_LIMIT;
    private final String value;

    /* compiled from: MessagesConversationBarHideSourceDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarHideSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarHideSourceDto createFromParcel(Parcel parcel) {
            return MessagesConversationBarHideSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarHideSourceDto[] newArray(int i) {
            return new MessagesConversationBarHideSourceDto[i];
        }
    }

    static {
        MessagesConversationBarHideSourceDto messagesConversationBarHideSourceDto = new MessagesConversationBarHideSourceDto("ACTION", 0, "action");
        ACTION = messagesConversationBarHideSourceDto;
        MessagesConversationBarHideSourceDto messagesConversationBarHideSourceDto2 = new MessagesConversationBarHideSourceDto("CLOSE", 1, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        CLOSE = messagesConversationBarHideSourceDto2;
        MessagesConversationBarHideSourceDto messagesConversationBarHideSourceDto3 = new MessagesConversationBarHideSourceDto("VIEWS_LIMIT", 2, "views_limit");
        VIEWS_LIMIT = messagesConversationBarHideSourceDto3;
        MessagesConversationBarHideSourceDto[] messagesConversationBarHideSourceDtoArr = {messagesConversationBarHideSourceDto, messagesConversationBarHideSourceDto2, messagesConversationBarHideSourceDto3};
        $VALUES = messagesConversationBarHideSourceDtoArr;
        $ENTRIES = new asp(messagesConversationBarHideSourceDtoArr);
        CREATOR = new a();
    }

    private MessagesConversationBarHideSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesConversationBarHideSourceDto valueOf(String str) {
        return (MessagesConversationBarHideSourceDto) Enum.valueOf(MessagesConversationBarHideSourceDto.class, str);
    }

    public static MessagesConversationBarHideSourceDto[] values() {
        return (MessagesConversationBarHideSourceDto[]) $VALUES.clone();
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
