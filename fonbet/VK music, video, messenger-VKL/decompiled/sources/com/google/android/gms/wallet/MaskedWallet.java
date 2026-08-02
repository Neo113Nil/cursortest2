package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import xsna.ozg0;
import xsna.rn01;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new rn01();
    public String b;
    public String c;
    public String[] d;
    public String e;
    public zzb f;
    public zzb g;
    public LoyaltyWalletObject[] h;
    public OfferWalletObject[] i;
    public UserAddress j;
    public UserAddress k;
    public InstrumentInfo[] l;

    private MaskedWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.r(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.p(parcel, 6, this.f, i, false);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.t(parcel, 8, this.h, i);
        ozg0.t(parcel, 9, this.i, i);
        ozg0.p(parcel, 10, this.j, i, false);
        ozg0.p(parcel, 11, this.k, i, false);
        ozg0.t(parcel, 12, this.l, i);
        ozg0.x(w, parcel);
    }
}
