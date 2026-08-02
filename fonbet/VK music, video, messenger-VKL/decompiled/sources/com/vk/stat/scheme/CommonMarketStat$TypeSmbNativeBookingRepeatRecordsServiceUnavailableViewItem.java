package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("salon_id")
    private final Long salonId;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem)) {
            return false;
        }
        CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = (CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem) obj;
        return epx.f(this.ownerId, commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem.ownerId) && epx.f(this.salonId, commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem.salonId);
    }

    public final int hashCode() {
        Long l = this.ownerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.salonId;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", salonId=");
        return iq.b(sb, this.salonId, ')');
    }

    public CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem(Long l, Long l2) {
        this.ownerId = l;
        this.salonId = l2;
    }

    public /* synthetic */ CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem(Long l, Long l2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
