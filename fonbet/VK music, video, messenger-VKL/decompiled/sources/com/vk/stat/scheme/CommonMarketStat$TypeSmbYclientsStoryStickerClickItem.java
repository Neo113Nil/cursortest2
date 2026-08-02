package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeSmbYclientsStoryStickerClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("owner_id")
    private final Long ownerId;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeSmbYclientsStoryStickerClickItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonMarketStat$TypeSmbYclientsStoryStickerClickItem) && epx.f(this.ownerId, ((CommonMarketStat$TypeSmbYclientsStoryStickerClickItem) obj).ownerId);
    }

    public final int hashCode() {
        Long l = this.ownerId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return iq.b(new StringBuilder("TypeSmbYclientsStoryStickerClickItem(ownerId="), this.ownerId, ')');
    }

    public CommonMarketStat$TypeSmbYclientsStoryStickerClickItem(Long l) {
        this.ownerId = l;
    }

    public /* synthetic */ CommonMarketStat$TypeSmbYclientsStoryStickerClickItem(Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l);
    }
}
