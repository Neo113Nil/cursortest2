package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block_reason")
    private final MobileOfficialAppsMarketStat$TypeBlockReason blockReason;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem) && this.blockReason == ((MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem) obj).blockReason;
    }

    public final int hashCode() {
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason = this.blockReason;
        if (mobileOfficialAppsMarketStat$TypeBlockReason == null) {
            return 0;
        }
        return mobileOfficialAppsMarketStat$TypeBlockReason.hashCode();
    }

    public final String toString() {
        return "TypeMarketHideCollectionItem(blockReason=" + this.blockReason + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem(MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason) {
        this.blockReason = mobileOfficialAppsMarketStat$TypeBlockReason;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketHideCollectionItem(MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsMarketStat$TypeBlockReason);
    }
}
