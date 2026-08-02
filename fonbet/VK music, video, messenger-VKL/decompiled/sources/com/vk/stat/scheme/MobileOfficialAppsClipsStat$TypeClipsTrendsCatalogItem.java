package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem implements SchemeStat$TypeAction.b {

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("audio_owner_id")
    private final Long audioOwnerId;

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("hashtag")
    private final String hashtag;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("open_trend")
        public static final EventType OPEN_TREND;

        @pmi0("open_trend_grid")
        public static final EventType OPEN_TREND_GRID;

        static {
            EventType eventType = new EventType("OPEN_TREND_GRID", 0);
            OPEN_TREND_GRID = eventType;
            EventType eventType2 = new EventType("OPEN_TREND", 1);
            OPEN_TREND = eventType2;
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

    public MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem(EventType eventType, Long l, Integer num, String str, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.eventType = eventType;
        this.audioOwnerId = l;
        this.audioId = num;
        this.hashtag = str;
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem = (MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.eventType && epx.f(this.audioOwnerId, mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.audioOwnerId) && epx.f(this.audioId, mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.audioId) && epx.f(this.hashtag, mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.hashtag) && epx.f(this.clipItem, mobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem.clipItem);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Long l = this.audioOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.audioId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.hashtag;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = this.clipItem;
        return hashCode4 + (mobileOfficialAppsClipsStat$TypeClipsClipItem != null ? mobileOfficialAppsClipsStat$TypeClipsClipItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClipsTrendsCatalogItem(eventType=" + this.eventType + ", audioOwnerId=" + this.audioOwnerId + ", audioId=" + this.audioId + ", hashtag=" + this.hashtag + ", clipItem=" + this.clipItem + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsTrendsCatalogItem(EventType eventType, Long l, Integer num, String str, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsClipItem);
    }
}
