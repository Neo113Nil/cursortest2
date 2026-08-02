package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 != 3) {
                E9.a.M(parcel, E10);
            } else {
                bundle = E9.a.f(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new zzau(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzau[i10];
    }
}
