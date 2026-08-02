package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.xnz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new xnz0();
    public final int b;
    public final String c;
    public final int d;

    public zac(int i, String str, int i2) {
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.x(w, parcel);
    }

    public zac(String str, int i) {
        this.b = 1;
        this.c = str;
        this.d = i;
    }
}
