package com.google.android.gms.internal.auth;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzar implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            int w10 = a.w(E10);
            if (w10 == 1) {
                i10 = a.G(parcel, E10);
            } else if (w10 != 2) {
                a.M(parcel, E10);
            } else {
                str = a.q(parcel, E10);
            }
        }
        a.v(parcel, N10);
        return new zzaq(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaq[i10];
    }
}
