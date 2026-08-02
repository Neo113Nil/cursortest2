package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioLyricsItem implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final CommonStat$TypeCommonEventItem item;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("go_to_timecode")
        public static final EventType GO_TO_TIMECODE;

        @pmi0("hide_lyrics")
        public static final EventType HIDE_LYRICS;

        @pmi0("show_lyrics")
        public static final EventType SHOW_LYRICS;

        static {
            EventType eventType = new EventType("SHOW_LYRICS", 0);
            SHOW_LYRICS = eventType;
            EventType eventType2 = new EventType("HIDE_LYRICS", 1);
            HIDE_LYRICS = eventType2;
            EventType eventType3 = new EventType("GO_TO_TIMECODE", 2);
            GO_TO_TIMECODE = eventType3;
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

    public CommonAudioStat$TypeAudioLyricsItem(CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, EventType eventType) {
        this.item = commonStat$TypeCommonEventItem;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioLyricsItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioLyricsItem commonAudioStat$TypeAudioLyricsItem = (CommonAudioStat$TypeAudioLyricsItem) obj;
        return epx.f(this.item, commonAudioStat$TypeAudioLyricsItem.item) && this.eventType == commonAudioStat$TypeAudioLyricsItem.eventType;
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        EventType eventType = this.eventType;
        return hashCode + (eventType == null ? 0 : eventType.hashCode());
    }

    public final String toString() {
        return "TypeAudioLyricsItem(item=" + this.item + ", eventType=" + this.eventType + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioLyricsItem(CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, EventType eventType, int i, zcl zclVar) {
        this(commonStat$TypeCommonEventItem, (i & 2) != 0 ? null : eventType);
    }
}
