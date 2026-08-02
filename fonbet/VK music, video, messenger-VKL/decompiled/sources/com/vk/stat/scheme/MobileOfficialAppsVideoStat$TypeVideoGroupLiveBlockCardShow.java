package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow implements SchemeStat$TypeView.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_id")
    private final long objectId;

    @pmi0("object_owner_id")
    private final long objectOwnerId;

    @pmi0("position_in_block")
    private final int positionInBlock;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("auto")
        public static final EventSubtype AUTO;

        @pmi0("manual")
        public static final EventSubtype MANUAL;

        static {
            EventSubtype eventSubtype = new EventSubtype("MANUAL", 0);
            MANUAL = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("AUTO", 1);
            AUTO = eventSubtype2;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("video_group_live_block_next_card_show")
        public static final EventType VIDEO_GROUP_LIVE_BLOCK_NEXT_CARD_SHOW;

        @pmi0("video_group_live_block_prev_card_show")
        public static final EventType VIDEO_GROUP_LIVE_BLOCK_PREV_CARD_SHOW;

        static {
            EventType eventType = new EventType("VIDEO_GROUP_LIVE_BLOCK_NEXT_CARD_SHOW", 0);
            VIDEO_GROUP_LIVE_BLOCK_NEXT_CARD_SHOW = eventType;
            EventType eventType2 = new EventType("VIDEO_GROUP_LIVE_BLOCK_PREV_CARD_SHOW", 1);
            VIDEO_GROUP_LIVE_BLOCK_PREV_CARD_SHOW = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow(EventType eventType, EventSubtype eventSubtype, int i, long j, long j2) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.positionInBlock = i;
        this.objectId = j;
        this.objectOwnerId = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow = (MobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.eventSubtype && this.positionInBlock == mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.positionInBlock && this.objectId == mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.objectId && this.objectOwnerId == mobileOfficialAppsVideoStat$TypeVideoGroupLiveBlockCardShow.objectOwnerId;
    }

    public final int hashCode() {
        return Long.hashCode(this.objectOwnerId) + bh10.a(shy.a(this.positionInBlock, (this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31, 31), 31, this.objectId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoGroupLiveBlockCardShow(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", positionInBlock=");
        sb.append(this.positionInBlock);
        sb.append(", objectId=");
        sb.append(this.objectId);
        sb.append(", objectOwnerId=");
        return vu5.a(')', this.objectOwnerId, sb);
    }
}
