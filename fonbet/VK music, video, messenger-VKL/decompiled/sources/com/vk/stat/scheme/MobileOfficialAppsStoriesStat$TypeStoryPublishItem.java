package com.vk.stat.scheme;

import com.ironsource.C4504q2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStoriesStat$TypeStoryPublishItem implements SchemeStat$TypeAction.b {

    @pmi0("advice_type")
    private final MobileOfficialAppsStoriesStat$StoryAdviceType adviceType;

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("audio_owner_id")
    private final Long audioOwnerId;

    @pmi0("banner_id")
    private final Integer bannerId;

    @pmi0("battery")
    private final int battery;

    @pmi0("brightness")
    private final int brightness;

    @pmi0("camera_access_status")
    private final MobileOfficialAppsStoriesStat$PermissionAccessStatus cameraAccessStatus;

    @pmi0("camera_type")
    private final CameraType cameraType;

    @pmi0("clickable_stickers")
    private final List<MobileOfficialAppsStoriesStat$StoryClickableStickerItem> clickableStickers;

    @pmi0("countdown")
    private final Integer countdown;

    @pmi0("creation_entry_point")
    private final CreationEntryPoint creationEntryPoint;

    @pmi0("emojies")
    private final List<String> emojies;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("frames_count")
    private final Integer framesCount;

    @pmi0("gallery_access_status")
    private final MobileOfficialAppsStoriesStat$PermissionAccessStatus galleryAccessStatus;

    @pmi0("gallery_state")
    private final MobileOfficialAppsStoriesStat$StoryGalleryState galleryState;

    @pmi0("graffities")
    private final List<MobileOfficialAppsStoriesStat$StoryGraffitiItem> graffities;

    @pmi0("has_clickable_sticker")
    private final Boolean hasClickableSticker;

    @pmi0("has_emoji")
    private final Boolean hasEmoji;

    @pmi0("has_frontal_camera")
    private final boolean hasFrontalCamera;

    @pmi0("has_graffiti")
    private final Boolean hasGraffiti;

    @pmi0("has_mask")
    private final Boolean hasMask;

    @pmi0("has_sticker")
    private final Boolean hasSticker;

    @pmi0("has_text")
    private final Boolean hasText;

    @pmi0("hashtag_query_length")
    private final Integer hashtagQueryLength;

    @pmi0("hashtag_search_position")
    private final Integer hashtagSearchPosition;

    @pmi0("hashtags")
    private final List<String> hashtags;

    @pmi0("is_add_to_news")
    private final Boolean isAddToNews;

    @pmi0("is_audio_imported")
    private final Boolean isAudioImported;

    @pmi0("is_frontal_camera")
    private final boolean isFrontalCamera;

    @pmi0("is_light_on")
    private final boolean isLightOn;

    @pmi0("is_my_favorite_track")
    private final Integer isMyFavoriteTrack;

    @pmi0("is_sound_on")
    private final Boolean isSoundOn;

    @pmi0("is_story_teaser")
    private final Integer isStoryTeaser;

    @pmi0("mask_id")
    private final Integer maskId;

    @pmi0("mask_owner_id")
    private final Long maskOwnerId;

    @pmi0("mask_section")
    private final Integer maskSection;

    @pmi0("mask_status")
    private final MaskStatus maskStatus;

    @pmi0("music_volume")
    private final Integer musicVolume;

    @pmi0("network_signal_info")
    private final SchemeStat$NetworkSignalInfo networkSignalInfo;

    @pmi0("original_volume")
    private final Integer originalVolume;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("playlist_owner_id")
    private final Long playlistOwnerId;

    /* renamed from: receivers, reason: collision with root package name */
    @pmi0("receivers")
    private final List<Long> f96receivers;

    @pmi0("settings")
    private final List<MobileOfficialAppsStoriesStat$StorySettingItem> settings;

    @pmi0("stickers")
    private final List<MobileOfficialAppsStoriesStat$StoryStickerItem> stickers;

    @pmi0("story_mode")
    private final StoryMode storyMode;

    @pmi0("story_publisher_session")
    private final Long storyPublisherSession;

    @pmi0("story_teaser_type")
    private final StoryTeaserType storyTeaserType;

    @pmi0("story_type")
    private final StoryType storyType;

    @pmi0("subtype")
    private final Subtype subtype;

    @pmi0("texts")
    private final List<MobileOfficialAppsStoriesStat$StoryTextItem> texts;

    @pmi0("track_id")
    private final Integer trackId;

    @pmi0("video_clip_description")
    private final String videoClipDescription;

    @pmi0("video_duration_setting")
    private final VideoDurationSetting videoDurationSetting;

    @pmi0("video_filter")
    private final String videoFilter;

    @pmi0("video_filter_position")
    private final Integer videoFilterPosition;

    @pmi0(CampaignEx.JSON_KEY_VIDEO_LENGTHL)
    private final int videoLength;

    @pmi0("video_speed")
    private final VideoSpeed videoSpeed;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class CameraType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CameraType[] $VALUES;

        @pmi0("back")
        public static final CameraType BACK;

        @pmi0("front")
        public static final CameraType FRONT;

        @pmi0("gallery")
        public static final CameraType GALLERY;

        static {
            CameraType cameraType = new CameraType("FRONT", 0);
            FRONT = cameraType;
            CameraType cameraType2 = new CameraType("BACK", 1);
            BACK = cameraType2;
            CameraType cameraType3 = new CameraType("GALLERY", 2);
            GALLERY = cameraType3;
            CameraType[] cameraTypeArr = {cameraType, cameraType2, cameraType3};
            $VALUES = cameraTypeArr;
            $ENTRIES = new asp(cameraTypeArr);
        }

        private CameraType(String str, int i) {
        }

        public static CameraType valueOf(String str) {
            return (CameraType) Enum.valueOf(CameraType.class, str);
        }

        public static CameraType[] values() {
            return (CameraType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class CreationEntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CreationEntryPoint[] $VALUES;

        @pmi0("archive_empty_button")
        public static final CreationEntryPoint ARCHIVE_EMPTY_BUTTON;

        @pmi0("archive_menu_button")
        public static final CreationEntryPoint ARCHIVE_MENU_BUTTON;

        @pmi0("archive_sharing")
        public static final CreationEntryPoint ARCHIVE_SHARING;

        @pmi0("catalog_add")
        public static final CreationEntryPoint CATALOG_ADD;

        @pmi0("change_avatar")
        public static final CreationEntryPoint CHANGE_AVATAR;

        @pmi0("clips")
        public static final CreationEntryPoint CLIPS;

        @pmi0("clips_counter_stats")
        public static final CreationEntryPoint CLIPS_COUNTER_STATS;

        @pmi0("clips_fragment_speed_editor")
        public static final CreationEntryPoint CLIPS_FRAGMENT_SPEED_EDITOR;

        @pmi0("clips_grid_challenge")
        public static final CreationEntryPoint CLIPS_GRID_CHALLENGE;

        @pmi0("clips_grid_common_clips")
        public static final CreationEntryPoint CLIPS_GRID_COMMON_CLIPS;

        @pmi0("clips_grid_drafts")
        public static final CreationEntryPoint CLIPS_GRID_DRAFTS;

        @pmi0("clips_grid_effect")
        public static final CreationEntryPoint CLIPS_GRID_EFFECT;

        @pmi0("clips_grid_hashtag")
        public static final CreationEntryPoint CLIPS_GRID_HASHTAG;

        @pmi0("clips_grid_liked_clips")
        public static final CreationEntryPoint CLIPS_GRID_LIKED_CLIPS;

        @pmi0("clips_grid_lives")
        public static final CreationEntryPoint CLIPS_GRID_LIVES;

        @pmi0("clips_grid_mask")
        public static final CreationEntryPoint CLIPS_GRID_MASK;

        @pmi0("clips_grid_music")
        public static final CreationEntryPoint CLIPS_GRID_MUSIC;

        @pmi0("clips_grid_owner_clips")
        public static final CreationEntryPoint CLIPS_GRID_OWNER_CLIPS;

        @pmi0("clips_grid_sound")
        public static final CreationEntryPoint CLIPS_GRID_SOUND;

        @pmi0("clips_grid_tag")
        public static final CreationEntryPoint CLIPS_GRID_TAG;

        @pmi0("clips_viewer")
        public static final CreationEntryPoint CLIPS_VIEWER;

        @pmi0("clips_viewer_mask_modal_info")
        public static final CreationEntryPoint CLIPS_VIEWER_MASK_MODAL_INFO;

        @pmi0("clips_viewer_trend")
        public static final CreationEntryPoint CLIPS_VIEWER_TREND;

        @pmi0("clip_grid")
        public static final CreationEntryPoint CLIP_GRID;

        @pmi0("club_clips_button")
        public static final CreationEntryPoint CLUB_CLIPS_BUTTON;

        @pmi0("club_plus")
        public static final CreationEntryPoint CLUB_PLUS;

        @pmi0("club_plus_clips")
        public static final CreationEntryPoint CLUB_PLUS_CLIPS;

        @pmi0("community_avatar")
        public static final CreationEntryPoint COMMUNITY_AVATAR;

        @pmi0("community_creation_onboarding_block")
        public static final CreationEntryPoint COMMUNITY_CREATION_ONBOARDING_BLOCK;

        @pmi0("dialog")
        public static final CreationEntryPoint DIALOG;

        @pmi0("dialog_vkme")
        public static final CreationEntryPoint DIALOG_VKME;

        @pmi0("feed_camera")
        public static final CreationEntryPoint FEED_CAMERA;

        @pmi0("feed_gallery")
        public static final CreationEntryPoint FEED_GALLERY;

        @pmi0("feed_plus")
        public static final CreationEntryPoint FEED_PLUS;

        @pmi0("feed_plus_clips")
        public static final CreationEntryPoint FEED_PLUS_CLIPS;

        @pmi0("feed_plus_live")
        public static final CreationEntryPoint FEED_PLUS_LIVE;

        @pmi0("feed_text")
        public static final CreationEntryPoint FEED_TEXT;

        @pmi0("first_story_for_narrative")
        public static final CreationEntryPoint FIRST_STORY_FOR_NARRATIVE;

        @pmi0("from_clips_camera")
        public static final CreationEntryPoint FROM_CLIPS_CAMERA;

        @pmi0("from_clips_camera_camera")
        public static final CreationEntryPoint FROM_CLIPS_CAMERA_CAMERA;

        @pmi0("from_video")
        public static final CreationEntryPoint FROM_VIDEO;

        @pmi0("group_wall_button")
        public static final CreationEntryPoint GROUP_WALL_BUTTON;

        @pmi0("link")
        public static final CreationEntryPoint LINK;

        @pmi0("link_mask")
        public static final CreationEntryPoint LINK_MASK;

        @pmi0("message_repost")
        public static final CreationEntryPoint MESSAGE_REPOST;

        @pmi0("messenger_banner")
        public static final CreationEntryPoint MESSENGER_BANNER;

        @pmi0("mini_app")
        public static final CreationEntryPoint MINI_APP;

        @pmi0("music_cover_sharing")
        public static final CreationEntryPoint MUSIC_COVER_SHARING;

        @pmi0("my_clips_grid")
        public static final CreationEntryPoint MY_CLIPS_GRID;

        @pmi0("my_clips_list")
        public static final CreationEntryPoint MY_CLIPS_LIST;

        @pmi0("navigation_button")
        public static final CreationEntryPoint NAVIGATION_BUTTON;

        @pmi0("new_story_avatar")
        public static final CreationEntryPoint NEW_STORY_AVATAR;

        @pmi0(C4504q2.x)
        public static final CreationEntryPoint NOTIFICATIONS;

        @pmi0("photo_album")
        public static final CreationEntryPoint PHOTO_ALBUM;

        @pmi0("photo_profile")
        public static final CreationEntryPoint PHOTO_PROFILE;

        @pmi0("picker_banner")
        public static final CreationEntryPoint PICKER_BANNER;

        @pmi0("popular_templates_block")
        public static final CreationEntryPoint POPULAR_TEMPLATES_BLOCK;

        @pmi0("posting")
        public static final CreationEntryPoint POSTING;

        @pmi0("privacy_modal_window")
        public static final CreationEntryPoint PRIVACY_MODAL_WINDOW;

        @pmi0("profile_avatar")
        public static final CreationEntryPoint PROFILE_AVATAR;

        @pmi0("profile_button")
        public static final CreationEntryPoint PROFILE_BUTTON;

        @pmi0("profile_clips_button")
        public static final CreationEntryPoint PROFILE_CLIPS_BUTTON;

        @pmi0("profile_plus")
        public static final CreationEntryPoint PROFILE_PLUS;

        @pmi0("profile_plus_clips")
        public static final CreationEntryPoint PROFILE_PLUS_CLIPS;

        @pmi0("profile_plus_live")
        public static final CreationEntryPoint PROFILE_PLUS_LIVE;

        @pmi0("profile_question")
        public static final CreationEntryPoint PROFILE_QUESTION;

        @pmi0("public_clips_grid")
        public static final CreationEntryPoint PUBLIC_CLIPS_GRID;

        @pmi0("publishing_idea")
        public static final CreationEntryPoint PUBLISHING_IDEA;

        @pmi0("push_try_mask")
        public static final CreationEntryPoint PUSH_TRY_MASK;

        @pmi0("question_sticker")
        public static final CreationEntryPoint QUESTION_STICKER;

        @pmi0("recognize_block")
        public static final CreationEntryPoint RECOGNIZE_BLOCK;

        @pmi0("repost_auto_to_story_activity")
        public static final CreationEntryPoint REPOST_AUTO_TO_STORY_ACTIVITY;

        @pmi0("repost_to_story_activity")
        public static final CreationEntryPoint REPOST_TO_STORY_ACTIVITY;

        @pmi0("search_all")
        public static final CreationEntryPoint SEARCH_ALL;

        @pmi0("shortcut")
        public static final CreationEntryPoint SHORTCUT;

        @pmi0("sit_posting")
        public static final CreationEntryPoint SIT_POSTING;

        @pmi0("stories_feed")
        public static final CreationEntryPoint STORIES_FEED;

        @pmi0("stories_search_news")
        public static final CreationEntryPoint STORIES_SEARCH_NEWS;

        @pmi0("story_advice_avatar")
        public static final CreationEntryPoint STORY_ADVICE_AVATAR;

        @pmi0("story_advice_memories_friends")
        public static final CreationEntryPoint STORY_ADVICE_MEMORIES_FRIENDS;

        @pmi0("story_advice_memories_photo")
        public static final CreationEntryPoint STORY_ADVICE_MEMORIES_PHOTO;

        @pmi0("story_advice_memories_post")
        public static final CreationEntryPoint STORY_ADVICE_MEMORIES_POST;

        @pmi0("story_advice_memories_registered")
        public static final CreationEntryPoint STORY_ADVICE_MEMORIES_REGISTERED;

        @pmi0("story_advice_memories_story")
        public static final CreationEntryPoint STORY_ADVICE_MEMORIES_STORY;

        @pmi0("story_live_finished")
        public static final CreationEntryPoint STORY_LIVE_FINISHED;

        @pmi0("story_replies_list")
        public static final CreationEntryPoint STORY_REPLIES_LIST;

        @pmi0("story_reply")
        public static final CreationEntryPoint STORY_REPLY;

        @pmi0("story_repost")
        public static final CreationEntryPoint STORY_REPOST;

        @pmi0("story_repost_im")
        public static final CreationEntryPoint STORY_REPOST_IM;

        @pmi0("story_repost_notifications")
        public static final CreationEntryPoint STORY_REPOST_NOTIFICATIONS;

        @pmi0("story_viewer")
        public static final CreationEntryPoint STORY_VIEWER;

        @pmi0("story_viewer_camera_button")
        public static final CreationEntryPoint STORY_VIEWER_CAMERA_BUTTON;

        @pmi0("story_viewer_finished")
        public static final CreationEntryPoint STORY_VIEWER_FINISHED;

        @pmi0("story_viewer_music")
        public static final CreationEntryPoint STORY_VIEWER_MUSIC;

        @pmi0("story_viewer_music_sheet")
        public static final CreationEntryPoint STORY_VIEWER_MUSIC_SHEET;

        @pmi0("story_viewer_try_mask")
        public static final CreationEntryPoint STORY_VIEWER_TRY_MASK;

        @pmi0("story_viral")
        public static final CreationEntryPoint STORY_VIRAL;

        @pmi0("swipe")
        public static final CreationEntryPoint SWIPE;

        @pmi0("system_sharing")
        public static final CreationEntryPoint SYSTEM_SHARING;

        @pmi0("url")
        public static final CreationEntryPoint URL;

        @pmi0("viral_button")
        public static final CreationEntryPoint VIRAL_BUTTON;

        @pmi0("viral_template")
        public static final CreationEntryPoint VIRAL_TEMPLATE;

        static {
            CreationEntryPoint creationEntryPoint = new CreationEntryPoint("PHOTO_PROFILE", 0);
            PHOTO_PROFILE = creationEntryPoint;
            CreationEntryPoint creationEntryPoint2 = new CreationEntryPoint("PHOTO_ALBUM", 1);
            PHOTO_ALBUM = creationEntryPoint2;
            CreationEntryPoint creationEntryPoint3 = new CreationEntryPoint("CLIPS_GRID_HASHTAG", 2);
            CLIPS_GRID_HASHTAG = creationEntryPoint3;
            CreationEntryPoint creationEntryPoint4 = new CreationEntryPoint("MY_CLIPS_GRID", 3);
            MY_CLIPS_GRID = creationEntryPoint4;
            CreationEntryPoint creationEntryPoint5 = new CreationEntryPoint("PUBLIC_CLIPS_GRID", 4);
            PUBLIC_CLIPS_GRID = creationEntryPoint5;
            CreationEntryPoint creationEntryPoint6 = new CreationEntryPoint("PROFILE_CLIPS_BUTTON", 5);
            PROFILE_CLIPS_BUTTON = creationEntryPoint6;
            CreationEntryPoint creationEntryPoint7 = new CreationEntryPoint("CLUB_CLIPS_BUTTON", 6);
            CLUB_CLIPS_BUTTON = creationEntryPoint7;
            CreationEntryPoint creationEntryPoint8 = new CreationEntryPoint("SWIPE", 7);
            SWIPE = creationEntryPoint8;
            CreationEntryPoint creationEntryPoint9 = new CreationEntryPoint("NAVIGATION_BUTTON", 8);
            NAVIGATION_BUTTON = creationEntryPoint9;
            CreationEntryPoint creationEntryPoint10 = new CreationEntryPoint("SIT_POSTING", 9);
            SIT_POSTING = creationEntryPoint10;
            CreationEntryPoint creationEntryPoint11 = new CreationEntryPoint("LINK", 10);
            LINK = creationEntryPoint11;
            CreationEntryPoint creationEntryPoint12 = new CreationEntryPoint("STORY_REPLY", 11);
            STORY_REPLY = creationEntryPoint12;
            CreationEntryPoint creationEntryPoint13 = new CreationEntryPoint("STORY_REPOST", 12);
            STORY_REPOST = creationEntryPoint13;
            CreationEntryPoint creationEntryPoint14 = new CreationEntryPoint("CATALOG_ADD", 13);
            CATALOG_ADD = creationEntryPoint14;
            CreationEntryPoint creationEntryPoint15 = new CreationEntryPoint("DIALOG", 14);
            DIALOG = creationEntryPoint15;
            CreationEntryPoint creationEntryPoint16 = new CreationEntryPoint("STORY_LIVE_FINISHED", 15);
            STORY_LIVE_FINISHED = creationEntryPoint16;
            CreationEntryPoint creationEntryPoint17 = new CreationEntryPoint("DIALOG_VKME", 16);
            DIALOG_VKME = creationEntryPoint17;
            CreationEntryPoint creationEntryPoint18 = new CreationEntryPoint("STORY_VIEWER_FINISHED", 17);
            STORY_VIEWER_FINISHED = creationEntryPoint18;
            CreationEntryPoint creationEntryPoint19 = new CreationEntryPoint("PUSH_TRY_MASK", 18);
            PUSH_TRY_MASK = creationEntryPoint19;
            CreationEntryPoint creationEntryPoint20 = new CreationEntryPoint("STORY_VIEWER_TRY_MASK", 19);
            STORY_VIEWER_TRY_MASK = creationEntryPoint20;
            CreationEntryPoint creationEntryPoint21 = new CreationEntryPoint("LINK_MASK", 20);
            LINK_MASK = creationEntryPoint21;
            CreationEntryPoint creationEntryPoint22 = new CreationEntryPoint("POSTING", 21);
            POSTING = creationEntryPoint22;
            CreationEntryPoint creationEntryPoint23 = new CreationEntryPoint("NEW_STORY_AVATAR", 22);
            NEW_STORY_AVATAR = creationEntryPoint23;
            CreationEntryPoint creationEntryPoint24 = new CreationEntryPoint("STORY_REPLIES_LIST", 23);
            STORY_REPLIES_LIST = creationEntryPoint24;
            CreationEntryPoint creationEntryPoint25 = new CreationEntryPoint("STORIES_FEED", 24);
            STORIES_FEED = creationEntryPoint25;
            CreationEntryPoint creationEntryPoint26 = new CreationEntryPoint("STORIES_SEARCH_NEWS", 25);
            STORIES_SEARCH_NEWS = creationEntryPoint26;
            CreationEntryPoint creationEntryPoint27 = new CreationEntryPoint("ARCHIVE_EMPTY_BUTTON", 26);
            ARCHIVE_EMPTY_BUTTON = creationEntryPoint27;
            CreationEntryPoint creationEntryPoint28 = new CreationEntryPoint("ARCHIVE_MENU_BUTTON", 27);
            ARCHIVE_MENU_BUTTON = creationEntryPoint28;
            CreationEntryPoint creationEntryPoint29 = new CreationEntryPoint("ARCHIVE_SHARING", 28);
            ARCHIVE_SHARING = creationEntryPoint29;
            CreationEntryPoint creationEntryPoint30 = new CreationEntryPoint("QUESTION_STICKER", 29);
            QUESTION_STICKER = creationEntryPoint30;
            CreationEntryPoint creationEntryPoint31 = new CreationEntryPoint("SEARCH_ALL", 30);
            SEARCH_ALL = creationEntryPoint31;
            CreationEntryPoint creationEntryPoint32 = new CreationEntryPoint("PROFILE_BUTTON", 31);
            PROFILE_BUTTON = creationEntryPoint32;
            CreationEntryPoint creationEntryPoint33 = new CreationEntryPoint("PROFILE_PLUS", 32);
            PROFILE_PLUS = creationEntryPoint33;
            CreationEntryPoint creationEntryPoint34 = new CreationEntryPoint("MINI_APP", 33);
            MINI_APP = creationEntryPoint34;
            CreationEntryPoint creationEntryPoint35 = new CreationEntryPoint("NOTIFICATIONS", 34);
            NOTIFICATIONS = creationEntryPoint35;
            CreationEntryPoint creationEntryPoint36 = new CreationEntryPoint("URL", 35);
            URL = creationEntryPoint36;
            CreationEntryPoint creationEntryPoint37 = new CreationEntryPoint("STORY_VIEWER", 36);
            STORY_VIEWER = creationEntryPoint37;
            CreationEntryPoint creationEntryPoint38 = new CreationEntryPoint("STORY_VIEWER_CAMERA_BUTTON", 37);
            STORY_VIEWER_CAMERA_BUTTON = creationEntryPoint38;
            CreationEntryPoint creationEntryPoint39 = new CreationEntryPoint("STORY_VIEWER_MUSIC", 38);
            STORY_VIEWER_MUSIC = creationEntryPoint39;
            CreationEntryPoint creationEntryPoint40 = new CreationEntryPoint("STORY_VIEWER_MUSIC_SHEET", 39);
            STORY_VIEWER_MUSIC_SHEET = creationEntryPoint40;
            CreationEntryPoint creationEntryPoint41 = new CreationEntryPoint("MY_CLIPS_LIST", 40);
            MY_CLIPS_LIST = creationEntryPoint41;
            CreationEntryPoint creationEntryPoint42 = new CreationEntryPoint("MUSIC_COVER_SHARING", 41);
            MUSIC_COVER_SHARING = creationEntryPoint42;
            CreationEntryPoint creationEntryPoint43 = new CreationEntryPoint("CLIPS_VIEWER_MASK_MODAL_INFO", 42);
            CLIPS_VIEWER_MASK_MODAL_INFO = creationEntryPoint43;
            CreationEntryPoint creationEntryPoint44 = new CreationEntryPoint("CLIPS_VIEWER", 43);
            CLIPS_VIEWER = creationEntryPoint44;
            CreationEntryPoint creationEntryPoint45 = new CreationEntryPoint("CLIPS_VIEWER_TREND", 44);
            CLIPS_VIEWER_TREND = creationEntryPoint45;
            CreationEntryPoint creationEntryPoint46 = new CreationEntryPoint("CLIPS_FRAGMENT_SPEED_EDITOR", 45);
            CLIPS_FRAGMENT_SPEED_EDITOR = creationEntryPoint46;
            CreationEntryPoint creationEntryPoint47 = new CreationEntryPoint("CLIPS_GRID_MUSIC", 46);
            CLIPS_GRID_MUSIC = creationEntryPoint47;
            CreationEntryPoint creationEntryPoint48 = new CreationEntryPoint("CLIPS_GRID_SOUND", 47);
            CLIPS_GRID_SOUND = creationEntryPoint48;
            CreationEntryPoint creationEntryPoint49 = new CreationEntryPoint("CLIPS_GRID_TAG", 48);
            CLIPS_GRID_TAG = creationEntryPoint49;
            CreationEntryPoint creationEntryPoint50 = new CreationEntryPoint("CLIPS_GRID_CHALLENGE", 49);
            CLIPS_GRID_CHALLENGE = creationEntryPoint50;
            CreationEntryPoint creationEntryPoint51 = new CreationEntryPoint("CLIPS_GRID_EFFECT", 50);
            CLIPS_GRID_EFFECT = creationEntryPoint51;
            CreationEntryPoint creationEntryPoint52 = new CreationEntryPoint("CLIPS_GRID_MASK", 51);
            CLIPS_GRID_MASK = creationEntryPoint52;
            CreationEntryPoint creationEntryPoint53 = new CreationEntryPoint("CLIP_GRID", 52);
            CLIP_GRID = creationEntryPoint53;
            CreationEntryPoint creationEntryPoint54 = new CreationEntryPoint("CLIPS_GRID_COMMON_CLIPS", 53);
            CLIPS_GRID_COMMON_CLIPS = creationEntryPoint54;
            CreationEntryPoint creationEntryPoint55 = new CreationEntryPoint("CLIPS_GRID_OWNER_CLIPS", 54);
            CLIPS_GRID_OWNER_CLIPS = creationEntryPoint55;
            CreationEntryPoint creationEntryPoint56 = new CreationEntryPoint("CLIPS_GRID_DRAFTS", 55);
            CLIPS_GRID_DRAFTS = creationEntryPoint56;
            CreationEntryPoint creationEntryPoint57 = new CreationEntryPoint("CLIPS_GRID_LIVES", 56);
            CLIPS_GRID_LIVES = creationEntryPoint57;
            CreationEntryPoint creationEntryPoint58 = new CreationEntryPoint("CLIPS_GRID_LIKED_CLIPS", 57);
            CLIPS_GRID_LIKED_CLIPS = creationEntryPoint58;
            CreationEntryPoint creationEntryPoint59 = new CreationEntryPoint("CLIPS", 58);
            CLIPS = creationEntryPoint59;
            CreationEntryPoint creationEntryPoint60 = new CreationEntryPoint("POPULAR_TEMPLATES_BLOCK", 59);
            POPULAR_TEMPLATES_BLOCK = creationEntryPoint60;
            CreationEntryPoint creationEntryPoint61 = new CreationEntryPoint("CHANGE_AVATAR", 60);
            CHANGE_AVATAR = creationEntryPoint61;
            CreationEntryPoint creationEntryPoint62 = new CreationEntryPoint("STORY_ADVICE_MEMORIES_FRIENDS", 61);
            STORY_ADVICE_MEMORIES_FRIENDS = creationEntryPoint62;
            CreationEntryPoint creationEntryPoint63 = new CreationEntryPoint("STORY_ADVICE_MEMORIES_PHOTO", 62);
            STORY_ADVICE_MEMORIES_PHOTO = creationEntryPoint63;
            CreationEntryPoint creationEntryPoint64 = new CreationEntryPoint("STORY_ADVICE_MEMORIES_POST", 63);
            STORY_ADVICE_MEMORIES_POST = creationEntryPoint64;
            CreationEntryPoint creationEntryPoint65 = new CreationEntryPoint("STORY_ADVICE_MEMORIES_STORY", 64);
            STORY_ADVICE_MEMORIES_STORY = creationEntryPoint65;
            CreationEntryPoint creationEntryPoint66 = new CreationEntryPoint("STORY_ADVICE_MEMORIES_REGISTERED", 65);
            STORY_ADVICE_MEMORIES_REGISTERED = creationEntryPoint66;
            CreationEntryPoint creationEntryPoint67 = new CreationEntryPoint("STORY_ADVICE_AVATAR", 66);
            STORY_ADVICE_AVATAR = creationEntryPoint67;
            CreationEntryPoint creationEntryPoint68 = new CreationEntryPoint("RECOGNIZE_BLOCK", 67);
            RECOGNIZE_BLOCK = creationEntryPoint68;
            CreationEntryPoint creationEntryPoint69 = new CreationEntryPoint("FEED_GALLERY", 68);
            FEED_GALLERY = creationEntryPoint69;
            CreationEntryPoint creationEntryPoint70 = new CreationEntryPoint("FEED_CAMERA", 69);
            FEED_CAMERA = creationEntryPoint70;
            CreationEntryPoint creationEntryPoint71 = new CreationEntryPoint("FEED_TEXT", 70);
            FEED_TEXT = creationEntryPoint71;
            CreationEntryPoint creationEntryPoint72 = new CreationEntryPoint("FIRST_STORY_FOR_NARRATIVE", 71);
            FIRST_STORY_FOR_NARRATIVE = creationEntryPoint72;
            CreationEntryPoint creationEntryPoint73 = new CreationEntryPoint("PRIVACY_MODAL_WINDOW", 72);
            PRIVACY_MODAL_WINDOW = creationEntryPoint73;
            CreationEntryPoint creationEntryPoint74 = new CreationEntryPoint("FEED_PLUS_CLIPS", 73);
            FEED_PLUS_CLIPS = creationEntryPoint74;
            CreationEntryPoint creationEntryPoint75 = new CreationEntryPoint("CLUB_PLUS_CLIPS", 74);
            CLUB_PLUS_CLIPS = creationEntryPoint75;
            CreationEntryPoint creationEntryPoint76 = new CreationEntryPoint("PROFILE_PLUS_CLIPS", 75);
            PROFILE_PLUS_CLIPS = creationEntryPoint76;
            CreationEntryPoint creationEntryPoint77 = new CreationEntryPoint("FROM_CLIPS_CAMERA", 76);
            FROM_CLIPS_CAMERA = creationEntryPoint77;
            CreationEntryPoint creationEntryPoint78 = new CreationEntryPoint("FROM_VIDEO", 77);
            FROM_VIDEO = creationEntryPoint78;
            CreationEntryPoint creationEntryPoint79 = new CreationEntryPoint("FEED_PLUS_LIVE", 78);
            FEED_PLUS_LIVE = creationEntryPoint79;
            CreationEntryPoint creationEntryPoint80 = new CreationEntryPoint("PROFILE_PLUS_LIVE", 79);
            PROFILE_PLUS_LIVE = creationEntryPoint80;
            CreationEntryPoint creationEntryPoint81 = new CreationEntryPoint("FEED_PLUS", 80);
            FEED_PLUS = creationEntryPoint81;
            CreationEntryPoint creationEntryPoint82 = new CreationEntryPoint("CLUB_PLUS", 81);
            CLUB_PLUS = creationEntryPoint82;
            CreationEntryPoint creationEntryPoint83 = new CreationEntryPoint("GROUP_WALL_BUTTON", 82);
            GROUP_WALL_BUTTON = creationEntryPoint83;
            CreationEntryPoint creationEntryPoint84 = new CreationEntryPoint("REPOST_TO_STORY_ACTIVITY", 83);
            REPOST_TO_STORY_ACTIVITY = creationEntryPoint84;
            CreationEntryPoint creationEntryPoint85 = new CreationEntryPoint("REPOST_AUTO_TO_STORY_ACTIVITY", 84);
            REPOST_AUTO_TO_STORY_ACTIVITY = creationEntryPoint85;
            CreationEntryPoint creationEntryPoint86 = new CreationEntryPoint("SYSTEM_SHARING", 85);
            SYSTEM_SHARING = creationEntryPoint86;
            CreationEntryPoint creationEntryPoint87 = new CreationEntryPoint("PROFILE_QUESTION", 86);
            PROFILE_QUESTION = creationEntryPoint87;
            CreationEntryPoint creationEntryPoint88 = new CreationEntryPoint("FROM_CLIPS_CAMERA_CAMERA", 87);
            FROM_CLIPS_CAMERA_CAMERA = creationEntryPoint88;
            CreationEntryPoint creationEntryPoint89 = new CreationEntryPoint("CLIPS_COUNTER_STATS", 88);
            CLIPS_COUNTER_STATS = creationEntryPoint89;
            CreationEntryPoint creationEntryPoint90 = new CreationEntryPoint("PROFILE_AVATAR", 89);
            PROFILE_AVATAR = creationEntryPoint90;
            CreationEntryPoint creationEntryPoint91 = new CreationEntryPoint("COMMUNITY_AVATAR", 90);
            COMMUNITY_AVATAR = creationEntryPoint91;
            CreationEntryPoint creationEntryPoint92 = new CreationEntryPoint("SHORTCUT", 91);
            SHORTCUT = creationEntryPoint92;
            CreationEntryPoint creationEntryPoint93 = new CreationEntryPoint("STORY_REPOST_NOTIFICATIONS", 92);
            STORY_REPOST_NOTIFICATIONS = creationEntryPoint93;
            CreationEntryPoint creationEntryPoint94 = new CreationEntryPoint("STORY_REPOST_IM", 93);
            STORY_REPOST_IM = creationEntryPoint94;
            CreationEntryPoint creationEntryPoint95 = new CreationEntryPoint("COMMUNITY_CREATION_ONBOARDING_BLOCK", 94);
            COMMUNITY_CREATION_ONBOARDING_BLOCK = creationEntryPoint95;
            CreationEntryPoint creationEntryPoint96 = new CreationEntryPoint("MESSAGE_REPOST", 95);
            MESSAGE_REPOST = creationEntryPoint96;
            CreationEntryPoint creationEntryPoint97 = new CreationEntryPoint("VIRAL_TEMPLATE", 96);
            VIRAL_TEMPLATE = creationEntryPoint97;
            CreationEntryPoint creationEntryPoint98 = new CreationEntryPoint("STORY_VIRAL", 97);
            STORY_VIRAL = creationEntryPoint98;
            CreationEntryPoint creationEntryPoint99 = new CreationEntryPoint("PICKER_BANNER", 98);
            PICKER_BANNER = creationEntryPoint99;
            CreationEntryPoint creationEntryPoint100 = new CreationEntryPoint("MESSENGER_BANNER", 99);
            MESSENGER_BANNER = creationEntryPoint100;
            CreationEntryPoint creationEntryPoint101 = new CreationEntryPoint("PUBLISHING_IDEA", 100);
            PUBLISHING_IDEA = creationEntryPoint101;
            CreationEntryPoint creationEntryPoint102 = new CreationEntryPoint("VIRAL_BUTTON", 101);
            VIRAL_BUTTON = creationEntryPoint102;
            CreationEntryPoint[] creationEntryPointArr = {creationEntryPoint, creationEntryPoint2, creationEntryPoint3, creationEntryPoint4, creationEntryPoint5, creationEntryPoint6, creationEntryPoint7, creationEntryPoint8, creationEntryPoint9, creationEntryPoint10, creationEntryPoint11, creationEntryPoint12, creationEntryPoint13, creationEntryPoint14, creationEntryPoint15, creationEntryPoint16, creationEntryPoint17, creationEntryPoint18, creationEntryPoint19, creationEntryPoint20, creationEntryPoint21, creationEntryPoint22, creationEntryPoint23, creationEntryPoint24, creationEntryPoint25, creationEntryPoint26, creationEntryPoint27, creationEntryPoint28, creationEntryPoint29, creationEntryPoint30, creationEntryPoint31, creationEntryPoint32, creationEntryPoint33, creationEntryPoint34, creationEntryPoint35, creationEntryPoint36, creationEntryPoint37, creationEntryPoint38, creationEntryPoint39, creationEntryPoint40, creationEntryPoint41, creationEntryPoint42, creationEntryPoint43, creationEntryPoint44, creationEntryPoint45, creationEntryPoint46, creationEntryPoint47, creationEntryPoint48, creationEntryPoint49, creationEntryPoint50, creationEntryPoint51, creationEntryPoint52, creationEntryPoint53, creationEntryPoint54, creationEntryPoint55, creationEntryPoint56, creationEntryPoint57, creationEntryPoint58, creationEntryPoint59, creationEntryPoint60, creationEntryPoint61, creationEntryPoint62, creationEntryPoint63, creationEntryPoint64, creationEntryPoint65, creationEntryPoint66, creationEntryPoint67, creationEntryPoint68, creationEntryPoint69, creationEntryPoint70, creationEntryPoint71, creationEntryPoint72, creationEntryPoint73, creationEntryPoint74, creationEntryPoint75, creationEntryPoint76, creationEntryPoint77, creationEntryPoint78, creationEntryPoint79, creationEntryPoint80, creationEntryPoint81, creationEntryPoint82, creationEntryPoint83, creationEntryPoint84, creationEntryPoint85, creationEntryPoint86, creationEntryPoint87, creationEntryPoint88, creationEntryPoint89, creationEntryPoint90, creationEntryPoint91, creationEntryPoint92, creationEntryPoint93, creationEntryPoint94, creationEntryPoint95, creationEntryPoint96, creationEntryPoint97, creationEntryPoint98, creationEntryPoint99, creationEntryPoint100, creationEntryPoint101, creationEntryPoint102};
            $VALUES = creationEntryPointArr;
            $ENTRIES = new asp(creationEntryPointArr);
        }

        private CreationEntryPoint(String str, int i) {
        }

        public static zrp<CreationEntryPoint> h() {
            return $ENTRIES;
        }

        public static CreationEntryPoint valueOf(String str) {
            return (CreationEntryPoint) Enum.valueOf(CreationEntryPoint.class, str);
        }

        public static CreationEntryPoint[] values() {
            return (CreationEntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("activated_gesture")
        public static final EventType ACTIVATED_GESTURE;

        @pmi0("add_from_gallery")
        public static final EventType ADD_FROM_GALLERY;

        @pmi0("add_graffiti")
        public static final EventType ADD_GRAFFITI;

        @pmi0("add_photo_clipboard")
        public static final EventType ADD_PHOTO_CLIPBOARD;

        @pmi0("add_sticker")
        public static final EventType ADD_STICKER;

        @pmi0("add_text")
        public static final EventType ADD_TEXT;

        @pmi0("add_text_clipboard")
        public static final EventType ADD_TEXT_CLIPBOARD;

        @pmi0("apply_cover")
        public static final EventType APPLY_COVER;

        @pmi0("apply_graffiti")
        public static final EventType APPLY_GRAFFITI;

        @pmi0("apply_music_camera")
        public static final EventType APPLY_MUSIC_CAMERA;

        @pmi0("apply_music_editor")
        public static final EventType APPLY_MUSIC_EDITOR;

        @pmi0("camera_access_authorized")
        public static final EventType CAMERA_ACCESS_AUTHORIZED;

        @pmi0("camera_access_denied")
        public static final EventType CAMERA_ACCESS_DENIED;

        @pmi0("camera_access_requested")
        public static final EventType CAMERA_ACCESS_REQUESTED;

        @pmi0("camera_access_restricted")
        public static final EventType CAMERA_ACCESS_RESTRICTED;

        @pmi0("cancel_graffiti")
        public static final EventType CANCEL_GRAFFITI;

        @pmi0("cancel_mask_loading")
        public static final EventType CANCEL_MASK_LOADING;

        @pmi0("cancel_music_camera")
        public static final EventType CANCEL_MUSIC_CAMERA;

        @pmi0("cancel_music_editor")
        public static final EventType CANCEL_MUSIC_EDITOR;

        @pmi0("cancel_timer")
        public static final EventType CANCEL_TIMER;

        @pmi0("change_photo")
        public static final EventType CHANGE_PHOTO;

        @pmi0("change_settings")
        public static final EventType CHANGE_SETTINGS;

        @pmi0("change_time")
        public static final EventType CHANGE_TIME;

        @pmi0("change_volume")
        public static final EventType CHANGE_VOLUME;

        @pmi0("choose_receivers")
        public static final EventType CHOOSE_RECEIVERS;

        @pmi0("click_to_audio_title_camera")
        public static final EventType CLICK_TO_AUDIO_TITLE_CAMERA;

        @pmi0("click_to_audio_title_editor")
        public static final EventType CLICK_TO_AUDIO_TITLE_EDITOR;

        @pmi0("clips_cancel_timer_settings")
        public static final EventType CLIPS_CANCEL_TIMER_SETTINGS;

        @pmi0("clips_open_timer")
        public static final EventType CLIPS_OPEN_TIMER;

        @pmi0("clips_publish_with_timer")
        public static final EventType CLIPS_PUBLISH_WITH_TIMER;

        @pmi0("clips_start_timer")
        public static final EventType CLIPS_START_TIMER;

        @pmi0("close_camera")
        public static final EventType CLOSE_CAMERA;

        @pmi0("close_gallery")
        public static final EventType CLOSE_GALLERY;

        @pmi0("close_masks")
        public static final EventType CLOSE_MASKS;

        @pmi0("close_settings")
        public static final EventType CLOSE_SETTINGS;

        @pmi0("close_to_camera")
        public static final EventType CLOSE_TO_CAMERA;

        @pmi0("continue_recording")
        public static final EventType CONTINUE_RECORDING;

        @pmi0("cut_audio_camera")
        public static final EventType CUT_AUDIO_CAMERA;

        @pmi0("cut_audio_editor")
        public static final EventType CUT_AUDIO_EDITOR;

        @pmi0("deactivated_gesture")
        public static final EventType DEACTIVATED_GESTURE;

        @pmi0("delete_audio_camera")
        public static final EventType DELETE_AUDIO_CAMERA;

        @pmi0("delete_audio_editor")
        public static final EventType DELETE_AUDIO_EDITOR;

        @pmi0("delete_draft")
        public static final EventType DELETE_DRAFT;

        @pmi0("delete_graffiti")
        public static final EventType DELETE_GRAFFITI;

        @pmi0("delete_sticker")
        public static final EventType DELETE_STICKER;

        @pmi0("delete_text")
        public static final EventType DELETE_TEXT;

        @pmi0("edit_advertiser_mark")
        public static final EventType EDIT_ADVERTISER_MARK;

        @pmi0("edit_cover")
        public static final EventType EDIT_COVER;

        @pmi0("edit_photo_style")
        public static final EventType EDIT_PHOTO_STYLE;

        @pmi0("edit_sticker")
        public static final EventType EDIT_STICKER;

        @pmi0("edit_sticker_duration")
        public static final EventType EDIT_STICKER_DURATION;

        @pmi0("edit_text")
        public static final EventType EDIT_TEXT;

        @pmi0("end_video")
        public static final EventType END_VIDEO;

        @pmi0("focus")
        public static final EventType FOCUS;

        @pmi0("gallery_access_authorized")
        public static final EventType GALLERY_ACCESS_AUTHORIZED;

        @pmi0("gallery_access_denied")
        public static final EventType GALLERY_ACCESS_DENIED;

        @pmi0("gallery_access_requested")
        public static final EventType GALLERY_ACCESS_REQUESTED;

        @pmi0("gallery_access_restricted")
        public static final EventType GALLERY_ACCESS_RESTRICTED;

        @pmi0("gallery_files_counted")
        public static final EventType GALLERY_FILES_COUNTED;

        @pmi0("gallery_limited_access_authorized")
        public static final EventType GALLERY_LIMITED_ACCESS_AUTHORIZED;

        @pmi0("gallery_partial_access_authorized")
        public static final EventType GALLERY_PARTIAL_ACCESS_AUTHORIZED;

        @pmi0("geo_access_allow")
        public static final EventType GEO_ACCESS_ALLOW;

        @pmi0("geo_access_decline")
        public static final EventType GEO_ACCESS_DECLINE;

        @pmi0("gesture_popup_agreement")
        public static final EventType GESTURE_POPUP_AGREEMENT;

        @pmi0("go_to_editor")
        public static final EventType GO_TO_EDITOR;

        @pmi0("light_off")
        public static final EventType LIGHT_OFF;

        @pmi0("light_on")
        public static final EventType LIGHT_ON;

        @pmi0("mark_advertiser")
        public static final EventType MARK_ADVERTISER;

        @pmi0("mask_off")
        public static final EventType MASK_OFF;

        @pmi0("mask_on")
        public static final EventType MASK_ON;

        @pmi0("media_uploaded")
        public static final EventType MEDIA_UPLOADED;

        @pmi0("need_to_cut_video")
        public static final EventType NEED_TO_CUT_VIDEO;

        @pmi0("open_camera")
        public static final EventType OPEN_CAMERA;

        @pmi0("open_editor")
        public static final EventType OPEN_EDITOR;

        @pmi0("open_filter")
        public static final EventType OPEN_FILTER;

        @pmi0("open_gallery")
        public static final EventType OPEN_GALLERY;

        @pmi0("open_masks")
        public static final EventType OPEN_MASKS;

        @pmi0("open_music_camera")
        public static final EventType OPEN_MUSIC_CAMERA;

        @pmi0("open_music_editor")
        public static final EventType OPEN_MUSIC_EDITOR;

        @pmi0("open_settings")
        public static final EventType OPEN_SETTINGS;

        @pmi0("open_timer")
        public static final EventType OPEN_TIMER;

        @pmi0("open_video_speed")
        public static final EventType OPEN_VIDEO_SPEED;

        @pmi0("publish")
        public static final EventType PUBLISH;

        @pmi0("publish_now")
        public static final EventType PUBLISH_NOW;

        @pmi0("publish_to_dialog")
        public static final EventType PUBLISH_TO_DIALOG;

        @pmi0("publish_with_receivers")
        public static final EventType PUBLISH_WITH_RECEIVERS;

        @pmi0("save_draft")
        public static final EventType SAVE_DRAFT;

        @pmi0("save_story")
        public static final EventType SAVE_STORY;

        @pmi0("select_hashtag_hint")
        public static final EventType SELECT_HASHTAG_HINT;

        @pmi0("select_video_duration")
        public static final EventType SELECT_VIDEO_DURATION;

        @pmi0("sound_off")
        public static final EventType SOUND_OFF;

        @pmi0("sound_on")
        public static final EventType SOUND_ON;

        @pmi0("start_timer")
        public static final EventType START_TIMER;

        @pmi0("start_video")
        public static final EventType START_VIDEO;

        @pmi0("stickers_menu_closed")
        public static final EventType STICKERS_MENU_CLOSED;

        @pmi0("stickers_menu_open")
        public static final EventType STICKERS_MENU_OPEN;

        @pmi0("stickers_menu_sticker_clicked")
        public static final EventType STICKERS_MENU_STICKER_CLICKED;

        @pmi0("sticker_adding_canceled")
        public static final EventType STICKER_ADDING_CANCELED;

        @pmi0("switch_camera")
        public static final EventType SWITCH_CAMERA;

        @pmi0("video_duration_change")
        public static final EventType VIDEO_DURATION_CHANGE;

        @pmi0("video_duration_save")
        public static final EventType VIDEO_DURATION_SAVE;

        static {
            EventType eventType = new EventType("OPEN_CAMERA", 0);
            OPEN_CAMERA = eventType;
            EventType eventType2 = new EventType("FOCUS", 1);
            FOCUS = eventType2;
            EventType eventType3 = new EventType("OPEN_SETTINGS", 2);
            OPEN_SETTINGS = eventType3;
            EventType eventType4 = new EventType("CLOSE_SETTINGS", 3);
            CLOSE_SETTINGS = eventType4;
            EventType eventType5 = new EventType("CHANGE_SETTINGS", 4);
            CHANGE_SETTINGS = eventType5;
            EventType eventType6 = new EventType("OPEN_MASKS", 5);
            OPEN_MASKS = eventType6;
            EventType eventType7 = new EventType("CLOSE_MASKS", 6);
            CLOSE_MASKS = eventType7;
            EventType eventType8 = new EventType("MASK_ON", 7);
            MASK_ON = eventType8;
            EventType eventType9 = new EventType("SWITCH_CAMERA", 8);
            SWITCH_CAMERA = eventType9;
            EventType eventType10 = new EventType("CANCEL_MASK_LOADING", 9);
            CANCEL_MASK_LOADING = eventType10;
            EventType eventType11 = new EventType("MASK_OFF", 10);
            MASK_OFF = eventType11;
            EventType eventType12 = new EventType("CLOSE_CAMERA", 11);
            CLOSE_CAMERA = eventType12;
            EventType eventType13 = new EventType("LIGHT_ON", 12);
            LIGHT_ON = eventType13;
            EventType eventType14 = new EventType("LIGHT_OFF", 13);
            LIGHT_OFF = eventType14;
            EventType eventType15 = new EventType("OPEN_GALLERY", 14);
            OPEN_GALLERY = eventType15;
            EventType eventType16 = new EventType("CLOSE_GALLERY", 15);
            CLOSE_GALLERY = eventType16;
            EventType eventType17 = new EventType("ADD_FROM_GALLERY", 16);
            ADD_FROM_GALLERY = eventType17;
            EventType eventType18 = new EventType("NEED_TO_CUT_VIDEO", 17);
            NEED_TO_CUT_VIDEO = eventType18;
            EventType eventType19 = new EventType("START_VIDEO", 18);
            START_VIDEO = eventType19;
            EventType eventType20 = new EventType("END_VIDEO", 19);
            END_VIDEO = eventType20;
            EventType eventType21 = new EventType("SOUND_ON", 20);
            SOUND_ON = eventType21;
            EventType eventType22 = new EventType("SOUND_OFF", 21);
            SOUND_OFF = eventType22;
            EventType eventType23 = new EventType("CONTINUE_RECORDING", 22);
            CONTINUE_RECORDING = eventType23;
            EventType eventType24 = new EventType("DELETE_DRAFT", 23);
            DELETE_DRAFT = eventType24;
            EventType eventType25 = new EventType("ACTIVATED_GESTURE", 24);
            ACTIVATED_GESTURE = eventType25;
            EventType eventType26 = new EventType("DEACTIVATED_GESTURE", 25);
            DEACTIVATED_GESTURE = eventType26;
            EventType eventType27 = new EventType("GESTURE_POPUP_AGREEMENT", 26);
            GESTURE_POPUP_AGREEMENT = eventType27;
            EventType eventType28 = new EventType("OPEN_VIDEO_SPEED", 27);
            OPEN_VIDEO_SPEED = eventType28;
            EventType eventType29 = new EventType("SELECT_VIDEO_DURATION", 28);
            SELECT_VIDEO_DURATION = eventType29;
            EventType eventType30 = new EventType("VIDEO_DURATION_CHANGE", 29);
            VIDEO_DURATION_CHANGE = eventType30;
            EventType eventType31 = new EventType("VIDEO_DURATION_SAVE", 30);
            VIDEO_DURATION_SAVE = eventType31;
            EventType eventType32 = new EventType("CLICK_TO_AUDIO_TITLE_CAMERA", 31);
            CLICK_TO_AUDIO_TITLE_CAMERA = eventType32;
            EventType eventType33 = new EventType("CUT_AUDIO_CAMERA", 32);
            CUT_AUDIO_CAMERA = eventType33;
            EventType eventType34 = new EventType("DELETE_AUDIO_CAMERA", 33);
            DELETE_AUDIO_CAMERA = eventType34;
            EventType eventType35 = new EventType("OPEN_TIMER", 34);
            OPEN_TIMER = eventType35;
            EventType eventType36 = new EventType("CHANGE_TIME", 35);
            CHANGE_TIME = eventType36;
            EventType eventType37 = new EventType("START_TIMER", 36);
            START_TIMER = eventType37;
            EventType eventType38 = new EventType("CANCEL_TIMER", 37);
            CANCEL_TIMER = eventType38;
            EventType eventType39 = new EventType("OPEN_MUSIC_CAMERA", 38);
            OPEN_MUSIC_CAMERA = eventType39;
            EventType eventType40 = new EventType("APPLY_MUSIC_CAMERA", 39);
            APPLY_MUSIC_CAMERA = eventType40;
            EventType eventType41 = new EventType("CANCEL_MUSIC_CAMERA", 40);
            CANCEL_MUSIC_CAMERA = eventType41;
            EventType eventType42 = new EventType("GO_TO_EDITOR", 41);
            GO_TO_EDITOR = eventType42;
            EventType eventType43 = new EventType("OPEN_MUSIC_EDITOR", 42);
            OPEN_MUSIC_EDITOR = eventType43;
            EventType eventType44 = new EventType("APPLY_MUSIC_EDITOR", 43);
            APPLY_MUSIC_EDITOR = eventType44;
            EventType eventType45 = new EventType("CANCEL_MUSIC_EDITOR", 44);
            CANCEL_MUSIC_EDITOR = eventType45;
            EventType eventType46 = new EventType("SAVE_STORY", 45);
            SAVE_STORY = eventType46;
            EventType eventType47 = new EventType("CLOSE_TO_CAMERA", 46);
            CLOSE_TO_CAMERA = eventType47;
            EventType eventType48 = new EventType("ADD_TEXT", 47);
            ADD_TEXT = eventType48;
            EventType eventType49 = new EventType("EDIT_TEXT", 48);
            EDIT_TEXT = eventType49;
            EventType eventType50 = new EventType("DELETE_TEXT", 49);
            DELETE_TEXT = eventType50;
            EventType eventType51 = new EventType("ADD_STICKER", 50);
            ADD_STICKER = eventType51;
            EventType eventType52 = new EventType("EDIT_STICKER", 51);
            EDIT_STICKER = eventType52;
            EventType eventType53 = new EventType("DELETE_STICKER", 52);
            DELETE_STICKER = eventType53;
            EventType eventType54 = new EventType("ADD_GRAFFITI", 53);
            ADD_GRAFFITI = eventType54;
            EventType eventType55 = new EventType("APPLY_GRAFFITI", 54);
            APPLY_GRAFFITI = eventType55;
            EventType eventType56 = new EventType("CANCEL_GRAFFITI", 55);
            CANCEL_GRAFFITI = eventType56;
            EventType eventType57 = new EventType("DELETE_GRAFFITI", 56);
            DELETE_GRAFFITI = eventType57;
            EventType eventType58 = new EventType("SELECT_HASHTAG_HINT", 57);
            SELECT_HASHTAG_HINT = eventType58;
            EventType eventType59 = new EventType("GEO_ACCESS_ALLOW", 58);
            GEO_ACCESS_ALLOW = eventType59;
            EventType eventType60 = new EventType("GEO_ACCESS_DECLINE", 59);
            GEO_ACCESS_DECLINE = eventType60;
            EventType eventType61 = new EventType("CHANGE_VOLUME", 60);
            CHANGE_VOLUME = eventType61;
            EventType eventType62 = new EventType("CLICK_TO_AUDIO_TITLE_EDITOR", 61);
            CLICK_TO_AUDIO_TITLE_EDITOR = eventType62;
            EventType eventType63 = new EventType("CUT_AUDIO_EDITOR", 62);
            CUT_AUDIO_EDITOR = eventType63;
            EventType eventType64 = new EventType("DELETE_AUDIO_EDITOR", 63);
            DELETE_AUDIO_EDITOR = eventType64;
            EventType eventType65 = new EventType("OPEN_FILTER", 64);
            OPEN_FILTER = eventType65;
            EventType eventType66 = new EventType("EDIT_STICKER_DURATION", 65);
            EDIT_STICKER_DURATION = eventType66;
            EventType eventType67 = new EventType("PUBLISH_NOW", 66);
            PUBLISH_NOW = eventType67;
            EventType eventType68 = new EventType("CHOOSE_RECEIVERS", 67);
            CHOOSE_RECEIVERS = eventType68;
            EventType eventType69 = new EventType("PUBLISH_WITH_RECEIVERS", 68);
            PUBLISH_WITH_RECEIVERS = eventType69;
            EventType eventType70 = new EventType("PUBLISH_TO_DIALOG", 69);
            PUBLISH_TO_DIALOG = eventType70;
            EventType eventType71 = new EventType("PUBLISH", 70);
            PUBLISH = eventType71;
            EventType eventType72 = new EventType("GALLERY_FILES_COUNTED", 71);
            GALLERY_FILES_COUNTED = eventType72;
            EventType eventType73 = new EventType("GALLERY_ACCESS_REQUESTED", 72);
            GALLERY_ACCESS_REQUESTED = eventType73;
            EventType eventType74 = new EventType("GALLERY_PARTIAL_ACCESS_AUTHORIZED", 73);
            GALLERY_PARTIAL_ACCESS_AUTHORIZED = eventType74;
            EventType eventType75 = new EventType("GALLERY_LIMITED_ACCESS_AUTHORIZED", 74);
            GALLERY_LIMITED_ACCESS_AUTHORIZED = eventType75;
            EventType eventType76 = new EventType("GALLERY_ACCESS_AUTHORIZED", 75);
            GALLERY_ACCESS_AUTHORIZED = eventType76;
            EventType eventType77 = new EventType("GALLERY_ACCESS_RESTRICTED", 76);
            GALLERY_ACCESS_RESTRICTED = eventType77;
            EventType eventType78 = new EventType("GALLERY_ACCESS_DENIED", 77);
            GALLERY_ACCESS_DENIED = eventType78;
            EventType eventType79 = new EventType("CAMERA_ACCESS_REQUESTED", 78);
            CAMERA_ACCESS_REQUESTED = eventType79;
            EventType eventType80 = new EventType("CAMERA_ACCESS_RESTRICTED", 79);
            CAMERA_ACCESS_RESTRICTED = eventType80;
            EventType eventType81 = new EventType("CAMERA_ACCESS_AUTHORIZED", 80);
            CAMERA_ACCESS_AUTHORIZED = eventType81;
            EventType eventType82 = new EventType("CAMERA_ACCESS_DENIED", 81);
            CAMERA_ACCESS_DENIED = eventType82;
            EventType eventType83 = new EventType("MEDIA_UPLOADED", 82);
            MEDIA_UPLOADED = eventType83;
            EventType eventType84 = new EventType("EDIT_COVER", 83);
            EDIT_COVER = eventType84;
            EventType eventType85 = new EventType("APPLY_COVER", 84);
            APPLY_COVER = eventType85;
            EventType eventType86 = new EventType("CLIPS_OPEN_TIMER", 85);
            CLIPS_OPEN_TIMER = eventType86;
            EventType eventType87 = new EventType("CLIPS_START_TIMER", 86);
            CLIPS_START_TIMER = eventType87;
            EventType eventType88 = new EventType("CLIPS_CANCEL_TIMER_SETTINGS", 87);
            CLIPS_CANCEL_TIMER_SETTINGS = eventType88;
            EventType eventType89 = new EventType("CLIPS_PUBLISH_WITH_TIMER", 88);
            CLIPS_PUBLISH_WITH_TIMER = eventType89;
            EventType eventType90 = new EventType("SAVE_DRAFT", 89);
            SAVE_DRAFT = eventType90;
            EventType eventType91 = new EventType("MARK_ADVERTISER", 90);
            MARK_ADVERTISER = eventType91;
            EventType eventType92 = new EventType("EDIT_ADVERTISER_MARK", 91);
            EDIT_ADVERTISER_MARK = eventType92;
            EventType eventType93 = new EventType("EDIT_PHOTO_STYLE", 92);
            EDIT_PHOTO_STYLE = eventType93;
            EventType eventType94 = new EventType("ADD_PHOTO_CLIPBOARD", 93);
            ADD_PHOTO_CLIPBOARD = eventType94;
            EventType eventType95 = new EventType("ADD_TEXT_CLIPBOARD", 94);
            ADD_TEXT_CLIPBOARD = eventType95;
            EventType eventType96 = new EventType("OPEN_EDITOR", 95);
            OPEN_EDITOR = eventType96;
            EventType eventType97 = new EventType("STICKERS_MENU_OPEN", 96);
            STICKERS_MENU_OPEN = eventType97;
            EventType eventType98 = new EventType("STICKERS_MENU_CLOSED", 97);
            STICKERS_MENU_CLOSED = eventType98;
            EventType eventType99 = new EventType("STICKERS_MENU_STICKER_CLICKED", 98);
            STICKERS_MENU_STICKER_CLICKED = eventType99;
            EventType eventType100 = new EventType("STICKER_ADDING_CANCELED", 99);
            STICKER_ADDING_CANCELED = eventType100;
            EventType eventType101 = new EventType("CHANGE_PHOTO", 100);
            CHANGE_PHOTO = eventType101;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25, eventType26, eventType27, eventType28, eventType29, eventType30, eventType31, eventType32, eventType33, eventType34, eventType35, eventType36, eventType37, eventType38, eventType39, eventType40, eventType41, eventType42, eventType43, eventType44, eventType45, eventType46, eventType47, eventType48, eventType49, eventType50, eventType51, eventType52, eventType53, eventType54, eventType55, eventType56, eventType57, eventType58, eventType59, eventType60, eventType61, eventType62, eventType63, eventType64, eventType65, eventType66, eventType67, eventType68, eventType69, eventType70, eventType71, eventType72, eventType73, eventType74, eventType75, eventType76, eventType77, eventType78, eventType79, eventType80, eventType81, eventType82, eventType83, eventType84, eventType85, eventType86, eventType87, eventType88, eventType89, eventType90, eventType91, eventType92, eventType93, eventType94, eventType95, eventType96, eventType97, eventType98, eventType99, eventType100, eventType101};
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
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class MaskStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MaskStatus[] $VALUES;

        @pmi0("approved")
        public static final MaskStatus APPROVED;

        @pmi0("approved_for_subscribers")
        public static final MaskStatus APPROVED_FOR_SUBSCRIBERS;

        static {
            MaskStatus maskStatus = new MaskStatus("APPROVED", 0);
            APPROVED = maskStatus;
            MaskStatus maskStatus2 = new MaskStatus("APPROVED_FOR_SUBSCRIBERS", 1);
            APPROVED_FOR_SUBSCRIBERS = maskStatus2;
            MaskStatus[] maskStatusArr = {maskStatus, maskStatus2};
            $VALUES = maskStatusArr;
            $ENTRIES = new asp(maskStatusArr);
        }

        private MaskStatus(String str, int i) {
        }

        public static MaskStatus valueOf(String str) {
            return (MaskStatus) Enum.valueOf(MaskStatus.class, str);
        }

        public static MaskStatus[] values() {
            return (MaskStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class StoryMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoryMode[] $VALUES;

        @pmi0("collage")
        public static final StoryMode COLLAGE;

        @pmi0("live")
        public static final StoryMode LIVE;

        @pmi0("photo")
        public static final StoryMode PHOTO;

        @pmi0("ping_pong")
        public static final StoryMode PING_PONG;

        @pmi0("story_video")
        public static final StoryMode STORY_VIDEO;

        @pmi0("usual")
        public static final StoryMode USUAL;

        @pmi0("video")
        public static final StoryMode VIDEO;

        @pmi0("video_message")
        public static final StoryMode VIDEO_MESSAGE;

        static {
            StoryMode storyMode = new StoryMode("LIVE", 0);
            LIVE = storyMode;
            StoryMode storyMode2 = new StoryMode("USUAL", 1);
            USUAL = storyMode2;
            StoryMode storyMode3 = new StoryMode("PING_PONG", 2);
            PING_PONG = storyMode3;
            StoryMode storyMode4 = new StoryMode("STORY_VIDEO", 3);
            STORY_VIDEO = storyMode4;
            StoryMode storyMode5 = new StoryMode("PHOTO", 4);
            PHOTO = storyMode5;
            StoryMode storyMode6 = new StoryMode(SignalingProtocol.MEDIA_OPTION_VIDEO, 5);
            VIDEO = storyMode6;
            StoryMode storyMode7 = new StoryMode("VIDEO_MESSAGE", 6);
            VIDEO_MESSAGE = storyMode7;
            StoryMode storyMode8 = new StoryMode("COLLAGE", 7);
            COLLAGE = storyMode8;
            StoryMode[] storyModeArr = {storyMode, storyMode2, storyMode3, storyMode4, storyMode5, storyMode6, storyMode7, storyMode8};
            $VALUES = storyModeArr;
            $ENTRIES = new asp(storyModeArr);
        }

        private StoryMode(String str, int i) {
        }

        public static zrp<StoryMode> h() {
            return $ENTRIES;
        }

        public static StoryMode valueOf(String str) {
            return (StoryMode) Enum.valueOf(StoryMode.class, str);
        }

        public static StoryMode[] values() {
            return (StoryMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class StoryTeaserType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoryTeaserType[] $VALUES;

        @pmi0("birthday")
        public static final StoryTeaserType BIRTHDAY;

        @pmi0("gallery")
        public static final StoryTeaserType GALLERY;

        @pmi0("music")
        public static final StoryTeaserType MUSIC;

        static {
            StoryTeaserType storyTeaserType = new StoryTeaserType("GALLERY", 0);
            GALLERY = storyTeaserType;
            StoryTeaserType storyTeaserType2 = new StoryTeaserType("MUSIC", 1);
            MUSIC = storyTeaserType2;
            StoryTeaserType storyTeaserType3 = new StoryTeaserType("BIRTHDAY", 2);
            BIRTHDAY = storyTeaserType3;
            StoryTeaserType[] storyTeaserTypeArr = {storyTeaserType, storyTeaserType2, storyTeaserType3};
            $VALUES = storyTeaserTypeArr;
            $ENTRIES = new asp(storyTeaserTypeArr);
        }

        private StoryTeaserType(String str, int i) {
        }

        public static StoryTeaserType valueOf(String str) {
            return (StoryTeaserType) Enum.valueOf(StoryTeaserType.class, str);
        }

        public static StoryTeaserType[] values() {
            return (StoryTeaserType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class StoryType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoryType[] $VALUES;

        @pmi0("advice")
        public static final StoryType ADVICE;

        @pmi0("photo")
        public static final StoryType PHOTO;

        @pmi0("video")
        public static final StoryType VIDEO;

        static {
            StoryType storyType = new StoryType("PHOTO", 0);
            PHOTO = storyType;
            StoryType storyType2 = new StoryType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
            VIDEO = storyType2;
            StoryType storyType3 = new StoryType("ADVICE", 2);
            ADVICE = storyType3;
            StoryType[] storyTypeArr = {storyType, storyType2, storyType3};
            $VALUES = storyTypeArr;
            $ENTRIES = new asp(storyTypeArr);
        }

        private StoryType(String str, int i) {
        }

        public static zrp<StoryType> h() {
            return $ENTRIES;
        }

        public static StoryType valueOf(String str) {
            return (StoryType) Enum.valueOf(StoryType.class, str);
        }

        public static StoryType[] values() {
            return (StoryType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("auto")
        public static final Subtype AUTO;

        static {
            Subtype subtype = new Subtype("AUTO", 0);
            AUTO = subtype;
            Subtype[] subtypeArr = {subtype};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class VideoDurationSetting {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoDurationSetting[] $VALUES;

        @pmi0("duration_15sec")
        public static final VideoDurationSetting DURATION_15SEC;

        @pmi0("duration_180sec")
        public static final VideoDurationSetting DURATION_180SEC;

        @pmi0("duration_60sec")
        public static final VideoDurationSetting DURATION_60SEC;

        static {
            VideoDurationSetting videoDurationSetting = new VideoDurationSetting("DURATION_15SEC", 0);
            DURATION_15SEC = videoDurationSetting;
            VideoDurationSetting videoDurationSetting2 = new VideoDurationSetting("DURATION_60SEC", 1);
            DURATION_60SEC = videoDurationSetting2;
            VideoDurationSetting videoDurationSetting3 = new VideoDurationSetting("DURATION_180SEC", 2);
            DURATION_180SEC = videoDurationSetting3;
            VideoDurationSetting[] videoDurationSettingArr = {videoDurationSetting, videoDurationSetting2, videoDurationSetting3};
            $VALUES = videoDurationSettingArr;
            $ENTRIES = new asp(videoDurationSettingArr);
        }

        private VideoDurationSetting(String str, int i) {
        }

        public static VideoDurationSetting valueOf(String str) {
            return (VideoDurationSetting) Enum.valueOf(VideoDurationSetting.class, str);
        }

        public static VideoDurationSetting[] values() {
            return (VideoDurationSetting[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class VideoSpeed {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoSpeed[] $VALUES;

        @pmi0("speed_0_3x")
        public static final VideoSpeed SPEED_0_3X;

        @pmi0("speed_0_5x")
        public static final VideoSpeed SPEED_0_5X;

        @pmi0("speed_1x")
        public static final VideoSpeed SPEED_1X;

        @pmi0("speed_2x")
        public static final VideoSpeed SPEED_2X;

        @pmi0("speed_3x")
        public static final VideoSpeed SPEED_3X;

        static {
            VideoSpeed videoSpeed = new VideoSpeed("SPEED_0_3X", 0);
            SPEED_0_3X = videoSpeed;
            VideoSpeed videoSpeed2 = new VideoSpeed("SPEED_0_5X", 1);
            SPEED_0_5X = videoSpeed2;
            VideoSpeed videoSpeed3 = new VideoSpeed("SPEED_1X", 2);
            SPEED_1X = videoSpeed3;
            VideoSpeed videoSpeed4 = new VideoSpeed("SPEED_2X", 3);
            SPEED_2X = videoSpeed4;
            VideoSpeed videoSpeed5 = new VideoSpeed("SPEED_3X", 4);
            SPEED_3X = videoSpeed5;
            VideoSpeed[] videoSpeedArr = {videoSpeed, videoSpeed2, videoSpeed3, videoSpeed4, videoSpeed5};
            $VALUES = videoSpeedArr;
            $ENTRIES = new asp(videoSpeedArr);
        }

        private VideoSpeed(String str, int i) {
        }

        public static VideoSpeed valueOf(String str) {
            return (VideoSpeed) Enum.valueOf(VideoSpeed.class, str);
        }

        public static VideoSpeed[] values() {
            return (VideoSpeed[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsStoriesStat$TypeStoryPublishItem(int i, int i2, boolean z, boolean z2, boolean z3, SchemeStat$NetworkSignalInfo schemeStat$NetworkSignalInfo, EventType eventType, CreationEntryPoint creationEntryPoint, int i3, CameraType cameraType, Boolean bool, Subtype subtype, Integer num, MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus, MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus2, Long l, MobileOfficialAppsStoriesStat$StoryGalleryState mobileOfficialAppsStoriesStat$StoryGalleryState, Integer num2, Integer num3, Integer num4, Long l2, Integer num5, Long l3, Integer num6, List<String> list, Boolean bool2, Integer num7, Integer num8, StoryMode storyMode, StoryType storyType, MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType, String str, VideoSpeed videoSpeed, VideoDurationSetting videoDurationSetting, String str2, Integer num9, Boolean bool3, List<MobileOfficialAppsStoriesStat$StoryStickerItem> list2, Boolean bool4, List<String> list3, Boolean bool5, List<MobileOfficialAppsStoriesStat$StoryClickableStickerItem> list4, Integer num10, Integer num11, Boolean bool6, Integer num12, Long l4, Integer num13, MaskStatus maskStatus, Boolean bool7, List<MobileOfficialAppsStoriesStat$StoryTextItem> list5, Boolean bool8, List<MobileOfficialAppsStoriesStat$StoryGraffitiItem> list6, List<MobileOfficialAppsStoriesStat$StorySettingItem> list7, Boolean bool9, List<Long> list8, Integer num14, StoryTeaserType storyTeaserType, Integer num15) {
        this.brightness = i;
        this.battery = i2;
        this.isLightOn = z;
        this.hasFrontalCamera = z2;
        this.isFrontalCamera = z3;
        this.networkSignalInfo = schemeStat$NetworkSignalInfo;
        this.eventType = eventType;
        this.creationEntryPoint = creationEntryPoint;
        this.videoLength = i3;
        this.cameraType = cameraType;
        this.isSoundOn = bool;
        this.subtype = subtype;
        this.framesCount = num;
        this.cameraAccessStatus = mobileOfficialAppsStoriesStat$PermissionAccessStatus;
        this.galleryAccessStatus = mobileOfficialAppsStoriesStat$PermissionAccessStatus2;
        this.storyPublisherSession = l;
        this.galleryState = mobileOfficialAppsStoriesStat$StoryGalleryState;
        this.countdown = num2;
        this.trackId = num3;
        this.audioId = num4;
        this.audioOwnerId = l2;
        this.playlistId = num5;
        this.playlistOwnerId = l3;
        this.bannerId = num6;
        this.hashtags = list;
        this.isAudioImported = bool2;
        this.musicVolume = num7;
        this.originalVolume = num8;
        this.storyMode = storyMode;
        this.storyType = storyType;
        this.adviceType = mobileOfficialAppsStoriesStat$StoryAdviceType;
        this.videoClipDescription = str;
        this.videoSpeed = videoSpeed;
        this.videoDurationSetting = videoDurationSetting;
        this.videoFilter = str2;
        this.videoFilterPosition = num9;
        this.hasSticker = bool3;
        this.stickers = list2;
        this.hasEmoji = bool4;
        this.emojies = list3;
        this.hasClickableSticker = bool5;
        this.clickableStickers = list4;
        this.hashtagSearchPosition = num10;
        this.hashtagQueryLength = num11;
        this.hasMask = bool6;
        this.maskId = num12;
        this.maskOwnerId = l4;
        this.maskSection = num13;
        this.maskStatus = maskStatus;
        this.hasText = bool7;
        this.texts = list5;
        this.hasGraffiti = bool8;
        this.graffities = list6;
        this.settings = list7;
        this.isAddToNews = bool9;
        this.f96receivers = list8;
        this.isStoryTeaser = num14;
        this.storyTeaserType = storyTeaserType;
        this.isMyFavoriteTrack = num15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$TypeStoryPublishItem)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem mobileOfficialAppsStoriesStat$TypeStoryPublishItem = (MobileOfficialAppsStoriesStat$TypeStoryPublishItem) obj;
        return this.brightness == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.brightness && this.battery == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.battery && this.isLightOn == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.isLightOn && this.hasFrontalCamera == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hasFrontalCamera && this.isFrontalCamera == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.isFrontalCamera && epx.f(this.networkSignalInfo, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.networkSignalInfo) && this.eventType == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.eventType && this.creationEntryPoint == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.creationEntryPoint && this.videoLength == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.videoLength && this.cameraType == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.cameraType && epx.f(this.isSoundOn, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.isSoundOn) && this.subtype == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.subtype && epx.f(this.framesCount, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.framesCount) && this.cameraAccessStatus == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.cameraAccessStatus && this.galleryAccessStatus == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.galleryAccessStatus && epx.f(this.storyPublisherSession, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.storyPublisherSession) && epx.f(this.galleryState, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.galleryState) && epx.f(this.countdown, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.countdown) && epx.f(this.trackId, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.trackId) && epx.f(this.audioId, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.audioId) && epx.f(this.audioOwnerId, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.audioOwnerId) && epx.f(this.playlistId, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.playlistId) && epx.f(this.playlistOwnerId, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.playlistOwnerId) && epx.f(this.bannerId, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.bannerId) && epx.f(this.hashtags, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hashtags) && epx.f(this.isAudioImported, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.isAudioImported) && epx.f(this.musicVolume, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.musicVolume) && epx.f(this.originalVolume, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.originalVolume) && this.storyMode == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.storyMode && this.storyType == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.storyType && this.adviceType == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.adviceType && epx.f(this.videoClipDescription, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.videoClipDescription) && this.videoSpeed == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.videoSpeed && this.videoDurationSetting == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.videoDurationSetting && epx.f(this.videoFilter, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.videoFilter) && epx.f(this.videoFilterPosition, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.videoFilterPosition) && epx.f(this.hasSticker, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hasSticker) && epx.f(this.stickers, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.stickers) && epx.f(this.hasEmoji, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hasEmoji) && epx.f(this.emojies, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.emojies) && epx.f(this.hasClickableSticker, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hasClickableSticker) && epx.f(this.clickableStickers, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.clickableStickers) && epx.f(this.hashtagSearchPosition, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hashtagSearchPosition) && epx.f(this.hashtagQueryLength, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hashtagQueryLength) && epx.f(this.hasMask, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hasMask) && epx.f(this.maskId, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.maskId) && epx.f(this.maskOwnerId, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.maskOwnerId) && epx.f(this.maskSection, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.maskSection) && this.maskStatus == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.maskStatus && epx.f(this.hasText, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hasText) && epx.f(this.texts, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.texts) && epx.f(this.hasGraffiti, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.hasGraffiti) && epx.f(this.graffities, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.graffities) && epx.f(this.settings, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.settings) && epx.f(this.isAddToNews, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.isAddToNews) && epx.f(this.f96receivers, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.f96receivers) && epx.f(this.isStoryTeaser, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.isStoryTeaser) && this.storyTeaserType == mobileOfficialAppsStoriesStat$TypeStoryPublishItem.storyTeaserType && epx.f(this.isMyFavoriteTrack, mobileOfficialAppsStoriesStat$TypeStoryPublishItem.isMyFavoriteTrack);
    }

    public final int hashCode() {
        int hashCode = (this.cameraType.hashCode() + shy.a(this.videoLength, (this.creationEntryPoint.hashCode() + ((this.eventType.hashCode() + ((this.networkSignalInfo.hashCode() + qoy.b(qoy.b(qoy.b(shy.a(this.battery, Integer.hashCode(this.brightness) * 31, 31), 31, this.isLightOn), 31, this.hasFrontalCamera), 31, this.isFrontalCamera)) * 31)) * 31)) * 31, 31)) * 31;
        Boolean bool = this.isSoundOn;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Subtype subtype = this.subtype;
        int hashCode3 = (hashCode2 + (subtype == null ? 0 : subtype.hashCode())) * 31;
        Integer num = this.framesCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus = this.cameraAccessStatus;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsStoriesStat$PermissionAccessStatus == null ? 0 : mobileOfficialAppsStoriesStat$PermissionAccessStatus.hashCode())) * 31;
        MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus2 = this.galleryAccessStatus;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsStoriesStat$PermissionAccessStatus2 == null ? 0 : mobileOfficialAppsStoriesStat$PermissionAccessStatus2.hashCode())) * 31;
        Long l = this.storyPublisherSession;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsStoriesStat$StoryGalleryState mobileOfficialAppsStoriesStat$StoryGalleryState = this.galleryState;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsStoriesStat$StoryGalleryState == null ? 0 : mobileOfficialAppsStoriesStat$StoryGalleryState.hashCode())) * 31;
        Integer num2 = this.countdown;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.trackId;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.audioId;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l2 = this.audioOwnerId;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num5 = this.playlistId;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l3 = this.playlistOwnerId;
        int hashCode14 = (hashCode13 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num6 = this.bannerId;
        int hashCode15 = (hashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<String> list = this.hashtags;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.isAudioImported;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num7 = this.musicVolume;
        int hashCode18 = (hashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.originalVolume;
        int hashCode19 = (hashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        StoryMode storyMode = this.storyMode;
        int hashCode20 = (hashCode19 + (storyMode == null ? 0 : storyMode.hashCode())) * 31;
        StoryType storyType = this.storyType;
        int hashCode21 = (hashCode20 + (storyType == null ? 0 : storyType.hashCode())) * 31;
        MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType = this.adviceType;
        int hashCode22 = (hashCode21 + (mobileOfficialAppsStoriesStat$StoryAdviceType == null ? 0 : mobileOfficialAppsStoriesStat$StoryAdviceType.hashCode())) * 31;
        String str = this.videoClipDescription;
        int hashCode23 = (hashCode22 + (str == null ? 0 : str.hashCode())) * 31;
        VideoSpeed videoSpeed = this.videoSpeed;
        int hashCode24 = (hashCode23 + (videoSpeed == null ? 0 : videoSpeed.hashCode())) * 31;
        VideoDurationSetting videoDurationSetting = this.videoDurationSetting;
        int hashCode25 = (hashCode24 + (videoDurationSetting == null ? 0 : videoDurationSetting.hashCode())) * 31;
        String str2 = this.videoFilter;
        int hashCode26 = (hashCode25 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num9 = this.videoFilterPosition;
        int hashCode27 = (hashCode26 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool3 = this.hasSticker;
        int hashCode28 = (hashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<MobileOfficialAppsStoriesStat$StoryStickerItem> list2 = this.stickers;
        int hashCode29 = (hashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool4 = this.hasEmoji;
        int hashCode30 = (hashCode29 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list3 = this.emojies;
        int hashCode31 = (hashCode30 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool5 = this.hasClickableSticker;
        int hashCode32 = (hashCode31 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List<MobileOfficialAppsStoriesStat$StoryClickableStickerItem> list4 = this.clickableStickers;
        int hashCode33 = (hashCode32 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num10 = this.hashtagSearchPosition;
        int hashCode34 = (hashCode33 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.hashtagQueryLength;
        int hashCode35 = (hashCode34 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool6 = this.hasMask;
        int hashCode36 = (hashCode35 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num12 = this.maskId;
        int hashCode37 = (hashCode36 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Long l4 = this.maskOwnerId;
        int hashCode38 = (hashCode37 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num13 = this.maskSection;
        int hashCode39 = (hashCode38 + (num13 == null ? 0 : num13.hashCode())) * 31;
        MaskStatus maskStatus = this.maskStatus;
        int hashCode40 = (hashCode39 + (maskStatus == null ? 0 : maskStatus.hashCode())) * 31;
        Boolean bool7 = this.hasText;
        int hashCode41 = (hashCode40 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        List<MobileOfficialAppsStoriesStat$StoryTextItem> list5 = this.texts;
        int hashCode42 = (hashCode41 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool8 = this.hasGraffiti;
        int hashCode43 = (hashCode42 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        List<MobileOfficialAppsStoriesStat$StoryGraffitiItem> list6 = this.graffities;
        int hashCode44 = (hashCode43 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<MobileOfficialAppsStoriesStat$StorySettingItem> list7 = this.settings;
        int hashCode45 = (hashCode44 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Boolean bool9 = this.isAddToNews;
        int hashCode46 = (hashCode45 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        List<Long> list8 = this.f96receivers;
        int hashCode47 = (hashCode46 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Integer num14 = this.isStoryTeaser;
        int hashCode48 = (hashCode47 + (num14 == null ? 0 : num14.hashCode())) * 31;
        StoryTeaserType storyTeaserType = this.storyTeaserType;
        int hashCode49 = (hashCode48 + (storyTeaserType == null ? 0 : storyTeaserType.hashCode())) * 31;
        Integer num15 = this.isMyFavoriteTrack;
        return hashCode49 + (num15 != null ? num15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeStoryPublishItem(brightness=");
        sb.append(this.brightness);
        sb.append(", battery=");
        sb.append(this.battery);
        sb.append(", isLightOn=");
        sb.append(this.isLightOn);
        sb.append(", hasFrontalCamera=");
        sb.append(this.hasFrontalCamera);
        sb.append(", isFrontalCamera=");
        sb.append(this.isFrontalCamera);
        sb.append(", networkSignalInfo=");
        sb.append(this.networkSignalInfo);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", creationEntryPoint=");
        sb.append(this.creationEntryPoint);
        sb.append(", videoLength=");
        sb.append(this.videoLength);
        sb.append(", cameraType=");
        sb.append(this.cameraType);
        sb.append(", isSoundOn=");
        sb.append(this.isSoundOn);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", framesCount=");
        sb.append(this.framesCount);
        sb.append(", cameraAccessStatus=");
        sb.append(this.cameraAccessStatus);
        sb.append(", galleryAccessStatus=");
        sb.append(this.galleryAccessStatus);
        sb.append(", storyPublisherSession=");
        sb.append(this.storyPublisherSession);
        sb.append(", galleryState=");
        sb.append(this.galleryState);
        sb.append(", countdown=");
        sb.append(this.countdown);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", playlistOwnerId=");
        sb.append(this.playlistOwnerId);
        sb.append(", bannerId=");
        sb.append(this.bannerId);
        sb.append(", hashtags=");
        sb.append(this.hashtags);
        sb.append(", isAudioImported=");
        sb.append(this.isAudioImported);
        sb.append(", musicVolume=");
        sb.append(this.musicVolume);
        sb.append(", originalVolume=");
        sb.append(this.originalVolume);
        sb.append(", storyMode=");
        sb.append(this.storyMode);
        sb.append(", storyType=");
        sb.append(this.storyType);
        sb.append(", adviceType=");
        sb.append(this.adviceType);
        sb.append(", videoClipDescription=");
        sb.append(this.videoClipDescription);
        sb.append(", videoSpeed=");
        sb.append(this.videoSpeed);
        sb.append(", videoDurationSetting=");
        sb.append(this.videoDurationSetting);
        sb.append(", videoFilter=");
        sb.append(this.videoFilter);
        sb.append(", videoFilterPosition=");
        sb.append(this.videoFilterPosition);
        sb.append(", hasSticker=");
        sb.append(this.hasSticker);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", hasEmoji=");
        sb.append(this.hasEmoji);
        sb.append(", emojies=");
        sb.append(this.emojies);
        sb.append(", hasClickableSticker=");
        sb.append(this.hasClickableSticker);
        sb.append(", clickableStickers=");
        sb.append(this.clickableStickers);
        sb.append(", hashtagSearchPosition=");
        sb.append(this.hashtagSearchPosition);
        sb.append(", hashtagQueryLength=");
        sb.append(this.hashtagQueryLength);
        sb.append(", hasMask=");
        sb.append(this.hasMask);
        sb.append(", maskId=");
        sb.append(this.maskId);
        sb.append(", maskOwnerId=");
        sb.append(this.maskOwnerId);
        sb.append(", maskSection=");
        sb.append(this.maskSection);
        sb.append(", maskStatus=");
        sb.append(this.maskStatus);
        sb.append(", hasText=");
        sb.append(this.hasText);
        sb.append(", texts=");
        sb.append(this.texts);
        sb.append(", hasGraffiti=");
        sb.append(this.hasGraffiti);
        sb.append(", graffities=");
        sb.append(this.graffities);
        sb.append(", settings=");
        sb.append(this.settings);
        sb.append(", isAddToNews=");
        sb.append(this.isAddToNews);
        sb.append(", receivers=");
        sb.append(this.f96receivers);
        sb.append(", isStoryTeaser=");
        sb.append(this.isStoryTeaser);
        sb.append(", storyTeaserType=");
        sb.append(this.storyTeaserType);
        sb.append(", isMyFavoriteTrack=");
        return uqi.b(sb, this.isMyFavoriteTrack, ')');
    }

    public /* synthetic */ MobileOfficialAppsStoriesStat$TypeStoryPublishItem(int i, int i2, boolean z, boolean z2, boolean z3, SchemeStat$NetworkSignalInfo schemeStat$NetworkSignalInfo, EventType eventType, CreationEntryPoint creationEntryPoint, int i3, CameraType cameraType, Boolean bool, Subtype subtype, Integer num, MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus, MobileOfficialAppsStoriesStat$PermissionAccessStatus mobileOfficialAppsStoriesStat$PermissionAccessStatus2, Long l, MobileOfficialAppsStoriesStat$StoryGalleryState mobileOfficialAppsStoriesStat$StoryGalleryState, Integer num2, Integer num3, Integer num4, Long l2, Integer num5, Long l3, Integer num6, List list, Boolean bool2, Integer num7, Integer num8, StoryMode storyMode, StoryType storyType, MobileOfficialAppsStoriesStat$StoryAdviceType mobileOfficialAppsStoriesStat$StoryAdviceType, String str, VideoSpeed videoSpeed, VideoDurationSetting videoDurationSetting, String str2, Integer num9, Boolean bool3, List list2, Boolean bool4, List list3, Boolean bool5, List list4, Integer num10, Integer num11, Boolean bool6, Integer num12, Long l4, Integer num13, MaskStatus maskStatus, Boolean bool7, List list5, Boolean bool8, List list6, List list7, Boolean bool9, List list8, Integer num14, StoryTeaserType storyTeaserType, Integer num15, int i4, int i5, zcl zclVar) {
        this(i, i2, z, z2, z3, schemeStat$NetworkSignalInfo, eventType, creationEntryPoint, i3, cameraType, (i4 & 1024) != 0 ? null : bool, (i4 & 2048) != 0 ? null : subtype, (i4 & 4096) != 0 ? null : num, (i4 & 8192) != 0 ? null : mobileOfficialAppsStoriesStat$PermissionAccessStatus, (i4 & 16384) != 0 ? null : mobileOfficialAppsStoriesStat$PermissionAccessStatus2, (i4 & 32768) != 0 ? null : l, (i4 & 65536) != 0 ? null : mobileOfficialAppsStoriesStat$StoryGalleryState, (i4 & 131072) != 0 ? null : num2, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num3, (i4 & 524288) != 0 ? null : num4, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : l2, (i4 & 2097152) != 0 ? null : num5, (i4 & 4194304) != 0 ? null : l3, (i4 & 8388608) != 0 ? null : num6, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list, (i4 & 33554432) != 0 ? null : bool2, (i4 & 67108864) != 0 ? null : num7, (i4 & 134217728) != 0 ? null : num8, (i4 & 268435456) != 0 ? null : storyMode, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : storyType, (i4 & 1073741824) != 0 ? null : mobileOfficialAppsStoriesStat$StoryAdviceType, (i4 & Integer.MIN_VALUE) != 0 ? null : str, (i5 & 1) != 0 ? null : videoSpeed, (i5 & 2) != 0 ? null : videoDurationSetting, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? null : num9, (i5 & 16) != 0 ? null : bool3, (i5 & 32) != 0 ? null : list2, (i5 & 64) != 0 ? null : bool4, (i5 & 128) != 0 ? null : list3, (i5 & 256) != 0 ? null : bool5, (i5 & 512) != 0 ? null : list4, (i5 & 1024) != 0 ? null : num10, (i5 & 2048) != 0 ? null : num11, (i5 & 4096) != 0 ? null : bool6, (i5 & 8192) != 0 ? null : num12, (i5 & 16384) != 0 ? null : l4, (i5 & 32768) != 0 ? null : num13, (i5 & 65536) != 0 ? null : maskStatus, (i5 & 131072) != 0 ? null : bool7, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list5, (i5 & 524288) != 0 ? null : bool8, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list6, (i5 & 2097152) != 0 ? null : list7, (i5 & 4194304) != 0 ? null : bool9, (i5 & 8388608) != 0 ? null : list8, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num14, (i5 & 33554432) != 0 ? null : storyTeaserType, (i5 & 67108864) != 0 ? null : num15);
    }
}
