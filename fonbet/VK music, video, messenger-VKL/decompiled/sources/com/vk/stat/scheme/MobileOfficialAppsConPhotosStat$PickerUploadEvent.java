package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PickerUploadEvent {

    @pmi0("picker_upload_event_type")
    private final PickerUploadEventType pickerUploadEventType;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class PickerUploadEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PickerUploadEventType[] $VALUES;

        @pmi0("click_to_upload")
        public static final PickerUploadEventType CLICK_TO_UPLOAD;

        static {
            PickerUploadEventType pickerUploadEventType = new PickerUploadEventType("CLICK_TO_UPLOAD", 0);
            CLICK_TO_UPLOAD = pickerUploadEventType;
            PickerUploadEventType[] pickerUploadEventTypeArr = {pickerUploadEventType};
            $VALUES = pickerUploadEventTypeArr;
            $ENTRIES = new asp(pickerUploadEventTypeArr);
        }

        private PickerUploadEventType(String str, int i) {
        }

        public static PickerUploadEventType valueOf(String str) {
            return (PickerUploadEventType) Enum.valueOf(PickerUploadEventType.class, str);
        }

        public static PickerUploadEventType[] values() {
            return (PickerUploadEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$PickerUploadEvent(PickerUploadEventType pickerUploadEventType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.pickerUploadEventType = pickerUploadEventType;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$PickerUploadEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$PickerUploadEvent mobileOfficialAppsConPhotosStat$PickerUploadEvent = (MobileOfficialAppsConPhotosStat$PickerUploadEvent) obj;
        return this.pickerUploadEventType == mobileOfficialAppsConPhotosStat$PickerUploadEvent.pickerUploadEventType && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$PickerUploadEvent.stringValueParam);
    }

    public final int hashCode() {
        return this.stringValueParam.hashCode() + (this.pickerUploadEventType.hashCode() * 31);
    }

    public final String toString() {
        return "PickerUploadEvent(pickerUploadEventType=" + this.pickerUploadEventType + ", stringValueParam=" + this.stringValueParam + ')';
    }
}
