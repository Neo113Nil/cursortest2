package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.DeviceAuthDialog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
        requestState.a = parcel.readString();
        requestState.b = parcel.readString();
        requestState.c = parcel.readString();
        requestState.d = parcel.readLong();
        requestState.e = parcel.readLong();
        return requestState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DeviceAuthDialog.RequestState[i];
    }
}
