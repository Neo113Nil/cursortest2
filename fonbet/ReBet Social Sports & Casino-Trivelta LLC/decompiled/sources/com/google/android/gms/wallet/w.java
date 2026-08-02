package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        int i10 = 0;
        LoyaltyWalletObject loyaltyWalletObject = null;
        OfferWalletObject offerWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                loyaltyWalletObject = (LoyaltyWalletObject) E9.a.p(parcel, E10, LoyaltyWalletObject.CREATOR);
            } else if (w10 == 3) {
                offerWalletObject = (OfferWalletObject) E9.a.p(parcel, E10, OfferWalletObject.CREATOR);
            } else if (w10 == 4) {
                giftCardWalletObject = (GiftCardWalletObject) E9.a.p(parcel, E10, GiftCardWalletObject.CREATOR);
            } else if (w10 != 5) {
                E9.a.M(parcel, E10);
            } else {
                i10 = E9.a.G(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CreateWalletObjectsRequest[i10];
    }
}
