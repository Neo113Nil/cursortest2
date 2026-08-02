package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesFeatures.kt */
/* loaded from: classes11.dex */
public final class StoriesFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesFeatures[] $VALUES;
    public static final StoriesFeatures ADDITIONAL_MUSIC_STICKER;
    public static final StoriesFeatures CHANGE_ANIMATION_SPEED;
    public static final StoriesFeatures COLLAGES_UPDATE;
    public static final StoriesFeatures EDITOR_RESTORE_ON_RESUME;
    public static final StoriesFeatures FRIENDS_SELECTION_TO_FILE;
    public static final StoriesFeatures IDEAS_STORY_VIEWER;
    public static final StoriesFeatures IGNORE_MARK_SKIPPED;
    public static final StoriesFeatures NEW_DISCOVER_ICON;
    public static final StoriesFeatures NEW_PRELOADER;
    public static final StoriesFeatures OPTIMIZE_PLAYERS_RELEASE;
    public static final StoriesFeatures REMOVE_HIDE_DISCOVER;
    public static final StoriesFeatures SAFE_UPDATE;
    public static final StoriesFeatures SKIP_CAMERA_ON_REPOST;
    public static final StoriesFeatures STORY_VIEWER_OPTIMIZED_INITIAL;
    public static final StoriesFeatures ST_ANIM_OPTIMIZATION;
    public static final StoriesFeatures ST_AUDIO_TRACK;
    public static final StoriesFeatures ST_FIRST_FRAME_WARMUP;
    public static final StoriesFeatures ST_NEW_REACTIONS;
    public static final StoriesFeatures ST_NEW_TEMPLATE_BADGE;
    public static final StoriesFeatures ST_PHONE_BOOK_STORIES;
    public static final StoriesFeatures ST_POST_AUTOREPOST_GRID;
    public static final StoriesFeatures ST_PRELOAD_ONLY_ACTIVE_USERS;
    public static final StoriesFeatures ST_PROFILE_DISCOVER_BLOCK;
    public static final StoriesFeatures ST_REACTION_STICKER;
    public static final StoriesFeatures ST_REACTION_STICKER_VIEWER;
    public static final StoriesFeatures ST_STORY_FEED_NEW_DESIGN;
    public static final StoriesFeatures ST_STORY_LIFETIME_48;
    public static final StoriesFeatures ST_STORY_LIFETIME_COMM_48;
    public static final StoriesFeatures ST_STORY_LIFETIME_SAVE;
    public static final StoriesFeatures ST_TAB_STYLE_PICKER;
    public static final StoriesFeatures ST_VIDEO_PRELOADER_PART;
    public static final StoriesFeatures ST_VIDEO_UPLOAD_CODEGEN;
    public static final StoriesFeatures TRIM_VIDEO;
    public static final StoriesFeatures VERTICALIZATION;
    private final String key;

    static {
        StoriesFeatures storiesFeatures = new StoriesFeatures("STORY_VIEWER_OPTIMIZED_INITIAL", 0, "st_viewer_optimized_initial");
        STORY_VIEWER_OPTIMIZED_INITIAL = storiesFeatures;
        StoriesFeatures storiesFeatures2 = new StoriesFeatures("NEW_PRELOADER", 1, "st_new_preloader");
        NEW_PRELOADER = storiesFeatures2;
        StoriesFeatures storiesFeatures3 = new StoriesFeatures("VERTICALIZATION", 2, "st_verticalization");
        VERTICALIZATION = storiesFeatures3;
        StoriesFeatures storiesFeatures4 = new StoriesFeatures("SKIP_CAMERA_ON_REPOST", 3, "st_skip_camera_on_repost");
        SKIP_CAMERA_ON_REPOST = storiesFeatures4;
        StoriesFeatures storiesFeatures5 = new StoriesFeatures("EDITOR_RESTORE_ON_RESUME", 4, "st_editor_restore_on_resume");
        EDITOR_RESTORE_ON_RESUME = storiesFeatures5;
        StoriesFeatures storiesFeatures6 = new StoriesFeatures("ST_VIDEO_PRELOADER_PART", 5, "st_video_preload_part");
        ST_VIDEO_PRELOADER_PART = storiesFeatures6;
        StoriesFeatures storiesFeatures7 = new StoriesFeatures("ST_ANIM_OPTIMIZATION", 6, "st_anim_optimization");
        ST_ANIM_OPTIMIZATION = storiesFeatures7;
        StoriesFeatures storiesFeatures8 = new StoriesFeatures("ST_FIRST_FRAME_WARMUP", 7, "st_first_frame_warmup");
        ST_FIRST_FRAME_WARMUP = storiesFeatures8;
        StoriesFeatures storiesFeatures9 = new StoriesFeatures("ST_STORY_FEED_NEW_DESIGN", 8, "st_story_feed_new_design");
        ST_STORY_FEED_NEW_DESIGN = storiesFeatures9;
        StoriesFeatures storiesFeatures10 = new StoriesFeatures("ST_PRELOAD_ONLY_ACTIVE_USERS", 9, "st_preload_only_active_users");
        ST_PRELOAD_ONLY_ACTIVE_USERS = storiesFeatures10;
        StoriesFeatures storiesFeatures11 = new StoriesFeatures("ADDITIONAL_MUSIC_STICKER", 10, "st_additional_music_sticker");
        ADDITIONAL_MUSIC_STICKER = storiesFeatures11;
        StoriesFeatures storiesFeatures12 = new StoriesFeatures("OPTIMIZE_PLAYERS_RELEASE", 11, "st_optimize_players_release");
        OPTIMIZE_PLAYERS_RELEASE = storiesFeatures12;
        StoriesFeatures storiesFeatures13 = new StoriesFeatures("ST_TAB_STYLE_PICKER", 12, "st_tab_style_picker");
        ST_TAB_STYLE_PICKER = storiesFeatures13;
        StoriesFeatures storiesFeatures14 = new StoriesFeatures("ST_NEW_REACTIONS", 13, "st_new_reactions");
        ST_NEW_REACTIONS = storiesFeatures14;
        StoriesFeatures storiesFeatures15 = new StoriesFeatures("SAFE_UPDATE", 14, "st_safe_update");
        SAFE_UPDATE = storiesFeatures15;
        StoriesFeatures storiesFeatures16 = new StoriesFeatures("ST_PROFILE_DISCOVER_BLOCK", 15, "st_profile_discover_block");
        ST_PROFILE_DISCOVER_BLOCK = storiesFeatures16;
        StoriesFeatures storiesFeatures17 = new StoriesFeatures("FRIENDS_SELECTION_TO_FILE", 16, "st_friends_selection_to_file");
        FRIENDS_SELECTION_TO_FILE = storiesFeatures17;
        StoriesFeatures storiesFeatures18 = new StoriesFeatures("ST_STORY_LIFETIME_48", 17, "st_story_lifetime_48");
        ST_STORY_LIFETIME_48 = storiesFeatures18;
        StoriesFeatures storiesFeatures19 = new StoriesFeatures("ST_STORY_LIFETIME_COMM_48", 18, "st_story_lifetime_comm_48");
        ST_STORY_LIFETIME_COMM_48 = storiesFeatures19;
        StoriesFeatures storiesFeatures20 = new StoriesFeatures("ST_STORY_LIFETIME_SAVE", 19, "st_story_lifetime_save");
        ST_STORY_LIFETIME_SAVE = storiesFeatures20;
        StoriesFeatures storiesFeatures21 = new StoriesFeatures("ST_NEW_TEMPLATE_BADGE", 20, "st_new_template_badge");
        ST_NEW_TEMPLATE_BADGE = storiesFeatures21;
        StoriesFeatures storiesFeatures22 = new StoriesFeatures("ST_PHONE_BOOK_STORIES", 21, "st_phone_book_stories");
        ST_PHONE_BOOK_STORIES = storiesFeatures22;
        StoriesFeatures storiesFeatures23 = new StoriesFeatures("ST_REACTION_STICKER", 22, "st_reaction_sticker");
        ST_REACTION_STICKER = storiesFeatures23;
        StoriesFeatures storiesFeatures24 = new StoriesFeatures("ST_REACTION_STICKER_VIEWER", 23, "st_reaction_sticker_viewer");
        ST_REACTION_STICKER_VIEWER = storiesFeatures24;
        StoriesFeatures storiesFeatures25 = new StoriesFeatures("ST_AUDIO_TRACK", 24, "st_audio_track");
        ST_AUDIO_TRACK = storiesFeatures25;
        StoriesFeatures storiesFeatures26 = new StoriesFeatures("NEW_DISCOVER_ICON", 25, "st_new_discover_icon");
        NEW_DISCOVER_ICON = storiesFeatures26;
        StoriesFeatures storiesFeatures27 = new StoriesFeatures("COLLAGES_UPDATE", 26, "st_collages_update");
        COLLAGES_UPDATE = storiesFeatures27;
        StoriesFeatures storiesFeatures28 = new StoriesFeatures("IDEAS_STORY_VIEWER", 27, "st_ideas_story_viewer");
        IDEAS_STORY_VIEWER = storiesFeatures28;
        StoriesFeatures storiesFeatures29 = new StoriesFeatures("IGNORE_MARK_SKIPPED", 28, "st_ignore_mark_skipped");
        IGNORE_MARK_SKIPPED = storiesFeatures29;
        StoriesFeatures storiesFeatures30 = new StoriesFeatures("ST_POST_AUTOREPOST_GRID", 29, "st_post_autorepost_grid");
        ST_POST_AUTOREPOST_GRID = storiesFeatures30;
        StoriesFeatures storiesFeatures31 = new StoriesFeatures("ST_VIDEO_UPLOAD_CODEGEN", 30, "st_video_upload_codegen");
        ST_VIDEO_UPLOAD_CODEGEN = storiesFeatures31;
        StoriesFeatures storiesFeatures32 = new StoriesFeatures("TRIM_VIDEO", 31, "st_trim_video");
        TRIM_VIDEO = storiesFeatures32;
        StoriesFeatures storiesFeatures33 = new StoriesFeatures("REMOVE_HIDE_DISCOVER", 32, "st_remove_hide_discover");
        REMOVE_HIDE_DISCOVER = storiesFeatures33;
        StoriesFeatures storiesFeatures34 = new StoriesFeatures("CHANGE_ANIMATION_SPEED", 33, "st_change_animation_speed");
        CHANGE_ANIMATION_SPEED = storiesFeatures34;
        StoriesFeatures[] storiesFeaturesArr = {storiesFeatures, storiesFeatures2, storiesFeatures3, storiesFeatures4, storiesFeatures5, storiesFeatures6, storiesFeatures7, storiesFeatures8, storiesFeatures9, storiesFeatures10, storiesFeatures11, storiesFeatures12, storiesFeatures13, storiesFeatures14, storiesFeatures15, storiesFeatures16, storiesFeatures17, storiesFeatures18, storiesFeatures19, storiesFeatures20, storiesFeatures21, storiesFeatures22, storiesFeatures23, storiesFeatures24, storiesFeatures25, storiesFeatures26, storiesFeatures27, storiesFeatures28, storiesFeatures29, storiesFeatures30, storiesFeatures31, storiesFeatures32, storiesFeatures33, storiesFeatures34};
        $VALUES = storiesFeaturesArr;
        $ENTRIES = new asp(storiesFeaturesArr);
    }

    public StoriesFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<StoriesFeatures> i() {
        return $ENTRIES;
    }

    public static StoriesFeatures valueOf(String str) {
        return (StoriesFeatures) Enum.valueOf(StoriesFeatures.class, str);
    }

    public static StoriesFeatures[] values() {
        return (StoriesFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
