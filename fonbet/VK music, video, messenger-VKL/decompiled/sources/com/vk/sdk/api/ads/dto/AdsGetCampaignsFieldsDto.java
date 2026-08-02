package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetCampaignsFieldsDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetCampaignsFieldsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetCampaignsFieldsDto[] $VALUES;

    @pmi0("ads_count")
    public static final AdsGetCampaignsFieldsDto ADS_COUNT;
    private final String value;

    static {
        AdsGetCampaignsFieldsDto adsGetCampaignsFieldsDto = new AdsGetCampaignsFieldsDto("ADS_COUNT", 0, "ads_count");
        ADS_COUNT = adsGetCampaignsFieldsDto;
        AdsGetCampaignsFieldsDto[] adsGetCampaignsFieldsDtoArr = {adsGetCampaignsFieldsDto};
        $VALUES = adsGetCampaignsFieldsDtoArr;
        $ENTRIES = new asp(adsGetCampaignsFieldsDtoArr);
    }

    private AdsGetCampaignsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsGetCampaignsFieldsDto valueOf(String str) {
        return (AdsGetCampaignsFieldsDto) Enum.valueOf(AdsGetCampaignsFieldsDto.class, str);
    }

    public static AdsGetCampaignsFieldsDto[] values() {
        return (AdsGetCampaignsFieldsDto[]) $VALUES.clone();
    }
}
