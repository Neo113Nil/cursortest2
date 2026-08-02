package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoAdultMarkNotificationView implements SchemeStat$TypeView.b {

    @pmi0("block_type")
    private final CommonVideoStat$AgeMarkNotificationBlockType blockType;

    @pmi0("event_type")
    private final String eventType;

    @pmi0("group_id")
    private final long groupId;

    public CommonVideoStat$TypeVideoAdultMarkNotificationView(String str, CommonVideoStat$AgeMarkNotificationBlockType commonVideoStat$AgeMarkNotificationBlockType, long j) {
        this.eventType = str;
        this.blockType = commonVideoStat$AgeMarkNotificationBlockType;
        this.groupId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAdultMarkNotificationView)) {
            return false;
        }
        CommonVideoStat$TypeVideoAdultMarkNotificationView commonVideoStat$TypeVideoAdultMarkNotificationView = (CommonVideoStat$TypeVideoAdultMarkNotificationView) obj;
        return epx.f(this.eventType, commonVideoStat$TypeVideoAdultMarkNotificationView.eventType) && this.blockType == commonVideoStat$TypeVideoAdultMarkNotificationView.blockType && this.groupId == commonVideoStat$TypeVideoAdultMarkNotificationView.groupId;
    }

    public final int hashCode() {
        return Long.hashCode(this.groupId) + ((this.blockType.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoAdultMarkNotificationView(eventType=");
        sb.append(this.eventType);
        sb.append(", blockType=");
        sb.append(this.blockType);
        sb.append(", groupId=");
        return vu5.a(')', this.groupId, sb);
    }

    public /* synthetic */ CommonVideoStat$TypeVideoAdultMarkNotificationView(String str, CommonVideoStat$AgeMarkNotificationBlockType commonVideoStat$AgeMarkNotificationBlockType, long j, int i, zcl zclVar) {
        this((i & 1) != 0 ? "adult_mark_notification_view" : str, commonVideoStat$AgeMarkNotificationBlockType, j);
    }
}
