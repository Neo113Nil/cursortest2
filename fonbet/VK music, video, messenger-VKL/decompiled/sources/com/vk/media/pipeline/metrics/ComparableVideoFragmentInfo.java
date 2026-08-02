package com.vk.media.pipeline.metrics;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: MetricsCalculationConfig.kt */
/* loaded from: classes3.dex */
public final class ComparableVideoFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<ComparableVideoFragmentInfo> CREATOR = new a();
    public final Uri b;
    public final CropRange c;
    public final CropRange d;

    /* compiled from: MetricsCalculationConfig.kt */
    public static final class a implements Parcelable.Creator<ComparableVideoFragmentInfo> {
        @Override // android.os.Parcelable.Creator
        public final ComparableVideoFragmentInfo createFromParcel(Parcel parcel) {
            return new ComparableVideoFragmentInfo((Uri) parcel.readParcelable(ComparableVideoFragmentInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : CropRange.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CropRange.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ComparableVideoFragmentInfo[] newArray(int i) {
            return new ComparableVideoFragmentInfo[i];
        }
    }

    public ComparableVideoFragmentInfo(Uri uri, CropRange cropRange, CropRange cropRange2) {
        this.b = uri;
        this.c = cropRange;
        this.d = cropRange2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableVideoFragmentInfo)) {
            return false;
        }
        ComparableVideoFragmentInfo comparableVideoFragmentInfo = (ComparableVideoFragmentInfo) obj;
        return epx.f(this.b, comparableVideoFragmentInfo.b) && epx.f(this.c, comparableVideoFragmentInfo.c) && epx.f(this.d, comparableVideoFragmentInfo.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CropRange cropRange = this.c;
        int hashCode2 = (hashCode + (cropRange == null ? 0 : cropRange.hashCode())) * 31;
        CropRange cropRange2 = this.d;
        return hashCode2 + (cropRange2 != null ? cropRange2.hashCode() : 0);
    }

    public final String toString() {
        return "ComparableVideoFragmentInfo(sourceFileUri=" + this.b + ", sourceFileCropRange=" + this.c + ", transcodedFileCropRange=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        CropRange cropRange = this.c;
        if (cropRange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cropRange.writeToParcel(parcel, i);
        }
        CropRange cropRange2 = this.d;
        if (cropRange2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cropRange2.writeToParcel(parcel, i);
        }
    }
}
