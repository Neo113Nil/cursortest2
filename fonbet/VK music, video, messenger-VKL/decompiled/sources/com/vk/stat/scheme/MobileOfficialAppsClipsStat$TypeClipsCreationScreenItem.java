package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem implements SchemeStat$TypeAction.b {

    @pmi0("clips_create_context")
    private final MobileOfficialAppsClipsStat$ClipsCreateContext clipsCreateContext;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("close_publish")
        public static final EventType CLOSE_PUBLISH;

        @pmi0("open_action_button")
        public static final EventType OPEN_ACTION_BUTTON;

        @pmi0("open_camera")
        public static final EventType OPEN_CAMERA;

        @pmi0("open_editor")
        public static final EventType OPEN_EDITOR;

        @pmi0("open_gallery")
        public static final EventType OPEN_GALLERY;

        @pmi0("open_mediapicker")
        public static final EventType OPEN_MEDIAPICKER;

        @pmi0("open_publish")
        public static final EventType OPEN_PUBLISH;

        static {
            EventType eventType = new EventType("OPEN_EDITOR", 0);
            OPEN_EDITOR = eventType;
            EventType eventType2 = new EventType("OPEN_CAMERA", 1);
            OPEN_CAMERA = eventType2;
            EventType eventType3 = new EventType("OPEN_PUBLISH", 2);
            OPEN_PUBLISH = eventType3;
            EventType eventType4 = new EventType("CLOSE_PUBLISH", 3);
            CLOSE_PUBLISH = eventType4;
            EventType eventType5 = new EventType("OPEN_GALLERY", 4);
            OPEN_GALLERY = eventType5;
            EventType eventType6 = new EventType("OPEN_MEDIAPICKER", 5);
            OPEN_MEDIAPICKER = eventType6;
            EventType eventType7 = new EventType("OPEN_ACTION_BUTTON", 6);
            OPEN_ACTION_BUTTON = eventType7;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7};
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

    public MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem(EventType eventType, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext) {
        this.eventType = eventType;
        this.clipsCreateContext = mobileOfficialAppsClipsStat$ClipsCreateContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem = (MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.eventType && epx.f(this.clipsCreateContext, mobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.clipsCreateContext);
    }

    public final int hashCode() {
        return this.clipsCreateContext.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeClipsCreationScreenItem(eventType=" + this.eventType + ", clipsCreateContext=" + this.clipsCreateContext + ')';
    }
}
