package com.vk.sdk.api.base.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseOkResponseDto.kt */
/* loaded from: classes5.dex */
public final class BaseOkResponseDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseOkResponseDto[] $VALUES;

    @pmi0("1")
    public static final BaseOkResponseDto OK;
    private final int value;

    static {
        BaseOkResponseDto baseOkResponseDto = new BaseOkResponseDto("OK", 0, 1);
        OK = baseOkResponseDto;
        BaseOkResponseDto[] baseOkResponseDtoArr = {baseOkResponseDto};
        $VALUES = baseOkResponseDtoArr;
        $ENTRIES = new asp(baseOkResponseDtoArr);
    }

    private BaseOkResponseDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BaseOkResponseDto valueOf(String str) {
        return (BaseOkResponseDto) Enum.valueOf(BaseOkResponseDto.class, str);
    }

    public static BaseOkResponseDto[] values() {
        return (BaseOkResponseDto[]) $VALUES.clone();
    }
}
