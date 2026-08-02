package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetConversationsFilterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetConversationsFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetConversationsFilterDto[] $VALUES;

    @pmi0("ad_tag")
    public static final MessagesGetConversationsFilterDto AD_TAG;

    @pmi0("all")
    public static final MessagesGetConversationsFilterDto ALL;

    @pmi0("archive")
    public static final MessagesGetConversationsFilterDto ARCHIVE;

    @pmi0("business_notify")
    public static final MessagesGetConversationsFilterDto BUSINESS_NOTIFY;

    @pmi0("chats")
    public static final MessagesGetConversationsFilterDto CHATS;
    public static final Parcelable.Creator<MessagesGetConversationsFilterDto> CREATOR;

    @pmi0("important")
    public static final MessagesGetConversationsFilterDto IMPORTANT;

    @pmi0("message_request")
    public static final MessagesGetConversationsFilterDto MESSAGE_REQUEST;

    @pmi0("sorted_chats")
    public static final MessagesGetConversationsFilterDto SORTED_CHATS;

    @pmi0("unanswered")
    public static final MessagesGetConversationsFilterDto UNANSWERED;

    @pmi0("unread")
    public static final MessagesGetConversationsFilterDto UNREAD;
    private final String value;

    /* compiled from: MessagesGetConversationsFilterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetConversationsFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationsFilterDto createFromParcel(Parcel parcel) {
            return MessagesGetConversationsFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationsFilterDto[] newArray(int i) {
            return new MessagesGetConversationsFilterDto[i];
        }
    }

    static {
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto = new MessagesGetConversationsFilterDto("AD_TAG", 0, "ad_tag");
        AD_TAG = messagesGetConversationsFilterDto;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto2 = new MessagesGetConversationsFilterDto("ALL", 1, "all");
        ALL = messagesGetConversationsFilterDto2;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto3 = new MessagesGetConversationsFilterDto("ARCHIVE", 2, "archive");
        ARCHIVE = messagesGetConversationsFilterDto3;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto4 = new MessagesGetConversationsFilterDto("BUSINESS_NOTIFY", 3, "business_notify");
        BUSINESS_NOTIFY = messagesGetConversationsFilterDto4;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto5 = new MessagesGetConversationsFilterDto("CHATS", 4, "chats");
        CHATS = messagesGetConversationsFilterDto5;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto6 = new MessagesGetConversationsFilterDto("IMPORTANT", 5, "important");
        IMPORTANT = messagesGetConversationsFilterDto6;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto7 = new MessagesGetConversationsFilterDto("MESSAGE_REQUEST", 6, "message_request");
        MESSAGE_REQUEST = messagesGetConversationsFilterDto7;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto8 = new MessagesGetConversationsFilterDto("SORTED_CHATS", 7, "sorted_chats");
        SORTED_CHATS = messagesGetConversationsFilterDto8;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto9 = new MessagesGetConversationsFilterDto("UNANSWERED", 8, "unanswered");
        UNANSWERED = messagesGetConversationsFilterDto9;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto10 = new MessagesGetConversationsFilterDto("UNREAD", 9, "unread");
        UNREAD = messagesGetConversationsFilterDto10;
        MessagesGetConversationsFilterDto[] messagesGetConversationsFilterDtoArr = {messagesGetConversationsFilterDto, messagesGetConversationsFilterDto2, messagesGetConversationsFilterDto3, messagesGetConversationsFilterDto4, messagesGetConversationsFilterDto5, messagesGetConversationsFilterDto6, messagesGetConversationsFilterDto7, messagesGetConversationsFilterDto8, messagesGetConversationsFilterDto9, messagesGetConversationsFilterDto10};
        $VALUES = messagesGetConversationsFilterDtoArr;
        $ENTRIES = new asp(messagesGetConversationsFilterDtoArr);
        CREATOR = new a();
    }

    private MessagesGetConversationsFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetConversationsFilterDto valueOf(String str) {
        return (MessagesGetConversationsFilterDto) Enum.valueOf(MessagesGetConversationsFilterDto.class, str);
    }

    public static MessagesGetConversationsFilterDto[] values() {
        return (MessagesGetConversationsFilterDto[]) $VALUES.clone();
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
