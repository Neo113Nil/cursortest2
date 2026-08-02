package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeClickToAuthorCommunity implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_info")
    private final CommonVideoStat$CommunityClickInfo videoInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_to_author_community")
        public static final EventType CLICK_TO_AUTHOR_COMMUNITY;

        static {
            EventType eventType = new EventType("CLICK_TO_AUTHOR_COMMUNITY", 0);
            CLICK_TO_AUTHOR_COMMUNITY = eventType;
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

    public CommonVideoStat$TypeClickToAuthorCommunity(EventType eventType, CommonVideoStat$CommunityClickInfo commonVideoStat$CommunityClickInfo) {
        this.eventType = eventType;
        this.videoInfo = commonVideoStat$CommunityClickInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeClickToAuthorCommunity)) {
            return false;
        }
        CommonVideoStat$TypeClickToAuthorCommunity commonVideoStat$TypeClickToAuthorCommunity = (CommonVideoStat$TypeClickToAuthorCommunity) obj;
        return this.eventType == commonVideoStat$TypeClickToAuthorCommunity.eventType && epx.f(this.videoInfo, commonVideoStat$TypeClickToAuthorCommunity.videoInfo);
    }

    public final int hashCode() {
        return this.videoInfo.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeClickToAuthorCommunity(eventType=" + this.eventType + ", videoInfo=" + this.videoInfo + ')';
    }
}
