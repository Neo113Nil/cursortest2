package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    @pmi0("video_type")
    private final MobileOfficialAppsVideoStat$VideoTypeItem videoType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("change_author")
        public static final EventType CHANGE_AUTHOR;

        @pmi0("try_to_change_author")
        public static final EventType TRY_TO_CHANGE_AUTHOR;

        static {
            EventType eventType = new EventType("TRY_TO_CHANGE_AUTHOR", 0);
            TRY_TO_CHANGE_AUTHOR = eventType;
            EventType eventType2 = new EventType("CHANGE_AUTHOR", 1);
            CHANGE_AUTHOR = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect(EventType eventType, long j, MobileOfficialAppsVideoStat$VideoTypeItem mobileOfficialAppsVideoStat$VideoTypeItem) {
        this.eventType = eventType;
        this.videoOwnerId = j;
        this.videoType = mobileOfficialAppsVideoStat$VideoTypeItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect = (MobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect.eventType && this.videoOwnerId == mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect.videoOwnerId && this.videoType == mobileOfficialAppsVideoStat$TypeVideoUploadAuthorSelect.videoType;
    }

    public final int hashCode() {
        return this.videoType.hashCode() + bh10.a(this.eventType.hashCode() * 31, 31, this.videoOwnerId);
    }

    public final String toString() {
        return "TypeVideoUploadAuthorSelect(eventType=" + this.eventType + ", videoOwnerId=" + this.videoOwnerId + ", videoType=" + this.videoType + ')';
    }
}
