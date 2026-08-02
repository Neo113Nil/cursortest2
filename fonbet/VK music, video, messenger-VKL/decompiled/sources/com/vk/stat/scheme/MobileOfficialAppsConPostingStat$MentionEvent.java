package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$MentionEvent {

    @pmi0("mention_event_type")
    private final MentionEventType mentionEventType;

    @pmi0("mention_user_id")
    private final Long mentionUserId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class MentionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MentionEventType[] $VALUES;

        @pmi0("click_to_mention_suggest")
        public static final MentionEventType CLICK_TO_MENTION_SUGGEST;

        static {
            MentionEventType mentionEventType = new MentionEventType("CLICK_TO_MENTION_SUGGEST", 0);
            CLICK_TO_MENTION_SUGGEST = mentionEventType;
            MentionEventType[] mentionEventTypeArr = {mentionEventType};
            $VALUES = mentionEventTypeArr;
            $ENTRIES = new asp(mentionEventTypeArr);
        }

        private MentionEventType(String str, int i) {
        }

        public static MentionEventType valueOf(String str) {
            return (MentionEventType) Enum.valueOf(MentionEventType.class, str);
        }

        public static MentionEventType[] values() {
            return (MentionEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$MentionEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$MentionEvent)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$MentionEvent mobileOfficialAppsConPostingStat$MentionEvent = (MobileOfficialAppsConPostingStat$MentionEvent) obj;
        return this.mentionEventType == mobileOfficialAppsConPostingStat$MentionEvent.mentionEventType && epx.f(this.mentionUserId, mobileOfficialAppsConPostingStat$MentionEvent.mentionUserId);
    }

    public final int hashCode() {
        MentionEventType mentionEventType = this.mentionEventType;
        int hashCode = (mentionEventType == null ? 0 : mentionEventType.hashCode()) * 31;
        Long l = this.mentionUserId;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MentionEvent(mentionEventType=");
        sb.append(this.mentionEventType);
        sb.append(", mentionUserId=");
        return iq.b(sb, this.mentionUserId, ')');
    }

    public MobileOfficialAppsConPostingStat$MentionEvent(MentionEventType mentionEventType, Long l) {
        this.mentionEventType = mentionEventType;
        this.mentionUserId = l;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$MentionEvent(MentionEventType mentionEventType, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mentionEventType, (i & 2) != 0 ? null : l);
    }
}
