package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoOtherChannelsStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock implements SchemeStat$TypeAction.b {

    @pmi0("event_source")
    private final EventSource eventSource;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoOtherChannelsStat.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final EventSource CLOSE;

        @pmi0("inactive_visit")
        public static final EventSource INACTIVE_VISIT;

        @pmi0("subscription")
        public static final EventSource SUBSCRIPTION;

        static {
            EventSource eventSource = new EventSource("SUBSCRIPTION", 0);
            SUBSCRIPTION = eventSource;
            EventSource eventSource2 = new EventSource("INACTIVE_VISIT", 1);
            INACTIVE_VISIT = eventSource2;
            EventSource eventSource3 = new EventSource("CLOSE", 2);
            CLOSE = eventSource3;
            EventSource[] eventSourceArr = {eventSource, eventSource2, eventSource3};
            $VALUES = eventSourceArr;
            $ENTRIES = new asp(eventSourceArr);
        }

        private EventSource(String str, int i) {
        }

        public static EventSource valueOf(String str) {
            return (EventSource) Enum.valueOf(EventSource.class, str);
        }

        public static EventSource[] values() {
            return (EventSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoOtherChannelsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("similar_channels_close")
        public static final EventType SIMILAR_CHANNELS_CLOSE;

        @pmi0("similar_channels_show")
        public static final EventType SIMILAR_CHANNELS_SHOW;

        static {
            EventType eventType = new EventType("SIMILAR_CHANNELS_SHOW", 0);
            SIMILAR_CHANNELS_SHOW = eventType;
            EventType eventType2 = new EventType("SIMILAR_CHANNELS_CLOSE", 1);
            SIMILAR_CHANNELS_CLOSE = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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

    public CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock(EventType eventType, EventSource eventSource) {
        this.eventType = eventType;
        this.eventSource = eventSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock)) {
            return false;
        }
        CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock commonVideoOtherChannelsStat$TypeSimilarChannelsBlock = (CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock) obj;
        return this.eventType == commonVideoOtherChannelsStat$TypeSimilarChannelsBlock.eventType && this.eventSource == commonVideoOtherChannelsStat$TypeSimilarChannelsBlock.eventSource;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSource eventSource = this.eventSource;
        return hashCode + (eventSource == null ? 0 : eventSource.hashCode());
    }

    public final String toString() {
        return "TypeSimilarChannelsBlock(eventType=" + this.eventType + ", eventSource=" + this.eventSource + ')';
    }

    public /* synthetic */ CommonVideoOtherChannelsStat$TypeSimilarChannelsBlock(EventType eventType, EventSource eventSource, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSource);
    }
}
