package com.vk.sdk.api.messages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetConversationsFilterDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetConversationsFilterDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetConversationsFilterDto[] $VALUES;

    @pmi0("all")
    public static final MessagesGetConversationsFilterDto ALL;

    @pmi0("archive")
    public static final MessagesGetConversationsFilterDto ARCHIVE;

    @pmi0("business_notify")
    public static final MessagesGetConversationsFilterDto BUSINESS_NOTIFY;

    @pmi0("chats")
    public static final MessagesGetConversationsFilterDto CHATS;

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

    static {
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto = new MessagesGetConversationsFilterDto("ALL", 0, "all");
        ALL = messagesGetConversationsFilterDto;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto2 = new MessagesGetConversationsFilterDto("ARCHIVE", 1, "archive");
        ARCHIVE = messagesGetConversationsFilterDto2;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto3 = new MessagesGetConversationsFilterDto("BUSINESS_NOTIFY", 2, "business_notify");
        BUSINESS_NOTIFY = messagesGetConversationsFilterDto3;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto4 = new MessagesGetConversationsFilterDto("CHATS", 3, "chats");
        CHATS = messagesGetConversationsFilterDto4;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto5 = new MessagesGetConversationsFilterDto("IMPORTANT", 4, "important");
        IMPORTANT = messagesGetConversationsFilterDto5;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto6 = new MessagesGetConversationsFilterDto("MESSAGE_REQUEST", 5, "message_request");
        MESSAGE_REQUEST = messagesGetConversationsFilterDto6;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto7 = new MessagesGetConversationsFilterDto("SORTED_CHATS", 6, "sorted_chats");
        SORTED_CHATS = messagesGetConversationsFilterDto7;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto8 = new MessagesGetConversationsFilterDto("UNANSWERED", 7, "unanswered");
        UNANSWERED = messagesGetConversationsFilterDto8;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto9 = new MessagesGetConversationsFilterDto("UNREAD", 8, "unread");
        UNREAD = messagesGetConversationsFilterDto9;
        MessagesGetConversationsFilterDto[] messagesGetConversationsFilterDtoArr = {messagesGetConversationsFilterDto, messagesGetConversationsFilterDto2, messagesGetConversationsFilterDto3, messagesGetConversationsFilterDto4, messagesGetConversationsFilterDto5, messagesGetConversationsFilterDto6, messagesGetConversationsFilterDto7, messagesGetConversationsFilterDto8, messagesGetConversationsFilterDto9};
        $VALUES = messagesGetConversationsFilterDtoArr;
        $ENTRIES = new asp(messagesGetConversationsFilterDtoArr);
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
}
