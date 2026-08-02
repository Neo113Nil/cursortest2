package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoContentWarningModalClick implements SchemeStat$TypeClick.b {

    @pmi0("block_type")
    private final CommonVideoStat$ContentWarningBlockType blockType;

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

        @pmi0("warning_notification_article")
        public static final EventType WARNING_NOTIFICATION_ARTICLE;

        @pmi0("warning_notification_hide")
        public static final EventType WARNING_NOTIFICATION_HIDE;

        @pmi0("warning_notification_leave")
        public static final EventType WARNING_NOTIFICATION_LEAVE;

        static {
            EventType eventType = new EventType("WARNING_NOTIFICATION_LEAVE", 0);
            WARNING_NOTIFICATION_LEAVE = eventType;
            EventType eventType2 = new EventType("WARNING_NOTIFICATION_HIDE", 1);
            WARNING_NOTIFICATION_HIDE = eventType2;
            EventType eventType3 = new EventType("WARNING_NOTIFICATION_ARTICLE", 2);
            WARNING_NOTIFICATION_ARTICLE = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public CommonVideoStat$TypeVideoContentWarningModalClick(EventType eventType, CommonVideoStat$ContentWarningBlockType commonVideoStat$ContentWarningBlockType, long j) {
        this.eventType = eventType;
        this.blockType = commonVideoStat$ContentWarningBlockType;
        this.groupId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoContentWarningModalClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoContentWarningModalClick commonVideoStat$TypeVideoContentWarningModalClick = (CommonVideoStat$TypeVideoContentWarningModalClick) obj;
        return this.eventType == commonVideoStat$TypeVideoContentWarningModalClick.eventType && this.blockType == commonVideoStat$TypeVideoContentWarningModalClick.blockType && this.groupId == commonVideoStat$TypeVideoContentWarningModalClick.groupId;
    }

    public final int hashCode() {
        return Long.hashCode(this.groupId) + ((this.blockType.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoContentWarningModalClick(eventType=");
        sb.append(this.eventType);
        sb.append(", blockType=");
        sb.append(this.blockType);
        sb.append(", groupId=");
        return vu5.a(')', this.groupId, sb);
    }
}
