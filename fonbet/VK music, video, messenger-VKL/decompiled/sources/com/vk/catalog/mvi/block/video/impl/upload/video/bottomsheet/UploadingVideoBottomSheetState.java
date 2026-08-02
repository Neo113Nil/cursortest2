package com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.lm50;

/* compiled from: UploadingVideoBottomSheetView.kt */
/* loaded from: classes16.dex */
public final class UploadingVideoBottomSheetState implements lm50, Parcelable {
    public static final Parcelable.Creator<UploadingVideoBottomSheetState> CREATOR = new a();
    public final boolean b;

    /* compiled from: UploadingVideoBottomSheetView.kt */
    public static final class a implements Parcelable.Creator<UploadingVideoBottomSheetState> {
        @Override // android.os.Parcelable.Creator
        public final UploadingVideoBottomSheetState createFromParcel(Parcel parcel) {
            return new UploadingVideoBottomSheetState(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UploadingVideoBottomSheetState[] newArray(int i) {
            return new UploadingVideoBottomSheetState[i];
        }
    }

    public UploadingVideoBottomSheetState(boolean z) {
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadingVideoBottomSheetState) && this.b == ((UploadingVideoBottomSheetState) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return q0.a(new StringBuilder("UploadingVideoBottomSheetState(isFailed="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
    }
}
