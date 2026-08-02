package com.vk.sdk.api.messages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesMessageAttachmentTypeDto.kt */
/* loaded from: classes5.dex */
public final class MessagesMessageAttachmentTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesMessageAttachmentTypeDto[] $VALUES;

    @pmi0("group_call_in_progress")
    public static final MessagesMessageAttachmentTypeDto GROUP_CALL_IN_PROGRESS;
    private final String value;

    static {
        MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto = new MessagesMessageAttachmentTypeDto("GROUP_CALL_IN_PROGRESS", 0, "group_call_in_progress");
        GROUP_CALL_IN_PROGRESS = messagesMessageAttachmentTypeDto;
        MessagesMessageAttachmentTypeDto[] messagesMessageAttachmentTypeDtoArr = {messagesMessageAttachmentTypeDto};
        $VALUES = messagesMessageAttachmentTypeDtoArr;
        $ENTRIES = new asp(messagesMessageAttachmentTypeDtoArr);
    }

    private MessagesMessageAttachmentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesMessageAttachmentTypeDto valueOf(String str) {
        return (MessagesMessageAttachmentTypeDto) Enum.valueOf(MessagesMessageAttachmentTypeDto.class, str);
    }

    public static MessagesMessageAttachmentTypeDto[] values() {
        return (MessagesMessageAttachmentTypeDto[]) $VALUES.clone();
    }
}
