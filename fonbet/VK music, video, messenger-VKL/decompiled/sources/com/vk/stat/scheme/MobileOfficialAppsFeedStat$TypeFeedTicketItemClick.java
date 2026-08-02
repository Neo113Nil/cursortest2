package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedTicketItemClick implements SchemeStat$TypeClick.b {

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    @pmi0("ticket")
    private final MobileOfficialAppsConPostingStat$VkTicket ticket;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("pin")
        public static final EntryPoint PIN;

        static {
            EntryPoint entryPoint = new EntryPoint("PIN", 0);
            PIN = entryPoint;
            EntryPoint[] entryPointArr = {entryPoint};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        private EntryPoint(String str, int i) {
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedTicketItemClick(EntryPoint entryPoint, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket) {
        this.entryPoint = entryPoint;
        this.ticket = mobileOfficialAppsConPostingStat$VkTicket;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedTicketItemClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedTicketItemClick mobileOfficialAppsFeedStat$TypeFeedTicketItemClick = (MobileOfficialAppsFeedStat$TypeFeedTicketItemClick) obj;
        return this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedTicketItemClick.entryPoint && epx.f(this.ticket, mobileOfficialAppsFeedStat$TypeFeedTicketItemClick.ticket);
    }

    public final int hashCode() {
        int hashCode = this.entryPoint.hashCode() * 31;
        MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket = this.ticket;
        return hashCode + (mobileOfficialAppsConPostingStat$VkTicket == null ? 0 : mobileOfficialAppsConPostingStat$VkTicket.hashCode());
    }

    public final String toString() {
        return "TypeFeedTicketItemClick(entryPoint=" + this.entryPoint + ", ticket=" + this.ticket + ')';
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedTicketItemClick(EntryPoint entryPoint, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket, int i, zcl zclVar) {
        this(entryPoint, (i & 2) != 0 ? null : mobileOfficialAppsConPostingStat$VkTicket);
    }
}
