package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbqi extends zzbds implements zzbqk {
    zzbqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final zzbqh zze(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i, zzbqe zzbqeVar) throws RemoteException {
        zzbqh zzbqfVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbdu.zze(zza, zzbqeVar);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbqfVar = queryLocalInterface instanceof zzbqh ? (zzbqh) queryLocalInterface : new zzbqf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbqfVar;
    }
}
