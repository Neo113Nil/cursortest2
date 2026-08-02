package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block_reason")
    private final MobileOfficialAppsMarketStat$TypeBlockReason blockReason;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem) && this.blockReason == ((MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem) obj).blockReason;
    }

    public final int hashCode() {
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason = this.blockReason;
        if (mobileOfficialAppsMarketStat$TypeBlockReason == null) {
            return 0;
        }
        return mobileOfficialAppsMarketStat$TypeBlockReason.hashCode();
    }

    public final String toString() {
        return "TypeMarketTransitionToCollectionItem(blockReason=" + this.blockReason + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem(MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason) {
        this.blockReason = mobileOfficialAppsMarketStat$TypeBlockReason;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketTransitionToCollectionItem(MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsMarketStat$TypeBlockReason);
    }
}
