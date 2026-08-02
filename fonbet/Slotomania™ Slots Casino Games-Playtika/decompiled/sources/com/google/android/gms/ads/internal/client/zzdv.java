package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzdv extends zzbds implements zzdx {
    zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList createTypedArrayList = zzcZ.createTypedArrayList(zzv.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final zzv zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        zzv zzvVar = (zzv) zzbdu.zzb(zzcZ, zzv.CREATOR);
        zzcZ.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) zzbdu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }
}
