package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_item")
    private final SchemeStat$EventItem objectItem;

    @pmi0("video_item")
    private final SchemeStat$EventItem videoItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("attach_clip")
        public static final EventType ATTACH_CLIP;

        @pmi0("detach_clip")
        public static final EventType DETACH_CLIP;

        static {
            EventType eventType = new EventType("ATTACH_CLIP", 0);
            ATTACH_CLIP = eventType;
            EventType eventType2 = new EventType("DETACH_CLIP", 1);
            DETACH_CLIP = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo(EventType eventType, SchemeStat$EventItem schemeStat$EventItem, SchemeStat$EventItem schemeStat$EventItem2) {
        this.eventType = eventType;
        this.videoItem = schemeStat$EventItem;
        this.objectItem = schemeStat$EventItem2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo = (MobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo.eventType && epx.f(this.videoItem, mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo.videoItem) && epx.f(this.objectItem, mobileOfficialAppsVideoStat$TypeVideoAttachObjectToVideo.objectItem);
    }

    public final int hashCode() {
        return this.objectItem.hashCode() + ((this.videoItem.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeVideoAttachObjectToVideo(eventType=" + this.eventType + ", videoItem=" + this.videoItem + ", objectItem=" + this.objectItem + ')';
    }
}
