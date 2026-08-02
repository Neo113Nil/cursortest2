package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("owner_id")
    private final long ownerId;

    public CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem(long j) {
        this.ownerId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem) && this.ownerId == ((CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem) obj).ownerId;
    }

    public final int hashCode() {
        return Long.hashCode(this.ownerId);
    }

    public final String toString() {
        return vu5.a(')', this.ownerId, new StringBuilder("TypeMarketplaceTransitionToCheckoutClickItem(ownerId="));
    }
}
