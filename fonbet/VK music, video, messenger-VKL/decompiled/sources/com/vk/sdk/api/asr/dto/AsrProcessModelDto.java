package com.vk.sdk.api.asr.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AsrProcessModelDto.kt */
/* loaded from: classes5.dex */
public final class AsrProcessModelDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AsrProcessModelDto[] $VALUES;

    @pmi0("neutral")
    public static final AsrProcessModelDto NEUTRAL;

    @pmi0("spontaneous")
    public static final AsrProcessModelDto SPONTANEOUS;
    private final String value;

    static {
        AsrProcessModelDto asrProcessModelDto = new AsrProcessModelDto("NEUTRAL", 0, "neutral");
        NEUTRAL = asrProcessModelDto;
        AsrProcessModelDto asrProcessModelDto2 = new AsrProcessModelDto("SPONTANEOUS", 1, "spontaneous");
        SPONTANEOUS = asrProcessModelDto2;
        AsrProcessModelDto[] asrProcessModelDtoArr = {asrProcessModelDto, asrProcessModelDto2};
        $VALUES = asrProcessModelDtoArr;
        $ENTRIES = new asp(asrProcessModelDtoArr);
    }

    private AsrProcessModelDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AsrProcessModelDto valueOf(String str) {
        return (AsrProcessModelDto) Enum.valueOf(AsrProcessModelDto.class, str);
    }

    public static AsrProcessModelDto[] values() {
        return (AsrProcessModelDto[]) $VALUES.clone();
    }
}
