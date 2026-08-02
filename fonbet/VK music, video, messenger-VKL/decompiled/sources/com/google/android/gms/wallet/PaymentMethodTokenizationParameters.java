package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.guz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new guz0();
    public int b;
    public Bundle c = new Bundle();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        ozg0.d(parcel, 3, this.c, false);
        ozg0.x(w, parcel);
    }
}
