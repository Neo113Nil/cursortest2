package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.dq70;
import xsna.ozg0;
import xsna.rkz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new rkz0();
    public final int b;

    @Nullable
    public final IBinder c;
    public final ConnectionResult d;
    public final boolean e;
    public final boolean f;

    public zaaa(int i, @Nullable IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.b = i;
        this.c = iBinder;
        this.d = connectionResult;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaaa)) {
            return false;
        }
        zaaa zaaaVar = (zaaa) obj;
        return this.d.equals(zaaaVar.d) && dq70.b(i(), zaaaVar.i());
    }

    @Nullable
    public final b i() {
        IBinder iBinder = this.c;
        if (iBinder == null) {
            return null;
        }
        return b.a.f(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.h(parcel, 2, this.c);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
