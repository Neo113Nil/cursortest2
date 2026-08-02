package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$NavigationEvent {

    @pmi0("navigation_event_type")
    private final NavigationEventType navigationEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class NavigationEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NavigationEventType[] $VALUES;

        @pmi0("click_to_channel")
        public static final NavigationEventType CLICK_TO_CHANNEL;

        @pmi0("click_to_clip")
        public static final NavigationEventType CLICK_TO_CLIP;

        @pmi0("click_to_clip_icon")
        public static final NavigationEventType CLICK_TO_CLIP_ICON;

        @pmi0("click_to_drafts")
        public static final NavigationEventType CLICK_TO_DRAFTS;

        @pmi0("click_to_gallery")
        public static final NavigationEventType CLICK_TO_GALLERY;

        @pmi0("click_to_gallery_icon")
        public static final NavigationEventType CLICK_TO_GALLERY_ICON;

        @pmi0("click_to_live")
        public static final NavigationEventType CLICK_TO_LIVE;

        @pmi0("click_to_live_icon")
        public static final NavigationEventType CLICK_TO_LIVE_ICON;

        @pmi0("click_to_more")
        public static final NavigationEventType CLICK_TO_MORE;

        @pmi0("click_to_plus")
        public static final NavigationEventType CLICK_TO_PLUS;

        @pmi0("click_to_postponed")
        public static final NavigationEventType CLICK_TO_POSTPONED;

        @pmi0("click_to_story")
        public static final NavigationEventType CLICK_TO_STORY;

        @pmi0("click_to_story_icon")
        public static final NavigationEventType CLICK_TO_STORY_ICON;

        @pmi0("click_to_suggest")
        public static final NavigationEventType CLICK_TO_SUGGEST;

        @pmi0("click_to_textlive")
        public static final NavigationEventType CLICK_TO_TEXTLIVE;

        @pmi0("click_to_unpublished")
        public static final NavigationEventType CLICK_TO_UNPUBLISHED;

        @pmi0("click_to_video")
        public static final NavigationEventType CLICK_TO_VIDEO;

        @pmi0("click_to_video_icon")
        public static final NavigationEventType CLICK_TO_VIDEO_ICON;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final NavigationEventType CLOSE;

        @pmi0("close_posting_from_plus")
        public static final NavigationEventType CLOSE_POSTING_FROM_PLUS;

        @pmi0("edit_postponed_post")
        public static final NavigationEventType EDIT_POSTPONED_POST;

        @pmi0("edit_published_post")
        public static final NavigationEventType EDIT_PUBLISHED_POST;

        @pmi0("exit_posting")
        public static final NavigationEventType EXIT_POSTING;

        @pmi0("go_stage_1")
        public static final NavigationEventType GO_STAGE_1;

        @pmi0("go_stage_2")
        public static final NavigationEventType GO_STAGE_2;

        @pmi0("open")
        public static final NavigationEventType OPEN;

        @pmi0("open_posting_from_plus")
        public static final NavigationEventType OPEN_POSTING_FROM_PLUS;

        @pmi0("post_coowner_slave")
        public static final NavigationEventType POST_COOWNER_SLAVE;

        @pmi0("post_now")
        public static final NavigationEventType POST_NOW;

        @pmi0("post_postponed")
        public static final NavigationEventType POST_POSTPONED;

        static {
            NavigationEventType navigationEventType = new NavigationEventType("OPEN", 0);
            OPEN = navigationEventType;
            NavigationEventType navigationEventType2 = new NavigationEventType("CLOSE", 1);
            CLOSE = navigationEventType2;
            NavigationEventType navigationEventType3 = new NavigationEventType("EXIT_POSTING", 2);
            EXIT_POSTING = navigationEventType3;
            NavigationEventType navigationEventType4 = new NavigationEventType("CLICK_TO_STORY_ICON", 3);
            CLICK_TO_STORY_ICON = navigationEventType4;
            NavigationEventType navigationEventType5 = new NavigationEventType("CLICK_TO_CLIP_ICON", 4);
            CLICK_TO_CLIP_ICON = navigationEventType5;
            NavigationEventType navigationEventType6 = new NavigationEventType("CLICK_TO_LIVE_ICON", 5);
            CLICK_TO_LIVE_ICON = navigationEventType6;
            NavigationEventType navigationEventType7 = new NavigationEventType("CLICK_TO_GALLERY_ICON", 6);
            CLICK_TO_GALLERY_ICON = navigationEventType7;
            NavigationEventType navigationEventType8 = new NavigationEventType("OPEN_POSTING_FROM_PLUS", 7);
            OPEN_POSTING_FROM_PLUS = navigationEventType8;
            NavigationEventType navigationEventType9 = new NavigationEventType("CLOSE_POSTING_FROM_PLUS", 8);
            CLOSE_POSTING_FROM_PLUS = navigationEventType9;
            NavigationEventType navigationEventType10 = new NavigationEventType("CLICK_TO_PLUS", 9);
            CLICK_TO_PLUS = navigationEventType10;
            NavigationEventType navigationEventType11 = new NavigationEventType("CLICK_TO_MORE", 10);
            CLICK_TO_MORE = navigationEventType11;
            NavigationEventType navigationEventType12 = new NavigationEventType("CLICK_TO_TEXTLIVE", 11);
            CLICK_TO_TEXTLIVE = navigationEventType12;
            NavigationEventType navigationEventType13 = new NavigationEventType("CLICK_TO_LIVE", 12);
            CLICK_TO_LIVE = navigationEventType13;
            NavigationEventType navigationEventType14 = new NavigationEventType("CLICK_TO_GALLERY", 13);
            CLICK_TO_GALLERY = navigationEventType14;
            NavigationEventType navigationEventType15 = new NavigationEventType("CLICK_TO_STORY", 14);
            CLICK_TO_STORY = navigationEventType15;
            NavigationEventType navigationEventType16 = new NavigationEventType("CLICK_TO_CLIP", 15);
            CLICK_TO_CLIP = navigationEventType16;
            NavigationEventType navigationEventType17 = new NavigationEventType("CLICK_TO_CHANNEL", 16);
            CLICK_TO_CHANNEL = navigationEventType17;
            NavigationEventType navigationEventType18 = new NavigationEventType("EDIT_PUBLISHED_POST", 17);
            EDIT_PUBLISHED_POST = navigationEventType18;
            NavigationEventType navigationEventType19 = new NavigationEventType("EDIT_POSTPONED_POST", 18);
            EDIT_POSTPONED_POST = navigationEventType19;
            NavigationEventType navigationEventType20 = new NavigationEventType("CLICK_TO_VIDEO", 19);
            CLICK_TO_VIDEO = navigationEventType20;
            NavigationEventType navigationEventType21 = new NavigationEventType("CLICK_TO_VIDEO_ICON", 20);
            CLICK_TO_VIDEO_ICON = navigationEventType21;
            NavigationEventType navigationEventType22 = new NavigationEventType("GO_STAGE_1", 21);
            GO_STAGE_1 = navigationEventType22;
            NavigationEventType navigationEventType23 = new NavigationEventType("GO_STAGE_2", 22);
            GO_STAGE_2 = navigationEventType23;
            NavigationEventType navigationEventType24 = new NavigationEventType("POST_NOW", 23);
            POST_NOW = navigationEventType24;
            NavigationEventType navigationEventType25 = new NavigationEventType("POST_POSTPONED", 24);
            POST_POSTPONED = navigationEventType25;
            NavigationEventType navigationEventType26 = new NavigationEventType("POST_COOWNER_SLAVE", 25);
            POST_COOWNER_SLAVE = navigationEventType26;
            NavigationEventType navigationEventType27 = new NavigationEventType("CLICK_TO_UNPUBLISHED", 26);
            CLICK_TO_UNPUBLISHED = navigationEventType27;
            NavigationEventType navigationEventType28 = new NavigationEventType("CLICK_TO_DRAFTS", 27);
            CLICK_TO_DRAFTS = navigationEventType28;
            NavigationEventType navigationEventType29 = new NavigationEventType("CLICK_TO_POSTPONED", 28);
            CLICK_TO_POSTPONED = navigationEventType29;
            NavigationEventType navigationEventType30 = new NavigationEventType("CLICK_TO_SUGGEST", 29);
            CLICK_TO_SUGGEST = navigationEventType30;
            NavigationEventType[] navigationEventTypeArr = {navigationEventType, navigationEventType2, navigationEventType3, navigationEventType4, navigationEventType5, navigationEventType6, navigationEventType7, navigationEventType8, navigationEventType9, navigationEventType10, navigationEventType11, navigationEventType12, navigationEventType13, navigationEventType14, navigationEventType15, navigationEventType16, navigationEventType17, navigationEventType18, navigationEventType19, navigationEventType20, navigationEventType21, navigationEventType22, navigationEventType23, navigationEventType24, navigationEventType25, navigationEventType26, navigationEventType27, navigationEventType28, navigationEventType29, navigationEventType30};
            $VALUES = navigationEventTypeArr;
            $ENTRIES = new asp(navigationEventTypeArr);
        }

        private NavigationEventType(String str, int i) {
        }

        public static NavigationEventType valueOf(String str) {
            return (NavigationEventType) Enum.valueOf(NavigationEventType.class, str);
        }

        public static NavigationEventType[] values() {
            return (NavigationEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$NavigationEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPostingStat$NavigationEvent) && this.navigationEventType == ((MobileOfficialAppsConPostingStat$NavigationEvent) obj).navigationEventType;
    }

    public final int hashCode() {
        NavigationEventType navigationEventType = this.navigationEventType;
        if (navigationEventType == null) {
            return 0;
        }
        return navigationEventType.hashCode();
    }

    public final String toString() {
        return "NavigationEvent(navigationEventType=" + this.navigationEventType + ')';
    }

    public MobileOfficialAppsConPostingStat$NavigationEvent(NavigationEventType navigationEventType) {
        this.navigationEventType = navigationEventType;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$NavigationEvent(NavigationEventType navigationEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : navigationEventType);
    }
}
