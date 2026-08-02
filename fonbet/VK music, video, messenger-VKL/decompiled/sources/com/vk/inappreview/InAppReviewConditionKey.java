package com.vk.inappreview;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppReviewConditionKey.kt */
/* loaded from: classes2.dex */
public final class InAppReviewConditionKey {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InAppReviewConditionKey[] $VALUES;
    public static final InAppReviewConditionKey ADD_5_CHANGED_AND_SAVE_VMOJI;
    public static final InAppReviewConditionKey ADD_MUSIC_ALBUM_WITH_SUBSCRIPTION;
    public static final InAppReviewConditionKey ADD_POST_BY_ADMIN;
    public static final InAppReviewConditionKey BUY_GIFT_OR_PACK;
    public static final InAppReviewConditionKey CREATE_FOLDER;
    public static final a Companion;
    public static final InAppReviewConditionKey ENOUGH_INTERACTIONS_IN_VIDEO;
    public static final String KEY_CHECK_COUNTER = "SendMessagesConditionChecker_check_counter";
    public static final InAppReviewConditionKey LIKE_3_MORE_POSTS;
    public static final InAppReviewConditionKey LOAD_3_MORE_GAMES;
    public static final InAppReviewConditionKey LOAD_3_MORE_PHOTOS;
    public static final InAppReviewConditionKey LOAD_3_USER_PROFILE_COVER;
    public static final InAppReviewConditionKey MINIAPP_IN_APP_REVIEW_BRIDGE;
    public static final InAppReviewConditionKey OPEN_3_NEW_GIFT_FROM_MESSENGER;
    public static final InAppReviewConditionKey OPEN_3_NEW_GIFT_FROM_NOTIFICATION;
    public static final InAppReviewConditionKey REFRESH_FEED_3_TIMES_AND_WATCH_GARLAND;
    public static final InAppReviewConditionKey REQUEST_AUDIO_MSG_TRANSCRIPTION;
    public static final InAppReviewConditionKey SEND_IM_REACTIONS;
    public static final InAppReviewConditionKey SEND_MESSAGE;
    public static final InAppReviewConditionKey SEND_VIDEO_OR_AUDIO_MESSAGES;
    public static final InAppReviewConditionKey SWITCH_DARK_THEME;
    private final String toggleValue;

    /* compiled from: InAppReviewConditionKey.kt */
    public static final class a {
    }

