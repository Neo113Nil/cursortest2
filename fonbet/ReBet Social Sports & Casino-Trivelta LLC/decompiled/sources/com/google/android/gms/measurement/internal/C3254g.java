package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3254g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                j10 = E9.a.I(parcel, E10);
            } else if (w10 == 2) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 != 3) {
                E9.a.M(parcel, E10);
            } else {
                j11 = E9.a.I(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new zzaf(j10, i10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaf[i10];
    }
}
