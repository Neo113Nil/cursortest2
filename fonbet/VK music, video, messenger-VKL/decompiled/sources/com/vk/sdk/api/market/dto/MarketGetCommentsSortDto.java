package com.vk.sdk.api.market.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketGetCommentsSortDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetCommentsSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketGetCommentsSortDto[] $VALUES;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final MarketGetCommentsSortDto NEW_TO_OLD;

    @pmi0("asc")
    public static final MarketGetCommentsSortDto OLD_TO_NEW;
    private final String value;

    static {
        MarketGetCommentsSortDto marketGetCommentsSortDto = new MarketGetCommentsSortDto("OLD_TO_NEW", 0, "asc");
        OLD_TO_NEW = marketGetCommentsSortDto;
        MarketGetCommentsSortDto marketGetCommentsSortDto2 = new MarketGetCommentsSortDto("NEW_TO_OLD", 1, CampaignEx.JSON_KEY_DESC);
        NEW_TO_OLD = marketGetCommentsSortDto2;
        MarketGetCommentsSortDto[] marketGetCommentsSortDtoArr = {marketGetCommentsSortDto, marketGetCommentsSortDto2};
        $VALUES = marketGetCommentsSortDtoArr;
        $ENTRIES = new asp(marketGetCommentsSortDtoArr);
    }

    private MarketGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketGetCommentsSortDto valueOf(String str) {
        return (MarketGetCommentsSortDto) Enum.valueOf(MarketGetCommentsSortDto.class, str);
    }

    public static MarketGetCommentsSortDto[] values() {
        return (MarketGetCommentsSortDto[]) $VALUES.clone();
    }
}
