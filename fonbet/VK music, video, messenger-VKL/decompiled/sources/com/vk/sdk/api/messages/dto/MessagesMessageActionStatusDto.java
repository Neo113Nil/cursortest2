package com.vk.sdk.api.messages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesMessageActionStatusDto.kt */
/* loaded from: classes5.dex */
public final class MessagesMessageActionStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesMessageActionStatusDto[] $VALUES;

    @pmi0("accepted_message_request")
    public static final MessagesMessageActionStatusDto ACCEPTED_MESSAGE_REQUEST;
    private final String value;

    static {
        MessagesMessageActionStatusDto messagesMessageActionStatusDto = new MessagesMessageActionStatusDto("ACCEPTED_MESSAGE_REQUEST", 0, "accepted_message_request");
        ACCEPTED_MESSAGE_REQUEST = messagesMessageActionStatusDto;
        MessagesMessageActionStatusDto[] messagesMessageActionStatusDtoArr = {messagesMessageActionStatusDto};
        $VALUES = messagesMessageActionStatusDtoArr;
        $ENTRIES = new asp(messagesMessageActionStatusDtoArr);
    }

    private MessagesMessageActionStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesMessageActionStatusDto valueOf(String str) {
        return (MessagesMessageActionStatusDto) Enum.valueOf(MessagesMessageActionStatusDto.class, str);
    }

    public static MessagesMessageActionStatusDto[] values() {
        return (MessagesMessageActionStatusDto[]) $VALUES.clone();
    }
}
