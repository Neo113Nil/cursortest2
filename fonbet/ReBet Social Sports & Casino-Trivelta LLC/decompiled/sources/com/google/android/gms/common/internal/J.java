package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 2:
                    i12 = E9.a.G(parcel, E10);
                    break;
                case 3:
                    i13 = E9.a.G(parcel, E10);
                    break;
                case 4:
                    j10 = E9.a.I(parcel, E10);
                    break;
                case 5:
                    j11 = E9.a.I(parcel, E10);
                    break;
                case 6:
                    str = E9.a.q(parcel, E10);
                    break;
                case 7:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    i14 = E9.a.G(parcel, E10);
                    break;
                case 9:
                    i10 = E9.a.G(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new MethodInvocation(i11, i12, i13, j10, j11, str, str2, i14, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
