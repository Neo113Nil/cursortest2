package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3419g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 2:
                    z12 = E9.a.x(parcel, E10);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) E9.a.p(parcel, E10, CardRequirements.CREATOR);
                    break;
                case 4:
                    z13 = E9.a.x(parcel, E10);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) E9.a.p(parcel, E10, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = E9.a.l(parcel, E10);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) E9.a.p(parcel, E10, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 8:
                    transactionInfo = (TransactionInfo) E9.a.p(parcel, E10, TransactionInfo.CREATOR);
                    break;
                case 9:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 10:
                    str = E9.a.q(parcel, E10);
                    break;
                case 11:
                    bundle = E9.a.f(parcel, E10);
                    break;
                case 12:
                    bArr = E9.a.g(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new PaymentDataRequest(z11, z12, cardRequirements, z13, shippingAddressRequirements, arrayList, paymentMethodTokenizationParameters, transactionInfo, z10, str, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PaymentDataRequest[i10];
    }
}
