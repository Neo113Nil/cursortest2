package com.vk.file_picker.external;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.km50;

/* compiled from: ExternalFilePickerContract.kt */
/* loaded from: classes18.dex */
public final class HackedState implements Parcelable, km50 {
    public static final HackedState b = new HackedState();
    public static final Parcelable.Creator<HackedState> CREATOR = new a();

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class a implements Parcelable.Creator<HackedState> {
        @Override // android.os.Parcelable.Creator
        public final HackedState createFromParcel(Parcel parcel) {
            parcel.readInt();
            return HackedState.b;
        }

        @Override // android.os.Parcelable.Creator
        public final HackedState[] newArray(int i) {
            return new HackedState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
