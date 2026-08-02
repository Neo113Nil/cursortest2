package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new zaz();
    public final int a;
    public final IBinder b;
    public final ConnectionResult c;
    public final boolean d;
    public final boolean e;

    public zay(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object zztVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zay)) {
            return false;
        }
        zay zayVar = (zay) obj;
        if (!this.c.equals(zayVar.c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            zztVar = null;
        } else {
            int i = IAccountAccessor.Stub.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zztVar = queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = zayVar.b;
        if (iBinder2 != null) {
            int i2 = IAccountAccessor.Stub.a;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface2 : new zzt(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return Objects.a(zztVar, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.f(parcel, 2, this.b);
        SafeParcelWriter.l(parcel, 3, this.c, i, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
