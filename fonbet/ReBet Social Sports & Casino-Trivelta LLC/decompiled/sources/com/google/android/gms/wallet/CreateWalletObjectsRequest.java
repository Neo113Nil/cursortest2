package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    public LoyaltyWalletObject f34507a;

    /* renamed from: b, reason: collision with root package name */
    public OfferWalletObject f34508b;

    /* renamed from: c, reason: collision with root package name */
    public GiftCardWalletObject f34509c;

    /* renamed from: d, reason: collision with root package name */
    public int f34510d;

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i10) {
        this.f34507a = loyaltyWalletObject;
        this.f34508b = offerWalletObject;
        this.f34509c = giftCardWalletObject;
        this.f34510d = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, this.f34507a, i10, false);
        E9.b.D(parcel, 3, this.f34508b, i10, false);
        E9.b.D(parcel, 4, this.f34509c, i10, false);
        E9.b.u(parcel, 5, this.f34510d);
        E9.b.b(parcel, a10);
    }
}
