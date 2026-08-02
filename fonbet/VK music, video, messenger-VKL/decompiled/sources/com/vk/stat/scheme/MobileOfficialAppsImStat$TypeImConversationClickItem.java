package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImConversationClickItem implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_to_archive_click")
        public static final EventType ADD_TO_ARCHIVE_CLICK;

        @pmi0("mark_as_read_click")
        public static final EventType MARK_AS_READ_CLICK;

        @pmi0("mark_as_unread_click")
        public static final EventType MARK_AS_UNREAD_CLICK;

        @pmi0("pin_conversation_click")
        public static final EventType PIN_CONVERSATION_CLICK;

        @pmi0("remove_from_archive_click")
        public static final EventType REMOVE_FROM_ARCHIVE_CLICK;

        @pmi0("unpin_conversation_click")
        public static final EventType UNPIN_CONVERSATION_CLICK;

        static {
            EventType eventType = new EventType("MARK_AS_READ_CLICK", 0);
            MARK_AS_READ_CLICK = eventType;
            EventType eventType2 = new EventType("MARK_AS_UNREAD_CLICK", 1);
            MARK_AS_UNREAD_CLICK = eventType2;
            EventType eventType3 = new EventType("PIN_CONVERSATION_CLICK", 2);
            PIN_CONVERSATION_CLICK = eventType3;
            EventType eventType4 = new EventType("UNPIN_CONVERSATION_CLICK", 3);
            UNPIN_CONVERSATION_CLICK = eventType4;
            EventType eventType5 = new EventType("ADD_TO_ARCHIVE_CLICK", 4);
            ADD_TO_ARCHIVE_CLICK = eventType5;
            EventType eventType6 = new EventType("REMOVE_FROM_ARCHIVE_CLICK", 5);
            REMOVE_FROM_ARCHIVE_CLICK = eventType6;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6};
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
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("chat_list_longtap")
        public static final Source CHAT_LIST_LONGTAP;

        @pmi0("chat_list_swipe")
        public static final Source CHAT_LIST_SWIPE;

        @pmi0("chat_profile")
        public static final Source CHAT_PROFILE;

        static {
            Source source = new Source("CHAT_PROFILE", 0);
            CHAT_PROFILE = source;
            Source source2 = new Source("CHAT_LIST_LONGTAP", 1);
            CHAT_LIST_LONGTAP = source2;
            Source source3 = new Source("CHAT_LIST_SWIPE", 2);
            CHAT_LIST_SWIPE = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsImStat$TypeImConversationClickItem(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImConversationClickItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImConversationClickItem mobileOfficialAppsImStat$TypeImConversationClickItem = (MobileOfficialAppsImStat$TypeImConversationClickItem) obj;
        return this.eventType == mobileOfficialAppsImStat$TypeImConversationClickItem.eventType && this.source == mobileOfficialAppsImStat$TypeImConversationClickItem.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeImConversationClickItem(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
