package com.vk.ads.api.newsfeed;

import xsna.asp;
import xsna.zrp;

/* compiled from: WallAdsEasyPromoteUrlBuilder.kt */
/* loaded from: classes14.dex */
public interface WallAdsEasyPromoteUrlBuilder {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallAdsEasyPromoteUrlBuilder.kt */
    public static final class From {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ From[] $VALUES;
        public static final From COM_CLIP_ACTION_MENU;
        public static final From COM_CLIP_POPOVER;
        public static final From COM_POST_ACTION_MENU;
        public static final From COM_POST_POPOVER;
        public static final From PROFILE_CLIP_ACTION_MENU;
        public static final From PROFILE_CLIP_POPOVER;
        public static final From PROFILE_HEADER;
        public static final From PROFILE_POST_ACTION_MENU;
        public static final From PROFILE_POST_POPOVER;
        private final String value;

        static {
            From from = new From("PROFILE_HEADER", 0, "profile_header");
            PROFILE_HEADER = from;
            From from2 = new From("PROFILE_POST_ACTION_MENU", 1, "profile_post_action_menu");
            PROFILE_POST_ACTION_MENU = from2;
            From from3 = new From("PROFILE_POST_POPOVER", 2, "profile_post_popover");
            PROFILE_POST_POPOVER = from3;
            From from4 = new From("PROFILE_CLIP_ACTION_MENU", 3, "profile_clip_action_menu");
            PROFILE_CLIP_ACTION_MENU = from4;
            From from5 = new From("PROFILE_CLIP_POPOVER", 4, "profile_clip_popover");
            PROFILE_CLIP_POPOVER = from5;
            From from6 = new From("COM_POST_ACTION_MENU", 5, "community_post_action_menu");
            COM_POST_ACTION_MENU = from6;
            From from7 = new From("COM_POST_POPOVER", 6, "community_post_popover");
            COM_POST_POPOVER = from7;
            From from8 = new From("COM_CLIP_ACTION_MENU", 7, "community_clip_action_menu");
            COM_CLIP_ACTION_MENU = from8;
            From from9 = new From("COM_CLIP_POPOVER", 8, "community_clip_popover");
            COM_CLIP_POPOVER = from9;
            From[] fromArr = {from, from2, from3, from4, from5, from6, from7, from8, from9};
            $VALUES = fromArr;
            $ENTRIES = new asp(fromArr);
        }

        public From(String str, int i, String str2) {
            this.value = str2;
        }

        public static From valueOf(String str) {
            return (From) Enum.valueOf(From.class, str);
        }

        public static From[] values() {
            return (From[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    String a(String str, From from);

    String b(String str, From from);
}
