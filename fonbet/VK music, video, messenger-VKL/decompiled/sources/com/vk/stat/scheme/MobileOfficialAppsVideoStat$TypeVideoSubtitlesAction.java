package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction implements SchemeStat$TypeAction.b {

    @pmi0("event_source")
    private final EventSource eventSource;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final String objectValue;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("video_type")
    private final MobileOfficialAppsVideoStat$VideoTypeItem videoType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;

        @pmi0("auto")
        public static final EventSource AUTO;

        @pmi0("button")
        public static final EventSource BUTTON;

        @pmi0("settings")
        public static final EventSource SETTINGS;

        static {
            EventSource eventSource = new EventSource("AUTO", 0);
            AUTO = eventSource;
            EventSource eventSource2 = new EventSource("BUTTON", 1);
            BUTTON = eventSource2;
            EventSource eventSource3 = new EventSource("SETTINGS", 2);
            SETTINGS = eventSource3;
            EventSource[] eventSourceArr = {eventSource, eventSource2, eventSource3};
            $VALUES = eventSourceArr;
            $ENTRIES = new asp(eventSourceArr);
        }

        private EventSource(String str, int i) {
        }

        public static EventSource valueOf(String str) {
            return (EventSource) Enum.valueOf(EventSource.class, str);
        }

        public static EventSource[] values() {
            return (EventSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("change")
        public static final EventSubtype CHANGE;

        @pmi0("turn_off")
        public static final EventSubtype TURN_OFF;

        @pmi0("turn_on")
        public static final EventSubtype TURN_ON;

        static {
            EventSubtype eventSubtype = new EventSubtype("TURN_ON", 0);
            TURN_ON = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("TURN_OFF", 1);
            TURN_OFF = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("CHANGE", 2);
            CHANGE = eventSubtype3;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("subtitles")
        public static final EventType SUBTITLES;

        static {
            EventType eventType = new EventType("SUBTITLES", 0);
            SUBTITLES = eventType;
            EventType[] eventTypeArr = {eventType};
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

    public MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction(EventType eventType, EventSubtype eventSubtype, EventSource eventSource, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem, String str) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.eventSource = eventSource;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.videoType = mobileOfficialAppsVideoStat$VideoTypeItem;
        this.objectValue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction = (MobileOfficialAppsVideoStat$TypeVideoSubtitlesAction) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction.eventSubtype && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction.eventSource && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction.screenMode && this.videoType == mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction.videoType && epx.f(this.objectValue, mobileOfficialAppsVideoStat$TypeVideoSubtitlesAction.objectValue);
    }

    public final int hashCode() {
        return this.objectValue.hashCode() + ((this.videoType.hashCode() + ((this.screenMode.hashCode() + ((this.eventSource.hashCode() + ((this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoSubtitlesAction(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", eventSource=");
        sb.append(this.eventSource);
        sb.append(", screenMode=");
        sb.append(this.screenMode);
        sb.append(", videoType=");
        sb.append(this.videoType);
        sb.append(", objectValue=");
        return ho8.a(sb, this.objectValue, ')');
    }
}
