package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block_id")
    private final String blockId;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem) && epx.f(this.blockId, ((MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem) obj).blockId);
    }

    public final int hashCode() {
        String str = this.blockId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeMarketplaceMarketClickItem(blockId="), this.blockId, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem(String str) {
        this.blockId = str;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
