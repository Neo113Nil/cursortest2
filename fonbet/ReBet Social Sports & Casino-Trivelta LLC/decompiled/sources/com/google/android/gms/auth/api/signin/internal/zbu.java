package com.google.android.gms.auth.api.signin.internal;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class zbu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            int w10 = a.w(E10);
            if (w10 == 2) {
                str = a.q(parcel, E10);
            } else if (w10 != 5) {
                a.M(parcel, E10);
            } else {
                googleSignInOptions = (GoogleSignInOptions) a.p(parcel, E10, GoogleSignInOptions.CREATOR);
            }
        }
        a.v(parcel, N10);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
