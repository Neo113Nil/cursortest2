package com.vk.sdk.api.base.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseSexDto.kt */
/* loaded from: classes5.dex */
public final class BaseSexDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseSexDto[] $VALUES;

    @pmi0("1")
    public static final BaseSexDto FEMALE;

    @pmi0("2")
    public static final BaseSexDto MALE;

    @pmi0("0")
    public static final BaseSexDto UNKNOWN;
    private final int value;

    static {
        BaseSexDto baseSexDto = new BaseSexDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = baseSexDto;
        BaseSexDto baseSexDto2 = new BaseSexDto("FEMALE", 1, 1);
        FEMALE = baseSexDto2;
        BaseSexDto baseSexDto3 = new BaseSexDto("MALE", 2, 2);
        MALE = baseSexDto3;
        BaseSexDto[] baseSexDtoArr = {baseSexDto, baseSexDto2, baseSexDto3};
        $VALUES = baseSexDtoArr;
        $ENTRIES = new asp(baseSexDtoArr);
    }

    private BaseSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BaseSexDto valueOf(String str) {
        return (BaseSexDto) Enum.valueOf(BaseSexDto.class, str);
    }

    public static BaseSexDto[] values() {
        return (BaseSexDto[]) $VALUES.clone();
    }
}
