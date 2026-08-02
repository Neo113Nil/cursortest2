package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbyj extends zzbds implements zzbyl {
    zzbyj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyl
    public final zzbyi zze(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) throws RemoteException {
        zzbyi zzbygVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbygVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbygVar = queryLocalInterface instanceof zzbyi ? (zzbyi) queryLocalInterface : new zzbyg(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbygVar;
    }
}
