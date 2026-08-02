package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$PickerEvent {

    @pmi0("content_type")
    private final MobileOfficialAppsConPhotosStat$ContentType contentType;

    @pmi0("picker_selection_event")
    private final MobileOfficialAppsConPhotosStat$PickerSelectionEvent pickerSelectionEvent;

    @pmi0("picker_upload_event")
    private final MobileOfficialAppsConPhotosStat$PickerUploadEvent pickerUploadEvent;

    public MobileOfficialAppsConPhotosStat$PickerEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$PickerSelectionEvent mobileOfficialAppsConPhotosStat$PickerSelectionEvent, MobileOfficialAppsConPhotosStat$PickerUploadEvent mobileOfficialAppsConPhotosStat$PickerUploadEvent) {
        this.contentType = mobileOfficialAppsConPhotosStat$ContentType;
        this.pickerSelectionEvent = mobileOfficialAppsConPhotosStat$PickerSelectionEvent;
        this.pickerUploadEvent = mobileOfficialAppsConPhotosStat$PickerUploadEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$PickerEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$PickerEvent mobileOfficialAppsConPhotosStat$PickerEvent = (MobileOfficialAppsConPhotosStat$PickerEvent) obj;
        return this.contentType == mobileOfficialAppsConPhotosStat$PickerEvent.contentType && epx.f(this.pickerSelectionEvent, mobileOfficialAppsConPhotosStat$PickerEvent.pickerSelectionEvent) && epx.f(this.pickerUploadEvent, mobileOfficialAppsConPhotosStat$PickerEvent.pickerUploadEvent);
    }

    public final int hashCode() {
        int hashCode = this.contentType.hashCode() * 31;
        MobileOfficialAppsConPhotosStat$PickerSelectionEvent mobileOfficialAppsConPhotosStat$PickerSelectionEvent = this.pickerSelectionEvent;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$PickerSelectionEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PickerSelectionEvent.hashCode())) * 31;
        MobileOfficialAppsConPhotosStat$PickerUploadEvent mobileOfficialAppsConPhotosStat$PickerUploadEvent = this.pickerUploadEvent;
        return hashCode2 + (mobileOfficialAppsConPhotosStat$PickerUploadEvent != null ? mobileOfficialAppsConPhotosStat$PickerUploadEvent.hashCode() : 0);
    }

    public final String toString() {
        return "PickerEvent(contentType=" + this.contentType + ", pickerSelectionEvent=" + this.pickerSelectionEvent + ", pickerUploadEvent=" + this.pickerUploadEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$PickerEvent(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, MobileOfficialAppsConPhotosStat$PickerSelectionEvent mobileOfficialAppsConPhotosStat$PickerSelectionEvent, MobileOfficialAppsConPhotosStat$PickerUploadEvent mobileOfficialAppsConPhotosStat$PickerUploadEvent, int i, zcl zclVar) {
        this(mobileOfficialAppsConPhotosStat$ContentType, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$PickerSelectionEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$PickerUploadEvent);
    }
}
