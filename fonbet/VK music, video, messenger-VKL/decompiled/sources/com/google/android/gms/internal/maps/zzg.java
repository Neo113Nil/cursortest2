package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import xsna.vnv;
import xsna.y57;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes12.dex */
public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final vnv zzd() throws RemoteException {
        return y57.c(zzH(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final vnv zze(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        return y57.c(zzH(5, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final vnv zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return y57.c(zzH(2, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final vnv zzg(Bitmap bitmap) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, bitmap);
        return y57.c(zzH(6, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final vnv zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return y57.c(zzH(3, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final vnv zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return y57.c(zzH(7, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final vnv zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        return y57.c(zzH(1, zza));
    }
}
