package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.iq;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConPostingStat$TypePostingItem implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("add_attachment_event")
    private final MobileOfficialAppsConPostingStat$AddAttachmentEvent addAttachmentEvent;

    @pmi0("best_friend_event")
    private final MobileOfficialAppsConPostingStat$BestFriendEvent bestFriendEvent;

    @pmi0("change_owner_event")
    private final MobileOfficialAppsConPostingStat$ChangeOwnerEvent changeOwnerEvent;

    @pmi0("click_attachment_event")
    private final MobileOfficialAppsConPostingStat$ClickAttachmentEvent clickAttachmentEvent;

    @pmi0("creation_entry_point")
    private final CreationEntryPoint creationEntryPoint;

    @pmi0("creation_session_id_int")
    private final Long creationSessionIdInt;

    @pmi0("crop_photo_click_event")
    private final MobileOfficialAppsConPostingStat$CropPhotoClickEvent cropPhotoClickEvent;

    @pmi0("crop_photo_event")
    private final MobileOfficialAppsConPostingStat$CropPhotoEvent cropPhotoEvent;

    @pmi0("draft_event")
    private final MobileOfficialAppsConPostingStat$DraftEvent draftEvent;

    @pmi0("edit_attachment_event")
    private final MobileOfficialAppsConPostingStat$EditAttachmentEvent editAttachmentEvent;

    @pmi0("creation_session_id")
    private final FilteredString filteredCreationSessionId;

    @pmi0("mention_event")
    private final MobileOfficialAppsConPostingStat$MentionEvent mentionEvent;

    @pmi0("nav_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen navScreen;

    @pmi0("navigation_event")
    private final MobileOfficialAppsConPostingStat$NavigationEvent navigationEvent;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("parsed_links_event")
    private final MobileOfficialAppsConPostingStat$ParsedLinksEvent parsedLinksEvent;

    @pmi0("photo_additional_info")
    private final MobileOfficialAppsConPostingStat$PhotoAdditionalInfo photoAdditionalInfo;

    @pmi0("photo_sizes")
    private final MobileOfficialAppsConPostingStat$PhotoSizes photoSizes;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("post_type")
    private final PostType postType;

    @pmi0("poster_event")
    private final MobileOfficialAppsConPostingStat$PosterEvent posterEvent;

    @pmi0("primary_mode_event")
    private final MobileOfficialAppsConPostingStat$PrimaryModeEvent primaryModeEvent;

    @pmi0("remote_draft_event")
    private final MobileOfficialAppsConPostingStat$RemoteDraftEvent remoteDraftEvent;

    @pmi0("settings_event")
    private final MobileOfficialAppsConPostingStat$SettingsEvent settingsEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    /* loaded from: classes5.dex */
    public static final class CreationEntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CreationEntryPoint[] $VALUES;

        @pmi0("add_comment")
        public static final CreationEntryPoint ADD_COMMENT;

        @pmi0("android_sharing")
        public static final CreationEntryPoint ANDROID_SHARING;

        @pmi0("channel_write_bar_button")
        public static final CreationEntryPoint CHANNEL_WRITE_BAR_BUTTON;

        @pmi0("clip_upload_settings")
        public static final CreationEntryPoint CLIP_UPLOAD_SETTINGS;

        @pmi0("community_creation_onboarding_block")
        public static final CreationEntryPoint COMMUNITY_CREATION_ONBOARDING_BLOCK;

        @pmi0("feed")
        public static final CreationEntryPoint FEED;

        @pmi0("feed_delete_draft")
        public static final CreationEntryPoint FEED_DELETE_DRAFT;

        @pmi0("feed_delete_draft_three_dots")
        public static final CreationEntryPoint FEED_DELETE_DRAFT_THREE_DOTS;

        @pmi0("feed_draft")
        public static final CreationEntryPoint FEED_DRAFT;

        @pmi0("feed_edit_draft")
        public static final CreationEntryPoint FEED_EDIT_DRAFT;

        @pmi0("feed_edit_draft_three_dots")
        public static final CreationEntryPoint FEED_EDIT_DRAFT_THREE_DOTS;

        @pmi0("feed_plus_button")
        public static final CreationEntryPoint FEED_PLUS_BUTTON;

        @pmi0("feed_recent")
        public static final CreationEntryPoint FEED_RECENT;

        @pmi0("feed_sitposting")
        public static final CreationEntryPoint FEED_SITPOSTING;

        @pmi0("feed_top")
        public static final CreationEntryPoint FEED_TOP;

        @pmi0("group")
        public static final CreationEntryPoint GROUP;

        @pmi0("group_all_posts")
        public static final CreationEntryPoint GROUP_ALL_POSTS;

        @pmi0("group_all_posts_repost_button")
        public static final CreationEntryPoint GROUP_ALL_POSTS_REPOST_BUTTON;

        @pmi0("group_donut")
        public static final CreationEntryPoint GROUP_DONUT;

        @pmi0("group_draft")
        public static final CreationEntryPoint GROUP_DRAFT;

        @pmi0("group_open_donut_post")
        public static final CreationEntryPoint GROUP_OPEN_DONUT_POST;

        @pmi0("group_own_posts")
        public static final CreationEntryPoint GROUP_OWN_POSTS;

        @pmi0("group_own_posts_repost_button")
        public static final CreationEntryPoint GROUP_OWN_POSTS_REPOST_BUTTON;

        @pmi0("group_plus_button")
        public static final CreationEntryPoint GROUP_PLUS_BUTTON;

        @pmi0("group_posting_suggested_post_three_points")
        public static final CreationEntryPoint GROUP_POSTING_SUGGESTED_POST_THREE_POINTS;

        @pmi0("group_postponed_posts")
        public static final CreationEntryPoint GROUP_POSTPONED_POSTS;

        @pmi0("group_postponed_posts_three_points")
        public static final CreationEntryPoint GROUP_POSTPONED_POSTS_THREE_POINTS;

        @pmi0("group_postponed_posts_three_points_post_now")
        public static final CreationEntryPoint GROUP_POSTPONED_POSTS_THREE_POINTS_POST_NOW;

        @pmi0("group_postponed_post_now")
        public static final CreationEntryPoint GROUP_POSTPONED_POST_NOW;

        @pmi0("group_prepare_suggested_post_button")
        public static final CreationEntryPoint GROUP_PREPARE_SUGGESTED_POST_BUTTON;

        @pmi0("group_suggest")
        public static final CreationEntryPoint GROUP_SUGGEST;

        @pmi0("group_wall_button")
        public static final CreationEntryPoint GROUP_WALL_BUTTON;

        @pmi0("im")
        public static final CreationEntryPoint IM;

        @pmi0("link")
        public static final CreationEntryPoint LINK;

        @pmi0("link_new_post")
        public static final CreationEntryPoint LINK_NEW_POST;

        @pmi0("list_delete_draft_three_dots")
        public static final CreationEntryPoint LIST_DELETE_DRAFT_THREE_DOTS;

        @pmi0("list_edit_draft")
        public static final CreationEntryPoint LIST_EDIT_DRAFT;

        @pmi0("list_edit_draft_three_dots")
        public static final CreationEntryPoint LIST_EDIT_DRAFT_THREE_DOTS;

        @pmi0("mini_app")
        public static final CreationEntryPoint MINI_APP;

        @pmi0("other")
        public static final CreationEntryPoint OTHER;

        @pmi0("post_three_dot_menu_edit_item")
        public static final CreationEntryPoint POST_THREE_DOT_MENU_EDIT_ITEM;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final CreationEntryPoint PROFILE;

        @pmi0("profile_all_posts")
        public static final CreationEntryPoint PROFILE_ALL_POSTS;

        @pmi0("profile_all_posts_repost_button")
        public static final CreationEntryPoint PROFILE_ALL_POSTS_REPOST_BUTTON;

        @pmi0("profile_draft")
        public static final CreationEntryPoint PROFILE_DRAFT;

        @pmi0("profile_own_posts")
        public static final CreationEntryPoint PROFILE_OWN_POSTS;

        @pmi0("profile_own_posts_repost_button")
        public static final CreationEntryPoint PROFILE_OWN_POSTS_REPOST_BUTTON;

        @pmi0("profile_photo_update")
        public static final CreationEntryPoint PROFILE_PHOTO_UPDATE;

        @pmi0("profile_plus_button")
        public static final CreationEntryPoint PROFILE_PLUS_BUTTON;

        @pmi0("profile_postponed_posts")
        public static final CreationEntryPoint PROFILE_POSTPONED_POSTS;

        @pmi0("profile_postponed_posts_three_points")
        public static final CreationEntryPoint PROFILE_POSTPONED_POSTS_THREE_POINTS;

        @pmi0("profile_postponed_posts_three_points_post_now")
        public static final CreationEntryPoint PROFILE_POSTPONED_POSTS_THREE_POINTS_POST_NOW;

        @pmi0("profile_postponed_post_now")
        public static final CreationEntryPoint PROFILE_POSTPONED_POST_NOW;

        @pmi0("profile_wall_button")
        public static final CreationEntryPoint PROFILE_WALL_BUTTON;

        @pmi0("repost_button")
        public static final CreationEntryPoint REPOST_BUTTON;

        @pmi0("share_php")
        public static final CreationEntryPoint SHARE_PHP;

        @pmi0("text_live_button")
        public static final CreationEntryPoint TEXT_LIVE_BUTTON;

        @pmi0("video_live_finished")
        public static final CreationEntryPoint VIDEO_LIVE_FINISHED;

        @pmi0("video_live_settings")
        public static final CreationEntryPoint VIDEO_LIVE_SETTINGS;

        @pmi0("video_upload_settings")
        public static final CreationEntryPoint VIDEO_UPLOAD_SETTINGS;

        @pmi0("vk_app_longtap_add_photo")
        public static final CreationEntryPoint VK_APP_LONGTAP_ADD_PHOTO;

        @pmi0("vk_app_longtap_new_post")
        public static final CreationEntryPoint VK_APP_LONGTAP_NEW_POST;

        static {
            CreationEntryPoint creationEntryPoint = new CreationEntryPoint("FEED", 0);
            FEED = creationEntryPoint;
            CreationEntryPoint creationEntryPoint2 = new CreationEntryPoint("FEED_PLUS_BUTTON", 1);
            FEED_PLUS_BUTTON = creationEntryPoint2;
            CreationEntryPoint creationEntryPoint3 = new CreationEntryPoint("GROUP_WALL_BUTTON", 2);
            GROUP_WALL_BUTTON = creationEntryPoint3;
            CreationEntryPoint creationEntryPoint4 = new CreationEntryPoint("PROFILE_PLUS_BUTTON", 3);
            PROFILE_PLUS_BUTTON = creationEntryPoint4;
            CreationEntryPoint creationEntryPoint5 = new CreationEntryPoint("PROFILE_WALL_BUTTON", 4);
            PROFILE_WALL_BUTTON = creationEntryPoint5;
            CreationEntryPoint creationEntryPoint6 = new CreationEntryPoint("PROFILE", 5);
            PROFILE = creationEntryPoint6;
            CreationEntryPoint creationEntryPoint7 = new CreationEntryPoint("CHANNEL_WRITE_BAR_BUTTON", 6);
            CHANNEL_WRITE_BAR_BUTTON = creationEntryPoint7;
            CreationEntryPoint creationEntryPoint8 = new CreationEntryPoint("POST_THREE_DOT_MENU_EDIT_ITEM", 7);
            POST_THREE_DOT_MENU_EDIT_ITEM = creationEntryPoint8;
            CreationEntryPoint creationEntryPoint9 = new CreationEntryPoint("TEXT_LIVE_BUTTON", 8);
            TEXT_LIVE_BUTTON = creationEntryPoint9;
            CreationEntryPoint creationEntryPoint10 = new CreationEntryPoint(NativeAdContent.ViewTag.OTHER, 9);
            OTHER = creationEntryPoint10;
            CreationEntryPoint creationEntryPoint11 = new CreationEntryPoint("GROUP_PLUS_BUTTON", 10);
            GROUP_PLUS_BUTTON = creationEntryPoint11;
            CreationEntryPoint creationEntryPoint12 = new CreationEntryPoint("GROUP", 11);
            GROUP = creationEntryPoint12;
            CreationEntryPoint creationEntryPoint13 = new CreationEntryPoint("GROUP_SUGGEST", 12);
            GROUP_SUGGEST = creationEntryPoint13;
            CreationEntryPoint creationEntryPoint14 = new CreationEntryPoint("LINK_NEW_POST", 13);
            LINK_NEW_POST = creationEntryPoint14;
            CreationEntryPoint creationEntryPoint15 = new CreationEntryPoint("FEED_DRAFT", 14);
            FEED_DRAFT = creationEntryPoint15;
            CreationEntryPoint creationEntryPoint16 = new CreationEntryPoint("PROFILE_DRAFT", 15);
            PROFILE_DRAFT = creationEntryPoint16;
            CreationEntryPoint creationEntryPoint17 = new CreationEntryPoint("GROUP_DRAFT", 16);
            GROUP_DRAFT = creationEntryPoint17;
            CreationEntryPoint creationEntryPoint18 = new CreationEntryPoint("ANDROID_SHARING", 17);
            ANDROID_SHARING = creationEntryPoint18;
            CreationEntryPoint creationEntryPoint19 = new CreationEntryPoint("PROFILE_ALL_POSTS", 18);
            PROFILE_ALL_POSTS = creationEntryPoint19;
            CreationEntryPoint creationEntryPoint20 = new CreationEntryPoint("PROFILE_OWN_POSTS", 19);
            PROFILE_OWN_POSTS = creationEntryPoint20;
            CreationEntryPoint creationEntryPoint21 = new CreationEntryPoint("GROUP_ALL_POSTS", 20);
            GROUP_ALL_POSTS = creationEntryPoint21;
            CreationEntryPoint creationEntryPoint22 = new CreationEntryPoint("GROUP_OWN_POSTS", 21);
            GROUP_OWN_POSTS = creationEntryPoint22;
            CreationEntryPoint creationEntryPoint23 = new CreationEntryPoint("GROUP_DONUT", 22);
            GROUP_DONUT = creationEntryPoint23;
            CreationEntryPoint creationEntryPoint24 = new CreationEntryPoint("LINK", 23);
            LINK = creationEntryPoint24;
            CreationEntryPoint creationEntryPoint25 = new CreationEntryPoint("FEED_TOP", 24);
            FEED_TOP = creationEntryPoint25;
            CreationEntryPoint creationEntryPoint26 = new CreationEntryPoint("FEED_RECENT", 25);
            FEED_RECENT = creationEntryPoint26;
            CreationEntryPoint creationEntryPoint27 = new CreationEntryPoint("IM", 26);
            IM = creationEntryPoint27;
            CreationEntryPoint creationEntryPoint28 = new CreationEntryPoint("PROFILE_POSTPONED_POSTS", 27);
            PROFILE_POSTPONED_POSTS = creationEntryPoint28;
            CreationEntryPoint creationEntryPoint29 = new CreationEntryPoint("GROUP_POSTPONED_POSTS", 28);
            GROUP_POSTPONED_POSTS = creationEntryPoint29;
            CreationEntryPoint creationEntryPoint30 = new CreationEntryPoint("PROFILE_POSTPONED_POSTS_THREE_POINTS", 29);
            PROFILE_POSTPONED_POSTS_THREE_POINTS = creationEntryPoint30;
            CreationEntryPoint creationEntryPoint31 = new CreationEntryPoint("GROUP_POSTPONED_POSTS_THREE_POINTS", 30);
            GROUP_POSTPONED_POSTS_THREE_POINTS = creationEntryPoint31;
            CreationEntryPoint creationEntryPoint32 = new CreationEntryPoint("GROUP_PREPARE_SUGGESTED_POST_BUTTON", 31);
            GROUP_PREPARE_SUGGESTED_POST_BUTTON = creationEntryPoint32;
            CreationEntryPoint creationEntryPoint33 = new CreationEntryPoint("GROUP_POSTING_SUGGESTED_POST_THREE_POINTS", 32);
            GROUP_POSTING_SUGGESTED_POST_THREE_POINTS = creationEntryPoint33;
            CreationEntryPoint creationEntryPoint34 = new CreationEntryPoint("VK_APP_LONGTAP_NEW_POST", 33);
            VK_APP_LONGTAP_NEW_POST = creationEntryPoint34;
            CreationEntryPoint creationEntryPoint35 = new CreationEntryPoint("VK_APP_LONGTAP_ADD_PHOTO", 34);
            VK_APP_LONGTAP_ADD_PHOTO = creationEntryPoint35;
            CreationEntryPoint creationEntryPoint36 = new CreationEntryPoint("FEED_SITPOSTING", 35);
            FEED_SITPOSTING = creationEntryPoint36;
            CreationEntryPoint creationEntryPoint37 = new CreationEntryPoint("GROUP_POSTPONED_POST_NOW", 36);
            GROUP_POSTPONED_POST_NOW = creationEntryPoint37;
            CreationEntryPoint creationEntryPoint38 = new CreationEntryPoint("PROFILE_POSTPONED_POST_NOW", 37);
            PROFILE_POSTPONED_POST_NOW = creationEntryPoint38;
            CreationEntryPoint creationEntryPoint39 = new CreationEntryPoint("GROUP_POSTPONED_POSTS_THREE_POINTS_POST_NOW", 38);
            GROUP_POSTPONED_POSTS_THREE_POINTS_POST_NOW = creationEntryPoint39;
            CreationEntryPoint creationEntryPoint40 = new CreationEntryPoint("PROFILE_POSTPONED_POSTS_THREE_POINTS_POST_NOW", 39);
            PROFILE_POSTPONED_POSTS_THREE_POINTS_POST_NOW = creationEntryPoint40;
            CreationEntryPoint creationEntryPoint41 = new CreationEntryPoint("GROUP_OPEN_DONUT_POST", 40);
            GROUP_OPEN_DONUT_POST = creationEntryPoint41;
            CreationEntryPoint creationEntryPoint42 = new CreationEntryPoint("VIDEO_UPLOAD_SETTINGS", 41);
            VIDEO_UPLOAD_SETTINGS = creationEntryPoint42;
            CreationEntryPoint creationEntryPoint43 = new CreationEntryPoint("SHARE_PHP", 42);
            SHARE_PHP = creationEntryPoint43;
            CreationEntryPoint creationEntryPoint44 = new CreationEntryPoint("ADD_COMMENT", 43);
            ADD_COMMENT = creationEntryPoint44;
            CreationEntryPoint creationEntryPoint45 = new CreationEntryPoint("PROFILE_PHOTO_UPDATE", 44);
            PROFILE_PHOTO_UPDATE = creationEntryPoint45;
            CreationEntryPoint creationEntryPoint46 = new CreationEntryPoint("CLIP_UPLOAD_SETTINGS", 45);
            CLIP_UPLOAD_SETTINGS = creationEntryPoint46;
            CreationEntryPoint creationEntryPoint47 = new CreationEntryPoint("VIDEO_LIVE_SETTINGS", 46);
            VIDEO_LIVE_SETTINGS = creationEntryPoint47;
            CreationEntryPoint creationEntryPoint48 = new CreationEntryPoint("VIDEO_LIVE_FINISHED", 47);
            VIDEO_LIVE_FINISHED = creationEntryPoint48;
            CreationEntryPoint creationEntryPoint49 = new CreationEntryPoint("REPOST_BUTTON", 48);
            REPOST_BUTTON = creationEntryPoint49;
            CreationEntryPoint creationEntryPoint50 = new CreationEntryPoint("GROUP_ALL_POSTS_REPOST_BUTTON", 49);
            GROUP_ALL_POSTS_REPOST_BUTTON = creationEntryPoint50;
            CreationEntryPoint creationEntryPoint51 = new CreationEntryPoint("GROUP_OWN_POSTS_REPOST_BUTTON", 50);
            GROUP_OWN_POSTS_REPOST_BUTTON = creationEntryPoint51;
            CreationEntryPoint creationEntryPoint52 = new CreationEntryPoint("PROFILE_ALL_POSTS_REPOST_BUTTON", 51);
            PROFILE_ALL_POSTS_REPOST_BUTTON = creationEntryPoint52;
            CreationEntryPoint creationEntryPoint53 = new CreationEntryPoint("PROFILE_OWN_POSTS_REPOST_BUTTON", 52);
            PROFILE_OWN_POSTS_REPOST_BUTTON = creationEntryPoint53;
            CreationEntryPoint creationEntryPoint54 = new CreationEntryPoint("MINI_APP", 53);
            MINI_APP = creationEntryPoint54;
            CreationEntryPoint creationEntryPoint55 = new CreationEntryPoint("COMMUNITY_CREATION_ONBOARDING_BLOCK", 54);
            COMMUNITY_CREATION_ONBOARDING_BLOCK = creationEntryPoint55;
            CreationEntryPoint creationEntryPoint56 = new CreationEntryPoint("FEED_EDIT_DRAFT", 55);
            FEED_EDIT_DRAFT = creationEntryPoint56;
            CreationEntryPoint creationEntryPoint57 = new CreationEntryPoint("FEED_EDIT_DRAFT_THREE_DOTS", 56);
            FEED_EDIT_DRAFT_THREE_DOTS = creationEntryPoint57;
            CreationEntryPoint creationEntryPoint58 = new CreationEntryPoint("FEED_DELETE_DRAFT", 57);
            FEED_DELETE_DRAFT = creationEntryPoint58;
            CreationEntryPoint creationEntryPoint59 = new CreationEntryPoint("FEED_DELETE_DRAFT_THREE_DOTS", 58);
            FEED_DELETE_DRAFT_THREE_DOTS = creationEntryPoint59;
            CreationEntryPoint creationEntryPoint60 = new CreationEntryPoint("LIST_EDIT_DRAFT", 59);
            LIST_EDIT_DRAFT = creationEntryPoint60;
            CreationEntryPoint creationEntryPoint61 = new CreationEntryPoint("LIST_EDIT_DRAFT_THREE_DOTS", 60);
            LIST_EDIT_DRAFT_THREE_DOTS = creationEntryPoint61;
            CreationEntryPoint creationEntryPoint62 = new CreationEntryPoint("LIST_DELETE_DRAFT_THREE_DOTS", 61);
            LIST_DELETE_DRAFT_THREE_DOTS = creationEntryPoint62;
            CreationEntryPoint[] creationEntryPointArr = {creationEntryPoint, creationEntryPoint2, creationEntryPoint3, creationEntryPoint4, creationEntryPoint5, creationEntryPoint6, creationEntryPoint7, creationEntryPoint8, creationEntryPoint9, creationEntryPoint10, creationEntryPoint11, creationEntryPoint12, creationEntryPoint13, creationEntryPoint14, creationEntryPoint15, creationEntryPoint16, creationEntryPoint17, creationEntryPoint18, creationEntryPoint19, creationEntryPoint20, creationEntryPoint21, creationEntryPoint22, creationEntryPoint23, creationEntryPoint24, creationEntryPoint25, creationEntryPoint26, creationEntryPoint27, creationEntryPoint28, creationEntryPoint29, creationEntryPoint30, creationEntryPoint31, creationEntryPoint32, creationEntryPoint33, creationEntryPoint34, creationEntryPoint35, creationEntryPoint36, creationEntryPoint37, creationEntryPoint38, creationEntryPoint39, creationEntryPoint40, creationEntryPoint41, creationEntryPoint42, creationEntryPoint43, creationEntryPoint44, creationEntryPoint45, creationEntryPoint46, creationEntryPoint47, creationEntryPoint48, creationEntryPoint49, creationEntryPoint50, creationEntryPoint51, creationEntryPoint52, creationEntryPoint53, creationEntryPoint54, creationEntryPoint55, creationEntryPoint56, creationEntryPoint57, creationEntryPoint58, creationEntryPoint59, creationEntryPoint60, creationEntryPoint61, creationEntryPoint62};
            $VALUES = creationEntryPointArr;
            $ENTRIES = new asp(creationEntryPointArr);
        }

        private CreationEntryPoint(String str, int i) {
        }

        public static CreationEntryPoint valueOf(String str) {
            return (CreationEntryPoint) Enum.valueOf(CreationEntryPoint.class, str);
        }

        public static CreationEntryPoint[] values() {
            return (CreationEntryPoint[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsConPostingStat$TypePostingItem>, a9y<MobileOfficialAppsConPostingStat$TypePostingItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) dq.f(x9yVar, "nav_screen", tru.a(), MobileOfficialAppsCoreNavStat$EventScreen.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("change_owner_event");
            MobileOfficialAppsConPostingStat$ChangeOwnerEvent mobileOfficialAppsConPostingStat$ChangeOwnerEvent = (MobileOfficialAppsConPostingStat$ChangeOwnerEvent) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), MobileOfficialAppsConPostingStat$ChangeOwnerEvent.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("navigation_event");
            MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent = (MobileOfficialAppsConPostingStat$NavigationEvent) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), MobileOfficialAppsConPostingStat$NavigationEvent.class));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("click_attachment_event");
            MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent = (MobileOfficialAppsConPostingStat$ClickAttachmentEvent) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(q3.k(), MobileOfficialAppsConPostingStat$ClickAttachmentEvent.class));
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("add_attachment_event");
            MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent = (MobileOfficialAppsConPostingStat$AddAttachmentEvent) ((q4 == null || (q4 instanceof u9y)) ? null : a4.fromJson(q4.k(), MobileOfficialAppsConPostingStat$AddAttachmentEvent.class));
            Gson a5 = tru.a();
            b9y q5 = x9yVar.q("settings_event");
            MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent = (MobileOfficialAppsConPostingStat$SettingsEvent) ((q5 == null || (q5 instanceof u9y)) ? null : a5.fromJson(q5.k(), MobileOfficialAppsConPostingStat$SettingsEvent.class));
            Gson a6 = tru.a();
            b9y q6 = x9yVar.q("photo_sizes");
            MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes = (MobileOfficialAppsConPostingStat$PhotoSizes) ((q6 == null || (q6 instanceof u9y)) ? null : a6.fromJson(q6.k(), MobileOfficialAppsConPostingStat$PhotoSizes.class));
            Gson a7 = tru.a();
            b9y q7 = x9yVar.q("crop_photo_event");
            MobileOfficialAppsConPostingStat$CropPhotoEvent mobileOfficialAppsConPostingStat$CropPhotoEvent = (MobileOfficialAppsConPostingStat$CropPhotoEvent) ((q7 == null || (q7 instanceof u9y)) ? null : a7.fromJson(q7.k(), MobileOfficialAppsConPostingStat$CropPhotoEvent.class));
            Gson a8 = tru.a();
            b9y q8 = x9yVar.q("crop_photo_click_event");
            MobileOfficialAppsConPostingStat$CropPhotoClickEvent mobileOfficialAppsConPostingStat$CropPhotoClickEvent = (MobileOfficialAppsConPostingStat$CropPhotoClickEvent) ((q8 == null || (q8 instanceof u9y)) ? null : a8.fromJson(q8.k(), MobileOfficialAppsConPostingStat$CropPhotoClickEvent.class));
            Gson a9 = tru.a();
            b9y q9 = x9yVar.q("photo_additional_info");
            MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo = (MobileOfficialAppsConPostingStat$PhotoAdditionalInfo) ((q9 == null || (q9 instanceof u9y)) ? null : a9.fromJson(q9.k(), MobileOfficialAppsConPostingStat$PhotoAdditionalInfo.class));
            Gson a10 = tru.a();
            b9y q10 = x9yVar.q("mention_event");
            MobileOfficialAppsConPostingStat$MentionEvent mobileOfficialAppsConPostingStat$MentionEvent = (MobileOfficialAppsConPostingStat$MentionEvent) ((q10 == null || (q10 instanceof u9y)) ? null : a10.fromJson(q10.k(), MobileOfficialAppsConPostingStat$MentionEvent.class));
            Gson a11 = tru.a();
            b9y q11 = x9yVar.q("poster_event");
            MobileOfficialAppsConPostingStat$PosterEvent mobileOfficialAppsConPostingStat$PosterEvent = (MobileOfficialAppsConPostingStat$PosterEvent) ((q11 == null || (q11 instanceof u9y)) ? null : a11.fromJson(q11.k(), MobileOfficialAppsConPostingStat$PosterEvent.class));
            Gson a12 = tru.a();
            b9y q12 = x9yVar.q("draft_event");
            MobileOfficialAppsConPostingStat$DraftEvent mobileOfficialAppsConPostingStat$DraftEvent = (MobileOfficialAppsConPostingStat$DraftEvent) ((q12 == null || (q12 instanceof u9y)) ? null : a12.fromJson(q12.k(), MobileOfficialAppsConPostingStat$DraftEvent.class));
            Gson a13 = tru.a();
            b9y q13 = x9yVar.q("remote_draft_event");
            MobileOfficialAppsConPostingStat$RemoteDraftEvent mobileOfficialAppsConPostingStat$RemoteDraftEvent = (MobileOfficialAppsConPostingStat$RemoteDraftEvent) ((q13 == null || (q13 instanceof u9y)) ? null : a13.fromJson(q13.k(), MobileOfficialAppsConPostingStat$RemoteDraftEvent.class));
            Gson a14 = tru.a();
            b9y q14 = x9yVar.q("best_friend_event");
            MobileOfficialAppsConPostingStat$BestFriendEvent mobileOfficialAppsConPostingStat$BestFriendEvent = (MobileOfficialAppsConPostingStat$BestFriendEvent) ((q14 == null || (q14 instanceof u9y)) ? null : a14.fromJson(q14.k(), MobileOfficialAppsConPostingStat$BestFriendEvent.class));
            Gson a15 = tru.a();
            b9y q15 = x9yVar.q("parsed_links_event");
            MobileOfficialAppsConPostingStat$ParsedLinksEvent mobileOfficialAppsConPostingStat$ParsedLinksEvent = (MobileOfficialAppsConPostingStat$ParsedLinksEvent) ((q15 == null || (q15 instanceof u9y)) ? null : a15.fromJson(q15.k(), MobileOfficialAppsConPostingStat$ParsedLinksEvent.class));
            Gson a16 = tru.a();
            b9y q16 = x9yVar.q("primary_mode_event");
            MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent = (MobileOfficialAppsConPostingStat$PrimaryModeEvent) ((q16 == null || (q16 instanceof u9y)) ? null : a16.fromJson(q16.k(), MobileOfficialAppsConPostingStat$PrimaryModeEvent.class));
            Gson a17 = tru.a();
            b9y q17 = x9yVar.q("edit_attachment_event");
            MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent = (MobileOfficialAppsConPostingStat$EditAttachmentEvent) ((q17 == null || (q17 instanceof u9y)) ? null : a17.fromJson(q17.k(), MobileOfficialAppsConPostingStat$EditAttachmentEvent.class));
            Integer A = fai.A(x9yVar, "post_id");
            Long B = fai.B(x9yVar, "owner_id");
            Gson a18 = tru.a();
            b9y q18 = x9yVar.q("post_type");
            PostType postType = (PostType) ((q18 == null || (q18 instanceof u9y)) ? null : a18.fromJson(q18.k(), PostType.class));
            Gson a19 = tru.a();
            b9y q19 = x9yVar.q("creation_entry_point");
            return new MobileOfficialAppsConPostingStat$TypePostingItem(mobileOfficialAppsCoreNavStat$EventScreen, mobileOfficialAppsConPostingStat$ChangeOwnerEvent, mobileOfficialAppsConPostingStat$NavigationEvent, mobileOfficialAppsConPostingStat$ClickAttachmentEvent, mobileOfficialAppsConPostingStat$AddAttachmentEvent, mobileOfficialAppsConPostingStat$SettingsEvent, mobileOfficialAppsConPostingStat$PhotoSizes, mobileOfficialAppsConPostingStat$CropPhotoEvent, mobileOfficialAppsConPostingStat$CropPhotoClickEvent, mobileOfficialAppsConPostingStat$PhotoAdditionalInfo, mobileOfficialAppsConPostingStat$MentionEvent, mobileOfficialAppsConPostingStat$PosterEvent, mobileOfficialAppsConPostingStat$DraftEvent, mobileOfficialAppsConPostingStat$RemoteDraftEvent, mobileOfficialAppsConPostingStat$BestFriendEvent, mobileOfficialAppsConPostingStat$ParsedLinksEvent, mobileOfficialAppsConPostingStat$PrimaryModeEvent, mobileOfficialAppsConPostingStat$EditAttachmentEvent, A, B, postType, (CreationEntryPoint) ((q19 == null || (q19 instanceof u9y)) ? null : a19.fromJson(q19.k(), CreationEntryPoint.class)), fai.C(x9yVar, "creation_session_id"), fai.B(x9yVar, "creation_session_id_int"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsConPostingStat$TypePostingItem mobileOfficialAppsConPostingStat$TypePostingItem = (MobileOfficialAppsConPostingStat$TypePostingItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("nav_screen", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.l()));
            x9yVar.o("change_owner_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.c()));
            x9yVar.o("navigation_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.m()));
            x9yVar.o("click_attachment_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.d()));
            x9yVar.o("add_attachment_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.a()));
            x9yVar.o("settings_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.w()));
            x9yVar.o("photo_sizes", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.q()));
            x9yVar.o("crop_photo_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.h()));
            x9yVar.o("crop_photo_click_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.g()));
            x9yVar.o("photo_additional_info", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.p()));
            x9yVar.o("mention_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.k()));
            x9yVar.o("poster_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.t()));
            x9yVar.o("draft_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.i()));
            x9yVar.o("remote_draft_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.v()));
            x9yVar.o("best_friend_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.b()));
            x9yVar.o("parsed_links_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.o()));
            x9yVar.o("primary_mode_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.u()));
            x9yVar.o("edit_attachment_event", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.j()));
            x9yVar.n("post_id", mobileOfficialAppsConPostingStat$TypePostingItem.r());
            x9yVar.n("owner_id", mobileOfficialAppsConPostingStat$TypePostingItem.n());
            x9yVar.o("post_type", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.s()));
            x9yVar.o("creation_entry_point", tru.a().toJson(mobileOfficialAppsConPostingStat$TypePostingItem.e()));
            x9yVar.o("creation_session_id", mobileOfficialAppsConPostingStat$TypePostingItem.a);
            x9yVar.n("creation_session_id_int", mobileOfficialAppsConPostingStat$TypePostingItem.f());
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    /* loaded from: classes5.dex */
    public static final class PostType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostType[] $VALUES;

        @pmi0("draft_status")
        public static final PostType DRAFT_STATUS;

        static {
            PostType postType = new PostType("DRAFT_STATUS", 0);
            DRAFT_STATUS = postType;
            PostType[] postTypeArr = {postType};
            $VALUES = postTypeArr;
            $ENTRIES = new asp(postTypeArr);
        }

        private PostType(String str, int i) {
        }

        public static PostType valueOf(String str) {
            return (PostType) Enum.valueOf(PostType.class, str);
        }

        public static PostType[] values() {
            return (PostType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPostingStat$TypePostingItem(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConPostingStat$ChangeOwnerEvent mobileOfficialAppsConPostingStat$ChangeOwnerEvent, MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent, MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent, MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent, MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent, MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes, MobileOfficialAppsConPostingStat$CropPhotoEvent mobileOfficialAppsConPostingStat$CropPhotoEvent, MobileOfficialAppsConPostingStat$CropPhotoClickEvent mobileOfficialAppsConPostingStat$CropPhotoClickEvent, MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo, MobileOfficialAppsConPostingStat$MentionEvent mobileOfficialAppsConPostingStat$MentionEvent, MobileOfficialAppsConPostingStat$PosterEvent mobileOfficialAppsConPostingStat$PosterEvent, MobileOfficialAppsConPostingStat$DraftEvent mobileOfficialAppsConPostingStat$DraftEvent, MobileOfficialAppsConPostingStat$RemoteDraftEvent mobileOfficialAppsConPostingStat$RemoteDraftEvent, MobileOfficialAppsConPostingStat$BestFriendEvent mobileOfficialAppsConPostingStat$BestFriendEvent, MobileOfficialAppsConPostingStat$ParsedLinksEvent mobileOfficialAppsConPostingStat$ParsedLinksEvent, MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent, MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent, Integer num, Long l, PostType postType, CreationEntryPoint creationEntryPoint, String str, Long l2) {
        this.navScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.changeOwnerEvent = mobileOfficialAppsConPostingStat$ChangeOwnerEvent;
        this.navigationEvent = mobileOfficialAppsConPostingStat$NavigationEvent;
        this.clickAttachmentEvent = mobileOfficialAppsConPostingStat$ClickAttachmentEvent;
        this.addAttachmentEvent = mobileOfficialAppsConPostingStat$AddAttachmentEvent;
        this.settingsEvent = mobileOfficialAppsConPostingStat$SettingsEvent;
        this.photoSizes = mobileOfficialAppsConPostingStat$PhotoSizes;
        this.cropPhotoEvent = mobileOfficialAppsConPostingStat$CropPhotoEvent;
        this.cropPhotoClickEvent = mobileOfficialAppsConPostingStat$CropPhotoClickEvent;
        this.photoAdditionalInfo = mobileOfficialAppsConPostingStat$PhotoAdditionalInfo;
        this.mentionEvent = mobileOfficialAppsConPostingStat$MentionEvent;
        this.posterEvent = mobileOfficialAppsConPostingStat$PosterEvent;
        this.draftEvent = mobileOfficialAppsConPostingStat$DraftEvent;
        this.remoteDraftEvent = mobileOfficialAppsConPostingStat$RemoteDraftEvent;
        this.bestFriendEvent = mobileOfficialAppsConPostingStat$BestFriendEvent;
        this.parsedLinksEvent = mobileOfficialAppsConPostingStat$ParsedLinksEvent;
        this.primaryModeEvent = mobileOfficialAppsConPostingStat$PrimaryModeEvent;
        this.editAttachmentEvent = mobileOfficialAppsConPostingStat$EditAttachmentEvent;
        this.postId = num;
        this.ownerId = l;
        this.postType = postType;
        this.creationEntryPoint = creationEntryPoint;
        this.a = str;
        this.creationSessionIdInt = l2;
        FilteredString filteredString = new FilteredString(lhg.b(36));
        this.filteredCreationSessionId = filteredString;
        filteredString.a(str);
    }

    public final MobileOfficialAppsConPostingStat$AddAttachmentEvent a() {
        return this.addAttachmentEvent;
    }

    public final MobileOfficialAppsConPostingStat$BestFriendEvent b() {
        return this.bestFriendEvent;
    }

    public final MobileOfficialAppsConPostingStat$ChangeOwnerEvent c() {
        return this.changeOwnerEvent;
    }

    public final MobileOfficialAppsConPostingStat$ClickAttachmentEvent d() {
        return this.clickAttachmentEvent;
    }

    public final CreationEntryPoint e() {
        return this.creationEntryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$TypePostingItem)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$TypePostingItem mobileOfficialAppsConPostingStat$TypePostingItem = (MobileOfficialAppsConPostingStat$TypePostingItem) obj;
        return this.navScreen == mobileOfficialAppsConPostingStat$TypePostingItem.navScreen && epx.f(this.changeOwnerEvent, mobileOfficialAppsConPostingStat$TypePostingItem.changeOwnerEvent) && epx.f(this.navigationEvent, mobileOfficialAppsConPostingStat$TypePostingItem.navigationEvent) && epx.f(this.clickAttachmentEvent, mobileOfficialAppsConPostingStat$TypePostingItem.clickAttachmentEvent) && epx.f(this.addAttachmentEvent, mobileOfficialAppsConPostingStat$TypePostingItem.addAttachmentEvent) && epx.f(this.settingsEvent, mobileOfficialAppsConPostingStat$TypePostingItem.settingsEvent) && epx.f(this.photoSizes, mobileOfficialAppsConPostingStat$TypePostingItem.photoSizes) && epx.f(this.cropPhotoEvent, mobileOfficialAppsConPostingStat$TypePostingItem.cropPhotoEvent) && epx.f(this.cropPhotoClickEvent, mobileOfficialAppsConPostingStat$TypePostingItem.cropPhotoClickEvent) && epx.f(this.photoAdditionalInfo, mobileOfficialAppsConPostingStat$TypePostingItem.photoAdditionalInfo) && epx.f(this.mentionEvent, mobileOfficialAppsConPostingStat$TypePostingItem.mentionEvent) && epx.f(this.posterEvent, mobileOfficialAppsConPostingStat$TypePostingItem.posterEvent) && epx.f(this.draftEvent, mobileOfficialAppsConPostingStat$TypePostingItem.draftEvent) && epx.f(this.remoteDraftEvent, mobileOfficialAppsConPostingStat$TypePostingItem.remoteDraftEvent) && epx.f(this.bestFriendEvent, mobileOfficialAppsConPostingStat$TypePostingItem.bestFriendEvent) && epx.f(this.parsedLinksEvent, mobileOfficialAppsConPostingStat$TypePostingItem.parsedLinksEvent) && epx.f(this.primaryModeEvent, mobileOfficialAppsConPostingStat$TypePostingItem.primaryModeEvent) && epx.f(this.editAttachmentEvent, mobileOfficialAppsConPostingStat$TypePostingItem.editAttachmentEvent) && epx.f(this.postId, mobileOfficialAppsConPostingStat$TypePostingItem.postId) && epx.f(this.ownerId, mobileOfficialAppsConPostingStat$TypePostingItem.ownerId) && this.postType == mobileOfficialAppsConPostingStat$TypePostingItem.postType && this.creationEntryPoint == mobileOfficialAppsConPostingStat$TypePostingItem.creationEntryPoint && epx.f(this.a, mobileOfficialAppsConPostingStat$TypePostingItem.a) && epx.f(this.creationSessionIdInt, mobileOfficialAppsConPostingStat$TypePostingItem.creationSessionIdInt);
    }

    public final Long f() {
        return this.creationSessionIdInt;
    }

    public final MobileOfficialAppsConPostingStat$CropPhotoClickEvent g() {
        return this.cropPhotoClickEvent;
    }

    public final MobileOfficialAppsConPostingStat$CropPhotoEvent h() {
        return this.cropPhotoEvent;
    }

    public final int hashCode() {
        int hashCode = this.navScreen.hashCode() * 31;
        MobileOfficialAppsConPostingStat$ChangeOwnerEvent mobileOfficialAppsConPostingStat$ChangeOwnerEvent = this.changeOwnerEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPostingStat$ChangeOwnerEvent == null ? 0 : mobileOfficialAppsConPostingStat$ChangeOwnerEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent = this.navigationEvent;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsConPostingStat$NavigationEvent == null ? 0 : mobileOfficialAppsConPostingStat$NavigationEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent = this.clickAttachmentEvent;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsConPostingStat$ClickAttachmentEvent == null ? 0 : mobileOfficialAppsConPostingStat$ClickAttachmentEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent = this.addAttachmentEvent;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsConPostingStat$AddAttachmentEvent == null ? 0 : mobileOfficialAppsConPostingStat$AddAttachmentEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent = this.settingsEvent;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsConPostingStat$SettingsEvent == null ? 0 : mobileOfficialAppsConPostingStat$SettingsEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes = this.photoSizes;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsConPostingStat$PhotoSizes == null ? 0 : mobileOfficialAppsConPostingStat$PhotoSizes.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$CropPhotoEvent mobileOfficialAppsConPostingStat$CropPhotoEvent = this.cropPhotoEvent;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsConPostingStat$CropPhotoEvent == null ? 0 : mobileOfficialAppsConPostingStat$CropPhotoEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$CropPhotoClickEvent mobileOfficialAppsConPostingStat$CropPhotoClickEvent = this.cropPhotoClickEvent;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsConPostingStat$CropPhotoClickEvent == null ? 0 : mobileOfficialAppsConPostingStat$CropPhotoClickEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo = this.photoAdditionalInfo;
        int hashCode10 = (hashCode9 + (mobileOfficialAppsConPostingStat$PhotoAdditionalInfo == null ? 0 : mobileOfficialAppsConPostingStat$PhotoAdditionalInfo.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$MentionEvent mobileOfficialAppsConPostingStat$MentionEvent = this.mentionEvent;
        int hashCode11 = (hashCode10 + (mobileOfficialAppsConPostingStat$MentionEvent == null ? 0 : mobileOfficialAppsConPostingStat$MentionEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$PosterEvent mobileOfficialAppsConPostingStat$PosterEvent = this.posterEvent;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsConPostingStat$PosterEvent == null ? 0 : mobileOfficialAppsConPostingStat$PosterEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$DraftEvent mobileOfficialAppsConPostingStat$DraftEvent = this.draftEvent;
        int hashCode13 = (hashCode12 + (mobileOfficialAppsConPostingStat$DraftEvent == null ? 0 : mobileOfficialAppsConPostingStat$DraftEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$RemoteDraftEvent mobileOfficialAppsConPostingStat$RemoteDraftEvent = this.remoteDraftEvent;
        int hashCode14 = (hashCode13 + (mobileOfficialAppsConPostingStat$RemoteDraftEvent == null ? 0 : mobileOfficialAppsConPostingStat$RemoteDraftEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$BestFriendEvent mobileOfficialAppsConPostingStat$BestFriendEvent = this.bestFriendEvent;
        int hashCode15 = (hashCode14 + (mobileOfficialAppsConPostingStat$BestFriendEvent == null ? 0 : mobileOfficialAppsConPostingStat$BestFriendEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$ParsedLinksEvent mobileOfficialAppsConPostingStat$ParsedLinksEvent = this.parsedLinksEvent;
        int hashCode16 = (hashCode15 + (mobileOfficialAppsConPostingStat$ParsedLinksEvent == null ? 0 : mobileOfficialAppsConPostingStat$ParsedLinksEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent = this.primaryModeEvent;
        int hashCode17 = (hashCode16 + (mobileOfficialAppsConPostingStat$PrimaryModeEvent == null ? 0 : mobileOfficialAppsConPostingStat$PrimaryModeEvent.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent = this.editAttachmentEvent;
        int hashCode18 = (hashCode17 + (mobileOfficialAppsConPostingStat$EditAttachmentEvent == null ? 0 : mobileOfficialAppsConPostingStat$EditAttachmentEvent.hashCode())) * 31;
        Integer num = this.postId;
        int hashCode19 = (hashCode18 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode20 = (hashCode19 + (l == null ? 0 : l.hashCode())) * 31;
        PostType postType = this.postType;
        int hashCode21 = (hashCode20 + (postType == null ? 0 : postType.hashCode())) * 31;
        CreationEntryPoint creationEntryPoint = this.creationEntryPoint;
        int hashCode22 = (hashCode21 + (creationEntryPoint == null ? 0 : creationEntryPoint.hashCode())) * 31;
        String str = this.a;
        int hashCode23 = (hashCode22 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.creationSessionIdInt;
        return hashCode23 + (l2 != null ? l2.hashCode() : 0);
    }

    public final MobileOfficialAppsConPostingStat$DraftEvent i() {
        return this.draftEvent;
    }

    public final MobileOfficialAppsConPostingStat$EditAttachmentEvent j() {
        return this.editAttachmentEvent;
    }

    public final MobileOfficialAppsConPostingStat$MentionEvent k() {
        return this.mentionEvent;
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen l() {
        return this.navScreen;
    }

    public final MobileOfficialAppsConPostingStat$NavigationEvent m() {
        return this.navigationEvent;
    }

    public final Long n() {
        return this.ownerId;
    }

    public final MobileOfficialAppsConPostingStat$ParsedLinksEvent o() {
        return this.parsedLinksEvent;
    }

    public final MobileOfficialAppsConPostingStat$PhotoAdditionalInfo p() {
        return this.photoAdditionalInfo;
    }

    public final MobileOfficialAppsConPostingStat$PhotoSizes q() {
        return this.photoSizes;
    }

    public final Integer r() {
        return this.postId;
    }

    public final PostType s() {
        return this.postType;
    }

    public final MobileOfficialAppsConPostingStat$PosterEvent t() {
        return this.posterEvent;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePostingItem(navScreen=");
        sb.append(this.navScreen);
        sb.append(", changeOwnerEvent=");
        sb.append(this.changeOwnerEvent);
        sb.append(", navigationEvent=");
        sb.append(this.navigationEvent);
        sb.append(", clickAttachmentEvent=");
        sb.append(this.clickAttachmentEvent);
        sb.append(", addAttachmentEvent=");
        sb.append(this.addAttachmentEvent);
        sb.append(", settingsEvent=");
        sb.append(this.settingsEvent);
        sb.append(", photoSizes=");
        sb.append(this.photoSizes);
        sb.append(", cropPhotoEvent=");
        sb.append(this.cropPhotoEvent);
        sb.append(", cropPhotoClickEvent=");
        sb.append(this.cropPhotoClickEvent);
        sb.append(", photoAdditionalInfo=");
        sb.append(this.photoAdditionalInfo);
        sb.append(", mentionEvent=");
        sb.append(this.mentionEvent);
        sb.append(", posterEvent=");
        sb.append(this.posterEvent);
        sb.append(", draftEvent=");
        sb.append(this.draftEvent);
        sb.append(", remoteDraftEvent=");
        sb.append(this.remoteDraftEvent);
        sb.append(", bestFriendEvent=");
        sb.append(this.bestFriendEvent);
        sb.append(", parsedLinksEvent=");
        sb.append(this.parsedLinksEvent);
        sb.append(", primaryModeEvent=");
        sb.append(this.primaryModeEvent);
        sb.append(", editAttachmentEvent=");
        sb.append(this.editAttachmentEvent);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", postType=");
        sb.append(this.postType);
        sb.append(", creationEntryPoint=");
        sb.append(this.creationEntryPoint);
        sb.append(", creationSessionId=");
        sb.append(this.a);
        sb.append(", creationSessionIdInt=");
        return iq.b(sb, this.creationSessionIdInt, ')');
    }

    public final MobileOfficialAppsConPostingStat$PrimaryModeEvent u() {
        return this.primaryModeEvent;
    }

    public final MobileOfficialAppsConPostingStat$RemoteDraftEvent v() {
        return this.remoteDraftEvent;
    }

    public final MobileOfficialAppsConPostingStat$SettingsEvent w() {
        return this.settingsEvent;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$TypePostingItem(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsConPostingStat$ChangeOwnerEvent mobileOfficialAppsConPostingStat$ChangeOwnerEvent, MobileOfficialAppsConPostingStat$NavigationEvent mobileOfficialAppsConPostingStat$NavigationEvent, MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent, MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent, MobileOfficialAppsConPostingStat$SettingsEvent mobileOfficialAppsConPostingStat$SettingsEvent, MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes, MobileOfficialAppsConPostingStat$CropPhotoEvent mobileOfficialAppsConPostingStat$CropPhotoEvent, MobileOfficialAppsConPostingStat$CropPhotoClickEvent mobileOfficialAppsConPostingStat$CropPhotoClickEvent, MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo, MobileOfficialAppsConPostingStat$MentionEvent mobileOfficialAppsConPostingStat$MentionEvent, MobileOfficialAppsConPostingStat$PosterEvent mobileOfficialAppsConPostingStat$PosterEvent, MobileOfficialAppsConPostingStat$DraftEvent mobileOfficialAppsConPostingStat$DraftEvent, MobileOfficialAppsConPostingStat$RemoteDraftEvent mobileOfficialAppsConPostingStat$RemoteDraftEvent, MobileOfficialAppsConPostingStat$BestFriendEvent mobileOfficialAppsConPostingStat$BestFriendEvent, MobileOfficialAppsConPostingStat$ParsedLinksEvent mobileOfficialAppsConPostingStat$ParsedLinksEvent, MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent, MobileOfficialAppsConPostingStat$EditAttachmentEvent mobileOfficialAppsConPostingStat$EditAttachmentEvent, Integer num, Long l, PostType postType, CreationEntryPoint creationEntryPoint, String str, Long l2, int i, zcl zclVar) {
        this(mobileOfficialAppsCoreNavStat$EventScreen, (i & 2) != 0 ? null : mobileOfficialAppsConPostingStat$ChangeOwnerEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPostingStat$NavigationEvent, (i & 8) != 0 ? null : mobileOfficialAppsConPostingStat$ClickAttachmentEvent, (i & 16) != 0 ? null : mobileOfficialAppsConPostingStat$AddAttachmentEvent, (i & 32) != 0 ? null : mobileOfficialAppsConPostingStat$SettingsEvent, (i & 64) != 0 ? null : mobileOfficialAppsConPostingStat$PhotoSizes, (i & 128) != 0 ? null : mobileOfficialAppsConPostingStat$CropPhotoEvent, (i & 256) != 0 ? null : mobileOfficialAppsConPostingStat$CropPhotoClickEvent, (i & 512) != 0 ? null : mobileOfficialAppsConPostingStat$PhotoAdditionalInfo, (i & 1024) != 0 ? null : mobileOfficialAppsConPostingStat$MentionEvent, (i & 2048) != 0 ? null : mobileOfficialAppsConPostingStat$PosterEvent, (i & 4096) != 0 ? null : mobileOfficialAppsConPostingStat$DraftEvent, (i & 8192) != 0 ? null : mobileOfficialAppsConPostingStat$RemoteDraftEvent, (i & 16384) != 0 ? null : mobileOfficialAppsConPostingStat$BestFriendEvent, (i & 32768) != 0 ? null : mobileOfficialAppsConPostingStat$ParsedLinksEvent, (i & 65536) != 0 ? null : mobileOfficialAppsConPostingStat$PrimaryModeEvent, (i & 131072) != 0 ? null : mobileOfficialAppsConPostingStat$EditAttachmentEvent, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num, (i & 524288) != 0 ? null : l, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : postType, (i & 2097152) != 0 ? null : creationEntryPoint, (i & 4194304) != 0 ? null : str, (i & 8388608) != 0 ? null : l2);
    }
}
