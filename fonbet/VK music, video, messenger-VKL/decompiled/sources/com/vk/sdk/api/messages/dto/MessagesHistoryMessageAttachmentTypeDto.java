package com.vk.sdk.api.messages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesHistoryMessageAttachmentTypeDto.kt */
/* loaded from: classes5.dex */
public final class MessagesHistoryMessageAttachmentTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesHistoryMessageAttachmentTypeDto[] $VALUES;

    @pmi0("audio_message")
    public static final MessagesHistoryMessageAttachmentTypeDto AUDIO_MESSAGE;

    @pmi0("graffiti")
    public static final MessagesHistoryMessageAttachmentTypeDto GRAFFITI;
    private final String value;

    static {
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto = new MessagesHistoryMessageAttachmentTypeDto("GRAFFITI", 0, "graffiti");
        GRAFFITI = messagesHistoryMessageAttachmentTypeDto;
        MessagesHistoryMessageAttachmentTypeDto messagesHistoryMessageAttachmentTypeDto2 = new MessagesHistoryMessageAttachmentTypeDto("AUDIO_MESSAGE", 1, "audio_message");
        AUDIO_MESSAGE = messagesHistoryMessageAttachmentTypeDto2;
        MessagesHistoryMessageAttachmentTypeDto[] messagesHistoryMessageAttachmentTypeDtoArr = {messagesHistoryMessageAttachmentTypeDto, messagesHistoryMessageAttachmentTypeDto2};
        $VALUES = messagesHistoryMessageAttachmentTypeDtoArr;
        $ENTRIES = new asp(messagesHistoryMessageAttachmentTypeDtoArr);
    }

    private MessagesHistoryMessageAttachmentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesHistoryMessageAttachmentTypeDto valueOf(String str) {
        return (MessagesHistoryMessageAttachmentTypeDto) Enum.valueOf(MessagesHistoryMessageAttachmentTypeDto.class, str);
    }

    public static MessagesHistoryMessageAttachmentTypeDto[] values() {
        return (MessagesHistoryMessageAttachmentTypeDto[]) $VALUES.clone();
    }
}
