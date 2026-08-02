package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketHideItemItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block_reason")
    private final MobileOfficialAppsMarketStat$TypeBlockReason blockReason;

    @pmi0("item_idx")
    private final Integer itemIdx;

    @pmi0("track_code")
    private final String trackCode;

    public MobileOfficialAppsMarketStat$TypeMarketHideItemItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketHideItemItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketHideItemItem mobileOfficialAppsMarketStat$TypeMarketHideItemItem = (MobileOfficialAppsMarketStat$TypeMarketHideItemItem) obj;
        return epx.f(this.itemIdx, mobileOfficialAppsMarketStat$TypeMarketHideItemItem.itemIdx) && epx.f(this.trackCode, mobileOfficialAppsMarketStat$TypeMarketHideItemItem.trackCode) && this.blockReason == mobileOfficialAppsMarketStat$TypeMarketHideItemItem.blockReason;
    }

    public final int hashCode() {
        Integer num = this.itemIdx;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.trackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason = this.blockReason;
        return hashCode2 + (mobileOfficialAppsMarketStat$TypeBlockReason != null ? mobileOfficialAppsMarketStat$TypeBlockReason.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketHideItemItem(itemIdx=" + this.itemIdx + ", trackCode=" + this.trackCode + ", blockReason=" + this.blockReason + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketHideItemItem(Integer num, String str, MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason) {
        this.itemIdx = num;
        this.trackCode = str;
        this.blockReason = mobileOfficialAppsMarketStat$TypeBlockReason;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketHideItemItem(Integer num, String str, MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : mobileOfficialAppsMarketStat$TypeBlockReason);
    }
}
