package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick implements SchemeStat$TypeClick.b {

    @pmi0("entry_point")
    private final MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint entryPoint;

    @pmi0("item_owner_id")
    private final Long itemOwnerId;

    public MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick(MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint mobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint, Long l) {
        this.entryPoint = mobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
        this.itemOwnerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick = (MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick) obj;
        return epx.f(this.entryPoint, mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick.entryPoint) && epx.f(this.itemOwnerId, mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick.itemOwnerId);
    }

    public final int hashCode() {
        int hashCode = this.entryPoint.hashCode() * 31;
        Long l = this.itemOwnerId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedOpenGroupClick(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", itemOwnerId=");
        return iq.b(sb, this.itemOwnerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick(MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint mobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint, Long l, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint, (i & 2) != 0 ? null : l);
    }
}
