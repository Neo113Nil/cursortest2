package com.vk.stat.scheme;

import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem {

    @pmi0("clip_item")
    private final MobileOfficialAppsClipsStat$TypeClipsClipItem clipItem;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("poll_id")
    private final String pollId;

    @pmi0("question_id")
    private final String questionId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_skip")
        public static final EventType CLICK_SKIP;

        @pmi0("show")
        public static final EventType SHOW;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
        public static final EventType VIEW;

        static {
            EventType eventType = new EventType("VIEW", 0);
            VIEW = eventType;
            EventType eventType2 = new EventType("SHOW", 1);
            SHOW = eventType2;
            EventType eventType3 = new EventType("CLICK_SKIP", 2);
            CLICK_SKIP = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem(EventType eventType, String str, String str2, MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem) {
        this.eventType = eventType;
        this.pollId = str;
        this.questionId = str2;
        this.clipItem = mobileOfficialAppsClipsStat$TypeClipsClipItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem = (MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem.eventType && epx.f(this.pollId, mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem.pollId) && epx.f(this.questionId, mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem.questionId) && epx.f(this.clipItem, mobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem.clipItem);
    }

    public final int hashCode() {
        return this.clipItem.hashCode() + urd0.a(urd0.a(this.eventType.hashCode() * 31, 31, this.pollId), 31, this.questionId);
    }

    public final String toString() {
        return "TypeClipInternalNpsEventItem(eventType=" + this.eventType + ", pollId=" + this.pollId + ", questionId=" + this.questionId + ", clipItem=" + this.clipItem + ')';
    }
}
