package com.google.android.gms.internal.location;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        String str = null;
        int i10 = 0;
        short s10 = 0;
        int i11 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f10 = 0.0f;
        long j10 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            switch (a.w(E10)) {
                case 1:
                    str = a.q(parcel, E10);
                    break;
                case 2:
                    j10 = a.I(parcel, E10);
                    break;
                case 3:
                    s10 = a.K(parcel, E10);
                    break;
                case 4:
                    d10 = a.A(parcel, E10);
                    break;
                case 5:
                    d11 = a.A(parcel, E10);
                    break;
                case 6:
                    f10 = a.C(parcel, E10);
                    break;
                case 7:
                    i10 = a.G(parcel, E10);
                    break;
                case 8:
                    i11 = a.G(parcel, E10);
                    break;
                case 9:
                    i12 = a.G(parcel, E10);
                    break;
                default:
                    a.M(parcel, E10);
                    break;
            }
        }
        a.v(parcel, N10);
        return new zzdh(str, i10, s10, d10, d11, f10, j10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdh[i10];
    }
}
