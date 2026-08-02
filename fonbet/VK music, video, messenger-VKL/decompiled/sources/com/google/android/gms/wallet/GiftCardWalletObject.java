package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import xsna.oi01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new oi01();
    public CommonWalletObject b = new CommonWalletObject();
    public String c;
    public String d;

    @Deprecated
    public String e;
    public long f;
    public String g;
    public long h;
    public String i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        long j = this.f;
        ozg0.v(parcel, 6, 8);
        parcel.writeLong(j);
        ozg0.q(parcel, 7, this.g, false);
        long j2 = this.h;
        ozg0.v(parcel, 8, 8);
        parcel.writeLong(j2);
        ozg0.q(parcel, 9, this.i, false);
        ozg0.x(w, parcel);
    }
}
