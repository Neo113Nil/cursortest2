package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.if01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new if01();
    public String c;
    public String e;
    public long f;
    public int g = -1;
    public int b = -1;
    public double d = -1.0d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 3, this.c, false);
        double d = this.d;
        ozg0.v(parcel, 4, 8);
        parcel.writeDouble(d);
        ozg0.q(parcel, 5, this.e, false);
        long j = this.f;
        ozg0.v(parcel, 6, 8);
        parcel.writeLong(j);
        int i3 = this.g;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(i3);
        ozg0.x(w, parcel);
    }
}
