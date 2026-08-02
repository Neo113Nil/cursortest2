package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import xsna.ozg0;
import xsna.tr01;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new tr01();
    public boolean b;
    public boolean c;
    public CardRequirements d;
    public boolean e;
    public ShippingAddressRequirements f;
    public ArrayList<Integer> g;
    public PaymentMethodTokenizationParameters h;
    public TransactionInfo i;
    public boolean j;
    public String k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        boolean z = this.b;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ozg0.p(parcel, 3, this.d, i, false);
        boolean z3 = this.e;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        ozg0.p(parcel, 5, this.f, i, false);
        ozg0.j(parcel, this.g, 6);
        ozg0.p(parcel, 7, this.h, i, false);
        ozg0.p(parcel, 8, this.i, i, false);
        boolean z4 = this.j;
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(z4 ? 1 : 0);
        ozg0.q(parcel, 10, this.k, false);
        ozg0.x(w, parcel);
    }
}
