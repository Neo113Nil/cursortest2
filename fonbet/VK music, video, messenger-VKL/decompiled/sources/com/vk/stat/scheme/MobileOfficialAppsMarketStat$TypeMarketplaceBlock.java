package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceBlock {

    @pmi0("id")
    private final String id;

    public MobileOfficialAppsMarketStat$TypeMarketplaceBlock(String str) {
        this.id = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceBlock) && epx.f(this.id, ((MobileOfficialAppsMarketStat$TypeMarketplaceBlock) obj).id);
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeMarketplaceBlock(id="), this.id, ')');
    }
}
