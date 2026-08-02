package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin implements SchemeStat$TypeAction.b {

    @pmi0("entry_point")
    private final SchemeStat$FeedPinEntryPoint entryPoint;

    @pmi0("ticket")
    private final MobileOfficialAppsConPostingStat$VkTicket ticket;

    @pmi0("video_track_code")
    private final String videoTrackCode;

    public MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin = (MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin) obj;
        return this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin.entryPoint && epx.f(this.videoTrackCode, mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin.videoTrackCode) && epx.f(this.ticket, mobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin.ticket);
    }

    public final int hashCode() {
        SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint = this.entryPoint;
        int hashCode = (schemeStat$FeedPinEntryPoint == null ? 0 : schemeStat$FeedPinEntryPoint.hashCode()) * 31;
        String str = this.videoTrackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket = this.ticket;
        return hashCode2 + (mobileOfficialAppsConPostingStat$VkTicket != null ? mobileOfficialAppsConPostingStat$VkTicket.hashCode() : 0);
    }

    public final String toString() {
        return "TypeFeedShowTicketItemPin(entryPoint=" + this.entryPoint + ", videoTrackCode=" + this.videoTrackCode + ", ticket=" + this.ticket + ')';
    }

    public MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin(SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, String str, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket) {
        this.entryPoint = schemeStat$FeedPinEntryPoint;
        this.videoTrackCode = str;
        this.ticket = mobileOfficialAppsConPostingStat$VkTicket;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedShowTicketItemPin(SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint, String str, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : schemeStat$FeedPinEntryPoint, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : mobileOfficialAppsConPostingStat$VkTicket);
    }
}
