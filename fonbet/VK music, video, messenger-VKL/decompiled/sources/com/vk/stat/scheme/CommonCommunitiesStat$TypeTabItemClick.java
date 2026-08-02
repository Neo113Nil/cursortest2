package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeTabItemClick implements SchemeStat$TypeClick.b {

    @pmi0("content_id")
    private final long contentId;

    @pmi0("content_type")
    private final CommonCommunitiesStat$TypeTabContentType contentType;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("owner_id")
    private final long ownerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_item")
        public static final EventType CLICK_ITEM;

        @pmi0("open")
        public static final EventType OPEN;

        static {
            EventType eventType = new EventType("OPEN", 0);
            OPEN = eventType;
            EventType eventType2 = new EventType("CLICK_ITEM", 1);
            CLICK_ITEM = eventType2;
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

    public CommonCommunitiesStat$TypeTabItemClick(long j, long j2, CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType, EventType eventType) {
        this.ownerId = j;
        this.contentId = j2;
        this.contentType = commonCommunitiesStat$TypeTabContentType;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeTabItemClick)) {
            return false;
        }
        CommonCommunitiesStat$TypeTabItemClick commonCommunitiesStat$TypeTabItemClick = (CommonCommunitiesStat$TypeTabItemClick) obj;
        return this.ownerId == commonCommunitiesStat$TypeTabItemClick.ownerId && this.contentId == commonCommunitiesStat$TypeTabItemClick.contentId && this.contentType == commonCommunitiesStat$TypeTabItemClick.contentType && this.eventType == commonCommunitiesStat$TypeTabItemClick.eventType;
    }

    public final int hashCode() {
        int hashCode = (this.contentType.hashCode() + bh10.a(Long.hashCode(this.ownerId) * 31, 31, this.contentId)) * 31;
        EventType eventType = this.eventType;
        return hashCode + (eventType == null ? 0 : eventType.hashCode());
    }

    public final String toString() {
        return "TypeTabItemClick(ownerId=" + this.ownerId + ", contentId=" + this.contentId + ", contentType=" + this.contentType + ", eventType=" + this.eventType + ')';
    }

    public /* synthetic */ CommonCommunitiesStat$TypeTabItemClick(long j, long j2, CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType, EventType eventType, int i, zcl zclVar) {
        this(j, j2, commonCommunitiesStat$TypeTabContentType, (i & 8) != 0 ? null : eventType);
    }
}
