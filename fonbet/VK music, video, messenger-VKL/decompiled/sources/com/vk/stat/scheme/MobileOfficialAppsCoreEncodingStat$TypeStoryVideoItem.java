package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.au20;
import xsna.b9y;
import xsna.bu20;
import xsna.dq;
import xsna.epx;
import xsna.fai;
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

/* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem implements SchemeStat$EventBenchmarkMain.b {
    public final transient String a;

    @pmi0("batch_upload")
    private final MobileOfficialAppsConStoriesStat$BatchUpload batchUpload;

    @pmi0("content_id")
    private final Long contentId;

    @pmi0("content_subtype")
    private final ContentSubtype contentSubtype;

    @pmi0("content_type")
    private final ContentType contentType;

    @pmi0("device_info")
    private final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem deviceInfo;

    @pmi0("error_type")
    private final ErrorType errorType;

    @pmi0("event_times")
    private final List<MobileOfficialAppsCoreEncodingStat$EventTimeItem> eventTimes;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("event_type_android")
    private final EventTypeAndroid eventTypeAndroid;

    @pmi0("event_type_ios")
    private final EventTypeIos eventTypeIos;

    @pmi0("error_description")
    private final FilteredString filteredErrorDescription;

    @pmi0("fps")
    private final Integer fps;

    @pmi0("height")
    private final Integer height;

    @pmi0("is_cold_start_viewer")
    private final Boolean isColdStartViewer;

    @pmi0("is_preview_instance")
    private final Boolean isPreviewInstance;

    @pmi0("is_restored_story")
    private final Boolean isRestoredStory;

    @pmi0("is_show_image_preview")
    private final Boolean isShowImagePreview;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("photo_info")
    private final MobileOfficialAppsConStoriesStat$PhotoInfo photoInfo;

    @pmi0("preload_story_info")
    private final MobileOfficialAppsConStoriesStat$PreloadStoryInfo preloadStoryInfo;

    @pmi0("seen_info")
    private final MobileOfficialAppsConStoriesStat$VideoSeenItem seenInfo;

    @pmi0("seen_media_info")
    private final MobileOfficialAppsConStoriesStat$SeenMediaInfo seenMediaInfo;

    @pmi0("size_minimized")
    private final Integer sizeMinimized;

    @pmi0("story_type_open")
    private final MobileOfficialAppsConStoriesStat$StoryTypeOpen storyTypeOpen;

    @pmi0("type_next_story")
    private final TypeNextStory typeNextStory;

    @pmi0("uploading_id")
    private final Integer uploadingId;

    @pmi0("used_encoders")
    private final List<MobileOfficialAppsCoreEncodingStat$EncoderTypeItem> usedEncoders;

    @pmi0("video_info")
    private final MobileOfficialAppsConStoriesStat$VideoInfo videoInfo;

    @pmi0("view_entry_point")
    private final MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class ContentSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentSubtype[] $VALUES;

        @pmi0("photo")
        public static final ContentSubtype PHOTO;

        @pmi0("video")
        public static final ContentSubtype VIDEO;

        static {
            ContentSubtype contentSubtype = new ContentSubtype(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = contentSubtype;
            ContentSubtype contentSubtype2 = new ContentSubtype("PHOTO", 1);
            PHOTO = contentSubtype2;
            ContentSubtype[] contentSubtypeArr = {contentSubtype, contentSubtype2};
            $VALUES = contentSubtypeArr;
            $ENTRIES = new asp(contentSubtypeArr);
        }

        private ContentSubtype(String str, int i) {
        }

        public static ContentSubtype valueOf(String str) {
            return (ContentSubtype) Enum.valueOf(ContentSubtype.class, str);
        }

        public static ContentSubtype[] values() {
            return (ContentSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @pmi0("clip")
        public static final ContentType CLIP;

        @pmi0("story")
        public static final ContentType STORY;

        @pmi0("video_attach")
        public static final ContentType VIDEO_ATTACH;

        static {
            ContentType contentType = new ContentType("STORY", 0);
            STORY = contentType;
            ContentType contentType2 = new ContentType("VIDEO_ATTACH", 1);
            VIDEO_ATTACH = contentType2;
            ContentType contentType3 = new ContentType("CLIP", 2);
            CLIP = contentType3;
            ContentType[] contentTypeArr = {contentType, contentType2, contentType3};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        private ContentType(String str, int i) {
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class ErrorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @pmi0("download")
        public static final ErrorType DOWNLOAD;

        @pmi0("encode")
        public static final ErrorType ENCODE;

        @pmi0("upload")
        public static final ErrorType UPLOAD;

        @pmi0("verticalization")
        public static final ErrorType VERTICALIZATION;

        static {
            ErrorType errorType = new ErrorType("UPLOAD", 0);
            UPLOAD = errorType;
            ErrorType errorType2 = new ErrorType("DOWNLOAD", 1);
            DOWNLOAD = errorType2;
            ErrorType errorType3 = new ErrorType("ENCODE", 2);
            ENCODE = errorType3;
            ErrorType errorType4 = new ErrorType("VERTICALIZATION", 3);
            VERTICALIZATION = errorType4;
            ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4};
            $VALUES = errorTypeArr;
            $ENTRIES = new asp(errorTypeArr);
        }

        private ErrorType(String str, int i) {
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("change_privacy_from_dots")
        public static final EventType CHANGE_PRIVACY_FROM_DOTS;

        @pmi0("change_privacy_within_deleting")
        public static final EventType CHANGE_PRIVACY_WITHIN_DELETING;

        @pmi0("download")
        public static final EventType DOWNLOAD;

        @pmi0("encode")
        public static final EventType ENCODE;

        @pmi0("first_frame_rendered")
        public static final EventType FIRST_FRAME_RENDERED;

        @pmi0("load_success_big_preview")
        public static final EventType LOAD_SUCCESS_BIG_PREVIEW;

        @pmi0("load_success_small_preview")
        public static final EventType LOAD_SUCCESS_SMALL_PREVIEW;

        @pmi0("open_minimized_story")
        public static final EventType OPEN_MINIMIZED_STORY;

        @pmi0("seen")
        public static final EventType SEEN;

        @pmi0("show_loader")
        public static final EventType SHOW_LOADER;

        @pmi0("upload")
        public static final EventType UPLOAD;

        @pmi0("upload_network")
        public static final EventType UPLOAD_NETWORK;

        @pmi0("verticalization")
        public static final EventType VERTICALIZATION;

        static {
            EventType eventType = new EventType("UPLOAD", 0);
            UPLOAD = eventType;
            EventType eventType2 = new EventType("DOWNLOAD", 1);
            DOWNLOAD = eventType2;
            EventType eventType3 = new EventType("ENCODE", 2);
            ENCODE = eventType3;
            EventType eventType4 = new EventType("SEEN", 3);
            SEEN = eventType4;
            EventType eventType5 = new EventType("SHOW_LOADER", 4);
            SHOW_LOADER = eventType5;
            EventType eventType6 = new EventType("LOAD_SUCCESS_SMALL_PREVIEW", 5);
            LOAD_SUCCESS_SMALL_PREVIEW = eventType6;
            EventType eventType7 = new EventType("LOAD_SUCCESS_BIG_PREVIEW", 6);
            LOAD_SUCCESS_BIG_PREVIEW = eventType7;
            EventType eventType8 = new EventType("OPEN_MINIMIZED_STORY", 7);
            OPEN_MINIMIZED_STORY = eventType8;
            EventType eventType9 = new EventType("FIRST_FRAME_RENDERED", 8);
            FIRST_FRAME_RENDERED = eventType9;
            EventType eventType10 = new EventType("CHANGE_PRIVACY_FROM_DOTS", 9);
            CHANGE_PRIVACY_FROM_DOTS = eventType10;
            EventType eventType11 = new EventType("CHANGE_PRIVACY_WITHIN_DELETING", 10);
            CHANGE_PRIVACY_WITHIN_DELETING = eventType11;
            EventType eventType12 = new EventType("UPLOAD_NETWORK", 11);
            UPLOAD_NETWORK = eventType12;
            EventType eventType13 = new EventType("VERTICALIZATION", 12);
            VERTICALIZATION = eventType13;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13};
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
    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class EventTypeAndroid {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventTypeAndroid[] $VALUES;

        @pmi0("call_show_story_container")
        public static final EventTypeAndroid CALL_SHOW_STORY_CONTAINER;

        @pmi0("change_privacy_from_dots")
        public static final EventTypeAndroid CHANGE_PRIVACY_FROM_DOTS;

        @pmi0("change_privacy_within_deleting")
        public static final EventTypeAndroid CHANGE_PRIVACY_WITHIN_DELETING;

        @pmi0("download")
        public static final EventTypeAndroid DOWNLOAD;

        @pmi0("encode")
        public static final EventTypeAndroid ENCODE;

        @pmi0("end_buffer_video")
        public static final EventTypeAndroid END_BUFFER_VIDEO;

        @pmi0("end_get_cache_minimized")
        public static final EventTypeAndroid END_GET_CACHE_MINIMIZED;

        @pmi0("end_init_story_view")
        public static final EventTypeAndroid END_INIT_STORY_VIEW;

        @pmi0("end_load_minimized")
        public static final EventTypeAndroid END_LOAD_MINIMIZED;

        @pmi0("end_load_network_minimized")
        public static final EventTypeAndroid END_LOAD_NETWORK_MINIMIZED;

        @pmi0("end_preload_next_story")
        public static final EventTypeAndroid END_PRELOAD_NEXT_STORY;

        @pmi0("finish_init_container")
        public static final EventTypeAndroid FINISH_INIT_CONTAINER;

        @pmi0("first_frame_rendered")
        public static final EventTypeAndroid FIRST_FRAME_RENDERED;

        @pmi0("loading_video_completed")
        public static final EventTypeAndroid LOADING_VIDEO_COMPLETED;

        @pmi0("loading_video_error")
        public static final EventTypeAndroid LOADING_VIDEO_ERROR;

        @pmi0("loading_video_start")
        public static final EventTypeAndroid LOADING_VIDEO_START;

        @pmi0("load_success_preview")
        public static final EventTypeAndroid LOAD_SUCCESS_PREVIEW;

        @pmi0("on_attached_to_window_dialog")
        public static final EventTypeAndroid ON_ATTACHED_TO_WINDOW_DIALOG;

        @pmi0("on_attach_to_window_story_view")
        public static final EventTypeAndroid ON_ATTACH_TO_WINDOW_STORY_VIEW;

        @pmi0("on_create_dialog")
        public static final EventTypeAndroid ON_CREATE_DIALOG;

        @pmi0("on_pre_draw_listener_story_view")
        public static final EventTypeAndroid ON_PRE_DRAW_LISTENER_STORY_VIEW;

        @pmi0("on_resume_container")
        public static final EventTypeAndroid ON_RESUME_CONTAINER;

        @pmi0("on_resume_story_view")
        public static final EventTypeAndroid ON_RESUME_STORY_VIEW;

        @pmi0("on_start_dialog")
        public static final EventTypeAndroid ON_START_DIALOG;

        @pmi0("open_story_view")
        public static final EventTypeAndroid OPEN_STORY_VIEW;

        @pmi0("quality_downgrade")
        public static final EventTypeAndroid QUALITY_DOWNGRADE;

        @pmi0("quality_upgrade")
        public static final EventTypeAndroid QUALITY_UPGRADE;

        @pmi0("seen")
        public static final EventTypeAndroid SEEN;

        @pmi0("setup_video")
        public static final EventTypeAndroid SETUP_VIDEO;

        @pmi0("show_dialog")
        public static final EventTypeAndroid SHOW_DIALOG;

        @pmi0("show_loader")
        public static final EventTypeAndroid SHOW_LOADER;

        @pmi0("start_buffer_video")
        public static final EventTypeAndroid START_BUFFER_VIDEO;

        @pmi0("start_get_cache_minimized")
        public static final EventTypeAndroid START_GET_CACHE_MINIMIZED;

        @pmi0("start_init_container")
        public static final EventTypeAndroid START_INIT_CONTAINER;

        @pmi0("start_init_stories_feed")
        public static final EventTypeAndroid START_INIT_STORIES_FEED;

        @pmi0("start_init_story_view")
        public static final EventTypeAndroid START_INIT_STORY_VIEW;

        @pmi0("start_load_image")
        public static final EventTypeAndroid START_LOAD_IMAGE;

        @pmi0("start_load_minimized")
        public static final EventTypeAndroid START_LOAD_MINIMIZED;

        @pmi0("start_load_network_minimized")
        public static final EventTypeAndroid START_LOAD_NETWORK_MINIMIZED;

        @pmi0("start_preload_next_story")
        public static final EventTypeAndroid START_PRELOAD_NEXT_STORY;

        @pmi0("stories_feed_click_to_open")
        public static final EventTypeAndroid STORIES_FEED_CLICK_TO_OPEN;

        @pmi0("stories_feed_completed_for_draw")
        public static final EventTypeAndroid STORIES_FEED_COMPLETED_FOR_DRAW;

        @pmi0("stories_feed_draw")
        public static final EventTypeAndroid STORIES_FEED_DRAW;

        @pmi0("stories_feed_draw_app_time")
        public static final EventTypeAndroid STORIES_FEED_DRAW_APP_TIME;

        @pmi0("stories_feed_open")
        public static final EventTypeAndroid STORIES_FEED_OPEN;

        @pmi0("stories_get")
        public static final EventTypeAndroid STORIES_GET;

        @pmi0("stories_open_picker")
        public static final EventTypeAndroid STORIES_OPEN_PICKER;

        @pmi0("success_stories_get")
        public static final EventTypeAndroid SUCCESS_STORIES_GET;

        @pmi0("upload")
        public static final EventTypeAndroid UPLOAD;

        static {
            EventTypeAndroid eventTypeAndroid = new EventTypeAndroid("UPLOAD", 0);
            UPLOAD = eventTypeAndroid;
            EventTypeAndroid eventTypeAndroid2 = new EventTypeAndroid("DOWNLOAD", 1);
            DOWNLOAD = eventTypeAndroid2;
            EventTypeAndroid eventTypeAndroid3 = new EventTypeAndroid("ENCODE", 2);
            ENCODE = eventTypeAndroid3;
            EventTypeAndroid eventTypeAndroid4 = new EventTypeAndroid("SEEN", 3);
            SEEN = eventTypeAndroid4;
            EventTypeAndroid eventTypeAndroid5 = new EventTypeAndroid("SHOW_LOADER", 4);
            SHOW_LOADER = eventTypeAndroid5;
            EventTypeAndroid eventTypeAndroid6 = new EventTypeAndroid("LOAD_SUCCESS_PREVIEW", 5);
            LOAD_SUCCESS_PREVIEW = eventTypeAndroid6;
            EventTypeAndroid eventTypeAndroid7 = new EventTypeAndroid("FIRST_FRAME_RENDERED", 6);
            FIRST_FRAME_RENDERED = eventTypeAndroid7;
            EventTypeAndroid eventTypeAndroid8 = new EventTypeAndroid("CHANGE_PRIVACY_FROM_DOTS", 7);
            CHANGE_PRIVACY_FROM_DOTS = eventTypeAndroid8;
            EventTypeAndroid eventTypeAndroid9 = new EventTypeAndroid("CHANGE_PRIVACY_WITHIN_DELETING", 8);
            CHANGE_PRIVACY_WITHIN_DELETING = eventTypeAndroid9;
            EventTypeAndroid eventTypeAndroid10 = new EventTypeAndroid("ON_ATTACHED_TO_WINDOW_DIALOG", 9);
            ON_ATTACHED_TO_WINDOW_DIALOG = eventTypeAndroid10;
            EventTypeAndroid eventTypeAndroid11 = new EventTypeAndroid("ON_CREATE_DIALOG", 10);
            ON_CREATE_DIALOG = eventTypeAndroid11;
            EventTypeAndroid eventTypeAndroid12 = new EventTypeAndroid("ON_START_DIALOG", 11);
            ON_START_DIALOG = eventTypeAndroid12;
            EventTypeAndroid eventTypeAndroid13 = new EventTypeAndroid("SHOW_DIALOG", 12);
            SHOW_DIALOG = eventTypeAndroid13;
            EventTypeAndroid eventTypeAndroid14 = new EventTypeAndroid("START_INIT_CONTAINER", 13);
            START_INIT_CONTAINER = eventTypeAndroid14;
            EventTypeAndroid eventTypeAndroid15 = new EventTypeAndroid("FINISH_INIT_CONTAINER", 14);
            FINISH_INIT_CONTAINER = eventTypeAndroid15;
            EventTypeAndroid eventTypeAndroid16 = new EventTypeAndroid("CALL_SHOW_STORY_CONTAINER", 15);
            CALL_SHOW_STORY_CONTAINER = eventTypeAndroid16;
            EventTypeAndroid eventTypeAndroid17 = new EventTypeAndroid("ON_RESUME_CONTAINER", 16);
            ON_RESUME_CONTAINER = eventTypeAndroid17;
            EventTypeAndroid eventTypeAndroid18 = new EventTypeAndroid("START_GET_CACHE_MINIMIZED", 17);
            START_GET_CACHE_MINIMIZED = eventTypeAndroid18;
            EventTypeAndroid eventTypeAndroid19 = new EventTypeAndroid("END_GET_CACHE_MINIMIZED", 18);
            END_GET_CACHE_MINIMIZED = eventTypeAndroid19;
            EventTypeAndroid eventTypeAndroid20 = new EventTypeAndroid("START_LOAD_NETWORK_MINIMIZED", 19);
            START_LOAD_NETWORK_MINIMIZED = eventTypeAndroid20;
            EventTypeAndroid eventTypeAndroid21 = new EventTypeAndroid("END_LOAD_NETWORK_MINIMIZED", 20);
            END_LOAD_NETWORK_MINIMIZED = eventTypeAndroid21;
            EventTypeAndroid eventTypeAndroid22 = new EventTypeAndroid("START_LOAD_MINIMIZED", 21);
            START_LOAD_MINIMIZED = eventTypeAndroid22;
            EventTypeAndroid eventTypeAndroid23 = new EventTypeAndroid("END_LOAD_MINIMIZED", 22);
            END_LOAD_MINIMIZED = eventTypeAndroid23;
            EventTypeAndroid eventTypeAndroid24 = new EventTypeAndroid("ON_ATTACH_TO_WINDOW_STORY_VIEW", 23);
            ON_ATTACH_TO_WINDOW_STORY_VIEW = eventTypeAndroid24;
            EventTypeAndroid eventTypeAndroid25 = new EventTypeAndroid("ON_RESUME_STORY_VIEW", 24);
            ON_RESUME_STORY_VIEW = eventTypeAndroid25;
            EventTypeAndroid eventTypeAndroid26 = new EventTypeAndroid("START_INIT_STORY_VIEW", 25);
            START_INIT_STORY_VIEW = eventTypeAndroid26;
            EventTypeAndroid eventTypeAndroid27 = new EventTypeAndroid("END_INIT_STORY_VIEW", 26);
            END_INIT_STORY_VIEW = eventTypeAndroid27;
            EventTypeAndroid eventTypeAndroid28 = new EventTypeAndroid("OPEN_STORY_VIEW", 27);
            OPEN_STORY_VIEW = eventTypeAndroid28;
            EventTypeAndroid eventTypeAndroid29 = new EventTypeAndroid("ON_PRE_DRAW_LISTENER_STORY_VIEW", 28);
            ON_PRE_DRAW_LISTENER_STORY_VIEW = eventTypeAndroid29;
            EventTypeAndroid eventTypeAndroid30 = new EventTypeAndroid("START_BUFFER_VIDEO", 29);
            START_BUFFER_VIDEO = eventTypeAndroid30;
            EventTypeAndroid eventTypeAndroid31 = new EventTypeAndroid("END_BUFFER_VIDEO", 30);
            END_BUFFER_VIDEO = eventTypeAndroid31;
            EventTypeAndroid eventTypeAndroid32 = new EventTypeAndroid("SETUP_VIDEO", 31);
            SETUP_VIDEO = eventTypeAndroid32;
            EventTypeAndroid eventTypeAndroid33 = new EventTypeAndroid("LOADING_VIDEO_START", 32);
            LOADING_VIDEO_START = eventTypeAndroid33;
            EventTypeAndroid eventTypeAndroid34 = new EventTypeAndroid("LOADING_VIDEO_COMPLETED", 33);
            LOADING_VIDEO_COMPLETED = eventTypeAndroid34;
            EventTypeAndroid eventTypeAndroid35 = new EventTypeAndroid("LOADING_VIDEO_ERROR", 34);
            LOADING_VIDEO_ERROR = eventTypeAndroid35;
            EventTypeAndroid eventTypeAndroid36 = new EventTypeAndroid("START_LOAD_IMAGE", 35);
            START_LOAD_IMAGE = eventTypeAndroid36;
            EventTypeAndroid eventTypeAndroid37 = new EventTypeAndroid("START_PRELOAD_NEXT_STORY", 36);
            START_PRELOAD_NEXT_STORY = eventTypeAndroid37;
            EventTypeAndroid eventTypeAndroid38 = new EventTypeAndroid("END_PRELOAD_NEXT_STORY", 37);
            END_PRELOAD_NEXT_STORY = eventTypeAndroid38;
            EventTypeAndroid eventTypeAndroid39 = new EventTypeAndroid("QUALITY_UPGRADE", 38);
            QUALITY_UPGRADE = eventTypeAndroid39;
            EventTypeAndroid eventTypeAndroid40 = new EventTypeAndroid("QUALITY_DOWNGRADE", 39);
            QUALITY_DOWNGRADE = eventTypeAndroid40;
            EventTypeAndroid eventTypeAndroid41 = new EventTypeAndroid("STORIES_GET", 40);
            STORIES_GET = eventTypeAndroid41;
            EventTypeAndroid eventTypeAndroid42 = new EventTypeAndroid("SUCCESS_STORIES_GET", 41);
            SUCCESS_STORIES_GET = eventTypeAndroid42;
            EventTypeAndroid eventTypeAndroid43 = new EventTypeAndroid("START_INIT_STORIES_FEED", 42);
            START_INIT_STORIES_FEED = eventTypeAndroid43;
            EventTypeAndroid eventTypeAndroid44 = new EventTypeAndroid("STORIES_FEED_COMPLETED_FOR_DRAW", 43);
            STORIES_FEED_COMPLETED_FOR_DRAW = eventTypeAndroid44;
            EventTypeAndroid eventTypeAndroid45 = new EventTypeAndroid("STORIES_FEED_DRAW", 44);
            STORIES_FEED_DRAW = eventTypeAndroid45;
            EventTypeAndroid eventTypeAndroid46 = new EventTypeAndroid("STORIES_FEED_DRAW_APP_TIME", 45);
            STORIES_FEED_DRAW_APP_TIME = eventTypeAndroid46;
            EventTypeAndroid eventTypeAndroid47 = new EventTypeAndroid("STORIES_FEED_CLICK_TO_OPEN", 46);
            STORIES_FEED_CLICK_TO_OPEN = eventTypeAndroid47;
            EventTypeAndroid eventTypeAndroid48 = new EventTypeAndroid("STORIES_FEED_OPEN", 47);
            STORIES_FEED_OPEN = eventTypeAndroid48;
            EventTypeAndroid eventTypeAndroid49 = new EventTypeAndroid("STORIES_OPEN_PICKER", 48);
            STORIES_OPEN_PICKER = eventTypeAndroid49;
            EventTypeAndroid[] eventTypeAndroidArr = {eventTypeAndroid, eventTypeAndroid2, eventTypeAndroid3, eventTypeAndroid4, eventTypeAndroid5, eventTypeAndroid6, eventTypeAndroid7, eventTypeAndroid8, eventTypeAndroid9, eventTypeAndroid10, eventTypeAndroid11, eventTypeAndroid12, eventTypeAndroid13, eventTypeAndroid14, eventTypeAndroid15, eventTypeAndroid16, eventTypeAndroid17, eventTypeAndroid18, eventTypeAndroid19, eventTypeAndroid20, eventTypeAndroid21, eventTypeAndroid22, eventTypeAndroid23, eventTypeAndroid24, eventTypeAndroid25, eventTypeAndroid26, eventTypeAndroid27, eventTypeAndroid28, eventTypeAndroid29, eventTypeAndroid30, eventTypeAndroid31, eventTypeAndroid32, eventTypeAndroid33, eventTypeAndroid34, eventTypeAndroid35, eventTypeAndroid36, eventTypeAndroid37, eventTypeAndroid38, eventTypeAndroid39, eventTypeAndroid40, eventTypeAndroid41, eventTypeAndroid42, eventTypeAndroid43, eventTypeAndroid44, eventTypeAndroid45, eventTypeAndroid46, eventTypeAndroid47, eventTypeAndroid48, eventTypeAndroid49};
            $VALUES = eventTypeAndroidArr;
            $ENTRIES = new asp(eventTypeAndroidArr);
        }

        private EventTypeAndroid(String str, int i) {
        }

        public static EventTypeAndroid valueOf(String str) {
            return (EventTypeAndroid) Enum.valueOf(EventTypeAndroid.class, str);
        }

        public static EventTypeAndroid[] values() {
            return (EventTypeAndroid[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class EventTypeIos {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventTypeIos[] $VALUES;

        @pmi0("change_privacy_from_dots")
        public static final EventTypeIos CHANGE_PRIVACY_FROM_DOTS;

        @pmi0("change_privacy_within_deleting")
        public static final EventTypeIos CHANGE_PRIVACY_WITHIN_DELETING;

        @pmi0("download")
        public static final EventTypeIos DOWNLOAD;

        @pmi0("end_preload_next_story")
        public static final EventTypeIos END_PRELOAD_NEXT_STORY;

        @pmi0("first_frame_rendered")
        public static final EventTypeIos FIRST_FRAME_RENDERED;

        @pmi0("loading_video_completed")
        public static final EventTypeIos LOADING_VIDEO_COMPLETED;

        @pmi0("loading_video_error")
        public static final EventTypeIos LOADING_VIDEO_ERROR;

        @pmi0("loading_video_start")
        public static final EventTypeIos LOADING_VIDEO_START;

        @pmi0("load_success_preview")
        public static final EventTypeIos LOAD_SUCCESS_PREVIEW;

        @pmi0("quality_downgrade")
        public static final EventTypeIos QUALITY_DOWNGRADE;

        @pmi0("quality_upgrade")
        public static final EventTypeIos QUALITY_UPGRADE;

        @pmi0("seen")
        public static final EventTypeIos SEEN;

        @pmi0("setup_video")
        public static final EventTypeIos SETUP_VIDEO;

        @pmi0("show_loader")
        public static final EventTypeIos SHOW_LOADER;

        @pmi0("start_init_stories_feed")
        public static final EventTypeIos START_INIT_STORIES_FEED;

        @pmi0("start_load_image")
        public static final EventTypeIos START_LOAD_IMAGE;

        @pmi0("start_preload_next_story")
        public static final EventTypeIos START_PRELOAD_NEXT_STORY;

        @pmi0("stories_feed_completed_for_draw")
        public static final EventTypeIos STORIES_FEED_COMPLETED_FOR_DRAW;

        @pmi0("stories_feed_draw")
        public static final EventTypeIos STORIES_FEED_DRAW;

        @pmi0("stories_feed_draw_app_time")
        public static final EventTypeIos STORIES_FEED_DRAW_APP_TIME;

        @pmi0("stories_feed_draw_cached")
        public static final EventTypeIos STORIES_FEED_DRAW_CACHED;

        @pmi0("stories_feed_draw_cached_app_time")
        public static final EventTypeIos STORIES_FEED_DRAW_CACHED_APP_TIME;

        @pmi0("stories_get")
        public static final EventTypeIos STORIES_GET;

        @pmi0("story_container_init_done")
        public static final EventTypeIos STORY_CONTAINER_INIT_DONE;

        @pmi0("story_container_init_start")
        public static final EventTypeIos STORY_CONTAINER_INIT_START;

        @pmi0("story_container_view_did_appear")
        public static final EventTypeIos STORY_CONTAINER_VIEW_DID_APPEAR;

        @pmi0("story_container_view_init_done")
        public static final EventTypeIos STORY_CONTAINER_VIEW_INIT_DONE;

        @pmi0("story_container_view_init_start")
        public static final EventTypeIos STORY_CONTAINER_VIEW_INIT_START;

        @pmi0("story_page_init_done")
        public static final EventTypeIos STORY_PAGE_INIT_DONE;

        @pmi0("story_page_init_start")
        public static final EventTypeIos STORY_PAGE_INIT_START;

        @pmi0("story_page_view_did_appear")
        public static final EventTypeIos STORY_PAGE_VIEW_DID_APPEAR;

        @pmi0("story_page_view_init_done")
        public static final EventTypeIos STORY_PAGE_VIEW_INIT_DONE;

        @pmi0("story_page_view_init_start")
        public static final EventTypeIos STORY_PAGE_VIEW_INIT_START;

        @pmi0("success_stories_get")
        public static final EventTypeIos SUCCESS_STORIES_GET;

        @pmi0("switch_story")
        public static final EventTypeIos SWITCH_STORY;

        @pmi0("upload")
        public static final EventTypeIos UPLOAD;

        static {
            EventTypeIos eventTypeIos = new EventTypeIos("UPLOAD", 0);
            UPLOAD = eventTypeIos;
            EventTypeIos eventTypeIos2 = new EventTypeIos("DOWNLOAD", 1);
            DOWNLOAD = eventTypeIos2;
            EventTypeIos eventTypeIos3 = new EventTypeIos("SEEN", 2);
            SEEN = eventTypeIos3;
            EventTypeIos eventTypeIos4 = new EventTypeIos("SHOW_LOADER", 3);
            SHOW_LOADER = eventTypeIos4;
            EventTypeIos eventTypeIos5 = new EventTypeIos("FIRST_FRAME_RENDERED", 4);
            FIRST_FRAME_RENDERED = eventTypeIos5;
            EventTypeIos eventTypeIos6 = new EventTypeIos("CHANGE_PRIVACY_FROM_DOTS", 5);
            CHANGE_PRIVACY_FROM_DOTS = eventTypeIos6;
            EventTypeIos eventTypeIos7 = new EventTypeIos("CHANGE_PRIVACY_WITHIN_DELETING", 6);
            CHANGE_PRIVACY_WITHIN_DELETING = eventTypeIos7;
            EventTypeIos eventTypeIos8 = new EventTypeIos("SETUP_VIDEO", 7);
            SETUP_VIDEO = eventTypeIos8;
            EventTypeIos eventTypeIos9 = new EventTypeIos("LOADING_VIDEO_START", 8);
            LOADING_VIDEO_START = eventTypeIos9;
            EventTypeIos eventTypeIos10 = new EventTypeIos("LOADING_VIDEO_COMPLETED", 9);
            LOADING_VIDEO_COMPLETED = eventTypeIos10;
            EventTypeIos eventTypeIos11 = new EventTypeIos("LOADING_VIDEO_ERROR", 10);
            LOADING_VIDEO_ERROR = eventTypeIos11;
            EventTypeIos eventTypeIos12 = new EventTypeIos("START_LOAD_IMAGE", 11);
            START_LOAD_IMAGE = eventTypeIos12;
            EventTypeIos eventTypeIos13 = new EventTypeIos("LOAD_SUCCESS_PREVIEW", 12);
            LOAD_SUCCESS_PREVIEW = eventTypeIos13;
            EventTypeIos eventTypeIos14 = new EventTypeIos("START_PRELOAD_NEXT_STORY", 13);
            START_PRELOAD_NEXT_STORY = eventTypeIos14;
            EventTypeIos eventTypeIos15 = new EventTypeIos("END_PRELOAD_NEXT_STORY", 14);
            END_PRELOAD_NEXT_STORY = eventTypeIos15;
            EventTypeIos eventTypeIos16 = new EventTypeIos("SWITCH_STORY", 15);
            SWITCH_STORY = eventTypeIos16;
            EventTypeIos eventTypeIos17 = new EventTypeIos("STORY_CONTAINER_INIT_START", 16);
            STORY_CONTAINER_INIT_START = eventTypeIos17;
            EventTypeIos eventTypeIos18 = new EventTypeIos("STORY_CONTAINER_INIT_DONE", 17);
            STORY_CONTAINER_INIT_DONE = eventTypeIos18;
            EventTypeIos eventTypeIos19 = new EventTypeIos("STORY_CONTAINER_VIEW_INIT_START", 18);
            STORY_CONTAINER_VIEW_INIT_START = eventTypeIos19;
            EventTypeIos eventTypeIos20 = new EventTypeIos("STORY_CONTAINER_VIEW_INIT_DONE", 19);
            STORY_CONTAINER_VIEW_INIT_DONE = eventTypeIos20;
            EventTypeIos eventTypeIos21 = new EventTypeIos("STORY_CONTAINER_VIEW_DID_APPEAR", 20);
            STORY_CONTAINER_VIEW_DID_APPEAR = eventTypeIos21;
            EventTypeIos eventTypeIos22 = new EventTypeIos("STORY_PAGE_INIT_START", 21);
            STORY_PAGE_INIT_START = eventTypeIos22;
            EventTypeIos eventTypeIos23 = new EventTypeIos("STORY_PAGE_INIT_DONE", 22);
            STORY_PAGE_INIT_DONE = eventTypeIos23;
            EventTypeIos eventTypeIos24 = new EventTypeIos("STORY_PAGE_VIEW_INIT_START", 23);
            STORY_PAGE_VIEW_INIT_START = eventTypeIos24;
            EventTypeIos eventTypeIos25 = new EventTypeIos("STORY_PAGE_VIEW_INIT_DONE", 24);
            STORY_PAGE_VIEW_INIT_DONE = eventTypeIos25;
            EventTypeIos eventTypeIos26 = new EventTypeIos("STORY_PAGE_VIEW_DID_APPEAR", 25);
            STORY_PAGE_VIEW_DID_APPEAR = eventTypeIos26;
            EventTypeIos eventTypeIos27 = new EventTypeIos("QUALITY_UPGRADE", 26);
            QUALITY_UPGRADE = eventTypeIos27;
            EventTypeIos eventTypeIos28 = new EventTypeIos("QUALITY_DOWNGRADE", 27);
            QUALITY_DOWNGRADE = eventTypeIos28;
            EventTypeIos eventTypeIos29 = new EventTypeIos("STORIES_GET", 28);
            STORIES_GET = eventTypeIos29;
            EventTypeIos eventTypeIos30 = new EventTypeIos("SUCCESS_STORIES_GET", 29);
            SUCCESS_STORIES_GET = eventTypeIos30;
            EventTypeIos eventTypeIos31 = new EventTypeIos("START_INIT_STORIES_FEED", 30);
            START_INIT_STORIES_FEED = eventTypeIos31;
            EventTypeIos eventTypeIos32 = new EventTypeIos("STORIES_FEED_COMPLETED_FOR_DRAW", 31);
            STORIES_FEED_COMPLETED_FOR_DRAW = eventTypeIos32;
            EventTypeIos eventTypeIos33 = new EventTypeIos("STORIES_FEED_DRAW", 32);
            STORIES_FEED_DRAW = eventTypeIos33;
            EventTypeIos eventTypeIos34 = new EventTypeIos("STORIES_FEED_DRAW_APP_TIME", 33);
            STORIES_FEED_DRAW_APP_TIME = eventTypeIos34;
            EventTypeIos eventTypeIos35 = new EventTypeIos("STORIES_FEED_DRAW_CACHED", 34);
            STORIES_FEED_DRAW_CACHED = eventTypeIos35;
            EventTypeIos eventTypeIos36 = new EventTypeIos("STORIES_FEED_DRAW_CACHED_APP_TIME", 35);
            STORIES_FEED_DRAW_CACHED_APP_TIME = eventTypeIos36;
            EventTypeIos[] eventTypeIosArr = {eventTypeIos, eventTypeIos2, eventTypeIos3, eventTypeIos4, eventTypeIos5, eventTypeIos6, eventTypeIos7, eventTypeIos8, eventTypeIos9, eventTypeIos10, eventTypeIos11, eventTypeIos12, eventTypeIos13, eventTypeIos14, eventTypeIos15, eventTypeIos16, eventTypeIos17, eventTypeIos18, eventTypeIos19, eventTypeIos20, eventTypeIos21, eventTypeIos22, eventTypeIos23, eventTypeIos24, eventTypeIos25, eventTypeIos26, eventTypeIos27, eventTypeIos28, eventTypeIos29, eventTypeIos30, eventTypeIos31, eventTypeIos32, eventTypeIos33, eventTypeIos34, eventTypeIos35, eventTypeIos36};
            $VALUES = eventTypeIosArr;
            $ENTRIES = new asp(eventTypeIosArr);
        }

        private EventTypeIos(String str, int i) {
        }

        public static EventTypeIos valueOf(String str) {
            return (EventTypeIos) Enum.valueOf(EventTypeIos.class, str);
        }

        public static EventTypeIos[] values() {
            return (EventTypeIos[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem>, a9y<MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            long q = fai.q(x9yVar, "owner_id");
            ContentType contentType = (ContentType) dq.f(x9yVar, "content_type", tru.a(), ContentType.class);
            MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = (MobileOfficialAppsCoreDeviceStat$NetworkInfo) dq.f(x9yVar, "network_info", tru.a(), MobileOfficialAppsCoreDeviceStat$NetworkInfo.class);
            Long B = fai.B(x9yVar, "content_id");
            Gson a = tru.a();
            b9y q2 = x9yVar.q("content_subtype");
            ContentSubtype contentSubtype = (ContentSubtype) ((q2 == null || (q2 instanceof u9y)) ? null : a.fromJson(q2.k(), ContentSubtype.class));
            Gson a2 = tru.a();
            b9y q3 = x9yVar.q("device_info");
            MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = (MobileOfficialAppsCoreDeviceStat$DeviceInfoItem) ((q3 == null || (q3 instanceof u9y)) ? null : a2.fromJson(q3.k(), MobileOfficialAppsCoreDeviceStat$DeviceInfoItem.class));
            Gson a3 = tru.a();
            b9y q4 = x9yVar.q("event_times");
            List list = (List) ((q4 == null || (q4 instanceof u9y)) ? null : a3.fromJson(x9yVar.q("event_times").k(), new au20().getType()));
            Gson a4 = tru.a();
            b9y q5 = x9yVar.q("used_encoders");
            List list2 = (List) ((q5 == null || (q5 instanceof u9y)) ? null : a4.fromJson(x9yVar.q("used_encoders").k(), new bu20().getType()));
            Integer A = fai.A(x9yVar, "height");
            Integer A2 = fai.A(x9yVar, "width");
            Integer A3 = fai.A(x9yVar, "fps");
            Gson a5 = tru.a();
            b9y q6 = x9yVar.q("error_type");
            ErrorType errorType = (ErrorType) ((q6 == null || (q6 instanceof u9y)) ? null : a5.fromJson(q6.k(), ErrorType.class));
            String C = fai.C(x9yVar, "error_description");
            Gson a6 = tru.a();
            b9y q7 = x9yVar.q("event_type");
            EventType eventType = (EventType) ((q7 == null || (q7 instanceof u9y)) ? null : a6.fromJson(q7.k(), EventType.class));
            Gson a7 = tru.a();
            b9y q8 = x9yVar.q("event_type_android");
            EventTypeAndroid eventTypeAndroid = (EventTypeAndroid) ((q8 == null || (q8 instanceof u9y)) ? null : a7.fromJson(q8.k(), EventTypeAndroid.class));
            Gson a8 = tru.a();
            b9y q9 = x9yVar.q("event_type_ios");
            EventTypeIos eventTypeIos = (EventTypeIos) ((q9 == null || (q9 instanceof u9y)) ? null : a8.fromJson(q9.k(), EventTypeIos.class));
            Integer A4 = fai.A(x9yVar, "uploading_id");
            Gson a9 = tru.a();
            b9y q10 = x9yVar.q("seen_info");
            MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem = (MobileOfficialAppsConStoriesStat$VideoSeenItem) ((q10 == null || (q10 instanceof u9y)) ? null : a9.fromJson(q10.k(), MobileOfficialAppsConStoriesStat$VideoSeenItem.class));
            Gson a10 = tru.a();
            b9y q11 = x9yVar.q("batch_upload");
            MobileOfficialAppsConStoriesStat$BatchUpload mobileOfficialAppsConStoriesStat$BatchUpload = (MobileOfficialAppsConStoriesStat$BatchUpload) ((q11 == null || (q11 instanceof u9y)) ? null : a10.fromJson(q11.k(), MobileOfficialAppsConStoriesStat$BatchUpload.class));
            Gson a11 = tru.a();
            b9y q12 = x9yVar.q("seen_media_info");
            MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo = (MobileOfficialAppsConStoriesStat$SeenMediaInfo) ((q12 == null || (q12 instanceof u9y)) ? null : a11.fromJson(q12.k(), MobileOfficialAppsConStoriesStat$SeenMediaInfo.class));
            Gson a12 = tru.a();
            b9y q13 = x9yVar.q("photo_info");
            MobileOfficialAppsConStoriesStat$PhotoInfo mobileOfficialAppsConStoriesStat$PhotoInfo = (MobileOfficialAppsConStoriesStat$PhotoInfo) ((q13 == null || (q13 instanceof u9y)) ? null : a12.fromJson(q13.k(), MobileOfficialAppsConStoriesStat$PhotoInfo.class));
            Gson a13 = tru.a();
            b9y q14 = x9yVar.q("video_info");
            MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo = (MobileOfficialAppsConStoriesStat$VideoInfo) ((q14 == null || (q14 instanceof u9y)) ? null : a13.fromJson(q14.k(), MobileOfficialAppsConStoriesStat$VideoInfo.class));
            Boolean y = fai.y(x9yVar, "is_cold_start_viewer");
            Boolean y2 = fai.y(x9yVar, "is_preview_instance");
            Gson a14 = tru.a();
            b9y q15 = x9yVar.q("story_type_open");
            MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen = (MobileOfficialAppsConStoriesStat$StoryTypeOpen) ((q15 == null || (q15 instanceof u9y)) ? null : a14.fromJson(q15.k(), MobileOfficialAppsConStoriesStat$StoryTypeOpen.class));
            Gson a15 = tru.a();
            b9y q16 = x9yVar.q("preload_story_info");
            MobileOfficialAppsConStoriesStat$PreloadStoryInfo mobileOfficialAppsConStoriesStat$PreloadStoryInfo = (MobileOfficialAppsConStoriesStat$PreloadStoryInfo) ((q16 == null || (q16 instanceof u9y)) ? null : a15.fromJson(q16.k(), MobileOfficialAppsConStoriesStat$PreloadStoryInfo.class));
            Integer A5 = fai.A(x9yVar, "size_minimized");
            Gson a16 = tru.a();
            b9y q17 = x9yVar.q("type_next_story");
            TypeNextStory typeNextStory = (TypeNextStory) ((q17 == null || (q17 instanceof u9y)) ? null : a16.fromJson(q17.k(), TypeNextStory.class));
            Boolean y3 = fai.y(x9yVar, "is_show_image_preview");
            Boolean y4 = fai.y(x9yVar, "is_restored_story");
            Gson a17 = tru.a();
            b9y q18 = x9yVar.q("view_entry_point");
            return new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(q, contentType, mobileOfficialAppsCoreDeviceStat$NetworkInfo, B, contentSubtype, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, list, list2, A, A2, A3, errorType, C, eventType, eventTypeAndroid, eventTypeIos, A4, mobileOfficialAppsConStoriesStat$VideoSeenItem, mobileOfficialAppsConStoriesStat$BatchUpload, mobileOfficialAppsConStoriesStat$SeenMediaInfo, mobileOfficialAppsConStoriesStat$PhotoInfo, mobileOfficialAppsConStoriesStat$VideoInfo, y, y2, mobileOfficialAppsConStoriesStat$StoryTypeOpen, mobileOfficialAppsConStoriesStat$PreloadStoryInfo, A5, typeNextStory, y3, y4, (MobileOfficialAppsConStoriesStat$ViewEntryPoint) ((q18 == null || (q18 instanceof u9y)) ? null : a17.fromJson(q18.k(), MobileOfficialAppsConStoriesStat$ViewEntryPoint.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = (MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("owner_id", Long.valueOf(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.n()));
            x9yVar.o("content_type", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.d()));
            x9yVar.o("network_info", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.m()));
            x9yVar.n("content_id", mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.b());
            x9yVar.o("content_subtype", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.c()));
            x9yVar.o("device_info", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.e()));
            x9yVar.o("event_times", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.g()));
            x9yVar.o("used_encoders", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.w()));
            x9yVar.n("height", mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.l());
            x9yVar.n("width", mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.z());
            x9yVar.n("fps", mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.k());
            x9yVar.o("error_type", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.f()));
            x9yVar.o("error_description", mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.a);
            x9yVar.o("event_type", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.h()));
            x9yVar.o("event_type_android", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.i()));
            x9yVar.o("event_type_ios", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.j()));
            x9yVar.n("uploading_id", mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.v());
            x9yVar.o("seen_info", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.q()));
            x9yVar.o("batch_upload", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.a()));
            x9yVar.o("seen_media_info", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.r()));
            x9yVar.o("photo_info", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.o()));
            x9yVar.o("video_info", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.x()));
            x9yVar.m(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.A(), "is_cold_start_viewer");
            x9yVar.m(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.B(), "is_preview_instance");
            x9yVar.o("story_type_open", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.t()));
            x9yVar.o("preload_story_info", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.p()));
            x9yVar.n("size_minimized", mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.s());
            x9yVar.o("type_next_story", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.u()));
            x9yVar.m(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.D(), "is_show_image_preview");
            x9yVar.m(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.C(), "is_restored_story");
            x9yVar.o("view_entry_point", tru.a().toJson(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.y()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreEncodingStat.kt */
    public static final class TypeNextStory {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeNextStory[] $VALUES;

        @pmi0("NEXT_CONTAINER_STORY")
        public static final TypeNextStory NEXT_CONTAINER_STORY;

        @pmi0("NEXT_STORY")
        public static final TypeNextStory NEXT_STORY;

        @pmi0("PREV_STORY")
        public static final TypeNextStory PREV_STORY;

        @pmi0("RESET_STORY")
        public static final TypeNextStory RESET_STORY;

        static {
            TypeNextStory typeNextStory = new TypeNextStory("NEXT_STORY", 0);
            NEXT_STORY = typeNextStory;
            TypeNextStory typeNextStory2 = new TypeNextStory("PREV_STORY", 1);
            PREV_STORY = typeNextStory2;
            TypeNextStory typeNextStory3 = new TypeNextStory("RESET_STORY", 2);
            RESET_STORY = typeNextStory3;
            TypeNextStory typeNextStory4 = new TypeNextStory("NEXT_CONTAINER_STORY", 3);
            NEXT_CONTAINER_STORY = typeNextStory4;
            TypeNextStory[] typeNextStoryArr = {typeNextStory, typeNextStory2, typeNextStory3, typeNextStory4};
            $VALUES = typeNextStoryArr;
            $ENTRIES = new asp(typeNextStoryArr);
        }

        private TypeNextStory(String str, int i) {
        }

        public static TypeNextStory valueOf(String str) {
            return (TypeNextStory) Enum.valueOf(TypeNextStory.class, str);
        }

        public static TypeNextStory[] values() {
            return (TypeNextStory[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(long j, ContentType contentType, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, Long l, ContentSubtype contentSubtype, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, List<MobileOfficialAppsCoreEncodingStat$EventTimeItem> list, List<? extends MobileOfficialAppsCoreEncodingStat$EncoderTypeItem> list2, Integer num, Integer num2, Integer num3, ErrorType errorType, String str, EventType eventType, EventTypeAndroid eventTypeAndroid, EventTypeIos eventTypeIos, Integer num4, MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem, MobileOfficialAppsConStoriesStat$BatchUpload mobileOfficialAppsConStoriesStat$BatchUpload, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo, MobileOfficialAppsConStoriesStat$PhotoInfo mobileOfficialAppsConStoriesStat$PhotoInfo, MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo, Boolean bool, Boolean bool2, MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen, MobileOfficialAppsConStoriesStat$PreloadStoryInfo mobileOfficialAppsConStoriesStat$PreloadStoryInfo, Integer num5, TypeNextStory typeNextStory, Boolean bool3, Boolean bool4, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        this.ownerId = j;
        this.contentType = contentType;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        this.contentId = l;
        this.contentSubtype = contentSubtype;
        this.deviceInfo = mobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
        this.eventTimes = list;
        this.usedEncoders = list2;
        this.height = num;
        this.width = num2;
        this.fps = num3;
        this.errorType = errorType;
        this.a = str;
        this.eventType = eventType;
        this.eventTypeAndroid = eventTypeAndroid;
        this.eventTypeIos = eventTypeIos;
        this.uploadingId = num4;
        this.seenInfo = mobileOfficialAppsConStoriesStat$VideoSeenItem;
        this.batchUpload = mobileOfficialAppsConStoriesStat$BatchUpload;
        this.seenMediaInfo = mobileOfficialAppsConStoriesStat$SeenMediaInfo;
        this.photoInfo = mobileOfficialAppsConStoriesStat$PhotoInfo;
        this.videoInfo = mobileOfficialAppsConStoriesStat$VideoInfo;
        this.isColdStartViewer = bool;
        this.isPreviewInstance = bool2;
        this.storyTypeOpen = mobileOfficialAppsConStoriesStat$StoryTypeOpen;
        this.preloadStoryInfo = mobileOfficialAppsConStoriesStat$PreloadStoryInfo;
        this.sizeMinimized = num5;
        this.typeNextStory = typeNextStory;
        this.isShowImagePreview = bool3;
        this.isRestoredStory = bool4;
        this.viewEntryPoint = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        FilteredString filteredString = new FilteredString(lhg.b(4096));
        this.filteredErrorDescription = filteredString;
        filteredString.a(str);
    }

    public final Boolean A() {
        return this.isColdStartViewer;
    }

    public final Boolean B() {
        return this.isPreviewInstance;
    }

    public final Boolean C() {
        return this.isRestoredStory;
    }

    public final Boolean D() {
        return this.isShowImagePreview;
    }

    public final MobileOfficialAppsConStoriesStat$BatchUpload a() {
        return this.batchUpload;
    }

    public final Long b() {
        return this.contentId;
    }

    public final ContentSubtype c() {
        return this.contentSubtype;
    }

    public final ContentType d() {
        return this.contentType;
    }

    public final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem e() {
        return this.deviceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem)) {
            return false;
        }
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = (MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem) obj;
        return this.ownerId == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ownerId && this.contentType == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.contentType && epx.f(this.networkInfo, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.networkInfo) && epx.f(this.contentId, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.contentId) && this.contentSubtype == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.contentSubtype && epx.f(this.deviceInfo, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.deviceInfo) && epx.f(this.eventTimes, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.eventTimes) && epx.f(this.usedEncoders, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.usedEncoders) && epx.f(this.height, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.height) && epx.f(this.width, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.width) && epx.f(this.fps, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.fps) && this.errorType == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.errorType && epx.f(this.a, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.a) && this.eventType == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.eventType && this.eventTypeAndroid == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.eventTypeAndroid && this.eventTypeIos == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.eventTypeIos && epx.f(this.uploadingId, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.uploadingId) && epx.f(this.seenInfo, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.seenInfo) && epx.f(this.batchUpload, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.batchUpload) && epx.f(this.seenMediaInfo, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.seenMediaInfo) && epx.f(this.photoInfo, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.photoInfo) && epx.f(this.videoInfo, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.videoInfo) && epx.f(this.isColdStartViewer, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.isColdStartViewer) && epx.f(this.isPreviewInstance, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.isPreviewInstance) && this.storyTypeOpen == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.storyTypeOpen && epx.f(this.preloadStoryInfo, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.preloadStoryInfo) && epx.f(this.sizeMinimized, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.sizeMinimized) && this.typeNextStory == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.typeNextStory && epx.f(this.isShowImagePreview, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.isShowImagePreview) && epx.f(this.isRestoredStory, mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.isRestoredStory) && this.viewEntryPoint == mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.viewEntryPoint;
    }

    public final ErrorType f() {
        return this.errorType;
    }

    public final List<MobileOfficialAppsCoreEncodingStat$EventTimeItem> g() {
        return this.eventTimes;
    }

    public final EventType h() {
        return this.eventType;
    }

    public final int hashCode() {
        int hashCode = (this.networkInfo.hashCode() + ((this.contentType.hashCode() + (Long.hashCode(this.ownerId) * 31)) * 31)) * 31;
        Long l = this.contentId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        ContentSubtype contentSubtype = this.contentSubtype;
        int hashCode3 = (hashCode2 + (contentSubtype == null ? 0 : contentSubtype.hashCode())) * 31;
        MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = this.deviceInfo;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsCoreDeviceStat$DeviceInfoItem == null ? 0 : mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.hashCode())) * 31;
        List<MobileOfficialAppsCoreEncodingStat$EventTimeItem> list = this.eventTimes;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<MobileOfficialAppsCoreEncodingStat$EncoderTypeItem> list2 = this.usedEncoders;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.height;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fps;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ErrorType errorType = this.errorType;
        int hashCode10 = (hashCode9 + (errorType == null ? 0 : errorType.hashCode())) * 31;
        String str = this.a;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        EventType eventType = this.eventType;
        int hashCode12 = (hashCode11 + (eventType == null ? 0 : eventType.hashCode())) * 31;
        EventTypeAndroid eventTypeAndroid = this.eventTypeAndroid;
        int hashCode13 = (hashCode12 + (eventTypeAndroid == null ? 0 : eventTypeAndroid.hashCode())) * 31;
        EventTypeIos eventTypeIos = this.eventTypeIos;
        int hashCode14 = (hashCode13 + (eventTypeIos == null ? 0 : eventTypeIos.hashCode())) * 31;
        Integer num4 = this.uploadingId;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem = this.seenInfo;
        int hashCode16 = (hashCode15 + (mobileOfficialAppsConStoriesStat$VideoSeenItem == null ? 0 : mobileOfficialAppsConStoriesStat$VideoSeenItem.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$BatchUpload mobileOfficialAppsConStoriesStat$BatchUpload = this.batchUpload;
        int hashCode17 = (hashCode16 + (mobileOfficialAppsConStoriesStat$BatchUpload == null ? 0 : mobileOfficialAppsConStoriesStat$BatchUpload.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo = this.seenMediaInfo;
        int hashCode18 = (hashCode17 + (mobileOfficialAppsConStoriesStat$SeenMediaInfo == null ? 0 : mobileOfficialAppsConStoriesStat$SeenMediaInfo.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$PhotoInfo mobileOfficialAppsConStoriesStat$PhotoInfo = this.photoInfo;
        int hashCode19 = (hashCode18 + (mobileOfficialAppsConStoriesStat$PhotoInfo == null ? 0 : mobileOfficialAppsConStoriesStat$PhotoInfo.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo = this.videoInfo;
        int hashCode20 = (hashCode19 + (mobileOfficialAppsConStoriesStat$VideoInfo == null ? 0 : mobileOfficialAppsConStoriesStat$VideoInfo.hashCode())) * 31;
        Boolean bool = this.isColdStartViewer;
        int hashCode21 = (hashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPreviewInstance;
        int hashCode22 = (hashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen = this.storyTypeOpen;
        int hashCode23 = (hashCode22 + (mobileOfficialAppsConStoriesStat$StoryTypeOpen == null ? 0 : mobileOfficialAppsConStoriesStat$StoryTypeOpen.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$PreloadStoryInfo mobileOfficialAppsConStoriesStat$PreloadStoryInfo = this.preloadStoryInfo;
        int hashCode24 = (hashCode23 + (mobileOfficialAppsConStoriesStat$PreloadStoryInfo == null ? 0 : mobileOfficialAppsConStoriesStat$PreloadStoryInfo.hashCode())) * 31;
        Integer num5 = this.sizeMinimized;
        int hashCode25 = (hashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        TypeNextStory typeNextStory = this.typeNextStory;
        int hashCode26 = (hashCode25 + (typeNextStory == null ? 0 : typeNextStory.hashCode())) * 31;
        Boolean bool3 = this.isShowImagePreview;
        int hashCode27 = (hashCode26 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isRestoredStory;
        int hashCode28 = (hashCode27 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = this.viewEntryPoint;
        return hashCode28 + (mobileOfficialAppsConStoriesStat$ViewEntryPoint != null ? mobileOfficialAppsConStoriesStat$ViewEntryPoint.hashCode() : 0);
    }

    public final EventTypeAndroid i() {
        return this.eventTypeAndroid;
    }

    public final EventTypeIos j() {
        return this.eventTypeIos;
    }

    public final Integer k() {
        return this.fps;
    }

    public final Integer l() {
        return this.height;
    }

    public final MobileOfficialAppsCoreDeviceStat$NetworkInfo m() {
        return this.networkInfo;
    }

    public final long n() {
        return this.ownerId;
    }

    public final MobileOfficialAppsConStoriesStat$PhotoInfo o() {
        return this.photoInfo;
    }

    public final MobileOfficialAppsConStoriesStat$PreloadStoryInfo p() {
        return this.preloadStoryInfo;
    }

    public final MobileOfficialAppsConStoriesStat$VideoSeenItem q() {
        return this.seenInfo;
    }

    public final MobileOfficialAppsConStoriesStat$SeenMediaInfo r() {
        return this.seenMediaInfo;
    }

    public final Integer s() {
        return this.sizeMinimized;
    }

    public final MobileOfficialAppsConStoriesStat$StoryTypeOpen t() {
        return this.storyTypeOpen;
    }

    public final String toString() {
        return "TypeStoryVideoItem(ownerId=" + this.ownerId + ", contentType=" + this.contentType + ", networkInfo=" + this.networkInfo + ", contentId=" + this.contentId + ", contentSubtype=" + this.contentSubtype + ", deviceInfo=" + this.deviceInfo + ", eventTimes=" + this.eventTimes + ", usedEncoders=" + this.usedEncoders + ", height=" + this.height + ", width=" + this.width + ", fps=" + this.fps + ", errorType=" + this.errorType + ", errorDescription=" + this.a + ", eventType=" + this.eventType + ", eventTypeAndroid=" + this.eventTypeAndroid + ", eventTypeIos=" + this.eventTypeIos + ", uploadingId=" + this.uploadingId + ", seenInfo=" + this.seenInfo + ", batchUpload=" + this.batchUpload + ", seenMediaInfo=" + this.seenMediaInfo + ", photoInfo=" + this.photoInfo + ", videoInfo=" + this.videoInfo + ", isColdStartViewer=" + this.isColdStartViewer + ", isPreviewInstance=" + this.isPreviewInstance + ", storyTypeOpen=" + this.storyTypeOpen + ", preloadStoryInfo=" + this.preloadStoryInfo + ", sizeMinimized=" + this.sizeMinimized + ", typeNextStory=" + this.typeNextStory + ", isShowImagePreview=" + this.isShowImagePreview + ", isRestoredStory=" + this.isRestoredStory + ", viewEntryPoint=" + this.viewEntryPoint + ')';
    }

    public final TypeNextStory u() {
        return this.typeNextStory;
    }

    public final Integer v() {
        return this.uploadingId;
    }

    public final List<MobileOfficialAppsCoreEncodingStat$EncoderTypeItem> w() {
        return this.usedEncoders;
    }

    public final MobileOfficialAppsConStoriesStat$VideoInfo x() {
        return this.videoInfo;
    }

    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint y() {
        return this.viewEntryPoint;
    }

    public final Integer z() {
        return this.width;
    }

    public /* synthetic */ MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(long j, ContentType contentType, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, Long l, ContentSubtype contentSubtype, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, List list, List list2, Integer num, Integer num2, Integer num3, ErrorType errorType, String str, EventType eventType, EventTypeAndroid eventTypeAndroid, EventTypeIos eventTypeIos, Integer num4, MobileOfficialAppsConStoriesStat$VideoSeenItem mobileOfficialAppsConStoriesStat$VideoSeenItem, MobileOfficialAppsConStoriesStat$BatchUpload mobileOfficialAppsConStoriesStat$BatchUpload, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo, MobileOfficialAppsConStoriesStat$PhotoInfo mobileOfficialAppsConStoriesStat$PhotoInfo, MobileOfficialAppsConStoriesStat$VideoInfo mobileOfficialAppsConStoriesStat$VideoInfo, Boolean bool, Boolean bool2, MobileOfficialAppsConStoriesStat$StoryTypeOpen mobileOfficialAppsConStoriesStat$StoryTypeOpen, MobileOfficialAppsConStoriesStat$PreloadStoryInfo mobileOfficialAppsConStoriesStat$PreloadStoryInfo, Integer num5, TypeNextStory typeNextStory, Boolean bool3, Boolean bool4, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, int i, zcl zclVar) {
        this(j, contentType, mobileOfficialAppsCoreDeviceStat$NetworkInfo, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : contentSubtype, (i & 32) != 0 ? null : mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : errorType, (i & 4096) != 0 ? null : str, (i & 8192) != 0 ? null : eventType, (i & 16384) != 0 ? null : eventTypeAndroid, (32768 & i) != 0 ? null : eventTypeIos, (65536 & i) != 0 ? null : num4, (131072 & i) != 0 ? null : mobileOfficialAppsConStoriesStat$VideoSeenItem, (262144 & i) != 0 ? null : mobileOfficialAppsConStoriesStat$BatchUpload, (524288 & i) != 0 ? null : mobileOfficialAppsConStoriesStat$SeenMediaInfo, (1048576 & i) != 0 ? null : mobileOfficialAppsConStoriesStat$PhotoInfo, (2097152 & i) != 0 ? null : mobileOfficialAppsConStoriesStat$VideoInfo, (4194304 & i) != 0 ? null : bool, (8388608 & i) != 0 ? null : bool2, (16777216 & i) != 0 ? null : mobileOfficialAppsConStoriesStat$StoryTypeOpen, (33554432 & i) != 0 ? null : mobileOfficialAppsConStoriesStat$PreloadStoryInfo, (67108864 & i) != 0 ? null : num5, (134217728 & i) != 0 ? null : typeNextStory, (268435456 & i) != 0 ? null : bool3, (536870912 & i) != 0 ? null : bool4, (i & 1073741824) != 0 ? null : mobileOfficialAppsConStoriesStat$ViewEntryPoint);
    }
}
