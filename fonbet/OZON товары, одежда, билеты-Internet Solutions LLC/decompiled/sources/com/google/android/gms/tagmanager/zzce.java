package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzas;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzce extends zzas implements zzcg {
    zzce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    @Override // com.google.android.gms.tagmanager.zzcg
    public final String zzb(String str, Map map) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeMap(map);
        Parcel zzk = zzk(2, zza);
        String readString = zzk.readString();
        zzk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.tagmanager.zzcg
    public final void zzc(String str, Map map) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeMap(map);
        zzl(1, zza);
    }
}
