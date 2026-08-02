package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay {

    @pmi0("event_source")
    private final String eventSource;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("background_play_turn_off")
        public static final EventType BACKGROUND_PLAY_TURN_OFF;

        @pmi0("background_play_turn_on")
        public static final EventType BACKGROUND_PLAY_TURN_ON;

        static {
            EventType eventType = new EventType("BACKGROUND_PLAY_TURN_ON", 0);
            BACKGROUND_PLAY_TURN_ON = eventType;
            EventType eventType2 = new EventType("BACKGROUND_PLAY_TURN_OFF", 1);
            BACKGROUND_PLAY_TURN_OFF = eventType2;
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

    public MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay(EventType eventType, String str) {
        this.eventType = eventType;
        this.eventSource = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay)) {
            return false;
        }
        MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay = (MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay) obj;
        return this.eventType == mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay.eventType && epx.f(this.eventSource, mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay.eventSource);
    }

    public final int hashCode() {
        return this.eventSource.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSettingsBackgroundPlay(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSource=");
        return ho8.a(sb, this.eventSource, ')');
    }

    public /* synthetic */ MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay(EventType eventType, String str, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? "app_settings" : str);
    }
}
