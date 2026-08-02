package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.atz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public class PushTokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushTokenizeRequest> CREATOR = new atz0();
    public final int b;
    public final int c;
    public final byte[] d;
    public final String e;
    public final String f;
    public final UserAddress g;
    public final boolean h;

    public PushTokenizeRequest(int i, int i2, byte[] bArr, String str, String str2, UserAddress userAddress, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = bArr;
        this.e = str;
        this.f = str2;
        this.g = userAddress;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.e(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
