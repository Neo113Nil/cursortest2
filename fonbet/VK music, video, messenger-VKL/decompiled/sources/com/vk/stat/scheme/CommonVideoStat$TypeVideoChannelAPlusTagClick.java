package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoChannelAPlusTagClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("a_plus_tag_click")
        public static final EventType A_PLUS_TAG_CLICK;

        static {
            EventType eventType = new EventType("A_PLUS_TAG_CLICK", 0);
            A_PLUS_TAG_CLICK = eventType;
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

    public CommonVideoStat$TypeVideoChannelAPlusTagClick(EventType eventType, long j) {
        this.eventType = eventType;
        this.videoOwnerId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoChannelAPlusTagClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoChannelAPlusTagClick commonVideoStat$TypeVideoChannelAPlusTagClick = (CommonVideoStat$TypeVideoChannelAPlusTagClick) obj;
        return this.eventType == commonVideoStat$TypeVideoChannelAPlusTagClick.eventType && this.videoOwnerId == commonVideoStat$TypeVideoChannelAPlusTagClick.videoOwnerId;
    }

    public final int hashCode() {
        return Long.hashCode(this.videoOwnerId) + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoChannelAPlusTagClick(eventType=");
        sb.append(this.eventType);
        sb.append(", videoOwnerId=");
        return vu5.a(')', this.videoOwnerId, sb);
    }
}
