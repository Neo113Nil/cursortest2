package com.vk.sdk.api.ads.dto;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetDemographicsIdsTypeDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetDemographicsIdsTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetDemographicsIdsTypeDto[] $VALUES;

    @pmi0("ad")
    public static final AdsGetDemographicsIdsTypeDto AD;

    @pmi0(MBInterstitialActivity.INTENT_CAMAPIGN)
    public static final AdsGetDemographicsIdsTypeDto CAMPAIGN;
    private final String value;

    static {
        AdsGetDemographicsIdsTypeDto adsGetDemographicsIdsTypeDto = new AdsGetDemographicsIdsTypeDto("AD", 0, "ad");
        AD = adsGetDemographicsIdsTypeDto;
        AdsGetDemographicsIdsTypeDto adsGetDemographicsIdsTypeDto2 = new AdsGetDemographicsIdsTypeDto("CAMPAIGN", 1, MBInterstitialActivity.INTENT_CAMAPIGN);
        CAMPAIGN = adsGetDemographicsIdsTypeDto2;
        AdsGetDemographicsIdsTypeDto[] adsGetDemographicsIdsTypeDtoArr = {adsGetDemographicsIdsTypeDto, adsGetDemographicsIdsTypeDto2};
        $VALUES = adsGetDemographicsIdsTypeDtoArr;
        $ENTRIES = new asp(adsGetDemographicsIdsTypeDtoArr);
    }

    private AdsGetDemographicsIdsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsGetDemographicsIdsTypeDto valueOf(String str) {
        return (AdsGetDemographicsIdsTypeDto) Enum.valueOf(AdsGetDemographicsIdsTypeDto.class, str);
    }

    public static AdsGetDemographicsIdsTypeDto[] values() {
        return (AdsGetDemographicsIdsTypeDto[]) $VALUES.clone();
    }
}
