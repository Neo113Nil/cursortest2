package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeActionButtonClick implements SchemeStat$TypeClick.b {

    @pmi0("action_button_goal_id")
    private final Long actionButtonGoalId;

    @pmi0("action_button_level_id")
    private final Long actionButtonLevelId;

    @pmi0("action_button_type")
    private final CommonFeedStat$TypeActionButtonTypeItem actionButtonType;

    public MobileOfficialAppsFeedStat$TypeActionButtonClick(CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem, Long l, Long l2) {
        this.actionButtonType = commonFeedStat$TypeActionButtonTypeItem;
        this.actionButtonLevelId = l;
        this.actionButtonGoalId = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeActionButtonClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeActionButtonClick mobileOfficialAppsFeedStat$TypeActionButtonClick = (MobileOfficialAppsFeedStat$TypeActionButtonClick) obj;
        return this.actionButtonType == mobileOfficialAppsFeedStat$TypeActionButtonClick.actionButtonType && epx.f(this.actionButtonLevelId, mobileOfficialAppsFeedStat$TypeActionButtonClick.actionButtonLevelId) && epx.f(this.actionButtonGoalId, mobileOfficialAppsFeedStat$TypeActionButtonClick.actionButtonGoalId);
    }

    public final int hashCode() {
        int hashCode = this.actionButtonType.hashCode() * 31;
        Long l = this.actionButtonLevelId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.actionButtonGoalId;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeActionButtonClick(actionButtonType=");
        sb.append(this.actionButtonType);
        sb.append(", actionButtonLevelId=");
        sb.append(this.actionButtonLevelId);
        sb.append(", actionButtonGoalId=");
        return iq.b(sb, this.actionButtonGoalId, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeActionButtonClick(CommonFeedStat$TypeActionButtonTypeItem commonFeedStat$TypeActionButtonTypeItem, Long l, Long l2, int i, zcl zclVar) {
        this(commonFeedStat$TypeActionButtonTypeItem, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
    }
}
