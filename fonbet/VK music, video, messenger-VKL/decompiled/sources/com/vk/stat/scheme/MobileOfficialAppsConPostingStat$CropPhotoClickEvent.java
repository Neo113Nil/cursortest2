package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$CropPhotoClickEvent {

    @pmi0("crop_photo_click_event_type")
    private final CropPhotoClickEventType cropPhotoClickEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class CropPhotoClickEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CropPhotoClickEventType[] $VALUES;

        @pmi0("close_crop_editor")
        public static final CropPhotoClickEventType CLOSE_CROP_EDITOR;

        @pmi0("get_more_info")
        public static final CropPhotoClickEventType GET_MORE_INFO;

        @pmi0("open_crop_editor")
        public static final CropPhotoClickEventType OPEN_CROP_EDITOR;

        static {
            CropPhotoClickEventType cropPhotoClickEventType = new CropPhotoClickEventType("OPEN_CROP_EDITOR", 0);
            OPEN_CROP_EDITOR = cropPhotoClickEventType;
            CropPhotoClickEventType cropPhotoClickEventType2 = new CropPhotoClickEventType("CLOSE_CROP_EDITOR", 1);
            CLOSE_CROP_EDITOR = cropPhotoClickEventType2;
            CropPhotoClickEventType cropPhotoClickEventType3 = new CropPhotoClickEventType("GET_MORE_INFO", 2);
            GET_MORE_INFO = cropPhotoClickEventType3;
            CropPhotoClickEventType[] cropPhotoClickEventTypeArr = {cropPhotoClickEventType, cropPhotoClickEventType2, cropPhotoClickEventType3};
            $VALUES = cropPhotoClickEventTypeArr;
            $ENTRIES = new asp(cropPhotoClickEventTypeArr);
        }

        private CropPhotoClickEventType(String str, int i) {
        }

        public static CropPhotoClickEventType valueOf(String str) {
            return (CropPhotoClickEventType) Enum.valueOf(CropPhotoClickEventType.class, str);
        }

        public static CropPhotoClickEventType[] values() {
            return (CropPhotoClickEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$CropPhotoClickEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPostingStat$CropPhotoClickEvent) && this.cropPhotoClickEventType == ((MobileOfficialAppsConPostingStat$CropPhotoClickEvent) obj).cropPhotoClickEventType;
    }

    public final int hashCode() {
        CropPhotoClickEventType cropPhotoClickEventType = this.cropPhotoClickEventType;
        if (cropPhotoClickEventType == null) {
            return 0;
        }
        return cropPhotoClickEventType.hashCode();
    }

    public final String toString() {
        return "CropPhotoClickEvent(cropPhotoClickEventType=" + this.cropPhotoClickEventType + ')';
    }

    public MobileOfficialAppsConPostingStat$CropPhotoClickEvent(CropPhotoClickEventType cropPhotoClickEventType) {
        this.cropPhotoClickEventType = cropPhotoClickEventType;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$CropPhotoClickEvent(CropPhotoClickEventType cropPhotoClickEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : cropPhotoClickEventType);
    }
}
