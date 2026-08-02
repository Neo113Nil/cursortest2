package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip {

    @pmi0("common_ad_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonAdInfo;

    @pmi0("common_creative_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonCreativeInfo;

    @pmi0("player_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo playerInfo;

    public CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip = (CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip) obj;
        return epx.f(this.commonCreativeInfo, commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip.commonCreativeInfo) && epx.f(this.commonAdInfo, commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip.commonAdInfo) && epx.f(this.playerInfo, commonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip.playerInfo);
    }

    public final int hashCode() {
        CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo = this.commonCreativeInfo;
        int hashCode = (commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.hashCode()) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo = this.commonAdInfo;
        int hashCode2 = (hashCode + (commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo = this.playerInfo;
        return hashCode2 + (commonVideoVitrinaTvStat$VitrinaTvPlayerInfo != null ? commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.hashCode() : 0);
    }

    public final String toString() {
        return "VitrinaTvAdCreativeSkip(commonCreativeInfo=" + this.commonCreativeInfo + ", commonAdInfo=" + this.commonAdInfo + ", playerInfo=" + this.playerInfo + ')';
    }

    public CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip(CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo, CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo) {
        this.commonCreativeInfo = commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo;
        this.commonAdInfo = commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo;
        this.playerInfo = commonVideoVitrinaTvStat$VitrinaTvPlayerInfo;
    }

    public /* synthetic */ CommonVideoVitrinaTvStat$VitrinaTvAdCreativeSkip(CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo, CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo, (i & 2) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, (i & 4) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvPlayerInfo);
    }
}
