package com.vk.auth.verification.base.states;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.qjg;
import xsna.zcl;

/* compiled from: BaseCodeState.kt */
/* loaded from: classes15.dex */
public abstract class BaseCodeState implements Parcelable {
    public BaseCodeState(zcl zclVar) {
    }

    public int d() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return qjg.a(this).equals(obj != null ? qjg.a(obj) : null);
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this, i);
    }
}