    static {
        InAppReviewConditionKey inAppReviewConditionKey = new InAppReviewConditionKey("LOAD_3_MORE_PHOTOS", 0, "load_3_more_photos");
        LOAD_3_MORE_PHOTOS = inAppReviewConditionKey;
        InAppReviewConditionKey inAppReviewConditionKey2 = new InAppReviewConditionKey("LOAD_3_MORE_GAMES", 1, "load_3_more_games");
        LOAD_3_MORE_GAMES = inAppReviewConditionKey2;
        InAppReviewConditionKey inAppReviewConditionKey3 = new InAppReviewConditionKey("SWITCH_DARK_THEME", 2, "switch_dark_theme");
        SWITCH_DARK_THEME = inAppReviewConditionKey3;
        InAppReviewConditionKey inAppReviewConditionKey4 = new InAppReviewConditionKey("LIKE_3_MORE_POSTS", 3, "like_3_more_posts");
        LIKE_3_MORE_POSTS = inAppReviewConditionKey4;
        InAppReviewConditionKey inAppReviewConditionKey5 = new InAppReviewConditionKey("ADD_POST_BY_ADMIN", 4, "add_post_by_admin");
        ADD_POST_BY_ADMIN = inAppReviewConditionKey5;
        InAppReviewConditionKey inAppReviewConditionKey6 = new InAppReviewConditionKey("ADD_MUSIC_ALBUM_WITH_SUBSCRIPTION", 5, "add_mus_album_with_subscription");
        ADD_MUSIC_ALBUM_WITH_SUBSCRIPTION = inAppReviewConditionKey6;
        InAppReviewConditionKey inAppReviewConditionKey7 = new InAppReviewConditionKey("BUY_GIFT_OR_PACK", 6, "buy_gift_or_pack");
        BUY_GIFT_OR_PACK = inAppReviewConditionKey7;
        InAppReviewConditionKey inAppReviewConditionKey8 = new InAppReviewConditionKey("OPEN_3_NEW_GIFT_FROM_NOTIFICATION", 7, "open_3_new_gift_from_notification");
        OPEN_3_NEW_GIFT_FROM_NOTIFICATION = inAppReviewConditionKey8;
        InAppReviewConditionKey inAppReviewConditionKey9 = new InAppReviewConditionKey("OPEN_3_NEW_GIFT_FROM_MESSENGER", 8, "open_3_new_gift_from_messenger");
        OPEN_3_NEW_GIFT_FROM_MESSENGER = inAppReviewConditionKey9;
        InAppReviewConditionKey inAppReviewConditionKey10 = new InAppReviewConditionKey("LOAD_3_USER_PROFILE_COVER", 9, "load_3_user_profile_cover");
        LOAD_3_USER_PROFILE_COVER = inAppReviewConditionKey10;
        InAppReviewConditionKey inAppReviewConditionKey11 = new InAppReviewConditionKey("REFRESH_FEED_3_TIMES_AND_WATCH_GARLAND", 10, "refresh_feed_3_times_and_watch_garland");
        REFRESH_FEED_3_TIMES_AND_WATCH_GARLAND = inAppReviewConditionKey11;
        InAppReviewConditionKey inAppReviewConditionKey12 = new InAppReviewConditionKey("ADD_5_CHANGED_AND_SAVE_VMOJI", 11, "add_5_changes_and_save_vmoji");
        ADD_5_CHANGED_AND_SAVE_VMOJI = inAppReviewConditionKey12;
        InAppReviewConditionKey inAppReviewConditionKey13 = new InAppReviewConditionKey("SEND_VIDEO_OR_AUDIO_MESSAGES", 12, "send_video_or_audio_messages");
        SEND_VIDEO_OR_AUDIO_MESSAGES = inAppReviewConditionKey13;
        InAppReviewConditionKey inAppReviewConditionKey14 = new InAppReviewConditionKey("SEND_IM_REACTIONS", 13, "send_im_reactions");
        SEND_IM_REACTIONS = inAppReviewConditionKey14;
        InAppReviewConditionKey inAppReviewConditionKey15 = new InAppReviewConditionKey("REQUEST_AUDIO_MSG_TRANSCRIPTION", 14, "request_audio_msg_transcription");
        REQUEST_AUDIO_MSG_TRANSCRIPTION = inAppReviewConditionKey15;
        InAppReviewConditionKey inAppReviewConditionKey16 = new InAppReviewConditionKey("CREATE_FOLDER", 15, "create_folder");
        CREATE_FOLDER = inAppReviewConditionKey16;
        InAppReviewConditionKey inAppReviewConditionKey17 = new InAppReviewConditionKey("SEND_MESSAGE", 16, "send_message");
        SEND_MESSAGE = inAppReviewConditionKey17;
        InAppReviewConditionKey inAppReviewConditionKey18 = new InAppReviewConditionKey("ENOUGH_INTERACTIONS_IN_VIDEO", 17, "enough_interactions_in_video");
        ENOUGH_INTERACTIONS_IN_VIDEO = inAppReviewConditionKey18;
        InAppReviewConditionKey inAppReviewConditionKey19 = new InAppReviewConditionKey("MINIAPP_IN_APP_REVIEW_BRIDGE", 18, "miniapp_in_app_review_bridge");
        MINIAPP_IN_APP_REVIEW_BRIDGE = inAppReviewConditionKey19;
        InAppReviewConditionKey[] inAppReviewConditionKeyArr = {inAppReviewConditionKey, inAppReviewConditionKey2, inAppReviewConditionKey3, inAppReviewConditionKey4, inAppReviewConditionKey5, inAppReviewConditionKey6, inAppReviewConditionKey7, inAppReviewConditionKey8, inAppReviewConditionKey9, inAppReviewConditionKey10, inAppReviewConditionKey11, inAppReviewConditionKey12, inAppReviewConditionKey13, inAppReviewConditionKey14, inAppReviewConditionKey15, inAppReviewConditionKey16, inAppReviewConditionKey17, inAppReviewConditionKey18, inAppReviewConditionKey19};
        $VALUES = inAppReviewConditionKeyArr;
        $ENTRIES = new asp(inAppReviewConditionKeyArr);
        Companion = new a();
    }

    public InAppReviewConditionKey(String str, int i, String str2) {
        this.toggleValue = str2;
    }

    public static InAppReviewConditionKey valueOf(String str) {
        return (InAppReviewConditionKey) Enum.valueOf(InAppReviewConditionKey.class, str);
    }

    public static InAppReviewConditionKey[] values() {
        return (InAppReviewConditionKey[]) $VALUES.clone();
    }

    public final String h() {
        return this.toggleValue;
    }
}
