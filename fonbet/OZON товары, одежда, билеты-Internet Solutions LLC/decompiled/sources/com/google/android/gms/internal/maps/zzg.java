package com.google.android.gms.internal.maps;

import D3.g;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes9.dex */
public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final IObjectWrapper zza(int i11) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i11);
        return g.b(zza(1, zza));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return g.b(zza(3, zza));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final IObjectWrapper zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return g.b(zza(7, zza));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final IObjectWrapper zzi() throws RemoteException {
        return g.b(zza(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final IObjectWrapper zza(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return g.b(zza(2, zza));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final IObjectWrapper zza(float f7) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f7);
        return g.b(zza(5, zza));
    }

    @Override // com.google.android.gms.internal.maps.zze
    public final IObjectWrapper zza(Bitmap bitmap) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, bitmap);
        return g.b(zza(6, zza));
    }
}
