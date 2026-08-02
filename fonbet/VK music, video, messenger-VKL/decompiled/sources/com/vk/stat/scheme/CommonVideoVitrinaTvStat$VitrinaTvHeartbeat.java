package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvHeartbeat {

    @pmi0("player_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo playerInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonVideoVitrinaTvStat$VitrinaTvHeartbeat() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonVideoVitrinaTvStat$VitrinaTvHeartbeat) && epx.f(this.playerInfo, ((CommonVideoVitrinaTvStat$VitrinaTvHeartbeat) obj).playerInfo);
    }

    public final int hashCode() {
        CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo = this.playerInfo;
        if (commonVideoVitrinaTvStat$VitrinaTvPlayerInfo == null) {
            return 0;
        }
        return commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.hashCode();
    }

    public final String toString() {
        return "VitrinaTvHeartbeat(playerInfo=" + this.playerInfo + ')';
    }

    public CommonVideoVitrinaTvStat$VitrinaTvHeartbeat(CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo) {
        this.playerInfo = commonVideoVitrinaTvStat$VitrinaTvPlayerInfo;
    }

    public /* synthetic */ CommonVideoVitrinaTvStat$VitrinaTvHeartbeat(CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvPlayerInfo);
    }
}
