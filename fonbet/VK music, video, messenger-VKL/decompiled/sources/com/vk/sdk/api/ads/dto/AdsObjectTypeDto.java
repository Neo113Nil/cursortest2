package com.vk.sdk.api.ads.dto;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsObjectTypeDto.kt */
/* loaded from: classes5.dex */
public final class AdsObjectTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsObjectTypeDto[] $VALUES;

    @pmi0("ad")
    public static final AdsObjectTypeDto AD;

    @pmi0(MBInterstitialActivity.INTENT_CAMAPIGN)
    public static final AdsObjectTypeDto CAMPAIGN;

    @pmi0("client")
    public static final AdsObjectTypeDto CLIENT;

    @pmi0("office")
    public static final AdsObjectTypeDto OFFICE;
    private final String value;

    static {
        AdsObjectTypeDto adsObjectTypeDto = new AdsObjectTypeDto("AD", 0, "ad");
        AD = adsObjectTypeDto;
        AdsObjectTypeDto adsObjectTypeDto2 = new AdsObjectTypeDto("CAMPAIGN", 1, MBInterstitialActivity.INTENT_CAMAPIGN);
        CAMPAIGN = adsObjectTypeDto2;
        AdsObjectTypeDto adsObjectTypeDto3 = new AdsObjectTypeDto("CLIENT", 2, "client");
        CLIENT = adsObjectTypeDto3;
        AdsObjectTypeDto adsObjectTypeDto4 = new AdsObjectTypeDto("OFFICE", 3, "office");
        OFFICE = adsObjectTypeDto4;
        AdsObjectTypeDto[] adsObjectTypeDtoArr = {adsObjectTypeDto, adsObjectTypeDto2, adsObjectTypeDto3, adsObjectTypeDto4};
        $VALUES = adsObjectTypeDtoArr;
        $ENTRIES = new asp(adsObjectTypeDtoArr);
    }

    private AdsObjectTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsObjectTypeDto valueOf(String str) {
        return (AdsObjectTypeDto) Enum.valueOf(AdsObjectTypeDto.class, str);
    }

    public static AdsObjectTypeDto[] values() {
        return (AdsObjectTypeDto[]) $VALUES.clone();
    }
}
