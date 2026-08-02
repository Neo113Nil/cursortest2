package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImGoArchiveClickItem implements SchemeStat$TypeClick.b {

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

        @pmi0("go_to_archive")
        public static final EventType GO_TO_ARCHIVE;

        static {
            EventType eventType = new EventType("GO_TO_ARCHIVE", 0);
            GO_TO_ARCHIVE = eventType;
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
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("chat_list_header")
        public static final Source CHAT_LIST_HEADER;

        @pmi0("chat_list_longtap")
        public static final Source CHAT_LIST_LONGTAP;

        static {
            Source source = new Source("CHAT_LIST_HEADER", 0);
            CHAT_LIST_HEADER = source;
            Source source2 = new Source("CHAT_LIST_LONGTAP", 1);
            CHAT_LIST_LONGTAP = source2;
            Source[] sourceArr = {source, source2};
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

    public MobileOfficialAppsImStat$TypeImGoArchiveClickItem(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImGoArchiveClickItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImGoArchiveClickItem mobileOfficialAppsImStat$TypeImGoArchiveClickItem = (MobileOfficialAppsImStat$TypeImGoArchiveClickItem) obj;
        return this.eventType == mobileOfficialAppsImStat$TypeImGoArchiveClickItem.eventType && this.source == mobileOfficialAppsImStat$TypeImGoArchiveClickItem.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeImGoArchiveClickItem(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
