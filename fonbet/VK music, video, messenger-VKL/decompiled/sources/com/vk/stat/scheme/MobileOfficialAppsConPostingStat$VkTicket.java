package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$VkTicket {

    @pmi0("event_id")
    private final CommonStat$TypeTrackCodeItem eventId;

    @pmi0("seance_id")
    private final CommonStat$TypeTrackCodeItem seanceId;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$VkTicket() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$VkTicket)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket = (MobileOfficialAppsConPostingStat$VkTicket) obj;
        return epx.f(this.eventId, mobileOfficialAppsConPostingStat$VkTicket.eventId) && epx.f(this.seanceId, mobileOfficialAppsConPostingStat$VkTicket.seanceId);
    }

    public final int hashCode() {
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.eventId;
        int hashCode = (commonStat$TypeTrackCodeItem == null ? 0 : commonStat$TypeTrackCodeItem.a.hashCode()) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem2 = this.seanceId;
        return hashCode + (commonStat$TypeTrackCodeItem2 != null ? commonStat$TypeTrackCodeItem2.a.hashCode() : 0);
    }

    public final String toString() {
        return "VkTicket(eventId=" + this.eventId + ", seanceId=" + this.seanceId + ')';
    }

    public MobileOfficialAppsConPostingStat$VkTicket(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem2) {
        this.eventId = commonStat$TypeTrackCodeItem;
        this.seanceId = commonStat$TypeTrackCodeItem2;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$VkTicket(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonStat$TypeTrackCodeItem, (i & 2) != 0 ? null : commonStat$TypeTrackCodeItem2);
    }
}
