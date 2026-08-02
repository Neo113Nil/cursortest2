package com.vk.sdk.api.base.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BasePropertyExistsDto.kt */
/* loaded from: classes5.dex */
public final class BasePropertyExistsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BasePropertyExistsDto[] $VALUES;

    @pmi0("1")
    public static final BasePropertyExistsDto PROPERTY_EXISTS;
    private final int value;

    static {
        BasePropertyExistsDto basePropertyExistsDto = new BasePropertyExistsDto("PROPERTY_EXISTS", 0, 1);
        PROPERTY_EXISTS = basePropertyExistsDto;
        BasePropertyExistsDto[] basePropertyExistsDtoArr = {basePropertyExistsDto};
        $VALUES = basePropertyExistsDtoArr;
        $ENTRIES = new asp(basePropertyExistsDtoArr);
    }

    private BasePropertyExistsDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BasePropertyExistsDto valueOf(String str) {
        return (BasePropertyExistsDto) Enum.valueOf(BasePropertyExistsDto.class, str);
    }

    public static BasePropertyExistsDto[] values() {
        return (BasePropertyExistsDto[]) $VALUES.clone();
    }
}
