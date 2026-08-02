package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedUnfollowClick implements SchemeStat$TypeClick.b {

    @pmi0("entry_point")
    private final MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint entryPoint;

    @pmi0("target_coowner_id")
    private final Long targetCoownerId;

    public MobileOfficialAppsFeedStat$TypeFeedUnfollowClick(MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint mobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint, Long l) {
        this.entryPoint = mobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
        this.targetCoownerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedUnfollowClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedUnfollowClick mobileOfficialAppsFeedStat$TypeFeedUnfollowClick = (MobileOfficialAppsFeedStat$TypeFeedUnfollowClick) obj;
        return epx.f(this.entryPoint, mobileOfficialAppsFeedStat$TypeFeedUnfollowClick.entryPoint) && epx.f(this.targetCoownerId, mobileOfficialAppsFeedStat$TypeFeedUnfollowClick.targetCoownerId);
    }

    public final int hashCode() {
        int hashCode = this.entryPoint.hashCode() * 31;
        Long l = this.targetCoownerId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedUnfollowClick(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", targetCoownerId=");
        return iq.b(sb, this.targetCoownerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedUnfollowClick(MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint mobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint, Long l, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint, (i & 2) != 0 ? null : l);
    }
}
