package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonVideoOtherChannelsStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("nav_screen")
    private final NavScreen navScreen;

    @pmi0("source_ref")
    private final SourceRef sourceRef;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoOtherChannelsStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("subscribe")
        public static final Event SUBSCRIBE;

        @pmi0("unsubscribe")
        public static final Event UNSUBSCRIBE;

        static {
            Event event = new Event("SUBSCRIBE", 0);
            SUBSCRIBE = event;
            Event event2 = new Event("UNSUBSCRIBE", 1);
            UNSUBSCRIBE = event2;
            Event[] eventArr = {event, event2};
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
    /* compiled from: CommonVideoOtherChannelsStat.kt */
    public static final class NavScreen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NavScreen[] $VALUES;

        @pmi0("video_group_main")
        public static final NavScreen VIDEO_GROUP_MAIN;

        static {
            NavScreen navScreen = new NavScreen("VIDEO_GROUP_MAIN", 0);
            VIDEO_GROUP_MAIN = navScreen;
            NavScreen[] navScreenArr = {navScreen};
            $VALUES = navScreenArr;
            $ENTRIES = new asp(navScreenArr);
        }

        private NavScreen(String str, int i) {
        }

        public static NavScreen valueOf(String str) {
            return (NavScreen) Enum.valueOf(NavScreen.class, str);
        }

        public static NavScreen[] values() {
            return (NavScreen[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoOtherChannelsStat.kt */
    public static final class SourceRef {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SourceRef[] $VALUES;

        @pmi0("similar_channels")
        public static final SourceRef SIMILAR_CHANNELS;

        static {
            SourceRef sourceRef = new SourceRef("SIMILAR_CHANNELS", 0);
            SIMILAR_CHANNELS = sourceRef;
            SourceRef[] sourceRefArr = {sourceRef};
            $VALUES = sourceRefArr;
            $ENTRIES = new asp(sourceRefArr);
        }

        private SourceRef(String str, int i) {
        }

        public static SourceRef valueOf(String str) {
            return (SourceRef) Enum.valueOf(SourceRef.class, str);
        }

        public static SourceRef[] values() {
            return (SourceRef[]) $VALUES.clone();
        }
    }

    public CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick(Event event, NavScreen navScreen, SourceRef sourceRef) {
        this.event = event;
        this.navScreen = navScreen;
        this.sourceRef = sourceRef;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick)) {
            return false;
        }
        CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick = (CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick) obj;
        return this.event == commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick.event && this.navScreen == commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick.navScreen && this.sourceRef == commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick.sourceRef;
    }

    public final int hashCode() {
        return this.sourceRef.hashCode() + ((this.navScreen.hashCode() + (this.event.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeSimilarChannelsSubscriptionClick(event=" + this.event + ", navScreen=" + this.navScreen + ", sourceRef=" + this.sourceRef + ')';
    }
}
