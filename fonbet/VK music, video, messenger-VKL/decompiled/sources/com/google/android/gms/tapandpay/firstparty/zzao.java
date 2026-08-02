package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.gyz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new gyz0();
    public final String b;
    public final byte[] c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public zzao(String str, byte[] bArr, int i, int i2, String str2, String str3) {
        this.b = str;
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = str2;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.e(parcel, 3, this.c, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.e);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.x(w, parcel);
    }
}
