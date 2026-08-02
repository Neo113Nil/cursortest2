package com.vk.sdk.api.ads.dto;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetStatisticsIdsTypeDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetStatisticsIdsTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetStatisticsIdsTypeDto[] $VALUES;

    @pmi0("ad")
    public static final AdsGetStatisticsIdsTypeDto AD;

    @pmi0(MBInterstitialActivity.INTENT_CAMAPIGN)
    public static final AdsGetStatisticsIdsTypeDto CAMPAIGN;

    @pmi0("client")
    public static final AdsGetStatisticsIdsTypeDto CLIENT;

    @pmi0("office")
    public static final AdsGetStatisticsIdsTypeDto OFFICE;
    private final String value;

    static {
        AdsGetStatisticsIdsTypeDto adsGetStatisticsIdsTypeDto = new AdsGetStatisticsIdsTypeDto("AD", 0, "ad");
        AD = adsGetStatisticsIdsTypeDto;
        AdsGetStatisticsIdsTypeDto adsGetStatisticsIdsTypeDto2 = new AdsGetStatisticsIdsTypeDto("CAMPAIGN", 1, MBInterstitialActivity.INTENT_CAMAPIGN);
        CAMPAIGN = adsGetStatisticsIdsTypeDto2;
        AdsGetStatisticsIdsTypeDto adsGetStatisticsIdsTypeDto3 = new AdsGetStatisticsIdsTypeDto("CLIENT", 2, "client");
        CLIENT = adsGetStatisticsIdsTypeDto3;
        AdsGetStatisticsIdsTypeDto adsGetStatisticsIdsTypeDto4 = new AdsGetStatisticsIdsTypeDto("OFFICE", 3, "office");
        OFFICE = adsGetStatisticsIdsTypeDto4;
        AdsGetStatisticsIdsTypeDto[] adsGetStatisticsIdsTypeDtoArr = {adsGetStatisticsIdsTypeDto, adsGetStatisticsIdsTypeDto2, adsGetStatisticsIdsTypeDto3, adsGetStatisticsIdsTypeDto4};
        $VALUES = adsGetStatisticsIdsTypeDtoArr;
        $ENTRIES = new asp(adsGetStatisticsIdsTypeDtoArr);
    }

    private AdsGetStatisticsIdsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsGetStatisticsIdsTypeDto valueOf(String str) {
        return (AdsGetStatisticsIdsTypeDto) Enum.valueOf(AdsGetStatisticsIdsTypeDto.class, str);
    }

    public static AdsGetStatisticsIdsTypeDto[] values() {
        return (AdsGetStatisticsIdsTypeDto[]) $VALUES.clone();
    }
}
