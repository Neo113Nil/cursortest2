package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzceb extends zzbds implements zzced {
    zzceb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzced
    public final zzcea zze(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) throws RemoteException {
        zzcea zzcdyVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcdyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcdyVar = queryLocalInterface instanceof zzcea ? (zzcea) queryLocalInterface : new zzcdy(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcdyVar;
    }
}
