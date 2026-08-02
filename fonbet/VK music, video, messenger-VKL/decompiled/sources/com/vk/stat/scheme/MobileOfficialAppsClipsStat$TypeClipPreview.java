package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditorItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipPreview implements MobileOfficialAppsClipsStat$TypeClipEditorItem.a {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("preview_close")
        public static final EventType PREVIEW_CLOSE;

        @pmi0("preview_open")
        public static final EventType PREVIEW_OPEN;

        static {
            EventType eventType = new EventType("PREVIEW_OPEN", 0);
            PREVIEW_OPEN = eventType;
            EventType eventType2 = new EventType("PREVIEW_CLOSE", 1);
            PREVIEW_CLOSE = eventType2;
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

    public MobileOfficialAppsClipsStat$TypeClipPreview(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipPreview) && this.eventType == ((MobileOfficialAppsClipsStat$TypeClipPreview) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeClipPreview(eventType=" + this.eventType + ')';
    }
}
