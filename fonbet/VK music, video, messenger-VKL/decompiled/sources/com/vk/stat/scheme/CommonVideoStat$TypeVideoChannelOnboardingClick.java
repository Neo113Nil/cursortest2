package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoChannelOnboardingClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_owner_id")
    private final Long videoOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_onboarding_avatar")
        public static final EventType CLICK_ONBOARDING_AVATAR;

        @pmi0("click_onboarding_cover")
        public static final EventType CLICK_ONBOARDING_COVER;

        @pmi0("click_onboarding_description")
        public static final EventType CLICK_ONBOARDING_DESCRIPTION;

        @pmi0("click_onboarding_edit")
        public static final EventType CLICK_ONBOARDING_EDIT;

        @pmi0("click_onboarding_upload_1")
        public static final EventType CLICK_ONBOARDING_UPLOAD_1;

        @pmi0("click_onboarding_upload_2")
        public static final EventType CLICK_ONBOARDING_UPLOAD_2;

        @pmi0("click_onboarding_upload_3")
        public static final EventType CLICK_ONBOARDING_UPLOAD_3;

        static {
            EventType eventType = new EventType("CLICK_ONBOARDING_AVATAR", 0);
            CLICK_ONBOARDING_AVATAR = eventType;
            EventType eventType2 = new EventType("CLICK_ONBOARDING_COVER", 1);
            CLICK_ONBOARDING_COVER = eventType2;
            EventType eventType3 = new EventType("CLICK_ONBOARDING_DESCRIPTION", 2);
            CLICK_ONBOARDING_DESCRIPTION = eventType3;
            EventType eventType4 = new EventType("CLICK_ONBOARDING_UPLOAD_1", 3);
            CLICK_ONBOARDING_UPLOAD_1 = eventType4;
            EventType eventType5 = new EventType("CLICK_ONBOARDING_UPLOAD_2", 4);
            CLICK_ONBOARDING_UPLOAD_2 = eventType5;
            EventType eventType6 = new EventType("CLICK_ONBOARDING_UPLOAD_3", 5);
            CLICK_ONBOARDING_UPLOAD_3 = eventType6;
            EventType eventType7 = new EventType("CLICK_ONBOARDING_EDIT", 6);
            CLICK_ONBOARDING_EDIT = eventType7;
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

    /* JADX WARN: Multi-variable type inference failed */
    public CommonVideoStat$TypeVideoChannelOnboardingClick() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoChannelOnboardingClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoChannelOnboardingClick commonVideoStat$TypeVideoChannelOnboardingClick = (CommonVideoStat$TypeVideoChannelOnboardingClick) obj;
        return this.eventType == commonVideoStat$TypeVideoChannelOnboardingClick.eventType && epx.f(this.videoOwnerId, commonVideoStat$TypeVideoChannelOnboardingClick.videoOwnerId);
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        Long l = this.videoOwnerId;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoChannelOnboardingClick(eventType=");
        sb.append(this.eventType);
        sb.append(", videoOwnerId=");
        return iq.b(sb, this.videoOwnerId, ')');
    }

    public CommonVideoStat$TypeVideoChannelOnboardingClick(EventType eventType, Long l) {
        this.eventType = eventType;
        this.videoOwnerId = l;
    }

    public /* synthetic */ CommonVideoStat$TypeVideoChannelOnboardingClick(EventType eventType, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : l);
    }
}
