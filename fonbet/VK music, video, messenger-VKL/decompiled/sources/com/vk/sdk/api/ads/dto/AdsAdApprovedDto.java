package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsAdApprovedDto.kt */
/* loaded from: classes5.dex */
public final class AdsAdApprovedDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsAdApprovedDto[] $VALUES;

    @pmi0("2")
    public static final AdsAdApprovedDto APPROVED;

    @pmi0("0")
    public static final AdsAdApprovedDto NOT_MODERATED;

    @pmi0("1")
    public static final AdsAdApprovedDto PENDING_MODERATION;

    @pmi0("3")
    public static final AdsAdApprovedDto REJECTED;
    private final int value;

    static {
        AdsAdApprovedDto adsAdApprovedDto = new AdsAdApprovedDto("NOT_MODERATED", 0, 0);
        NOT_MODERATED = adsAdApprovedDto;
        AdsAdApprovedDto adsAdApprovedDto2 = new AdsAdApprovedDto("PENDING_MODERATION", 1, 1);
        PENDING_MODERATION = adsAdApprovedDto2;
        AdsAdApprovedDto adsAdApprovedDto3 = new AdsAdApprovedDto("APPROVED", 2, 2);
        APPROVED = adsAdApprovedDto3;
        AdsAdApprovedDto adsAdApprovedDto4 = new AdsAdApprovedDto("REJECTED", 3, 3);
        REJECTED = adsAdApprovedDto4;
        AdsAdApprovedDto[] adsAdApprovedDtoArr = {adsAdApprovedDto, adsAdApprovedDto2, adsAdApprovedDto3, adsAdApprovedDto4};
        $VALUES = adsAdApprovedDtoArr;
        $ENTRIES = new asp(adsAdApprovedDtoArr);
    }

    private AdsAdApprovedDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AdsAdApprovedDto valueOf(String str) {
        return (AdsAdApprovedDto) Enum.valueOf(AdsAdApprovedDto.class, str);
    }

    public static AdsAdApprovedDto[] values() {
        return (AdsAdApprovedDto[]) $VALUES.clone();
    }
}
