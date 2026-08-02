package com.vk.sdk.api.streaming.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StreamingSetSettingsMonthlyTierDto.kt */
/* loaded from: classes5.dex */
public final class StreamingSetSettingsMonthlyTierDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StreamingSetSettingsMonthlyTierDto[] $VALUES;

    @pmi0("tier_1")
    public static final StreamingSetSettingsMonthlyTierDto TIER_1;

    @pmi0("tier_2")
    public static final StreamingSetSettingsMonthlyTierDto TIER_2;

    @pmi0("tier_3")
    public static final StreamingSetSettingsMonthlyTierDto TIER_3;

    @pmi0("tier_4")
    public static final StreamingSetSettingsMonthlyTierDto TIER_4;

    @pmi0("tier_5")
    public static final StreamingSetSettingsMonthlyTierDto TIER_5;

    @pmi0("tier_6")
    public static final StreamingSetSettingsMonthlyTierDto TIER_6;

    @pmi0("unlimited")
    public static final StreamingSetSettingsMonthlyTierDto UNLIMITED;
    private final String value;

    static {
        StreamingSetSettingsMonthlyTierDto streamingSetSettingsMonthlyTierDto = new StreamingSetSettingsMonthlyTierDto("TIER_1", 0, "tier_1");
        TIER_1 = streamingSetSettingsMonthlyTierDto;
        StreamingSetSettingsMonthlyTierDto streamingSetSettingsMonthlyTierDto2 = new StreamingSetSettingsMonthlyTierDto("TIER_2", 1, "tier_2");
        TIER_2 = streamingSetSettingsMonthlyTierDto2;
        StreamingSetSettingsMonthlyTierDto streamingSetSettingsMonthlyTierDto3 = new StreamingSetSettingsMonthlyTierDto("TIER_3", 2, "tier_3");
        TIER_3 = streamingSetSettingsMonthlyTierDto3;
        StreamingSetSettingsMonthlyTierDto streamingSetSettingsMonthlyTierDto4 = new StreamingSetSettingsMonthlyTierDto("TIER_4", 3, "tier_4");
        TIER_4 = streamingSetSettingsMonthlyTierDto4;
        StreamingSetSettingsMonthlyTierDto streamingSetSettingsMonthlyTierDto5 = new StreamingSetSettingsMonthlyTierDto("TIER_5", 4, "tier_5");
        TIER_5 = streamingSetSettingsMonthlyTierDto5;
        StreamingSetSettingsMonthlyTierDto streamingSetSettingsMonthlyTierDto6 = new StreamingSetSettingsMonthlyTierDto("TIER_6", 5, "tier_6");
        TIER_6 = streamingSetSettingsMonthlyTierDto6;
        StreamingSetSettingsMonthlyTierDto streamingSetSettingsMonthlyTierDto7 = new StreamingSetSettingsMonthlyTierDto("UNLIMITED", 6, "unlimited");
        UNLIMITED = streamingSetSettingsMonthlyTierDto7;
        StreamingSetSettingsMonthlyTierDto[] streamingSetSettingsMonthlyTierDtoArr = {streamingSetSettingsMonthlyTierDto, streamingSetSettingsMonthlyTierDto2, streamingSetSettingsMonthlyTierDto3, streamingSetSettingsMonthlyTierDto4, streamingSetSettingsMonthlyTierDto5, streamingSetSettingsMonthlyTierDto6, streamingSetSettingsMonthlyTierDto7};
        $VALUES = streamingSetSettingsMonthlyTierDtoArr;
        $ENTRIES = new asp(streamingSetSettingsMonthlyTierDtoArr);
    }

    private StreamingSetSettingsMonthlyTierDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StreamingSetSettingsMonthlyTierDto valueOf(String str) {
        return (StreamingSetSettingsMonthlyTierDto) Enum.valueOf(StreamingSetSettingsMonthlyTierDto.class, str);
    }

    public static StreamingSetSettingsMonthlyTierDto[] values() {
        return (StreamingSetSettingsMonthlyTierDto[]) $VALUES.clone();
    }
}
