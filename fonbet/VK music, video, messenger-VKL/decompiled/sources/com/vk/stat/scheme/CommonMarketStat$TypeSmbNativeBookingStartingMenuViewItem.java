package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("booking_type")
    private final CommonMarketStat$TypeSmbNativeBookingBookingType bookingType;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("salon_id")
    private final Long salonId;

    @pmi0("source")
    private final CommonMarketStat$TypeSmbNativeBookingSource source;

    @pmi0("url")
    private final String url;

    public CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem)) {
            return false;
        }
        CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem = (CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem) obj;
        return epx.f(this.ownerId, commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem.ownerId) && epx.f(this.salonId, commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem.salonId) && epx.f(this.url, commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem.url) && this.source == commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem.source && this.bookingType == commonMarketStat$TypeSmbNativeBookingStartingMenuViewItem.bookingType;
    }

    public final int hashCode() {
        Long l = this.ownerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.salonId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource = this.source;
        int hashCode4 = (hashCode3 + (commonMarketStat$TypeSmbNativeBookingSource == null ? 0 : commonMarketStat$TypeSmbNativeBookingSource.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingBookingType commonMarketStat$TypeSmbNativeBookingBookingType = this.bookingType;
        return hashCode4 + (commonMarketStat$TypeSmbNativeBookingBookingType != null ? commonMarketStat$TypeSmbNativeBookingBookingType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSmbNativeBookingStartingMenuViewItem(ownerId=" + this.ownerId + ", salonId=" + this.salonId + ", url=" + this.url + ", source=" + this.source + ", bookingType=" + this.bookingType + ')';
    }

    public CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem(Long l, Long l2, String str, CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource, CommonMarketStat$TypeSmbNativeBookingBookingType commonMarketStat$TypeSmbNativeBookingBookingType) {
        this.ownerId = l;
        this.salonId = l2;
        this.url = str;
        this.source = commonMarketStat$TypeSmbNativeBookingSource;
        this.bookingType = commonMarketStat$TypeSmbNativeBookingBookingType;
    }

    public /* synthetic */ CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem(Long l, Long l2, String str, CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource, CommonMarketStat$TypeSmbNativeBookingBookingType commonMarketStat$TypeSmbNativeBookingBookingType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : commonMarketStat$TypeSmbNativeBookingSource, (i & 16) != 0 ? null : commonMarketStat$TypeSmbNativeBookingBookingType);
    }
}
