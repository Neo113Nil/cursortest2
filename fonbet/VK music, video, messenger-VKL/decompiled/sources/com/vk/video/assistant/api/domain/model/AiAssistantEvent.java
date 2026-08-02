package com.vk.video.assistant.api.domain.model;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: AiAssistantEvent.kt */
/* loaded from: classes5.dex */
public abstract class AiAssistantEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AiAssistantEvent.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;
        public static final EventSource AiAssistantChat;
        public static final EventSource AiAssistantSearchCardVH;
        public static final EventSource RelatedVideoModalCard;

        static {
            EventSource eventSource = new EventSource("AiAssistantSearchCardVH", 0);
            AiAssistantSearchCardVH = eventSource;
            EventSource eventSource2 = new EventSource("RelatedVideoModalCard", 1);
            RelatedVideoModalCard = eventSource2;
            EventSource eventSource3 = new EventSource("AiAssistantChat", 2);
            AiAssistantChat = eventSource3;
            EventSource[] eventSourceArr = {eventSource, eventSource2, eventSource3};
            $VALUES = eventSourceArr;
            $ENTRIES = new asp(eventSourceArr);
        }

        public EventSource() {
            throw null;
        }

        public static EventSource valueOf(String str) {
            return (EventSource) Enum.valueOf(EventSource.class, str);
        }

        public static EventSource[] values() {
            return (EventSource[]) $VALUES.clone();
        }
    }

    /* compiled from: AiAssistantEvent.kt */
    public static final class a extends AiAssistantEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return epx.f(null, null) && 0 == 0;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "TemporaryPlaylistAdded(temporaryPlaylistId=" + ((String) null) + ", playlistId=0, playlistUserId=0, source=" + ((Object) null) + ')';
        }
    }
}
