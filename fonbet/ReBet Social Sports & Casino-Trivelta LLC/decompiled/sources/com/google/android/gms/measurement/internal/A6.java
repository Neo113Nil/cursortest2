package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class A6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 2:
                    bArr = E9.a.g(parcel, E10);
                    break;
                case 3:
                    str = E9.a.q(parcel, E10);
                    break;
                case 4:
                    bundle = E9.a.f(parcel, E10);
                    break;
                case 5:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 6:
                    j11 = E9.a.I(parcel, E10);
                    break;
                case 7:
                    str2 = E9.a.q(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzom(j10, bArr, str, bundle, i10, j11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzom[i10];
    }
}
