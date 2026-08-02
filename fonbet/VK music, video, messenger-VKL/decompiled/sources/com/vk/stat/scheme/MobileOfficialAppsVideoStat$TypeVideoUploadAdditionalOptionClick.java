package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_type")
    private final MobileOfficialAppsVideoStat$VideoTypeItem videoType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("attach_clip")
        public static final EventType ATTACH_CLIP;

        static {
            EventType eventType = new EventType("ATTACH_CLIP", 0);
            ATTACH_CLIP = eventType;
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

    public MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick(EventType eventType, MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem) {
        this.eventType = eventType;
        this.videoType = mobileOfficialAppsVideoStat$VideoTypeItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick = (MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick.eventType && this.videoType == mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick.videoType;
    }

    public final int hashCode() {
        return this.videoType.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoUploadAdditionalOptionClick(eventType=" + this.eventType + ", videoType=" + this.videoType + ')';
    }
}
