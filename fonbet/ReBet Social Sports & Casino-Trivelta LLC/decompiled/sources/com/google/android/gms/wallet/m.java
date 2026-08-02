package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            if (E9.a.w(E10) != 1) {
                E9.a.M(parcel, E10);
            } else {
                arrayList = E9.a.s(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new ShippingAddressRequirements(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ShippingAddressRequirements[i10];
    }
}
