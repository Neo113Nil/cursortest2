package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes2.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 2) {
                str2 = E9.a.q(parcel, E10);
            } else if (w10 == 3) {
                str3 = E9.a.q(parcel, E10);
            } else if (w10 == 4) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                userAddress = (UserAddress) E9.a.p(parcel, E10, UserAddress.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new CardInfo(str, str2, str3, i10, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CardInfo[i10];
    }
}
