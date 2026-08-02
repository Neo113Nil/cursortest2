package com.vk.sdk.api.ads.dto;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsStatsSexValueDto.kt */
/* loaded from: classes5.dex */
public final class AdsStatsSexValueDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsStatsSexValueDto[] $VALUES;

    @pmi0(InneractiveMediationDefs.GENDER_FEMALE)
    public static final AdsStatsSexValueDto FEMALE;

    @pmi0(InneractiveMediationDefs.GENDER_MALE)
    public static final AdsStatsSexValueDto MALE;
    private final String value;

    static {
        AdsStatsSexValueDto adsStatsSexValueDto = new AdsStatsSexValueDto("FEMALE", 0, InneractiveMediationDefs.GENDER_FEMALE);
        FEMALE = adsStatsSexValueDto;
        AdsStatsSexValueDto adsStatsSexValueDto2 = new AdsStatsSexValueDto("MALE", 1, InneractiveMediationDefs.GENDER_MALE);
        MALE = adsStatsSexValueDto2;
        AdsStatsSexValueDto[] adsStatsSexValueDtoArr = {adsStatsSexValueDto, adsStatsSexValueDto2};
        $VALUES = adsStatsSexValueDtoArr;
        $ENTRIES = new asp(adsStatsSexValueDtoArr);
    }

    private AdsStatsSexValueDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsStatsSexValueDto valueOf(String str) {
        return (AdsStatsSexValueDto) Enum.valueOf(AdsStatsSexValueDto.class, str);
    }

    public static AdsStatsSexValueDto[] values() {
        return (AdsStatsSexValueDto[]) $VALUES.clone();
    }
}
