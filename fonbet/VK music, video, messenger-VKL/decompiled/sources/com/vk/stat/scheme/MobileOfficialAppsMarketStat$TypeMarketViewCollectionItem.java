package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("block_reason")
    private final MobileOfficialAppsMarketStat$TypeBlockReason blockReason;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem) && this.blockReason == ((MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem) obj).blockReason;
    }

    public final int hashCode() {
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason = this.blockReason;
        if (mobileOfficialAppsMarketStat$TypeBlockReason == null) {
            return 0;
        }
        return mobileOfficialAppsMarketStat$TypeBlockReason.hashCode();
    }

    public final String toString() {
        return "TypeMarketViewCollectionItem(blockReason=" + this.blockReason + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem(MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason) {
        this.blockReason = mobileOfficialAppsMarketStat$TypeBlockReason;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketViewCollectionItem(MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsMarketStat$TypeBlockReason);
    }
}
