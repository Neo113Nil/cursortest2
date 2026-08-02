package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: com.google.android.gms.wallet.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3417e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    str = E9.a.q(parcel, E10);
                    break;
                case 2:
                    cardInfo = (CardInfo) E9.a.p(parcel, E10, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) E9.a.p(parcel, E10, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) E9.a.p(parcel, E10, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 6:
                    bundle = E9.a.f(parcel, E10);
                    break;
                case 7:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    bundle2 = E9.a.f(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new PaymentData(str, cardInfo, userAddress, paymentMethodToken, str2, bundle, str3, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PaymentData[i10];
    }
}
