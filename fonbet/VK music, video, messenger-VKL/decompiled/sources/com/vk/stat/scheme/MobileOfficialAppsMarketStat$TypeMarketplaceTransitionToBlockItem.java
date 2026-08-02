package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceBlock block;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem) && epx.f(this.block, ((MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem) obj).block);
    }

    public final int hashCode() {
        MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock = this.block;
        if (mobileOfficialAppsMarketStat$TypeMarketplaceBlock == null) {
            return 0;
        }
        return mobileOfficialAppsMarketStat$TypeMarketplaceBlock.hashCode();
    }

    public final String toString() {
        return "TypeMarketplaceTransitionToBlockItem(block=" + this.block + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem(MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock) {
        this.block = mobileOfficialAppsMarketStat$TypeMarketplaceBlock;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem(MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceBlock);
    }
}
