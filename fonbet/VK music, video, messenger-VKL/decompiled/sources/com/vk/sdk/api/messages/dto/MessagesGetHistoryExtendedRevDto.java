package com.vk.sdk.api.messages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryExtendedRevDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetHistoryExtendedRevDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetHistoryExtendedRevDto[] $VALUES;

    @pmi0("1")
    public static final MessagesGetHistoryExtendedRevDto CHRONOLOGICAL;

    @pmi0("0")
    public static final MessagesGetHistoryExtendedRevDto REVERSE_CHRONOLOGICAL;
    private final int value;

    static {
        MessagesGetHistoryExtendedRevDto messagesGetHistoryExtendedRevDto = new MessagesGetHistoryExtendedRevDto("CHRONOLOGICAL", 0, 1);
        CHRONOLOGICAL = messagesGetHistoryExtendedRevDto;
        MessagesGetHistoryExtendedRevDto messagesGetHistoryExtendedRevDto2 = new MessagesGetHistoryExtendedRevDto("REVERSE_CHRONOLOGICAL", 1, 0);
        REVERSE_CHRONOLOGICAL = messagesGetHistoryExtendedRevDto2;
        MessagesGetHistoryExtendedRevDto[] messagesGetHistoryExtendedRevDtoArr = {messagesGetHistoryExtendedRevDto, messagesGetHistoryExtendedRevDto2};
        $VALUES = messagesGetHistoryExtendedRevDtoArr;
        $ENTRIES = new asp(messagesGetHistoryExtendedRevDtoArr);
    }

    private MessagesGetHistoryExtendedRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessagesGetHistoryExtendedRevDto valueOf(String str) {
        return (MessagesGetHistoryExtendedRevDto) Enum.valueOf(MessagesGetHistoryExtendedRevDto.class, str);
    }

    public static MessagesGetHistoryExtendedRevDto[] values() {
        return (MessagesGetHistoryExtendedRevDto[]) $VALUES.clone();
    }
}
