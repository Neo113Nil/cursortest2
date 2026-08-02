package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipShareToUserClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("share_link_chat")
        public static final EventType SHARE_LINK_CHAT;

        @pmi0("share_link_copy")
        public static final EventType SHARE_LINK_COPY;

        @pmi0("share_link_modal")
        public static final EventType SHARE_LINK_MODAL;

        @pmi0("share_link_open")
        public static final EventType SHARE_LINK_OPEN;

        static {
            EventType eventType = new EventType("SHARE_LINK_OPEN", 0);
            SHARE_LINK_OPEN = eventType;
            EventType eventType2 = new EventType("SHARE_LINK_COPY", 1);
            SHARE_LINK_COPY = eventType2;
            EventType eventType3 = new EventType("SHARE_LINK_CHAT", 2);
            SHARE_LINK_CHAT = eventType3;
            EventType eventType4 = new EventType("SHARE_LINK_MODAL", 3);
            SHARE_LINK_MODAL = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
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
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("disable_calls")
        public static final Source DISABLE_CALLS;

        @pmi0("general_share")
        public static final Source GENERAL_SHARE;

        @pmi0("long_ago")
        public static final Source LONG_AGO;

        static {
            Source source = new Source("DISABLE_CALLS", 0);
            DISABLE_CALLS = source;
            Source source2 = new Source("LONG_AGO", 1);
            LONG_AGO = source2;
            Source source3 = new Source("GENERAL_SHARE", 2);
            GENERAL_SHARE = source3;
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

    public MobileOfficialAppsCallsStat$TypeVoipShareToUserClick(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipShareToUserClick)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipShareToUserClick mobileOfficialAppsCallsStat$TypeVoipShareToUserClick = (MobileOfficialAppsCallsStat$TypeVoipShareToUserClick) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipShareToUserClick.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipShareToUserClick.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVoipShareToUserClick(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
