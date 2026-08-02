package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import xsna.dj5;
import xsna.iq01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class PaymentData extends AbstractSafeParcelable implements dj5 {
    public static final Parcelable.Creator<PaymentData> CREATOR = new iq01();
    public String b;
    public CardInfo c;
    public UserAddress d;
    public PaymentMethodToken e;
    public String f;
    public Bundle g;
    public String h;

    @Override // xsna.dj5
    public final void a(@NonNull Intent intent) {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.d(parcel, 6, this.g, false);
        ozg0.q(parcel, 7, this.h, false);
        ozg0.x(w, parcel);
    }
}
