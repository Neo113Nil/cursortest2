package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$CoverEvent {

    @pmi0("cover_event_type")
    private final CoverEventType coverEventType;

    @pmi0("photo_id")
    private final Long photoId;

    @pmi0("preview_mode")
    private final PreviewMode previewMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class CoverEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CoverEventType[] $VALUES;

        @pmi0("click_to_preview")
        public static final CoverEventType CLICK_TO_PREVIEW;

        @pmi0("cover_from_camera")
        public static final CoverEventType COVER_FROM_CAMERA;

        @pmi0("cover_from_gallery")
        public static final CoverEventType COVER_FROM_GALLERY;

        @pmi0("delete_cover")
        public static final CoverEventType DELETE_COVER;

        @pmi0("preview_mode_change")
        public static final CoverEventType PREVIEW_MODE_CHANGE;

        @pmi0("save_cover")
        public static final CoverEventType SAVE_COVER;

        static {
            CoverEventType coverEventType = new CoverEventType("DELETE_COVER", 0);
            DELETE_COVER = coverEventType;
            CoverEventType coverEventType2 = new CoverEventType("COVER_FROM_GALLERY", 1);
            COVER_FROM_GALLERY = coverEventType2;
            CoverEventType coverEventType3 = new CoverEventType("COVER_FROM_CAMERA", 2);
            COVER_FROM_CAMERA = coverEventType3;
            CoverEventType coverEventType4 = new CoverEventType("SAVE_COVER", 3);
            SAVE_COVER = coverEventType4;
            CoverEventType coverEventType5 = new CoverEventType("CLICK_TO_PREVIEW", 4);
            CLICK_TO_PREVIEW = coverEventType5;
            CoverEventType coverEventType6 = new CoverEventType("PREVIEW_MODE_CHANGE", 5);
            PREVIEW_MODE_CHANGE = coverEventType6;
            CoverEventType[] coverEventTypeArr = {coverEventType, coverEventType2, coverEventType3, coverEventType4, coverEventType5, coverEventType6};
            $VALUES = coverEventTypeArr;
            $ENTRIES = new asp(coverEventTypeArr);
        }

        private CoverEventType(String str, int i) {
        }

        public static CoverEventType valueOf(String str) {
            return (CoverEventType) Enum.valueOf(CoverEventType.class, str);
        }

        public static CoverEventType[] values() {
            return (CoverEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class PreviewMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PreviewMode[] $VALUES;

        @pmi0("desktop")
        public static final PreviewMode DESKTOP;

        @pmi0("smartphone")
        public static final PreviewMode SMARTPHONE;

        static {
            PreviewMode previewMode = new PreviewMode("SMARTPHONE", 0);
            SMARTPHONE = previewMode;
            PreviewMode previewMode2 = new PreviewMode("DESKTOP", 1);
            DESKTOP = previewMode2;
            PreviewMode[] previewModeArr = {previewMode, previewMode2};
            $VALUES = previewModeArr;
            $ENTRIES = new asp(previewModeArr);
        }

        private PreviewMode(String str, int i) {
        }

        public static PreviewMode valueOf(String str) {
            return (PreviewMode) Enum.valueOf(PreviewMode.class, str);
        }

        public static PreviewMode[] values() {
            return (PreviewMode[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsProfileStat$CoverEvent() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$CoverEvent)) {
            return false;
        }
        MobileOfficialAppsProfileStat$CoverEvent mobileOfficialAppsProfileStat$CoverEvent = (MobileOfficialAppsProfileStat$CoverEvent) obj;
        return this.coverEventType == mobileOfficialAppsProfileStat$CoverEvent.coverEventType && epx.f(this.photoId, mobileOfficialAppsProfileStat$CoverEvent.photoId) && this.previewMode == mobileOfficialAppsProfileStat$CoverEvent.previewMode;
    }

    public final int hashCode() {
        CoverEventType coverEventType = this.coverEventType;
        int hashCode = (coverEventType == null ? 0 : coverEventType.hashCode()) * 31;
        Long l = this.photoId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        PreviewMode previewMode = this.previewMode;
        return hashCode2 + (previewMode != null ? previewMode.hashCode() : 0);
    }

    public final String toString() {
        return "CoverEvent(coverEventType=" + this.coverEventType + ", photoId=" + this.photoId + ", previewMode=" + this.previewMode + ')';
    }

    public MobileOfficialAppsProfileStat$CoverEvent(CoverEventType coverEventType, Long l, PreviewMode previewMode) {
        this.coverEventType = coverEventType;
        this.photoId = l;
        this.previewMode = previewMode;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$CoverEvent(CoverEventType coverEventType, Long l, PreviewMode previewMode, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : coverEventType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : previewMode);
    }
}
