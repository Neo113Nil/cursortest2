package com.vk.core.files;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivateSubdir.kt */
/* loaded from: classes.dex */
public final class PrivateSubdir {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PrivateSubdir[] $VALUES;
    public static final PrivateSubdir AUDIO_MESSAGE;
    public static final PrivateSubdir BASE;
    public static final PrivateSubdir BASE_CACHE;
    public static final PrivateSubdir BASE_HIDDEN;
    public static final PrivateSubdir CHAT_BACKGROUNDS;

    @ozl
    public static final PrivateSubdir CLIPS;
    public static final PrivateSubdir CLIPS_AUDIO;
    public static final PrivateSubdir CLIPS_CAMERA;
    public static final PrivateSubdir CLIPS_DISK_CACHE;
    public static final PrivateSubdir CLIPS_PREVIEW;
    public static final PrivateSubdir CLIPS_TEMP_DOWNLOADS;
    public static final PrivateSubdir CLIPS_VIDEO;
    public static final PrivateSubdir DOWNLOADED_VIDEO_FILES;
    public static final PrivateSubdir DOWNLOADED_VIDEO_IMAGES;
    public static final PrivateSubdir DUETS_DOWNLOAD;
    public static final PrivateSubdir FRIENDS_AVATARS;
    public static final PrivateSubdir GAME_WEB_VIEW;
    public static final PrivateSubdir GIF;
    public static final PrivateSubdir GPU_TFL_CACHE;
    public static final PrivateSubdir HARMONY_OS_STORAGE;
    public static final PrivateSubdir HTTP_CACHE;
    public static final PrivateSubdir IM;
    public static final PrivateSubdir INTERNAL_TEMP_UPLOADS;
    public static final PrivateSubdir LARGE_TEMP_UPLOADS;
    public static final PrivateSubdir LOGS;
    public static final PrivateSubdir MASKS;
    public static final PrivateSubdir MATCHED_PLAYLIST_SHARE;
    public static final PrivateSubdir MEDIA;
    public static final PrivateSubdir MINI_APP_LOCAL_STORAGE;
    public static final PrivateSubdir MINI_APP_WEB_VIEW;
    public static final PrivateSubdir ML_MODELS;
    public static final PrivateSubdir MSG_REACTION_ASSETS;
    public static final PrivateSubdir MUSIC_PLAYER_CACHE;
    public static final PrivateSubdir MUSIC_PREFETCH;
    public static final PrivateSubdir MUSIC_STICKER;
    public static final PrivateSubdir OFFLINE_MUSIC_PRIVATE;
    public static final PrivateSubdir OFFLINE_MUSIC_PUBLIC;
    public static final PrivateSubdir OFFLINE_MUSIC_PUBLIC_EXTERNAL;
    public static final PrivateSubdir OFFLINE_MUSIC_PUBLIC_INTERNAL;
    public static final PrivateSubdir PERFORMANCE;
    public static final PrivateSubdir PHOTO_EDITOR;
    public static final PrivateSubdir POSTING_FILE_COPIES;
    public static final PrivateSubdir PREFETCH_MUSIC_PRIVATE;
    public static final PrivateSubdir RANDOM_MUSIC_COVERS;
    public static final PrivateSubdir SMALL_FILE;
    public static final PrivateSubdir STICKERS;
    public static final PrivateSubdir STORIES;
    public static final PrivateSubdir STORIES_BACKGROUND;
    public static final PrivateSubdir STORIES_FAILED_UPLOAD;
    public static final PrivateSubdir STORIES_TEMP;
    public static final PrivateSubdir STORIES_VIEWER_VIDEO;
    public static final PrivateSubdir SUPERAPP;
    public static final PrivateSubdir TEMP_CHAT_SCREENSHOTS;
    public static final PrivateSubdir TEMP_UPLOADS;
    public static final PrivateSubdir TRACES;
    public static final PrivateSubdir TV_DISK_CACHE;
    public static final PrivateSubdir VIDEO;

    @ozl
    public static final PrivateSubdir VIDEO_DOWNLOADS;
    public static final PrivateSubdir VIDEO_DOWNLOADS_INTERNAL;
    public static final PrivateSubdir VIDEO_LIVE_COVERS;
    public static final PrivateSubdir VIDEO_MESSAGES_CACHE;
    public static final PrivateSubdir VIDEO_PLAYBACK_CACHE;
    public static final PrivateSubdir VK_APPS;
    public static final PrivateSubdir VMOJI;
    public static final PrivateSubdir WEBVIEW;
    private final PrivateLocation$Guaranteed defaultLocation;
    private final String relativePath;

