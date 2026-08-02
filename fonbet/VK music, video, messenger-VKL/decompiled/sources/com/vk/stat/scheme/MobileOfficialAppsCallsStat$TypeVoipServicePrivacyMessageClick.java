package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick implements SchemeStat$TypeClick.b {

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

        @pmi0("inbox_service_privacy_message_click")
        public static final EventType INBOX_SERVICE_PRIVACY_MESSAGE_CLICK;

        @pmi0("missed_call_attache_click")
        public static final EventType MISSED_CALL_ATTACHE_CLICK;

        static {
            EventType eventType = new EventType("INBOX_SERVICE_PRIVACY_MESSAGE_CLICK", 0);
            INBOX_SERVICE_PRIVACY_MESSAGE_CLICK = eventType;
            EventType eventType2 = new EventType("MISSED_CALL_ATTACHE_CLICK", 1);
            MISSED_CALL_ATTACHE_CLICK = eventType2;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("im_chat")
        public static final Source IM_CHAT;

        static {
            Source source = new Source("IM_CHAT", 0);
            IM_CHAT = source;
            Source[] sourceArr = {source};
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

    public MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick(EventType eventType, Source source) {
        this.eventType = eventType;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick = (MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVoipServicePrivacyMessageClick(eventType=" + this.eventType + ", source=" + this.source + ')';
    }
}
