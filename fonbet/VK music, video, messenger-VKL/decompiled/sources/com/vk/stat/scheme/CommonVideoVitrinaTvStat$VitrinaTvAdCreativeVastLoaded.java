package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded {

    @pmi0("common_ad_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonAdInfo;

    @pmi0("is_nobanner")
    private final boolean isNobanner;

    @pmi0("player_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo playerInfo;

    public CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded(boolean z, CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo, CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo) {
        this.isNobanner = z;
        this.playerInfo = commonVideoVitrinaTvStat$VitrinaTvPlayerInfo;
        this.commonAdInfo = commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded = (CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded) obj;
        return this.isNobanner == commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded.isNobanner && epx.f(this.playerInfo, commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded.playerInfo) && epx.f(this.commonAdInfo, commonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded.commonAdInfo);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isNobanner) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo = this.playerInfo;
        int hashCode2 = (hashCode + (commonVideoVitrinaTvStat$VitrinaTvPlayerInfo == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo = this.commonAdInfo;
        return hashCode2 + (commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo != null ? commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.hashCode() : 0);
    }

    public final String toString() {
        return "VitrinaTvAdCreativeVastLoaded(isNobanner=" + this.isNobanner + ", playerInfo=" + this.playerInfo + ", commonAdInfo=" + this.commonAdInfo + ')';
    }

    public /* synthetic */ CommonVideoVitrinaTvStat$VitrinaTvAdCreativeVastLoaded(boolean z, CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo, CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvPlayerInfo, (i & 4) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo);
    }
}
