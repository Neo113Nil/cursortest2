package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.umz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new umz0();
    public final int b;
    public final String c;
    public final long d;
    public final int e;
    public final boolean f;

    public zab(int i, String str, long j, int i2, boolean z) {
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = i2;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
