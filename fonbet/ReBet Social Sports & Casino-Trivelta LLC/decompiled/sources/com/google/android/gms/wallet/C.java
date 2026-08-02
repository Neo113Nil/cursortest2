package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    arrayList = E9.a.l(parcel, E10);
                    break;
                case 3:
                default:
                    E9.a.M(parcel, E10);
                    break;
                case 4:
                    str = E9.a.q(parcel, E10);
                    break;
                case 5:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 6:
                    arrayList2 = E9.a.l(parcel, E10);
                    break;
                case 7:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 8:
                    str3 = E9.a.q(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z10, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new IsReadyToPayRequest[i10];
    }
}
