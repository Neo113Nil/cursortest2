package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        boolean z10 = false;
        boolean z11 = true;
        ArrayList arrayList = null;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                arrayList = E9.a.l(parcel, E10);
            } else if (w10 == 2) {
                z11 = E9.a.x(parcel, E10);
            } else if (w10 == 3) {
                z10 = E9.a.x(parcel, E10);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                i10 = E9.a.G(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new CardRequirements(arrayList, z11, z10, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CardRequirements[i10];
    }
}
