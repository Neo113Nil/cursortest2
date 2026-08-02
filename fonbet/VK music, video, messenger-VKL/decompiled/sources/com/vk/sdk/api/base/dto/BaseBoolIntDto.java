package com.vk.sdk.api.base.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseBoolIntDto.kt */
/* loaded from: classes5.dex */
public final class BaseBoolIntDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseBoolIntDto[] $VALUES;

    @pmi0("0")
    public static final BaseBoolIntDto NO;

    @pmi0("1")
    public static final BaseBoolIntDto YES;
    private final int value;

    static {
        BaseBoolIntDto baseBoolIntDto = new BaseBoolIntDto("NO", 0, 0);
        NO = baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto2 = new BaseBoolIntDto("YES", 1, 1);
        YES = baseBoolIntDto2;
        BaseBoolIntDto[] baseBoolIntDtoArr = {baseBoolIntDto, baseBoolIntDto2};
        $VALUES = baseBoolIntDtoArr;
        $ENTRIES = new asp(baseBoolIntDtoArr);
    }

    private BaseBoolIntDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BaseBoolIntDto valueOf(String str) {
        return (BaseBoolIntDto) Enum.valueOf(BaseBoolIntDto.class, str);
    }

    public static BaseBoolIntDto[] values() {
        return (BaseBoolIntDto[]) $VALUES.clone();
    }
}
