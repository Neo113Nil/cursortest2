package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeDonutGoal implements SchemeStat$TypeAction.b, SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("goal_id")
    private final Integer goalId;

    @pmi0("owner_id")
    private final long ownerId;

    public CommonCommunitiesStat$TypeDonutGoal(long j, Integer num) {
        this.ownerId = j;
        this.goalId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeDonutGoal)) {
            return false;
        }
        CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal = (CommonCommunitiesStat$TypeDonutGoal) obj;
        return this.ownerId == commonCommunitiesStat$TypeDonutGoal.ownerId && epx.f(this.goalId, commonCommunitiesStat$TypeDonutGoal.goalId);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        Integer num = this.goalId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeDonutGoal(ownerId=");
        sb.append(this.ownerId);
        sb.append(", goalId=");
        return uqi.b(sb, this.goalId, ')');
    }

    public /* synthetic */ CommonCommunitiesStat$TypeDonutGoal(long j, Integer num, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : num);
    }
}
