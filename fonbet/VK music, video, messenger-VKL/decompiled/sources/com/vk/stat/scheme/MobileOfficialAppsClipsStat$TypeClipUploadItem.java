package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.iq;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.uay;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipUploadItem {

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("audio_owner_id")
    private final Long audioOwnerId;

    @pmi0("banner_id")
    private final Integer bannerId;

    @pmi0("camera_type")
    private final CameraType cameraType;

    @pmi0("clickable_stickers")
    private final List<MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem> clickableStickers;

    @pmi0("clips_create_context")
    private final MobileOfficialAppsClipsStat$ClipsCreateContext clipsCreateContext;

    @pmi0("duet_type")
    private final DuetType duetType;

    @pmi0("emojies")
    private final List<String> emojies;

    @pmi0("event_type")
    private final String eventType;

    @pmi0("filters")
    private final List<String> filters;

    @pmi0("frames_count")
    private final int framesCount;

    @pmi0("has_audio_imported")
    private final Boolean hasAudioImported;

    @pmi0("has_clickable_stickers")
    private final Boolean hasClickableStickers;

    @pmi0("has_emoji")
    private final Boolean hasEmoji;

    @pmi0("has_mask")
    private final Boolean hasMask;

    @pmi0("has_sticker")
    private final Boolean hasSticker;

    @pmi0("has_text")
    private final Boolean hasText;

    @pmi0("has_voiceover")
    private final Boolean hasVoiceover;

    @pmi0("hashtags")
    private final List<String> hashtags;

    @pmi0("is_added_to_playlist")
    private final Boolean isAddedToPlaylist;

    @pmi0("is_audio_speed_changed")
    private final Boolean isAudioSpeedChanged;

    @pmi0("is_authors_ad")
    private final Boolean isAuthorsAd;

    @pmi0("is_original_quality")
    private final Boolean isOriginalQuality;

    @pmi0("is_video_speed_changed")
    private final Boolean isVideoSpeedChanged;

    @pmi0("mask")
    private final List<MobileOfficialAppsClipsStat$ClipUploadMaskItem> mask;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("playlist_owner_id")
    private final Long playlistOwnerId;

    @pmi0("preview_type")
    private final PreviewType previewType;

    @pmi0("privacy")
    private final String privacy;

    @pmi0("settings")
    private final List<MobileOfficialAppsClipsStat$ClipUploadSettingItem> settings;

    @pmi0("stickers")
    private final List<MobileOfficialAppsClipsStat$ClipUploadStickerItem> stickers;

    @pmi0("template_id")
    private final Integer templateId;

    @pmi0("template_owner_id")
    private final Long templateOwnerId;

    @pmi0("texts")
    private final List<MobileOfficialAppsClipsStat$ClipUploadTextItem> texts;

    @pmi0("time")
    private final Long time;

    @pmi0("video_clip_description")
    private final String videoClipDescription;

    @pmi0(CampaignEx.JSON_KEY_VIDEO_LENGTHL)
    private final int videoLength;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class CameraType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CameraType[] $VALUES;

        @pmi0("back")
        public static final CameraType BACK;

        @pmi0("front")
        public static final CameraType FRONT;

        @pmi0("gallery")
        public static final CameraType GALLERY;

        @pmi0("multi")
        public static final CameraType MULTI;

        static {
            CameraType cameraType = new CameraType("FRONT", 0);
            FRONT = cameraType;
            CameraType cameraType2 = new CameraType("BACK", 1);
            BACK = cameraType2;
            CameraType cameraType3 = new CameraType("GALLERY", 2);
            GALLERY = cameraType3;
            CameraType cameraType4 = new CameraType("MULTI", 3);
            MULTI = cameraType4;
            CameraType[] cameraTypeArr = {cameraType, cameraType2, cameraType3, cameraType4};
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
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    /* loaded from: classes11.dex */
    public static final class DuetType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DuetType[] $VALUES;
        public static final DuetType CAMERA_ONLY;
        public static final DuetType LEFT_RIGHT;
        public static final DuetType LEFT_RIGHT_CENTER;
        public static final DuetType TOP_BOTTOM;
        public static final DuetType WINDOW;
        private final int value;

        /* compiled from: MobileOfficialAppsClipsStat.kt */
        public static final class Serializer implements uay<DuetType> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((DuetType) obj).value));
            }
        }

        static {
            DuetType duetType = new DuetType("LEFT_RIGHT_CENTER", 0, 1);
            LEFT_RIGHT_CENTER = duetType;
            DuetType duetType2 = new DuetType("WINDOW", 1, 2);
            WINDOW = duetType2;
            DuetType duetType3 = new DuetType("LEFT_RIGHT", 2, 3);
            LEFT_RIGHT = duetType3;
            DuetType duetType4 = new DuetType("TOP_BOTTOM", 3, 4);
            TOP_BOTTOM = duetType4;
            DuetType duetType5 = new DuetType("CAMERA_ONLY", 4, 5);
            CAMERA_ONLY = duetType5;
            DuetType[] duetTypeArr = {duetType, duetType2, duetType3, duetType4, duetType5};
            $VALUES = duetTypeArr;
            $ENTRIES = new asp(duetTypeArr);
        }

        public DuetType(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<DuetType> h() {
            return $ENTRIES;
        }

        public static DuetType valueOf(String str) {
            return (DuetType) Enum.valueOf(DuetType.class, str);
        }

        public static DuetType[] values() {
            return (DuetType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class PreviewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PreviewType[] $VALUES;

        @pmi0("first_frame")
        public static final PreviewType FIRST_FRAME;

        @pmi0("gallery")
        public static final PreviewType GALLERY;

        @pmi0("original")
        public static final PreviewType ORIGINAL;

        static {
            PreviewType previewType = new PreviewType("FIRST_FRAME", 0);
            FIRST_FRAME = previewType;
            PreviewType previewType2 = new PreviewType("ORIGINAL", 1);
            ORIGINAL = previewType2;
            PreviewType previewType3 = new PreviewType("GALLERY", 2);
            GALLERY = previewType3;
            PreviewType[] previewTypeArr = {previewType, previewType2, previewType3};
            $VALUES = previewTypeArr;
            $ENTRIES = new asp(previewTypeArr);
        }

        private PreviewType(String str, int i) {
        }

        public static PreviewType valueOf(String str) {
            return (PreviewType) Enum.valueOf(PreviewType.class, str);
        }

        public static PreviewType[] values() {
            return (PreviewType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeClipUploadItem(String str, int i, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, int i2, CameraType cameraType, PreviewType previewType, Integer num, Long l, Integer num2, Long l2, Integer num3, List<String> list, Integer num4, Long l3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str2, DuetType duetType, Boolean bool7, String str3, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, List<MobileOfficialAppsClipsStat$ClipUploadMaskItem> list2, List<String> list3, List<String> list4, List<MobileOfficialAppsClipsStat$ClipUploadStickerItem> list5, List<MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem> list6, List<MobileOfficialAppsClipsStat$ClipUploadTextItem> list7, List<MobileOfficialAppsClipsStat$ClipUploadSettingItem> list8, Long l4) {
        this.eventType = str;
        this.framesCount = i;
        this.clipsCreateContext = mobileOfficialAppsClipsStat$ClipsCreateContext;
        this.videoLength = i2;
        this.cameraType = cameraType;
        this.previewType = previewType;
        this.audioId = num;
        this.audioOwnerId = l;
        this.playlistId = num2;
        this.playlistOwnerId = l2;
        this.bannerId = num3;
        this.hashtags = list;
        this.templateId = num4;
        this.templateOwnerId = l3;
        this.hasAudioImported = bool;
        this.hasVoiceover = bool2;
        this.isAddedToPlaylist = bool3;
        this.isAudioSpeedChanged = bool4;
        this.isVideoSpeedChanged = bool5;
        this.isAuthorsAd = bool6;
        this.videoClipDescription = str2;
        this.duetType = duetType;
        this.isOriginalQuality = bool7;
        this.privacy = str3;
        this.hasMask = bool8;
        this.hasSticker = bool9;
        this.hasEmoji = bool10;
        this.hasText = bool11;
        this.hasClickableStickers = bool12;
        this.mask = list2;
        this.emojies = list3;
        this.filters = list4;
        this.stickers = list5;
        this.clickableStickers = list6;
        this.texts = list7;
        this.settings = list8;
        this.time = l4;
    }

    public static MobileOfficialAppsClipsStat$TypeClipUploadItem a(MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem, Boolean bool) {
        String str = mobileOfficialAppsClipsStat$TypeClipUploadItem.eventType;
        int i = mobileOfficialAppsClipsStat$TypeClipUploadItem.framesCount;
        MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext = mobileOfficialAppsClipsStat$TypeClipUploadItem.clipsCreateContext;
        int i2 = mobileOfficialAppsClipsStat$TypeClipUploadItem.videoLength;
        CameraType cameraType = mobileOfficialAppsClipsStat$TypeClipUploadItem.cameraType;
        PreviewType previewType = mobileOfficialAppsClipsStat$TypeClipUploadItem.previewType;
        Integer num = mobileOfficialAppsClipsStat$TypeClipUploadItem.audioId;
        Long l = mobileOfficialAppsClipsStat$TypeClipUploadItem.audioOwnerId;
        Integer num2 = mobileOfficialAppsClipsStat$TypeClipUploadItem.playlistId;
        Long l2 = mobileOfficialAppsClipsStat$TypeClipUploadItem.playlistOwnerId;
        Integer num3 = mobileOfficialAppsClipsStat$TypeClipUploadItem.bannerId;
        List<String> list = mobileOfficialAppsClipsStat$TypeClipUploadItem.hashtags;
        Integer num4 = mobileOfficialAppsClipsStat$TypeClipUploadItem.templateId;
        Long l3 = mobileOfficialAppsClipsStat$TypeClipUploadItem.templateOwnerId;
        Boolean bool2 = mobileOfficialAppsClipsStat$TypeClipUploadItem.hasAudioImported;
        Boolean bool3 = mobileOfficialAppsClipsStat$TypeClipUploadItem.hasVoiceover;
        Boolean bool4 = mobileOfficialAppsClipsStat$TypeClipUploadItem.isAddedToPlaylist;
        Boolean bool5 = mobileOfficialAppsClipsStat$TypeClipUploadItem.isAudioSpeedChanged;
        Boolean bool6 = mobileOfficialAppsClipsStat$TypeClipUploadItem.isVideoSpeedChanged;
        Boolean bool7 = mobileOfficialAppsClipsStat$TypeClipUploadItem.isAuthorsAd;
        String str2 = mobileOfficialAppsClipsStat$TypeClipUploadItem.videoClipDescription;
        DuetType duetType = mobileOfficialAppsClipsStat$TypeClipUploadItem.duetType;
        String str3 = mobileOfficialAppsClipsStat$TypeClipUploadItem.privacy;
        Boolean bool8 = mobileOfficialAppsClipsStat$TypeClipUploadItem.hasMask;
        Boolean bool9 = mobileOfficialAppsClipsStat$TypeClipUploadItem.hasSticker;
        Boolean bool10 = mobileOfficialAppsClipsStat$TypeClipUploadItem.hasEmoji;
        Boolean bool11 = mobileOfficialAppsClipsStat$TypeClipUploadItem.hasText;
        Boolean bool12 = mobileOfficialAppsClipsStat$TypeClipUploadItem.hasClickableStickers;
        List<MobileOfficialAppsClipsStat$ClipUploadMaskItem> list2 = mobileOfficialAppsClipsStat$TypeClipUploadItem.mask;
        List<String> list3 = mobileOfficialAppsClipsStat$TypeClipUploadItem.emojies;
        List<String> list4 = mobileOfficialAppsClipsStat$TypeClipUploadItem.filters;
        List<MobileOfficialAppsClipsStat$ClipUploadStickerItem> list5 = mobileOfficialAppsClipsStat$TypeClipUploadItem.stickers;
        List<MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem> list6 = mobileOfficialAppsClipsStat$TypeClipUploadItem.clickableStickers;
        List<MobileOfficialAppsClipsStat$ClipUploadTextItem> list7 = mobileOfficialAppsClipsStat$TypeClipUploadItem.texts;
        List<MobileOfficialAppsClipsStat$ClipUploadSettingItem> list8 = mobileOfficialAppsClipsStat$TypeClipUploadItem.settings;
        Long l4 = mobileOfficialAppsClipsStat$TypeClipUploadItem.time;
        mobileOfficialAppsClipsStat$TypeClipUploadItem.getClass();
        return new MobileOfficialAppsClipsStat$TypeClipUploadItem(str, i, mobileOfficialAppsClipsStat$ClipsCreateContext, i2, cameraType, previewType, num, l, num2, l2, num3, list, num4, l3, bool2, bool3, bool4, bool5, bool6, bool7, str2, duetType, bool, str3, bool8, bool9, bool10, bool11, bool12, list2, list3, list4, list5, list6, list7, list8, l4);
    }

    public final MobileOfficialAppsClipsStat$ClipsCreateContext b() {
        return this.clipsCreateContext;
    }

    public final int c() {
        return this.videoLength;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipUploadItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = (MobileOfficialAppsClipsStat$TypeClipUploadItem) obj;
        return epx.f(this.eventType, mobileOfficialAppsClipsStat$TypeClipUploadItem.eventType) && this.framesCount == mobileOfficialAppsClipsStat$TypeClipUploadItem.framesCount && epx.f(this.clipsCreateContext, mobileOfficialAppsClipsStat$TypeClipUploadItem.clipsCreateContext) && this.videoLength == mobileOfficialAppsClipsStat$TypeClipUploadItem.videoLength && this.cameraType == mobileOfficialAppsClipsStat$TypeClipUploadItem.cameraType && this.previewType == mobileOfficialAppsClipsStat$TypeClipUploadItem.previewType && epx.f(this.audioId, mobileOfficialAppsClipsStat$TypeClipUploadItem.audioId) && epx.f(this.audioOwnerId, mobileOfficialAppsClipsStat$TypeClipUploadItem.audioOwnerId) && epx.f(this.playlistId, mobileOfficialAppsClipsStat$TypeClipUploadItem.playlistId) && epx.f(this.playlistOwnerId, mobileOfficialAppsClipsStat$TypeClipUploadItem.playlistOwnerId) && epx.f(this.bannerId, mobileOfficialAppsClipsStat$TypeClipUploadItem.bannerId) && epx.f(this.hashtags, mobileOfficialAppsClipsStat$TypeClipUploadItem.hashtags) && epx.f(this.templateId, mobileOfficialAppsClipsStat$TypeClipUploadItem.templateId) && epx.f(this.templateOwnerId, mobileOfficialAppsClipsStat$TypeClipUploadItem.templateOwnerId) && epx.f(this.hasAudioImported, mobileOfficialAppsClipsStat$TypeClipUploadItem.hasAudioImported) && epx.f(this.hasVoiceover, mobileOfficialAppsClipsStat$TypeClipUploadItem.hasVoiceover) && epx.f(this.isAddedToPlaylist, mobileOfficialAppsClipsStat$TypeClipUploadItem.isAddedToPlaylist) && epx.f(this.isAudioSpeedChanged, mobileOfficialAppsClipsStat$TypeClipUploadItem.isAudioSpeedChanged) && epx.f(this.isVideoSpeedChanged, mobileOfficialAppsClipsStat$TypeClipUploadItem.isVideoSpeedChanged) && epx.f(this.isAuthorsAd, mobileOfficialAppsClipsStat$TypeClipUploadItem.isAuthorsAd) && epx.f(this.videoClipDescription, mobileOfficialAppsClipsStat$TypeClipUploadItem.videoClipDescription) && this.duetType == mobileOfficialAppsClipsStat$TypeClipUploadItem.duetType && epx.f(this.isOriginalQuality, mobileOfficialAppsClipsStat$TypeClipUploadItem.isOriginalQuality) && epx.f(this.privacy, mobileOfficialAppsClipsStat$TypeClipUploadItem.privacy) && epx.f(this.hasMask, mobileOfficialAppsClipsStat$TypeClipUploadItem.hasMask) && epx.f(this.hasSticker, mobileOfficialAppsClipsStat$TypeClipUploadItem.hasSticker) && epx.f(this.hasEmoji, mobileOfficialAppsClipsStat$TypeClipUploadItem.hasEmoji) && epx.f(this.hasText, mobileOfficialAppsClipsStat$TypeClipUploadItem.hasText) && epx.f(this.hasClickableStickers, mobileOfficialAppsClipsStat$TypeClipUploadItem.hasClickableStickers) && epx.f(this.mask, mobileOfficialAppsClipsStat$TypeClipUploadItem.mask) && epx.f(this.emojies, mobileOfficialAppsClipsStat$TypeClipUploadItem.emojies) && epx.f(this.filters, mobileOfficialAppsClipsStat$TypeClipUploadItem.filters) && epx.f(this.stickers, mobileOfficialAppsClipsStat$TypeClipUploadItem.stickers) && epx.f(this.clickableStickers, mobileOfficialAppsClipsStat$TypeClipUploadItem.clickableStickers) && epx.f(this.texts, mobileOfficialAppsClipsStat$TypeClipUploadItem.texts) && epx.f(this.settings, mobileOfficialAppsClipsStat$TypeClipUploadItem.settings) && epx.f(this.time, mobileOfficialAppsClipsStat$TypeClipUploadItem.time);
    }

    public final int hashCode() {
        int hashCode = (this.previewType.hashCode() + ((this.cameraType.hashCode() + shy.a(this.videoLength, (this.clipsCreateContext.hashCode() + shy.a(this.framesCount, this.eventType.hashCode() * 31, 31)) * 31, 31)) * 31)) * 31;
        Integer num = this.audioId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.audioOwnerId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.playlistId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.playlistOwnerId;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.bannerId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list = this.hashtags;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.templateId;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l3 = this.templateOwnerId;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.hasAudioImported;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasVoiceover;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAddedToPlaylist;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isAudioSpeedChanged;
        int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isVideoSpeedChanged;
        int hashCode14 = (hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isAuthorsAd;
        int hashCode15 = (hashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str = this.videoClipDescription;
        int hashCode16 = (hashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        DuetType duetType = this.duetType;
        int hashCode17 = (hashCode16 + (duetType == null ? 0 : duetType.hashCode())) * 31;
        Boolean bool7 = this.isOriginalQuality;
        int hashCode18 = (hashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str2 = this.privacy;
        int hashCode19 = (hashCode18 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool8 = this.hasMask;
        int hashCode20 = (hashCode19 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.hasSticker;
        int hashCode21 = (hashCode20 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.hasEmoji;
        int hashCode22 = (hashCode21 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.hasText;
        int hashCode23 = (hashCode22 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.hasClickableStickers;
        int hashCode24 = (hashCode23 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        List<MobileOfficialAppsClipsStat$ClipUploadMaskItem> list2 = this.mask;
        int hashCode25 = (hashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.emojies;
        int hashCode26 = (hashCode25 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.filters;
        int hashCode27 = (hashCode26 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<MobileOfficialAppsClipsStat$ClipUploadStickerItem> list5 = this.stickers;
        int hashCode28 = (hashCode27 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem> list6 = this.clickableStickers;
        int hashCode29 = (hashCode28 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<MobileOfficialAppsClipsStat$ClipUploadTextItem> list7 = this.texts;
        int hashCode30 = (hashCode29 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<MobileOfficialAppsClipsStat$ClipUploadSettingItem> list8 = this.settings;
        int hashCode31 = (hashCode30 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Long l4 = this.time;
        return hashCode31 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipUploadItem(eventType=");
        sb.append(this.eventType);
        sb.append(", framesCount=");
        sb.append(this.framesCount);
        sb.append(", clipsCreateContext=");
        sb.append(this.clipsCreateContext);
        sb.append(", videoLength=");
        sb.append(this.videoLength);
        sb.append(", cameraType=");
        sb.append(this.cameraType);
        sb.append(", previewType=");
        sb.append(this.previewType);
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
        sb.append(", templateId=");
        sb.append(this.templateId);
        sb.append(", templateOwnerId=");
        sb.append(this.templateOwnerId);
        sb.append(", hasAudioImported=");
        sb.append(this.hasAudioImported);
        sb.append(", hasVoiceover=");
        sb.append(this.hasVoiceover);
        sb.append(", isAddedToPlaylist=");
        sb.append(this.isAddedToPlaylist);
        sb.append(", isAudioSpeedChanged=");
        sb.append(this.isAudioSpeedChanged);
        sb.append(", isVideoSpeedChanged=");
        sb.append(this.isVideoSpeedChanged);
        sb.append(", isAuthorsAd=");
        sb.append(this.isAuthorsAd);
        sb.append(", videoClipDescription=");
        sb.append(this.videoClipDescription);
        sb.append(", duetType=");
        sb.append(this.duetType);
        sb.append(", isOriginalQuality=");
        sb.append(this.isOriginalQuality);
        sb.append(", privacy=");
        sb.append(this.privacy);
        sb.append(", hasMask=");
        sb.append(this.hasMask);
        sb.append(", hasSticker=");
        sb.append(this.hasSticker);
        sb.append(", hasEmoji=");
        sb.append(this.hasEmoji);
        sb.append(", hasText=");
        sb.append(this.hasText);
        sb.append(", hasClickableStickers=");
        sb.append(this.hasClickableStickers);
        sb.append(", mask=");
        sb.append(this.mask);
        sb.append(", emojies=");
        sb.append(this.emojies);
        sb.append(", filters=");
        sb.append(this.filters);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", clickableStickers=");
        sb.append(this.clickableStickers);
        sb.append(", texts=");
        sb.append(this.texts);
        sb.append(", settings=");
        sb.append(this.settings);
        sb.append(", time=");
        return iq.b(sb, this.time, ')');
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipUploadItem(java.lang.String r41, int r42, com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext r43, int r44, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType r45, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem.PreviewType r46, java.lang.Integer r47, java.lang.Long r48, java.lang.Integer r49, java.lang.Long r50, java.lang.Integer r51, java.util.List r52, java.lang.Integer r53, java.lang.Long r54, java.lang.Boolean r55, java.lang.Boolean r56, java.lang.Boolean r57, java.lang.Boolean r58, java.lang.Boolean r59, java.lang.Boolean r60, java.lang.String r61, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType r62, java.lang.Boolean r63, java.lang.String r64, java.lang.Boolean r65, java.lang.Boolean r66, java.lang.Boolean r67, java.lang.Boolean r68, java.lang.Boolean r69, java.util.List r70, java.util.List r71, java.util.List r72, java.util.List r73, java.util.List r74, java.util.List r75, java.util.List r76, java.lang.Long r77, int r78, int r79, xsna.zcl r80) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem.<init>(java.lang.String, int, com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext, int, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem$CameraType, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem$PreviewType, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Integer, java.util.List, java.lang.Integer, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem$DuetType, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.Long, int, int, xsna.zcl):void");
    }
}
