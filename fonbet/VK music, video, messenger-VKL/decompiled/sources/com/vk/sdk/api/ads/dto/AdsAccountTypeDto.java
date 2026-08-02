package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsAccountTypeDto.kt */
/* loaded from: classes5.dex */
public final class AdsAccountTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsAccountTypeDto[] $VALUES;

    @pmi0("agency")
    public static final AdsAccountTypeDto AGENCY;

    @pmi0("general")
    public static final AdsAccountTypeDto GENERAL;
    private final String value;

    static {
        AdsAccountTypeDto adsAccountTypeDto = new AdsAccountTypeDto("GENERAL", 0, "general");
        GENERAL = adsAccountTypeDto;
        AdsAccountTypeDto adsAccountTypeDto2 = new AdsAccountTypeDto("AGENCY", 1, "agency");
        AGENCY = adsAccountTypeDto2;
        AdsAccountTypeDto[] adsAccountTypeDtoArr = {adsAccountTypeDto, adsAccountTypeDto2};
        $VALUES = adsAccountTypeDtoArr;
        $ENTRIES = new asp(adsAccountTypeDtoArr);
    }

    private AdsAccountTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsAccountTypeDto valueOf(String str) {
        return (AdsAccountTypeDto) Enum.valueOf(AdsAccountTypeDto.class, str);
    }

    public static AdsAccountTypeDto[] values() {
        return (AdsAccountTypeDto[]) $VALUES.clone();
    }
}
