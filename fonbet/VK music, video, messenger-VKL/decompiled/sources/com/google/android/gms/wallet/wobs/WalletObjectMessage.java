package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.ql01;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new ql01();
    public String b;
    public String c;
    public TimeInterval d;

    @Deprecated
    public UriData e;

    @Deprecated
    public UriData f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.p(parcel, 4, this.d, i, false);
        ozg0.p(parcel, 5, this.e, i, false);
        ozg0.p(parcel, 6, this.f, i, false);
        ozg0.x(w, parcel);
    }
}
