package com.google.android.gms.internal.wallet;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            if (a.w(E10) != 2) {
                a.M(parcel, E10);
            } else {
                bArr = a.g(parcel, E10);
            }
        }
        a.v(parcel, N10);
        return new zzg(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
