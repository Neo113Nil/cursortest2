package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    str = E9.a.q(parcel, E10);
                    break;
                case 2:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 3:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 4:
                    iBinder = E9.a.F(parcel, E10);
                    break;
                case 5:
                    z12 = E9.a.x(parcel, E10);
                    break;
                case 6:
                    z13 = E9.a.x(parcel, E10);
                    break;
                case 7:
                default:
                    E9.a.M(parcel, E10);
                    break;
                case 8:
                    z14 = E9.a.x(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzp(str, z10, z11, iBinder, z12, z13, z14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
