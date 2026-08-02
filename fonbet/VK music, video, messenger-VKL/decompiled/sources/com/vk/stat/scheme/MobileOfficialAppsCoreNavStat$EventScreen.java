package com.vk.stat.scheme;

import com.coremedia.iso.boxes.AuthorBox;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.zxing.pdf417.PDF417Common;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4504q2;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import org.chromium.net.telemetry.CronetStatsLog;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.proto.PublisherConfiguration;
import xsna.atv0;
import xsna.e370;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCoreNavStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreNavStat$EventScreen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCoreNavStat$EventScreen[] $VALUES;

    @pmi0("about")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ABOUT = new MobileOfficialAppsCoreNavStat$EventScreen("ABOUT", 0);

    @pmi0("about_licenses")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ABOUT_LICENSES = new MobileOfficialAppsCoreNavStat$EventScreen("ABOUT_LICENSES", 1);

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final MobileOfficialAppsCoreNavStat$EventScreen APP = new MobileOfficialAppsCoreNavStat$EventScreen("APP", 2);

    @pmi0("app_side_menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APP_SIDE_MENU = new MobileOfficialAppsCoreNavStat$EventScreen("APP_SIDE_MENU", 3);

    @pmi0("app_tabbar_menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APP_TABBAR_MENU = new MobileOfficialAppsCoreNavStat$EventScreen("APP_TABBAR_MENU", 4);

    @pmi0("apps")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS = new MobileOfficialAppsCoreNavStat$EventScreen("APPS", 5);

    @pmi0("apps_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("APPS_CATALOG", 6);

    @pmi0("apps_catalog_categories")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS_CATALOG_CATEGORIES = new MobileOfficialAppsCoreNavStat$EventScreen("APPS_CATALOG_CATEGORIES", 7);

    @pmi0("apps_catalog_category")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS_CATALOG_CATEGORY = new MobileOfficialAppsCoreNavStat$EventScreen("APPS_CATALOG_CATEGORY", 8);

    @pmi0("apps_catalog_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS_CATALOG_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("APPS_CATALOG_SEARCH", 9);

    @pmi0("apps_external_link")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS_EXTERNAL_LINK = new MobileOfficialAppsCoreNavStat$EventScreen("APPS_EXTERNAL_LINK", 10);

    @pmi0("article_read")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ARTICLE_READ = new MobileOfficialAppsCoreNavStat$EventScreen("ARTICLE_READ", 11);

    @pmi0("article_blog_press")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ARTICLE_BLOG_PRESS = new MobileOfficialAppsCoreNavStat$EventScreen("ARTICLE_BLOG_PRESS", 12);

    @pmi0("article_dzen")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ARTICLE_DZEN = new MobileOfficialAppsCoreNavStat$EventScreen("ARTICLE_DZEN", 13);

    @pmi0("articles_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ARTICLES_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("ARTICLES_LIST", 14);

    @pmi0("attach_documents")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_DOCUMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_DOCUMENTS", 15);

    @pmi0("attach_documents_image")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_DOCUMENTS_IMAGE = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_DOCUMENTS_IMAGE", 16);

    @pmi0("attach_documents_text")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_DOCUMENTS_TEXT = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_DOCUMENTS_TEXT", 17);

    @pmi0("attach_documents_gif")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_DOCUMENTS_GIF = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_DOCUMENTS_GIF", 18);

    @pmi0("attach_documents_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_DOCUMENTS_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_DOCUMENTS_VIDEO", 19);

    @pmi0("attach_documents_other")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_DOCUMENTS_OTHER = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_DOCUMENTS_OTHER", 20);

    @pmi0("attach_gallery")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_GALLERY = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_GALLERY", 21);

    @pmi0("attach_graffiti")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_GRAFFITI = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_GRAFFITI", 22);

    @pmi0("attach_music")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_MUSIC = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_MUSIC", 23);

    @pmi0("attach_location")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_LOCATION = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_LOCATION", 24);

    @pmi0("attach_money_transfer")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_MONEY_TRANSFER = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_MONEY_TRANSFER", 25);

    @pmi0("attach_vk_gift")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_VK_GIFT = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_VK_GIFT", 26);

    @pmi0("attach_vk_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_VK_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_VK_PHOTO", 27);

    @pmi0("attach_vk_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_VK_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_VK_VIDEO", 28);

    @pmi0("attach_vk_poll")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_VK_POLL = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_VK_POLL", 29);

    @pmi0("attach_gallery_mini_apps")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_GALLERY_MINI_APPS = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_GALLERY_MINI_APPS", 30);

    @pmi0("attach_gallery_games")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ATTACH_GALLERY_GAMES = new MobileOfficialAppsCoreNavStat$EventScreen("ATTACH_GALLERY_GAMES", 31);

    @pmi0("audio")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUDIO = new MobileOfficialAppsCoreNavStat$EventScreen(SignalingProtocol.MEDIA_OPTION_AUDIO, 32);

    @pmi0("audio_book_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUDIO_BOOK_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("AUDIO_BOOK_PAGE", 33);

    @pmi0("audio_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUDIO_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("AUDIO_CATALOG", 34);

    @pmi0("audio_fullscreen_banner")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUDIO_FULLSCREEN_BANNER = new MobileOfficialAppsCoreNavStat$EventScreen("AUDIO_FULLSCREEN_BANNER", 35);

    @pmi0("auth_push")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUTH_PUSH = new MobileOfficialAppsCoreNavStat$EventScreen("AUTH_PUSH", 36);

    @pmi0("alert_auth_success")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALERT_AUTH_SUCCESS = new MobileOfficialAppsCoreNavStat$EventScreen("ALERT_AUTH_SUCCESS", 37);

    @pmi0("album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("ALBUM", 38);

    @pmi0("album_edit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALBUM_EDIT = new MobileOfficialAppsCoreNavStat$EventScreen("ALBUM_EDIT", 39);

    @pmi0("album_video_edit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALBUM_VIDEO_EDIT = new MobileOfficialAppsCoreNavStat$EventScreen("ALBUM_VIDEO_EDIT", 40);

    @pmi0("album_privacy_edit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALBUM_PRIVACY_EDIT = new MobileOfficialAppsCoreNavStat$EventScreen("ALBUM_PRIVACY_EDIT", 41);

    @pmi0("album_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALBUM_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("ALBUM_SETTINGS", 42);

    @pmi0(AuthorBox.TYPE)
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUTH = new MobileOfficialAppsCoreNavStat$EventScreen("AUTH", 43);

    @pmi0("avatar_crop")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AVATAR_CROP = new MobileOfficialAppsCoreNavStat$EventScreen("AVATAR_CROP", 44);

    @pmi0("avatar_publish")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AVATAR_PUBLISH = new MobileOfficialAppsCoreNavStat$EventScreen("AVATAR_PUBLISH", 45);

    @pmi0("badges_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BADGES_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("BADGES_ALL", 46);

    @pmi0("badges_friends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BADGES_FRIENDS = new MobileOfficialAppsCoreNavStat$EventScreen("BADGES_FRIENDS", 47);

    @pmi0("badge")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BADGE = new MobileOfficialAppsCoreNavStat$EventScreen("BADGE", 48);

    @pmi0("badges_collection_all__u")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BADGES_COLLECTION_ALL__U = new MobileOfficialAppsCoreNavStat$EventScreen("BADGES_COLLECTION_ALL__U", 49);

    @pmi0("badges_collection_badge__u")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BADGES_COLLECTION_BADGE__U = new MobileOfficialAppsCoreNavStat$EventScreen("BADGES_COLLECTION_BADGE__U", 50);

    @pmi0("badges_collection_all__c")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BADGES_COLLECTION_ALL__C = new MobileOfficialAppsCoreNavStat$EventScreen("BADGES_COLLECTION_ALL__C", 51);

    @pmi0("badges_collection_badge__c")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BADGES_COLLECTION_BADGE__C = new MobileOfficialAppsCoreNavStat$EventScreen("BADGES_COLLECTION_BADGE__C", 52);

    @pmi0("badges_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BADGES_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("BADGES_CATALOG", 53);

    @pmi0("balance_promo_code")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BALANCE_PROMO_CODE = new MobileOfficialAppsCoreNavStat$EventScreen("BALANCE_PROMO_CODE", 54);

    @pmi0("balance_votes_add")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BALANCE_VOTES_ADD = new MobileOfficialAppsCoreNavStat$EventScreen("BALANCE_VOTES_ADD", 55);

    @pmi0("banned_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BANNED_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("BANNED_ACCOUNT", 56);

    @pmi0("board")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BOARD = new MobileOfficialAppsCoreNavStat$EventScreen("BOARD", 57);

    @pmi0("board_topic_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BOARD_TOPIC_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("BOARD_TOPIC_ALL", 58);

    @pmi0("board_topic_edit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BOARD_TOPIC_EDIT = new MobileOfficialAppsCoreNavStat$EventScreen("BOARD_TOPIC_EDIT", 59);

    @pmi0("board_topic_view")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BOARD_TOPIC_VIEW = new MobileOfficialAppsCoreNavStat$EventScreen("BOARD_TOPIC_VIEW", 60);

    @pmi0("browser")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BROWSER = new MobileOfficialAppsCoreNavStat$EventScreen("BROWSER", 61);

    @pmi0("bugtracker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BUGTRACKER = new MobileOfficialAppsCoreNavStat$EventScreen("BUGTRACKER", 62);

    @pmi0("buy_subscription_trial")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BUY_SUBSCRIPTION_TRIAL = new MobileOfficialAppsCoreNavStat$EventScreen("BUY_SUBSCRIPTION_TRIAL", 63);

    @pmi0("buy_subscription_retrial")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BUY_SUBSCRIPTION_RETRIAL = new MobileOfficialAppsCoreNavStat$EventScreen("BUY_SUBSCRIPTION_RETRIAL", 64);

    @pmi0("buy_subscription_notrial")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BUY_SUBSCRIPTION_NOTRIAL = new MobileOfficialAppsCoreNavStat$EventScreen("BUY_SUBSCRIPTION_NOTRIAL", 65);

    @pmi0("captcha")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CAPTCHA = new MobileOfficialAppsCoreNavStat$EventScreen("CAPTCHA", 66);

    @pmi0("catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("CATALOG", 67);

    @pmi0("celebrity_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CELEBRITY_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("CELEBRITY_PROFILE", 68);

    @pmi0("celebrity_verification_faq")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CELEBRITY_VERIFICATION_FAQ = new MobileOfficialAppsCoreNavStat$EventScreen("CELEBRITY_VERIFICATION_FAQ", 69);

    @pmi0("classified")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLASSIFIED = new MobileOfficialAppsCoreNavStat$EventScreen("CLASSIFIED", 70);

    @pmi0("classifieds_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLASSIFIEDS_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("CLASSIFIEDS_CATALOG", 71);

    @pmi0("classifieds_create_form")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLASSIFIEDS_CREATE_FORM = new MobileOfficialAppsCoreNavStat$EventScreen("CLASSIFIEDS_CREATE_FORM", 72);

    @pmi0("classifieds_create_post")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLASSIFIEDS_CREATE_POST = new MobileOfficialAppsCoreNavStat$EventScreen("CLASSIFIEDS_CREATE_POST", 73);

    @pmi0("classifieds_item")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLASSIFIEDS_ITEM = new MobileOfficialAppsCoreNavStat$EventScreen("CLASSIFIEDS_ITEM", 74);

    @pmi0("classifieds_products")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLASSIFIEDS_PRODUCTS = new MobileOfficialAppsCoreNavStat$EventScreen("CLASSIFIEDS_PRODUCTS", 75);

    @pmi0("classifieds_native_product")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLASSIFIEDS_NATIVE_PRODUCT = new MobileOfficialAppsCoreNavStat$EventScreen("CLASSIFIEDS_NATIVE_PRODUCT", 76);

    @pmi0("classifieds_subscription")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLASSIFIEDS_SUBSCRIPTION = new MobileOfficialAppsCoreNavStat$EventScreen("CLASSIFIEDS_SUBSCRIPTION", 77);

    @pmi0("clip_badges_summary")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIP_BADGES_SUMMARY = new MobileOfficialAppsCoreNavStat$EventScreen("CLIP_BADGES_SUMMARY", 78);

    @pmi0("clip_compilations_bottom_sheet")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIP_COMPILATIONS_BOTTOM_SHEET = new MobileOfficialAppsCoreNavStat$EventScreen("CLIP_COMPILATIONS_BOTTOM_SHEET", 79);

    @pmi0("clip_effect_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIP_EFFECT_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("CLIP_EFFECT_LIST", 80);

    @pmi0("clip_grid")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIP_GRID = new MobileOfficialAppsCoreNavStat$EventScreen("CLIP_GRID", 81);

    @pmi0("clips_grid_music")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_MUSIC = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_MUSIC", 82);

    @pmi0("clips_grid_sound")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_SOUND = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_SOUND", 83);

    @pmi0("clips_grid_tag")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_TAG = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_TAG", 84);

    @pmi0("clips_grid_challenge")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_CHALLENGE = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_CHALLENGE", 85);

    @pmi0("clips_grid_effect")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_EFFECT = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_EFFECT", 86);

    @pmi0("clips_grid_mask")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_MASK = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_MASK", 87);

    @pmi0("clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS", 88);

    @pmi0("clips_audio_cropper")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_AUDIO_CROPPER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_AUDIO_CROPPER", 89);

    @pmi0("clips_audio_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_AUDIO_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_AUDIO_PICKER", 90);

    @pmi0("clips_camera_drafts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_CAMERA_DRAFTS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_CAMERA_DRAFTS", 91);

    @pmi0("clips_camera_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_CAMERA_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_CAMERA_SETTINGS", 92);

    @pmi0("clips_camera_timer")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_CAMERA_TIMER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_CAMERA_TIMER", 93);

    @pmi0("clips_camera")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_CAMERA = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_CAMERA", 94);

    @pmi0("clips_choice_interests")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_CHOICE_INTERESTS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_CHOICE_INTERESTS", 95);

    @pmi0("clips_cover_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_COVER_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_COVER_EDITOR", 96);

    @pmi0("clips_deepfake_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_DEEPFAKE_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_DEEPFAKE_ONBOARDING", 97);

    @pmi0("clips_deepfake_templates")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_DEEPFAKE_TEMPLATES = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_DEEPFAKE_TEMPLATES", 98);

    @pmi0("clips_discover")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_DISCOVER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_DISCOVER", 99);

    @pmi0("clips_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_EDITOR", 100);

    @pmi0("clips_editor_fragments_swap")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_EDITOR_FRAGMENTS_SWAP = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_EDITOR_FRAGMENTS_SWAP", 101);

    @pmi0("clips_editor_fullscreen")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_EDITOR_FULLSCREEN = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_EDITOR_FULLSCREEN", 102);

    @pmi0("clips_grid_common_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_COMMON_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_COMMON_CLIPS", 103);

    @pmi0("clips_grid_delayed_publication_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_DELAYED_PUBLICATION_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_DELAYED_PUBLICATION_CLIPS", 104);

    @pmi0("clips_grid_drafts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_DRAFTS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_DRAFTS", 105);

    @pmi0("clips_grid_group_members_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_GROUP_MEMBERS_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_GROUP_MEMBERS_ALL", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);

    @pmi0("clips_grid_group_members_friends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_GROUP_MEMBERS_FRIENDS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_GROUP_MEMBERS_FRIENDS", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);

    @pmi0("clips_grid_liked_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_LIKED_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_LIKED_CLIPS", 108);

    @pmi0("clips_grid_lives")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_LIVES = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_LIVES", 109);

    @pmi0("clips_grid_owner_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_OWNER_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_OWNER_CLIPS", 110);

    @pmi0("clips_grid_profile_followers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_PROFILE_FOLLOWERS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_PROFILE_FOLLOWERS", 111);

    @pmi0("clips_grid_profile_friends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_PROFILE_FRIENDS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_PROFILE_FRIENDS", 112);

    @pmi0("clips_grid_profile_subscriptions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GRID_PROFILE_SUBSCRIPTIONS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GRID_PROFILE_SUBSCRIPTIONS", 113);

    @pmi0("clips_install_saa")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_INSTALL_SAA = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_INSTALL_SAA", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);

    @pmi0("clips_lives")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_LIVES = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_LIVES", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);

    @pmi0("clips_lives_spectators")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_LIVES_SPECTATORS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_LIVES_SPECTATORS", 116);

    @pmi0("clips_lives_gifts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_LIVES_GIFTS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_LIVES_GIFTS", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);

    @pmi0("clips_link_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_LINK_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_LINK_EDITOR", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);

    @pmi0("clips_voiceover_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_VOICEOVER_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_VOICEOVER_EDITOR", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);

    @pmi0("clips_mediapicker_media")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_MEDIAPICKER_MEDIA = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_MEDIAPICKER_MEDIA", 120);

    @pmi0("clips_mediapicker_drafts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_MEDIAPICKER_DRAFTS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_MEDIAPICKER_DRAFTS", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);

    @pmi0("clips_mediapicker_templates")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_MEDIAPICKER_TEMPLATES = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_MEDIAPICKER_TEMPLATES", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);

    @pmi0("clips_media_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_MEDIA_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_MEDIA_PICKER", 123);

    @pmi0("clips_notifications_grouped")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_NOTIFICATIONS_GROUPED = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_NOTIFICATIONS_GROUPED", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);

    @pmi0("clips_notifications")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_NOTIFICATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_NOTIFICATIONS", 125);

    @pmi0("clips_privacy_common_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PRIVACY_COMMON_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PRIVACY_COMMON_SETTINGS", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);

    @pmi0("clips_privacy_friends_and_friends_lists_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PRIVACY_FRIENDS_AND_FRIENDS_LISTS_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PRIVACY_FRIENDS_AND_FRIENDS_LISTS_PICKER", 127);

    @pmi0("clips_privacy_friends_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PRIVACY_FRIENDS_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PRIVACY_FRIENDS_PICKER", 128);

    @pmi0("clips_privacy_value_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PRIVACY_VALUE_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PRIVACY_VALUE_SETTINGS", 129);

    @pmi0("lives_privacy_common_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIVES_PRIVACY_COMMON_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("LIVES_PRIVACY_COMMON_SETTINGS", 130);

    @pmi0("lives_privacy_value_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIVES_PRIVACY_VALUE_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("LIVES_PRIVACY_VALUE_SETTINGS", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);

    @pmi0("clips_fragment_audio_effect_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);

    @pmi0("clips_fragment_color_correction_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);

    @pmi0("clips_fragment_speed_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_FRAGMENT_SPEED_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_FRAGMENT_SPEED_EDITOR", 134);

    @pmi0("clips_fragment_volume_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_FRAGMENT_VOLUME_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_FRAGMENT_VOLUME_EDITOR", 135);

    @pmi0("clips_publish")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PUBLISH = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PUBLISH", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);

    @pmi0("clips_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_SEARCH", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);

    @pmi0("clips_tab_trends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_TAB_TRENDS = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_TAB_TRENDS", 138);

    @pmi0("clips_monotopic")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_MONOTOPIC = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_MONOTOPIC", 139);

    @pmi0("clips_templates_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_TEMPLATES_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_TEMPLATES_CATALOG", VersionConstants.PRODUCT_MAJOR_VERSION);

    @pmi0("clips_trend_grid")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_TREND_GRID = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_TREND_GRID", 141);

    @pmi0("clips_trends_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_TRENDS_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_TRENDS_CATALOG", 142);

    @pmi0("clips_trends_viewer")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_TRENDS_VIEWER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_TRENDS_VIEWER", 143);

    @pmi0("clips_templates_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_TEMPLATES_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_TEMPLATES_EDITOR", 144);

    @pmi0("clips_templates_viewer")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_TEMPLATES_VIEWER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_TEMPLATES_VIEWER", 145);

    @pmi0("clips_favorites_folders_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_FAVORITES_FOLDERS_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_FAVORITES_FOLDERS_PICKER", 146);

    @pmi0("clips_favorites_folder_renaming_dialog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_FAVORITES_FOLDER_RENAMING_DIALOG = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_FAVORITES_FOLDER_RENAMING_DIALOG", 147);

    @pmi0("clips_favorites_folders_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_FAVORITES_FOLDERS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_FAVORITES_FOLDERS_LIST", 148);

    @pmi0("clips_favorites_folder_content_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_FAVORITES_FOLDER_CONTENT_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_FAVORITES_FOLDER_CONTENT_LIST", 149);

    @pmi0("clips_video_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_VIDEO_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_VIDEO_PICKER", 150);

    @pmi0("clips_publish_viewer_preview")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PUBLISH_VIEWER_PREVIEW = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PUBLISH_VIEWER_PREVIEW", 151);

    @pmi0("clips_playlists_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PLAYLISTS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PLAYLISTS_LIST", 152);

    @pmi0("clips_playlist_bottomsheet")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PLAYLIST_BOTTOMSHEET = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PLAYLIST_BOTTOMSHEET", 153);

    @pmi0("clips_playlist_clip_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PLAYLIST_CLIP_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PLAYLIST_CLIP_PICKER", 154);

    @pmi0("clips_playlist_naming_dialog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PLAYLIST_NAMING_DIALOG = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PLAYLIST_NAMING_DIALOG", 155);

    @pmi0("clips_coauthors_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_COAUTHORS_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_COAUTHORS_PICKER", 156);

    @pmi0("clips_published_clip_edit_bottom_sheet")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_PUBLISHED_CLIP_EDIT_BOTTOM_SHEET = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_PUBLISHED_CLIP_EDIT_BOTTOM_SHEET", 157);

    @pmi0("clips_geolocation_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLIPS_GEOLOCATION_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("CLIPS_GEOLOCATION_PICKER", 158);

    @pmi0("contacts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS", 159);

    @pmi0("contacts_invite")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_INVITE = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_INVITE", 160);

    @pmi0("contacts_apps_add_phone")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_ADD_PHONE = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_ADD_PHONE", 161);

    @pmi0("contacts_apps_add_email")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_ADD_EMAIL = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_ADD_EMAIL", 162);

    @pmi0("contacts_apps_add_address")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_ADD_ADDRESS = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_ADD_ADDRESS", 163);

    @pmi0("contacts_apps_edit_phone")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_EDIT_PHONE = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_EDIT_PHONE", 164);

    @pmi0("contacts_apps_edit_email")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_EDIT_EMAIL = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_EDIT_EMAIL", 165);

    @pmi0("contacts_apps_edit_address")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_EDIT_ADDRESS = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_EDIT_ADDRESS", 166);

    @pmi0("contacts_apps_phone_category")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_PHONE_CATEGORY = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_PHONE_CATEGORY", 167);

    @pmi0("contacts_apps_email_category")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_EMAIL_CATEGORY = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_EMAIL_CATEGORY", 168);

    @pmi0("contacts_apps_address_category")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_ADDRESS_CATEGORY = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_ADDRESS_CATEGORY", 169);

    @pmi0("contacts_apps_address_country")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTS_APPS_ADDRESS_COUNTRY = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTS_APPS_ADDRESS_COUNTRY", 170);

    @pmi0("comments_list_clip")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMENTS_LIST_CLIP = new MobileOfficialAppsCoreNavStat$EventScreen("COMMENTS_LIST_CLIP", 171);

    @pmi0("community_addresses")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_ADDRESSES = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_ADDRESSES", 172);

    @pmi0("community_channel")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_CHANNEL = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_CHANNEL", 173);

    @pmi0("community_manage")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_MANAGE = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_MANAGE", 174);

    @pmi0("community_members")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_MEMBERS = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_MEMBERS", 175);

    @pmi0("community_messages")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_MESSAGES = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_MESSAGES", 176);

    @pmi0("community_ads_promote")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_ADS_PROMOTE = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_ADS_PROMOTE", 177);

    @pmi0("community_events")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_EVENTS = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_EVENTS", 178);

    @pmi0("community_lives_block")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_LIVES_BLOCK = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_LIVES_BLOCK", 179);

    @pmi0("community_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_PAGE", 180);

    @pmi0("community_name_history")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_NAME_HISTORY = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_NAME_HISTORY", 181);

    @pmi0("community_media")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_MEDIA = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_MEDIA", 182);

    @pmi0("community_video_tab")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_VIDEO_TAB = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_VIDEO_TAB", 183);

    @pmi0("community_links_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_LINKS_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_LINKS_PAGE", 184);

    @pmi0("coowner_modal_card")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COOWNER_MODAL_CARD = new MobileOfficialAppsCoreNavStat$EventScreen("COOWNER_MODAL_CARD", 185);

    @pmi0("clickable_theme_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CLICKABLE_THEME_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("CLICKABLE_THEME_LIST", 186);

    @pmi0("consent_screen")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONSENT_SCREEN = new MobileOfficialAppsCoreNavStat$EventScreen("CONSENT_SCREEN", 187);

    @pmi0("create_group")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CREATE_GROUP = new MobileOfficialAppsCoreNavStat$EventScreen("CREATE_GROUP", 188);

    @pmi0("create_money_transfer")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CREATE_MONEY_TRANSFER = new MobileOfficialAppsCoreNavStat$EventScreen("CREATE_MONEY_TRANSFER", PsExtractor.PRIVATE_STREAM_1);

    @pmi0("create_money_request")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CREATE_MONEY_REQUEST = new MobileOfficialAppsCoreNavStat$EventScreen("CREATE_MONEY_REQUEST", 190);

    @pmi0("create_money_chat_request")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CREATE_MONEY_CHAT_REQUEST = new MobileOfficialAppsCoreNavStat$EventScreen("CREATE_MONEY_CHAT_REQUEST", 191);

    @pmi0("create_money_chat_request_unlimited")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CREATE_MONEY_CHAT_REQUEST_UNLIMITED = new MobileOfficialAppsCoreNavStat$EventScreen("CREATE_MONEY_CHAT_REQUEST_UNLIMITED", PsExtractor.AUDIO_STREAM);

    @pmi0("city_select")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CITY_SELECT = new MobileOfficialAppsCoreNavStat$EventScreen("CITY_SELECT", 193);

    @pmi0("community_shops")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_SHOPS = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_SHOPS", 194);

    @pmi0("chat")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CHAT = new MobileOfficialAppsCoreNavStat$EventScreen("CHAT", 195);

    @pmi0("debug")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DEBUG = new MobileOfficialAppsCoreNavStat$EventScreen("DEBUG", 196);

    @pmi0("dialog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DIALOG = new MobileOfficialAppsCoreNavStat$EventScreen("DIALOG", 197);

    @pmi0("dialog_modal")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DIALOG_MODAL = new MobileOfficialAppsCoreNavStat$EventScreen("DIALOG_MODAL", 198);

    @pmi0("nowhere_dialog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NOWHERE_DIALOG = new MobileOfficialAppsCoreNavStat$EventScreen("NOWHERE_DIALOG", 199);

    @pmi0("discover")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER", 200);

    @pmi0("discover_digest")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_DIGEST = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_DIGEST", 201);

    @pmi0("discover_digest_dzen")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_DIGEST_DZEN = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_DIGEST_DZEN", 202);

    @pmi0("discover_full")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_FULL = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_FULL", 203);

    @pmi0("discover_full_tabs")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_FULL_TABS = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_FULL_TABS", 204);

    @pmi0("discover_media")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_MEDIA = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_MEDIA", 205);

    @pmi0("discover_media_preview")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_MEDIA_PREVIEW = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_MEDIA_PREVIEW", 206);

    @pmi0("discover_media_similar_news")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_MEDIA_SIMILAR_NEWS = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_MEDIA_SIMILAR_NEWS", 207);

    @pmi0("discover_post")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_POST = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_POST", Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);

    @pmi0("discover_tabs")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_TABS = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_TABS", Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE);

    @pmi0("discover_themed")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_THEMED = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_THEMED", Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);

    @pmi0("discover_themed_external")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DISCOVER_THEMED_EXTERNAL = new MobileOfficialAppsCoreNavStat$EventScreen("DISCOVER_THEMED_EXTERNAL", 211);

    @pmi0("docs")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS", Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);

    @pmi0("docs_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_SEARCH", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE);

    @pmi0("docs_preview")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_PREVIEW = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_PREVIEW", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);

    @pmi0("docs_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_ALL", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);

    @pmi0("docs_saved")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_SAVED = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_SAVED", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);

    @pmi0("docs_text")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_TEXT = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_TEXT", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);

    @pmi0("docs_archives")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_ARCHIVES = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_ARCHIVES", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);

    @pmi0("docs_gifs")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_GIFS = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_GIFS", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);

    @pmi0("docs_images")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_IMAGES = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_IMAGES", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);

    @pmi0("docs_audios")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_AUDIOS = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_AUDIOS", Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);

    @pmi0("docs_books")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_BOOKS = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_BOOKS", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);

    @pmi0("docs_videos")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_VIDEOS = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_VIDEOS", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);

    @pmi0("docs_others")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_OTHERS = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_OTHERS", 224);

    @pmi0("docs_ebooks")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_EBOOKS = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_EBOOKS", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);

    @pmi0("docs_upload")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DOCS_UPLOAD = new MobileOfficialAppsCoreNavStat$EventScreen("DOCS_UPLOAD", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);

    @pmi0("donut_content_paywall")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DONUT_CONTENT_PAYWALL = new MobileOfficialAppsCoreNavStat$EventScreen("DONUT_CONTENT_PAYWALL", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);

    @pmi0("donut_content_repost")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DONUT_CONTENT_REPOST = new MobileOfficialAppsCoreNavStat$EventScreen("DONUT_CONTENT_REPOST", 228);

    @pmi0("donut_content_wall")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DONUT_CONTENT_WALL = new MobileOfficialAppsCoreNavStat$EventScreen("DONUT_CONTENT_WALL", 229);

    @pmi0("donut_content_link")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DONUT_CONTENT_LINK = new MobileOfficialAppsCoreNavStat$EventScreen("DONUT_CONTENT_LINK", 230);

    @pmi0("edu_edit_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen EDU_EDIT_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("EDU_EDIT_PROFILE", 231);

    @pmi0("edu_my_schools_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen EDU_MY_SCHOOLS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("EDU_MY_SCHOOLS_LIST", 232);

    @pmi0("entry_ask_confirm")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ENTRY_ASK_CONFIRM = new MobileOfficialAppsCoreNavStat$EventScreen("ENTRY_ASK_CONFIRM", 233);

    @pmi0("entry_map")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ENTRY_MAP = new MobileOfficialAppsCoreNavStat$EventScreen("ENTRY_MAP", 234);

    @pmi0("emoji_status_bottom_sheet")
    public static final MobileOfficialAppsCoreNavStat$EventScreen EMOJI_STATUS_BOTTOM_SHEET = new MobileOfficialAppsCoreNavStat$EventScreen("EMOJI_STATUS_BOTTOM_SHEET", 235);

    @pmi0("esia_trusted_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ESIA_TRUSTED_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("ESIA_TRUSTED_PROFILE", 236);

    @pmi0("esia_faq")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ESIA_FAQ = new MobileOfficialAppsCoreNavStat$EventScreen("ESIA_FAQ", 237);

    @pmi0("events")
    public static final MobileOfficialAppsCoreNavStat$EventScreen EVENTS = new MobileOfficialAppsCoreNavStat$EventScreen("EVENTS", 238);

    @pmi0("events_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen EVENTS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("EVENTS_LIST", 239);

    @pmi0("fast_silent_auth_existing_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAST_SILENT_AUTH_EXISTING_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("FAST_SILENT_AUTH_EXISTING_ACCOUNT", PsExtractor.VIDEO_STREAM_MASK);

    @pmi0("fast_silent_auth_as_user")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAST_SILENT_AUTH_AS_USER = new MobileOfficialAppsCoreNavStat$EventScreen("FAST_SILENT_AUTH_AS_USER", 241);

    @pmi0("fast_silent_auth_download")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAST_SILENT_AUTH_DOWNLOAD = new MobileOfficialAppsCoreNavStat$EventScreen("FAST_SILENT_AUTH_DOWNLOAD", 242);

    @pmi0("fast_silent_auth_success")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAST_SILENT_AUTH_SUCCESS = new MobileOfficialAppsCoreNavStat$EventScreen("FAST_SILENT_AUTH_SUCCESS", 243);

    @pmi0("fast_silent_auth_error")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAST_SILENT_AUTH_ERROR = new MobileOfficialAppsCoreNavStat$EventScreen("FAST_SILENT_AUTH_ERROR", 244);

    @pmi0("fave")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE", 245);

    @pmi0("fave_people")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_PEOPLE = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_PEOPLE", 246);

    @pmi0("fave_groups")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_GROUPS = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_GROUPS", 247);

    @pmi0("fave_posts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_POSTS = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_POSTS", 248);

    @pmi0("fave_articles")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_ARTICLES = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_ARTICLES", 249);

    @pmi0("fave_links")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_LINKS = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_LINKS", 250);

    @pmi0("fave_podcasts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_PODCASTS = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_PODCASTS", 251);

    @pmi0("fave_tags")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_TAGS = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_TAGS", 252);

    @pmi0("fave_tags_customize")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_TAGS_CUSTOMIZE = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_TAGS_CUSTOMIZE", 253);

    @pmi0("fave_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_VIDEO", 254);

    @pmi0("fave_narratives")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_NARRATIVES = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_NARRATIVES", 255);

    @pmi0("fave_products")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_PRODUCTS = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_PRODUCTS", 256);

    @pmi0("fave_youla_products")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_YOULA_PRODUCTS = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_YOULA_PRODUCTS", 257);

    @pmi0("fave_games")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_GAMES = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_GAMES", 258);

    @pmi0("fave_mini_apps")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FAVE_MINI_APPS = new MobileOfficialAppsCoreNavStat$EventScreen("FAVE_MINI_APPS", 259);

    @pmi0("feed")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED = new MobileOfficialAppsCoreNavStat$EventScreen("FEED", 260);

    @pmi0("feed_classified_update")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_CLASSIFIED_UPDATE = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_CLASSIFIED_UPDATE", 261);

    @pmi0("feed_comment")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_COMMENT = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_COMMENT", 262);

    @pmi0("feed_comments")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_COMMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_COMMENTS", 263);

    @pmi0("feed_custom")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_CUSTOM = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_CUSTOM", 264);

    @pmi0("feed_external")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_EXTERNAL = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_EXTERNAL", 265);

    @pmi0("feed_friends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_FRIENDS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_FRIENDS", 266);

    @pmi0("feed_groups")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_GROUPS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_GROUPS", 267);

    @pmi0("feed_likes")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIKES = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIKES", 268);

    @pmi0("feed_likes_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIKES_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIKES_ALL", 269);

    @pmi0("feed_likes_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIKES_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIKES_PHOTO", atv0.b);

    @pmi0("feed_likes_posts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIKES_POSTS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIKES_POSTS", 271);

    @pmi0("feed_likes_comments")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIKES_COMMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIKES_COMMENTS", 272);

    @pmi0("feed_likes_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIKES_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIKES_CLIPS", 273);

    @pmi0("feed_likes_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIKES_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIKES_VIDEO", 274);

    @pmi0("feed_likes_goods")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIKES_GOODS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIKES_GOODS", 275);

    @pmi0("feed_lives")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES", 276);

    @pmi0("feed_lives_tab")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_TAB = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_TAB", 277);

    @pmi0("feed_lives_popular")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_POPULAR = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_POPULAR", 278);

    @pmi0("feed_lives_mobile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_MOBILE = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_MOBILE", 279);

    @pmi0("feed_lives_games")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_GAMES = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_GAMES", 280);

    @pmi0("feed_lives_city")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_CITY = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_CITY", 281);

    @pmi0("feed_lives_sport")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_SPORT = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_SPORT", 282);

    @pmi0("feed_lives_news")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_NEWS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_NEWS", 283);

    @pmi0("feed_lives_music")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_MUSIC = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_MUSIC", 284);

    @pmi0("feed_lives_hobby")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_HOBBY = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_HOBBY", 285);

    @pmi0("feed_lives_unknown")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_LIVES_UNKNOWN = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_LIVES_UNKNOWN", 286);

    @pmi0("feed_photos")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_PHOTOS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_PHOTOS", MBSupportMuteAdType.INTERSTITIAL_VIDEO);

    @pmi0("feed_place")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_PLACE = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_PLACE", 288);

    @pmi0("feed_post")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_POST = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_POST", 289);

    @pmi0("feed_promoted")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_PROMOTED = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_PROMOTED", 290);

    @pmi0("feed_recommended")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_RECOMMENDED = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_RECOMMENDED", 291);

    @pmi0("feed_themed_category_tab")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_THEMED_CATEGORY_TAB = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_THEMED_CATEGORY_TAB", 292);

    @pmi0("feed_top")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_TOP = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_TOP", 293);

    @pmi0("feed_recent")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_RECENT = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_RECENT", 294);

    @pmi0("feed_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_SETTINGS", 295);

    @pmi0("feed_post_similar_news")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_POST_SIMILAR_NEWS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_POST_SIMILAR_NEWS", 296);

    @pmi0("feed_source_disabled")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_SOURCE_DISABLED = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_SOURCE_DISABLED", 297);

    @pmi0("feed_source_notifications")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_SOURCE_NOTIFICATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_SOURCE_NOTIFICATIONS", 298);

    @pmi0("feed_videos")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_VIDEOS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_VIDEOS", 299);

    @pmi0("feed_subscriptions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_SUBSCRIPTIONS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_SUBSCRIPTIONS", 300);

    @pmi0("feed_suggested_posts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_SUGGESTED_POSTS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_SUGGESTED_POSTS", 301);

    @pmi0("feed_postponed_posts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_POSTPONED_POSTS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_POSTPONED_POSTS", 302);

    @pmi0("feed_video_recommendations")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_VIDEO_RECOMMENDATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_VIDEO_RECOMMENDATIONS", Http.StatusCode.SEE_OTHER);

    @pmi0("feed_friends_import_add")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_FRIENDS_IMPORT_ADD = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_FRIENDS_IMPORT_ADD", Sdk.SDKError.Reason.AD_EXPIRED_VALUE);

    @pmi0("feed_friends_import_invite")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_FRIENDS_IMPORT_INVITE = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_FRIENDS_IMPORT_INVITE", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);

    @pmi0("feed_comment_modal")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_COMMENT_MODAL = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_COMMENT_MODAL", 306);

    @pmi0("feed_comments_modal")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_COMMENTS_MODAL = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_COMMENTS_MODAL", 307);

    @pmi0("feed_reactions_modal")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_REACTIONS_MODAL = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_REACTIONS_MODAL", Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE);

    @pmi0("friends_members_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_MEMBERS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_MEMBERS_LIST", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);

    @pmi0("post_reactions_like")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POST_REACTIONS_LIKE = new MobileOfficialAppsCoreNavStat$EventScreen("POST_REACTIONS_LIKE", Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE);

    @pmi0("post_reactions_donut")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POST_REACTIONS_DONUT = new MobileOfficialAppsCoreNavStat$EventScreen("POST_REACTIONS_DONUT", Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE);

    @pmi0("post_reactions_share")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POST_REACTIONS_SHARE = new MobileOfficialAppsCoreNavStat$EventScreen("POST_REACTIONS_SHARE", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);

    @pmi0("feed_shares_modal")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEED_SHARES_MODAL = new MobileOfficialAppsCoreNavStat$EventScreen("FEED_SHARES_MODAL", Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE);

    @pmi0("feedback")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEEDBACK = new MobileOfficialAppsCoreNavStat$EventScreen("FEEDBACK", Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE);

    @pmi0("feedback_without_viewers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FEEDBACK_WITHOUT_VIEWERS = new MobileOfficialAppsCoreNavStat$EventScreen("FEEDBACK_WITHOUT_VIEWERS", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE);

    @pmi0("file_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FILE_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("FILE_PICKER", Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE);

    @pmi0("friends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS = new MobileOfficialAppsCoreNavStat$EventScreen(Privacy.FRIENDS, Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE);

    @pmi0("friends_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_ALL", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE);

    @pmi0("friends_birthdays")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_BIRTHDAYS = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_BIRTHDAYS", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE);

    @pmi0("friends_online")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_ONLINE = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_ONLINE", 320);

    @pmi0("friends_main_recommended_block")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_MAIN_RECOMMENDED_BLOCK = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_MAIN_RECOMMENDED_BLOCK", Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE);

    @pmi0("friends_mutual")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_MUTUAL = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_MUTUAL", Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE);

    @pmi0("friends_game_invite")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_GAME_INVITE = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_GAME_INVITE", 323);

    @pmi0("friends_import")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_IMPORT = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_IMPORT", 324);

    @pmi0("friends_import_address_book")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_IMPORT_ADDRESS_BOOK = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_IMPORT_ADDRESS_BOOK", 325);

    @pmi0("friends_import_facebook")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_IMPORT_FACEBOOK = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_IMPORT_FACEBOOK", 326);

    @pmi0("friends_import_google")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_IMPORT_GOOGLE = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_IMPORT_GOOGLE", 327);

    @pmi0("friends_import_ok")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_IMPORT_OK = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_IMPORT_OK", 328);

    @pmi0("friends_import_twitter")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_IMPORT_TWITTER = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_IMPORT_TWITTER", 329);

    @pmi0("friends_in_group")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_IN_GROUP = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_IN_GROUP", 330);

    @pmi0("friends_nearby")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_NEARBY = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_NEARBY", 331);

    @pmi0("friends_privacy")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_PRIVACY = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_PRIVACY", 332);

    @pmi0("friends_requests")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_REQUESTS = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_REQUESTS", 333);

    @pmi0("friends_requests_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_REQUESTS_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_REQUESTS_ALL", 334);

    @pmi0("friends_requests_swipe")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_REQUESTS_SWIPE = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_REQUESTS_SWIPE", 335);

    @pmi0("friends_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_SEARCH", 336);

    @pmi0("friends_service_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_SERVICE_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_SERVICE_SEARCH", 337);

    @pmi0("friends_selection")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_SELECTION = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_SELECTION", 338);

    @pmi0("friends_cleanup")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_CLEANUP = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_CLEANUP", 339);

    @pmi0("gifts_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GIFTS_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("GIFTS_CATALOG", 340);

    @pmi0("gifts_catalog_category")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GIFTS_CATALOG_CATEGORY = new MobileOfficialAppsCoreNavStat$EventScreen("GIFTS_CATALOG_CATEGORY", 341);

    @pmi0("gifts_profile_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GIFTS_PROFILE_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("GIFTS_PROFILE_CATALOG", 342);

    @pmi0("gift_friends_send")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GIFT_FRIENDS_SEND = new MobileOfficialAppsCoreNavStat$EventScreen("GIFT_FRIENDS_SEND", 343);

    @pmi0("gift_send")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GIFT_SEND = new MobileOfficialAppsCoreNavStat$EventScreen("GIFT_SEND", 344);

    @pmi0("gateways")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GATEWAYS = new MobileOfficialAppsCoreNavStat$EventScreen("GATEWAYS", 345);

    @pmi0("group")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUP = new MobileOfficialAppsCoreNavStat$EventScreen("GROUP", 346);

    @pmi0("group_wall")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUP_WALL = new MobileOfficialAppsCoreNavStat$EventScreen("GROUP_WALL", 347);

    @pmi0("group_chats")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUP_CHATS = new MobileOfficialAppsCoreNavStat$EventScreen("GROUP_CHATS", 348);

    @pmi0("group_members_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUP_MEMBERS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("GROUP_MEMBERS_LIST", 349);

    @pmi0("group_friends_invite")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUP_FRIENDS_INVITE = new MobileOfficialAppsCoreNavStat$EventScreen("GROUP_FRIENDS_INVITE", 350);

    @pmi0("group_donators_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUP_DONATORS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("GROUP_DONATORS_LIST", 351);

    @pmi0("group_donators_friends_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUP_DONATORS_FRIENDS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("GROUP_DONATORS_FRIENDS_LIST", 352);

    @pmi0("game")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAME = new MobileOfficialAppsCoreNavStat$EventScreen("GAME", 353);

    @pmi0("games")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES", 354);

    @pmi0("games_my")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_MY = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_MY", 355);

    @pmi0("games_new")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_NEW = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_NEW", 356);

    @pmi0("games_achievements")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_ACHIEVEMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_ACHIEVEMENTS", 357);

    @pmi0("games_category")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_CATEGORY = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_CATEGORY", 358);

    @pmi0("games_recommended")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_RECOMMENDED = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_RECOMMENDED", 359);

    @pmi0("games_friends_activity")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_FRIENDS_ACTIVITY = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_FRIENDS_ACTIVITY", 360);

    @pmi0("games_notifications")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_NOTIFICATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_NOTIFICATIONS", 361);

    @pmi0("groups_collection_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUPS_COLLECTION_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("GROUPS_COLLECTION_LIST", 362);

    @pmi0("groups_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUPS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("GROUPS_LIST", 363);

    @pmi0("groups_list_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUPS_LIST_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("GROUPS_LIST_SEARCH", 364);

    @pmi0("friend_groups_list_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIEND_GROUPS_LIST_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("FRIEND_GROUPS_LIST_SEARCH", 365);

    @pmi0("groups_manage_ads")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUPS_MANAGE_ADS = new MobileOfficialAppsCoreNavStat$EventScreen("GROUPS_MANAGE_ADS", 366);

    @pmi0("groups_managed_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUPS_MANAGED_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("GROUPS_MANAGED_LIST", 367);

    @pmi0("groups_invitations")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUPS_INVITATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("GROUPS_INVITATIONS", 368);

    @pmi0("groups_recommended")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUPS_RECOMMENDED = new MobileOfficialAppsCoreNavStat$EventScreen("GROUPS_RECOMMENDED", 369);

    @pmi0("games_leaderboard")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_LEADERBOARD = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_LEADERBOARD", 370);

    @pmi0("groups_suggested_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUPS_SUGGESTED_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("GROUPS_SUGGESTED_LIST", 371);

    @pmi0("grid_author_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GRID_AUTHOR_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("GRID_AUTHOR_PICKER", 372);

    @pmi0("help")
    public static final MobileOfficialAppsCoreNavStat$EventScreen HELP = new MobileOfficialAppsCoreNavStat$EventScreen("HELP", 373);

    @pmi0("im_conversation_friends_add")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CONVERSATION_FRIENDS_ADD = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CONVERSATION_FRIENDS_ADD", 374);

    @pmi0("im_conversation_create_friends_add")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CONVERSATION_CREATE_FRIENDS_ADD = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CONVERSATION_CREATE_FRIENDS_ADD", 375);

    @pmi0("im_conversation_detail")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CONVERSATION_DETAIL = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CONVERSATION_DETAIL", 376);

    @pmi0("im_friends_send")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_FRIENDS_SEND = new MobileOfficialAppsCoreNavStat$EventScreen("IM_FRIENDS_SEND", 377);

    @pmi0("im")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM = new MobileOfficialAppsCoreNavStat$EventScreen("IM", 378);

    @pmi0("im_group")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_GROUP = new MobileOfficialAppsCoreNavStat$EventScreen("IM_GROUP", 379);

    @pmi0("im_custom_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CUSTOM_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CUSTOM_LIST", 380);

    @pmi0("im_chat")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT", 381);

    @pmi0("im_group_chat")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_GROUP_CHAT = new MobileOfficialAppsCoreNavStat$EventScreen("IM_GROUP_CHAT", 382);

    @pmi0("im_chat_create")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_CREATE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_CREATE", 383);

    @pmi0("im_chat_create_manage")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_CREATE_MANAGE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_CREATE_MANAGE", 384);

    @pmi0("im_chat_manage")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_MANAGE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_MANAGE", 385);

    @pmi0("im_chat_manage_options")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_MANAGE_OPTIONS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_MANAGE_OPTIONS", 386);

    @pmi0("im_chat_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_SETTINGS", 387);

    @pmi0("im_chat_invite_link")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_INVITE_LINK = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_INVITE_LINK", 388);

    @pmi0("im_chat_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_SEARCH", 389);

    @pmi0("im_chat_attachments")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_ATTACHMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_ATTACHMENTS", 390);

    @pmi0("im_chat_members_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_MEMBERS_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_MEMBERS_ALL", 391);

    @pmi0("im_chat_members_online")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_MEMBERS_ONLINE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_MEMBERS_ONLINE", 392);

    @pmi0("im_chat_create_contacts_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_CREATE_CONTACTS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_CREATE_CONTACTS_LIST", 393);

    @pmi0("im_chat_pop_up")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_POP_UP = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_POP_UP", 394);

    @pmi0("im_chat_screenshot_sharing")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_SCREENSHOT_SHARING = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_SCREENSHOT_SHARING", 395);

    @pmi0("im_chat_empty")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHAT_EMPTY = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHAT_EMPTY", 396);

    @pmi0("im_channel")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHANNEL = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHANNEL", 397);

    @pmi0("im_channel_comments")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHANNEL_COMMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHANNEL_COMMENTS", 398);

    @pmi0("im_channels_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHANNELS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHANNELS_LIST", 399);

    @pmi0("im_channel_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHANNEL_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHANNEL_PROFILE", 400);

    @pmi0("im_channel_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_CHANNEL_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_CHANNEL_SETTINGS", 401);

    @pmi0("im_pinned_message")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_PINNED_MESSAGE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_PINNED_MESSAGE", 402);

    @pmi0("im_nested_message")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_NESTED_MESSAGE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_NESTED_MESSAGE", 403);

    @pmi0("im_attaches_types")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ATTACHES_TYPES = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ATTACHES_TYPES", 404);

    @pmi0("im_attaches_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ATTACHES_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ATTACHES_PHOTO", InterfaceC4413l1.a.b.e);

    @pmi0("im_attaches_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ATTACHES_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ATTACHES_VIDEO", InterfaceC4413l1.a.b.f);

    @pmi0("im_attaches_audio")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ATTACHES_AUDIO = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ATTACHES_AUDIO", InterfaceC4413l1.a.b.g);

    @pmi0("im_attaches_docs")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ATTACHES_DOCS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ATTACHES_DOCS", InterfaceC4413l1.a.b.h);

    @pmi0("im_attaches_links")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ATTACHES_LINKS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ATTACHES_LINKS", InterfaceC4413l1.a.b.i);

    @pmi0("im_attaches_location")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ATTACHES_LOCATION = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ATTACHES_LOCATION", 410);

    @pmi0("im_attaches_money")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ATTACHES_MONEY = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ATTACHES_MONEY", InterfaceC4413l1.a.b.k);

    @pmi0("im_archive")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_ARCHIVE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_ARCHIVE", 412);

    @pmi0("im_folders")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_FOLDERS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_FOLDERS", 413);

    @pmi0("im_folder_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_FOLDER_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_FOLDER_SETTINGS", 414);

    @pmi0("im_unread")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_UNREAD = new MobileOfficialAppsCoreNavStat$EventScreen("IM_UNREAD", 415);

    @pmi0("im_business_notify")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_BUSINESS_NOTIFY = new MobileOfficialAppsCoreNavStat$EventScreen("IM_BUSINESS_NOTIFY", Http.StatusCode.RANGE_NOT_SATISFIABLE);

    @pmi0("im_inviting_to_chat")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_INVITING_TO_CHAT = new MobileOfficialAppsCoreNavStat$EventScreen("IM_INVITING_TO_CHAT", 417);

    @pmi0("im_request")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_REQUEST = new MobileOfficialAppsCoreNavStat$EventScreen("IM_REQUEST", 418);

    @pmi0("im_requests")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_REQUESTS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_REQUESTS", 419);

    @pmi0("im_search_chats")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SEARCH_CHATS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SEARCH_CHATS", 420);

    @pmi0("im_search_messages")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SEARCH_MESSAGES = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SEARCH_MESSAGES", 421);

    @pmi0("im_search_channels")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SEARCH_CHANNELS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SEARCH_CHANNELS", 422);

    @pmi0("im_settings_fast_reaction")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SETTINGS_FAST_REACTION = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SETTINGS_FAST_REACTION", 423);

    @pmi0("im_settings_main")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SETTINGS_MAIN = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SETTINGS_MAIN", 424);

    @pmi0("im_settings_online")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SETTINGS_ONLINE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SETTINGS_ONLINE", 425);

    @pmi0("im_settings_reactions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SETTINGS_REACTIONS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SETTINGS_REACTIONS", 426);

    @pmi0("im_settings_textsize")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SETTINGS_TEXTSIZE = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SETTINGS_TEXTSIZE", 427);

    @pmi0("im_settings_wallpaper")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SETTINGS_WALLPAPER = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SETTINGS_WALLPAPER", 428);

    @pmi0("im_shared_chats")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_SHARED_CHATS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_SHARED_CHATS", CommonGatewayClient.CODE_TOO_MANY_REQUESTS);

    @pmi0("im_invite_by_link_dialog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_INVITE_BY_LINK_DIALOG = new MobileOfficialAppsCoreNavStat$EventScreen("IM_INVITE_BY_LINK_DIALOG", 430);

    @pmi0("im_community_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_COMMUNITY_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("IM_COMMUNITY_LIST", 431);

    @pmi0("im_business_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_BUSINESS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("IM_BUSINESS_LIST", Tensorflow.FRAME_WIDTH);

    @pmi0("im_business_chats")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_BUSINESS_CHATS = new MobileOfficialAppsCoreNavStat$EventScreen("IM_BUSINESS_CHATS", 433);

    @pmi0("im_personal_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen IM_PERSONAL_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("IM_PERSONAL_LIST", 434);

    @pmi0("intro_recommended_pages")
    public static final MobileOfficialAppsCoreNavStat$EventScreen INTRO_RECOMMENDED_PAGES = new MobileOfficialAppsCoreNavStat$EventScreen("INTRO_RECOMMENDED_PAGES", 435);

    @pmi0("likes_friends_comment")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_FRIENDS_COMMENT = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_FRIENDS_COMMENT", 436);

    @pmi0("likes_friends_market")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_FRIENDS_MARKET = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_FRIENDS_MARKET", 437);

    @pmi0("likes_friends_note")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_FRIENDS_NOTE = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_FRIENDS_NOTE", 438);

    @pmi0("likes_friends_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_FRIENDS_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_FRIENDS_PHOTO", 439);

    @pmi0("likes_friends_post_ads")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_FRIENDS_POST_ADS = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_FRIENDS_POST_ADS", 440);

    @pmi0("likes_friends_topic")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_FRIENDS_TOPIC = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_FRIENDS_TOPIC", 441);

    @pmi0("likes_friends_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_FRIENDS_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_FRIENDS_VIDEO", 442);

    @pmi0("likes_list_comment")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_LIST_COMMENT = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_LIST_COMMENT", 443);

    @pmi0("likes_list_market")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_LIST_MARKET = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_LIST_MARKET", 444);

    @pmi0("likes_list_note")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_LIST_NOTE = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_LIST_NOTE", 445);

    @pmi0("likes_list_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_LIST_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_LIST_PHOTO", 446);

    @pmi0("likes_list_post_ads")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_LIST_POST_ADS = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_LIST_POST_ADS", 447);

    @pmi0("likes_list_topic")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_LIST_TOPIC = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_LIST_TOPIC", 448);

    @pmi0("likes_list_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_LIST_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_LIST_VIDEO", 449);

    @pmi0("likes_copies_comment")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_COPIES_COMMENT = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_COPIES_COMMENT", 450);

    @pmi0("likes_copies_market")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_COPIES_MARKET = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_COPIES_MARKET", 451);

    @pmi0("likes_copies_note")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_COPIES_NOTE = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_COPIES_NOTE", 452);

    @pmi0("likes_copies_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_COPIES_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_COPIES_PHOTO", ApiInvocationException.ErrorCodes.SESSION_REQUIRED);

    @pmi0("likes_copies_post_ads")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_COPIES_POST_ADS = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_COPIES_POST_ADS", ApiInvocationException.ErrorCodes.CENSOR_MATCH);

    @pmi0("likes_copies_topic")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_COPIES_TOPIC = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_COPIES_TOPIC", ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION);

    @pmi0("likes_copies_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIKES_COPIES_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("LIKES_COPIES_VIDEO", ApiInvocationException.ErrorCodes.GROUP_RESTRICTION);

    @pmi0("live_carousel")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIVE_CAROUSEL = new MobileOfficialAppsCoreNavStat$EventScreen("LIVE_CAROUSEL", ApiInvocationException.ErrorCodes.UNAUTHORIZED_RESTRICTION);

    @pmi0("live_streaming")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIVE_STREAMING = new MobileOfficialAppsCoreNavStat$EventScreen("LIVE_STREAMING", ApiInvocationException.ErrorCodes.PRIVACY_RESTRICTION);

    @pmi0("live_attach_action_link_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIVE_ATTACH_ACTION_LINK_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("LIVE_ATTACH_ACTION_LINK_LIST", 459);

    @pmi0("live_attach_action_link_selection_menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LIVE_ATTACH_ACTION_LINK_SELECTION_MENU = new MobileOfficialAppsCoreNavStat$EventScreen("LIVE_ATTACH_ACTION_LINK_SELECTION_MENU", 460);

    @pmi0("location")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LOCATION = new MobileOfficialAppsCoreNavStat$EventScreen("LOCATION", 461);

    @pmi0("link")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LINK = new MobileOfficialAppsCoreNavStat$EventScreen("LINK", 462);

    @pmi0("market")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET", 463);

    @pmi0("marketplace")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE", 464);

    @pmi0("marketplace_discover_full")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE_DISCOVER_FULL = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE_DISCOVER_FULL", 465);

    @pmi0("marketplace_discover_tab")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE_DISCOVER_TAB = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE_DISCOVER_TAB", 466);

    @pmi0("marketplace_main")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE_MAIN = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE_MAIN", 467);

    @pmi0("marketplace_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE_SEARCH", 468);

    @pmi0("marketplace_section")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE_SECTION = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE_SECTION", 469);

    @pmi0("marketplace_categories")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE_CATEGORIES = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE_CATEGORIES", 470);

    @pmi0("marketplace_my_orders")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE_MY_ORDERS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE_MY_ORDERS", 471);

    @pmi0("marketplace_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKETPLACE_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("MARKETPLACE_PROFILE", 472);

    @pmi0("market_attached_items")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ATTACHED_ITEMS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ATTACHED_ITEMS", 473);

    @pmi0("market_attached_items_edit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ATTACHED_ITEMS_EDIT = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ATTACHED_ITEMS_EDIT", 474);

    @pmi0("market_item")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM", 475);

    @pmi0("market_item_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM_ALBUM", 476);

    @pmi0("market_item_similar")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM_SIMILAR = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM_SIMILAR", 477);

    @pmi0("market_item_linked_content")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM_LINKED_CONTENT = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM_LINKED_CONTENT", 478);

    @pmi0("market_items_modal")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEMS_MODAL = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEMS_MODAL", 479);

    @pmi0("market_items_multipicker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEMS_MULTIPICKER = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEMS_MULTIPICKER", 480);

    @pmi0("market_filter_price")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_FILTER_PRICE = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_FILTER_PRICE", 481);

    @pmi0("market_albums")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ALBUMS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ALBUMS", 482);

    @pmi0("market_cart")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_CART = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_CART", 483);

    @pmi0("market_carts_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_CARTS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_CARTS_LIST", 484);

    @pmi0("market_checkout")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_CHECKOUT = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_CHECKOUT", 485);

    @pmi0("market_feedback")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_FEEDBACK = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_FEEDBACK", 486);

    @pmi0("market_order")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ORDER = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ORDER", 487);

    @pmi0("market_orders")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ORDERS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ORDERS", 488);

    @pmi0("market_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_SEARCH", 489);

    @pmi0("market_search_address")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_SEARCH_ADDRESS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_SEARCH_ADDRESS", 490);

    @pmi0("market_select_address")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_SELECT_ADDRESS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_SELECT_ADDRESS", 491);

    @pmi0("market_delivery_point")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_DELIVERY_POINT = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_DELIVERY_POINT", 492);

    @pmi0("market_delivery_points")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_DELIVERY_POINTS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_DELIVERY_POINTS", 493);

    @pmi0("market_service")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_SERVICE = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_SERVICE", 494);

    @pmi0("market_shop_conditions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_SHOP_CONDITIONS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_SHOP_CONDITIONS", 495);

    @pmi0("service_card")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SERVICE_CARD = new MobileOfficialAppsCoreNavStat$EventScreen("SERVICE_CARD", 496);

    @pmi0("service_section")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SERVICE_SECTION = new MobileOfficialAppsCoreNavStat$EventScreen("SERVICE_SECTION", 497);

    @pmi0("service_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SERVICE_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("SERVICE_ALBUM", 498);

    @pmi0("service_albums")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SERVICE_ALBUMS = new MobileOfficialAppsCoreNavStat$EventScreen("SERVICE_ALBUMS", 499);

    @pmi0("message_tooltip")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MESSAGE_TOOLTIP = new MobileOfficialAppsCoreNavStat$EventScreen("MESSAGE_TOOLTIP", 500);

    @pmi0("money_browser")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MONEY_BROWSER = new MobileOfficialAppsCoreNavStat$EventScreen("MONEY_BROWSER", 501);

    @pmi0("money_send_browser")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MONEY_SEND_BROWSER = new MobileOfficialAppsCoreNavStat$EventScreen("MONEY_SEND_BROWSER", 502);

    @pmi0("money_friends_send")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MONEY_FRIENDS_SEND = new MobileOfficialAppsCoreNavStat$EventScreen("MONEY_FRIENDS_SEND", 503);

    @pmi0("money_friends_request")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MONEY_FRIENDS_REQUEST = new MobileOfficialAppsCoreNavStat$EventScreen("MONEY_FRIENDS_REQUEST", ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);

    @pmi0("money_transfers_link")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MONEY_TRANSFERS_LINK = new MobileOfficialAppsCoreNavStat$EventScreen("MONEY_TRANSFERS_LINK", 505);

    @pmi0("menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MENU = new MobileOfficialAppsCoreNavStat$EventScreen("MENU", IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);

    @pmi0("memories")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MEMORIES = new MobileOfficialAppsCoreNavStat$EventScreen("MEMORIES", 507);

    @pmi0("modern_photo_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MODERN_PHOTO_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("MODERN_PHOTO_ALBUM", IronSourceError.ERROR_CODE_INIT_FAILED);

    @pmi0("modern_photo_albums_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MODERN_PHOTO_ALBUMS_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("MODERN_PHOTO_ALBUMS_CATALOG", IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);

    @pmi0("modern_photo_upload")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MODERN_PHOTO_UPLOAD = new MobileOfficialAppsCoreNavStat$EventScreen("MODERN_PHOTO_UPLOAD", 510);

    @pmi0("music_kids_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_ALBUM", ApiInvocationException.ErrorCodes.IDS_BLOCKED);

    @pmi0("music_kids_artist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_ARTIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_ARTIST", 512);

    @pmi0("music_kids_audio_book")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_AUDIO_BOOK = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_AUDIO_BOOK", 513);

    @pmi0("music_kids_dynamic_playlist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_DYNAMIC_PLAYLIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_DYNAMIC_PLAYLIST", 514);

    @pmi0("music_kids_playlist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_PLAYLIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_PLAYLIST", 515);

    @pmi0("music_kids_podcast_episode_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_PODCAST_EPISODE_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_PODCAST_EPISODE_LIST", 516);

    @pmi0("music_kids_podcast_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_PODCAST_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_PODCAST_LIST", 517);

    @pmi0("music_kids_podcast_episode")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_PODCAST_EPISODE = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_PODCAST_EPISODE", 518);

    @pmi0("music_kids_podcast_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_PODCAST_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_PODCAST_PAGE", 519);

    @pmi0("music_kids_podcast_page_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_KIDS_PODCAST_PAGE_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_KIDS_PODCAST_PAGE_ALL", IronSourceError.ERROR_NO_INTERNET_CONNECTION);

    @pmi0("music_subscription")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_SUBSCRIPTION = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_SUBSCRIPTION", 521);

    @pmi0("music_subscription_management")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_SUBSCRIPTION_MANAGEMENT = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_SUBSCRIPTION_MANAGEMENT", 522);

    @pmi0("music_player_track_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYER_TRACK_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYER_TRACK_LIST", 523);

    @pmi0("music_player_autoplay")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYER_AUTOPLAY = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYER_AUTOPLAY", IronSourceError.ERROR_PLACEMENT_CAPPED);

    @pmi0("music_player_lyrics")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYER_LYRICS = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYER_LYRICS", IronSourceError.ERROR_AD_FORMAT_CAPPED);

    @pmi0("music_player_controls")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYER_CONTROLS = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYER_CONTROLS", IronSourceError.ERROR_CAPPED_PER_SESSION);

    @pmi0("music_player_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYER_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYER_CATALOG", IronSourceError.ERROR_NON_EXISTENT_INSTANCE);

    @pmi0("music_playlist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYLIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYLIST", 528);

    @pmi0("music_playlist_edit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYLIST_EDIT = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYLIST_EDIT", 529);

    @pmi0("music_playlist_add_track")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYLIST_ADD_TRACK = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYLIST_ADD_TRACK", IronSourceError.ERROR_AD_UNIT_CAPPED);

    @pmi0("music_playlist_full")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_PLAYLIST_FULL = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_PLAYLIST_FULL", 531);

    @pmi0("music_artist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_ARTIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_ARTIST", 532);

    @pmi0("audio_artist_concert_full_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUDIO_ARTIST_CONCERT_FULL_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("AUDIO_ARTIST_CONCERT_FULL_PAGE", PeerVideoSettings.IDEAL_BITS_PER_MACROBLOCK);

    @pmi0("music_recommended")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_RECOMMENDED = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_RECOMMENDED", 534);

    @pmi0("music_recommended_category")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_RECOMMENDED_CATEGORY = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_RECOMMENDED_CATEGORY", 535);

    @pmi0("music_my")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_MY = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_MY", 536);

    @pmi0("music_owner")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_OWNER = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_OWNER", 537);

    @pmi0("music_show_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_SHOW_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_SHOW_ALL", 538);

    @pmi0("music_subscription_terms")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_SUBSCRIPTION_TERMS = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_SUBSCRIPTION_TERMS", 539);

    @pmi0("music_offline_my_music")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_OFFLINE_MY_MUSIC = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_OFFLINE_MY_MUSIC", 540);

    @pmi0("music_offline_library")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_OFFLINE_LIBRARY = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_OFFLINE_LIBRARY", 541);

    @pmi0("music_offline_library_playlists")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_OFFLINE_LIBRARY_PLAYLISTS = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_OFFLINE_LIBRARY_PLAYLISTS", 542);

    @pmi0("music_snippets_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_SNIPPETS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_SNIPPETS_LIST", 543);

    @pmi0("music_location")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_LOCATION = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_LOCATION", 544);

    @pmi0("music_recommendations_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSIC_RECOMMENDATIONS_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("MUSIC_RECOMMENDATIONS_ONBOARDING", 545);

    @pmi0("money_transfers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MONEY_TRANSFERS = new MobileOfficialAppsCoreNavStat$EventScreen("MONEY_TRANSFERS", 546);

    @pmi0("money_debtors")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MONEY_DEBTORS = new MobileOfficialAppsCoreNavStat$EventScreen("MONEY_DEBTORS", 547);

    @pmi0("money_transfers_with_peer")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MONEY_TRANSFERS_WITH_PEER = new MobileOfficialAppsCoreNavStat$EventScreen("MONEY_TRANSFERS_WITH_PEER", 548);

    @pmi0("mini_app")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MINI_APP = new MobileOfficialAppsCoreNavStat$EventScreen("MINI_APP", 549);

    @pmi0("mini_app_internal")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MINI_APP_INTERNAL = new MobileOfficialAppsCoreNavStat$EventScreen("MINI_APP_INTERNAL", 550);

    @pmi0("mini_app_about")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MINI_APP_ABOUT = new MobileOfficialAppsCoreNavStat$EventScreen("MINI_APP_ABOUT", 551);

    @pmi0("mini_app_menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MINI_APP_MENU = new MobileOfficialAppsCoreNavStat$EventScreen("MINI_APP_MENU", 552);

    @pmi0("mini_app_unverified_launch")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MINI_APP_UNVERIFIED_LAUNCH = new MobileOfficialAppsCoreNavStat$EventScreen("MINI_APP_UNVERIFIED_LAUNCH", 553);

    @pmi0("mini_apps_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MINI_APPS_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("MINI_APPS_CATALOG", 554);

    @pmi0("my_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MY_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("MY_CLIPS", 555);

    @pmi0("narratives_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NARRATIVES_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("NARRATIVES_LIST", 556);

    @pmi0("narrative_edit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NARRATIVE_EDIT = new MobileOfficialAppsCoreNavStat$EventScreen("NARRATIVE_EDIT", 557);

    @pmi0("narrative_selection")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NARRATIVE_SELECTION = new MobileOfficialAppsCoreNavStat$EventScreen("NARRATIVE_SELECTION", 558);

    @pmi0("narrative_cover_selection")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NARRATIVE_COVER_SELECTION = new MobileOfficialAppsCoreNavStat$EventScreen("NARRATIVE_COVER_SELECTION", 559);

    @pmi0("narratives_feed_block")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NARRATIVES_FEED_BLOCK = new MobileOfficialAppsCoreNavStat$EventScreen("NARRATIVES_FEED_BLOCK", 560);

    @pmi0(C4504q2.x)
    public static final MobileOfficialAppsCoreNavStat$EventScreen NOTIFICATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("NOTIFICATIONS", 561);

    @pmi0("notifications_grouped")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NOTIFICATIONS_GROUPED = new MobileOfficialAppsCoreNavStat$EventScreen("NOTIFICATIONS_GROUPED", 562);

    @pmi0("notifications_comments")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NOTIFICATIONS_COMMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("NOTIFICATIONS_COMMENTS", 563);

    @pmi0("notifications_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NOTIFICATIONS_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("NOTIFICATIONS_SETTINGS", 564);

    @pmi0("nowhere")
    public static final MobileOfficialAppsCoreNavStat$EventScreen NOWHERE = new MobileOfficialAppsCoreNavStat$EventScreen("NOWHERE", 565);

    @pmi0("offline")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OFFLINE = new MobileOfficialAppsCoreNavStat$EventScreen("OFFLINE", 566);

    @pmi0("onboarding_recom_themes")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONBOARDING_RECOM_THEMES = new MobileOfficialAppsCoreNavStat$EventScreen("ONBOARDING_RECOM_THEMES", 567);

    @pmi0("registrations_recom_themes")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATIONS_RECOM_THEMES = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATIONS_RECOM_THEMES", 568);

    @pmi0("online_booking_launch")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONLINE_BOOKING_LAUNCH = new MobileOfficialAppsCoreNavStat$EventScreen("ONLINE_BOOKING_LAUNCH", 569);

    @pmi0("online_booking_menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONLINE_BOOKING_MENU = new MobileOfficialAppsCoreNavStat$EventScreen("ONLINE_BOOKING_MENU", 570);

    @pmi0("online_booking_services_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONLINE_BOOKING_SERVICES_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("ONLINE_BOOKING_SERVICES_CATALOG", 571);

    @pmi0("online_booking_specialists")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONLINE_BOOKING_SPECIALISTS = new MobileOfficialAppsCoreNavStat$EventScreen("ONLINE_BOOKING_SPECIALISTS", 572);

    @pmi0("online_booking_date_time")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONLINE_BOOKING_DATE_TIME = new MobileOfficialAppsCoreNavStat$EventScreen("ONLINE_BOOKING_DATE_TIME", 573);

    @pmi0("online_booking_create")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONLINE_BOOKING_CREATE = new MobileOfficialAppsCoreNavStat$EventScreen("ONLINE_BOOKING_CREATE", 574);

    @pmi0("online_booking_final")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONLINE_BOOKING_FINAL = new MobileOfficialAppsCoreNavStat$EventScreen("ONLINE_BOOKING_FINAL", 575);

    @pmi0("online_booking_records_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONLINE_BOOKING_RECORDS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("ONLINE_BOOKING_RECORDS_LIST", 576);

    @pmi0("other")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OTHER = new MobileOfficialAppsCoreNavStat$EventScreen(NativeAdContent.ViewTag.OTHER, 577);

    @pmi0("owner_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OWNER_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("OWNER_PROFILE", 578);

    @pmi0("ozon_reviews_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OZON_REVIEWS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("OZON_REVIEWS_LIST", 579);

    @pmi0("shops_feed_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SHOPS_FEED_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("SHOPS_FEED_CLIPS", 580);

    @pmi0("shops_feed_posts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SHOPS_FEED_POSTS = new MobileOfficialAppsCoreNavStat$EventScreen("SHOPS_FEED_POSTS", 581);

    @pmi0("passport_restore")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PASSPORT_RESTORE = new MobileOfficialAppsCoreNavStat$EventScreen("PASSPORT_RESTORE", 582);

    @pmi0("post_likes_friends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POST_LIKES_FRIENDS = new MobileOfficialAppsCoreNavStat$EventScreen("POST_LIKES_FRIENDS", 583);

    @pmi0("photo_album_create")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_ALBUM_CREATE = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_ALBUM_CREATE", 584);

    @pmi0("photo_archive")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_ARCHIVE = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_ARCHIVE", 585);

    @pmi0("photo_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_SETTINGS", 586);

    @pmi0("photo_browser")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_BROWSER = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_BROWSER", 587);

    @pmi0("photo_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_CATALOG", 588);

    @pmi0("photo_albums_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_ALBUMS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_ALBUMS_LIST", 589);

    @pmi0("photo_edit_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_EDIT_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_EDIT_ALBUM", 590);

    @pmi0("photo_video_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_VIDEO_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_VIDEO_PICKER", 591);

    @pmi0("photo_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_PICKER", 592);

    @pmi0("photo_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_EDITOR", 593);

    @pmi0("photo_new_tags")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_NEW_TAGS = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_NEW_TAGS", 594);

    @pmi0("photo_tag_popup")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHOTO_TAG_POPUP = new MobileOfficialAppsCoreNavStat$EventScreen("PHOTO_TAG_POPUP", 595);

    @pmi0("player")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PLAYER = new MobileOfficialAppsCoreNavStat$EventScreen("PLAYER", 596);

    @pmi0("podcast_episode_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PODCAST_EPISODE_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("PODCAST_EPISODE_LIST", 597);

    @pmi0("podcast_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PODCAST_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("PODCAST_LIST", 598);

    @pmi0("podcast_episode")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PODCAST_EPISODE = new MobileOfficialAppsCoreNavStat$EventScreen("PODCAST_EPISODE", CommonGatewayClient.CODE_599);

    @pmi0("podcast_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PODCAST_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("PODCAST_PAGE", 600);

    @pmi0("podcast_page_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PODCAST_PAGE_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("PODCAST_PAGE_ALL", 601);

    @pmi0("poll")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POLL = new MobileOfficialAppsCoreNavStat$EventScreen("POLL", 602);

    @pmi0("posting")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING", 603);

    @pmi0("posting_1")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_1 = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_1", 604);

    @pmi0("posting_2")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_2 = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_2", 605);

    @pmi0("posting_action_button_selection")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ACTION_BUTTON_SELECTION = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ACTION_BUTTON_SELECTION", 606);

    @pmi0("posting_attach")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH", IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT);

    @pmi0("posting_attach_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_PHOTO", 608);

    @pmi0("posting_attach_photo_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_PHOTO_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_PHOTO_PROFILE", IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT);

    @pmi0("posting_attach_photo_community")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_PHOTO_COMMUNITY = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_PHOTO_COMMUNITY", 610);

    @pmi0("posting_attach_music")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_MUSIC = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_MUSIC", 611);

    @pmi0("posting_attach_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_VIDEO", 612);

    @pmi0("posting_attach_video_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_VIDEO_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_VIDEO_PROFILE", IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);

    @pmi0("posting_attach_video_community")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_VIDEO_COMMUNITY = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_VIDEO_COMMUNITY", IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND);

    @pmi0("posting_attach_document")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_DOCUMENT = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_DOCUMENT", IronSourceError.ERROR_BN_LOAD_NO_CONFIG);

    @pmi0("posting_attach_place")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_PLACE = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_PLACE", IronSourceError.ERROR_BN_UNSUPPORTED_SIZE);

    @pmi0("posting_attach_playlist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_PLAYLIST = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_PLAYLIST", IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL);

    @pmi0("posting_attach_poll")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_POLL = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_POLL", 618);

    @pmi0("posting_attach_product")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_PRODUCT = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_PRODUCT", 619);

    @pmi0("posting_attach_product_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_PRODUCT_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_PRODUCT_PHOTO", IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW);

    @pmi0("posting_attach_good")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_GOOD = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_GOOD", 621);

    @pmi0("posting_attach_article")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_ARTICLE = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_ARTICLE", IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);

    @pmi0("posting_attach_article_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_ARTICLE_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_ARTICLE_PROFILE", IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);

    @pmi0("posting_attach_article_community")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_ARTICLE_COMMUNITY = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_ARTICLE_COMMUNITY", LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED);

    @pmi0("posting_attach_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_ALBUM", LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK);

    @pmi0("posting_attach_album_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_ALBUM_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_ALBUM_PROFILE", LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID);

    @pmi0("posting_attach_album_community")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_ATTACH_ALBUM_COMMUNITY = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_ATTACH_ALBUM_COMMUNITY", LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED);

    @pmi0("posting_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_SETTINGS", LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK);

    @pmi0("posting_create_custom_poster")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_CREATE_CUSTOM_POSTER = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_CREATE_CUSTOM_POSTER", LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW);

    @pmi0("posting_close_friends_selector")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_CLOSE_FRIENDS_SELECTOR = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_CLOSE_FRIENDS_SELECTOR", LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW);

    @pmi0("posting_crop_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_CROP_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_CROP_EDITOR", LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD);

    @pmi0("drafts_feed")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DRAFTS_FEED = new MobileOfficialAppsCoreNavStat$EventScreen("DRAFTS_FEED", 632);

    @pmi0("drafts_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen DRAFTS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("DRAFTS_LIST", 633);

    @pmi0("post_likes_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POST_LIKES_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("POST_LIKES_LIST", 634);

    @pmi0("post_copies_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POST_COPIES_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("POST_COPIES_LIST", 635);

    @pmi0("post_attached_market_items")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POST_ATTACHED_MARKET_ITEMS = new MobileOfficialAppsCoreNavStat$EventScreen("POST_ATTACHED_MARKET_ITEMS", 636);

    @pmi0("products_mix")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PRODUCTS_MIX = new MobileOfficialAppsCoreNavStat$EventScreen("PRODUCTS_MIX", 637);

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE", 638);

    @pmi0("profile_side_menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_SIDE_MENU = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_SIDE_MENU", 639);

    @pmi0("profile_edit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_EDIT = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_EDIT", 640);

    @pmi0("profile_followers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_FOLLOWERS = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_FOLLOWERS", 641);

    @pmi0("profile_all_followers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_ALL_FOLLOWERS = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_ALL_FOLLOWERS", 642);

    @pmi0("profile_all_followers_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_ALL_FOLLOWERS_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_ALL_FOLLOWERS_SEARCH", 643);

    @pmi0("profile_new_followers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_NEW_FOLLOWERS = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_NEW_FOLLOWERS", 644);

    @pmi0("profile_my")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_MY = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_MY", 645);

    @pmi0("profile_subscriptions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_SUBSCRIPTIONS = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_SUBSCRIPTIONS", 646);

    @pmi0("profile_information")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_INFORMATION = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_INFORMATION", 647);

    @pmi0("profile_user_friends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_USER_FRIENDS = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_USER_FRIENDS", 648);

    @pmi0("profile_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_PHOTO", 649);

    @pmi0("profile_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_ALBUM", 650);

    @pmi0("profile_video_tab")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_VIDEO_TAB = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_VIDEO_TAB", 651);

    @pmi0("privacy_select_friends_in_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PRIVACY_SELECT_FRIENDS_IN_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("PRIVACY_SELECT_FRIENDS_IN_LIST", 652);

    @pmi0("privacy_select_friends_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PRIVACY_SELECT_FRIENDS_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("PRIVACY_SELECT_FRIENDS_LIST", 653);

    @pmi0("qr_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen QR_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("QR_PROFILE", 654);

    @pmi0("qr_scanner")
    public static final MobileOfficialAppsCoreNavStat$EventScreen QR_SCANNER = new MobileOfficialAppsCoreNavStat$EventScreen("QR_SCANNER", 655);

    @pmi0("qr_promo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen QR_PROMO = new MobileOfficialAppsCoreNavStat$EventScreen("QR_PROMO", 656);

    @pmi0("qr_code_ask_confirm")
    public static final MobileOfficialAppsCoreNavStat$EventScreen QR_CODE_ASK_CONFIRM = new MobileOfficialAppsCoreNavStat$EventScreen("QR_CODE_ASK_CONFIRM", 657);

    @pmi0("qr_code_map")
    public static final MobileOfficialAppsCoreNavStat$EventScreen QR_CODE_MAP = new MobileOfficialAppsCoreNavStat$EventScreen("QR_CODE_MAP", 658);

    @pmi0("alert_qr_code_irrelevant")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALERT_QR_CODE_IRRELEVANT = new MobileOfficialAppsCoreNavStat$EventScreen("ALERT_QR_CODE_IRRELEVANT", 659);

    @pmi0("alert_auth_unknown_error")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALERT_AUTH_UNKNOWN_ERROR = new MobileOfficialAppsCoreNavStat$EventScreen("ALERT_AUTH_UNKNOWN_ERROR", 660);

    @pmi0("alert_auth_network_error")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALERT_AUTH_NETWORK_ERROR = new MobileOfficialAppsCoreNavStat$EventScreen("ALERT_AUTH_NETWORK_ERROR", 661);

    @pmi0("alert_auth_flood_control_error")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ALERT_AUTH_FLOOD_CONTROL_ERROR = new MobileOfficialAppsCoreNavStat$EventScreen("ALERT_AUTH_FLOOD_CONTROL_ERROR", 662);

    @pmi0("registration_phone")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_PHONE = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_PHONE", 663);

    @pmi0("registration_connect_gmail")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_CONNECT_GMAIL = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_CONNECT_GMAIL", 664);

    @pmi0("registration_phone_verify")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_PHONE_VERIFY = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_PHONE_VERIFY", 665);

    @pmi0("registration_phone_verify_lib")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_PHONE_VERIFY_LIB = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_PHONE_VERIFY_LIB", 666);

    @pmi0("registration_name")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_NAME = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_NAME", 667);

    @pmi0("registration_name_add")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_NAME_ADD = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_NAME_ADD", 668);

    @pmi0("registration_info_about_yourself")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_INFO_ABOUT_YOURSELF = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_INFO_ABOUT_YOURSELF", 669);

    @pmi0("registration_info_about_yourself_add")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_INFO_ABOUT_YOURSELF_ADD = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_INFO_ABOUT_YOURSELF_ADD", 670);

    @pmi0("registration_existent_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_EXISTENT_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_EXISTENT_ACCOUNT", 671);

    @pmi0("registration_existent_account_no_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD", 672);

    @pmi0("registration_bday")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_BDAY = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_BDAY", 673);

    @pmi0("registration_bday_add")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_BDAY_ADD = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_BDAY_ADD", 674);

    @pmi0("registration_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_PASSWORD", 675);

    @pmi0("registration_password_add")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_PASSWORD_ADD = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_PASSWORD_ADD", 676);

    @pmi0("registration_import_contacts")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_IMPORT_CONTACTS = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_IMPORT_CONTACTS", 677);

    @pmi0("registration_connect_facebook")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_CONNECT_FACEBOOK = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_CONNECT_FACEBOOK", 678);

    @pmi0("registration_connect_ok")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_CONNECT_OK = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_CONNECT_OK", 679);

    @pmi0("registration_connect_twitter")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_CONNECT_TWITTER = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_CONNECT_TWITTER", 680);

    @pmi0("registration_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_PHOTO", 681);

    @pmi0("registration_choose_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_CHOOSE_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_CHOOSE_PHOTO", 682);

    @pmi0("registration_take_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_TAKE_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_TAKE_PHOTO", 683);

    @pmi0("registration_style_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_STYLE_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_STYLE_PHOTO", 684);

    @pmi0("registration_crop_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_CROP_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_CROP_PHOTO", 685);

    @pmi0("registration_list_address_book")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_LIST_ADDRESS_BOOK = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_LIST_ADDRESS_BOOK", 686);

    @pmi0("registration_list_friends_facebook")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_LIST_FRIENDS_FACEBOOK = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_LIST_FRIENDS_FACEBOOK", 687);

    @pmi0("registration_list_friends_ok")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_LIST_FRIENDS_OK = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_LIST_FRIENDS_OK", 688);

    @pmi0("registration_list_friends_twitter")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_LIST_FRIENDS_TWITTER = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_LIST_FRIENDS_TWITTER", 689);

    @pmi0("registration_list_contacts_gmail")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_LIST_CONTACTS_GMAIL = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_LIST_CONTACTS_GMAIL", 690);

    @pmi0("registration_push")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_PUSH = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_PUSH", 691);

    @pmi0("registration_geo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_GEO = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_GEO", 692);

    @pmi0("registration_push_request")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_PUSH_REQUEST = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_PUSH_REQUEST", 693);

    @pmi0("registration_subjects")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_SUBJECTS = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_SUBJECTS", 694);

    @pmi0("registration_email_verify")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_EMAIL_VERIFY = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_EMAIL_VERIFY", 695);

    @pmi0("registration_email_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_EMAIL_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_EMAIL_PASSWORD", 696);

    @pmi0("registration_email")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_EMAIL = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_EMAIL", 697);

    @pmi0("registration_email_explanation")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_EMAIL_EXPLANATION = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_EMAIL_EXPLANATION", 698);

    @pmi0("registration_notifications")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_NOTIFICATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_NOTIFICATIONS", 699);

    @pmi0("registration_usecase")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_USECASE = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_USECASE", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);

    @pmi0("registration_is_first_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REGISTRATION_IS_FIRST_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("REGISTRATION_IS_FIRST_ACCOUNT", IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION);

    @pmi0("onboarding_usecase")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ONBOARDING_USECASE = new MobileOfficialAppsCoreNavStat$EventScreen("ONBOARDING_USECASE", IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD);

    @pmi0("review_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen REVIEW_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("REVIEW_LIST", 703);

    @pmi0("community_review_create")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_REVIEW_CREATE = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_REVIEW_CREATE", 704);

    @pmi0("community_review_detail")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_REVIEW_DETAIL = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_REVIEW_DETAIL", IronSourceError.ERROR_NT_LOAD_EXCEPTION);

    @pmi0("service_rating")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SERVICE_RATING = new MobileOfficialAppsCoreNavStat$EventScreen("SERVICE_RATING", IronSourceError.ERROR_NT_LOAD_NO_FILL);

    @pmi0("lk_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen LK_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("LK_PASSWORD", IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT);

    @pmi0("restore_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen RESTORE_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("RESTORE_ACCOUNT", 708);

    @pmi0("have_account_question")
    public static final MobileOfficialAppsCoreNavStat$EventScreen HAVE_ACCOUNT_QUESTION = new MobileOfficialAppsCoreNavStat$EventScreen("HAVE_ACCOUNT_QUESTION", 709);

    @pmi0("have_account_credentials")
    public static final MobileOfficialAppsCoreNavStat$EventScreen HAVE_ACCOUNT_CREDENTIALS = new MobileOfficialAppsCoreNavStat$EventScreen("HAVE_ACCOUNT_CREDENTIALS", 710);

    @pmi0("have_account_support")
    public static final MobileOfficialAppsCoreNavStat$EventScreen HAVE_ACCOUNT_SUPPORT = new MobileOfficialAppsCoreNavStat$EventScreen("HAVE_ACCOUNT_SUPPORT", IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER);

    @pmi0("contacting_support")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONTACTING_SUPPORT = new MobileOfficialAppsCoreNavStat$EventScreen("CONTACTING_SUPPORT", IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION);

    @pmi0("verification_ask_number")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VERIFICATION_ASK_NUMBER = new MobileOfficialAppsCoreNavStat$EventScreen("VERIFICATION_ASK_NUMBER", 713);

    @pmi0("verification_enter_number")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VERIFICATION_ENTER_NUMBER = new MobileOfficialAppsCoreNavStat$EventScreen("VERIFICATION_ENTER_NUMBER", 714);

    @pmi0("verification_phone_verify")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VERIFICATION_PHONE_VERIFY = new MobileOfficialAppsCoreNavStat$EventScreen("VERIFICATION_PHONE_VERIFY", IronSourceError.ERROR_NT_LOAD_NO_CONFIG);

    @pmi0("verification_busy_number")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VERIFICATION_BUSY_NUMBER = new MobileOfficialAppsCoreNavStat$EventScreen("VERIFICATION_BUSY_NUMBER", 716);

    @pmi0("account_confirm_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ACCOUNT_CONFIRM_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("ACCOUNT_CONFIRM_PASSWORD", 717);

    @pmi0("account_confirm_verify")
    public static final MobileOfficialAppsCoreNavStat$EventScreen ACCOUNT_CONFIRM_VERIFY = new MobileOfficialAppsCoreNavStat$EventScreen("ACCOUNT_CONFIRM_VERIFY", IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_SERVER_DATA);

    @pmi0("vk_mail_create")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VK_MAIL_CREATE = new MobileOfficialAppsCoreNavStat$EventScreen("VK_MAIL_CREATE", 719);

    @pmi0("voice_assistant_gradient_pop_up")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOICE_ASSISTANT_GRADIENT_POP_UP = new MobileOfficialAppsCoreNavStat$EventScreen("VOICE_ASSISTANT_GRADIENT_POP_UP", PublisherConfiguration.DEFAULT_MAX_RES);

    @pmi0("system_voice_assistant")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SYSTEM_VOICE_ASSISTANT = new MobileOfficialAppsCoreNavStat$EventScreen("SYSTEM_VOICE_ASSISTANT", 721);

    @pmi0("phone_2fa_verify")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHONE_2FA_VERIFY = new MobileOfficialAppsCoreNavStat$EventScreen("PHONE_2FA_VERIFY", 722);

    @pmi0("phone_2fa_verify_sms")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHONE_2FA_VERIFY_SMS = new MobileOfficialAppsCoreNavStat$EventScreen("PHONE_2FA_VERIFY_SMS", 723);

    @pmi0("phone_2fa_verify_app")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHONE_2FA_VERIFY_APP = new MobileOfficialAppsCoreNavStat$EventScreen("PHONE_2FA_VERIFY_APP", 724);

    @pmi0("phone_2fa_verify_call")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHONE_2FA_VERIFY_CALL = new MobileOfficialAppsCoreNavStat$EventScreen("PHONE_2FA_VERIFY_CALL", 725);

    @pmi0("phone_2fa_verify_lib")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PHONE_2FA_VERIFY_LIB = new MobileOfficialAppsCoreNavStat$EventScreen("PHONE_2FA_VERIFY_LIB", 726);

    @pmi0("partial_expand_enter_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PARTIAL_EXPAND_ENTER_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("PARTIAL_EXPAND_ENTER_PASSWORD", 727);

    @pmi0("partial_expand_have_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PARTIAL_EXPAND_HAVE_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("PARTIAL_EXPAND_HAVE_ACCOUNT", 728);

    @pmi0("partial_silent_expand_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PARTIAL_SILENT_EXPAND_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("PARTIAL_SILENT_EXPAND_PASSWORD", 729);

    @pmi0("profile_video_my_added")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_VIDEO_MY_ADDED = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_VIDEO_MY_ADDED", 730);

    @pmi0("profile_video_my_playlists")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_VIDEO_MY_PLAYLISTS = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_VIDEO_MY_PLAYLISTS", 731);

    @pmi0("profile_video_my_lives")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_VIDEO_MY_LIVES = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_VIDEO_MY_LIVES", 732);

    @pmi0("profile_video_my_uploaded")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROFILE_VIDEO_MY_UPLOADED = new MobileOfficialAppsCoreNavStat$EventScreen("PROFILE_VIDEO_MY_UPLOADED", 733);

    @pmi0("oauth_existing_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OAUTH_EXISTING_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("OAUTH_EXISTING_ACCOUNT", 734);

    @pmi0("oauth_registration_phone")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OAUTH_REGISTRATION_PHONE = new MobileOfficialAppsCoreNavStat$EventScreen("OAUTH_REGISTRATION_PHONE", 735);

    @pmi0("oauth_mail")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OAUTH_MAIL = new MobileOfficialAppsCoreNavStat$EventScreen("OAUTH_MAIL", 736);

    @pmi0("oauth_ok")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OAUTH_OK = new MobileOfficialAppsCoreNavStat$EventScreen("OAUTH_OK", 737);

    @pmi0("oauth_sber")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OAUTH_SBER = new MobileOfficialAppsCoreNavStat$EventScreen("OAUTH_SBER", 738);

    @pmi0("oauth_esia")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OAUTH_ESIA = new MobileOfficialAppsCoreNavStat$EventScreen("OAUTH_ESIA", 739);

    @pmi0("oauth_apple")
    public static final MobileOfficialAppsCoreNavStat$EventScreen OAUTH_APPLE = new MobileOfficialAppsCoreNavStat$EventScreen("OAUTH_APPLE", 740);

    @pmi0("story_friends_send")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_FRIENDS_SEND = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_FRIENDS_SEND", 741);

    @pmi0("story_video_choose_preview")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_VIDEO_CHOOSE_PREVIEW = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_VIDEO_CHOOSE_PREVIEW", 742);

    @pmi0("search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH", 743);

    @pmi0("search_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_ALL", 744);

    @pmi0("search_authors")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_AUTHORS = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_AUTHORS", 745);

    @pmi0("search_games")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_GAMES = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_GAMES", 746);

    @pmi0("global_search_games_recommendations")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GLOBAL_SEARCH_GAMES_RECOMMENDATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("GLOBAL_SEARCH_GAMES_RECOMMENDATIONS", 747);

    @pmi0("global_search_games")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GLOBAL_SEARCH_GAMES = new MobileOfficialAppsCoreNavStat$EventScreen("GLOBAL_SEARCH_GAMES", 748);

    @pmi0("global_search_games_recent")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GLOBAL_SEARCH_GAMES_RECENT = new MobileOfficialAppsCoreNavStat$EventScreen("GLOBAL_SEARCH_GAMES_RECENT", 749);

    @pmi0("apps_games_catalog_recent")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS_GAMES_CATALOG_RECENT = new MobileOfficialAppsCoreNavStat$EventScreen("APPS_GAMES_CATALOG_RECENT", UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);

    @pmi0("apps_games_catalog_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS_GAMES_CATALOG_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("APPS_GAMES_CATALOG_SEARCH", 751);

    @pmi0("search_groups")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_GROUPS = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_GROUPS", 752);

    @pmi0("search_channels")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_CHANNELS = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_CHANNELS", 753);

    @pmi0("search_mini_apps")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_MINI_APPS = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_MINI_APPS", 754);

    @pmi0("search_music")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_MUSIC = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_MUSIC", 755);

    @pmi0("search_music_service")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_MUSIC_SERVICE = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_MUSIC_SERVICE", 756);

    @pmi0("search_news")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_NEWS = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_NEWS", 757);

    @pmi0("search_news_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_NEWS_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_NEWS_PROFILE", 758);

    @pmi0("search_news_community")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_NEWS_COMMUNITY = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_NEWS_COMMUNITY", 759);

    @pmi0("search_owner_videos")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_OWNER_VIDEOS = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_OWNER_VIDEOS", 760);

    @pmi0("search_people_rec")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_PEOPLE_REC = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_PEOPLE_REC", 761);

    @pmi0("search_people")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_PEOPLE = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_PEOPLE", CronetStatsLog.CRONET_ENGINE_BUILDER_INITIALIZED);

    @pmi0("search_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_VIDEO", 763);

    @pmi0("search_classifieds")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_CLASSIFIEDS = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_CLASSIFIEDS", CronetStatsLog.CRONET_INITIALIZED);

    @pmi0("search_market")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_MARKET = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_MARKET", 765);

    @pmi0("search_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_CLIPS", 766);

    @pmi0("search_clips_service")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_CLIPS_SERVICE = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_CLIPS_SERVICE", 767);

    @pmi0("search_map")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_MAP = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_MAP", Tensorflow.FRAME_HEIGHT);

    @pmi0("friend_friends_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIEND_FRIENDS_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("FRIEND_FRIENDS_SEARCH", 769);

    @pmi0("service_trusted_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SERVICE_TRUSTED_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("SERVICE_TRUSTED_PROFILE", 770);

    @pmi0("service_verification_faq")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SERVICE_VERIFICATION_FAQ = new MobileOfficialAppsCoreNavStat$EventScreen("SERVICE_VERIFICATION_FAQ", 771);

    @pmi0("settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS", 772);

    @pmi0("settings_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT", 773);

    @pmi0("settings_account_phone")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_PHONE = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_PHONE", 774);

    @pmi0("settings_account_email")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_EMAIL = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_EMAIL", 775);

    @pmi0("settings_account_short_name")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_SHORT_NAME = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_SHORT_NAME", 776);

    @pmi0("settings_account_wall_mode")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_WALL_MODE = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_WALL_MODE", 777);

    @pmi0("settings_account_community_commenting")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_COMMUNITY_COMMENTING = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_COMMUNITY_COMMENTING", 778);

    @pmi0("settings_account_comment_order")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_COMMENT_ORDER = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_COMMENT_ORDER", 779);

    @pmi0("settings_account_mini_apps_card")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_MINI_APPS_CARD = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_MINI_APPS_CARD", 780);

    @pmi0("settings_account_show_contacts_names")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_SHOW_CONTACTS_NAMES = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_SHOW_CONTACTS_NAMES", 781);

    @pmi0("settings_account_im_unread_counter")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_ACCOUNT_IM_UNREAD_COUNTER = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_ACCOUNT_IM_UNREAD_COUNTER", 782);

    @pmi0("settings_appearance")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_APPEARANCE = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_APPEARANCE", 783);

    @pmi0("settings_appearance_theme_timetable")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_APPEARANCE_THEME_TIMETABLE = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_APPEARANCE_THEME_TIMETABLE", 784);

    @pmi0("settings_balance")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_BALANCE = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_BALANCE", 785);

    @pmi0("settings_blacklist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_BLACKLIST = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_BLACKLIST", 786);

    @pmi0("settings_caller_id")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_CALLER_ID = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_CALLER_ID", 787);

    @pmi0("settings_caller_id_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_CALLER_ID_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_CALLER_ID_ONBOARDING", 788);

    @pmi0("settings_general")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL", 789);

    @pmi0("settings_general_audio_download")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL_AUDIO_DOWNLOAD = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL_AUDIO_DOWNLOAD", 790);

    @pmi0("settings_general_video_download")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL_VIDEO_DOWNLOAD = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL_VIDEO_DOWNLOAD", 791);

    @pmi0("settings_general_video_quality")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL_VIDEO_QUALITY = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL_VIDEO_QUALITY", 792);

    @pmi0("settings_general_media_autoplay")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL_MEDIA_AUTOPLAY = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL_MEDIA_AUTOPLAY", 793);

    @pmi0("settings_general_stickers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL_STICKERS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL_STICKERS", 794);

    @pmi0("settings_general_stickers_popup")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL_STICKERS_POPUP = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL_STICKERS_POPUP", 795);

    @pmi0("settings_general_calls")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL_CALLS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL_CALLS", 796);

    @pmi0("settings_general_music")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_GENERAL_MUSIC = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_GENERAL_MUSIC", 797);

    @pmi0("settings_privacy")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_PRIVACY = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_PRIVACY", 798);

    @pmi0("settings_contacts_for_apps")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_CONTACTS_FOR_APPS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_CONTACTS_FOR_APPS", 799);

    @pmi0("settings_notifications")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS", 800);

    @pmi0("settings_notifications_do_not_disturb")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_DO_NOT_DISTURB = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_DO_NOT_DISTURB", ApiInvocationException.ErrorCodes.CHAT_PARTICIPANTS_EMPTY_BLOCKED_USERS);

    @pmi0("settings_notifications_community_notifications")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_COMMUNITY_NOTIFICATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_COMMUNITY_NOTIFICATIONS", 802);

    @pmi0("settings_notifications_community_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_COMMUNITY_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_COMMUNITY_PICKER", 803);

    @pmi0("settings_notifications_community_detailed")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_COMMUNITY_DETAILED = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_COMMUNITY_DETAILED", 804);

    @pmi0("settings_notifications_sections_group")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_SECTIONS_GROUP = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_SECTIONS_GROUP", 805);

    @pmi0("settings_notifications_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_SEARCH", 806);

    @pmi0("settings_notifications_section")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_SECTION = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_SECTION", 807);

    @pmi0("settings_notifications_additional")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_ADDITIONAL = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_ADDITIONAL", 808);

    @pmi0("settings_notifications_subscription_to_stories")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_NOTIFICATIONS_SUBSCRIPTION_TO_STORIES = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_NOTIFICATIONS_SUBSCRIPTION_TO_STORIES", 809);

    @pmi0("settings_security")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_SECURITY = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_SECURITY", 810);

    @pmi0("settings_subscriptions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_SUBSCRIPTIONS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_SUBSCRIPTIONS", 811);

    @pmi0("settings_filter_newsfeed")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_FILTER_NEWSFEED = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_FILTER_NEWSFEED", 812);

    @pmi0("settings_privacy_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_PRIVACY_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_PRIVACY_ALBUM", 813);

    @pmi0("settings_privacy_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_PRIVACY_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_PRIVACY_VIDEO", 814);

    @pmi0("settings_privacy_video_comments")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_PRIVACY_VIDEO_COMMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_PRIVACY_VIDEO_COMMENTS", 815);

    @pmi0("settings_privacy_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_PRIVACY_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_PRIVACY_PHOTO", 816);

    @pmi0("settings_privacy_photo_comments")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_PRIVACY_PHOTO_COMMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_PRIVACY_PHOTO_COMMENTS", 817);

    @pmi0("settings_privacy_story")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_PRIVACY_STORY = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_PRIVACY_STORY", 818);

    @pmi0("settings_tamagotchi")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_TAMAGOTCHI = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_TAMAGOTCHI", 819);

    @pmi0("share")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SHARE = new MobileOfficialAppsCoreNavStat$EventScreen("SHARE", 820);

    @pmi0("short_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SHORT_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("SHORT_VIDEO", 821);

    @pmi0("start")
    public static final MobileOfficialAppsCoreNavStat$EventScreen START = new MobileOfficialAppsCoreNavStat$EventScreen("START", 822);

    @pmi0("start_proceed_as")
    public static final MobileOfficialAppsCoreNavStat$EventScreen START_PROCEED_AS = new MobileOfficialAppsCoreNavStat$EventScreen("START_PROCEED_AS", 823);

    @pmi0("auth_start_with_phone")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUTH_START_WITH_PHONE = new MobileOfficialAppsCoreNavStat$EventScreen("AUTH_START_WITH_PHONE", 824);

    @pmi0("sticker_pack_detailed")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKER_PACK_DETAILED = new MobileOfficialAppsCoreNavStat$EventScreen("STICKER_PACK_DETAILED", 825);

    @pmi0("sticker_style_selector")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKER_STYLE_SELECTOR = new MobileOfficialAppsCoreNavStat$EventScreen("STICKER_STYLE_SELECTOR", 826);

    @pmi0("stickers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS", 827);

    @pmi0("stickers_random")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_RANDOM = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_RANDOM", 828);

    @pmi0("stickers_random_available")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_RANDOM_AVAILABLE = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_RANDOM_AVAILABLE", 829);

    @pmi0("stickers_random_success")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_RANDOM_SUCCESS = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_RANDOM_SUCCESS", 830);

    @pmi0("stickers_catalog_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_CATALOG_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_CATALOG_SEARCH", 831);

    @pmi0("sticker_overlay")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKER_OVERLAY = new MobileOfficialAppsCoreNavStat$EventScreen("STICKER_OVERLAY", 832);

    @pmi0("sticker_overlay_words")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKER_OVERLAY_WORDS = new MobileOfficialAppsCoreNavStat$EventScreen("STICKER_OVERLAY_WORDS", 833);

    @pmi0("sticker_overlay_similar")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKER_OVERLAY_SIMILAR = new MobileOfficialAppsCoreNavStat$EventScreen("STICKER_OVERLAY_SIMILAR", 834);

    @pmi0("sticker_pack_recomendations_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKER_PACK_RECOMENDATIONS_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("STICKER_PACK_RECOMENDATIONS_ALL", 835);

    @pmi0("stickers_bonus_addition_result")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_BONUS_ADDITION_RESULT = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_BONUS_ADDITION_RESULT", 836);

    @pmi0("stickers_bonus_disable")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_BONUS_DISABLE = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_BONUS_DISABLE", 837);

    @pmi0("stickers_bonus_rewards_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_BONUS_REWARDS_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_BONUS_REWARDS_CATALOG", 838);

    @pmi0("stickers_bonus_history")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_BONUS_HISTORY = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_BONUS_HISTORY", 839);

    @pmi0("stickers_bonus_rewards_active")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_BONUS_REWARDS_ACTIVE = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_BONUS_REWARDS_ACTIVE", 840);

    @pmi0("stickers_bonus_rewards_inactive")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_BONUS_REWARDS_INACTIVE = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_BONUS_REWARDS_INACTIVE", 841);

    @pmi0("stickers_bonus_reward_terms")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STICKERS_BONUS_REWARD_TERMS = new MobileOfficialAppsCoreNavStat$EventScreen("STICKERS_BONUS_REWARD_TERMS", 842);

    @pmi0("vmoji_camera")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VMOJI_CAMERA = new MobileOfficialAppsCoreNavStat$EventScreen("VMOJI_CAMERA", 843);

    @pmi0("vmoji_character")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VMOJI_CHARACTER = new MobileOfficialAppsCoreNavStat$EventScreen("VMOJI_CHARACTER", 844);

    @pmi0("vmoji_recommendations")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VMOJI_RECOMMENDATIONS = new MobileOfficialAppsCoreNavStat$EventScreen("VMOJI_RECOMMENDATIONS", 845);

    @pmi0("vmoji_products")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VMOJI_PRODUCTS = new MobileOfficialAppsCoreNavStat$EventScreen("VMOJI_PRODUCTS", 846);

    @pmi0("stories_interesting_block")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORIES_INTERESTING_BLOCK = new MobileOfficialAppsCoreNavStat$EventScreen("STORIES_INTERESTING_BLOCK", 847);

    @pmi0("stories_feed_block")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORIES_FEED_BLOCK = new MobileOfficialAppsCoreNavStat$EventScreen("STORIES_FEED_BLOCK", 848);

    @pmi0("story")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY = new MobileOfficialAppsCoreNavStat$EventScreen("STORY", 849);

    @pmi0("story_archive")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_ARCHIVE = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_ARCHIVE", 850);

    @pmi0("story_camera")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_CAMERA = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_CAMERA", 851);

    @pmi0("story_camera_qr")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_CAMERA_QR = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_CAMERA_QR", 852);

    @pmi0("story_camera_live")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_CAMERA_LIVE = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_CAMERA_LIVE", 853);

    @pmi0("story_camera_photo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_CAMERA_PHOTO = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_CAMERA_PHOTO", 854);

    @pmi0("story_camera_story")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_CAMERA_STORY = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_CAMERA_STORY", 855);

    @pmi0("story_camera_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_CAMERA_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_CAMERA_VIDEO", 856);

    @pmi0("story_camera_pingpong")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_CAMERA_PINGPONG = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_CAMERA_PINGPONG", 857);

    @pmi0("story_camera_clips")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_CAMERA_CLIPS = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_CAMERA_CLIPS", 858);

    @pmi0("story_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_EDITOR", 859);

    @pmi0("story_feedback")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_FEEDBACK = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_FEEDBACK", 860);

    @pmi0("story_replies_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_REPLIES_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_REPLIES_LIST", 861);

    @pmi0("story_reply")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_REPLY = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_REPLY", 862);

    @pmi0("story_source_disabled")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_SOURCE_DISABLED = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_SOURCE_DISABLED", 863);

    @pmi0("story_birthday_banned")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_BIRTHDAY_BANNED = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_BIRTHDAY_BANNED", 864);

    @pmi0("story_viewer")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_VIEWER = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_VIEWER", 865);

    @pmi0("story_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_SETTINGS", 866);

    @pmi0("story_settings_community")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_SETTINGS_COMMUNITY = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_SETTINGS_COMMUNITY", 867);

    @pmi0("story_templates")
    public static final MobileOfficialAppsCoreNavStat$EventScreen STORY_TEMPLATES = new MobileOfficialAppsCoreNavStat$EventScreen("STORY_TEMPLATES", 868);

    @pmi0("suggest_vk_id_value")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SUGGEST_VK_ID_VALUE = new MobileOfficialAppsCoreNavStat$EventScreen("SUGGEST_VK_ID_VALUE", 869);

    @pmi0("silent_auth")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SILENT_AUTH = new MobileOfficialAppsCoreNavStat$EventScreen("SILENT_AUTH", 870);

    @pmi0("silent_auth_existing_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SILENT_AUTH_EXISTING_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("SILENT_AUTH_EXISTING_ACCOUNT", 871);

    @pmi0("silent_auth_provided_phone")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SILENT_AUTH_PROVIDED_PHONE = new MobileOfficialAppsCoreNavStat$EventScreen("SILENT_AUTH_PROVIDED_PHONE", 872);

    @pmi0("silent_auth_migration")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SILENT_AUTH_MIGRATION = new MobileOfficialAppsCoreNavStat$EventScreen("SILENT_AUTH_MIGRATION", 873);

    @pmi0("silent_auth_email")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SILENT_AUTH_EMAIL = new MobileOfficialAppsCoreNavStat$EventScreen("SILENT_AUTH_EMAIL", 874);

    @pmi0("situational_suggest_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SITUATIONAL_SUGGEST_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("SITUATIONAL_SUGGEST_SEARCH", 875);

    @pmi0("subscription_suspend")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SUBSCRIPTION_SUSPEND = new MobileOfficialAppsCoreNavStat$EventScreen("SUBSCRIPTION_SUSPEND", 876);

    @pmi0("group_donut_success")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GROUP_DONUT_SUCCESS = new MobileOfficialAppsCoreNavStat$EventScreen("GROUP_DONUT_SUCCESS", 877);

    @pmi0("support")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SUPPORT = new MobileOfficialAppsCoreNavStat$EventScreen("SUPPORT", 878);

    @pmi0("super_app")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SUPER_APP = new MobileOfficialAppsCoreNavStat$EventScreen("SUPER_APP", 879);

    @pmi0("super_app_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SUPER_APP_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("SUPER_APP_SETTINGS", 880);

    @pmi0("super_app_birthday_present")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SUPER_APP_BIRTHDAY_PRESENT = new MobileOfficialAppsCoreNavStat$EventScreen("SUPER_APP_BIRTHDAY_PRESENT", 881);

    @pmi0("super_app_burger_menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SUPER_APP_BURGER_MENU = new MobileOfficialAppsCoreNavStat$EventScreen("SUPER_APP_BURGER_MENU", 882);

    @pmi0("shopping_center")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SHOPPING_CENTER = new MobileOfficialAppsCoreNavStat$EventScreen("SHOPPING_CENTER", 883);

    @pmi0("settings_change_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SETTINGS_CHANGE_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("SETTINGS_CHANGE_PASSWORD", 884);

    @pmi0("system_notifications_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SYSTEM_NOTIFICATIONS_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("SYSTEM_NOTIFICATIONS_SETTINGS", 885);

    @pmi0("system_voice_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SYSTEM_VOICE_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("SYSTEM_VOICE_SEARCH", 886);

    @pmi0("springboard")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SPRINGBOARD = new MobileOfficialAppsCoreNavStat$EventScreen("SPRINGBOARD", 887);

    @pmi0("textlive")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TEXTLIVE = new MobileOfficialAppsCoreNavStat$EventScreen("TEXTLIVE", 888);

    @pmi0("textlive_community_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TEXTLIVE_COMMUNITY_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("TEXTLIVE_COMMUNITY_LIST", 889);

    @pmi0("verification_authenticator_code")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VERIFICATION_AUTHENTICATOR_CODE = new MobileOfficialAppsCoreNavStat$EventScreen("VERIFICATION_AUTHENTICATOR_CODE", 890);

    @pmi0("vkui_friends_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKUI_FRIENDS_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("VKUI_FRIENDS_PICKER", 891);

    @pmi0("video_about")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_ABOUT = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_ABOUT", 892);

    @pmi0("video_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_CATALOG", 893);

    @pmi0("search_video_service")
    public static final MobileOfficialAppsCoreNavStat$EventScreen SEARCH_VIDEO_SERVICE = new MobileOfficialAppsCoreNavStat$EventScreen("SEARCH_VIDEO_SERVICE", 894);

    @pmi0("video_embed")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_EMBED = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_EMBED", 895);

    @pmi0("comments_list_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMENTS_LIST_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("COMMENTS_LIST_VIDEO", 896);

    @pmi0("video_live")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_LIVE = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_LIVE", 897);

    @pmi0("meta_group")
    public static final MobileOfficialAppsCoreNavStat$EventScreen META_GROUP = new MobileOfficialAppsCoreNavStat$EventScreen("META_GROUP", 898);

    @pmi0("video_group")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_GROUP = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_GROUP", 899);

    @pmi0("video_group_all")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_GROUP_ALL = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_GROUP_ALL", 900);

    @pmi0("video_my_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_MY_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_MY_CATALOG", 901);

    @pmi0("video_edit_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_EDIT_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_EDIT_VIDEO", 902);

    @pmi0("video_edit_video_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_EDIT_VIDEO_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_EDIT_VIDEO_ALBUM", 903);

    @pmi0("video_create_video_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_CREATE_VIDEO_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_CREATE_VIDEO_ALBUM", 904);

    @pmi0("video_user")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_USER = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_USER", 905);

    @pmi0("video_settings_user_additional")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_SETTINGS_USER_ADDITIONAL = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_SETTINGS_USER_ADDITIONAL", 906);

    @pmi0("video_picker")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_PICKER = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_PICKER", 907);

    @pmi0("video_carousel")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_CAROUSEL = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_CAROUSEL", 908);

    @pmi0("video_vkvlive_discover")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_VKVLIVE_DISCOVER = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_VKVLIVE_DISCOVER", 909);

    @pmi0("video_youtube")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_YOUTUBE = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_YOUTUBE", 910);

    @pmi0("video_single_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_SINGLE_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_SINGLE_VIDEO", 911);

    @pmi0("video_single_interactive_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_SINGLE_INTERACTIVE_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_SINGLE_INTERACTIVE_VIDEO", 912);

    @pmi0("video_actions_dialog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_ACTIONS_DIALOG = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_ACTIONS_DIALOG", 913);

    @pmi0("video_downloads")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_DOWNLOADS = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_DOWNLOADS", 914);

    @pmi0("video_choose_album")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_CHOOSE_ALBUM = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_CHOOSE_ALBUM", 915);

    @pmi0("video_shoppable_ad")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_SHOPPABLE_AD = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_SHOPPABLE_AD", 916);

    @pmi0("video_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_PROFILE", 917);

    @pmi0("video_popular_week")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_POPULAR_WEEK = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_POPULAR_WEEK", 918);

    @pmi0("video_discovery")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_DISCOVERY = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_DISCOVERY", 919);

    @pmi0("video_all_authors")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_ALL_AUTHORS = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_ALL_AUTHORS", 920);

    @pmi0("video_ad_pushes")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_AD_PUSHES = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_AD_PUSHES", 921);

    @pmi0("video_search")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_SEARCH = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_SEARCH", 922);

    @pmi0("video_for_you")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_FOR_YOU = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_FOR_YOU", 923);

    @pmi0("video_subscriptions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_SUBSCRIPTIONS = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_SUBSCRIPTIONS", 924);

    @pmi0("video_kids_mode_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_KIDS_MODE_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_KIDS_MODE_ONBOARDING", 925);

    @pmi0("video_playlist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_PLAYLIST = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_PLAYLIST", 926);

    @pmi0("video_upload")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_UPLOAD = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_UPLOAD", 927);

    @pmi0("video_smart_crop")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_SMART_CROP = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_SMART_CROP", PDF417Common.MAX_CODEWORDS_IN_BARCODE);

    @pmi0("video_movie_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_MOVIE_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_MOVIE_PAGE", PDF417Common.NUMBER_OF_CODEWORDS);

    @pmi0("vk_connect_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VK_CONNECT_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("VK_CONNECT_ACCOUNT", 930);

    @pmi0("vk_connect_agreement")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VK_CONNECT_AGREEMENT = new MobileOfficialAppsCoreNavStat$EventScreen("VK_CONNECT_AGREEMENT", 931);

    @pmi0("vk_pay")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VK_PAY = new MobileOfficialAppsCoreNavStat$EventScreen("VK_PAY", 932);

    @pmi0("vk_pay_checkout")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VK_PAY_CHECKOUT = new MobileOfficialAppsCoreNavStat$EventScreen("VK_PAY_CHECKOUT", 933);

    @pmi0("vk_video")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VK_VIDEO = new MobileOfficialAppsCoreNavStat$EventScreen("VK_VIDEO", 934);

    @pmi0("calls")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CALLS = new MobileOfficialAppsCoreNavStat$EventScreen("CALLS", 935);

    @pmi0("voip_call")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL", 936);

    @pmi0("voip_active_call")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_ACTIVE_CALL = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_ACTIVE_CALL", 937);

    @pmi0("voip_call_invite")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_INVITE = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_INVITE", 938);

    @pmi0("voip_call_invite_anonymous")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_INVITE_ANONYMOUS = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_INVITE_ANONYMOUS", 939);

    @pmi0("voip_call_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_LIST", 940);

    @pmi0("voip_call_friends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_FRIENDS = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_FRIENDS", 941);

    @pmi0("voip_call_create_by_link")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_CREATE_BY_LINK = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_CREATE_BY_LINK", 942);

    @pmi0("voip_call_landing_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_LANDING_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_LANDING_PAGE", 943);

    @pmi0("voip_call_user_promo")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_USER_PROMO = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_USER_PROMO", 944);

    @pmi0("voip_call_preferences")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_PREFERENCES = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_PREFERENCES", 945);

    @pmi0("voip_call_recordings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_RECORDINGS = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_RECORDINGS", 946);

    @pmi0("voip_call_schedule_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_SCHEDULE_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_SCHEDULE_SETTINGS", 947);

    @pmi0("voip_call_schedule_success")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_SCHEDULE_SUCCESS = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_SCHEDULE_SUCCESS", 948);

    @pmi0("voip_scheduled_calls")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_SCHEDULED_CALLS = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_SCHEDULED_CALLS", 949);

    @pmi0("voip_past_asr_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_PAST_ASR_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_PAST_ASR_LIST", 950);

    @pmi0("voip_call_stereo_room")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_STEREO_ROOM = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_STEREO_ROOM", 951);

    @pmi0("voip_call_stereo_room_create")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_STEREO_ROOM_CREATE = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_STEREO_ROOM_CREATE", 952);

    @pmi0("voip_call_stereo_room_join")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_STEREO_ROOM_JOIN = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_STEREO_ROOM_JOIN", 953);

    @pmi0("voip_call_stereo_room_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_STEREO_ROOM_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_STEREO_ROOM_LIST", 954);

    @pmi0("voip_call_stereo_room_info")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_STEREO_ROOM_INFO = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_STEREO_ROOM_INFO", 955);

    @pmi0("voip_call_stereo_select_speakers")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_STEREO_SELECT_SPEAKERS = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_STEREO_SELECT_SPEAKERS", 956);

    @pmi0("voip_call_history_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VOIP_CALL_HISTORY_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("VOIP_CALL_HISTORY_LIST", 957);

    @pmi0("wiki")
    public static final MobileOfficialAppsCoreNavStat$EventScreen WIKI = new MobileOfficialAppsCoreNavStat$EventScreen("WIKI", 958);

    @pmi0("user_validation")
    public static final MobileOfficialAppsCoreNavStat$EventScreen USER_VALIDATION = new MobileOfficialAppsCoreNavStat$EventScreen("USER_VALIDATION", 959);

    @pmi0("user_statistics")
    public static final MobileOfficialAppsCoreNavStat$EventScreen USER_STATISTICS = new MobileOfficialAppsCoreNavStat$EventScreen("USER_STATISTICS", VideoRecord.DEFAULT_MAX_DIMENSION);

    @pmi0("user_expert_card")
    public static final MobileOfficialAppsCoreNavStat$EventScreen USER_EXPERT_CARD = new MobileOfficialAppsCoreNavStat$EventScreen("USER_EXPERT_CARD", 961);

    @pmi0("unsure_members_in_group")
    public static final MobileOfficialAppsCoreNavStat$EventScreen UNSURE_MEMBERS_IN_GROUP = new MobileOfficialAppsCoreNavStat$EventScreen("UNSURE_MEMBERS_IN_GROUP", 962);

    @pmi0("unblock_protect_account")
    public static final MobileOfficialAppsCoreNavStat$EventScreen UNBLOCK_PROTECT_ACCOUNT = new MobileOfficialAppsCoreNavStat$EventScreen("UNBLOCK_PROTECT_ACCOUNT", 963);

    @pmi0("wishlist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen WISHLIST = new MobileOfficialAppsCoreNavStat$EventScreen("WISHLIST", 964);

    @pmi0("vkrun_leaderboard")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKRUN_LEADERBOARD = new MobileOfficialAppsCoreNavStat$EventScreen("VKRUN_LEADERBOARD", 965);

    @pmi0("vkrun_target_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKRUN_TARGET_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("VKRUN_TARGET_SETTINGS", 966);

    @pmi0("vkrun_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKRUN_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("VKRUN_ONBOARDING", 967);

    @pmi0("vkc_account_link_loading")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKC_ACCOUNT_LINK_LOADING = new MobileOfficialAppsCoreNavStat$EventScreen("VKC_ACCOUNT_LINK_LOADING", 968);

    @pmi0("vkc_account_not_found")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKC_ACCOUNT_NOT_FOUND = new MobileOfficialAppsCoreNavStat$EventScreen("VKC_ACCOUNT_NOT_FOUND", 969);

    @pmi0("vkc_account_found")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKC_ACCOUNT_FOUND = new MobileOfficialAppsCoreNavStat$EventScreen("VKC_ACCOUNT_FOUND", 970);

    @pmi0("vkc_account_already_linked")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKC_ACCOUNT_ALREADY_LINKED = new MobileOfficialAppsCoreNavStat$EventScreen("VKC_ACCOUNT_ALREADY_LINKED", 971);

    @pmi0("vkc_account_link_token_error")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKC_ACCOUNT_LINK_TOKEN_ERROR = new MobileOfficialAppsCoreNavStat$EventScreen("VKC_ACCOUNT_LINK_TOKEN_ERROR", 972);

    @pmi0("vkc_account_link_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKC_ACCOUNT_LINK_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("VKC_ACCOUNT_LINK_PASSWORD", 973);

    @pmi0("vkc_accoint_many_choices")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKC_ACCOINT_MANY_CHOICES = new MobileOfficialAppsCoreNavStat$EventScreen("VKC_ACCOINT_MANY_CHOICES", 974);

    @pmi0("vkc_data_permission")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKC_DATA_PERMISSION = new MobileOfficialAppsCoreNavStat$EventScreen("VKC_DATA_PERMISSION", 975);

    @pmi0("auth_password")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUTH_PASSWORD = new MobileOfficialAppsCoreNavStat$EventScreen("AUTH_PASSWORD", 976);

    @pmi0("auth_start_loading")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUTH_START_LOADING = new MobileOfficialAppsCoreNavStat$EventScreen("AUTH_START_LOADING", 977);

    @pmi0("vkid_user_confirmation")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKID_USER_CONFIRMATION = new MobileOfficialAppsCoreNavStat$EventScreen("VKID_USER_CONFIRMATION", 978);

    @pmi0("external_permissions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen EXTERNAL_PERMISSIONS = new MobileOfficialAppsCoreNavStat$EventScreen("EXTERNAL_PERMISSIONS", 979);

    @pmi0("question_my")
    public static final MobileOfficialAppsCoreNavStat$EventScreen QUESTION_MY = new MobileOfficialAppsCoreNavStat$EventScreen("QUESTION_MY", 980);

    @pmi0("question_ask")
    public static final MobileOfficialAppsCoreNavStat$EventScreen QUESTION_ASK = new MobileOfficialAppsCoreNavStat$EventScreen("QUESTION_ASK", 981);

    @pmi0("games_unavailable_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_UNAVAILABLE_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_UNAVAILABLE_PAGE", 982);

    @pmi0("community_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_ONBOARDING", 983);

    @pmi0("games_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen GAMES_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("GAMES_CATALOG", 984);

    @pmi0("apps_games_categories")
    public static final MobileOfficialAppsCoreNavStat$EventScreen APPS_GAMES_CATEGORIES = new MobileOfficialAppsCoreNavStat$EventScreen("APPS_GAMES_CATEGORIES", 985);

    @pmi0("verification_call_code")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VERIFICATION_CALL_CODE = new MobileOfficialAppsCoreNavStat$EventScreen("VERIFICATION_CALL_CODE", 986);

    @pmi0("consent_screen_agreement")
    public static final MobileOfficialAppsCoreNavStat$EventScreen CONSENT_SCREEN_AGREEMENT = new MobileOfficialAppsCoreNavStat$EventScreen("CONSENT_SCREEN_AGREEMENT", 987);

    @pmi0("vklink_browser")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VKLINK_BROWSER = new MobileOfficialAppsCoreNavStat$EventScreen("VKLINK_BROWSER", 988);

    @pmi0("auth_qr_code")
    public static final MobileOfficialAppsCoreNavStat$EventScreen AUTH_QR_CODE = new MobileOfficialAppsCoreNavStat$EventScreen("AUTH_QR_CODE", 989);

    @pmi0("qr_code_confirm_waiting")
    public static final MobileOfficialAppsCoreNavStat$EventScreen QR_CODE_CONFIRM_WAITING = new MobileOfficialAppsCoreNavStat$EventScreen("QR_CODE_CONFIRM_WAITING", 990);

    @pmi0("proceed_as_with_subprofile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen PROCEED_AS_WITH_SUBPROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("PROCEED_AS_WITH_SUBPROFILE", 991);

    @pmi0("uxpoll_modal")
    public static final MobileOfficialAppsCoreNavStat$EventScreen UXPOLL_MODAL = new MobileOfficialAppsCoreNavStat$EventScreen("UXPOLL_MODAL", 992);

    @pmi0("tv_owner_video_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_OWNER_VIDEO_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("TV_OWNER_VIDEO_LIST", 993);

    @pmi0("tv_device_info")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_DEVICE_INFO = new MobileOfficialAppsCoreNavStat$EventScreen("TV_DEVICE_INFO", 994);

    @pmi0("tv_exit")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_EXIT = new MobileOfficialAppsCoreNavStat$EventScreen("TV_EXIT", 995);

    @pmi0("tv_player")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_PLAYER = new MobileOfficialAppsCoreNavStat$EventScreen("TV_PLAYER", 996);

    @pmi0("tv_clips_player")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_CLIPS_PLAYER = new MobileOfficialAppsCoreNavStat$EventScreen("TV_CLIPS_PLAYER", 997);

    @pmi0("tv_player_quality_select")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_PLAYER_QUALITY_SELECT = new MobileOfficialAppsCoreNavStat$EventScreen("TV_PLAYER_QUALITY_SELECT", 998);

    @pmi0("tv_login")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_LOGIN = new MobileOfficialAppsCoreNavStat$EventScreen("TV_LOGIN", 999);

    @pmi0("tv_logout")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_LOGOUT = new MobileOfficialAppsCoreNavStat$EventScreen("TV_LOGOUT", 1000);

    @pmi0("tv_video_catalog")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_VIDEO_CATALOG = new MobileOfficialAppsCoreNavStat$EventScreen("TV_VIDEO_CATALOG", 1001);

    @pmi0("tv_search_input")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SEARCH_INPUT = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SEARCH_INPUT", 1002);

    @pmi0("tv_search_results")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SEARCH_RESULTS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SEARCH_RESULTS", 1003);

    @pmi0("tv_agreement")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_AGREEMENT = new MobileOfficialAppsCoreNavStat$EventScreen("TV_AGREEMENT", 1004);

    @pmi0("tv_not_exist_internet")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_NOT_EXIST_INTERNET = new MobileOfficialAppsCoreNavStat$EventScreen("TV_NOT_EXIST_INTERNET", 1005);

    @pmi0("tv_new_owner_video_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_NEW_OWNER_VIDEO_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("TV_NEW_OWNER_VIDEO_LIST", 1006);

    @pmi0("tv_new_search_input")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_NEW_SEARCH_INPUT = new MobileOfficialAppsCoreNavStat$EventScreen("TV_NEW_SEARCH_INPUT", 1007);

    @pmi0("tv_interests_onboard")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_INTERESTS_ONBOARD = new MobileOfficialAppsCoreNavStat$EventScreen("TV_INTERESTS_ONBOARD", 1008);

    @pmi0("tv_nowhere")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_NOWHERE = new MobileOfficialAppsCoreNavStat$EventScreen("TV_NOWHERE", 1009);

    @pmi0("tv_qr_code_auth")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_QR_CODE_AUTH = new MobileOfficialAppsCoreNavStat$EventScreen("TV_QR_CODE_AUTH", 1010);

    @pmi0("tv_logout_confirm")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_LOGOUT_CONFIRM = new MobileOfficialAppsCoreNavStat$EventScreen("TV_LOGOUT_CONFIRM", 1011);

    @pmi0("tv_sports")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SPORTS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SPORTS", 1012);

    @pmi0("tv_films")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_FILMS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_FILMS", Z3.i);

    @pmi0("tv_following")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_FOLLOWING = new MobileOfficialAppsCoreNavStat$EventScreen("TV_FOLLOWING", Z3.j);

    @pmi0("tv_library")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_LIBRARY = new MobileOfficialAppsCoreNavStat$EventScreen("TV_LIBRARY", 1015);

    @pmi0("tv_history")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_HISTORY = new MobileOfficialAppsCoreNavStat$EventScreen("TV_HISTORY", Z3.l);

    @pmi0("tv_added_videos")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_ADDED_VIDEOS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_ADDED_VIDEOS", 1017);

    @pmi0("tv_uploaded_videos")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_UPLOADED_VIDEOS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_UPLOADED_VIDEOS", 1018);

    @pmi0("tv_owner_live_streams")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_OWNER_LIVE_STREAMS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_OWNER_LIVE_STREAMS", 1019);

    @pmi0("tv_owner_call_recordings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_OWNER_CALL_RECORDINGS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_OWNER_CALL_RECORDINGS", 1020);

    @pmi0("tv_owner_liked_videos")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_OWNER_LIKED_VIDEOS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_OWNER_LIKED_VIDEOS", IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);

    @pmi0("tv_owner_bookmarks")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_OWNER_BOOKMARKS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_OWNER_BOOKMARKS", IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);

    @pmi0("tv_owner_playlists")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_OWNER_PLAYLISTS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_OWNER_PLAYLISTS", IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);

    @pmi0("tv_video_playlist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_VIDEO_PLAYLIST = new MobileOfficialAppsCoreNavStat$EventScreen("TV_VIDEO_PLAYLIST", 1024);

    @pmi0("tv_esports_games")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_ESPORTS_GAMES = new MobileOfficialAppsCoreNavStat$EventScreen("TV_ESPORTS_GAMES", IronSourceError.ERROR_LOAD_FAILED_TIMEOUT);

    @pmi0("tv_live_streams")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_LIVE_STREAMS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_LIVE_STREAMS", IronSourceError.ERROR_RV_LOAD_DURING_LOAD);

    @pmi0("tv_series")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SERIES = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SERIES", IronSourceError.ERROR_RV_LOAD_DURING_SHOW);

    @pmi0("tv_shows")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SHOWS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SHOWS", IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);

    @pmi0("tv_kids")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_KIDS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_KIDS", IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID);

    @pmi0("tv_terms_and_conditions")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_TERMS_AND_CONDITIONS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_TERMS_AND_CONDITIONS", IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED);

    @pmi0("tv_player_author_information")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_PLAYER_AUTHOR_INFORMATION = new MobileOfficialAppsCoreNavStat$EventScreen("TV_PLAYER_AUTHOR_INFORMATION", IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID);

    @pmi0("tv_video_information")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_VIDEO_INFORMATION = new MobileOfficialAppsCoreNavStat$EventScreen("TV_VIDEO_INFORMATION", IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT);

    @pmi0("tv_autor_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_AUTOR_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("TV_AUTOR_PAGE", IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT);

    @pmi0("tv_zero_screen")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_ZERO_SCREEN = new MobileOfficialAppsCoreNavStat$EventScreen("TV_ZERO_SCREEN", IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK);

    @pmi0("tv_broken")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_BROKEN = new MobileOfficialAppsCoreNavStat$EventScreen("TV_BROKEN", IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES);

    @pmi0("tv_no_internet")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_NO_INTERNET = new MobileOfficialAppsCoreNavStat$EventScreen("TV_NO_INTERNET", IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW);

    @pmi0("tv_menu")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_MENU = new MobileOfficialAppsCoreNavStat$EventScreen("TV_MENU", IronSourceError.ERROR_IS_LOAD_DURING_SHOW);

    @pmi0("tv_special_olympics")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SPECIAL_OLYMPICS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SPECIAL_OLYMPICS", IronSourceError.ERROR_RV_SHOW_EXCEPTION);

    @pmi0("tv_channels")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_CHANNELS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_CHANNELS", IronSourceError.ERROR_IS_SHOW_EXCEPTION);

    @pmi0("tv_politics")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_POLITICS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_POLITICS", IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);

    @pmi0("tv_popular_trends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_POPULAR_TRENDS = new MobileOfficialAppsCoreNavStat$EventScreen("TV_POPULAR_TRENDS", IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION);

    @pmi0("tv_video_movie_page")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_VIDEO_MOVIE_PAGE = new MobileOfficialAppsCoreNavStat$EventScreen("TV_VIDEO_MOVIE_PAGE", IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED);

    @pmi0("community_biz_checklist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_BIZ_CHECKLIST = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_BIZ_CHECKLIST", IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED);

    @pmi0("community_invite_friends_biz")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_INVITE_FRIENDS_BIZ = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_INVITE_FRIENDS_BIZ", IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES);

    @pmi0("friends_following_link_invite")
    public static final MobileOfficialAppsCoreNavStat$EventScreen FRIENDS_FOLLOWING_LINK_INVITE = new MobileOfficialAppsCoreNavStat$EventScreen("FRIENDS_FOLLOWING_LINK_INVITE", IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES);

    @pmi0("market_item_review_list")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM_REVIEW_LIST = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM_REVIEW_LIST", 1046);

    @pmi0("market_item_review_create")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM_REVIEW_CREATE = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM_REVIEW_CREATE", 1047);

    @pmi0("market_item_review_popup")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM_REVIEW_POPUP = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM_REVIEW_POPUP", 1048);

    @pmi0("market_item_preview_recommends")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM_PREVIEW_RECOMMENDS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM_PREVIEW_RECOMMENDS", 1049);

    @pmi0("market_reviews_section")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_REVIEWS_SECTION = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_REVIEWS_SECTION", 1050);

    @pmi0("ugc_stickers_pack_banned")
    public static final MobileOfficialAppsCoreNavStat$EventScreen UGC_STICKERS_PACK_BANNED = new MobileOfficialAppsCoreNavStat$EventScreen("UGC_STICKERS_PACK_BANNED", IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW);

    @pmi0("market_item_comments")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MARKET_ITEM_COMMENTS = new MobileOfficialAppsCoreNavStat$EventScreen("MARKET_ITEM_COMMENTS", 1052);

    @pmi0("biometrics_lock_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BIOMETRICS_LOCK_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("BIOMETRICS_LOCK_ONBOARDING", 1053);

    @pmi0("biometrics_lock_pin")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BIOMETRICS_LOCK_PIN = new MobileOfficialAppsCoreNavStat$EventScreen("BIOMETRICS_LOCK_PIN", IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW);

    @pmi0("biometrics_lock_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BIOMETRICS_LOCK_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("BIOMETRICS_LOCK_SETTINGS", 1055);

    @pmi0("biometrics_lock_setup")
    public static final MobileOfficialAppsCoreNavStat$EventScreen BIOMETRICS_LOCK_SETUP = new MobileOfficialAppsCoreNavStat$EventScreen("BIOMETRICS_LOCK_SETUP", IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW);

    @pmi0("tabbar_settings_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TABBAR_SETTINGS_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("TABBAR_SETTINGS_ONBOARDING", IronSourceError.ERROR_RV_EXPIRED_ADS);

    @pmi0("tabbar_settings")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TABBAR_SETTINGS = new MobileOfficialAppsCoreNavStat$EventScreen("TABBAR_SETTINGS", 1058);

    @pmi0("tv_profiles")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_PROFILES = new MobileOfficialAppsCoreNavStat$EventScreen("TV_PROFILES", 1059);

    @pmi0("tv_kid_mode_onboarding")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_KID_MODE_ONBOARDING = new MobileOfficialAppsCoreNavStat$EventScreen("TV_KID_MODE_ONBOARDING", 1060);

    @pmi0("tv_create_child_profile")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_CREATE_CHILD_PROFILE = new MobileOfficialAppsCoreNavStat$EventScreen("TV_CREATE_CHILD_PROFILE", IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY);

    @pmi0("video_subscriptions_select_creators")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_SUBSCRIPTIONS_SELECT_CREATORS = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_SUBSCRIPTIONS_SELECT_CREATORS", 1062);

    @pmi0("posting_photo_editor")
    public static final MobileOfficialAppsCoreNavStat$EventScreen POSTING_PHOTO_EDITOR = new MobileOfficialAppsCoreNavStat$EventScreen("POSTING_PHOTO_EDITOR", 1063);

    @pmi0("tv_app_update")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_APP_UPDATE = new MobileOfficialAppsCoreNavStat$EventScreen("TV_APP_UPDATE", 1064);

    @pmi0("tv_settings_app_update")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SETTINGS_APP_UPDATE = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SETTINGS_APP_UPDATE", 1065);

    @pmi0("tv_settings_app_update_available")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SETTINGS_APP_UPDATE_AVAILABLE = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SETTINGS_APP_UPDATE_AVAILABLE", 1066);

    @pmi0("tv_app_update_soft")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_APP_UPDATE_SOFT = new MobileOfficialAppsCoreNavStat$EventScreen("TV_APP_UPDATE_SOFT", 1067);

    @pmi0("tv_app_update_hard")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_APP_UPDATE_HARD = new MobileOfficialAppsCoreNavStat$EventScreen("TV_APP_UPDATE_HARD", 1068);

    @pmi0("tv_settings_cast_code")
    public static final MobileOfficialAppsCoreNavStat$EventScreen TV_SETTINGS_CAST_CODE = new MobileOfficialAppsCoreNavStat$EventScreen("TV_SETTINGS_CAST_CODE", 1069);

    @pmi0("musician_card")
    public static final MobileOfficialAppsCoreNavStat$EventScreen MUSICIAN_CARD = new MobileOfficialAppsCoreNavStat$EventScreen("MUSICIAN_CARD", j.a.j);

    @pmi0("community_trust_marks")
    public static final MobileOfficialAppsCoreNavStat$EventScreen COMMUNITY_TRUST_MARKS = new MobileOfficialAppsCoreNavStat$EventScreen("COMMUNITY_TRUST_MARKS", j.a.k);

    @pmi0("video_ai_assistant_chat")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_AI_ASSISTANT_CHAT = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_AI_ASSISTANT_CHAT", 1072);

    @pmi0("video_ai_assistant_playlist")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_AI_ASSISTANT_PLAYLIST = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_AI_ASSISTANT_PLAYLIST", 1073);

    @pmi0("video_ai_assistant_history")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_AI_ASSISTANT_HISTORY = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_AI_ASSISTANT_HISTORY", 1074);

    @pmi0("video_group_main")
    public static final MobileOfficialAppsCoreNavStat$EventScreen VIDEO_GROUP_MAIN = new MobileOfficialAppsCoreNavStat$EventScreen("VIDEO_GROUP_MAIN", 1075);

    static {
        MobileOfficialAppsCoreNavStat$EventScreen[] h = h();
        $VALUES = h;
        $ENTRIES = e370.d(h);
    }

    private MobileOfficialAppsCoreNavStat$EventScreen(String str, int i) {
    }

    public static final /* synthetic */ MobileOfficialAppsCoreNavStat$EventScreen[] h() {
        return new MobileOfficialAppsCoreNavStat$EventScreen[]{ABOUT, ABOUT_LICENSES, APP, APP_SIDE_MENU, APP_TABBAR_MENU, APPS, APPS_CATALOG, APPS_CATALOG_CATEGORIES, APPS_CATALOG_CATEGORY, APPS_CATALOG_SEARCH, APPS_EXTERNAL_LINK, ARTICLE_READ, ARTICLE_BLOG_PRESS, ARTICLE_DZEN, ARTICLES_LIST, ATTACH_DOCUMENTS, ATTACH_DOCUMENTS_IMAGE, ATTACH_DOCUMENTS_TEXT, ATTACH_DOCUMENTS_GIF, ATTACH_DOCUMENTS_VIDEO, ATTACH_DOCUMENTS_OTHER, ATTACH_GALLERY, ATTACH_GRAFFITI, ATTACH_MUSIC, ATTACH_LOCATION, ATTACH_MONEY_TRANSFER, ATTACH_VK_GIFT, ATTACH_VK_PHOTO, ATTACH_VK_VIDEO, ATTACH_VK_POLL, ATTACH_GALLERY_MINI_APPS, ATTACH_GALLERY_GAMES, AUDIO, AUDIO_BOOK_PAGE, AUDIO_CATALOG, AUDIO_FULLSCREEN_BANNER, AUTH_PUSH, ALERT_AUTH_SUCCESS, ALBUM, ALBUM_EDIT, ALBUM_VIDEO_EDIT, ALBUM_PRIVACY_EDIT, ALBUM_SETTINGS, AUTH, AVATAR_CROP, AVATAR_PUBLISH, BADGES_ALL, BADGES_FRIENDS, BADGE, BADGES_COLLECTION_ALL__U, BADGES_COLLECTION_BADGE__U, BADGES_COLLECTION_ALL__C, BADGES_COLLECTION_BADGE__C, BADGES_CATALOG, BALANCE_PROMO_CODE, BALANCE_VOTES_ADD, BANNED_ACCOUNT, BOARD, BOARD_TOPIC_ALL, BOARD_TOPIC_EDIT, BOARD_TOPIC_VIEW, BROWSER, BUGTRACKER, BUY_SUBSCRIPTION_TRIAL, BUY_SUBSCRIPTION_RETRIAL, BUY_SUBSCRIPTION_NOTRIAL, CAPTCHA, CATALOG, CELEBRITY_PROFILE, CELEBRITY_VERIFICATION_FAQ, CLASSIFIED, CLASSIFIEDS_CATALOG, CLASSIFIEDS_CREATE_FORM, CLASSIFIEDS_CREATE_POST, CLASSIFIEDS_ITEM, CLASSIFIEDS_PRODUCTS, CLASSIFIEDS_NATIVE_PRODUCT, CLASSIFIEDS_SUBSCRIPTION, CLIP_BADGES_SUMMARY, CLIP_COMPILATIONS_BOTTOM_SHEET, CLIP_EFFECT_LIST, CLIP_GRID, CLIPS_GRID_MUSIC, CLIPS_GRID_SOUND, CLIPS_GRID_TAG, CLIPS_GRID_CHALLENGE, CLIPS_GRID_EFFECT, CLIPS_GRID_MASK, CLIPS, CLIPS_AUDIO_CROPPER, CLIPS_AUDIO_PICKER, CLIPS_CAMERA_DRAFTS, CLIPS_CAMERA_SETTINGS, CLIPS_CAMERA_TIMER, CLIPS_CAMERA, CLIPS_CHOICE_INTERESTS, CLIPS_COVER_EDITOR, CLIPS_DEEPFAKE_ONBOARDING, CLIPS_DEEPFAKE_TEMPLATES, CLIPS_DISCOVER, CLIPS_EDITOR, CLIPS_EDITOR_FRAGMENTS_SWAP, CLIPS_EDITOR_FULLSCREEN, CLIPS_GRID_COMMON_CLIPS, CLIPS_GRID_DELAYED_PUBLICATION_CLIPS, CLIPS_GRID_DRAFTS, CLIPS_GRID_GROUP_MEMBERS_ALL, CLIPS_GRID_GROUP_MEMBERS_FRIENDS, CLIPS_GRID_LIKED_CLIPS, CLIPS_GRID_LIVES, CLIPS_GRID_OWNER_CLIPS, CLIPS_GRID_PROFILE_FOLLOWERS, CLIPS_GRID_PROFILE_FRIENDS, CLIPS_GRID_PROFILE_SUBSCRIPTIONS, CLIPS_INSTALL_SAA, CLIPS_LIVES, CLIPS_LIVES_SPECTATORS, CLIPS_LIVES_GIFTS, CLIPS_LINK_EDITOR, CLIPS_VOICEOVER_EDITOR, CLIPS_MEDIAPICKER_MEDIA, CLIPS_MEDIAPICKER_DRAFTS, CLIPS_MEDIAPICKER_TEMPLATES, CLIPS_MEDIA_PICKER, CLIPS_NOTIFICATIONS_GROUPED, CLIPS_NOTIFICATIONS, CLIPS_PRIVACY_COMMON_SETTINGS, CLIPS_PRIVACY_FRIENDS_AND_FRIENDS_LISTS_PICKER, CLIPS_PRIVACY_FRIENDS_PICKER, CLIPS_PRIVACY_VALUE_SETTINGS, LIVES_PRIVACY_COMMON_SETTINGS, LIVES_PRIVACY_VALUE_SETTINGS, CLIPS_FRAGMENT_AUDIO_EFFECT_EDITOR, CLIPS_FRAGMENT_COLOR_CORRECTION_EDITOR, CLIPS_FRAGMENT_SPEED_EDITOR, CLIPS_FRAGMENT_VOLUME_EDITOR, CLIPS_PUBLISH, CLIPS_SEARCH, CLIPS_TAB_TRENDS, CLIPS_MONOTOPIC, CLIPS_TEMPLATES_CATALOG, CLIPS_TREND_GRID, CLIPS_TRENDS_CATALOG, CLIPS_TRENDS_VIEWER, CLIPS_TEMPLATES_EDITOR, CLIPS_TEMPLATES_VIEWER, CLIPS_FAVORITES_FOLDERS_PICKER, CLIPS_FAVORITES_FOLDER_RENAMING_DIALOG, CLIPS_FAVORITES_FOLDERS_LIST, CLIPS_FAVORITES_FOLDER_CONTENT_LIST, CLIPS_VIDEO_PICKER, CLIPS_PUBLISH_VIEWER_PREVIEW, CLIPS_PLAYLISTS_LIST, CLIPS_PLAYLIST_BOTTOMSHEET, CLIPS_PLAYLIST_CLIP_PICKER, CLIPS_PLAYLIST_NAMING_DIALOG, CLIPS_COAUTHORS_PICKER, CLIPS_PUBLISHED_CLIP_EDIT_BOTTOM_SHEET, CLIPS_GEOLOCATION_PICKER, CONTACTS, CONTACTS_INVITE, CONTACTS_APPS_ADD_PHONE, CONTACTS_APPS_ADD_EMAIL, CONTACTS_APPS_ADD_ADDRESS, CONTACTS_APPS_EDIT_PHONE, CONTACTS_APPS_EDIT_EMAIL, CONTACTS_APPS_EDIT_ADDRESS, CONTACTS_APPS_PHONE_CATEGORY, CONTACTS_APPS_EMAIL_CATEGORY, CONTACTS_APPS_ADDRESS_CATEGORY, CONTACTS_APPS_ADDRESS_COUNTRY, COMMENTS_LIST_CLIP, COMMUNITY_ADDRESSES, COMMUNITY_CHANNEL, COMMUNITY_MANAGE, COMMUNITY_MEMBERS, COMMUNITY_MESSAGES, COMMUNITY_ADS_PROMOTE, COMMUNITY_EVENTS, COMMUNITY_LIVES_BLOCK, COMMUNITY_PAGE, COMMUNITY_NAME_HISTORY, COMMUNITY_MEDIA, COMMUNITY_VIDEO_TAB, COMMUNITY_LINKS_PAGE, COOWNER_MODAL_CARD, CLICKABLE_THEME_LIST, CONSENT_SCREEN, CREATE_GROUP, CREATE_MONEY_TRANSFER, CREATE_MONEY_REQUEST, CREATE_MONEY_CHAT_REQUEST, CREATE_MONEY_CHAT_REQUEST_UNLIMITED, CITY_SELECT, COMMUNITY_SHOPS, CHAT, DEBUG, DIALOG, DIALOG_MODAL, NOWHERE_DIALOG, DISCOVER, DISCOVER_DIGEST, DISCOVER_DIGEST_DZEN, DISCOVER_FULL, DISCOVER_FULL_TABS, DISCOVER_MEDIA, DISCOVER_MEDIA_PREVIEW, DISCOVER_MEDIA_SIMILAR_NEWS, DISCOVER_POST, DISCOVER_TABS, DISCOVER_THEMED, DISCOVER_THEMED_EXTERNAL, DOCS, DOCS_SEARCH, DOCS_PREVIEW, DOCS_ALL, DOCS_SAVED, DOCS_TEXT, DOCS_ARCHIVES, DOCS_GIFS, DOCS_IMAGES, DOCS_AUDIOS, DOCS_BOOKS, DOCS_VIDEOS, DOCS_OTHERS, DOCS_EBOOKS, DOCS_UPLOAD, DONUT_CONTENT_PAYWALL, DONUT_CONTENT_REPOST, DONUT_CONTENT_WALL, DONUT_CONTENT_LINK, EDU_EDIT_PROFILE, EDU_MY_SCHOOLS_LIST, ENTRY_ASK_CONFIRM, ENTRY_MAP, EMOJI_STATUS_BOTTOM_SHEET, ESIA_TRUSTED_PROFILE, ESIA_FAQ, EVENTS, EVENTS_LIST, FAST_SILENT_AUTH_EXISTING_ACCOUNT, FAST_SILENT_AUTH_AS_USER, FAST_SILENT_AUTH_DOWNLOAD, FAST_SILENT_AUTH_SUCCESS, FAST_SILENT_AUTH_ERROR, FAVE, FAVE_PEOPLE, FAVE_GROUPS, FAVE_POSTS, FAVE_ARTICLES, FAVE_LINKS, FAVE_PODCASTS, FAVE_TAGS, FAVE_TAGS_CUSTOMIZE, FAVE_VIDEO, FAVE_NARRATIVES, FAVE_PRODUCTS, FAVE_YOULA_PRODUCTS, FAVE_GAMES, FAVE_MINI_APPS, FEED, FEED_CLASSIFIED_UPDATE, FEED_COMMENT, FEED_COMMENTS, FEED_CUSTOM, FEED_EXTERNAL, FEED_FRIENDS, FEED_GROUPS, FEED_LIKES, FEED_LIKES_ALL, FEED_LIKES_PHOTO, FEED_LIKES_POSTS, FEED_LIKES_COMMENTS, FEED_LIKES_CLIPS, FEED_LIKES_VIDEO, FEED_LIKES_GOODS, FEED_LIVES, FEED_LIVES_TAB, FEED_LIVES_POPULAR, FEED_LIVES_MOBILE, FEED_LIVES_GAMES, FEED_LIVES_CITY, FEED_LIVES_SPORT, FEED_LIVES_NEWS, FEED_LIVES_MUSIC, FEED_LIVES_HOBBY, FEED_LIVES_UNKNOWN, FEED_PHOTOS, FEED_PLACE, FEED_POST, FEED_PROMOTED, FEED_RECOMMENDED, FEED_THEMED_CATEGORY_TAB, FEED_TOP, FEED_RECENT, FEED_SETTINGS, FEED_POST_SIMILAR_NEWS, FEED_SOURCE_DISABLED, FEED_SOURCE_NOTIFICATIONS, FEED_VIDEOS, FEED_SUBSCRIPTIONS, FEED_SUGGESTED_POSTS, FEED_POSTPONED_POSTS, FEED_VIDEO_RECOMMENDATIONS, FEED_FRIENDS_IMPORT_ADD, FEED_FRIENDS_IMPORT_INVITE, FEED_COMMENT_MODAL, FEED_COMMENTS_MODAL, FEED_REACTIONS_MODAL, FRIENDS_MEMBERS_LIST, POST_REACTIONS_LIKE, POST_REACTIONS_DONUT, POST_REACTIONS_SHARE, FEED_SHARES_MODAL, FEEDBACK, FEEDBACK_WITHOUT_VIEWERS, FILE_PICKER, FRIENDS, FRIENDS_ALL, FRIENDS_BIRTHDAYS, FRIENDS_ONLINE, FRIENDS_MAIN_RECOMMENDED_BLOCK, FRIENDS_MUTUAL, FRIENDS_GAME_INVITE, FRIENDS_IMPORT, FRIENDS_IMPORT_ADDRESS_BOOK, FRIENDS_IMPORT_FACEBOOK, FRIENDS_IMPORT_GOOGLE, FRIENDS_IMPORT_OK, FRIENDS_IMPORT_TWITTER, FRIENDS_IN_GROUP, FRIENDS_NEARBY, FRIENDS_PRIVACY, FRIENDS_REQUESTS, FRIENDS_REQUESTS_ALL, FRIENDS_REQUESTS_SWIPE, FRIENDS_SEARCH, FRIENDS_SERVICE_SEARCH, FRIENDS_SELECTION, FRIENDS_CLEANUP, GIFTS_CATALOG, GIFTS_CATALOG_CATEGORY, GIFTS_PROFILE_CATALOG, GIFT_FRIENDS_SEND, GIFT_SEND, GATEWAYS, GROUP, GROUP_WALL, GROUP_CHATS, GROUP_MEMBERS_LIST, GROUP_FRIENDS_INVITE, GROUP_DONATORS_LIST, GROUP_DONATORS_FRIENDS_LIST, GAME, GAMES, GAMES_MY, GAMES_NEW, GAMES_ACHIEVEMENTS, GAMES_CATEGORY, GAMES_RECOMMENDED, GAMES_FRIENDS_ACTIVITY, GAMES_NOTIFICATIONS, GROUPS_COLLECTION_LIST, GROUPS_LIST, GROUPS_LIST_SEARCH, FRIEND_GROUPS_LIST_SEARCH, GROUPS_MANAGE_ADS, GROUPS_MANAGED_LIST, GROUPS_INVITATIONS, GROUPS_RECOMMENDED, GAMES_LEADERBOARD, GROUPS_SUGGESTED_LIST, GRID_AUTHOR_PICKER, HELP, IM_CONVERSATION_FRIENDS_ADD, IM_CONVERSATION_CREATE_FRIENDS_ADD, IM_CONVERSATION_DETAIL, IM_FRIENDS_SEND, IM, IM_GROUP, IM_CUSTOM_LIST, IM_CHAT, IM_GROUP_CHAT, IM_CHAT_CREATE, IM_CHAT_CREATE_MANAGE, IM_CHAT_MANAGE, IM_CHAT_MANAGE_OPTIONS, IM_CHAT_SETTINGS, IM_CHAT_INVITE_LINK, IM_CHAT_SEARCH, IM_CHAT_ATTACHMENTS, IM_CHAT_MEMBERS_ALL, IM_CHAT_MEMBERS_ONLINE, IM_CHAT_CREATE_CONTACTS_LIST, IM_CHAT_POP_UP, IM_CHAT_SCREENSHOT_SHARING, IM_CHAT_EMPTY, IM_CHANNEL, IM_CHANNEL_COMMENTS, IM_CHANNELS_LIST, IM_CHANNEL_PROFILE, IM_CHANNEL_SETTINGS, IM_PINNED_MESSAGE, IM_NESTED_MESSAGE, IM_ATTACHES_TYPES, IM_ATTACHES_PHOTO, IM_ATTACHES_VIDEO, IM_ATTACHES_AUDIO, IM_ATTACHES_DOCS, IM_ATTACHES_LINKS, IM_ATTACHES_LOCATION, IM_ATTACHES_MONEY, IM_ARCHIVE, IM_FOLDERS, IM_FOLDER_SETTINGS, IM_UNREAD, IM_BUSINESS_NOTIFY, IM_INVITING_TO_CHAT, IM_REQUEST, IM_REQUESTS, IM_SEARCH_CHATS, IM_SEARCH_MESSAGES, IM_SEARCH_CHANNELS, IM_SETTINGS_FAST_REACTION, IM_SETTINGS_MAIN, IM_SETTINGS_ONLINE, IM_SETTINGS_REACTIONS, IM_SETTINGS_TEXTSIZE, IM_SETTINGS_WALLPAPER, IM_SHARED_CHATS, IM_INVITE_BY_LINK_DIALOG, IM_COMMUNITY_LIST, IM_BUSINESS_LIST, IM_BUSINESS_CHATS, IM_PERSONAL_LIST, INTRO_RECOMMENDED_PAGES, LIKES_FRIENDS_COMMENT, LIKES_FRIENDS_MARKET, LIKES_FRIENDS_NOTE, LIKES_FRIENDS_PHOTO, LIKES_FRIENDS_POST_ADS, LIKES_FRIENDS_TOPIC, LIKES_FRIENDS_VIDEO, LIKES_LIST_COMMENT, LIKES_LIST_MARKET, LIKES_LIST_NOTE, LIKES_LIST_PHOTO, LIKES_LIST_POST_ADS, LIKES_LIST_TOPIC, LIKES_LIST_VIDEO, LIKES_COPIES_COMMENT, LIKES_COPIES_MARKET, LIKES_COPIES_NOTE, LIKES_COPIES_PHOTO, LIKES_COPIES_POST_ADS, LIKES_COPIES_TOPIC, LIKES_COPIES_VIDEO, LIVE_CAROUSEL, LIVE_STREAMING, LIVE_ATTACH_ACTION_LINK_LIST, LIVE_ATTACH_ACTION_LINK_SELECTION_MENU, LOCATION, LINK, MARKET, MARKETPLACE, MARKETPLACE_DISCOVER_FULL, MARKETPLACE_DISCOVER_TAB, MARKETPLACE_MAIN, MARKETPLACE_SEARCH, MARKETPLACE_SECTION, MARKETPLACE_CATEGORIES, MARKETPLACE_MY_ORDERS, MARKETPLACE_PROFILE, MARKET_ATTACHED_ITEMS, MARKET_ATTACHED_ITEMS_EDIT, MARKET_ITEM, MARKET_ITEM_ALBUM, MARKET_ITEM_SIMILAR, MARKET_ITEM_LINKED_CONTENT, MARKET_ITEMS_MODAL, MARKET_ITEMS_MULTIPICKER, MARKET_FILTER_PRICE, MARKET_ALBUMS, MARKET_CART, MARKET_CARTS_LIST, MARKET_CHECKOUT, MARKET_FEEDBACK, MARKET_ORDER, MARKET_ORDERS, MARKET_SEARCH, MARKET_SEARCH_ADDRESS, MARKET_SELECT_ADDRESS, MARKET_DELIVERY_POINT, MARKET_DELIVERY_POINTS, MARKET_SERVICE, MARKET_SHOP_CONDITIONS, SERVICE_CARD, SERVICE_SECTION, SERVICE_ALBUM, SERVICE_ALBUMS, MESSAGE_TOOLTIP, MONEY_BROWSER, MONEY_SEND_BROWSER, MONEY_FRIENDS_SEND, MONEY_FRIENDS_REQUEST, MONEY_TRANSFERS_LINK, MENU, MEMORIES, MODERN_PHOTO_ALBUM, MODERN_PHOTO_ALBUMS_CATALOG, MODERN_PHOTO_UPLOAD, MUSIC_KIDS_ALBUM, MUSIC_KIDS_ARTIST, MUSIC_KIDS_AUDIO_BOOK, MUSIC_KIDS_DYNAMIC_PLAYLIST, MUSIC_KIDS_PLAYLIST, MUSIC_KIDS_PODCAST_EPISODE_LIST, MUSIC_KIDS_PODCAST_LIST, MUSIC_KIDS_PODCAST_EPISODE, MUSIC_KIDS_PODCAST_PAGE, MUSIC_KIDS_PODCAST_PAGE_ALL, MUSIC_SUBSCRIPTION, MUSIC_SUBSCRIPTION_MANAGEMENT, MUSIC_PLAYER_TRACK_LIST, MUSIC_PLAYER_AUTOPLAY, MUSIC_PLAYER_LYRICS, MUSIC_PLAYER_CONTROLS, MUSIC_PLAYER_CATALOG, MUSIC_PLAYLIST, MUSIC_PLAYLIST_EDIT, MUSIC_PLAYLIST_ADD_TRACK, MUSIC_PLAYLIST_FULL, MUSIC_ARTIST, AUDIO_ARTIST_CONCERT_FULL_PAGE, MUSIC_RECOMMENDED, MUSIC_RECOMMENDED_CATEGORY, MUSIC_MY, MUSIC_OWNER, MUSIC_SHOW_ALL, MUSIC_SUBSCRIPTION_TERMS, MUSIC_OFFLINE_MY_MUSIC, MUSIC_OFFLINE_LIBRARY, MUSIC_OFFLINE_LIBRARY_PLAYLISTS, MUSIC_SNIPPETS_LIST, MUSIC_LOCATION, MUSIC_RECOMMENDATIONS_ONBOARDING, MONEY_TRANSFERS, MONEY_DEBTORS, MONEY_TRANSFERS_WITH_PEER, MINI_APP, MINI_APP_INTERNAL, MINI_APP_ABOUT, MINI_APP_MENU, MINI_APP_UNVERIFIED_LAUNCH, MINI_APPS_CATALOG, MY_CLIPS, NARRATIVES_LIST, NARRATIVE_EDIT, NARRATIVE_SELECTION, NARRATIVE_COVER_SELECTION, NARRATIVES_FEED_BLOCK, NOTIFICATIONS, NOTIFICATIONS_GROUPED, NOTIFICATIONS_COMMENTS, NOTIFICATIONS_SETTINGS, NOWHERE, OFFLINE, ONBOARDING_RECOM_THEMES, REGISTRATIONS_RECOM_THEMES, ONLINE_BOOKING_LAUNCH, ONLINE_BOOKING_MENU, ONLINE_BOOKING_SERVICES_CATALOG, ONLINE_BOOKING_SPECIALISTS, ONLINE_BOOKING_DATE_TIME, ONLINE_BOOKING_CREATE, ONLINE_BOOKING_FINAL, ONLINE_BOOKING_RECORDS_LIST, OTHER, OWNER_PROFILE, OZON_REVIEWS_LIST, SHOPS_FEED_CLIPS, SHOPS_FEED_POSTS, PASSPORT_RESTORE, POST_LIKES_FRIENDS, PHOTO_ALBUM_CREATE, PHOTO_ARCHIVE, PHOTO_SETTINGS, PHOTO_BROWSER, PHOTO_CATALOG, PHOTO_ALBUMS_LIST, PHOTO_EDIT_ALBUM, PHOTO_VIDEO_PICKER, PHOTO_PICKER, PHOTO_EDITOR, PHOTO_NEW_TAGS, PHOTO_TAG_POPUP, PLAYER, PODCAST_EPISODE_LIST, PODCAST_LIST, PODCAST_EPISODE, PODCAST_PAGE, PODCAST_PAGE_ALL, POLL, POSTING, POSTING_1, POSTING_2, POSTING_ACTION_BUTTON_SELECTION, POSTING_ATTACH, POSTING_ATTACH_PHOTO, POSTING_ATTACH_PHOTO_PROFILE, POSTING_ATTACH_PHOTO_COMMUNITY, POSTING_ATTACH_MUSIC, POSTING_ATTACH_VIDEO, POSTING_ATTACH_VIDEO_PROFILE, POSTING_ATTACH_VIDEO_COMMUNITY, POSTING_ATTACH_DOCUMENT, POSTING_ATTACH_PLACE, POSTING_ATTACH_PLAYLIST, POSTING_ATTACH_POLL, POSTING_ATTACH_PRODUCT, POSTING_ATTACH_PRODUCT_PHOTO, POSTING_ATTACH_GOOD, POSTING_ATTACH_ARTICLE, POSTING_ATTACH_ARTICLE_PROFILE, POSTING_ATTACH_ARTICLE_COMMUNITY, POSTING_ATTACH_ALBUM, POSTING_ATTACH_ALBUM_PROFILE, POSTING_ATTACH_ALBUM_COMMUNITY, POSTING_SETTINGS, POSTING_CREATE_CUSTOM_POSTER, POSTING_CLOSE_FRIENDS_SELECTOR, POSTING_CROP_EDITOR, DRAFTS_FEED, DRAFTS_LIST, POST_LIKES_LIST, POST_COPIES_LIST, POST_ATTACHED_MARKET_ITEMS, PRODUCTS_MIX, PROFILE, PROFILE_SIDE_MENU, PROFILE_EDIT, PROFILE_FOLLOWERS, PROFILE_ALL_FOLLOWERS, PROFILE_ALL_FOLLOWERS_SEARCH, PROFILE_NEW_FOLLOWERS, PROFILE_MY, PROFILE_SUBSCRIPTIONS, PROFILE_INFORMATION, PROFILE_USER_FRIENDS, PROFILE_PHOTO, PROFILE_ALBUM, PROFILE_VIDEO_TAB, PRIVACY_SELECT_FRIENDS_IN_LIST, PRIVACY_SELECT_FRIENDS_LIST, QR_PROFILE, QR_SCANNER, QR_PROMO, QR_CODE_ASK_CONFIRM, QR_CODE_MAP, ALERT_QR_CODE_IRRELEVANT, ALERT_AUTH_UNKNOWN_ERROR, ALERT_AUTH_NETWORK_ERROR, ALERT_AUTH_FLOOD_CONTROL_ERROR, REGISTRATION_PHONE, REGISTRATION_CONNECT_GMAIL, REGISTRATION_PHONE_VERIFY, REGISTRATION_PHONE_VERIFY_LIB, REGISTRATION_NAME, REGISTRATION_NAME_ADD, REGISTRATION_INFO_ABOUT_YOURSELF, REGISTRATION_INFO_ABOUT_YOURSELF_ADD, REGISTRATION_EXISTENT_ACCOUNT, REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD, REGISTRATION_BDAY, REGISTRATION_BDAY_ADD, REGISTRATION_PASSWORD, REGISTRATION_PASSWORD_ADD, REGISTRATION_IMPORT_CONTACTS, REGISTRATION_CONNECT_FACEBOOK, REGISTRATION_CONNECT_OK, REGISTRATION_CONNECT_TWITTER, REGISTRATION_PHOTO, REGISTRATION_CHOOSE_PHOTO, REGISTRATION_TAKE_PHOTO, REGISTRATION_STYLE_PHOTO, REGISTRATION_CROP_PHOTO, REGISTRATION_LIST_ADDRESS_BOOK, REGISTRATION_LIST_FRIENDS_FACEBOOK, REGISTRATION_LIST_FRIENDS_OK, REGISTRATION_LIST_FRIENDS_TWITTER, REGISTRATION_LIST_CONTACTS_GMAIL, REGISTRATION_PUSH, REGISTRATION_GEO, REGISTRATION_PUSH_REQUEST, REGISTRATION_SUBJECTS, REGISTRATION_EMAIL_VERIFY, REGISTRATION_EMAIL_PASSWORD, REGISTRATION_EMAIL, REGISTRATION_EMAIL_EXPLANATION, REGISTRATION_NOTIFICATIONS, REGISTRATION_USECASE, REGISTRATION_IS_FIRST_ACCOUNT, ONBOARDING_USECASE, REVIEW_LIST, COMMUNITY_REVIEW_CREATE, COMMUNITY_REVIEW_DETAIL, SERVICE_RATING, LK_PASSWORD, RESTORE_ACCOUNT, HAVE_ACCOUNT_QUESTION, HAVE_ACCOUNT_CREDENTIALS, HAVE_ACCOUNT_SUPPORT, CONTACTING_SUPPORT, VERIFICATION_ASK_NUMBER, VERIFICATION_ENTER_NUMBER, VERIFICATION_PHONE_VERIFY, VERIFICATION_BUSY_NUMBER, ACCOUNT_CONFIRM_PASSWORD, ACCOUNT_CONFIRM_VERIFY, VK_MAIL_CREATE, VOICE_ASSISTANT_GRADIENT_POP_UP, SYSTEM_VOICE_ASSISTANT, PHONE_2FA_VERIFY, PHONE_2FA_VERIFY_SMS, PHONE_2FA_VERIFY_APP, PHONE_2FA_VERIFY_CALL, PHONE_2FA_VERIFY_LIB, PARTIAL_EXPAND_ENTER_PASSWORD, PARTIAL_EXPAND_HAVE_ACCOUNT, PARTIAL_SILENT_EXPAND_PASSWORD, PROFILE_VIDEO_MY_ADDED, PROFILE_VIDEO_MY_PLAYLISTS, PROFILE_VIDEO_MY_LIVES, PROFILE_VIDEO_MY_UPLOADED, OAUTH_EXISTING_ACCOUNT, OAUTH_REGISTRATION_PHONE, OAUTH_MAIL, OAUTH_OK, OAUTH_SBER, OAUTH_ESIA, OAUTH_APPLE, STORY_FRIENDS_SEND, STORY_VIDEO_CHOOSE_PREVIEW, SEARCH, SEARCH_ALL, SEARCH_AUTHORS, SEARCH_GAMES, GLOBAL_SEARCH_GAMES_RECOMMENDATIONS, GLOBAL_SEARCH_GAMES, GLOBAL_SEARCH_GAMES_RECENT, APPS_GAMES_CATALOG_RECENT, APPS_GAMES_CATALOG_SEARCH, SEARCH_GROUPS, SEARCH_CHANNELS, SEARCH_MINI_APPS, SEARCH_MUSIC, SEARCH_MUSIC_SERVICE, SEARCH_NEWS, SEARCH_NEWS_PROFILE, SEARCH_NEWS_COMMUNITY, SEARCH_OWNER_VIDEOS, SEARCH_PEOPLE_REC, SEARCH_PEOPLE, SEARCH_VIDEO, SEARCH_CLASSIFIEDS, SEARCH_MARKET, SEARCH_CLIPS, SEARCH_CLIPS_SERVICE, SEARCH_MAP, FRIEND_FRIENDS_SEARCH, SERVICE_TRUSTED_PROFILE, SERVICE_VERIFICATION_FAQ, SETTINGS, SETTINGS_ACCOUNT, SETTINGS_ACCOUNT_PHONE, SETTINGS_ACCOUNT_EMAIL, SETTINGS_ACCOUNT_SHORT_NAME, SETTINGS_ACCOUNT_WALL_MODE, SETTINGS_ACCOUNT_COMMUNITY_COMMENTING, SETTINGS_ACCOUNT_COMMENT_ORDER, SETTINGS_ACCOUNT_MINI_APPS_CARD, SETTINGS_ACCOUNT_SHOW_CONTACTS_NAMES, SETTINGS_ACCOUNT_IM_UNREAD_COUNTER, SETTINGS_APPEARANCE, SETTINGS_APPEARANCE_THEME_TIMETABLE, SETTINGS_BALANCE, SETTINGS_BLACKLIST, SETTINGS_CALLER_ID, SETTINGS_CALLER_ID_ONBOARDING, SETTINGS_GENERAL, SETTINGS_GENERAL_AUDIO_DOWNLOAD, SETTINGS_GENERAL_VIDEO_DOWNLOAD, SETTINGS_GENERAL_VIDEO_QUALITY, SETTINGS_GENERAL_MEDIA_AUTOPLAY, SETTINGS_GENERAL_STICKERS, SETTINGS_GENERAL_STICKERS_POPUP, SETTINGS_GENERAL_CALLS, SETTINGS_GENERAL_MUSIC, SETTINGS_PRIVACY, SETTINGS_CONTACTS_FOR_APPS, SETTINGS_NOTIFICATIONS, SETTINGS_NOTIFICATIONS_DO_NOT_DISTURB, SETTINGS_NOTIFICATIONS_COMMUNITY_NOTIFICATIONS, SETTINGS_NOTIFICATIONS_COMMUNITY_PICKER, SETTINGS_NOTIFICATIONS_COMMUNITY_DETAILED, SETTINGS_NOTIFICATIONS_SECTIONS_GROUP, SETTINGS_NOTIFICATIONS_SEARCH, SETTINGS_NOTIFICATIONS_SECTION, SETTINGS_NOTIFICATIONS_ADDITIONAL, SETTINGS_NOTIFICATIONS_SUBSCRIPTION_TO_STORIES, SETTINGS_SECURITY, SETTINGS_SUBSCRIPTIONS, SETTINGS_FILTER_NEWSFEED, SETTINGS_PRIVACY_ALBUM, SETTINGS_PRIVACY_VIDEO, SETTINGS_PRIVACY_VIDEO_COMMENTS, SETTINGS_PRIVACY_PHOTO, SETTINGS_PRIVACY_PHOTO_COMMENTS, SETTINGS_PRIVACY_STORY, SETTINGS_TAMAGOTCHI, SHARE, SHORT_VIDEO, START, START_PROCEED_AS, AUTH_START_WITH_PHONE, STICKER_PACK_DETAILED, STICKER_STYLE_SELECTOR, STICKERS, STICKERS_RANDOM, STICKERS_RANDOM_AVAILABLE, STICKERS_RANDOM_SUCCESS, STICKERS_CATALOG_SEARCH, STICKER_OVERLAY, STICKER_OVERLAY_WORDS, STICKER_OVERLAY_SIMILAR, STICKER_PACK_RECOMENDATIONS_ALL, STICKERS_BONUS_ADDITION_RESULT, STICKERS_BONUS_DISABLE, STICKERS_BONUS_REWARDS_CATALOG, STICKERS_BONUS_HISTORY, STICKERS_BONUS_REWARDS_ACTIVE, STICKERS_BONUS_REWARDS_INACTIVE, STICKERS_BONUS_REWARD_TERMS, VMOJI_CAMERA, VMOJI_CHARACTER, VMOJI_RECOMMENDATIONS, VMOJI_PRODUCTS, STORIES_INTERESTING_BLOCK, STORIES_FEED_BLOCK, STORY, STORY_ARCHIVE, STORY_CAMERA, STORY_CAMERA_QR, STORY_CAMERA_LIVE, STORY_CAMERA_PHOTO, STORY_CAMERA_STORY, STORY_CAMERA_VIDEO, STORY_CAMERA_PINGPONG, STORY_CAMERA_CLIPS, STORY_EDITOR, STORY_FEEDBACK, STORY_REPLIES_LIST, STORY_REPLY, STORY_SOURCE_DISABLED, STORY_BIRTHDAY_BANNED, STORY_VIEWER, STORY_SETTINGS, STORY_SETTINGS_COMMUNITY, STORY_TEMPLATES, SUGGEST_VK_ID_VALUE, SILENT_AUTH, SILENT_AUTH_EXISTING_ACCOUNT, SILENT_AUTH_PROVIDED_PHONE, SILENT_AUTH_MIGRATION, SILENT_AUTH_EMAIL, SITUATIONAL_SUGGEST_SEARCH, SUBSCRIPTION_SUSPEND, GROUP_DONUT_SUCCESS, SUPPORT, SUPER_APP, SUPER_APP_SETTINGS, SUPER_APP_BIRTHDAY_PRESENT, SUPER_APP_BURGER_MENU, SHOPPING_CENTER, SETTINGS_CHANGE_PASSWORD, SYSTEM_NOTIFICATIONS_SETTINGS, SYSTEM_VOICE_SEARCH, SPRINGBOARD, TEXTLIVE, TEXTLIVE_COMMUNITY_LIST, VERIFICATION_AUTHENTICATOR_CODE, VKUI_FRIENDS_PICKER, VIDEO_ABOUT, VIDEO_CATALOG, SEARCH_VIDEO_SERVICE, VIDEO_EMBED, COMMENTS_LIST_VIDEO, VIDEO_LIVE, META_GROUP, VIDEO_GROUP, VIDEO_GROUP_ALL, VIDEO_MY_CATALOG, VIDEO_EDIT_VIDEO, VIDEO_EDIT_VIDEO_ALBUM, VIDEO_CREATE_VIDEO_ALBUM, VIDEO_USER, VIDEO_SETTINGS_USER_ADDITIONAL, VIDEO_PICKER, VIDEO_CAROUSEL, VIDEO_VKVLIVE_DISCOVER, VIDEO_YOUTUBE, VIDEO_SINGLE_VIDEO, VIDEO_SINGLE_INTERACTIVE_VIDEO, VIDEO_ACTIONS_DIALOG, VIDEO_DOWNLOADS, VIDEO_CHOOSE_ALBUM, VIDEO_SHOPPABLE_AD, VIDEO_PROFILE, VIDEO_POPULAR_WEEK, VIDEO_DISCOVERY, VIDEO_ALL_AUTHORS, VIDEO_AD_PUSHES, VIDEO_SEARCH, VIDEO_FOR_YOU, VIDEO_SUBSCRIPTIONS, VIDEO_KIDS_MODE_ONBOARDING, VIDEO_PLAYLIST, VIDEO_UPLOAD, VIDEO_SMART_CROP, VIDEO_MOVIE_PAGE, VK_CONNECT_ACCOUNT, VK_CONNECT_AGREEMENT, VK_PAY, VK_PAY_CHECKOUT, VK_VIDEO, CALLS, VOIP_CALL, VOIP_ACTIVE_CALL, VOIP_CALL_INVITE, VOIP_CALL_INVITE_ANONYMOUS, VOIP_CALL_LIST, VOIP_CALL_FRIENDS, VOIP_CALL_CREATE_BY_LINK, VOIP_CALL_LANDING_PAGE, VOIP_CALL_USER_PROMO, VOIP_CALL_PREFERENCES, VOIP_CALL_RECORDINGS, VOIP_CALL_SCHEDULE_SETTINGS, VOIP_CALL_SCHEDULE_SUCCESS, VOIP_SCHEDULED_CALLS, VOIP_PAST_ASR_LIST, VOIP_CALL_STEREO_ROOM, VOIP_CALL_STEREO_ROOM_CREATE, VOIP_CALL_STEREO_ROOM_JOIN, VOIP_CALL_STEREO_ROOM_LIST, VOIP_CALL_STEREO_ROOM_INFO, VOIP_CALL_STEREO_SELECT_SPEAKERS, VOIP_CALL_HISTORY_LIST, WIKI, USER_VALIDATION, USER_STATISTICS, USER_EXPERT_CARD, UNSURE_MEMBERS_IN_GROUP, UNBLOCK_PROTECT_ACCOUNT, WISHLIST, VKRUN_LEADERBOARD, VKRUN_TARGET_SETTINGS, VKRUN_ONBOARDING, VKC_ACCOUNT_LINK_LOADING, VKC_ACCOUNT_NOT_FOUND, VKC_ACCOUNT_FOUND, VKC_ACCOUNT_ALREADY_LINKED, VKC_ACCOUNT_LINK_TOKEN_ERROR, VKC_ACCOUNT_LINK_PASSWORD, VKC_ACCOINT_MANY_CHOICES, VKC_DATA_PERMISSION, AUTH_PASSWORD, AUTH_START_LOADING, VKID_USER_CONFIRMATION, EXTERNAL_PERMISSIONS, QUESTION_MY, QUESTION_ASK, GAMES_UNAVAILABLE_PAGE, COMMUNITY_ONBOARDING, GAMES_CATALOG, APPS_GAMES_CATEGORIES, VERIFICATION_CALL_CODE, CONSENT_SCREEN_AGREEMENT, VKLINK_BROWSER, AUTH_QR_CODE, QR_CODE_CONFIRM_WAITING, PROCEED_AS_WITH_SUBPROFILE, UXPOLL_MODAL, TV_OWNER_VIDEO_LIST, TV_DEVICE_INFO, TV_EXIT, TV_PLAYER, TV_CLIPS_PLAYER, TV_PLAYER_QUALITY_SELECT, TV_LOGIN, 
        TV_LOGOUT, TV_VIDEO_CATALOG, TV_SEARCH_INPUT, TV_SEARCH_RESULTS, TV_AGREEMENT, TV_NOT_EXIST_INTERNET, TV_NEW_OWNER_VIDEO_LIST, TV_NEW_SEARCH_INPUT, TV_INTERESTS_ONBOARD, TV_NOWHERE, TV_QR_CODE_AUTH, TV_LOGOUT_CONFIRM, TV_SPORTS, TV_FILMS, TV_FOLLOWING, TV_LIBRARY, TV_HISTORY, TV_ADDED_VIDEOS, TV_UPLOADED_VIDEOS, TV_OWNER_LIVE_STREAMS, TV_OWNER_CALL_RECORDINGS, TV_OWNER_LIKED_VIDEOS, TV_OWNER_BOOKMARKS, TV_OWNER_PLAYLISTS, TV_VIDEO_PLAYLIST, TV_ESPORTS_GAMES, TV_LIVE_STREAMS, TV_SERIES, TV_SHOWS, TV_KIDS, TV_TERMS_AND_CONDITIONS, TV_PLAYER_AUTHOR_INFORMATION, TV_VIDEO_INFORMATION, TV_AUTOR_PAGE, TV_ZERO_SCREEN, TV_BROKEN, TV_NO_INTERNET, TV_MENU, TV_SPECIAL_OLYMPICS, TV_CHANNELS, TV_POLITICS, TV_POPULAR_TRENDS, TV_VIDEO_MOVIE_PAGE, COMMUNITY_BIZ_CHECKLIST, COMMUNITY_INVITE_FRIENDS_BIZ, FRIENDS_FOLLOWING_LINK_INVITE, MARKET_ITEM_REVIEW_LIST, MARKET_ITEM_REVIEW_CREATE, MARKET_ITEM_REVIEW_POPUP, MARKET_ITEM_PREVIEW_RECOMMENDS, MARKET_REVIEWS_SECTION, UGC_STICKERS_PACK_BANNED, MARKET_ITEM_COMMENTS, BIOMETRICS_LOCK_ONBOARDING, BIOMETRICS_LOCK_PIN, BIOMETRICS_LOCK_SETTINGS, BIOMETRICS_LOCK_SETUP, TABBAR_SETTINGS_ONBOARDING, TABBAR_SETTINGS, TV_PROFILES, TV_KID_MODE_ONBOARDING, TV_CREATE_CHILD_PROFILE, VIDEO_SUBSCRIPTIONS_SELECT_CREATORS, POSTING_PHOTO_EDITOR, TV_APP_UPDATE, TV_SETTINGS_APP_UPDATE, TV_SETTINGS_APP_UPDATE_AVAILABLE, TV_APP_UPDATE_SOFT, TV_APP_UPDATE_HARD, TV_SETTINGS_CAST_CODE, MUSICIAN_CARD, COMMUNITY_TRUST_MARKS, VIDEO_AI_ASSISTANT_CHAT, VIDEO_AI_ASSISTANT_PLAYLIST, VIDEO_AI_ASSISTANT_HISTORY, VIDEO_GROUP_MAIN};
    }

    public static zrp<MobileOfficialAppsCoreNavStat$EventScreen> i() {
        return $ENTRIES;
    }

    public static MobileOfficialAppsCoreNavStat$EventScreen valueOf(String str) {
        return (MobileOfficialAppsCoreNavStat$EventScreen) Enum.valueOf(MobileOfficialAppsCoreNavStat$EventScreen.class, str);
    }

    public static MobileOfficialAppsCoreNavStat$EventScreen[] values() {
        return (MobileOfficialAppsCoreNavStat$EventScreen[]) $VALUES.clone();
    }
}
