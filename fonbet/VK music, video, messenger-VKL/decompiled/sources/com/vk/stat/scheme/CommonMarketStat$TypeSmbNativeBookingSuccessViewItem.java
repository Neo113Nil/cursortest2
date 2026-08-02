package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeSmbNativeBookingSuccessViewItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("booking_id")
    private final Long bookingId;

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

    public CommonMarketStat$TypeSmbNativeBookingSuccessViewItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeSmbNativeBookingSuccessViewItem)) {
            return false;
        }
        CommonMarketStat$TypeSmbNativeBookingSuccessViewItem commonMarketStat$TypeSmbNativeBookingSuccessViewItem = (CommonMarketStat$TypeSmbNativeBookingSuccessViewItem) obj;
        return epx.f(this.ownerId, commonMarketStat$TypeSmbNativeBookingSuccessViewItem.ownerId) && epx.f(this.salonId, commonMarketStat$TypeSmbNativeBookingSuccessViewItem.salonId) && epx.f(this.bookingId, commonMarketStat$TypeSmbNativeBookingSuccessViewItem.bookingId) && epx.f(this.url, commonMarketStat$TypeSmbNativeBookingSuccessViewItem.url) && this.source == commonMarketStat$TypeSmbNativeBookingSuccessViewItem.source && this.bookingType == commonMarketStat$TypeSmbNativeBookingSuccessViewItem.bookingType;
    }

    public final int hashCode() {
        Long l = this.ownerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.salonId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.bookingId;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.url;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource = this.source;
        int hashCode5 = (hashCode4 + (commonMarketStat$TypeSmbNativeBookingSource == null ? 0 : commonMarketStat$TypeSmbNativeBookingSource.hashCode())) * 31;
        CommonMarketStat$TypeSmbNativeBookingBookingType commonMarketStat$TypeSmbNativeBookingBookingType = this.bookingType;
        return hashCode5 + (commonMarketStat$TypeSmbNativeBookingBookingType != null ? commonMarketStat$TypeSmbNativeBookingBookingType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSmbNativeBookingSuccessViewItem(ownerId=" + this.ownerId + ", salonId=" + this.salonId + ", bookingId=" + this.bookingId + ", url=" + this.url + ", source=" + this.source + ", bookingType=" + this.bookingType + ')';
    }

    public CommonMarketStat$TypeSmbNativeBookingSuccessViewItem(Long l, Long l2, Long l3, String str, CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource, CommonMarketStat$TypeSmbNativeBookingBookingType commonMarketStat$TypeSmbNativeBookingBookingType) {
        this.ownerId = l;
        this.salonId = l2;
        this.bookingId = l3;
        this.url = str;
        this.source = commonMarketStat$TypeSmbNativeBookingSource;
        this.bookingType = commonMarketStat$TypeSmbNativeBookingBookingType;
    }

    public /* synthetic */ CommonMarketStat$TypeSmbNativeBookingSuccessViewItem(Long l, Long l2, Long l3, String str, CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource, CommonMarketStat$TypeSmbNativeBookingBookingType commonMarketStat$TypeSmbNativeBookingBookingType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : commonMarketStat$TypeSmbNativeBookingSource, (i & 32) != 0 ? null : commonMarketStat$TypeSmbNativeBookingBookingType);
    }
}
