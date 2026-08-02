package com.vk.sdk.api.ads.dto;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetPostsReachIdsTypeDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetPostsReachIdsTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetPostsReachIdsTypeDto[] $VALUES;

    @pmi0("ad")
    public static final AdsGetPostsReachIdsTypeDto AD;

    @pmi0(MBInterstitialActivity.INTENT_CAMAPIGN)
    public static final AdsGetPostsReachIdsTypeDto CAMPAIGN;
    private final String value;

    static {
        AdsGetPostsReachIdsTypeDto adsGetPostsReachIdsTypeDto = new AdsGetPostsReachIdsTypeDto("AD", 0, "ad");
        AD = adsGetPostsReachIdsTypeDto;
        AdsGetPostsReachIdsTypeDto adsGetPostsReachIdsTypeDto2 = new AdsGetPostsReachIdsTypeDto("CAMPAIGN", 1, MBInterstitialActivity.INTENT_CAMAPIGN);
        CAMPAIGN = adsGetPostsReachIdsTypeDto2;
        AdsGetPostsReachIdsTypeDto[] adsGetPostsReachIdsTypeDtoArr = {adsGetPostsReachIdsTypeDto, adsGetPostsReachIdsTypeDto2};
        $VALUES = adsGetPostsReachIdsTypeDtoArr;
        $ENTRIES = new asp(adsGetPostsReachIdsTypeDtoArr);
    }

    private AdsGetPostsReachIdsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsGetPostsReachIdsTypeDto valueOf(String str) {
        return (AdsGetPostsReachIdsTypeDto) Enum.valueOf(AdsGetPostsReachIdsTypeDto.class, str);
    }

    public static AdsGetPostsReachIdsTypeDto[] values() {
        return (AdsGetPostsReachIdsTypeDto[]) $VALUES.clone();
    }
}
