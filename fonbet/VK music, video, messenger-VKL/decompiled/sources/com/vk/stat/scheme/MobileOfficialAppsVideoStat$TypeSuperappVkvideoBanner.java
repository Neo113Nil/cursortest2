package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner implements SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("open_in_vkvideo_banner_0_video_click")
        public static final EventType OPEN_IN_VKVIDEO_BANNER_0_VIDEO_CLICK;

        @pmi0("open_in_vkvideo_banner_0_video_show")
        public static final EventType OPEN_IN_VKVIDEO_BANNER_0_VIDEO_SHOW;

        @pmi0("open_in_vkvideo_banner_click")
        public static final EventType OPEN_IN_VKVIDEO_BANNER_CLICK;

        @pmi0("open_in_vkvideo_banner_show")
        public static final EventType OPEN_IN_VKVIDEO_BANNER_SHOW;

        static {
            EventType eventType = new EventType("OPEN_IN_VKVIDEO_BANNER_0_VIDEO_SHOW", 0);
            OPEN_IN_VKVIDEO_BANNER_0_VIDEO_SHOW = eventType;
            EventType eventType2 = new EventType("OPEN_IN_VKVIDEO_BANNER_0_VIDEO_CLICK", 1);
            OPEN_IN_VKVIDEO_BANNER_0_VIDEO_CLICK = eventType2;
            EventType eventType3 = new EventType("OPEN_IN_VKVIDEO_BANNER_SHOW", 2);
            OPEN_IN_VKVIDEO_BANNER_SHOW = eventType3;
            EventType eventType4 = new EventType("OPEN_IN_VKVIDEO_BANNER_CLICK", 3);
            OPEN_IN_VKVIDEO_BANNER_CLICK = eventType4;
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

    public MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner) && this.eventType == ((MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeSuperappVkvideoBanner(eventType=" + this.eventType + ')';
    }
}
