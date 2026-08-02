package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.q101;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class TokenStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new q101();
    public final String b;
    public final int c;
    public final boolean d;

    public TokenStatus(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
