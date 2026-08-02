package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsAdCostTypeDto.kt */
/* loaded from: classes5.dex */
public final class AdsAdCostTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsAdCostTypeDto[] $VALUES;

    @pmi0("2")
    public static final AdsAdCostTypeDto PER_ACTIONS;

    @pmi0("0")
    public static final AdsAdCostTypeDto PER_CLICKS;

    @pmi0("1")
    public static final AdsAdCostTypeDto PER_IMPRESSIONS;

    @pmi0("3")
    public static final AdsAdCostTypeDto PER_IMPRESSIONS_OPTIMIZED;
    private final int value;

    static {
        AdsAdCostTypeDto adsAdCostTypeDto = new AdsAdCostTypeDto("PER_CLICKS", 0, 0);
        PER_CLICKS = adsAdCostTypeDto;
        AdsAdCostTypeDto adsAdCostTypeDto2 = new AdsAdCostTypeDto("PER_IMPRESSIONS", 1, 1);
        PER_IMPRESSIONS = adsAdCostTypeDto2;
        AdsAdCostTypeDto adsAdCostTypeDto3 = new AdsAdCostTypeDto("PER_ACTIONS", 2, 2);
        PER_ACTIONS = adsAdCostTypeDto3;
        AdsAdCostTypeDto adsAdCostTypeDto4 = new AdsAdCostTypeDto("PER_IMPRESSIONS_OPTIMIZED", 3, 3);
        PER_IMPRESSIONS_OPTIMIZED = adsAdCostTypeDto4;
        AdsAdCostTypeDto[] adsAdCostTypeDtoArr = {adsAdCostTypeDto, adsAdCostTypeDto2, adsAdCostTypeDto3, adsAdCostTypeDto4};
        $VALUES = adsAdCostTypeDtoArr;
        $ENTRIES = new asp(adsAdCostTypeDtoArr);
    }

    private AdsAdCostTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AdsAdCostTypeDto valueOf(String str) {
        return (AdsAdCostTypeDto) Enum.valueOf(AdsAdCostTypeDto.class, str);
    }

    public static AdsAdCostTypeDto[] values() {
        return (AdsAdCostTypeDto[]) $VALUES.clone();
    }
}
