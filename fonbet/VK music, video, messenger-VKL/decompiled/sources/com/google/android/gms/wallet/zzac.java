package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.pvz0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
@Deprecated
/* loaded from: classes13.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new pvz0();
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public zzac(String str, String str2, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.e);
        ozg0.x(w, parcel);
    }
}
