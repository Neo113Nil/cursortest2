package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipsSubscriptionItem {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("subscription_place")
    private final SubscriptionPlace subscriptionPlace;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("subscribe")
        public static final EventSubtype SUBSCRIBE;

        @pmi0("unsubscribe")
        public static final EventSubtype UNSUBSCRIBE;

        static {
            EventSubtype eventSubtype = new EventSubtype("SUBSCRIBE", 0);
            SUBSCRIBE = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("UNSUBSCRIBE", 1);
            UNSUBSCRIBE = eventSubtype2;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class SubscriptionPlace {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubscriptionPlace[] $VALUES;

        @pmi0("author_grid")
        public static final SubscriptionPlace AUTHOR_GRID;

        @pmi0("clips_search")
        public static final SubscriptionPlace CLIPS_SEARCH;

        @pmi0("feed")
        public static final SubscriptionPlace FEED;

        @pmi0("grid_authors_block")
        public static final SubscriptionPlace GRID_AUTHORS_BLOCK;

        @pmi0("im_chat")
        public static final SubscriptionPlace IM_CHAT;

        @pmi0("viewer")
        public static final SubscriptionPlace VIEWER;

        @pmi0("viewer_authors_block")
        public static final SubscriptionPlace VIEWER_AUTHORS_BLOCK;

        static {
            SubscriptionPlace subscriptionPlace = new SubscriptionPlace("VIEWER", 0);
            VIEWER = subscriptionPlace;
            SubscriptionPlace subscriptionPlace2 = new SubscriptionPlace("VIEWER_AUTHORS_BLOCK", 1);
            VIEWER_AUTHORS_BLOCK = subscriptionPlace2;
            SubscriptionPlace subscriptionPlace3 = new SubscriptionPlace("AUTHOR_GRID", 2);
            AUTHOR_GRID = subscriptionPlace3;
            SubscriptionPlace subscriptionPlace4 = new SubscriptionPlace("GRID_AUTHORS_BLOCK", 3);
            GRID_AUTHORS_BLOCK = subscriptionPlace4;
            SubscriptionPlace subscriptionPlace5 = new SubscriptionPlace("FEED", 4);
            FEED = subscriptionPlace5;
            SubscriptionPlace subscriptionPlace6 = new SubscriptionPlace("CLIPS_SEARCH", 5);
            CLIPS_SEARCH = subscriptionPlace6;
            SubscriptionPlace subscriptionPlace7 = new SubscriptionPlace("IM_CHAT", 6);
            IM_CHAT = subscriptionPlace7;
            SubscriptionPlace[] subscriptionPlaceArr = {subscriptionPlace, subscriptionPlace2, subscriptionPlace3, subscriptionPlace4, subscriptionPlace5, subscriptionPlace6, subscriptionPlace7};
            $VALUES = subscriptionPlaceArr;
            $ENTRIES = new asp(subscriptionPlaceArr);
        }

        private SubscriptionPlace(String str, int i) {
        }

        public static SubscriptionPlace valueOf(String str) {
            return (SubscriptionPlace) Enum.valueOf(SubscriptionPlace.class, str);
        }

        public static SubscriptionPlace[] values() {
            return (SubscriptionPlace[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$ClipsSubscriptionItem(SubscriptionPlace subscriptionPlace, EventSubtype eventSubtype) {
        this.subscriptionPlace = subscriptionPlace;
        this.eventSubtype = eventSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipsSubscriptionItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem mobileOfficialAppsClipsStat$ClipsSubscriptionItem = (MobileOfficialAppsClipsStat$ClipsSubscriptionItem) obj;
        return this.subscriptionPlace == mobileOfficialAppsClipsStat$ClipsSubscriptionItem.subscriptionPlace && this.eventSubtype == mobileOfficialAppsClipsStat$ClipsSubscriptionItem.eventSubtype;
    }

    public final int hashCode() {
        int hashCode = this.subscriptionPlace.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        return hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode());
    }

    public final String toString() {
        return "ClipsSubscriptionItem(subscriptionPlace=" + this.subscriptionPlace + ", eventSubtype=" + this.eventSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ClipsSubscriptionItem(SubscriptionPlace subscriptionPlace, EventSubtype eventSubtype, int i, zcl zclVar) {
        this(subscriptionPlace, (i & 2) != 0 ? null : eventSubtype);
    }
}
