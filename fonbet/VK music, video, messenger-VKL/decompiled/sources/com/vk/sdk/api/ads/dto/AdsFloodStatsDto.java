package com.vk.sdk.api.ads.dto;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.pmi0;
import xsna.sl9;

/* compiled from: AdsFloodStatsDto.kt */
/* loaded from: classes5.dex */
public final class AdsFloodStatsDto {

    @pmi0(TtmlNode.LEFT)
    private final int left;

    @pmi0(ToolBar.REFRESH)
    private final int refresh;

    public AdsFloodStatsDto(int i, int i2) {
        this.left = i;
        this.refresh = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsFloodStatsDto)) {
            return false;
        }
        AdsFloodStatsDto adsFloodStatsDto = (AdsFloodStatsDto) obj;
        return this.left == adsFloodStatsDto.left && this.refresh == adsFloodStatsDto.refresh;
    }

    public final int hashCode() {
        return Integer.hashCode(this.refresh) + (Integer.hashCode(this.left) * 31);
    }

    public final String toString() {
        return sl9.c(this.left, this.refresh, "AdsFloodStatsDto(left=", ", refresh=", ")");
    }
}
