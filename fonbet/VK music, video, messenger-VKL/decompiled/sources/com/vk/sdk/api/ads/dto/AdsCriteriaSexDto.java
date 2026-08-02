package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsCriteriaSexDto.kt */
/* loaded from: classes5.dex */
public final class AdsCriteriaSexDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsCriteriaSexDto[] $VALUES;

    @pmi0("0")
    public static final AdsCriteriaSexDto ANY;

    @pmi0("2")
    public static final AdsCriteriaSexDto FEMALE;

    @pmi0("1")
    public static final AdsCriteriaSexDto MALE;
    private final String value;

    static {
        AdsCriteriaSexDto adsCriteriaSexDto = new AdsCriteriaSexDto("ANY", 0, "0");
        ANY = adsCriteriaSexDto;
        AdsCriteriaSexDto adsCriteriaSexDto2 = new AdsCriteriaSexDto("MALE", 1, "1");
        MALE = adsCriteriaSexDto2;
        AdsCriteriaSexDto adsCriteriaSexDto3 = new AdsCriteriaSexDto("FEMALE", 2, "2");
        FEMALE = adsCriteriaSexDto3;
        AdsCriteriaSexDto[] adsCriteriaSexDtoArr = {adsCriteriaSexDto, adsCriteriaSexDto2, adsCriteriaSexDto3};
        $VALUES = adsCriteriaSexDtoArr;
        $ENTRIES = new asp(adsCriteriaSexDtoArr);
    }

    private AdsCriteriaSexDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsCriteriaSexDto valueOf(String str) {
        return (AdsCriteriaSexDto) Enum.valueOf(AdsCriteriaSexDto.class, str);
    }

    public static AdsCriteriaSexDto[] values() {
        return (AdsCriteriaSexDto[]) $VALUES.clone();
    }
}
