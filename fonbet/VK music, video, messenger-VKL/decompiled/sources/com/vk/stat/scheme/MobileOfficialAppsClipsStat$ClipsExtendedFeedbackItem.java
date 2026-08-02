package com.vk.stat.scheme;

import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("video_id")
    private final long videoId;

    @pmi0("video_owner_id")
    private final long videoOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("author")
        public static final EventSubtype AUTHOR;

        @pmi0("set_interests")
        public static final EventSubtype SET_INTERESTS;

        @pmi0("similar_clips")
        public static final EventSubtype SIMILAR_CLIPS;

        @pmi0("without_reasons")
        public static final EventSubtype WITHOUT_REASONS;

        static {
            EventSubtype eventSubtype = new EventSubtype("WITHOUT_REASONS", 0);
            WITHOUT_REASONS = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("SIMILAR_CLIPS", 1);
            SIMILAR_CLIPS = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("AUTHOR", 2);
            AUTHOR = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("SET_INTERESTS", 3);
            SET_INTERESTS = eventSubtype4;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4};
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

    public MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem(long j, long j2, EventSubtype eventSubtype, String str) {
        this.videoOwnerId = j;
        this.videoId = j2;
        this.eventSubtype = eventSubtype;
        this.trackCode = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem = (MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem) obj;
        return this.videoOwnerId == mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.videoOwnerId && this.videoId == mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.videoId && this.eventSubtype == mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.eventSubtype && epx.f(this.trackCode, mobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.trackCode);
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.videoOwnerId) * 31, 31, this.videoId);
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode = (a + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        String str = this.trackCode;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsExtendedFeedbackItem(videoOwnerId=");
        sb.append(this.videoOwnerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem(long j, long j2, EventSubtype eventSubtype, String str, int i, zcl zclVar) {
        this(j, j2, (i & 4) != 0 ? null : eventSubtype, (i & 8) != 0 ? null : str);
    }
}
