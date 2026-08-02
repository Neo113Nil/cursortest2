package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeSmbYclientsStoryAddStickerItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("service_id_list")
    private final List<Integer> serviceIdList;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeSmbYclientsStoryAddStickerItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeSmbYclientsStoryAddStickerItem)) {
            return false;
        }
        CommonMarketStat$TypeSmbYclientsStoryAddStickerItem commonMarketStat$TypeSmbYclientsStoryAddStickerItem = (CommonMarketStat$TypeSmbYclientsStoryAddStickerItem) obj;
        return epx.f(this.ownerId, commonMarketStat$TypeSmbYclientsStoryAddStickerItem.ownerId) && epx.f(this.serviceIdList, commonMarketStat$TypeSmbYclientsStoryAddStickerItem.serviceIdList);
    }

    public final int hashCode() {
        Long l = this.ownerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<Integer> list = this.serviceIdList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSmbYclientsStoryAddStickerItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", serviceIdList=");
        return ms9.a(')', sb, this.serviceIdList);
    }

    public CommonMarketStat$TypeSmbYclientsStoryAddStickerItem(Long l, List<Integer> list) {
        this.ownerId = l;
        this.serviceIdList = list;
    }

    public /* synthetic */ CommonMarketStat$TypeSmbYclientsStoryAddStickerItem(Long l, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : list);
    }
}
