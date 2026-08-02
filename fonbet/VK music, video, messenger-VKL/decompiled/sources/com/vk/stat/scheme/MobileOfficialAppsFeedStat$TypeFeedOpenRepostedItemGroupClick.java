package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick implements SchemeStat$TypeClick.b {

    @pmi0("entry_point")
    private final MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint entryPoint;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("item_owner_id")
    private final long itemOwnerId;

    public MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick(MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint mobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint, long j, int i) {
        this.entryPoint = mobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
        this.itemOwnerId = j;
        this.itemId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick = (MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick) obj;
        return epx.f(this.entryPoint, mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick.entryPoint) && this.itemOwnerId == mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick.itemOwnerId && this.itemId == mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick.itemId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.itemId) + bh10.a(this.entryPoint.hashCode() * 31, 31, this.itemOwnerId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedOpenRepostedItemGroupClick(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", itemOwnerId=");
        sb.append(this.itemOwnerId);
        sb.append(", itemId=");
        return vu5.b(sb, this.itemId, ')');
    }
}