    static {
        PrivateLocation$Guaranteed privateLocation$Guaranteed = PrivateLocation$Guaranteed.SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE;
        PrivateSubdir privateSubdir = new PrivateSubdir("BASE", 0, "", privateLocation$Guaranteed);
        BASE = privateSubdir;
        PrivateLocation$Guaranteed privateLocation$Guaranteed2 = PrivateLocation$Guaranteed.SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE;
        PrivateSubdir privateSubdir2 = new PrivateSubdir("BASE_CACHE", 1, "", privateLocation$Guaranteed2);
        BASE_CACHE = privateSubdir2;
        PrivateSubdir privateSubdir3 = new PrivateSubdir("BASE_HIDDEN", 2, ".vkontakte", privateLocation$Guaranteed);
        BASE_HIDDEN = privateSubdir3;
        PrivateLocation$Guaranteed privateLocation$Guaranteed3 = PrivateLocation$Guaranteed.EXTERNAL_OR_INTERNAL_STORAGE;
        PrivateSubdir privateSubdir4 = new PrivateSubdir("GIF", 3, ".vkontakte/autoplay_gif_cache", privateLocation$Guaranteed3);
        GIF = privateSubdir4;
        PrivateLocation$Guaranteed privateLocation$Guaranteed4 = PrivateLocation$Guaranteed.INTERNAL_CACHE;
        PrivateSubdir privateSubdir5 = new PrivateSubdir("SMALL_FILE", 4, "cache_small_file", privateLocation$Guaranteed4);
        SMALL_FILE = privateSubdir5;
        PrivateSubdir privateSubdir6 = new PrivateSubdir("MUSIC_STICKER", 5, "cache_music_sticker", privateLocation$Guaranteed4);
        MUSIC_STICKER = privateSubdir6;
        PrivateLocation$Guaranteed privateLocation$Guaranteed5 = PrivateLocation$Guaranteed.EXTERNAL_OR_INTERNAL_CACHE;
        PrivateSubdir privateSubdir7 = new PrivateSubdir("MUSIC_PREFETCH", 6, ".vkontakte/music_preload_cache", privateLocation$Guaranteed5);
        MUSIC_PREFETCH = privateSubdir7;
        PrivateSubdir privateSubdir8 = new PrivateSubdir("MUSIC_PLAYER_CACHE", 7, ".vkontakte/music_player_cache", privateLocation$Guaranteed5);
        MUSIC_PLAYER_CACHE = privateSubdir8;
        PrivateSubdir privateSubdir9 = new PrivateSubdir("CLIPS", 8, "clips_cache", privateLocation$Guaranteed);
        CLIPS = privateSubdir9;
        PrivateSubdir privateSubdir10 = new PrivateSubdir("CLIPS_DISK_CACHE", 9, "clips_disk_cache", privateLocation$Guaranteed);
        CLIPS_DISK_CACHE = privateSubdir10;
        PrivateSubdir privateSubdir11 = new PrivateSubdir(SignalingProtocol.MEDIA_OPTION_VIDEO, 10, ".vkontakte/vcache", privateLocation$Guaranteed3);
        VIDEO = privateSubdir11;
        PrivateSubdir privateSubdir12 = new PrivateSubdir("VIDEO_PLAYBACK_CACHE", 11, "playback_cache", privateLocation$Guaranteed);
        VIDEO_PLAYBACK_CACHE = privateSubdir12;
        PrivateSubdir privateSubdir13 = new PrivateSubdir("VIDEO_MESSAGES_CACHE", 12, "messages_cache", privateLocation$Guaranteed);
        VIDEO_MESSAGES_CACHE = privateSubdir13;
        PrivateSubdir privateSubdir14 = new PrivateSubdir("ML_MODELS", 13, ".vkontakte/m", privateLocation$Guaranteed3);
        ML_MODELS = privateSubdir14;
        PrivateSubdir privateSubdir15 = new PrivateSubdir("INTERNAL_TEMP_UPLOADS", 14, "InternalTempUploads", privateLocation$Guaranteed4);
        INTERNAL_TEMP_UPLOADS = privateSubdir15;
        PrivateSubdir privateSubdir16 = new PrivateSubdir("TEMP_UPLOADS", 15, "TempUploads", privateLocation$Guaranteed4);
        TEMP_UPLOADS = privateSubdir16;
        PrivateSubdir privateSubdir17 = new PrivateSubdir("TEMP_CHAT_SCREENSHOTS", 16, "TempUploads/chat_screenshots", privateLocation$Guaranteed4);
        TEMP_CHAT_SCREENSHOTS = privateSubdir17;
        PrivateSubdir privateSubdir18 = new PrivateSubdir("MATCHED_PLAYLIST_SHARE", 17, "TempUploads/matched_playlist", privateLocation$Guaranteed4);
        MATCHED_PLAYLIST_SHARE = privateSubdir18;
        PrivateSubdir privateSubdir19 = new PrivateSubdir("POSTING_FILE_COPIES", 18, ".vkontakte/PostingFilesCopies", privateLocation$Guaranteed5);
        POSTING_FILE_COPIES = privateSubdir19;
        PrivateSubdir privateSubdir20 = new PrivateSubdir("LARGE_TEMP_UPLOADS", 19, "LargeTempUploads", privateLocation$Guaranteed5);
        LARGE_TEMP_UPLOADS = privateSubdir20;
        PrivateLocation$Guaranteed privateLocation$Guaranteed6 = PrivateLocation$Guaranteed.INTERNAL_STORAGE;
        PrivateSubdir privateSubdir21 = new PrivateSubdir("VIDEO_LIVE_COVERS", 20, "vcache_lc", privateLocation$Guaranteed6);
        VIDEO_LIVE_COVERS = privateSubdir21;
        PrivateSubdir privateSubdir22 = new PrivateSubdir("VIDEO_DOWNLOADS", 21, "video_downloads", privateLocation$Guaranteed3);
        VIDEO_DOWNLOADS = privateSubdir22;
        PrivateSubdir privateSubdir23 = new PrivateSubdir("VIDEO_DOWNLOADS_INTERNAL", 22, "video_downloads_internal", privateLocation$Guaranteed6);
        VIDEO_DOWNLOADS_INTERNAL = privateSubdir23;
        PrivateSubdir privateSubdir24 = new PrivateSubdir("STICKERS", 23, "scache", privateLocation$Guaranteed4);
        STICKERS = privateSubdir24;
        PrivateSubdir privateSubdir25 = new PrivateSubdir("VK_APPS", 24, "cache_vkapps", privateLocation$Guaranteed4);
        VK_APPS = privateSubdir25;
        PrivateSubdir privateSubdir26 = new PrivateSubdir("STORIES", 25, "internal_stories", privateLocation$Guaranteed4);
        STORIES = privateSubdir26;
        PrivateSubdir privateSubdir27 = new PrivateSubdir("STORIES_FAILED_UPLOAD", 26, "internal_stories/failed_upload", privateLocation$Guaranteed4);
        STORIES_FAILED_UPLOAD = privateSubdir27;
        PrivateSubdir privateSubdir28 = new PrivateSubdir("STORIES_BACKGROUND", 27, "internal_stories/background", privateLocation$Guaranteed4);
        STORIES_BACKGROUND = privateSubdir28;
        PrivateSubdir privateSubdir29 = new PrivateSubdir("STORIES_TEMP", 28, "stories_temp", privateLocation$Guaranteed6);
        STORIES_TEMP = privateSubdir29;
        PrivateSubdir privateSubdir30 = new PrivateSubdir("STORIES_VIEWER_VIDEO", 29, "stories_viewer_video", privateLocation$Guaranteed4);
        STORIES_VIEWER_VIDEO = privateSubdir30;
        PrivateSubdir privateSubdir31 = new PrivateSubdir("LOGS", 30, "logs", privateLocation$Guaranteed4);
        LOGS = privateSubdir31;
        PrivateSubdir privateSubdir32 = new PrivateSubdir("IM", 31, ".vkontakte/im_temp", privateLocation$Guaranteed3);
        IM = privateSubdir32;
        PrivateSubdir privateSubdir33 = new PrivateSubdir("WEBVIEW", 32, ".vkontakte/cache/html", privateLocation$Guaranteed3);
        WEBVIEW = privateSubdir33;
        PrivateSubdir privateSubdir34 = new PrivateSubdir("CLIPS_TEMP_DOWNLOADS", 33, "clips_temp", privateLocation$Guaranteed5);
        CLIPS_TEMP_DOWNLOADS = privateSubdir34;
        PrivateSubdir privateSubdir35 = new PrivateSubdir("CLIPS_VIDEO", 34, ".vkontakte/clips", privateLocation$Guaranteed3);
        CLIPS_VIDEO = privateSubdir35;
        PrivateSubdir privateSubdir36 = new PrivateSubdir("CLIPS_CAMERA", 35, ".vkontakte/camera_clips", privateLocation$Guaranteed3);
        CLIPS_CAMERA = privateSubdir36;
        PrivateSubdir privateSubdir37 = new PrivateSubdir("CLIPS_AUDIO", 36, ".vkontakte/clips_audio", privateLocation$Guaranteed3);
        CLIPS_AUDIO = privateSubdir37;
        PrivateSubdir privateSubdir38 = new PrivateSubdir("CLIPS_PREVIEW", 37, ".vkontakte/clips_preview", privateLocation$Guaranteed3);
        CLIPS_PREVIEW = privateSubdir38;
        PrivateSubdir privateSubdir39 = new PrivateSubdir("AUDIO_MESSAGE", 38, "audio_msg_player_default_cache", privateLocation$Guaranteed4);
        AUDIO_MESSAGE = privateSubdir39;
        PrivateSubdir privateSubdir40 = new PrivateSubdir("SUPERAPP", 39, "superapp", privateLocation$Guaranteed5);
        SUPERAPP = privateSubdir40;
        PrivateSubdir privateSubdir41 = new PrivateSubdir("DUETS_DOWNLOAD", 40, ".vkontakte/duets_download", privateLocation$Guaranteed2);
        DUETS_DOWNLOAD = privateSubdir41;
        PrivateSubdir privateSubdir42 = new PrivateSubdir("FRIENDS_AVATARS", 41, ".vkontakte/friends_avatars", privateLocation$Guaranteed2);
        FRIENDS_AVATARS = privateSubdir42;
        PrivateSubdir privateSubdir43 = new PrivateSubdir("RANDOM_MUSIC_COVERS", 42, ".vkontakte/random_music_covers", privateLocation$Guaranteed2);
        RANDOM_MUSIC_COVERS = privateSubdir43;
        PrivateSubdir privateSubdir44 = new PrivateSubdir("OFFLINE_MUSIC_PRIVATE", 43, "offline_music_private", privateLocation$Guaranteed6);
        OFFLINE_MUSIC_PRIVATE = privateSubdir44;
        PrivateSubdir privateSubdir45 = new PrivateSubdir("PREFETCH_MUSIC_PRIVATE", 44, "prefetch_offline_music_private", privateLocation$Guaranteed6);
        PREFETCH_MUSIC_PRIVATE = privateSubdir45;
        PrivateSubdir privateSubdir46 = new PrivateSubdir("OFFLINE_MUSIC_PUBLIC", 45, ".vkontakte/offline_music", privateLocation$Guaranteed);
        OFFLINE_MUSIC_PUBLIC = privateSubdir46;
        PrivateSubdir privateSubdir47 = new PrivateSubdir("OFFLINE_MUSIC_PUBLIC_EXTERNAL", 46, ".vkontakte/offline_music", privateLocation$Guaranteed3);
        OFFLINE_MUSIC_PUBLIC_EXTERNAL = privateSubdir47;
        PrivateSubdir privateSubdir48 = new PrivateSubdir("OFFLINE_MUSIC_PUBLIC_INTERNAL", 47, ".vkontakte/offline_music", privateLocation$Guaranteed6);
        OFFLINE_MUSIC_PUBLIC_INTERNAL = privateSubdir48;
        PrivateSubdir privateSubdir49 = new PrivateSubdir("GPU_TFL_CACHE", 48, "cache_clips_gpu_tfl", privateLocation$Guaranteed4);
        GPU_TFL_CACHE = privateSubdir49;
        PrivateSubdir privateSubdir50 = new PrivateSubdir("CHAT_BACKGROUNDS", 49, "backgrounds_cache", privateLocation$Guaranteed6);
        CHAT_BACKGROUNDS = privateSubdir50;
        PrivateSubdir privateSubdir51 = new PrivateSubdir("HARMONY_OS_STORAGE", 50, ".vkontakte/ohos", privateLocation$Guaranteed);
        HARMONY_OS_STORAGE = privateSubdir51;
        PrivateSubdir privateSubdir52 = new PrivateSubdir("TRACES", 51, "Traces", privateLocation$Guaranteed2);
        TRACES = privateSubdir52;
        PrivateSubdir privateSubdir53 = new PrivateSubdir("MASKS", 52, ".vkontakte/masks", privateLocation$Guaranteed);
        MASKS = privateSubdir53;
        PrivateSubdir privateSubdir54 = new PrivateSubdir("MEDIA", 53, ".vkontakte/media_files", privateLocation$Guaranteed3);
        MEDIA = privateSubdir54;
        PrivateSubdir privateSubdir55 = new PrivateSubdir("MSG_REACTION_ASSETS", 54, "msg_reaction_assets", privateLocation$Guaranteed3);
        MSG_REACTION_ASSETS = privateSubdir55;
        PrivateSubdir privateSubdir56 = new PrivateSubdir("VMOJI", 55, "voip_vmoji_cache", privateLocation$Guaranteed4);
        VMOJI = privateSubdir56;
        PrivateSubdir privateSubdir57 = new PrivateSubdir("MINI_APP_WEB_VIEW", 56, "mini_app_web_view_cache", privateLocation$Guaranteed4);
        MINI_APP_WEB_VIEW = privateSubdir57;
        PrivateSubdir privateSubdir58 = new PrivateSubdir("GAME_WEB_VIEW", 57, "game_web_view_cache", privateLocation$Guaranteed4);
        GAME_WEB_VIEW = privateSubdir58;
        PrivateSubdir privateSubdir59 = new PrivateSubdir("PHOTO_EDITOR", 58, "photo_editor", privateLocation$Guaranteed6);
        PHOTO_EDITOR = privateSubdir59;
        PrivateSubdir privateSubdir60 = new PrivateSubdir("DOWNLOADED_VIDEO_IMAGES", 59, "downloaded_video_images", privateLocation$Guaranteed6);
        DOWNLOADED_VIDEO_IMAGES = privateSubdir60;
        PrivateSubdir privateSubdir61 = new PrivateSubdir("DOWNLOADED_VIDEO_FILES", 60, "downloaded_video_files", privateLocation$Guaranteed6);
        DOWNLOADED_VIDEO_FILES = privateSubdir61;
        PrivateSubdir privateSubdir62 = new PrivateSubdir("PERFORMANCE", 61, "performance", privateLocation$Guaranteed6);
        PERFORMANCE = privateSubdir62;
        PrivateSubdir privateSubdir63 = new PrivateSubdir("MINI_APP_LOCAL_STORAGE", 62, "mini_app_local_storage_cache", privateLocation$Guaranteed6);
        MINI_APP_LOCAL_STORAGE = privateSubdir63;
        PrivateSubdir privateSubdir64 = new PrivateSubdir("HTTP_CACHE", 63, "http_cache", privateLocation$Guaranteed4);
        HTTP_CACHE = privateSubdir64;
        PrivateSubdir privateSubdir65 = new PrivateSubdir("TV_DISK_CACHE", 64, "tv_disk_cache", privateLocation$Guaranteed);
        TV_DISK_CACHE = privateSubdir65;
        PrivateSubdir[] privateSubdirArr = {privateSubdir, privateSubdir2, privateSubdir3, privateSubdir4, privateSubdir5, privateSubdir6, privateSubdir7, privateSubdir8, privateSubdir9, privateSubdir10, privateSubdir11, privateSubdir12, privateSubdir13, privateSubdir14, privateSubdir15, privateSubdir16, privateSubdir17, privateSubdir18, privateSubdir19, privateSubdir20, privateSubdir21, privateSubdir22, privateSubdir23, privateSubdir24, privateSubdir25, privateSubdir26, privateSubdir27, privateSubdir28, privateSubdir29, privateSubdir30, privateSubdir31, privateSubdir32, privateSubdir33, privateSubdir34, privateSubdir35, privateSubdir36, privateSubdir37, privateSubdir38, privateSubdir39, privateSubdir40, privateSubdir41, privateSubdir42, privateSubdir43, privateSubdir44, privateSubdir45, privateSubdir46, privateSubdir47, privateSubdir48, privateSubdir49, privateSubdir50, privateSubdir51, privateSubdir52, privateSubdir53, privateSubdir54, privateSubdir55, privateSubdir56, privateSubdir57, privateSubdir58, privateSubdir59, privateSubdir60, privateSubdir61, privateSubdir62, privateSubdir63, privateSubdir64, privateSubdir65};
        $VALUES = privateSubdirArr;
        $ENTRIES = new asp(privateSubdirArr);
    }

    public PrivateSubdir(String str, int i, String str2, PrivateLocation$Guaranteed privateLocation$Guaranteed) {
        this.relativePath = str2;
        this.defaultLocation = privateLocation$Guaranteed;
    }

    public static PrivateSubdir valueOf(String str) {
        return (PrivateSubdir) Enum.valueOf(PrivateSubdir.class, str);
    }

    public static PrivateSubdir[] values() {
        return (PrivateSubdir[]) $VALUES.clone();
    }

    public final PrivateLocation$Guaranteed h() {
        return this.defaultLocation;
    }

    public final String i() {
        return this.relativePath;
    }
}
