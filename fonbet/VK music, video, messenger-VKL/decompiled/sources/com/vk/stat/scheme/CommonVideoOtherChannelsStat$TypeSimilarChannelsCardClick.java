package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommonVideoOtherChannelsStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_id")
    private final long objectId;

    @pmi0("object_type")
    private final ObjectType objectType;

    @pmi0("position_in_block")
    private final int positionInBlock;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoOtherChannelsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("similar_channels_card_click")
        public static final EventType SIMILAR_CHANNELS_CARD_CLICK;

        static {
            EventType eventType = new EventType("SIMILAR_CHANNELS_CARD_CLICK", 0);
            SIMILAR_CHANNELS_CARD_CLICK = eventType;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoOtherChannelsStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0("group")
        public static final ObjectType GROUP;

        static {
            ObjectType objectType = new ObjectType("GROUP", 0);
            GROUP = objectType;
            ObjectType[] objectTypeArr = {objectType};
            $VALUES = objectTypeArr;
            $ENTRIES = new asp(objectTypeArr);
        }

        private ObjectType(String str, int i) {
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    public CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick(EventType eventType, ObjectType objectType, long j, int i) {
        this.eventType = eventType;
        this.objectType = objectType;
        this.objectId = j;
        this.positionInBlock = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick)) {
            return false;
        }
        CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick = (CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick) obj;
        return this.eventType == commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick.eventType && this.objectType == commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick.objectType && this.objectId == commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick.objectId && this.positionInBlock == commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick.positionInBlock;
    }

    public final int hashCode() {
        return Integer.hashCode(this.positionInBlock) + bh10.a((this.objectType.hashCode() + (this.eventType.hashCode() * 31)) * 31, 31, this.objectId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSimilarChannelsCardClick(eventType=");
        sb.append(this.eventType);
        sb.append(", objectType=");
        sb.append(this.objectType);
        sb.append(", objectId=");
        sb.append(this.objectId);
        sb.append(", positionInBlock=");
        return vu5.b(sb, this.positionInBlock, ')');
    }
}
