package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        long j10 = -1;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                z10 = E9.a.x(parcel, E10);
            } else if (w10 == 2) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 4) {
                i11 = E9.a.G(parcel, E10);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                j10 = E9.a.I(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new zzr(z10, str, i10, i11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
