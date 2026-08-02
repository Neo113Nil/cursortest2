package com.vk.sdk.api.streaming.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StreamingGetStatsTypeDto.kt */
/* loaded from: classes5.dex */
public final class StreamingGetStatsTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StreamingGetStatsTypeDto[] $VALUES;

    @pmi0("prepared")
    public static final StreamingGetStatsTypeDto PREPARED;

    @pmi0("received")
    public static final StreamingGetStatsTypeDto RECEIVED;
    private final String value;

    static {
        StreamingGetStatsTypeDto streamingGetStatsTypeDto = new StreamingGetStatsTypeDto("PREPARED", 0, "prepared");
        PREPARED = streamingGetStatsTypeDto;
        StreamingGetStatsTypeDto streamingGetStatsTypeDto2 = new StreamingGetStatsTypeDto("RECEIVED", 1, "received");
        RECEIVED = streamingGetStatsTypeDto2;
        StreamingGetStatsTypeDto[] streamingGetStatsTypeDtoArr = {streamingGetStatsTypeDto, streamingGetStatsTypeDto2};
        $VALUES = streamingGetStatsTypeDtoArr;
        $ENTRIES = new asp(streamingGetStatsTypeDtoArr);
    }

    private StreamingGetStatsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StreamingGetStatsTypeDto valueOf(String str) {
        return (StreamingGetStatsTypeDto) Enum.valueOf(StreamingGetStatsTypeDto.class, str);
    }

    public static StreamingGetStatsTypeDto[] values() {
        return (StreamingGetStatsTypeDto[]) $VALUES.clone();
    }
}
