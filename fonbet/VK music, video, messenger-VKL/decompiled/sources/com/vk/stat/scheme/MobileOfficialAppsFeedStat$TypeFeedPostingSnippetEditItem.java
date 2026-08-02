package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("audio_snippet_off")
        public static final EventType AUDIO_SNIPPET_OFF;

        @pmi0("audio_snippet_on")
        public static final EventType AUDIO_SNIPPET_ON;

        @pmi0("open_modal_audio_snippet")
        public static final EventType OPEN_MODAL_AUDIO_SNIPPET;

        @pmi0("start_listen_audio_snippet")
        public static final EventType START_LISTEN_AUDIO_SNIPPET;

        static {
            EventType eventType = new EventType("OPEN_MODAL_AUDIO_SNIPPET", 0);
            OPEN_MODAL_AUDIO_SNIPPET = eventType;
            EventType eventType2 = new EventType("START_LISTEN_AUDIO_SNIPPET", 1);
            START_LISTEN_AUDIO_SNIPPET = eventType2;
            EventType eventType3 = new EventType("AUDIO_SNIPPET_ON", 2);
            AUDIO_SNIPPET_ON = eventType3;
            EventType eventType4 = new EventType("AUDIO_SNIPPET_OFF", 3);
            AUDIO_SNIPPET_OFF = eventType4;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem) && this.eventType == ((MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem) obj).eventType;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        if (eventType == null) {
            return 0;
        }
        return eventType.hashCode();
    }

    public final String toString() {
        return "TypeFeedPostingSnippetEditItem(eventType=" + this.eventType + ')';
    }

    public MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem(EventType eventType) {
        this.eventType = eventType;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem(EventType eventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType);
    }
}
