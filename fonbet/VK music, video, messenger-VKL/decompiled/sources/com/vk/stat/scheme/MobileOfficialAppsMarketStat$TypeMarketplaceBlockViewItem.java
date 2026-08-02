package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("block")
    private final MobileOfficialAppsMarketStat$TypeMarketplaceBlock block;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem) && epx.f(this.block, ((MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem) obj).block);
    }

    public final int hashCode() {
        MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock = this.block;
        if (mobileOfficialAppsMarketStat$TypeMarketplaceBlock == null) {
            return 0;
        }
        return mobileOfficialAppsMarketStat$TypeMarketplaceBlock.hashCode();
    }

    public final String toString() {
        return "TypeMarketplaceBlockViewItem(block=" + this.block + ')';
    }

    public MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem(MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock) {
        this.block = mobileOfficialAppsMarketStat$TypeMarketplaceBlock;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem(MobileOfficialAppsMarketStat$TypeMarketplaceBlock mobileOfficialAppsMarketStat$TypeMarketplaceBlock, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketplaceBlock);
    }
}
