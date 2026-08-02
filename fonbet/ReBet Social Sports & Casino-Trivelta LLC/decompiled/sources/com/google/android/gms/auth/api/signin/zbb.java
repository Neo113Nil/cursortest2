package com.google.android.gms.auth.api.signin;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            int w10 = a.w(E10);
            if (w10 == 4) {
                str = a.q(parcel, E10);
            } else if (w10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) a.p(parcel, E10, GoogleSignInAccount.CREATOR);
            } else if (w10 != 8) {
                a.M(parcel, E10);
            } else {
                str2 = a.q(parcel, E10);
            }
        }
        a.v(parcel, N10);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
