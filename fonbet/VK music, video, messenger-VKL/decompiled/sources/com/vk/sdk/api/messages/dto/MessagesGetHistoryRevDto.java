package com.vk.sdk.api.messages.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetHistoryRevDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetHistoryRevDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetHistoryRevDto[] $VALUES;

    @pmi0("1")
    public static final MessagesGetHistoryRevDto CHRONOLOGICAL;

    @pmi0("0")
    public static final MessagesGetHistoryRevDto REVERSE_CHRONOLOGICAL;
    private final int value;

    static {
        MessagesGetHistoryRevDto messagesGetHistoryRevDto = new MessagesGetHistoryRevDto("CHRONOLOGICAL", 0, 1);
        CHRONOLOGICAL = messagesGetHistoryRevDto;
        MessagesGetHistoryRevDto messagesGetHistoryRevDto2 = new MessagesGetHistoryRevDto("REVERSE_CHRONOLOGICAL", 1, 0);
        REVERSE_CHRONOLOGICAL = messagesGetHistoryRevDto2;
        MessagesGetHistoryRevDto[] messagesGetHistoryRevDtoArr = {messagesGetHistoryRevDto, messagesGetHistoryRevDto2};
        $VALUES = messagesGetHistoryRevDtoArr;
        $ENTRIES = new asp(messagesGetHistoryRevDtoArr);
    }

    private MessagesGetHistoryRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessagesGetHistoryRevDto valueOf(String str) {
        return (MessagesGetHistoryRevDto) Enum.valueOf(MessagesGetHistoryRevDto.class, str);
    }

    public static MessagesGetHistoryRevDto[] values() {
        return (MessagesGetHistoryRevDto[]) $VALUES.clone();
    }
}
