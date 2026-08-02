package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonFeedStat.kt */
/* loaded from: classes5.dex */
public final class CommonFeedStat$TypeFeedBlockMiniAppsItem implements SchemeStat$TypeAction.b {

    @pmi0("event_source")
    private final EventSource eventSource;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final CommonStat$TypeCommonEventItem item;

    @pmi0("view_percentage")
    private final Integer viewPercentage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonFeedStat.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;

        @pmi0("feed_mini_apps_carousel")
        public static final EventSource FEED_MINI_APPS_CAROUSEL;

        @pmi0("feed_recommended_game")
        public static final EventSource FEED_RECOMMENDED_GAME;

        @pmi0("feed_recommended_games_carousel")
        public static final EventSource FEED_RECOMMENDED_GAMES_CAROUSEL;

        static {
            EventSource eventSource = new EventSource("FEED_MINI_APPS_CAROUSEL", 0);
            FEED_MINI_APPS_CAROUSEL = eventSource;
            EventSource eventSource2 = new EventSource("FEED_RECOMMENDED_GAME", 1);
            FEED_RECOMMENDED_GAME = eventSource2;
            EventSource eventSource3 = new EventSource("FEED_RECOMMENDED_GAMES_CAROUSEL", 2);
            FEED_RECOMMENDED_GAMES_CAROUSEL = eventSource3;
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
    /* compiled from: CommonFeedStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("view_app")
        public static final EventType VIEW_APP;

        @pmi0("view_app_part")
        public static final EventType VIEW_APP_PART;

        static {
            EventType eventType = new EventType("VIEW_APP", 0);
            VIEW_APP = eventType;
            EventType eventType2 = new EventType("VIEW_APP_PART", 1);
            VIEW_APP_PART = eventType2;
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

    public CommonFeedStat$TypeFeedBlockMiniAppsItem(EventType eventType, EventSource eventSource, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, Integer num) {
        this.eventType = eventType;
        this.eventSource = eventSource;
        this.item = commonStat$TypeCommonEventItem;
        this.viewPercentage = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedStat$TypeFeedBlockMiniAppsItem)) {
            return false;
        }
        CommonFeedStat$TypeFeedBlockMiniAppsItem commonFeedStat$TypeFeedBlockMiniAppsItem = (CommonFeedStat$TypeFeedBlockMiniAppsItem) obj;
        return this.eventType == commonFeedStat$TypeFeedBlockMiniAppsItem.eventType && this.eventSource == commonFeedStat$TypeFeedBlockMiniAppsItem.eventSource && epx.f(this.item, commonFeedStat$TypeFeedBlockMiniAppsItem.item) && epx.f(this.viewPercentage, commonFeedStat$TypeFeedBlockMiniAppsItem.viewPercentage);
    }

    public final int hashCode() {
        int hashCode = (this.item.hashCode() + ((this.eventSource.hashCode() + (this.eventType.hashCode() * 31)) * 31)) * 31;
        Integer num = this.viewPercentage;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedBlockMiniAppsItem(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSource=");
        sb.append(this.eventSource);
        sb.append(", item=");
        sb.append(this.item);
        sb.append(", viewPercentage=");
        return uqi.b(sb, this.viewPercentage, ')');
    }

    public /* synthetic */ CommonFeedStat$TypeFeedBlockMiniAppsItem(EventType eventType, EventSource eventSource, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, Integer num, int i, zcl zclVar) {
        this(eventType, eventSource, commonStat$TypeCommonEventItem, (i & 8) != 0 ? null : num);
    }
}
