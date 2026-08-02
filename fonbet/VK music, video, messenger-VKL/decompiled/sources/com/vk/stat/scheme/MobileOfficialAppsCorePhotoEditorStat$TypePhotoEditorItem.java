package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem implements SchemeStat$TypeClick.b {

    @pmi0("autocorrection_event")
    private final MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent autocorrectionEvent;

    @pmi0("collage_event")
    private final MobileOfficialAppsCorePhotoEditorStat$CollageEvent collageEvent;

    @pmi0("color_grading_event")
    private final ColorGradingEvent colorGradingEvent;

    @pmi0("creation_entry_point")
    private final String creationEntryPoint;

    @pmi0("crop_event")
    private final MobileOfficialAppsCorePhotoEditorStat$CropEvent cropEvent;

    @pmi0("editor_event")
    private final MobileOfficialAppsCorePhotoEditorStat$EditorEvent editorEvent;

    @pmi0("filter_event")
    private final MobileOfficialAppsCorePhotoEditorStat$FilterEvent filterEvent;

    @pmi0("graffity_event")
    private final MobileOfficialAppsCorePhotoEditorStat$GraffityEvent graffityEvent;

    @pmi0("media_id")
    private final Long mediaId;

    @pmi0("media_type")
    private final MediaType mediaType;

    @pmi0("photo_params")
    private final MobileOfficialAppsCorePhotoEditorStat$PhotoParams photoParams;

    @pmi0("spoiler_event")
    private final MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent spoilerEvent;

    @pmi0("sticker_event")
    private final MobileOfficialAppsCorePhotoEditorStat$StickerEvent stickerEvent;

    @pmi0("text_event")
    private final MobileOfficialAppsCorePhotoEditorStat$TextEvent textEvent;

    @pmi0("upgrade_event")
    private final MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent upgradeEvent;

    @pmi0("zoom_event")
    private final MobileOfficialAppsCorePhotoEditorStat$ZoomEvent zoomEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
    public static final class ColorGradingEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorGradingEvent[] $VALUES;

        @pmi0("click_to_brightness")
        public static final ColorGradingEvent CLICK_TO_BRIGHTNESS;

        @pmi0("click_to_contrast")
        public static final ColorGradingEvent CLICK_TO_CONTRAST;

        @pmi0("click_to_darks")
        public static final ColorGradingEvent CLICK_TO_DARKS;

        @pmi0("click_to_grain")
        public static final ColorGradingEvent CLICK_TO_GRAIN;

        @pmi0("click_to_hsl")
        public static final ColorGradingEvent CLICK_TO_HSL;

        @pmi0("click_to_lights")
        public static final ColorGradingEvent CLICK_TO_LIGHTS;

        @pmi0("click_to_saturation")
        public static final ColorGradingEvent CLICK_TO_SATURATION;

        @pmi0("click_to_sharpness")
        public static final ColorGradingEvent CLICK_TO_SHARPNESS;

        @pmi0("click_to_temperature")
        public static final ColorGradingEvent CLICK_TO_TEMPERATURE;

        @pmi0("click_to_tone")
        public static final ColorGradingEvent CLICK_TO_TONE;

        @pmi0("click_to_vignette")
        public static final ColorGradingEvent CLICK_TO_VIGNETTE;

        static {
            ColorGradingEvent colorGradingEvent = new ColorGradingEvent("CLICK_TO_BRIGHTNESS", 0);
            CLICK_TO_BRIGHTNESS = colorGradingEvent;
            ColorGradingEvent colorGradingEvent2 = new ColorGradingEvent("CLICK_TO_CONTRAST", 1);
            CLICK_TO_CONTRAST = colorGradingEvent2;
            ColorGradingEvent colorGradingEvent3 = new ColorGradingEvent("CLICK_TO_SATURATION", 2);
            CLICK_TO_SATURATION = colorGradingEvent3;
            ColorGradingEvent colorGradingEvent4 = new ColorGradingEvent("CLICK_TO_TEMPERATURE", 3);
            CLICK_TO_TEMPERATURE = colorGradingEvent4;
            ColorGradingEvent colorGradingEvent5 = new ColorGradingEvent("CLICK_TO_SHARPNESS", 4);
            CLICK_TO_SHARPNESS = colorGradingEvent5;
            ColorGradingEvent colorGradingEvent6 = new ColorGradingEvent("CLICK_TO_GRAIN", 5);
            CLICK_TO_GRAIN = colorGradingEvent6;
            ColorGradingEvent colorGradingEvent7 = new ColorGradingEvent("CLICK_TO_VIGNETTE", 6);
            CLICK_TO_VIGNETTE = colorGradingEvent7;
            ColorGradingEvent colorGradingEvent8 = new ColorGradingEvent("CLICK_TO_LIGHTS", 7);
            CLICK_TO_LIGHTS = colorGradingEvent8;
            ColorGradingEvent colorGradingEvent9 = new ColorGradingEvent("CLICK_TO_DARKS", 8);
            CLICK_TO_DARKS = colorGradingEvent9;
            ColorGradingEvent colorGradingEvent10 = new ColorGradingEvent("CLICK_TO_HSL", 9);
            CLICK_TO_HSL = colorGradingEvent10;
            ColorGradingEvent colorGradingEvent11 = new ColorGradingEvent("CLICK_TO_TONE", 10);
            CLICK_TO_TONE = colorGradingEvent11;
            ColorGradingEvent[] colorGradingEventArr = {colorGradingEvent, colorGradingEvent2, colorGradingEvent3, colorGradingEvent4, colorGradingEvent5, colorGradingEvent6, colorGradingEvent7, colorGradingEvent8, colorGradingEvent9, colorGradingEvent10, colorGradingEvent11};
            $VALUES = colorGradingEventArr;
            $ENTRIES = new asp(colorGradingEventArr);
        }

        private ColorGradingEvent(String str, int i) {
        }

        public static ColorGradingEvent valueOf(String str) {
            return (ColorGradingEvent) Enum.valueOf(ColorGradingEvent.class, str);
        }

        public static ColorGradingEvent[] values() {
            return (ColorGradingEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
    public static final class MediaType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MediaType[] $VALUES;

        @pmi0("collage")
        public static final MediaType COLLAGE;

        @pmi0("photo")
        public static final MediaType PHOTO;

        static {
            MediaType mediaType = new MediaType("PHOTO", 0);
            PHOTO = mediaType;
            MediaType mediaType2 = new MediaType("COLLAGE", 1);
            COLLAGE = mediaType2;
            MediaType[] mediaTypeArr = {mediaType, mediaType2};
            $VALUES = mediaTypeArr;
            $ENTRIES = new asp(mediaTypeArr);
        }

        private MediaType(String str, int i) {
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(MediaType mediaType, String str, Long l, MobileOfficialAppsCorePhotoEditorStat$EditorEvent mobileOfficialAppsCorePhotoEditorStat$EditorEvent, MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent, MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent, MobileOfficialAppsCorePhotoEditorStat$FilterEvent mobileOfficialAppsCorePhotoEditorStat$FilterEvent, MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent, MobileOfficialAppsCorePhotoEditorStat$CollageEvent mobileOfficialAppsCorePhotoEditorStat$CollageEvent, MobileOfficialAppsCorePhotoEditorStat$TextEvent mobileOfficialAppsCorePhotoEditorStat$TextEvent, MobileOfficialAppsCorePhotoEditorStat$GraffityEvent mobileOfficialAppsCorePhotoEditorStat$GraffityEvent, MobileOfficialAppsCorePhotoEditorStat$StickerEvent mobileOfficialAppsCorePhotoEditorStat$StickerEvent, MobileOfficialAppsCorePhotoEditorStat$ZoomEvent mobileOfficialAppsCorePhotoEditorStat$ZoomEvent, MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent, ColorGradingEvent colorGradingEvent, MobileOfficialAppsCorePhotoEditorStat$PhotoParams mobileOfficialAppsCorePhotoEditorStat$PhotoParams) {
        this.mediaType = mediaType;
        this.creationEntryPoint = str;
        this.mediaId = l;
        this.editorEvent = mobileOfficialAppsCorePhotoEditorStat$EditorEvent;
        this.cropEvent = mobileOfficialAppsCorePhotoEditorStat$CropEvent;
        this.spoilerEvent = mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent;
        this.filterEvent = mobileOfficialAppsCorePhotoEditorStat$FilterEvent;
        this.autocorrectionEvent = mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent;
        this.collageEvent = mobileOfficialAppsCorePhotoEditorStat$CollageEvent;
        this.textEvent = mobileOfficialAppsCorePhotoEditorStat$TextEvent;
        this.graffityEvent = mobileOfficialAppsCorePhotoEditorStat$GraffityEvent;
        this.stickerEvent = mobileOfficialAppsCorePhotoEditorStat$StickerEvent;
        this.zoomEvent = mobileOfficialAppsCorePhotoEditorStat$ZoomEvent;
        this.upgradeEvent = mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent;
        this.colorGradingEvent = colorGradingEvent;
        this.photoParams = mobileOfficialAppsCorePhotoEditorStat$PhotoParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem)) {
            return false;
        }
        MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem = (MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem) obj;
        return this.mediaType == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.mediaType && epx.f(this.creationEntryPoint, mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.creationEntryPoint) && epx.f(this.mediaId, mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.mediaId) && this.editorEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.editorEvent && this.cropEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.cropEvent && this.spoilerEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.spoilerEvent && this.filterEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.filterEvent && this.autocorrectionEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.autocorrectionEvent && this.collageEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.collageEvent && this.textEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.textEvent && this.graffityEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.graffityEvent && this.stickerEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.stickerEvent && this.zoomEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.zoomEvent && this.upgradeEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.upgradeEvent && this.colorGradingEvent == mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.colorGradingEvent && epx.f(this.photoParams, mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.photoParams);
    }

    public final int hashCode() {
        int a = urd0.a(this.mediaType.hashCode() * 31, 31, this.creationEntryPoint);
        Long l = this.mediaId;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$EditorEvent mobileOfficialAppsCorePhotoEditorStat$EditorEvent = this.editorEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsCorePhotoEditorStat$EditorEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$EditorEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent = this.cropEvent;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsCorePhotoEditorStat$CropEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$CropEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent = this.spoilerEvent;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$FilterEvent mobileOfficialAppsCorePhotoEditorStat$FilterEvent = this.filterEvent;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsCorePhotoEditorStat$FilterEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$FilterEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent = this.autocorrectionEvent;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$CollageEvent mobileOfficialAppsCorePhotoEditorStat$CollageEvent = this.collageEvent;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsCorePhotoEditorStat$CollageEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$CollageEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$TextEvent mobileOfficialAppsCorePhotoEditorStat$TextEvent = this.textEvent;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsCorePhotoEditorStat$TextEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$TextEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$GraffityEvent mobileOfficialAppsCorePhotoEditorStat$GraffityEvent = this.graffityEvent;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsCorePhotoEditorStat$GraffityEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$GraffityEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$StickerEvent mobileOfficialAppsCorePhotoEditorStat$StickerEvent = this.stickerEvent;
        int hashCode10 = (hashCode9 + (mobileOfficialAppsCorePhotoEditorStat$StickerEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$StickerEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$ZoomEvent mobileOfficialAppsCorePhotoEditorStat$ZoomEvent = this.zoomEvent;
        int hashCode11 = (hashCode10 + (mobileOfficialAppsCorePhotoEditorStat$ZoomEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$ZoomEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent = this.upgradeEvent;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent.hashCode())) * 31;
        ColorGradingEvent colorGradingEvent = this.colorGradingEvent;
        int hashCode13 = (hashCode12 + (colorGradingEvent == null ? 0 : colorGradingEvent.hashCode())) * 31;
        MobileOfficialAppsCorePhotoEditorStat$PhotoParams mobileOfficialAppsCorePhotoEditorStat$PhotoParams = this.photoParams;
        return hashCode13 + (mobileOfficialAppsCorePhotoEditorStat$PhotoParams != null ? mobileOfficialAppsCorePhotoEditorStat$PhotoParams.hashCode() : 0);
    }

    public final String toString() {
        return "TypePhotoEditorItem(mediaType=" + this.mediaType + ", creationEntryPoint=" + this.creationEntryPoint + ", mediaId=" + this.mediaId + ", editorEvent=" + this.editorEvent + ", cropEvent=" + this.cropEvent + ", spoilerEvent=" + this.spoilerEvent + ", filterEvent=" + this.filterEvent + ", autocorrectionEvent=" + this.autocorrectionEvent + ", collageEvent=" + this.collageEvent + ", textEvent=" + this.textEvent + ", graffityEvent=" + this.graffityEvent + ", stickerEvent=" + this.stickerEvent + ", zoomEvent=" + this.zoomEvent + ", upgradeEvent=" + this.upgradeEvent + ", colorGradingEvent=" + this.colorGradingEvent + ", photoParams=" + this.photoParams + ')';
    }

    public /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(MediaType mediaType, String str, Long l, MobileOfficialAppsCorePhotoEditorStat$EditorEvent mobileOfficialAppsCorePhotoEditorStat$EditorEvent, MobileOfficialAppsCorePhotoEditorStat$CropEvent mobileOfficialAppsCorePhotoEditorStat$CropEvent, MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent, MobileOfficialAppsCorePhotoEditorStat$FilterEvent mobileOfficialAppsCorePhotoEditorStat$FilterEvent, MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent, MobileOfficialAppsCorePhotoEditorStat$CollageEvent mobileOfficialAppsCorePhotoEditorStat$CollageEvent, MobileOfficialAppsCorePhotoEditorStat$TextEvent mobileOfficialAppsCorePhotoEditorStat$TextEvent, MobileOfficialAppsCorePhotoEditorStat$GraffityEvent mobileOfficialAppsCorePhotoEditorStat$GraffityEvent, MobileOfficialAppsCorePhotoEditorStat$StickerEvent mobileOfficialAppsCorePhotoEditorStat$StickerEvent, MobileOfficialAppsCorePhotoEditorStat$ZoomEvent mobileOfficialAppsCorePhotoEditorStat$ZoomEvent, MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent, ColorGradingEvent colorGradingEvent, MobileOfficialAppsCorePhotoEditorStat$PhotoParams mobileOfficialAppsCorePhotoEditorStat$PhotoParams, int i, zcl zclVar) {
        this(mediaType, str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$EditorEvent, (i & 16) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$CropEvent, (i & 32) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent, (i & 64) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$FilterEvent, (i & 128) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent, (i & 256) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$CollageEvent, (i & 512) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$TextEvent, (i & 1024) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$GraffityEvent, (i & 2048) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$StickerEvent, (i & 4096) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$ZoomEvent, (i & 8192) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$UpgradeEvent, (i & 16384) != 0 ? null : colorGradingEvent, (i & 32768) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$PhotoParams);
    }
}
