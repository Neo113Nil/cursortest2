package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import xsna.hf01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new hf01();
    public String b;
    public String c;
    public zzac d;
    public String e;
    public zzb f;
    public zzb g;
    public String[] h;
    public UserAddress i;
    public UserAddress j;
    public InstrumentInfo[] k;
    public PaymentMethodToken l;

    private FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.p(parcel, 4, this.d, i, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.p(parcel, 6, this.f, i, false);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.r(parcel, 8, this.h, false);
        ozg0.p(parcel, 9, this.i, i, false);
        ozg0.p(parcel, 10, this.j, i, false);
        ozg0.t(parcel, 11, this.k, i);
        ozg0.p(parcel, 12, this.l, i, false);
        ozg0.x(w, parcel);
    }
}
