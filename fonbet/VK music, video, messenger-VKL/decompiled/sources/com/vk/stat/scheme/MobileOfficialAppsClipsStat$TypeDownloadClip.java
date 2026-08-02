package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditorItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeDownloadClip implements MobileOfficialAppsClipsStat$TypeClipEditorItem.a {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("cancel_download_clip")
        public static final EventType CANCEL_DOWNLOAD_CLIP;

        @pmi0("download_clip")
        public static final EventType DOWNLOAD_CLIP;

        static {
            EventType eventType = new EventType("DOWNLOAD_CLIP", 0);
            DOWNLOAD_CLIP = eventType;
            EventType eventType2 = new EventType("CANCEL_DOWNLOAD_CLIP", 1);
            CANCEL_DOWNLOAD_CLIP = eventType2;
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

    public MobileOfficialAppsClipsStat$TypeDownloadClip(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeDownloadClip) && this.eventType == ((MobileOfficialAppsClipsStat$TypeDownloadClip) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeDownloadClip(eventType=" + this.eventType + ')';
    }
}
