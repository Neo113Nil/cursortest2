package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsGridItem implements SchemeStat$TypeClick.b {

    @pmi0("click_to_promo")
    private final MobileOfficialAppsClipsStat$ClipsPromoItem clickToPromo;

    @pmi0("click_to_view_analytics")
    private final MobileOfficialAppsClipsStat$ClipsAnalyticsItem clickToViewAnalytics;

    @pmi0("clips_subscription_item")
    private final MobileOfficialAppsClipsStat$ClipsSubscriptionItem clipsSubscriptionItem;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen_type")
    private final ScreenType screenType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_to_playlist")
        public static final EventType CLICK_TO_PLAYLIST;

        @pmi0("click_to_promo")
        public static final EventType CLICK_TO_PROMO;

        @pmi0("click_to_subscription_button")
        public static final EventType CLICK_TO_SUBSCRIPTION_BUTTON;

        @pmi0("click_to_view_analytics")
        public static final EventType CLICK_TO_VIEW_ANALYTICS;

        static {
            EventType eventType = new EventType("CLICK_TO_PLAYLIST", 0);
            CLICK_TO_PLAYLIST = eventType;
            EventType eventType2 = new EventType("CLICK_TO_SUBSCRIPTION_BUTTON", 1);
            CLICK_TO_SUBSCRIPTION_BUTTON = eventType2;
            EventType eventType3 = new EventType("CLICK_TO_PROMO", 2);
            CLICK_TO_PROMO = eventType3;
            EventType eventType4 = new EventType("CLICK_TO_VIEW_ANALYTICS", 3);
            CLICK_TO_VIEW_ANALYTICS = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class ScreenType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenType[] $VALUES;

        @pmi0("grid_challenge")
        public static final ScreenType GRID_CHALLENGE;

        @pmi0("grid_community")
        public static final ScreenType GRID_COMMUNITY;

        @pmi0("grid_compilation")
        public static final ScreenType GRID_COMPILATION;

        @pmi0("grid_effect")
        public static final ScreenType GRID_EFFECT;

        @pmi0("grid_geo_place")
        public static final ScreenType GRID_GEO_PLACE;

        @pmi0("grid_hashtag")
        public static final ScreenType GRID_HASHTAG;

        @pmi0("grid_mask")
        public static final ScreenType GRID_MASK;

        @pmi0("grid_music")
        public static final ScreenType GRID_MUSIC;

        @pmi0("grid_original_sound")
        public static final ScreenType GRID_ORIGINAL_SOUND;

        @pmi0("grid_other")
        public static final ScreenType GRID_OTHER;

        @pmi0("grid_user")
        public static final ScreenType GRID_USER;

        static {
            ScreenType screenType = new ScreenType("GRID_USER", 0);
            GRID_USER = screenType;
            ScreenType screenType2 = new ScreenType("GRID_COMMUNITY", 1);
            GRID_COMMUNITY = screenType2;
            ScreenType screenType3 = new ScreenType("GRID_ORIGINAL_SOUND", 2);
            GRID_ORIGINAL_SOUND = screenType3;
            ScreenType screenType4 = new ScreenType("GRID_MUSIC", 3);
            GRID_MUSIC = screenType4;
            ScreenType screenType5 = new ScreenType("GRID_COMPILATION", 4);
            GRID_COMPILATION = screenType5;
            ScreenType screenType6 = new ScreenType("GRID_CHALLENGE", 5);
            GRID_CHALLENGE = screenType6;
            ScreenType screenType7 = new ScreenType("GRID_HASHTAG", 6);
            GRID_HASHTAG = screenType7;
            ScreenType screenType8 = new ScreenType("GRID_EFFECT", 7);
            GRID_EFFECT = screenType8;
            ScreenType screenType9 = new ScreenType("GRID_MASK", 8);
            GRID_MASK = screenType9;
            ScreenType screenType10 = new ScreenType("GRID_GEO_PLACE", 9);
            GRID_GEO_PLACE = screenType10;
            ScreenType screenType11 = new ScreenType("GRID_OTHER", 10);
            GRID_OTHER = screenType11;
            ScreenType[] screenTypeArr = {screenType, screenType2, screenType3, screenType4, screenType5, screenType6, screenType7, screenType8, screenType9, screenType10, screenType11};
            $VALUES = screenTypeArr;
            $ENTRIES = new asp(screenTypeArr);
        }

        private ScreenType(String str, int i) {
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeClipsGridItem(EventType eventType, ScreenType screenType, MobileOfficialAppsClipsStat$ClipsSubscriptionItem mobileOfficialAppsClipsStat$ClipsSubscriptionItem, MobileOfficialAppsClipsStat$ClipsPromoItem mobileOfficialAppsClipsStat$ClipsPromoItem, MobileOfficialAppsClipsStat$ClipsAnalyticsItem mobileOfficialAppsClipsStat$ClipsAnalyticsItem) {
        this.eventType = eventType;
        this.screenType = screenType;
        this.clipsSubscriptionItem = mobileOfficialAppsClipsStat$ClipsSubscriptionItem;
        this.clickToPromo = mobileOfficialAppsClipsStat$ClipsPromoItem;
        this.clickToViewAnalytics = mobileOfficialAppsClipsStat$ClipsAnalyticsItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipsGridItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipsGridItem mobileOfficialAppsClipsStat$TypeClipsGridItem = (MobileOfficialAppsClipsStat$TypeClipsGridItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipsGridItem.eventType && this.screenType == mobileOfficialAppsClipsStat$TypeClipsGridItem.screenType && epx.f(this.clipsSubscriptionItem, mobileOfficialAppsClipsStat$TypeClipsGridItem.clipsSubscriptionItem) && epx.f(this.clickToPromo, mobileOfficialAppsClipsStat$TypeClipsGridItem.clickToPromo) && epx.f(this.clickToViewAnalytics, mobileOfficialAppsClipsStat$TypeClipsGridItem.clickToViewAnalytics);
    }

    public final int hashCode() {
        int hashCode = (this.screenType.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        MobileOfficialAppsClipsStat$ClipsSubscriptionItem mobileOfficialAppsClipsStat$ClipsSubscriptionItem = this.clipsSubscriptionItem;
        int hashCode2 = (hashCode + (mobileOfficialAppsClipsStat$ClipsSubscriptionItem == null ? 0 : mobileOfficialAppsClipsStat$ClipsSubscriptionItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipsPromoItem mobileOfficialAppsClipsStat$ClipsPromoItem = this.clickToPromo;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsClipsStat$ClipsPromoItem == null ? 0 : mobileOfficialAppsClipsStat$ClipsPromoItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ClipsAnalyticsItem mobileOfficialAppsClipsStat$ClipsAnalyticsItem = this.clickToViewAnalytics;
        return hashCode3 + (mobileOfficialAppsClipsStat$ClipsAnalyticsItem != null ? mobileOfficialAppsClipsStat$ClipsAnalyticsItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClipsGridItem(eventType=" + this.eventType + ", screenType=" + this.screenType + ", clipsSubscriptionItem=" + this.clipsSubscriptionItem + ", clickToPromo=" + this.clickToPromo + ", clickToViewAnalytics=" + this.clickToViewAnalytics + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsGridItem(EventType eventType, ScreenType screenType, MobileOfficialAppsClipsStat$ClipsSubscriptionItem mobileOfficialAppsClipsStat$ClipsSubscriptionItem, MobileOfficialAppsClipsStat$ClipsPromoItem mobileOfficialAppsClipsStat$ClipsPromoItem, MobileOfficialAppsClipsStat$ClipsAnalyticsItem mobileOfficialAppsClipsStat$ClipsAnalyticsItem, int i, zcl zclVar) {
        this(eventType, screenType, (i & 4) != 0 ? null : mobileOfficialAppsClipsStat$ClipsSubscriptionItem, (i & 8) != 0 ? null : mobileOfficialAppsClipsStat$ClipsPromoItem, (i & 16) != 0 ? null : mobileOfficialAppsClipsStat$ClipsAnalyticsItem);
    }
}
