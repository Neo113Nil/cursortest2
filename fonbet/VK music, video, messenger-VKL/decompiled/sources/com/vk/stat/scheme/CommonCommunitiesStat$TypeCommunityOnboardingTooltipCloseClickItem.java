package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("cancel_button")
        public static final EventType CANCEL_BUTTON;

        @pmi0("other")
        public static final EventType OTHER;

        static {
            EventType eventType = new EventType("CANCEL_BUTTON", 0);
            CANCEL_BUTTON = eventType;
            EventType eventType2 = new EventType(NativeAdContent.ViewTag.OTHER, 1);
            OTHER = eventType2;
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

    public CommonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem) && this.eventType == ((CommonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeCommunityOnboardingTooltipCloseClickItem(eventType=" + this.eventType + ')';
    }
}
