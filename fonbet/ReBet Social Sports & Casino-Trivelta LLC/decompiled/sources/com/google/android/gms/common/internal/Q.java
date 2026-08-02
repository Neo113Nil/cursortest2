package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        Scope[] scopeArr = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 2) {
                i11 = E9.a.G(parcel, E10);
            } else if (w10 == 3) {
                i12 = E9.a.G(parcel, E10);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                scopeArr = (Scope[]) E9.a.t(parcel, E10, Scope.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new zax(i10, i11, i12, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zax[i10];
    }
}
