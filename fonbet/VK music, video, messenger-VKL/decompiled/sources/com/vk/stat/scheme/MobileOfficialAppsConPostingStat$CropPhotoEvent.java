package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$CropPhotoEvent {

    @pmi0("crop_photo_event_type")
    private final CropPhotoEventType cropPhotoEventType;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("photo_sizes")
    private final MobileOfficialAppsConPostingStat$PhotoSizes photoSizes;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class CropPhotoEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CropPhotoEventType[] $VALUES;

        @pmi0("crop_photo")
        public static final CropPhotoEventType CROP_PHOTO;

        static {
            CropPhotoEventType cropPhotoEventType = new CropPhotoEventType("CROP_PHOTO", 0);
            CROP_PHOTO = cropPhotoEventType;
            CropPhotoEventType[] cropPhotoEventTypeArr = {cropPhotoEventType};
            $VALUES = cropPhotoEventTypeArr;
            $ENTRIES = new asp(cropPhotoEventTypeArr);
        }

        private CropPhotoEventType(String str, int i) {
        }

        public static CropPhotoEventType valueOf(String str) {
            return (CropPhotoEventType) Enum.valueOf(CropPhotoEventType.class, str);
        }

        public static CropPhotoEventType[] values() {
            return (CropPhotoEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("moved")
        public static final EventSubtype MOVED;

        @pmi0("moved_zoomed")
        public static final EventSubtype MOVED_ZOOMED;

        @pmi0("zoomed")
        public static final EventSubtype ZOOMED;

        static {
            EventSubtype eventSubtype = new EventSubtype("MOVED", 0);
            MOVED = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("ZOOMED", 1);
            ZOOMED = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("MOVED_ZOOMED", 2);
            MOVED_ZOOMED = eventSubtype3;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPostingStat$CropPhotoEvent() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$CropPhotoEvent)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$CropPhotoEvent mobileOfficialAppsConPostingStat$CropPhotoEvent = (MobileOfficialAppsConPostingStat$CropPhotoEvent) obj;
        return this.cropPhotoEventType == mobileOfficialAppsConPostingStat$CropPhotoEvent.cropPhotoEventType && this.eventSubtype == mobileOfficialAppsConPostingStat$CropPhotoEvent.eventSubtype && epx.f(this.photoSizes, mobileOfficialAppsConPostingStat$CropPhotoEvent.photoSizes);
    }

    public final int hashCode() {
        CropPhotoEventType cropPhotoEventType = this.cropPhotoEventType;
        int hashCode = (cropPhotoEventType == null ? 0 : cropPhotoEventType.hashCode()) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode2 = (hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes = this.photoSizes;
        return hashCode2 + (mobileOfficialAppsConPostingStat$PhotoSizes != null ? mobileOfficialAppsConPostingStat$PhotoSizes.hashCode() : 0);
    }

    public final String toString() {
        return "CropPhotoEvent(cropPhotoEventType=" + this.cropPhotoEventType + ", eventSubtype=" + this.eventSubtype + ", photoSizes=" + this.photoSizes + ')';
    }

    public MobileOfficialAppsConPostingStat$CropPhotoEvent(CropPhotoEventType cropPhotoEventType, EventSubtype eventSubtype, MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes) {
        this.cropPhotoEventType = cropPhotoEventType;
        this.eventSubtype = eventSubtype;
        this.photoSizes = mobileOfficialAppsConPostingStat$PhotoSizes;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$CropPhotoEvent(CropPhotoEventType cropPhotoEventType, EventSubtype eventSubtype, MobileOfficialAppsConPostingStat$PhotoSizes mobileOfficialAppsConPostingStat$PhotoSizes, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : cropPhotoEventType, (i & 2) != 0 ? null : eventSubtype, (i & 4) != 0 ? null : mobileOfficialAppsConPostingStat$PhotoSizes);
    }
}
