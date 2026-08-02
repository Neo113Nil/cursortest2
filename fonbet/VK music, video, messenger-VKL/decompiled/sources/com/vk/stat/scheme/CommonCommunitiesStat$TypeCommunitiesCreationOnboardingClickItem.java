package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem implements CommonCommunitiesStat$TypeCommunitiesClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("onboarding_screen")
    private final OnboardingScreen onboardingScreen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("block_click")
        public static final Event BLOCK_CLICK;

        static {
            Event event = new Event("BLOCK_CLICK", 0);
            BLOCK_CLICK = event;
            Event[] eventArr = {event};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class OnboardingScreen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnboardingScreen[] $VALUES;

        @pmi0("screen_clips")
        public static final OnboardingScreen SCREEN_CLIPS;

        @pmi0("screen_design")
        public static final OnboardingScreen SCREEN_DESIGN;

        @pmi0("screen_finish")
        public static final OnboardingScreen SCREEN_FINISH;

        @pmi0("screen_market_items")
        public static final OnboardingScreen SCREEN_MARKET_ITEMS;

        @pmi0("screen_posting")
        public static final OnboardingScreen SCREEN_POSTING;

        @pmi0("screen_regular_posting")
        public static final OnboardingScreen SCREEN_REGULAR_POSTING;

        @pmi0("screen_subscribers")
        public static final OnboardingScreen SCREEN_SUBSCRIBERS;

        static {
            OnboardingScreen onboardingScreen = new OnboardingScreen("SCREEN_DESIGN", 0);
            SCREEN_DESIGN = onboardingScreen;
            OnboardingScreen onboardingScreen2 = new OnboardingScreen("SCREEN_MARKET_ITEMS", 1);
            SCREEN_MARKET_ITEMS = onboardingScreen2;
            OnboardingScreen onboardingScreen3 = new OnboardingScreen("SCREEN_POSTING", 2);
            SCREEN_POSTING = onboardingScreen3;
            OnboardingScreen onboardingScreen4 = new OnboardingScreen("SCREEN_SUBSCRIBERS", 3);
            SCREEN_SUBSCRIBERS = onboardingScreen4;
            OnboardingScreen onboardingScreen5 = new OnboardingScreen("SCREEN_CLIPS", 4);
            SCREEN_CLIPS = onboardingScreen5;
            OnboardingScreen onboardingScreen6 = new OnboardingScreen("SCREEN_REGULAR_POSTING", 5);
            SCREEN_REGULAR_POSTING = onboardingScreen6;
            OnboardingScreen onboardingScreen7 = new OnboardingScreen("SCREEN_FINISH", 6);
            SCREEN_FINISH = onboardingScreen7;
            OnboardingScreen[] onboardingScreenArr = {onboardingScreen, onboardingScreen2, onboardingScreen3, onboardingScreen4, onboardingScreen5, onboardingScreen6, onboardingScreen7};
            $VALUES = onboardingScreenArr;
            $ENTRIES = new asp(onboardingScreenArr);
        }

        private OnboardingScreen(String str, int i) {
        }

        public static zrp<OnboardingScreen> h() {
            return $ENTRIES;
        }

        public static OnboardingScreen valueOf(String str) {
            return (OnboardingScreen) Enum.valueOf(OnboardingScreen.class, str);
        }

        public static OnboardingScreen[] values() {
            return (OnboardingScreen[]) $VALUES.clone();
        }
    }

    public CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem(Event event, OnboardingScreen onboardingScreen) {
        this.event = event;
        this.onboardingScreen = onboardingScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem = (CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem) obj;
        return this.event == commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem.event && this.onboardingScreen == commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem.onboardingScreen;
    }

    public final int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        OnboardingScreen onboardingScreen = this.onboardingScreen;
        return hashCode + (onboardingScreen == null ? 0 : onboardingScreen.hashCode());
    }

    public final String toString() {
        return "TypeCommunitiesCreationOnboardingClickItem(event=" + this.event + ", onboardingScreen=" + this.onboardingScreen + ')';
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem(Event event, OnboardingScreen onboardingScreen, int i, zcl zclVar) {
        this(event, (i & 2) != 0 ? null : onboardingScreen);
    }
}
