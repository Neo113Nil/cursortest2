package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImGoToProfileClickItem implements SchemeStat$TypeClick.b {

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

        @pmi0("go_to_profile")
        public static final EventType GO_TO_PROFILE;

        static {
            EventType eventType = new EventType("GO_TO_PROFILE", 0);
            GO_TO_PROFILE = eventType;
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

        @pmi0("button_name")
        public static final Source BUTTON_NAME;

        @pmi0("button_profile")
        public static final Source BUTTON_PROFILE;

        static {
            Source source = new Source("BUTTON_PROFILE", 0);
            BUTTON_PROFILE = source;
            Source source2 = new Source("BUTTON_NAME", 1);
            BUTTON_NAME = source2;
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

    public MobileOfficialAppsImStat$TypeImGoToProfileClickItem(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImGoToProfileClickItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImGoToProfileClickItem mobileOfficialAppsImStat$TypeImGoToProfileClickItem = (MobileOfficialAppsImStat$TypeImGoToProfileClickItem) obj;
        return this.eventType == mobileOfficialAppsImStat$TypeImGoToProfileClickItem.eventType && this.source == mobileOfficialAppsImStat$TypeImGoToProfileClickItem.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeImGoToProfileClickItem(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
