package com.google.android.gms.auth.api.signin.internal;

import E9.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        Bundle bundle = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            int w10 = a.w(E10);
            if (w10 == 1) {
                i10 = a.G(parcel, E10);
            } else if (w10 == 2) {
                i11 = a.G(parcel, E10);
            } else if (w10 != 3) {
                a.M(parcel, E10);
            } else {
                bundle = a.f(parcel, E10);
            }
        }
        a.v(parcel, N10);
        return new GoogleSignInOptionsExtensionParcelable(i10, i11, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptionsExtensionParcelable[i10];
    }
}
