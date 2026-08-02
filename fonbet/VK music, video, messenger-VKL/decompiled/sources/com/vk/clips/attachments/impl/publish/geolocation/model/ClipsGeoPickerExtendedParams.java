package com.vk.clips.attachments.impl.publish.geolocation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.attachments.api.publish.geolocation.ClipsGeolocationAttachEntryParams;

/* compiled from: ClipsGeoPickerExtendedParams.kt */
/* loaded from: classes16.dex */
public final class ClipsGeoPickerExtendedParams implements Parcelable {
    public static final Parcelable.Creator<ClipsGeoPickerExtendedParams> CREATOR = new a();
    public final ClipsGeolocationAttachEntryParams b;
    public final boolean c;

    /* compiled from: ClipsGeoPickerExtendedParams.kt */
    public static final class a implements Parcelable.Creator<ClipsGeoPickerExtendedParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsGeoPickerExtendedParams createFromParcel(Parcel parcel) {
            return new ClipsGeoPickerExtendedParams((ClipsGeolocationAttachEntryParams) parcel.readParcelable(ClipsGeoPickerExtendedParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsGeoPickerExtendedParams[] newArray(int i) {
            return new ClipsGeoPickerExtendedParams[i];
        }
    }

    public ClipsGeoPickerExtendedParams(ClipsGeolocationAttachEntryParams clipsGeolocationAttachEntryParams, boolean z) {
        this.b = clipsGeolocationAttachEntryParams;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
