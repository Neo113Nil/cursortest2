package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PickerSelectionEvent {

    @pmi0("picker_selection_event_type")
    private final PickerSelectionEventType pickerSelectionEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class PickerSelectionEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PickerSelectionEventType[] $VALUES;

        @pmi0("click_to_camera")
        public static final PickerSelectionEventType CLICK_TO_CAMERA;

        @pmi0("pick_from_gallery")
        public static final PickerSelectionEventType PICK_FROM_GALLERY;

        static {
            PickerSelectionEventType pickerSelectionEventType = new PickerSelectionEventType("CLICK_TO_CAMERA", 0);
            CLICK_TO_CAMERA = pickerSelectionEventType;
            PickerSelectionEventType pickerSelectionEventType2 = new PickerSelectionEventType("PICK_FROM_GALLERY", 1);
            PICK_FROM_GALLERY = pickerSelectionEventType2;
            PickerSelectionEventType[] pickerSelectionEventTypeArr = {pickerSelectionEventType, pickerSelectionEventType2};
            $VALUES = pickerSelectionEventTypeArr;
            $ENTRIES = new asp(pickerSelectionEventTypeArr);
        }

        private PickerSelectionEventType(String str, int i) {
        }

        public static PickerSelectionEventType valueOf(String str) {
            return (PickerSelectionEventType) Enum.valueOf(PickerSelectionEventType.class, str);
        }

        public static PickerSelectionEventType[] values() {
            return (PickerSelectionEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPhotosStat$PickerSelectionEvent(PickerSelectionEventType pickerSelectionEventType) {
        this.pickerSelectionEventType = pickerSelectionEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPhotosStat$PickerSelectionEvent) && this.pickerSelectionEventType == ((MobileOfficialAppsConPhotosStat$PickerSelectionEvent) obj).pickerSelectionEventType;
    }

    public final int hashCode() {
        return this.pickerSelectionEventType.hashCode();
    }

    public final String toString() {
        return "PickerSelectionEvent(pickerSelectionEventType=" + this.pickerSelectionEventType + ')';
    }
}
