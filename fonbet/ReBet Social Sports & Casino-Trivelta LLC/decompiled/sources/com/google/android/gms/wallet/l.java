package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        int i10 = 0;
        String str = null;
        String str2 = null;
        int i11 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                str2 = E9.a.q(parcel, E10);
            } else if (w10 == 4) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                i11 = E9.a.G(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new zzaj(str, str2, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaj[i10];
    }
}
