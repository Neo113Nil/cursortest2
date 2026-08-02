package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzw;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzy;
import com.google.android.gms.location.zzz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes3.dex */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new zzej();
    public final int a;
    public final zzeg b;
    public final zzz c;
    public final zzw d;
    public final PendingIntent e;
    public final zzr f;
    public final String g;

    public zzei(int i, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        zzz zzzVar;
        zzw zzwVar;
        this.a = i;
        this.b = zzegVar;
        zzr zzrVar = null;
        if (iBinder != null) {
            int i2 = zzy.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            zzzVar = queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzx(iBinder, "com.google.android.gms.location.ILocationListener");
        } else {
            zzzVar = null;
        }
        this.c = zzzVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i3 = zzv.a;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            zzwVar = queryLocalInterface2 instanceof zzw ? (zzw) queryLocalInterface2 : new zzu(iBinder2, "com.google.android.gms.location.ILocationCallback");
        } else {
            zzwVar = null;
        }
        this.d = zzwVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzrVar = queryLocalInterface3 instanceof zzr ? (zzr) queryLocalInterface3 : new zzp(iBinder3);
        }
        this.f = zzrVar;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        zzz zzzVar = this.c;
        SafeParcelWriter.f(parcel, 3, zzzVar == null ? null : zzzVar.asBinder());
        SafeParcelWriter.l(parcel, 4, this.e, i, false);
        zzw zzwVar = this.d;
        SafeParcelWriter.f(parcel, 5, zzwVar == null ? null : zzwVar.asBinder());
        zzr zzrVar = this.f;
        SafeParcelWriter.f(parcel, 6, zzrVar != null ? zzrVar.asBinder() : null);
        SafeParcelWriter.m(parcel, 8, this.g, false);
        SafeParcelWriter.t(parcel, s);
    }
}
