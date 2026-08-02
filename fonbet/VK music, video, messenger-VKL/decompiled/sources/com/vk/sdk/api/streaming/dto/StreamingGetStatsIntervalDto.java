package com.vk.sdk.api.streaming.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StreamingGetStatsIntervalDto.kt */
/* loaded from: classes5.dex */
public final class StreamingGetStatsIntervalDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StreamingGetStatsIntervalDto[] $VALUES;

    @pmi0("1h")
    public static final StreamingGetStatsIntervalDto TYPE_1H;

    @pmi0("24h")
    public static final StreamingGetStatsIntervalDto TYPE_24H;

    @pmi0("5m")
    public static final StreamingGetStatsIntervalDto TYPE_5M;
    private final String value;

    static {
        StreamingGetStatsIntervalDto streamingGetStatsIntervalDto = new StreamingGetStatsIntervalDto("TYPE_1H", 0, "1h");
        TYPE_1H = streamingGetStatsIntervalDto;
        StreamingGetStatsIntervalDto streamingGetStatsIntervalDto2 = new StreamingGetStatsIntervalDto("TYPE_24H", 1, "24h");
        TYPE_24H = streamingGetStatsIntervalDto2;
        StreamingGetStatsIntervalDto streamingGetStatsIntervalDto3 = new StreamingGetStatsIntervalDto("TYPE_5M", 2, "5m");
        TYPE_5M = streamingGetStatsIntervalDto3;
        StreamingGetStatsIntervalDto[] streamingGetStatsIntervalDtoArr = {streamingGetStatsIntervalDto, streamingGetStatsIntervalDto2, streamingGetStatsIntervalDto3};
        $VALUES = streamingGetStatsIntervalDtoArr;
        $ENTRIES = new asp(streamingGetStatsIntervalDtoArr);
    }

    private StreamingGetStatsIntervalDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StreamingGetStatsIntervalDto valueOf(String str) {
        return (StreamingGetStatsIntervalDto) Enum.valueOf(StreamingGetStatsIntervalDto.class, str);
    }

    public static StreamingGetStatsIntervalDto[] values() {
        return (StreamingGetStatsIntervalDto[]) $VALUES.clone();
    }
}
