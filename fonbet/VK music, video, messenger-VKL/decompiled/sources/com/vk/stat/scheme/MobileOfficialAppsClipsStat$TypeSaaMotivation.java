package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeSaaMotivation {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_type")
    private final ObjectType objectType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_to_download_saa_button")
        public static final EventType CLICK_TO_DOWNLOAD_SAA_BUTTON;

        @pmi0("click_to_open_saa_button")
        public static final EventType CLICK_TO_OPEN_SAA_BUTTON;

        @pmi0("close_download_saa_button")
        public static final EventType CLOSE_DOWNLOAD_SAA_BUTTON;

        @pmi0("close_open_saa_button")
        public static final EventType CLOSE_OPEN_SAA_BUTTON;

        @pmi0("show_download_saa_button")
        public static final EventType SHOW_DOWNLOAD_SAA_BUTTON;

        @pmi0("show_open_saa_button")
        public static final EventType SHOW_OPEN_SAA_BUTTON;

        static {
            EventType eventType = new EventType("SHOW_DOWNLOAD_SAA_BUTTON", 0);
            SHOW_DOWNLOAD_SAA_BUTTON = eventType;
            EventType eventType2 = new EventType("SHOW_OPEN_SAA_BUTTON", 1);
            SHOW_OPEN_SAA_BUTTON = eventType2;
            EventType eventType3 = new EventType("CLICK_TO_DOWNLOAD_SAA_BUTTON", 2);
            CLICK_TO_DOWNLOAD_SAA_BUTTON = eventType3;
            EventType eventType4 = new EventType("CLICK_TO_OPEN_SAA_BUTTON", 3);
            CLICK_TO_OPEN_SAA_BUTTON = eventType4;
            EventType eventType5 = new EventType("CLOSE_DOWNLOAD_SAA_BUTTON", 4);
            CLOSE_DOWNLOAD_SAA_BUTTON = eventType5;
            EventType eventType6 = new EventType("CLOSE_OPEN_SAA_BUTTON", 5);
            CLOSE_OPEN_SAA_BUTTON = eventType6;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6};
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
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0("audio")
        public static final ObjectType AUDIO;

        @pmi0("author_statistics")
        public static final ObjectType AUTHOR_STATISTICS;

        @pmi0("clips_voiceover")
        public static final ObjectType CLIPS_VOICEOVER;

        @pmi0("clip_statistics")
        public static final ObjectType CLIP_STATISTICS;

        @pmi0("color_correction")
        public static final ObjectType COLOR_CORRECTION;

        @pmi0("editor_speed")
        public static final ObjectType EDITOR_SPEED;

        @pmi0("imported_audio")
        public static final ObjectType IMPORTED_AUDIO;

        static {
            ObjectType objectType = new ObjectType("EDITOR_SPEED", 0);
            EDITOR_SPEED = objectType;
            ObjectType objectType2 = new ObjectType("AUTHOR_STATISTICS", 1);
            AUTHOR_STATISTICS = objectType2;
            ObjectType objectType3 = new ObjectType("COLOR_CORRECTION", 2);
            COLOR_CORRECTION = objectType3;
            ObjectType objectType4 = new ObjectType("IMPORTED_AUDIO", 3);
            IMPORTED_AUDIO = objectType4;
            ObjectType objectType5 = new ObjectType("CLIP_STATISTICS", 4);
            CLIP_STATISTICS = objectType5;
            ObjectType objectType6 = new ObjectType("CLIPS_VOICEOVER", 5);
            CLIPS_VOICEOVER = objectType6;
            ObjectType objectType7 = new ObjectType(SignalingProtocol.MEDIA_OPTION_AUDIO, 6);
            AUDIO = objectType7;
            ObjectType[] objectTypeArr = {objectType, objectType2, objectType3, objectType4, objectType5, objectType6, objectType7};
            $VALUES = objectTypeArr;
            $ENTRIES = new asp(objectTypeArr);
        }

        private ObjectType(String str, int i) {
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeSaaMotivation(EventType eventType, ObjectType objectType) {
        this.eventType = eventType;
        this.objectType = objectType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeSaaMotivation)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeSaaMotivation mobileOfficialAppsClipsStat$TypeSaaMotivation = (MobileOfficialAppsClipsStat$TypeSaaMotivation) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeSaaMotivation.eventType && this.objectType == mobileOfficialAppsClipsStat$TypeSaaMotivation.objectType;
    }

    public final int hashCode() {
        return this.objectType.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeSaaMotivation(eventType=" + this.eventType + ", objectType=" + this.objectType + ')';
    }
}
