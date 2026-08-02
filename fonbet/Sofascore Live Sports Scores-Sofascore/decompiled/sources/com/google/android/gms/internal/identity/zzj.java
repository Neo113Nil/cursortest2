package com.google.android.gms.internal.identity;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzs;
import com.google.android.gms.location.zzt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    public final int a;
    public final zzh b;
    public final zzt c;
    public final zzr d;

    public zzj(int i, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        zzt zzrVar;
        this.a = i;
        this.b = zzhVar;
        zzr zzrVar2 = null;
        if (iBinder == null) {
            zzrVar = null;
        } else {
            int i2 = zzs.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            zzrVar = queryLocalInterface instanceof zzt ? (zzt) queryLocalInterface : new zzr(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
        }
        this.c = zzrVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzrVar2 = queryLocalInterface2 instanceof zzr ? (zzr) queryLocalInterface2 : new zzp(iBinder2);
        }
        this.d = zzrVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        zzt zztVar = this.c;
        SafeParcelWriter.f(parcel, 3, zztVar == null ? null : zztVar.asBinder());
        zzr zzrVar = this.d;
        SafeParcelWriter.f(parcel, 4, zzrVar != null ? zzrVar.asBinder() : null);
        SafeParcelWriter.t(parcel, s);
    }
}
