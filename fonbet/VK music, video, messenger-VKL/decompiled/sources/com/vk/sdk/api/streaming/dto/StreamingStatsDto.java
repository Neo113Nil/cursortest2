package com.vk.sdk.api.streaming.dto;

import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: StreamingStatsDto.kt */
/* loaded from: classes5.dex */
public final class StreamingStatsDto {

    @pmi0("event_type")
    private final EventTypeDto eventType;

    @pmi0("stats")
    private final List<StreamingStatsPointDto> stats;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StreamingStatsDto.kt */
    public static final class EventTypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventTypeDto[] $VALUES;

        @pmi0("comment")
        public static final EventTypeDto COMMENT;

        @pmi0("post")
        public static final EventTypeDto POST;

        @pmi0("share")
        public static final EventTypeDto SHARE;
        private final String value;

        static {
            EventTypeDto eventTypeDto = new EventTypeDto("POST", 0, "post");
            POST = eventTypeDto;
            EventTypeDto eventTypeDto2 = new EventTypeDto("COMMENT", 1, "comment");
            COMMENT = eventTypeDto2;
            EventTypeDto eventTypeDto3 = new EventTypeDto("SHARE", 2, "share");
            SHARE = eventTypeDto3;
            EventTypeDto[] eventTypeDtoArr = {eventTypeDto, eventTypeDto2, eventTypeDto3};
            $VALUES = eventTypeDtoArr;
            $ENTRIES = new asp(eventTypeDtoArr);
        }

        private EventTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static EventTypeDto valueOf(String str) {
            return (EventTypeDto) Enum.valueOf(EventTypeDto.class, str);
        }

        public static EventTypeDto[] values() {
            return (EventTypeDto[]) $VALUES.clone();
        }
    }

    public StreamingStatsDto(EventTypeDto eventTypeDto, List<StreamingStatsPointDto> list) {
        this.eventType = eventTypeDto;
        this.stats = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamingStatsDto)) {
            return false;
        }
        StreamingStatsDto streamingStatsDto = (StreamingStatsDto) obj;
        return this.eventType == streamingStatsDto.eventType && epx.f(this.stats, streamingStatsDto.stats);
    }

    public final int hashCode() {
        return this.stats.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "StreamingStatsDto(eventType=" + this.eventType + ", stats=" + this.stats + ")";
    }
}
