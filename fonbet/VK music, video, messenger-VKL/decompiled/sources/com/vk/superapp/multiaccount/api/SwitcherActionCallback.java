package com.vk.superapp.multiaccount.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: SwitcherActionCallback.kt */
/* loaded from: classes6.dex */
public class SwitcherActionCallback implements Parcelable {
    public static final Parcelable.Creator<SwitcherActionCallback> CREATOR = new a();

    /* compiled from: SwitcherActionCallback.kt */
    public static final class a implements Parcelable.Creator<SwitcherActionCallback> {
        @Override // android.os.Parcelable.Creator
        public final SwitcherActionCallback createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new SwitcherActionCallback();
        }

        @Override // android.os.Parcelable.Creator
        public final SwitcherActionCallback[] newArray(int i) {
            return new SwitcherActionCallback[i];
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

    public void a(f fVar) {
    }
}
