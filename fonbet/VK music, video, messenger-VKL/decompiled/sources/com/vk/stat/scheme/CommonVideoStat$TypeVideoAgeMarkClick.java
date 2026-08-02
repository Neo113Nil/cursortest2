package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoAgeMarkClick implements SchemeStat$TypeClick.b {

    @pmi0("block_type")
    private final CommonVideoStat$AgeMarkNotificationBlockType blockType;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("group_id")
    private final long groupId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("adult_mark_info_view")
        public static final EventType ADULT_MARK_INFO_VIEW;

        static {
            EventType eventType = new EventType("ADULT_MARK_INFO_VIEW", 0);
            ADULT_MARK_INFO_VIEW = eventType;
            EventType[] eventTypeArr = {eventType};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public CommonVideoStat$TypeVideoAgeMarkClick(EventType eventType, CommonVideoStat$AgeMarkNotificationBlockType commonVideoStat$AgeMarkNotificationBlockType, long j) {
        this.eventType = eventType;
        this.blockType = commonVideoStat$AgeMarkNotificationBlockType;
        this.groupId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoAgeMarkClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoAgeMarkClick commonVideoStat$TypeVideoAgeMarkClick = (CommonVideoStat$TypeVideoAgeMarkClick) obj;
        return this.eventType == commonVideoStat$TypeVideoAgeMarkClick.eventType && this.blockType == commonVideoStat$TypeVideoAgeMarkClick.blockType && this.groupId == commonVideoStat$TypeVideoAgeMarkClick.groupId;
    }

    public final int hashCode() {
        return Long.hashCode(this.groupId) + ((this.blockType.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoAgeMarkClick(eventType=");
        sb.append(this.eventType);
        sb.append(", blockType=");
        sb.append(this.blockType);
        sb.append(", groupId=");
        return vu5.a(')', this.groupId, sb);
    }
}
