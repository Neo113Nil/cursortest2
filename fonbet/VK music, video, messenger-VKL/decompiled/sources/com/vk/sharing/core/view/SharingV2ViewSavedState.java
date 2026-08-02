package com.vk.sharing.core.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: SharingV2ViewSavedState.kt */
/* loaded from: classes5.dex */
public final class SharingV2ViewSavedState extends View.BaseSavedState {
    public static final a CREATOR = new a();
    public boolean b;

    /* compiled from: SharingV2ViewSavedState.kt */
    public static final class a implements Parcelable.Creator<SharingV2ViewSavedState> {
        @Override // android.os.Parcelable.Creator
        public final SharingV2ViewSavedState createFromParcel(Parcel parcel) {
            return new SharingV2ViewSavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SharingV2ViewSavedState[] newArray(int i) {
            return new SharingV2ViewSavedState[i];
        }
    }

    public SharingV2ViewSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public SharingV2ViewSavedState(Parcel parcel) {
        super(parcel);
        this.b = parcel.readByte() != 0;
    }
}
