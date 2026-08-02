package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("block_reason")
    private final MobileOfficialAppsMarketStat$TypeBlockReason blockReason;

    @pmi0("video_id")
    private final Integer videoId;

    @pmi0("video_owner_id")
    private final Long videoOwnerId;

    public MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems = (MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems) obj;
        return this.blockReason == mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems.blockReason && epx.f(this.videoOwnerId, mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems.videoOwnerId) && epx.f(this.videoId, mobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems.videoId);
    }

    public final int hashCode() {
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason = this.blockReason;
        int hashCode = (mobileOfficialAppsMarketStat$TypeBlockReason == null ? 0 : mobileOfficialAppsMarketStat$TypeBlockReason.hashCode()) * 31;
        Long l = this.videoOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.videoId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketCarouselClickShowAllItems(blockReason=");
        sb.append(this.blockReason);
        sb.append(", videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", videoId=");
        return uqi.b(sb, this.videoId, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems(MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason, Long l, Integer num) {
        this.blockReason = mobileOfficialAppsMarketStat$TypeBlockReason;
        this.videoOwnerId = l;
        this.videoId = num;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketCarouselClickShowAllItems(MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason, Long l, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsMarketStat$TypeBlockReason, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num);
    }
}
