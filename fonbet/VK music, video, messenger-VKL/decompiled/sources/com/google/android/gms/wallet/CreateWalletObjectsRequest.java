package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.bc01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new bc01();
    public LoyaltyWalletObject b;
    public OfferWalletObject c;
    public GiftCardWalletObject d;
    public int e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.p(parcel, 4, this.d, i, false);
        int i2 = this.e;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }
}
