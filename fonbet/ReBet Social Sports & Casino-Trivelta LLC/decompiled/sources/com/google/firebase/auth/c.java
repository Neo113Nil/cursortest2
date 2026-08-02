package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthProvider;

/* loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            E9.a.w(E10);
            E9.a.M(parcel, E10);
        }
        E9.a.v(parcel, N10);
        return new PhoneAuthProvider.ForceResendingToken();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PhoneAuthProvider.ForceResendingToken[i10];
    }
}
