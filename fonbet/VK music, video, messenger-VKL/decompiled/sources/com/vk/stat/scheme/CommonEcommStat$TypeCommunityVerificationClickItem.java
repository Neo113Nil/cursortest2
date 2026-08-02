package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeCommunityVerificationClickItem {

    @pmi0("community_id")
    private final long communityId;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonEcommStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("business_verification_click")
        public static final Event BUSINESS_VERIFICATION_CLICK;

        @pmi0("business_verification_requirement_vkbusiness_approved_click")
        public static final Event BUSINESS_VERIFICATION_REQUIREMENT_VKBUSINESS_APPROVED_CLICK;

        @pmi0("business_verification_requirement_vkbusiness_exists_click")
        public static final Event BUSINESS_VERIFICATION_REQUIREMENT_VKBUSINESS_EXISTS_CLICK;

        @pmi0("business_verification_start_click")
        public static final Event BUSINESS_VERIFICATION_START_CLICK;

        @pmi0("premium_verification_click")
        public static final Event PREMIUM_VERIFICATION_CLICK;

        @pmi0("premium_verification_requirement_rating_click")
        public static final Event PREMIUM_VERIFICATION_REQUIREMENT_RATING_CLICK;

        @pmi0("premium_verification_requirement_strikes_click")
        public static final Event PREMIUM_VERIFICATION_REQUIREMENT_STRIKES_CLICK;

        @pmi0("premium_verification_requirement_subscription_click")
        public static final Event PREMIUM_VERIFICATION_REQUIREMENT_SUBSCRIPTION_CLICK;

        @pmi0("premium_verification_requirement_vkbusiness_approved_click")
        public static final Event PREMIUM_VERIFICATION_REQUIREMENT_VKBUSINESS_APPROVED_CLICK;

        @pmi0("premium_verification_requirement_vkbusiness_exists_click")
        public static final Event PREMIUM_VERIFICATION_REQUIREMENT_VKBUSINESS_EXISTS_CLICK;

        @pmi0("premium_verification_start_click")
        public static final Event PREMIUM_VERIFICATION_START_CLICK;

        @pmi0("verifications_settings_click")
        public static final Event VERIFICATIONS_SETTINGS_CLICK;

        static {
            Event event = new Event("VERIFICATIONS_SETTINGS_CLICK", 0);
            VERIFICATIONS_SETTINGS_CLICK = event;
            Event event2 = new Event("PREMIUM_VERIFICATION_START_CLICK", 1);
            PREMIUM_VERIFICATION_START_CLICK = event2;
            Event event3 = new Event("PREMIUM_VERIFICATION_REQUIREMENT_VKBUSINESS_EXISTS_CLICK", 2);
            PREMIUM_VERIFICATION_REQUIREMENT_VKBUSINESS_EXISTS_CLICK = event3;
            Event event4 = new Event("PREMIUM_VERIFICATION_REQUIREMENT_VKBUSINESS_APPROVED_CLICK", 3);
            PREMIUM_VERIFICATION_REQUIREMENT_VKBUSINESS_APPROVED_CLICK = event4;
            Event event5 = new Event("PREMIUM_VERIFICATION_REQUIREMENT_RATING_CLICK", 4);
            PREMIUM_VERIFICATION_REQUIREMENT_RATING_CLICK = event5;
            Event event6 = new Event("PREMIUM_VERIFICATION_REQUIREMENT_STRIKES_CLICK", 5);
            PREMIUM_VERIFICATION_REQUIREMENT_STRIKES_CLICK = event6;
            Event event7 = new Event("PREMIUM_VERIFICATION_REQUIREMENT_SUBSCRIPTION_CLICK", 6);
            PREMIUM_VERIFICATION_REQUIREMENT_SUBSCRIPTION_CLICK = event7;
            Event event8 = new Event("PREMIUM_VERIFICATION_CLICK", 7);
            PREMIUM_VERIFICATION_CLICK = event8;
            Event event9 = new Event("BUSINESS_VERIFICATION_START_CLICK", 8);
            BUSINESS_VERIFICATION_START_CLICK = event9;
            Event event10 = new Event("BUSINESS_VERIFICATION_REQUIREMENT_VKBUSINESS_EXISTS_CLICK", 9);
            BUSINESS_VERIFICATION_REQUIREMENT_VKBUSINESS_EXISTS_CLICK = event10;
            Event event11 = new Event("BUSINESS_VERIFICATION_REQUIREMENT_VKBUSINESS_APPROVED_CLICK", 10);
            BUSINESS_VERIFICATION_REQUIREMENT_VKBUSINESS_APPROVED_CLICK = event11;
            Event event12 = new Event("BUSINESS_VERIFICATION_CLICK", 11);
            BUSINESS_VERIFICATION_CLICK = event12;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11, event12};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public CommonEcommStat$TypeCommunityVerificationClickItem(Event event, long j) {
        this.event = event;
        this.communityId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeCommunityVerificationClickItem)) {
            return false;
        }
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = (CommonEcommStat$TypeCommunityVerificationClickItem) obj;
        return this.event == commonEcommStat$TypeCommunityVerificationClickItem.event && this.communityId == commonEcommStat$TypeCommunityVerificationClickItem.communityId;
    }

    public final int hashCode() {
        return Long.hashCode(this.communityId) + (this.event.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCommunityVerificationClickItem(event=");
        sb.append(this.event);
        sb.append(", communityId=");
        return vu5.a(')', this.communityId, sb);
    }
}
