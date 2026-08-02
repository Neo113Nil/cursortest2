package com.google.android.gms.internal.identity;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LastLocationRequest;
import defpackage.gzn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzu extends zza implements zzv {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void E1(LastLocationRequest lastLocationRequest, zzee zzeeVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = zzc.a;
        obtain.writeInt(1);
        lastLocationRequest.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        zzeeVar.writeToParcel(obtain, 0);
        J(obtain, 90);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void V0(LastLocationRequest lastLocationRequest, gzn gznVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = zzc.a;
        obtain.writeInt(1);
        lastLocationRequest.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(gznVar);
        J(obtain, 82);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final Location zzs() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        obtain = Parcel.obtain();
        try {
            this.a.transact(7, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Location) zzc.a(obtain, Location.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }
}
