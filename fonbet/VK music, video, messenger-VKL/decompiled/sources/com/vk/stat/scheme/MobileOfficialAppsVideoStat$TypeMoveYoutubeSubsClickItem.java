package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("move_youtube_subs_promo_start")
        public static final EventType MOVE_YOUTUBE_SUBS_PROMO_START;

        @pmi0("move_youtube_subs_start")
        public static final EventType MOVE_YOUTUBE_SUBS_START;

        @pmi0("move_youtube_subs_subscriptions_start")
        public static final EventType MOVE_YOUTUBE_SUBS_SUBSCRIPTIONS_START;

        static {
            EventType eventType = new EventType("MOVE_YOUTUBE_SUBS_PROMO_START", 0);
            MOVE_YOUTUBE_SUBS_PROMO_START = eventType;
            EventType eventType2 = new EventType("MOVE_YOUTUBE_SUBS_START", 1);
            MOVE_YOUTUBE_SUBS_START = eventType2;
            EventType eventType3 = new EventType("MOVE_YOUTUBE_SUBS_SUBSCRIPTIONS_START", 2);
            MOVE_YOUTUBE_SUBS_SUBSCRIPTIONS_START = eventType3;
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

    public MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem) && this.eventType == ((MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeMoveYoutubeSubsClickItem(eventType=" + this.eventType + ')';
    }
}
